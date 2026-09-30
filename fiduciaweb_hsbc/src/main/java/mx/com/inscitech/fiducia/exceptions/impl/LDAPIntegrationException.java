package mx.com.inscitech.fiducia.exceptions.impl;

import mx.com.inscitech.fiducia.exceptions.FiduciaException;

import java.util.List;
import java.util.Optional;

import mx.com.inscitech.fiducia.exceptions.model.ExceptionDetail;

public class LDAPIntegrationException extends FiduciaException {

    @SuppressWarnings("compatibility:-2564158873413089163")
    private static final long serialVersionUID = -7120277815352796116L;

    public LDAPIntegrationException(ExceptionDetail detail) {
        super(detail);
    }

    public LDAPIntegrationException(List<ExceptionDetail> details) {
        super(details);
    }

    public LDAPIntegrationException(String errorCode, String errorMessage, Optional<Object> errorDetail) {
        super(errorCode, errorMessage, errorDetail);
    }

    public LDAPIntegrationException(ExceptionDetail detail, Exception e) {
        super(detail, e);
    }

    public LDAPIntegrationException(List<ExceptionDetail> details, Exception e) {
        super(details, e);
    }

    public LDAPIntegrationException(String errorCode, String errorMessage, Optional<Object> errorDetail, Exception e) {
        super(errorCode, errorMessage, errorDetail, e);
    }
}
