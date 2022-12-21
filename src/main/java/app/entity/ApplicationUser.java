
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
* Classe que representa a tabela APPLICATION_USER
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"APPLICATION_USER\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ApplicationUser")
public class ApplicationUser implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, length=255, insertable=true, updatable=true)
        private java.lang.String id;


    /**
    * @generated
    */
    @Column(name = "application_id", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String applicationId;


    /**
    * @generated
    */
    @Column(name = "user_id", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String userId;


    /**
    * Construtor
    * @generated
    */
    public ApplicationUser(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public ApplicationUser setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém applicationId
    * return applicationId
    * @generated
    */
    public java.lang.String getApplicationId() {
        return this.applicationId;
    }

    /**
    * Define applicationId
    * @param applicationId applicationId
    * @generated
    */
    public ApplicationUser setApplicationId(java.lang.String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    /**
    * Obtém userId
    * return userId
    * @generated
    */
    public java.lang.String getUserId() {
        return this.userId;
    }

    /**
    * Define userId
    * @param userId userId
    * @generated
    */
    public ApplicationUser setUserId(java.lang.String userId) {
        this.userId = userId;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
ApplicationUser object = (ApplicationUser)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}