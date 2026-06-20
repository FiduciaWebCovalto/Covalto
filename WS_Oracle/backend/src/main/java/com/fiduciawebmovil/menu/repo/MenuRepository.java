package com.fiduciawebmovil.menu.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fiduciawebmovil.menu.dtos.FuncionMenuDTO;
import com.fiduciawebmovil.menu.entity.FFuncion;

@Repository
public interface MenuRepository extends JpaRepository<FFuncion, Long> {
        @Query(value = """
                WITH ArbolMenus (FFUN_ID_FUNCION,FFUN_NOM_MENU,FFUN_ID_PADRE,FFUN_NOMBRE_FUNCION,FFUN_ORDEN,ESTADO,ICONO,NIVEL) AS (
                SELECT m.FFUN_ID_FUNCION,m.FFUN_NOM_MENU,m.FFUN_ID_PADRE,m.FFUN_NOMBRE_FUNCION,m.FFUN_ORDEN,m.ESTADO,m.ICONO, 1 AS nivel FROM F_FUNCION m
                INNER JOIN F_PER_FUN pm ON m.FFUN_ID_FUNCION = pm.FFUN_ID_FUNCION 
                WHERE pm.fper_id_perfil = :idPerfil AND m.FFUN_ID_PADRE IS NULL 
                UNION ALL 
                SELECT m.FFUN_ID_FUNCION,m.FFUN_NOM_MENU,m.FFUN_ID_PADRE,m.FFUN_NOMBRE_FUNCION,m.FFUN_ORDEN,m.ESTADO,m.ICONO, a.nivel + 1  FROM F_FUNCION m
                INNER JOIN F_PER_FUN pm ON m.FFUN_ID_FUNCION = pm.FFUN_ID_FUNCION
                INNER JOIN ArbolMenus a ON m.FFUN_ID_PADRE = a.FFUN_ID_FUNCION
                WHERE pm.fper_id_perfil = :idPerfil
                )
                SELECT DISTINCT * FROM ArbolMenus ORDER BY nivel, FFUN_ORDEN
        """, 
                   nativeQuery = true)
    List<FFuncion> findMenuPadreByPerfil(@Param("idPerfil") Long idPerfil);
}
