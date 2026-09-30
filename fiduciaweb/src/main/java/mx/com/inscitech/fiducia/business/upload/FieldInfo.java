package mx.com.inscitech.fiducia.business.upload;

/**
 * Clase que se emplea para describir los campos a procesar de un archivo
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class FieldInfo {

    /**
     * Variable donde se almacena el nombre del campo
     */
    private String name;

    /**
     * Variable que contiene la descripcion del campo
     */
    private String description;

    /**
     * Variable en la que se almacena la el objeto con el cual se especifica el tipo y la longitud
     */
    private Object typeLengthInfo;

    /**
     * Variable en la que se especifica a que campo, variable o metodo se mapea el valor obtenido
     */
    private String mapToField;

    /**
     * Variable en la que se almacena la informacion sobre el formato en el que se encuentra el dato.
     * Se usa para cuando es necesario transformar el valor en otro tipo de dato.
     */
    private String formatInfo;

    /**
     * Variable que sirve para indicar que el campo es solo informativo.
     * Cuando es solo informativo no se debe de tomar en cuenta para el parseo de la linea.
     */
    private boolean onlyInfo = false;

    public FieldInfo() {
    }

    /**
     * Constructor con el cual se pueden inicializar todas las variables del objeto.
     * @param formatInfo El formato que se usa para transformar el valor del campo.
     * @param mapToField El nombre de la propiedad, campo, metodo o variable en la que se almacenara el valor del campo.
     * @param typeLengthInfo Objeto en el que se almacena la informacion sobre el tipo de dato y la longitud.
     * Ej. si se almacena un objeto de tipo java.lang.Long con valor de 15 (Long.valueOf(15)) se tomara como que el campo es numerico con longitud de 15.
     * @param description La descripcion del campo.
     * @param name El nombre con el cual se hara referencia al campo. Generalmente es solo informativo al igual que la descripcion.
     */
    public FieldInfo(String name, String description, Object typeLengthInfo, String mapToField, String formatInfo, boolean onlyInfo) {
        this.name = name;
        this.description = description;
        this.typeLengthInfo = typeLengthInfo;
        this.mapToField = mapToField;
        this.formatInfo = formatInfo;
        this.onlyInfo = onlyInfo;
    }

    /**
     * Constructor con el cual se pueden inicializar variables mas importantes del objeto.
     * @param formatInfo El formato que se usa para transformar el valor del campo.
     * @param mapToField El nombre de la propiedad, campo, metodo o variable en la que se almacenara el valor del campo.
     * @param typeLengthInfo Objeto en el que se almacena la informacion sobre el tipo de dato y la longitud.
     * Ej. si se almacena un objeto de tipo java.lang.Long con valor de 15 (Long.valueOf(15)) se tomara como que el campo es numerico con longitud de 15.
     * @param description La descripcion del campo.
     * @param name El nombre con el cual se hara referencia al campo. Generalmente es solo informativo al igual que la descripcion.
     */
    public FieldInfo(String name, String description, Object typeLengthInfo, String mapToField, String formatInfo) {
        this.name = name;
        this.description = description;
        this.typeLengthInfo = typeLengthInfo;
        this.mapToField = mapToField;
        this.formatInfo = formatInfo;
    }

    /**
     * Constructor que inicializa solo algunas de las propiedades.
     * @param mapToField El nombre de la propiedad, campo, metodo o variable en la que se almacenara el valor del campo.
     * @param typeLengthInfo Objeto en el que se almacena la informacion sobre el tipo de dato y la longitud.
     * Ej. si se almacena un objeto de tipo java.lang.Long con valor de 15 (Long.valueOf(15)) se tomara como que el campo es numerico con longitud de 15.
     * @param description La descripcion del campo.
     * @param name El nombre con el cual se hara referencia al campo. Generalmente es solo informativo al igual que la descripcion.
     */
    public FieldInfo(String name, String description, Object typeLengthInfo, String mapToField) {
        this.name = name;
        this.description = description;
        this.typeLengthInfo = typeLengthInfo;
        this.mapToField = mapToField;
    }

    /**
     * Constructor que inicializa solo algunas de las propiedades.
     * @param mapToField El nombre de la propiedad, campo, metodo o variable en la que se almacenara el valor del campo.
     * @param typeLengthInfo Objeto en el que se almacena la informacion sobre el tipo de dato y la longitud.
     * Ej. si se almacena un objeto de tipo java.lang.Long con valor de 15 (Long.valueOf(15)) se tomara como que el campo es numerico con longitud de 15.
     * @param description La descripcion del campo.
     */
    public FieldInfo(String description, Object typeLengthInfo, String mapToField) {
        this.name = description;
        this.description = description;
        this.typeLengthInfo = typeLengthInfo;
        this.mapToField = mapToField;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }


    public void setTypeLengthInfo(Object typeLengthInfo) {
        this.typeLengthInfo = typeLengthInfo;
    }


    public Object getTypeLengthInfo() {
        return typeLengthInfo;
    }


    public void setMapToField(String mapToField) {
        this.mapToField = mapToField;
    }


    public String getMapToField() {
        return mapToField;
    }


    public void setFormatInfo(String formatInfo) {
        this.formatInfo = formatInfo;
    }


    public String getFormatInfo() {
        return formatInfo;
    }

    public int getLength() {
        Double longitud = Double.valueOf(typeLengthInfo.toString());
        return longitud.intValue();
    }


    public void setOnlyInfo(boolean onlyInfo) {
        this.onlyInfo = onlyInfo;
    }


    public boolean isOnlyInfo() {
        return onlyInfo;
    }
}
