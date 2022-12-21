
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
* Classe que representa a tabela ESCOLHAS
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"ESCOLHAS\"", schema="\"dbo\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Escolhas")
public class Escolhas implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "usuario", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String usuario;


    /**
    * @generated
    */
    @Column(name = "instituicao", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer instituicao;


    /**
    * @generated
    */
    @Column(name = "curso", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String curso;


    /**
    * @generated
    */
    @Column(name = "iraCursar", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String iraCursar;


    /**
    * @generated
    */
    @Column(name = "status", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String status;


    /**
    * Construtor
    * @generated
    */
    public Escolhas(){
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
    public Escolhas setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém usuario
    * return usuario
    * @generated
    */
    public java.lang.String getUsuario() {
        return this.usuario;
    }

    /**
    * Define usuario
    * @param usuario usuario
    * @generated
    */
    public Escolhas setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
        return this;
    }
    /**
    * Obtém instituicao
    * return instituicao
    * @generated
    */
    public java.lang.Integer getInstituicao() {
        return this.instituicao;
    }

    /**
    * Define instituicao
    * @param instituicao instituicao
    * @generated
    */
    public Escolhas setInstituicao(java.lang.Integer instituicao) {
        this.instituicao = instituicao;
        return this;
    }
    /**
    * Obtém curso
    * return curso
    * @generated
    */
    public java.lang.String getCurso() {
        return this.curso;
    }

    /**
    * Define curso
    * @param curso curso
    * @generated
    */
    public Escolhas setCurso(java.lang.String curso) {
        this.curso = curso;
        return this;
    }
    /**
    * Obtém iraCursar
    * return iraCursar
    * @generated
    */
    public java.lang.String getIraCursar() {
        return this.iraCursar;
    }

    /**
    * Define iraCursar
    * @param iraCursar iraCursar
    * @generated
    */
    public Escolhas setIraCursar(java.lang.String iraCursar) {
        this.iraCursar = iraCursar;
        return this;
    }
    /**
    * Obtém status
    * return status
    * @generated
    */
    public java.lang.String getStatus() {
        return this.status;
    }

    /**
    * Define status
    * @param status status
    * @generated
    */
    public Escolhas setStatus(java.lang.String status) {
        this.status = status;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Escolhas object = (Escolhas)obj;
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