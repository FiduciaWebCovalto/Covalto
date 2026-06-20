package mx.com.inscitech.fiducia.services;

import java.io.File;

import mx.com.inscitech.fiducia.common.services.LoggingService;

public class FileProcessorService {

    private LoggingService logger = null;

    private File mainFile = null;

    private void init() {
        logger = LoggingService.getNewInstance();
        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "FileProcessorService initialized! Main File: " + mainFile);
    }

    public FileProcessorService() {
        super();
        init();
    }

    public FileProcessorService(File theFile) {
        super();
        this.mainFile = theFile;
        init();
    }


}
