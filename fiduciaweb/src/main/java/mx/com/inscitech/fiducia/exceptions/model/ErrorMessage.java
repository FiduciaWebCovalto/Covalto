package mx.com.inscitech.fiducia.exceptions.model;

import org.owasp.encoder.Encode;

import javax.servlet.http.HttpServletRequest;

import java.time.LocalDateTime;

import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ErrorMessage {

    private List<ExceptionDetail> details;
    private String timestamp;
    private String path;

    private ErrorMessage(List<ExceptionDetail> details, String path) {
        this.details = details;
        this.path = path;
        this.timestamp = LocalDateTime.now().toString();
    }

    public ErrorMessage(List<ExceptionDetail> details, HttpServletRequest request) {
        this(details, Encode.forJava(request.getRequestURI()));
    }

    public List<ExceptionDetail> getDetails() {
        return details;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getPath() {
        return path;
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
