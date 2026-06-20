package com.bancomext.util;

public class querySeguridad {


//FUNCIONES ASIGNADOS AL PERFIL DEL USUARIO				



                                
//Recupera el perfil de cliente del usuario
                                
                                
public String queryFunciones    = " select f.ffun_nom_menu as funcion,"
                                + "       f.ffun_nombre_funcion as jsp"
                                + " from f_usuario_perfiles up,"
                                + "      f_perfil p,"
                                + "      f_per_fun pf, "
                                + "      f_funcion f"
                                + " where "
                                + " up.fusu_num_usuario = ? and "
                                + " p.fper_id_perfil = up.fper_id_perfil and  "
                                + " p.fper_interno = 0 and "
                                + " pf.FPER_ID_PERFIL = p.FPER_ID_PERFIL and"
                                + " f.ffun_id_funcion = pf.ffun_id_funcion and "
                                + " f.FFUN_ID_PADRE = ? and" 
                                + " f.ffun_interno = ? "
                                + " order by f.FFUN_ORDEN asc";
                                
                           


	}

