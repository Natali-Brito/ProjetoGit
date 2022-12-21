
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
* Classe que representa a tabela USER_ROLE
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"USER_ROLE\"", schema="\"sys\"")
@XmlRootElement
@CronappSecurity(post = "Administrators", get = "Administrators", delete = "Administrators", put = "Administrators")
@JsonFilter("app.entity.UserRole")
public class UserRole implements Serializable {
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
    @ManyToOne
    @JoinColumn(name="role_id", nullable = false, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "USER_ROLE_ROLE_ID_ROLE_ID", foreignKeyDefinition = "FOREIGN KEY (role_id) REFERENCES ROLE (id)"))
        
        private Role role;


    /**
    * @generated
    */
    @Column(name = "user_id", nullable = false, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String userId;


    /**
    * Construtor
    * @generated
    */
    public UserRole(){
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
    public UserRole setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém role
    * return role
    * @generated
    */
    public Role getRole() {
        return this.role;
    }

    /**
    * Define role
    * @param role role
    * @generated
    */
    public UserRole setRole(Role role) {
        this.role = role;
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
    public UserRole setUserId(java.lang.String userId) {
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
UserRole object = (UserRole)obj;
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