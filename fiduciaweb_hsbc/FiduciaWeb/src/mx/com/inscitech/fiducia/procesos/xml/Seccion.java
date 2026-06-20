package mx.com.inscitech.fiducia.procesos.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "secciones")
@XmlAccessorType(XmlAccessType.FIELD)
public class Seccion {

    @XmlAttribute(name = "nombre", required = true)
    private String nombre = null;

    @XmlAttribute(name = "id", required = true)
    private String id = null;

    @XmlElement(name = "identificador", defaultValue = "00")
    private String identificador = "00";

    @XmlElement(name = "prefix", defaultValue = "SEC")
    private String prefix = "SEC";

    @XmlElement(name = "head-prefix", defaultValue = "HP")
    private String headPrefix = "HP";

    @XmlElement(name = "use-sub", defaultValue = "true")
    private boolean useSub = true;

    @XmlElement(name = "sub-prefix", defaultValue = "HS")
    private String subPrefix = "HS";

    @XmlElement(name = "body-prefix", defaultValue = "B")
    private String bodyPrefix = "B";

    @XmlElement(name = "total-prefix", defaultValue = "T")
    private String totalPrefix = "T";

    @XmlElement(name = "field-separator", defaultValue = "|")
    private String fieldSeparator = "|";

    @XmlElement(name = "use-id-on-hp", defaultValue = "true")
    private boolean useIdOnHP = true;

    @XmlElement(name = "use-id-on-hs", defaultValue = "true")
    private boolean useIdOnHS = true;

    @XmlElement(name = "use-id-on-body", defaultValue = "true")
    private boolean useIdOnBody = true;

    @XmlElement(name = "fields", nillable = false, required = true)
    private Fields fields = null;

    @XmlElement(name = "exclude")
    private ExcludeField exclude = null;

    public Seccion() {
        super();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setHeadPrefix(String headPrefix) {
        this.headPrefix = headPrefix;
    }

    public String getHeadPrefix() {
        return headPrefix;
    }

    public void setUseSub(boolean useSub) {
        this.useSub = useSub;
    }

    public boolean isUseSub() {
        return useSub;
    }

    public void setSubPrefix(String subPrefix) {
        this.subPrefix = subPrefix;
    }

    public String getSubPrefix() {
        return subPrefix;
    }

    public void setBodyPrefix(String bodyPrefix) {
        this.bodyPrefix = bodyPrefix;
    }

    public String getBodyPrefix() {
        return bodyPrefix;
    }

    public void setTotalPrefix(String totalPrefix) {
        this.totalPrefix = totalPrefix;
    }

    public String getTotalPrefix() {
        return totalPrefix;
    }

    public void setFieldSeparator(String fieldSeparator) {
        this.fieldSeparator = fieldSeparator;
    }

    public String getFieldSeparator() {
        return fieldSeparator;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }

    public Fields getFields() {
        return fields;
    }

    public void setUseIdOnHP(boolean useIdOnHP) {
        this.useIdOnHP = useIdOnHP;
    }

    public boolean isUseIdOnHP() {
        return useIdOnHP;
    }

    public void setUseIdOnHS(boolean useIdOnHS) {
        this.useIdOnHS = useIdOnHS;
    }

    public boolean isUseIdOnHS() {
        return useIdOnHS;
    }

    public void setUseIdOnBody(boolean useIdOnBody) {
        this.useIdOnBody = useIdOnBody;
    }

    public boolean isUseIdOnBody() {
        return useIdOnBody;
    }

    public void setExclude(ExcludeField exclude) {
        this.exclude = exclude;
    }

    public ExcludeField getExclude() {
        return exclude;
    }
}
