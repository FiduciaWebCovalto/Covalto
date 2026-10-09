package mx.com.inscitech.clients.domain;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonCreator;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.math.BigDecimal;

import java.util.Map;



@JsonIgnoreProperties(ignoreUnknown=true)
public class ParamGlobal {


    public Map<String, String> properties;

    public Long paramClave;


    public String paramDescripcion;

    
    public BigDecimal paramValor;

    
    public String paramValor2;
    
    @JsonAnyGetter
    public Map<String, String> getProperties() {
        return properties;
    }
    
    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public ParamGlobal(@JsonProperty("paramValor") String paramDescripcion) {
        this.paramDescripcion = paramDescripcion;

    }

    public ParamGlobal() {

    }

    public Long getParamClave() {
        return paramClave;
    }

    public void setParamClave(final Long paramClave) {
        this.paramClave = paramClave;
    }
    @JsonGetter("name")
    public String getParamDescripcion() {
        return paramDescripcion;
    }

    public void setParamDescripcion(final String paramDescripcion) {
        this.paramDescripcion = paramDescripcion;
    }

    public BigDecimal getParamValor() {
        return paramValor;
    }

    public void setParamValor(final BigDecimal paramValor) {
        this.paramValor = paramValor;
    }

    public String getParamValor2() {
        return paramValor2;
    }

    public void setParamValor2(final String paramValor2) {
        this.paramValor2 = paramValor2;
    }
    
    @Override
    public String toString() {
        return "ParamGlobal{paramValor=" + paramDescripcion +"}";
    }
    


}
