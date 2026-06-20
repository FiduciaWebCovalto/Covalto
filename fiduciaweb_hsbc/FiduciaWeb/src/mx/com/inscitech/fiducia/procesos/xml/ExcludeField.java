package mx.com.inscitech.fiducia.procesos.xml;

import java.util.ArrayList;
import java.util.List;

public class ExcludeField {

    private List<LineContent> lineContent = null;

    public ExcludeField() {
        super();
        lineContent = new ArrayList<LineContent>();
    }

    public void setLineContent(List<LineContent> lineContent) {
        this.lineContent = lineContent;
    }

    public List<LineContent> getLineContent() {
        return lineContent;
    }
}
