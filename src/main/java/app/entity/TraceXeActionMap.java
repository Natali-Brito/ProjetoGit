
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
* Classe que representa a tabela trace_xe_action_map
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"trace_xe_action_map\"", schema="\"sys\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.TraceXeActionMap")
public class TraceXeActionMap implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "trace_column_id", nullable = false, length=5, insertable=true, updatable=true)
        private java.lang.Short traceColumnId;


    /**
    * @generated
    */
    @Column(name = "package_name", nullable = false, unique = false, length=60, insertable=true, updatable=true)
        
        private java.lang.String packageName;


    /**
    * @generated
    */
    @Column(name = "xe_action_name", nullable = false, unique = false, length=60, insertable=true, updatable=true)
        
        private java.lang.String xeActionName;


    /**
    * Construtor
    * @generated
    */
    public TraceXeActionMap(){
    }

    /**
    * Obtém traceColumnId
    * return traceColumnId
    * @generated
    */
    public java.lang.Short getTraceColumnId() {
        return this.traceColumnId;
    }

    /**
    * Define traceColumnId
    * @param traceColumnId traceColumnId
    * @generated
    */
    public TraceXeActionMap setTraceColumnId(java.lang.Short traceColumnId) {
        this.traceColumnId = traceColumnId;
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
    public TraceXeActionMap setPackageName(java.lang.String packageName) {
        this.packageName = packageName;
        return this;
    }
    /**
    * Obtém xeActionName
    * return xeActionName
    * @generated
    */
    public java.lang.String getXeActionName() {
        return this.xeActionName;
    }

    /**
    * Define xeActionName
    * @param xeActionName xeActionName
    * @generated
    */
    public TraceXeActionMap setXeActionName(java.lang.String xeActionName) {
        this.xeActionName = xeActionName;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
TraceXeActionMap object = (TraceXeActionMap)obj;
        if (traceColumnId != null ? !traceColumnId.equals(object.traceColumnId) : object.traceColumnId != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((traceColumnId == null) ? 0 : traceColumnId.hashCode());
        return result;
    }

}