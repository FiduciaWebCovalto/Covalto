package mx.com.inscitech.fiducia.common.beans;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que sirve para represantar el menu de la aplicacion
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class MenuBean {

    // TODO: Cambiar las propiedades al tipo de objeto que mejor convenga.
    private String absolutePosition = "auto";

    private String mode = "classic";

    private String maxItems = "8";

    private String xname = "Main Menu";

    private String mixedImages = "yes";

    private String type = "a2";

    private List menuOptions;

    public MenuBean() {
        menuOptions = new ArrayList();
    }

    public void addMenuItem(MenuItemBean menuItem) {
        menuOptions.add(menuItem);
    }

    // TODO: Ver si un stringbuffer soporta la longitud
    public byte[] getMenuInfo() {
        ByteArrayOutputStream menuData = new ByteArrayOutputStream();
        byte[] result = null;

        try {
            menuData.write("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>".getBytes());
            menuData.write("<menu ".getBytes());
            menuData.write((" absolutePosition=\"" + absolutePosition + "\"").getBytes());
            menuData.write((" mode=\"" + mode + "\"").getBytes());
            menuData.write((" maxItems=\"" + maxItems + "\"").getBytes());
            menuData.write((" xname=\"" + xname + "\"").getBytes());
            menuData.write((" mixedImages=\"" + mixedImages + "\"").getBytes());
            menuData.write((" type=\"" + type + "\">").getBytes());

            for (int i = 0; i < menuOptions.size(); i++) {
                menuData.write(((MenuItemBean) menuOptions.get(i)).getMenuInfo());
            }

            menuData.write("</menu>".getBytes());

            result = menuData.toByteArray();
        } catch (IOException e) {
            e.printStackTrace(); // TODO: Usar el logger
            result = "<menu absolutePosition=\"auto\" mode=\"classic\" maxItems=\"8\" xname=\"Demo Menu\" mixedImages=\"yes\" type=\"a2\"></menu>".getBytes();
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


    public void setAbsolutePosition(String absolutePosition) {
        this.absolutePosition = absolutePosition;
    }


    public String getAbsolutePosition() {
        return absolutePosition;
    }


    public void setMode(String mode) {
        this.mode = mode;
    }


    public String getMode() {
        return mode;
    }


    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }


    public String getMaxItems() {
        return maxItems;
    }


    public void setXname(String xname) {
        this.xname = xname;
    }


    public String getXname() {
        return xname;
    }


    public void setMixedImages(String mixedImages) {
        this.mixedImages = mixedImages;
    }


    public String getMixedImages() {
        return mixedImages;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String getType() {
        return type;
    }


    public void setMenuOptions(List menuOptions) {
        this.menuOptions = menuOptions;
    }


    public List getMenuOptions() {
        return menuOptions;
    }
}
