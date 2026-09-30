#!/usr/bin/env bash
set -u

DEFAULT_USER="system"
DEFAULT_INSTANCE="localhost:1521/XEPDB1"
DEFAULT_DIRECTORY="export"
DEFAULT_DUMPFILE="COVALTO_INICIAL.DMP"
DEFAULT_REMAP_SCHEMA="covalto:inmuebles"
DEFAULT_LOGFILE="fiduciaweb_import.log"
DEFAULT_IGNORE="Y"
DEFAULT_TRANSFORM="oid:n"
DEFAULT_REMAP_TABLESPACE="FW_DATOS:inmuebles_DATOS"

line(){ printf '%*s\n' 78 '' | tr ' ' '='; }
read_default(){ local p="$1" d="$2" v; read -r -p "$p ($d): " v; printf '%s' "${v:-$d}"; }
read_password(){ local v=""; while [[ -z "$v" ]]; do read -r -s -p "Contraseña Oracle: " v; echo; [[ -z "$v" ]] && echo "La contraseña es obligatoria." >&2; done; printf '%s' "$v"; }
yes_no(){ local p="$1" d="${2:-S}" a; while true; do
  [[ "${d^^}" == S ]] && read -r -p "$p [S/n]: " a || read -r -p "$p [s/N]: " a
  a="${a:-$d}"
  case "${a^^}" in S|SI|SÍ|Y|YES) return 0;; N|NO) return 1;; *) echo "Capture S o N.";; esac
done; }
check_impdp(){ command -v impdp >/dev/null 2>&1 || { echo "ERROR: impdp no está disponible en PATH."; exit 10; }; }

run_impdp(){
  local user="$1" pass="$2" inst="$3"; shift 3; local args=("$@")
  echo; line; echo "COMANDO A EJECUTAR"; line
  printf 'impdp %s/********@%s' "$user" "$inst"; printf ' %q' "${args[@]}"; echo; line
  yes_no "¿Desea ejecutar el import?" S || { echo "Import cancelado."; return 0; }
  impdp "${user}/${pass}@${inst}" "${args[@]}"; local rc=$?; pass=""
  echo; line
  [[ $rc -eq 0 ]] && echo "IMPORT FINALIZADO OK." || echo "IMPORT FINALIZADO CON ERROR. Código: $rc"
  line; return "$rc"
}

default_import(){
  local user pass inst
  user="$(read_default "Usuario Oracle" "$DEFAULT_USER")"
  pass="$(read_password)"
  inst="$(read_default "Instancia / servicio" "$DEFAULT_INSTANCE")"
  run_impdp "$user" "$pass" "$inst" \
    "directory=$DEFAULT_DIRECTORY" "dumpfile=$DEFAULT_DUMPFILE" \
    "remap_schema=$DEFAULT_REMAP_SCHEMA" "logfile=$DEFAULT_LOGFILE" \
    "ignore=$DEFAULT_IGNORE" "TRANSFORM=$DEFAULT_TRANSFORM" \
    "REMAP_TABLESPACE=$DEFAULT_REMAP_TABLESPACE"
}

build_import(){
  echo; line; echo "CONSTRUIR CADENA DE PARÁMETROS IMPDP"; line
  echo "ENTER conserva el valor mostrado."
  local user pass inst directory dumpfile logfile schemas tables content remap_schema remap_ts ignore transform parallel tea include exclude
  user="$(read_default "Usuario Oracle" "$DEFAULT_USER")"; pass="$(read_password)"
  inst="$(read_default "Instancia / servicio" "$DEFAULT_INSTANCE")"
  directory="$(read_default "Oracle DIRECTORY" "$DEFAULT_DIRECTORY")"
  dumpfile="$(read_default "DUMPFILE" "$DEFAULT_DUMPFILE")"
  logfile="$(read_default "LOGFILE" "$DEFAULT_LOGFILE")"
  schemas="$(read_default "SCHEMAS (vacío = no especificar)" "")"
  tables="$(read_default "TABLES (vacío = no especificar)" "")"
  content="$(read_default "CONTENT [ALL|DATA_ONLY|METADATA_ONLY]" "ALL")"
  remap_schema="$(read_default "REMAP_SCHEMA origen:destino (vacío = ninguno)" "$DEFAULT_REMAP_SCHEMA")"
  remap_ts="$(read_default "REMAP_TABLESPACE origen:destino (vacío = ninguno)" "$DEFAULT_REMAP_TABLESPACE")"
  ignore="$(read_default "IGNORE [Y|N]" "$DEFAULT_IGNORE")"
  transform="$(read_default "TRANSFORM (vacío = ninguno)" "$DEFAULT_TRANSFORM")"
  parallel="$(read_default "PARALLEL" "1")"
  tea="$(read_default "TABLE_EXISTS_ACTION [SKIP|APPEND|TRUNCATE|REPLACE] (vacío = omitir)" "")"
  include="$(read_default "INCLUDE (vacío = ninguno)" "")"
  exclude="$(read_default "EXCLUDE (vacío = ninguno)" "")"

  local args=("directory=$directory" "dumpfile=$dumpfile" "logfile=$logfile")
  [[ -n "$schemas" ]] && args+=("schemas=$schemas")
  [[ -n "$tables" ]] && args+=("tables=$tables")
  [[ -n "$content" ]] && args+=("content=$content")
  [[ -n "$remap_schema" ]] && args+=("remap_schema=$remap_schema")
  [[ -n "$remap_ts" ]] && args+=("remap_tablespace=$remap_ts")
  [[ -n "$ignore" ]] && args+=("ignore=$ignore")
  [[ -n "$transform" ]] && args+=("TRANSFORM=$transform")
  [[ -n "$parallel" ]] && args+=("parallel=$parallel")
  [[ -n "$tea" ]] && args+=("table_exists_action=$tea")
  [[ -n "$include" ]] && args+=("include=$include")
  [[ -n "$exclude" ]] && args+=("exclude=$exclude")
  run_impdp "$user" "$pass" "$inst" "${args[@]}"
}

main(){
  clear 2>/dev/null || true
  line; echo "           ORACLE DATA PUMP IMPORT WIZARD - RHEL 9.7"; line; echo
  echo "¿Ejecutar import con valores por defecto?"; echo
  printf '\timpdp {system}/{password}@{%s} directory=%s dumpfile=%s remap_schema=%s logfile=%s ignore=%s TRANSFORM=%s REMAP_TABLESPACE=%s\n' \
    "$DEFAULT_INSTANCE" "$DEFAULT_DIRECTORY" "$DEFAULT_DUMPFILE" "$DEFAULT_REMAP_SCHEMA" "$DEFAULT_LOGFILE" "$DEFAULT_IGNORE" "$DEFAULT_TRANSFORM" "$DEFAULT_REMAP_TABLESPACE"
  echo
  if yes_no "Seleccione" S; then check_impdp; default_import; exit $?; fi
  echo; echo "  1) Construir cadena de parámetros?"; echo "  2) Usar comando propio"; echo
  while true; do
    read -r -p "Opción [1-2]: " op
    case "$op" in
      1) check_impdp; build_import; exit $?;;
      2) echo; echo "Crear y ejecutar su impdp propio"; exit 0;;
      *) echo "Opción inválida. Seleccione 1 o 2.";;
    esac
  done
}
main "$@"
