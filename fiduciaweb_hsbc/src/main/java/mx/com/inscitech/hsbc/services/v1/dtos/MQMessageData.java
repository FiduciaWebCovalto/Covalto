package mx.com.inscitech.hsbc.services.v1.dtos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MQMessageData {

    enum Align {
        Right,
        Left
    }

    //throws NumberFormatException
    protected String getFormattedField(String value, int length, String fillWith) {
        return getFormattedField(value, length, fillWith, Align.Right);
    }

    protected String getFormattedField(String value, int length, String fillWith, Align align) {
        String finalString = String.format("%1$" + length + "s", value).replaceAll(" ", fillWith);
        if(align == Align.Left) {
            finalString = value + String.format("%1$" + length + "s", fillWith).replaceAll(" ", fillWith);
            finalString = finalString.substring(0, length);
        } else {
            //finalString = finalString.substring(length);
        }
        
        return finalString;
    }

    protected String getTimestampDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("AAAAMMDD");
        return LocalTime.now().format(formatter);
    }

    protected String getTimestampHours() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHMMSS");
        return LocalTime.now().format(formatter);
    }
    
    protected boolean isValid() {
        return false;
    }
}
