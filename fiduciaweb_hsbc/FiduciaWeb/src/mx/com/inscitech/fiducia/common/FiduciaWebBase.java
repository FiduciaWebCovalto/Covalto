package mx.com.inscitech.fiducia.common;

import mx.com.inscitech.fiducia.common.services.LoggingService;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class FiduciaWebBase {

    protected static final Level DEBUG = Level.DEBUG;
    protected static final Level INFO = Level.INFO;
    protected static final Level WARN = Level.WARN;
    protected static final Level ERROR = Level.ERROR;
    protected static final Level FATAL = Level.FATAL;

    protected Logger logger = null;
    protected LoggingService logSrv = null;

    public FiduciaWebBase() {
        super();
        logger = Logger.getLogger(this.getClass());
        logSrv = LoggingService.getNewInstance();
    }

}
