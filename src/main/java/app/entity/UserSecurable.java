
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
* Classe que representa a tabela USER_SECURABLE
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"USER_SECURABLE\"", schema="\"sys\"")
@XmlRootElement
@CronappSecurity(post = "Administrators", get = "Administrators", delete = "Administrators", put = "Administrators")
@JsonFilter("app.entity.UserSecurable")
public class UserSecurable implements Serializable {
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
    @Column(name = "securable_id", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String securableId;


    /**
    * @generated
    */
    @Column(name = "user_id", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String userId;


    /**
    * Construtor
    * @generated
    */
    public UserSecurable(){
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
    public UserSecurable setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém securableId
    * return securableId
    * @generated
    */
    public java.lang.String getSecurableId() {
        return this.securableId;
    }

    /**
    * Define securableId
    * @param securableId securableId
    * @generated
    */
    public UserSecurable setSecurableId(java.lang.String securableId) {
        this.securableId = securableId;
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
    public UserSecurable setUserId(java.lang.String userId) {
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
UserSecurable object = (UserSecurable)obj;
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