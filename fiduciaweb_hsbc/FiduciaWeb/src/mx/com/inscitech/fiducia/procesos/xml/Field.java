package mx.com.inscitech.fiducia.procesos.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "field")
@XmlAccessorType(XmlAccessType.FIELD)
public class Field {

    @XmlAttribute(name = "name", required = true)
    private String name = null;

    @XmlAttribute(name = "id", required = true)
    private String id = null;

    @XmlElement(name = "displayName", defaultValue = "")
    private String displayName = "";

    @XmlElement(name = "length", nillable = false, required = true)
    private int length = 0;

    @XmlElement(name = "format", defaultValue = "")
    private String format = null;

    @XmlElement(name = "toEndOfLine", defaultValue = "false")
    private boolean toEndOfLine = false;

    @XmlElement(name = "skipStart", defaultValue = "0")
    private int skipStart = 0;

    @XmlElement(name = "skipEnd", defaultValue = "00")
    private int skipEnd = 0;

    @XmlElement(name = "trimType", defaultValue = "F")
    private String trimType = "F";

    @XmlElement(name = "replaceRegExPre")
    private String replaceRegExPre = null;

    @XmlElement(name = "replaceRegExPost")
    private String replaceRegExPost = null;

    public Field() {
        super();
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

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setToEndOfLine(boolean toEndOfLine) {
        this.toEndOfLine = toEndOfLine;
    }

    public boolean isToEndOfLine() {
        return toEndOfLine;
    }

    public void setSkipStart(int skipStart) {
        this.skipStart = skipStart;
    }

    public int getSkipStart() {
        return skipStart;
    }

    public void setSkipEnd(int skipEnd) {
        this.skipEnd = skipEnd;
    }

    public int getSkipEnd() {
        return skipEnd;
    }

    public void setTrimType(String trimType) {
        this.trimType = trimType;
    }

    public String getTrimType() {
        return trimType;
    }

    public void setReplaceRegExPre(String replaceRegExPre) {
        this.replaceRegExPre = replaceRegExPre;
    }

    public String getReplaceRegExPre() {
        return replaceRegExPre;
    }

    public void setReplaceRegExPost(String replaceRegExPost) {
        this.replaceRegExPost = replaceRegExPost;
    }

    public String getReplaceRegExPost() {
        return replaceRegExPost;
    }

}
