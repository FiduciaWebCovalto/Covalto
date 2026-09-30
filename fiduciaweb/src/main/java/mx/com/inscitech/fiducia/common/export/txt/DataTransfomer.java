package mx.com.inscitech.fiducia.common.export.txt;


public interface DataTransfomer {
    String doTransform(String value);

    String doTransform(String[] value);
}
