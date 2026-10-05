package mx.com.inscitech.fiducia.exceptions;

import javax.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import mx.com.inscitech.fiducia.exceptions.model.ErrorMessage;
import mx.com.inscitech.fiducia.exceptions.model.ExceptionDetail;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public abstract class FiduciaException extends Exception {

    protected final List<ExceptionDetail> details;

    public FiduciaException(List<ExceptionDetail> details, Exception e) {
        super(details != null ? details.toString() : "", e);
        this.details = details;
    }

    public FiduciaException(List<ExceptionDetail> details) {
        this(details, null);
    }

    public FiduciaException(ExceptionDetail detail, Exception e) {
        this(Arrays.asList(detail), e);
    }

    public FiduciaException(ExceptionDetail detail) {
        this(detail, null);
    }

    public FiduciaException(String errorCode, String errorMessage, Optional<Object> errorDetail) {
        this(errorCode, errorMessage, errorDetail, null);
    }

    public FiduciaException(String errorCode, String errorMessage, Optional<Object> errorDetail, Exception e) {
        this(new ExceptionDetail(errorCode, errorMessage, errorDetail), e);
    }

    public List<ExceptionDetail> getDetails() {
        return details;
    }

    public ErrorMessage getErrorMessage(HttpServletRequest request) {
        return new ErrorMessage(this.getDetails(), request);
    }

    public HttpStatus getHttpCode() {
        return this.getHttpCode(this.getClass());
    }

    private HttpStatus getHttpCode(Class<? extends FiduciaException> ex) {
        ResponseStatus rs = ex.getAnnotation(ResponseStatus.class);
        if (rs != null) {
            return rs.value();
        } else {
            return getHttpCode((Class<? extends FiduciaException>) ex.getSuperclass());
        }
    }

    private void readObject(ObjectInputStream aInputStream) throws ClassNotFoundException, IOException {
        aInputStream.defaultReadObject();
    }

    private void writeObject(ObjectOutputStream aOutputStream) throws IOException {
        aOutputStream.defaultWriteObject();
    }
}
