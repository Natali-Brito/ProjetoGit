
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela trace_xe_event_map
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"trace_xe_event_map\"", schema="\"sys\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.TraceXeEventMap")
public class TraceXeEventMap implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "trace_event_id", nullable = false, length=5, insertable=true, updatable=true)
        private java.lang.Short traceEventId;


    /**
    * @generated
    */
    @Column(name = "package_name", nullable = false, unique = false, length=60, insertable=true, updatable=true)
        
        private java.lang.String packageName;


    /**
    * @generated
    */
    @Column(name = "xe_event_name", nullable = false, unique = false, length=60, insertable=true, updatable=true)
        
        private java.lang.String xeEventName;


    /**
    * Construtor
    * @generated
    */
    public TraceXeEventMap(){
    }

    /**
    * Obtém traceEventId
    * return traceEventId
    * @generated
    */
    public java.lang.Short getTraceEventId() {
        return this.traceEventId;
    }

    /**
    * Define traceEventId
    * @param traceEventId traceEventId
    * @generated
    */
    public TraceXeEventMap setTraceEventId(java.lang.Short traceEventId) {
        this.traceEventId = traceEventId;
        return this;
    }
    /**
    * Obtém packageName
    * return packageName
    * @generated
    */
    public java.lang.String getPackageName() {
        return this.packageName;
    }

    /**
    * Define packageName
    * @param packageName packageName
    * @generated
    */
    public TraceXeEventMap setPackageName(java.lang.String packageName) {
        this.packageName = packageName;
        return this;
    }
    /**
    * Obtém xeEventName
    * return xeEventName
    * @generated
    */
    public java.lang.String getXeEventName() {
        return this.xeEventName;
    }

    /**
    * Define xeEventName
    * @param xeEventName xeEventName
    * @generated
    */
    public TraceXeEventMap setXeEventName(java.lang.String xeEventName) {
        this.xeEventName = xeEventName;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
TraceXeEventMap object = (TraceXeEventMap)obj;
        if (traceEventId != null ? !traceEventId.equals(object.traceEventId) : object.traceEventId != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((traceEventId == null) ? 0 : traceEventId.hashCode());
        return result;
    }

}