package mx.com.inscitech.fiducia.common.beans;

/**
 * Bean que contiene la informacion basica del usuario en sesion.
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class UsersInformation {

    /**
     * El usuario con el que se firmo a la aplicacion
     */
    private String userName;

    /**
     * La variable de acceso al sistema
     */
    private Integer login;


    /**
     * Identificador del usuario en base de datos
     */
    private Integer userId;

    /**
     * Nombre del usuario
     */
    private String nombre;

    /**
     * Puesto o Rol del usuario
     */
    private String puesto;

    /**
     * Identificador del puesto o rol en base de datos
     */
    private Integer puestoId;

    /**
     * Fecha contable del sistema
     */
    private String fechaContable;

    /**
     * Variable que indica si el mes esta abierto o no
     */
    private Integer mesAbierto;
    
    private String ip;

    public UsersInformation() {
    }

    public UsersInformation(String userName, Integer login, Integer userId, String nombre, String puesto,
                            Integer puestoId, String fechaContable, Integer mesAbierto, String ip) {
        this.userName = userName;
        this.login = login;
        this.userId = userId;
        this.nombre = nombre;
        this.puesto = puesto;
        this.puestoId = puestoId;
        this.fechaContable = fechaContable;
        this.mesAbierto = mesAbierto;
        this.ip = ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserName() {
        return userName;
    }

    public void setLogin(Integer login) {
        this.login = login;
    }

    public Integer getLogin() {
        return login;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public Integer getUserId() {
        return userId;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }


    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }


    public String getPuesto() {
        return puesto;
    }


    public void setPuestoId(Integer puestoId) {
        this.puestoId = puestoId;
    }


    public Integer getPuestoId() {
        return puestoId;
    }


    public void setFechaContable(String fechaContable) {
        this.fechaContable = fechaContable;
    }


    public String getFechaContable() {
        return fechaContable;
    }


    public void setMesAbierto(Integer mesAbierto) {
        this.mesAbierto = mesAbierto;
    }


    public Integer getMesAbierto() {
        return mesAbierto;
    }

    public String getMesAbiertoStr() {
        return mesAbierto.intValue() == 0 ? "SI" : "NO";
    }

    public String getStrFechaContable() {
        Integer mesActual = new Integer(this.getFechaContable().split("/")[1]);
        String strFecha = new String(this.getFechaContable().split("/")[0] + " de ");
        switch (mesActual.intValue()) {
        case 1:
            strFecha += "Enero de " + this.getFechaContable().split("/")[2];
            break;
        case 2:
            strFecha += "Febrero de " + this.getFechaContable().split("/")[2];
            break;
        case 3:
            strFecha += "Marzo de " + this.getFechaContable().split("/")[2];
            break;
        case 4:
            strFecha += "Abril de " + this.getFechaContable().split("/")[2];
            break;
        case 5:
            strFecha += "Mayo de " + this.getFechaContable().split("/")[2];
            break;
        case 6:
            strFecha += "Junio de " + this.getFechaContable().split("/")[2];
            break;
        case 7:
            strFecha += "Julio de " + this.getFechaContable().split("/")[2];
            break;
        case 8:
            strFecha += "Agosto de " + this.getFechaContable().split("/")[2];
            break;
        case 9:
            strFecha += "Septiembre de " + this.getFechaContable().split("/")[2];
            break;
        case 10:
            strFecha += "Octubre de " + this.getFechaContable().split("/")[2];
            break;
        case 11:
            strFecha += "Noviembre de " + this.getFechaContable().split("/")[2];
            break;
        case 12:
            strFecha += "Diciembre de " + this.getFechaContable().split("/")[2];
            break;
        }
        return strFecha;
    }
}
