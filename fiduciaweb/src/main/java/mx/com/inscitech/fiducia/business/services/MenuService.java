package mx.com.inscitech.fiducia.business.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import mx.com.inscitech.fiducia.common.beans.MenuBean;
import mx.com.inscitech.fiducia.common.beans.MenuItemBean;
import mx.com.inscitech.fiducia.common.services.ConfigurationService;
import mx.com.inscitech.fiducia.common.services.LoggingService;

import mx.com.inscitech.fiducia.common.util.ServiceLocator;

import org.apache.log4j.Level;

/**
 * Clase que se encarga de generar los menus a partir de la informacion almacenada en la base de datos y al(los) perfil(es) del usuario.
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class MenuService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MenuService.class);


    private LoggingService logger;

    private static final String QUERY_MENU =
        "SELECT FUN.FFUN_ID_FUNCION, FUN.FFUN_ID_PADRE, FUN.FFUN_NOM_MENU, FUN.FFUN_NOMBRE_FUNCION FROM " +
        "F_FUNCION FUN, F_PER_FUN PER WHERE FUN.FFUN_ID_FUNCION = PER.FFUN_ID_FUNCION " + "AND FUN.FFUN_ID_PADRE = ? AND PER.FPER_ID_PERFIL = ? ORDER BY FUN.FFUN_ORDEN";

    private static final String QUERY_MENU_NULL =
        "SELECT FUN.FFUN_ID_FUNCION, FUN.FFUN_ID_PADRE, FUN.FFUN_NOM_MENU, FUN.FFUN_NOMBRE_FUNCION FROM " +
        "F_FUNCION FUN, F_PER_FUN PER WHERE FUN.FFUN_ID_FUNCION = PER.FFUN_ID_FUNCION " + "AND FUN.FFUN_ID_PADRE IS NULL AND PER.FPER_ID_PERFIL = ? ORDER BY FUN.FFUN_ORDEN";

    private static final String QUERY_HAS_CHILDS = "SELECT COUNT(*) AS CHILD_COUNT FROM F_FUNCION FUN WHERE FFUN_ID_PADRE = ?";

    private Connection cn = null;

    public static synchronized MenuService getInstance() {
        return new MenuService();
    }

    public MenuService() {
        logger = LoggingService.getInstance();

        try {
            cn = ServiceLocator.getInstance()
                               .getDatasource(ConfigurationService.getInstance().getProperty("systemDataSource"))
                               .getConnection();
        } catch (Exception e) {
            logger.log(this, Thread.currentThread(), Level.ERROR, e);
        }
    }

    @SuppressWarnings("removal")

    public void finalize() {
        if (cn != null)
            try {
                cn.close();
            } catch (Exception e) {
            }
        cn = null;
    }

    public MenuBean getMenu(Integer puestoId) {
        MenuBean result = new MenuBean();

        result.setMenuOptions(getMenuChilds(puestoId, null));

        return result;
    }

    public List getMenuChilds(Integer puestoId, Integer parentId) {

        List result = new ArrayList();

        MenuItemBean menuItem = null;
        int menuId = 0;
        String strSQL = QUERY_MENU;

        ResultSet rs = null;
        PreparedStatement ps = null;

        try {

            if (parentId == null)
                strSQL = QUERY_MENU_NULL;

            ps = cn.prepareStatement(strSQL);

            if (parentId == null) {
                ps.setInt(1, puestoId.intValue());
            } else {
                ps.setInt(1, parentId.intValue());
                ps.setInt(2, puestoId.intValue());
            }

            rs = ps.executeQuery();

            while (rs.next()) {
                menuItem = new MenuItemBean();

                menuItem.setId(rs.getString("FFUN_NOMBRE_FUNCION"));
                menuItem.setName(rs.getString("FFUN_NOM_MENU"));

                menuId = rs.getInt("FFUN_ID_FUNCION");

                if (menuHaveChilds(menuId))
                    menuItem.setChildItems(getMenuChilds(puestoId, Integer.valueOf(menuId)));
                LOGGER.debug("menuId:" + menuId);
                result.add(menuItem);
            }

        } catch (Exception e) {
            logger.log(this, Thread.currentThread(), Level.ERROR, e);
        } finally {
            if (rs != null)
                try {
                    rs.close();
                } catch (Exception e) {
                }
            if (ps != null)
                try {
                    ps.close();
                } catch (Exception e) {
                }

            rs = null;
            ps = null;
        }

        return result;
    }

    private boolean menuHaveChilds(int menuId) throws SQLException {

        boolean result = false;
        int totalChilds = 0;

        ResultSet rs = null;
        PreparedStatement ps = null;

        try {

            ps = cn.prepareStatement(QUERY_HAS_CHILDS);

            ps.setInt(1, menuId);

            rs = ps.executeQuery();

            if (rs.next()) {
                totalChilds = rs.getInt("CHILD_COUNT");
            }

            if (totalChilds > 0)
                result = true;

        } catch (Exception e) {
            logger.log(this, Thread.currentThread(), Level.ERROR, e);
        } finally {
            if (rs != null)
                try {
                    rs.close();
                } catch (Exception e) {
                }
            if (ps != null)
                try {
                    ps.close();
                } catch (Exception e) {
                }

            rs = null;
            ps = null;
        }

        return result;
    }
}
