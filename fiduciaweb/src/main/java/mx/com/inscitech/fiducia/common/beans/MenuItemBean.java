package mx.com.inscitech.fiducia.common.beans;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que sirve para representar una opcion de menu
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class MenuItemBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(MenuItemBean.class);

    //<MenuItem name="Formalización" id="moduloFormalizacion" width="30" withoutImages="true">
    // TODO: Cambiar las propiedades al tipo de objeto que mejor convenga.

    private String name;

    private String id;

    private String width = "30px";

    private String height;

    private String withoutImages = "true";

    private String panelWidth = "300px";

    private List childItems;

    public MenuItemBean() {
        childItems = new ArrayList();
    }

    public void addChildItem(MenuItemBean menuItem) {
        childItems.add(menuItem);
    }

    public byte[] getMenuInfo() {
        ByteArrayOutputStream menuData = new ByteArrayOutputStream();
        byte[] result = null;

        try {
            menuData.write("<MenuItem ".getBytes());
            menuData.write((" name=\"" + name + "\"").getBytes());
            menuData.write((" id=\"" + id + "\"").getBytes());
            if (width != null)
                menuData.write((" width=\"" + width + "\"").getBytes());
            menuData.write((" panelWidth=\"" + panelWidth + "\"").getBytes());
            if (height != null)
                menuData.write((" height=\"" + height + "\"").getBytes());
            menuData.write((" withoutImages=\"" + withoutImages + "\">").getBytes());

            for (int i = 0; i < childItems.size(); i++) {
                menuData.write(((MenuItemBean) childItems.get(i)).getMenuInfo());
            }

            menuData.write("</MenuItem>".getBytes());

            result = menuData.toByteArray();
        } catch (IOException e) {
            LOGGER.error("Exception: ", e); // TODO: Usar el logger
        } finally {
            try {
                menuData.flush();
                menuData.close();
            } catch (IOException e) {
            }

            menuData = null;
        }

        return result;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getId() {
        return id;
    }


    public void setWidth(String width) {
        this.width = width;
    }


    public String getWidth() {
        return width;
    }


    public void setHeight(String height) {
        this.height = height;
    }


    public String getHeight() {
        return height;
    }


    public void setWithoutImages(String withoutImages) {
        this.withoutImages = withoutImages;
    }


    public String getWithoutImages() {
        return withoutImages;
    }


    public void setChildItems(List childItems) {
        this.childItems = childItems;
    }


    public List getChildItems() {
        return childItems;
    }


    public void setPanelWidth(String panelWidth) {
        this.panelWidth = panelWidth;
    }


    public String getPanelWidth() {
        return panelWidth;
    }
}
