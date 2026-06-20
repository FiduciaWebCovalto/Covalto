package mx.com.inscitech.fiducia.common.beans;

public class InterfacesExcelConfig {
    
    public enum PROCESSED_FILE_ACTION {
        
        NOTHING("NOTHING"),
        DELETE("DELETE");
        
        private final String theType;

        private PROCESSED_FILE_ACTION(String s) {
            theType = s;
        }

        public boolean equalsName(String t) {
            return theType.equals(t);
        }

        public String toString() {
            return this.theType;
        }        
    };
    
    private String containerPath = "/temp";
    private PROCESSED_FILE_ACTION processedFileAction = PROCESSED_FILE_ACTION.DELETE;
    
    public InterfacesExcelConfig() {
        super();
    }
}
