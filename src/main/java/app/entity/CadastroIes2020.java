
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
* Classe que representa a tabela CADASTRO_IES_2020
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CADASTRO_IES_2020\"", schema="\"dbo\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.CadastroIes2020")
public class CadastroIes2020 implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "NU_ANO_CENSO", nullable = false, length=5, insertable=true, updatable=true)
        private java.lang.Short nuAnoCenso;


    /**
    * @generated
    */
    @Column(name = "CO_IES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short coIes;


    /**
    * @generated
    */
    @Column(name = "CO_MANTENEDORA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short coMantenedora;


    /**
    * @generated
    */
    @Column(name = "CO_MESORREGIAO_IES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short coMesorregiaoIes;


    /**
    * @generated
    */
    @Column(name = "CO_MICRORREGIAO_IES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short coMicrorregiaoIes;


    /**
    * @generated
    */
    @Column(name = "CO_MUNICIPIO_IES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer coMunicipioIes;


    /**
    * @generated
    */
    @Column(name = "CO_REGIAO_IES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short coRegiaoIes;


    /**
    * @generated
    */
    @Column(name = "CO_UF_IES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short coUfIes;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_0_29", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docEx029;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_30_34", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docEx3034;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_35_39", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docEx3539;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_40_44", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docEx4044;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_45_49", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docEx4549;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_50_54", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docEx5054;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_55_59", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docEx5559;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_60_MAIS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docEx60Mais;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_AMARELA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExAmarela;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_BRA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExBra;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_BRANCA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExBranca;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_COM_DEFICIÊNCIA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExComDeficiência;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_COR_ND", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExCorNd;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_DOUT", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExDout;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_ESP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExEsp;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_EST", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExEst;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_FEMI", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExFemi;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_GRAD", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExGrad;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_HOR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExHor;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_INDÍGENA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExIndígena;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_INT", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExInt;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_INT_DE", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExIntDe;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_INT_SEM_DE", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExIntSemDe;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_MASC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExMasc;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_MEST", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExMest;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_PARC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExParc;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_PARDA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExParda;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_PRETA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExPreta;


    /**
    * @generated
    */
    @Column(name = "DOC_EX_SEM_GRAD", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short docExSemGrad;


    /**
    * @generated
    */
    @Column(name = "DS_COMPLEMENTO_ENDERECO_IES", nullable = true, unique = false, length=85, insertable=true, updatable=true)
        
        private java.lang.String dsComplementoEnderecoIes;


    /**
    * @generated
    */
    @Column(name = "DS_ENDERECO_IES", nullable = true, unique = false, length=91, insertable=true, updatable=true)
        
        private java.lang.String dsEnderecoIes;


    /**
    * @generated
    */
    @Column(name = "DS_NUMERO_ENDERECO_IES", nullable = true, unique = false, length=68, insertable=true, updatable=true)
        
        private java.lang.String dsNumeroEnderecoIes;


    /**
    * @generated
    */
    @Column(name = "IN_ACESSO_OUTRAS_BASES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short inAcessoOutrasBases;


    /**
    * @generated
    */
    @Column(name = "IN_ACESSO_PORTAL_CAPES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short inAcessoPortalCapes;


    /**
    * @generated
    */
    @Column(name = "IN_ASSINA_OUTRA_BASE", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short inAssinaOutraBase;


    /**
    * @generated
    */
    @Column(name = "IN_BUSCA_INTEGRADA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short inBuscaIntegrada;


    /**
    * @generated
    */
    @Column(name = "IN_CAPITAL_IES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short inCapitalIes;


    /**
    * @generated
    */
    @Column(name = "IN_CATALOGO_ONLINE", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short inCatalogoOnline;


    /**
    * @generated
    */
    @Column(name = "IN_PARTICIPA_REDE_SOCIAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short inParticipaRedeSocial;


    /**
    * @generated
    */
    @Column(name = "IN_REPOSITORIO_INSTITUCIONAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short inRepositorioInstitucional;


    /**
    * @generated
    */
    @Column(name = "IN_SERVICO_INTERNET", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short inServicoInternet;


    /**
    * @generated
    */
    @Column(name = "NO_BAIRRO_IES", nullable = true, unique = false, length=47, insertable=true, updatable=true)
        
        private java.lang.String noBairroIes;


    /**
    * @generated
    */
    @Column(name = "NO_IES", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String noIes;


    /**
    * @generated
    */
    @Column(name = "NO_MANTENEDORA", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String noMantenedora;


    /**
    * @generated
    */
    @Column(name = "NO_MESORREGIAO_IES", nullable = true, unique = false, length=34, insertable=true, updatable=true)
        
        private java.lang.String noMesorregiaoIes;


    /**
    * @generated
    */
    @Column(name = "NO_MICRORREGIAO_IES", nullable = true, unique = false, length=36, insertable=true, updatable=true)
        
        private java.lang.String noMicrorregiaoIes;


    /**
    * @generated
    */
    @Column(name = "NO_MUNICIPIO_IES", nullable = true, unique = false, length=26, insertable=true, updatable=true)
        
        private java.lang.String noMunicipioIes;


    /**
    * @generated
    */
    @Column(name = "NO_REGIAO_IES", nullable = true, unique = false, length=12, insertable=true, updatable=true)
        
        private java.lang.String noRegiaoIes;


    /**
    * @generated
    */
    @Column(name = "NO_UF_IES", nullable = true, unique = false, length=19, insertable=true, updatable=true)
        
        private java.lang.String noUfIes;


    /**
    * @generated
    */
    @Column(name = "NU_CEP_IES", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String nuCepIes;


    /**
    * @generated
    */
    @Column(name = "QT_DOCENTE_EXE", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtDocenteExe;


    /**
    * @generated
    */
    @Column(name = "QT_DOCENTE_TOTAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtDocenteTotal;


    /**
    * @generated
    */
    @Column(name = "QT_LIVRO_ELETRONICO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtLivroEletronico;


    /**
    * @generated
    */
    @Column(name = "QT_PERIODICO_ELETRONICO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtPeriodicoEletronico;


    /**
    * @generated
    */
    @Column(name = "QT_TEC_DOUTORADO_FEM", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtTecDoutoradoFem;


    /**
    * @generated
    */
    @Column(name = "QT_TEC_DOUTORADO_MASC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtTecDoutoradoMasc;


    /**
    * @generated
    */
    @Column(name = "QT_TEC_ESPECIALIZACAO_FEM", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtTecEspecializacaoFem;


    /**
    * @generated
    */
    @Column(name = "QT_TEC_ESPECIALIZACAO_MASC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtTecEspecializacaoMasc;


    /**
    * @generated
    */
    @Column(name = "QT_TEC_FUNDAMENTAL_COMP_FEM", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtTecFundamentalCompFem;


    /**
    * @generated
    */
    @Column(name = "QT_TEC_FUNDAMENTAL_COMP_MASC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtTecFundamentalCompMasc;


    /**
    * @generated
    */
    @Column(name = "QT_TEC_FUNDAMENTAL_INCOMP_FEM", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtTecFundamentalIncompFem;


    /**
    * @generated
    */
    @Column(name = "QT_TEC_FUNDAMENTAL_INCOMP_MASC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtTecFundamentalIncompMasc;


    /**
    * @generated
    */
    @Column(name = "QT_TEC_MEDIO_FEM", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtTecMedioFem;


    /**
    * @generated
    */
    @Column(name = "QT_TEC_MEDIO_MASC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtTecMedioMasc;


    /**
    * @generated
    */
    @Column(name = "QT_TEC_MESTRADO_FEM", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtTecMestradoFem;


    /**
    * @generated
    */
    @Column(name = "QT_TEC_MESTRADO_MASC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtTecMestradoMasc;


    /**
    * @generated
    */
    @Column(name = "QT_TEC_SUPERIOR_FEM", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtTecSuperiorFem;


    /**
    * @generated
    */
    @Column(name = "QT_TEC_SUPERIOR_MASC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtTecSuperiorMasc;


    /**
    * @generated
    */
    @Column(name = "QT_TEC_TOTAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtTecTotal;


    /**
    * @generated
    */
    @Column(name = "SG_IES", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String sgIes;


    /**
    * @generated
    */
    @Column(name = "SG_UF_IES", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String sgUfIes;


    /**
    * @generated
    */
    @Column(name = "TP_CATEGORIA_ADMINISTRATIVA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short tpCategoriaAdministrativa;


    /**
    * @generated
    */
    @Column(name = "TP_ORGANIZACAO_ACADEMICA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short tpOrganizacaoAcademica;


    /**
    * @generated
    */
    @Column(name = "NO_SG_IES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String noSgIes;


    /**
    * Construtor
    * @generated
    */
    public CadastroIes2020(){
    }

    /**
    * Obtém nuAnoCenso
    * return nuAnoCenso
    * @generated
    */
    public java.lang.Short getNuAnoCenso() {
        return this.nuAnoCenso;
    }

    /**
    * Define nuAnoCenso
    * @param nuAnoCenso nuAnoCenso
    * @generated
    */
    public CadastroIes2020 setNuAnoCenso(java.lang.Short nuAnoCenso) {
        this.nuAnoCenso = nuAnoCenso;
        return this;
    }
    /**
    * Obtém coIes
    * return coIes
    * @generated
    */
    public java.lang.Short getCoIes() {
        return this.coIes;
    }

    /**
    * Define coIes
    * @param coIes coIes
    * @generated
    */
    public CadastroIes2020 setCoIes(java.lang.Short coIes) {
        this.coIes = coIes;
        return this;
    }
    /**
    * Obtém coMantenedora
    * return coMantenedora
    * @generated
    */
    public java.lang.Short getCoMantenedora() {
        return this.coMantenedora;
    }

    /**
    * Define coMantenedora
    * @param coMantenedora coMantenedora
    * @generated
    */
    public CadastroIes2020 setCoMantenedora(java.lang.Short coMantenedora) {
        this.coMantenedora = coMantenedora;
        return this;
    }
    /**
    * Obtém coMesorregiaoIes
    * return coMesorregiaoIes
    * @generated
    */
    public java.lang.Short getCoMesorregiaoIes() {
        return this.coMesorregiaoIes;
    }

    /**
    * Define coMesorregiaoIes
    * @param coMesorregiaoIes coMesorregiaoIes
    * @generated
    */
    public CadastroIes2020 setCoMesorregiaoIes(java.lang.Short coMesorregiaoIes) {
        this.coMesorregiaoIes = coMesorregiaoIes;
        return this;
    }
    /**
    * Obtém coMicrorregiaoIes
    * return coMicrorregiaoIes
    * @generated
    */
    public java.lang.Short getCoMicrorregiaoIes() {
        return this.coMicrorregiaoIes;
    }

    /**
    * Define coMicrorregiaoIes
    * @param coMicrorregiaoIes coMicrorregiaoIes
    * @generated
    */
    public CadastroIes2020 setCoMicrorregiaoIes(java.lang.Short coMicrorregiaoIes) {
        this.coMicrorregiaoIes = coMicrorregiaoIes;
        return this;
    }
    /**
    * Obtém coMunicipioIes
    * return coMunicipioIes
    * @generated
    */
    public java.lang.Integer getCoMunicipioIes() {
        return this.coMunicipioIes;
    }

    /**
    * Define coMunicipioIes
    * @param coMunicipioIes coMunicipioIes
    * @generated
    */
    public CadastroIes2020 setCoMunicipioIes(java.lang.Integer coMunicipioIes) {
        this.coMunicipioIes = coMunicipioIes;
        return this;
    }
    /**
    * Obtém coRegiaoIes
    * return coRegiaoIes
    * @generated
    */
    public java.lang.Short getCoRegiaoIes() {
        return this.coRegiaoIes;
    }

    /**
    * Define coRegiaoIes
    * @param coRegiaoIes coRegiaoIes
    * @generated
    */
    public CadastroIes2020 setCoRegiaoIes(java.lang.Short coRegiaoIes) {
        this.coRegiaoIes = coRegiaoIes;
        return this;
    }
    /**
    * Obtém coUfIes
    * return coUfIes
    * @generated
    */
    public java.lang.Short getCoUfIes() {
        return this.coUfIes;
    }

    /**
    * Define coUfIes
    * @param coUfIes coUfIes
    * @generated
    */
    public CadastroIes2020 setCoUfIes(java.lang.Short coUfIes) {
        this.coUfIes = coUfIes;
        return this;
    }
    /**
    * Obtém docEx029
    * return docEx029
    * @generated
    */
    public java.lang.Short getDocEx029() {
        return this.docEx029;
    }

    /**
    * Define docEx029
    * @param docEx029 docEx029
    * @generated
    */
    public CadastroIes2020 setDocEx029(java.lang.Short docEx029) {
        this.docEx029 = docEx029;
        return this;
    }
    /**
    * Obtém docEx3034
    * return docEx3034
    * @generated
    */
    public java.lang.Short getDocEx3034() {
        return this.docEx3034;
    }

    /**
    * Define docEx3034
    * @param docEx3034 docEx3034
    * @generated
    */
    public CadastroIes2020 setDocEx3034(java.lang.Short docEx3034) {
        this.docEx3034 = docEx3034;
        return this;
    }
    /**
    * Obtém docEx3539
    * return docEx3539
    * @generated
    */
    public java.lang.Short getDocEx3539() {
        return this.docEx3539;
    }

    /**
    * Define docEx3539
    * @param docEx3539 docEx3539
    * @generated
    */
    public CadastroIes2020 setDocEx3539(java.lang.Short docEx3539) {
        this.docEx3539 = docEx3539;
        return this;
    }
    /**
    * Obtém docEx4044
    * return docEx4044
    * @generated
    */
    public java.lang.Short getDocEx4044() {
        return this.docEx4044;
    }

    /**
    * Define docEx4044
    * @param docEx4044 docEx4044
    * @generated
    */
    public CadastroIes2020 setDocEx4044(java.lang.Short docEx4044) {
        this.docEx4044 = docEx4044;
        return this;
    }
    /**
    * Obtém docEx4549
    * return docEx4549
    * @generated
    */
    public java.lang.Short getDocEx4549() {
        return this.docEx4549;
    }

    /**
    * Define docEx4549
    * @param docEx4549 docEx4549
    * @generated
    */
    public CadastroIes2020 setDocEx4549(java.lang.Short docEx4549) {
        this.docEx4549 = docEx4549;
        return this;
    }
    /**
    * Obtém docEx5054
    * return docEx5054
    * @generated
    */
    public java.lang.Short getDocEx5054() {
        return this.docEx5054;
    }

    /**
    * Define docEx5054
    * @param docEx5054 docEx5054
    * @generated
    */
    public CadastroIes2020 setDocEx5054(java.lang.Short docEx5054) {
        this.docEx5054 = docEx5054;
        return this;
    }
    /**
    * Obtém docEx5559
    * return docEx5559
    * @generated
    */
    public java.lang.Short getDocEx5559() {
        return this.docEx5559;
    }

    /**
    * Define docEx5559
    * @param docEx5559 docEx5559
    * @generated
    */
    public CadastroIes2020 setDocEx5559(java.lang.Short docEx5559) {
        this.docEx5559 = docEx5559;
        return this;
    }
    /**
    * Obtém docEx60Mais
    * return docEx60Mais
    * @generated
    */
    public java.lang.Short getDocEx60Mais() {
        return this.docEx60Mais;
    }

    /**
    * Define docEx60Mais
    * @param docEx60Mais docEx60Mais
    * @generated
    */
    public CadastroIes2020 setDocEx60Mais(java.lang.Short docEx60Mais) {
        this.docEx60Mais = docEx60Mais;
        return this;
    }
    /**
    * Obtém docExAmarela
    * return docExAmarela
    * @generated
    */
    public java.lang.Short getDocExAmarela() {
        return this.docExAmarela;
    }

    /**
    * Define docExAmarela
    * @param docExAmarela docExAmarela
    * @generated
    */
    public CadastroIes2020 setDocExAmarela(java.lang.Short docExAmarela) {
        this.docExAmarela = docExAmarela;
        return this;
    }
    /**
    * Obtém docExBra
    * return docExBra
    * @generated
    */
    public java.lang.Short getDocExBra() {
        return this.docExBra;
    }

    /**
    * Define docExBra
    * @param docExBra docExBra
    * @generated
    */
    public CadastroIes2020 setDocExBra(java.lang.Short docExBra) {
        this.docExBra = docExBra;
        return this;
    }
    /**
    * Obtém docExBranca
    * return docExBranca
    * @generated
    */
    public java.lang.Short getDocExBranca() {
        return this.docExBranca;
    }

    /**
    * Define docExBranca
    * @param docExBranca docExBranca
    * @generated
    */
    public CadastroIes2020 setDocExBranca(java.lang.Short docExBranca) {
        this.docExBranca = docExBranca;
        return this;
    }
    /**
    * Obtém docExComDeficiência
    * return docExComDeficiência
    * @generated
    */
    public java.lang.Short getDocExComDeficiência() {
        return this.docExComDeficiência;
    }

    /**
    * Define docExComDeficiência
    * @param docExComDeficiência docExComDeficiência
    * @generated
    */
    public CadastroIes2020 setDocExComDeficiência(java.lang.Short docExComDeficiência) {
        this.docExComDeficiência = docExComDeficiência;
        return this;
    }
    /**
    * Obtém docExCorNd
    * return docExCorNd
    * @generated
    */
    public java.lang.Short getDocExCorNd() {
        return this.docExCorNd;
    }

    /**
    * Define docExCorNd
    * @param docExCorNd docExCorNd
    * @generated
    */
    public CadastroIes2020 setDocExCorNd(java.lang.Short docExCorNd) {
        this.docExCorNd = docExCorNd;
        return this;
    }
    /**
    * Obtém docExDout
    * return docExDout
    * @generated
    */
    public java.lang.Short getDocExDout() {
        return this.docExDout;
    }

    /**
    * Define docExDout
    * @param docExDout docExDout
    * @generated
    */
    public CadastroIes2020 setDocExDout(java.lang.Short docExDout) {
        this.docExDout = docExDout;
        return this;
    }
    /**
    * Obtém docExEsp
    * return docExEsp
    * @generated
    */
    public java.lang.Short getDocExEsp() {
        return this.docExEsp;
    }

    /**
    * Define docExEsp
    * @param docExEsp docExEsp
    * @generated
    */
    public CadastroIes2020 setDocExEsp(java.lang.Short docExEsp) {
        this.docExEsp = docExEsp;
        return this;
    }
    /**
    * Obtém docExEst
    * return docExEst
    * @generated
    */
    public java.lang.Short getDocExEst() {
        return this.docExEst;
    }

    /**
    * Define docExEst
    * @param docExEst docExEst
    * @generated
    */
    public CadastroIes2020 setDocExEst(java.lang.Short docExEst) {
        this.docExEst = docExEst;
        return this;
    }
    /**
    * Obtém docExFemi
    * return docExFemi
    * @generated
    */
    public java.lang.Short getDocExFemi() {
        return this.docExFemi;
    }

    /**
    * Define docExFemi
    * @param docExFemi docExFemi
    * @generated
    */
    public CadastroIes2020 setDocExFemi(java.lang.Short docExFemi) {
        this.docExFemi = docExFemi;
        return this;
    }
    /**
    * Obtém docExGrad
    * return docExGrad
    * @generated
    */
    public java.lang.Short getDocExGrad() {
        return this.docExGrad;
    }

    /**
    * Define docExGrad
    * @param docExGrad docExGrad
    * @generated
    */
    public CadastroIes2020 setDocExGrad(java.lang.Short docExGrad) {
        this.docExGrad = docExGrad;
        return this;
    }
    /**
    * Obtém docExHor
    * return docExHor
    * @generated
    */
    public java.lang.Short getDocExHor() {
        return this.docExHor;
    }

    /**
    * Define docExHor
    * @param docExHor docExHor
    * @generated
    */
    public CadastroIes2020 setDocExHor(java.lang.Short docExHor) {
        this.docExHor = docExHor;
        return this;
    }
    /**
    * Obtém docExIndígena
    * return docExIndígena
    * @generated
    */
    public java.lang.Short getDocExIndígena() {
        return this.docExIndígena;
    }

    /**
    * Define docExIndígena
    * @param docExIndígena docExIndígena
    * @generated
    */
    public CadastroIes2020 setDocExIndígena(java.lang.Short docExIndígena) {
        this.docExIndígena = docExIndígena;
        return this;
    }
    /**
    * Obtém docExInt
    * return docExInt
    * @generated
    */
    public java.lang.Short getDocExInt() {
        return this.docExInt;
    }

    /**
    * Define docExInt
    * @param docExInt docExInt
    * @generated
    */
    public CadastroIes2020 setDocExInt(java.lang.Short docExInt) {
        this.docExInt = docExInt;
        return this;
    }
    /**
    * Obtém docExIntDe
    * return docExIntDe
    * @generated
    */
    public java.lang.Short getDocExIntDe() {
        return this.docExIntDe;
    }

    /**
    * Define docExIntDe
    * @param docExIntDe docExIntDe
    * @generated
    */
    public CadastroIes2020 setDocExIntDe(java.lang.Short docExIntDe) {
        this.docExIntDe = docExIntDe;
        return this;
    }
    /**
    * Obtém docExIntSemDe
    * return docExIntSemDe
    * @generated
    */
    public java.lang.Short getDocExIntSemDe() {
        return this.docExIntSemDe;
    }

    /**
    * Define docExIntSemDe
    * @param docExIntSemDe docExIntSemDe
    * @generated
    */
    public CadastroIes2020 setDocExIntSemDe(java.lang.Short docExIntSemDe) {
        this.docExIntSemDe = docExIntSemDe;
        return this;
    }
    /**
    * Obtém docExMasc
    * return docExMasc
    * @generated
    */
    public java.lang.Short getDocExMasc() {
        return this.docExMasc;
    }

    /**
    * Define docExMasc
    * @param docExMasc docExMasc
    * @generated
    */
    public CadastroIes2020 setDocExMasc(java.lang.Short docExMasc) {
        this.docExMasc = docExMasc;
        return this;
    }
    /**
    * Obtém docExMest
    * return docExMest
    * @generated
    */
    public java.lang.Short getDocExMest() {
        return this.docExMest;
    }

    /**
    * Define docExMest
    * @param docExMest docExMest
    * @generated
    */
    public CadastroIes2020 setDocExMest(java.lang.Short docExMest) {
        this.docExMest = docExMest;
        return this;
    }
    /**
    * Obtém docExParc
    * return docExParc
    * @generated
    */
    public java.lang.Short getDocExParc() {
        return this.docExParc;
    }

    /**
    * Define docExParc
    * @param docExParc docExParc
    * @generated
    */
    public CadastroIes2020 setDocExParc(java.lang.Short docExParc) {
        this.docExParc = docExParc;
        return this;
    }
    /**
    * Obtém docExParda
    * return docExParda
    * @generated
    */
    public java.lang.Short getDocExParda() {
        return this.docExParda;
    }

    /**
    * Define docExParda
    * @param docExParda docExParda
    * @generated
    */
    public CadastroIes2020 setDocExParda(java.lang.Short docExParda) {
        this.docExParda = docExParda;
        return this;
    }
    /**
    * Obtém docExPreta
    * return docExPreta
    * @generated
    */
    public java.lang.Short getDocExPreta() {
        return this.docExPreta;
    }

    /**
    * Define docExPreta
    * @param docExPreta docExPreta
    * @generated
    */
    public CadastroIes2020 setDocExPreta(java.lang.Short docExPreta) {
        this.docExPreta = docExPreta;
        return this;
    }
    /**
    * Obtém docExSemGrad
    * return docExSemGrad
    * @generated
    */
    public java.lang.Short getDocExSemGrad() {
        return this.docExSemGrad;
    }

    /**
    * Define docExSemGrad
    * @param docExSemGrad docExSemGrad
    * @generated
    */
    public CadastroIes2020 setDocExSemGrad(java.lang.Short docExSemGrad) {
        this.docExSemGrad = docExSemGrad;
        return this;
    }
    /**
    * Obtém dsComplementoEnderecoIes
    * return dsComplementoEnderecoIes
    * @generated
    */
    public java.lang.String getDsComplementoEnderecoIes() {
        return this.dsComplementoEnderecoIes;
    }

    /**
    * Define dsComplementoEnderecoIes
    * @param dsComplementoEnderecoIes dsComplementoEnderecoIes
    * @generated
    */
    public CadastroIes2020 setDsComplementoEnderecoIes(java.lang.String dsComplementoEnderecoIes) {
        this.dsComplementoEnderecoIes = dsComplementoEnderecoIes;
        return this;
    }
    /**
    * Obtém dsEnderecoIes
    * return dsEnderecoIes
    * @generated
    */
    public java.lang.String getDsEnderecoIes() {
        return this.dsEnderecoIes;
    }

    /**
    * Define dsEnderecoIes
    * @param dsEnderecoIes dsEnderecoIes
    * @generated
    */
    public CadastroIes2020 setDsEnderecoIes(java.lang.String dsEnderecoIes) {
        this.dsEnderecoIes = dsEnderecoIes;
        return this;
    }
    /**
    * Obtém dsNumeroEnderecoIes
    * return dsNumeroEnderecoIes
    * @generated
    */
    public java.lang.String getDsNumeroEnderecoIes() {
        return this.dsNumeroEnderecoIes;
    }

    /**
    * Define dsNumeroEnderecoIes
    * @param dsNumeroEnderecoIes dsNumeroEnderecoIes
    * @generated
    */
    public CadastroIes2020 setDsNumeroEnderecoIes(java.lang.String dsNumeroEnderecoIes) {
        this.dsNumeroEnderecoIes = dsNumeroEnderecoIes;
        return this;
    }
    /**
    * Obtém inAcessoOutrasBases
    * return inAcessoOutrasBases
    * @generated
    */
    public java.lang.Short getInAcessoOutrasBases() {
        return this.inAcessoOutrasBases;
    }

    /**
    * Define inAcessoOutrasBases
    * @param inAcessoOutrasBases inAcessoOutrasBases
    * @generated
    */
    public CadastroIes2020 setInAcessoOutrasBases(java.lang.Short inAcessoOutrasBases) {
        this.inAcessoOutrasBases = inAcessoOutrasBases;
        return this;
    }
    /**
    * Obtém inAcessoPortalCapes
    * return inAcessoPortalCapes
    * @generated
    */
    public java.lang.Short getInAcessoPortalCapes() {
        return this.inAcessoPortalCapes;
    }

    /**
    * Define inAcessoPortalCapes
    * @param inAcessoPortalCapes inAcessoPortalCapes
    * @generated
    */
    public CadastroIes2020 setInAcessoPortalCapes(java.lang.Short inAcessoPortalCapes) {
        this.inAcessoPortalCapes = inAcessoPortalCapes;
        return this;
    }
    /**
    * Obtém inAssinaOutraBase
    * return inAssinaOutraBase
    * @generated
    */
    public java.lang.Short getInAssinaOutraBase() {
        return this.inAssinaOutraBase;
    }

    /**
    * Define inAssinaOutraBase
    * @param inAssinaOutraBase inAssinaOutraBase
    * @generated
    */
    public CadastroIes2020 setInAssinaOutraBase(java.lang.Short inAssinaOutraBase) {
        this.inAssinaOutraBase = inAssinaOutraBase;
        return this;
    }
    /**
    * Obtém inBuscaIntegrada
    * return inBuscaIntegrada
    * @generated
    */
    public java.lang.Short getInBuscaIntegrada() {
        return this.inBuscaIntegrada;
    }

    /**
    * Define inBuscaIntegrada
    * @param inBuscaIntegrada inBuscaIntegrada
    * @generated
    */
    public CadastroIes2020 setInBuscaIntegrada(java.lang.Short inBuscaIntegrada) {
        this.inBuscaIntegrada = inBuscaIntegrada;
        return this;
    }
    /**
    * Obtém inCapitalIes
    * return inCapitalIes
    * @generated
    */
    public java.lang.Short getInCapitalIes() {
        return this.inCapitalIes;
    }

    /**
    * Define inCapitalIes
    * @param inCapitalIes inCapitalIes
    * @generated
    */
    public CadastroIes2020 setInCapitalIes(java.lang.Short inCapitalIes) {
        this.inCapitalIes = inCapitalIes;
        return this;
    }
    /**
    * Obtém inCatalogoOnline
    * return inCatalogoOnline
    * @generated
    */
    public java.lang.Short getInCatalogoOnline() {
        return this.inCatalogoOnline;
    }

    /**
    * Define inCatalogoOnline
    * @param inCatalogoOnline inCatalogoOnline
    * @generated
    */
    public CadastroIes2020 setInCatalogoOnline(java.lang.Short inCatalogoOnline) {
        this.inCatalogoOnline = inCatalogoOnline;
        return this;
    }
    /**
    * Obtém inParticipaRedeSocial
    * return inParticipaRedeSocial
    * @generated
    */
    public java.lang.Short getInParticipaRedeSocial() {
        return this.inParticipaRedeSocial;
    }

    /**
    * Define inParticipaRedeSocial
    * @param inParticipaRedeSocial inParticipaRedeSocial
    * @generated
    */
    public CadastroIes2020 setInParticipaRedeSocial(java.lang.Short inParticipaRedeSocial) {
        this.inParticipaRedeSocial = inParticipaRedeSocial;
        return this;
    }
    /**
    * Obtém inRepositorioInstitucional
    * return inRepositorioInstitucional
    * @generated
    */
    public java.lang.Short getInRepositorioInstitucional() {
        return this.inRepositorioInstitucional;
    }

    /**
    * Define inRepositorioInstitucional
    * @param inRepositorioInstitucional inRepositorioInstitucional
    * @generated
    */
    public CadastroIes2020 setInRepositorioInstitucional(java.lang.Short inRepositorioInstitucional) {
        this.inRepositorioInstitucional = inRepositorioInstitucional;
        return this;
    }
    /**
    * Obtém inServicoInternet
    * return inServicoInternet
    * @generated
    */
    public java.lang.Short getInServicoInternet() {
        return this.inServicoInternet;
    }

    /**
    * Define inServicoInternet
    * @param inServicoInternet inServicoInternet
    * @generated
    */
    public CadastroIes2020 setInServicoInternet(java.lang.Short inServicoInternet) {
        this.inServicoInternet = inServicoInternet;
        return this;
    }
    /**
    * Obtém noBairroIes
    * return noBairroIes
    * @generated
    */
    public java.lang.String getNoBairroIes() {
        return this.noBairroIes;
    }

    /**
    * Define noBairroIes
    * @param noBairroIes noBairroIes
    * @generated
    */
    public CadastroIes2020 setNoBairroIes(java.lang.String noBairroIes) {
        this.noBairroIes = noBairroIes;
        return this;
    }
    /**
    * Obtém noIes
    * return noIes
    * @generated
    */
    public java.lang.String getNoIes() {
        return this.noIes;
    }

    /**
    * Define noIes
    * @param noIes noIes
    * @generated
    */
    public CadastroIes2020 setNoIes(java.lang.String noIes) {
        this.noIes = noIes;
        return this;
    }
    /**
    * Obtém noMantenedora
    * return noMantenedora
    * @generated
    */
    public java.lang.String getNoMantenedora() {
        return this.noMantenedora;
    }

    /**
    * Define noMantenedora
    * @param noMantenedora noMantenedora
    * @generated
    */
    public CadastroIes2020 setNoMantenedora(java.lang.String noMantenedora) {
        this.noMantenedora = noMantenedora;
        return this;
    }
    /**
    * Obtém noMesorregiaoIes
    * return noMesorregiaoIes
    * @generated
    */
    public java.lang.String getNoMesorregiaoIes() {
        return this.noMesorregiaoIes;
    }

    /**
    * Define noMesorregiaoIes
    * @param noMesorregiaoIes noMesorregiaoIes
    * @generated
    */
    public CadastroIes2020 setNoMesorregiaoIes(java.lang.String noMesorregiaoIes) {
        this.noMesorregiaoIes = noMesorregiaoIes;
        return this;
    }
    /**
    * Obtém noMicrorregiaoIes
    * return noMicrorregiaoIes
    * @generated
    */
    public java.lang.String getNoMicrorregiaoIes() {
        return this.noMicrorregiaoIes;
    }

    /**
    * Define noMicrorregiaoIes
    * @param noMicrorregiaoIes noMicrorregiaoIes
    * @generated
    */
    public CadastroIes2020 setNoMicrorregiaoIes(java.lang.String noMicrorregiaoIes) {
        this.noMicrorregiaoIes = noMicrorregiaoIes;
        return this;
    }
    /**
    * Obtém noMunicipioIes
    * return noMunicipioIes
    * @generated
    */
    public java.lang.String getNoMunicipioIes() {
        return this.noMunicipioIes;
    }

    /**
    * Define noMunicipioIes
    * @param noMunicipioIes noMunicipioIes
    * @generated
    */
    public CadastroIes2020 setNoMunicipioIes(java.lang.String noMunicipioIes) {
        this.noMunicipioIes = noMunicipioIes;
        return this;
    }
    /**
    * Obtém noRegiaoIes
    * return noRegiaoIes
    * @generated
    */
    public java.lang.String getNoRegiaoIes() {
        return this.noRegiaoIes;
    }

    /**
    * Define noRegiaoIes
    * @param noRegiaoIes noRegiaoIes
    * @generated
    */
    public CadastroIes2020 setNoRegiaoIes(java.lang.String noRegiaoIes) {
        this.noRegiaoIes = noRegiaoIes;
        return this;
    }
    /**
    * Obtém noUfIes
    * return noUfIes
    * @generated
    */
    public java.lang.String getNoUfIes() {
        return this.noUfIes;
    }

    /**
    * Define noUfIes
    * @param noUfIes noUfIes
    * @generated
    */
    public CadastroIes2020 setNoUfIes(java.lang.String noUfIes) {
        this.noUfIes = noUfIes;
        return this;
    }
    /**
    * Obtém nuCepIes
    * return nuCepIes
    * @generated
    */
    public java.lang.String getNuCepIes() {
        return this.nuCepIes;
    }

    /**
    * Define nuCepIes
    * @param nuCepIes nuCepIes
    * @generated
    */
    public CadastroIes2020 setNuCepIes(java.lang.String nuCepIes) {
        this.nuCepIes = nuCepIes;
        return this;
    }
    /**
    * Obtém qtDocenteExe
    * return qtDocenteExe
    * @generated
    */
    public java.lang.Short getQtDocenteExe() {
        return this.qtDocenteExe;
    }

    /**
    * Define qtDocenteExe
    * @param qtDocenteExe qtDocenteExe
    * @generated
    */
    public CadastroIes2020 setQtDocenteExe(java.lang.Short qtDocenteExe) {
        this.qtDocenteExe = qtDocenteExe;
        return this;
    }
    /**
    * Obtém qtDocenteTotal
    * return qtDocenteTotal
    * @generated
    */
    public java.lang.Short getQtDocenteTotal() {
        return this.qtDocenteTotal;
    }

    /**
    * Define qtDocenteTotal
    * @param qtDocenteTotal qtDocenteTotal
    * @generated
    */
    public CadastroIes2020 setQtDocenteTotal(java.lang.Short qtDocenteTotal) {
        this.qtDocenteTotal = qtDocenteTotal;
        return this;
    }
    /**
    * Obtém qtLivroEletronico
    * return qtLivroEletronico
    * @generated
    */
    public java.lang.Integer getQtLivroEletronico() {
        return this.qtLivroEletronico;
    }

    /**
    * Define qtLivroEletronico
    * @param qtLivroEletronico qtLivroEletronico
    * @generated
    */
    public CadastroIes2020 setQtLivroEletronico(java.lang.Integer qtLivroEletronico) {
        this.qtLivroEletronico = qtLivroEletronico;
        return this;
    }
    /**
    * Obtém qtPeriodicoEletronico
    * return qtPeriodicoEletronico
    * @generated
    */
    public java.lang.Integer getQtPeriodicoEletronico() {
        return this.qtPeriodicoEletronico;
    }

    /**
    * Define qtPeriodicoEletronico
    * @param qtPeriodicoEletronico qtPeriodicoEletronico
    * @generated
    */
    public CadastroIes2020 setQtPeriodicoEletronico(java.lang.Integer qtPeriodicoEletronico) {
        this.qtPeriodicoEletronico = qtPeriodicoEletronico;
        return this;
    }
    /**
    * Obtém qtTecDoutoradoFem
    * return qtTecDoutoradoFem
    * @generated
    */
    public java.lang.Short getQtTecDoutoradoFem() {
        return this.qtTecDoutoradoFem;
    }

    /**
    * Define qtTecDoutoradoFem
    * @param qtTecDoutoradoFem qtTecDoutoradoFem
    * @generated
    */
    public CadastroIes2020 setQtTecDoutoradoFem(java.lang.Short qtTecDoutoradoFem) {
        this.qtTecDoutoradoFem = qtTecDoutoradoFem;
        return this;
    }
    /**
    * Obtém qtTecDoutoradoMasc
    * return qtTecDoutoradoMasc
    * @generated
    */
    public java.lang.Short getQtTecDoutoradoMasc() {
        return this.qtTecDoutoradoMasc;
    }

    /**
    * Define qtTecDoutoradoMasc
    * @param qtTecDoutoradoMasc qtTecDoutoradoMasc
    * @generated
    */
    public CadastroIes2020 setQtTecDoutoradoMasc(java.lang.Short qtTecDoutoradoMasc) {
        this.qtTecDoutoradoMasc = qtTecDoutoradoMasc;
        return this;
    }
    /**
    * Obtém qtTecEspecializacaoFem
    * return qtTecEspecializacaoFem
    * @generated
    */
    public java.lang.Short getQtTecEspecializacaoFem() {
        return this.qtTecEspecializacaoFem;
    }

    /**
    * Define qtTecEspecializacaoFem
    * @param qtTecEspecializacaoFem qtTecEspecializacaoFem
    * @generated
    */
    public CadastroIes2020 setQtTecEspecializacaoFem(java.lang.Short qtTecEspecializacaoFem) {
        this.qtTecEspecializacaoFem = qtTecEspecializacaoFem;
        return this;
    }
    /**
    * Obtém qtTecEspecializacaoMasc
    * return qtTecEspecializacaoMasc
    * @generated
    */
    public java.lang.Short getQtTecEspecializacaoMasc() {
        return this.qtTecEspecializacaoMasc;
    }

    /**
    * Define qtTecEspecializacaoMasc
    * @param qtTecEspecializacaoMasc qtTecEspecializacaoMasc
    * @generated
    */
    public CadastroIes2020 setQtTecEspecializacaoMasc(java.lang.Short qtTecEspecializacaoMasc) {
        this.qtTecEspecializacaoMasc = qtTecEspecializacaoMasc;
        return this;
    }
    /**
    * Obtém qtTecFundamentalCompFem
    * return qtTecFundamentalCompFem
    * @generated
    */
    public java.lang.Short getQtTecFundamentalCompFem() {
        return this.qtTecFundamentalCompFem;
    }

    /**
    * Define qtTecFundamentalCompFem
    * @param qtTecFundamentalCompFem qtTecFundamentalCompFem
    * @generated
    */
    public CadastroIes2020 setQtTecFundamentalCompFem(java.lang.Short qtTecFundamentalCompFem) {
        this.qtTecFundamentalCompFem = qtTecFundamentalCompFem;
        return this;
    }
    /**
    * Obtém qtTecFundamentalCompMasc
    * return qtTecFundamentalCompMasc
    * @generated
    */
    public java.lang.Short getQtTecFundamentalCompMasc() {
        return this.qtTecFundamentalCompMasc;
    }

    /**
    * Define qtTecFundamentalCompMasc
    * @param qtTecFundamentalCompMasc qtTecFundamentalCompMasc
    * @generated
    */
    public CadastroIes2020 setQtTecFundamentalCompMasc(java.lang.Short qtTecFundamentalCompMasc) {
        this.qtTecFundamentalCompMasc = qtTecFundamentalCompMasc;
        return this;
    }
    /**
    * Obtém qtTecFundamentalIncompFem
    * return qtTecFundamentalIncompFem
    * @generated
    */
    public java.lang.Integer getQtTecFundamentalIncompFem() {
        return this.qtTecFundamentalIncompFem;
    }

    /**
    * Define qtTecFundamentalIncompFem
    * @param qtTecFundamentalIncompFem qtTecFundamentalIncompFem
    * @generated
    */
    public CadastroIes2020 setQtTecFundamentalIncompFem(java.lang.Integer qtTecFundamentalIncompFem) {
        this.qtTecFundamentalIncompFem = qtTecFundamentalIncompFem;
        return this;
    }
    /**
    * Obtém qtTecFundamentalIncompMasc
    * return qtTecFundamentalIncompMasc
    * @generated
    */
    public java.lang.Short getQtTecFundamentalIncompMasc() {
        return this.qtTecFundamentalIncompMasc;
    }

    /**
    * Define qtTecFundamentalIncompMasc
    * @param qtTecFundamentalIncompMasc qtTecFundamentalIncompMasc
    * @generated
    */
    public CadastroIes2020 setQtTecFundamentalIncompMasc(java.lang.Short qtTecFundamentalIncompMasc) {
        this.qtTecFundamentalIncompMasc = qtTecFundamentalIncompMasc;
        return this;
    }
    /**
    * Obtém qtTecMedioFem
    * return qtTecMedioFem
    * @generated
    */
    public java.lang.Short getQtTecMedioFem() {
        return this.qtTecMedioFem;
    }

    /**
    * Define qtTecMedioFem
    * @param qtTecMedioFem qtTecMedioFem
    * @generated
    */
    public CadastroIes2020 setQtTecMedioFem(java.lang.Short qtTecMedioFem) {
        this.qtTecMedioFem = qtTecMedioFem;
        return this;
    }
    /**
    * Obtém qtTecMedioMasc
    * return qtTecMedioMasc
    * @generated
    */
    public java.lang.Short getQtTecMedioMasc() {
        return this.qtTecMedioMasc;
    }

    /**
    * Define qtTecMedioMasc
    * @param qtTecMedioMasc qtTecMedioMasc
    * @generated
    */
    public CadastroIes2020 setQtTecMedioMasc(java.lang.Short qtTecMedioMasc) {
        this.qtTecMedioMasc = qtTecMedioMasc;
        return this;
    }
    /**
    * Obtém qtTecMestradoFem
    * return qtTecMestradoFem
    * @generated
    */
    public java.lang.Short getQtTecMestradoFem() {
        return this.qtTecMestradoFem;
    }

    /**
    * Define qtTecMestradoFem
    * @param qtTecMestradoFem qtTecMestradoFem
    * @generated
    */
    public CadastroIes2020 setQtTecMestradoFem(java.lang.Short qtTecMestradoFem) {
        this.qtTecMestradoFem = qtTecMestradoFem;
        return this;
    }
    /**
    * Obtém qtTecMestradoMasc
    * return qtTecMestradoMasc
    * @generated
    */
    public java.lang.Short getQtTecMestradoMasc() {
        return this.qtTecMestradoMasc;
    }

    /**
    * Define qtTecMestradoMasc
    * @param qtTecMestradoMasc qtTecMestradoMasc
    * @generated
    */
    public CadastroIes2020 setQtTecMestradoMasc(java.lang.Short qtTecMestradoMasc) {
        this.qtTecMestradoMasc = qtTecMestradoMasc;
        return this;
    }
    /**
    * Obtém qtTecSuperiorFem
    * return qtTecSuperiorFem
    * @generated
    */
    public java.lang.Short getQtTecSuperiorFem() {
        return this.qtTecSuperiorFem;
    }

    /**
    * Define qtTecSuperiorFem
    * @param qtTecSuperiorFem qtTecSuperiorFem
    * @generated
    */
    public CadastroIes2020 setQtTecSuperiorFem(java.lang.Short qtTecSuperiorFem) {
        this.qtTecSuperiorFem = qtTecSuperiorFem;
        return this;
    }
    /**
    * Obtém qtTecSuperiorMasc
    * return qtTecSuperiorMasc
    * @generated
    */
    public java.lang.Short getQtTecSuperiorMasc() {
        return this.qtTecSuperiorMasc;
    }

    /**
    * Define qtTecSuperiorMasc
    * @param qtTecSuperiorMasc qtTecSuperiorMasc
    * @generated
    */
    public CadastroIes2020 setQtTecSuperiorMasc(java.lang.Short qtTecSuperiorMasc) {
        this.qtTecSuperiorMasc = qtTecSuperiorMasc;
        return this;
    }
    /**
    * Obtém qtTecTotal
    * return qtTecTotal
    * @generated
    */
    public java.lang.Integer getQtTecTotal() {
        return this.qtTecTotal;
    }

    /**
    * Define qtTecTotal
    * @param qtTecTotal qtTecTotal
    * @generated
    */
    public CadastroIes2020 setQtTecTotal(java.lang.Integer qtTecTotal) {
        this.qtTecTotal = qtTecTotal;
        return this;
    }
    /**
    * Obtém sgIes
    * return sgIes
    * @generated
    */
    public java.lang.String getSgIes() {
        return this.sgIes;
    }

    /**
    * Define sgIes
    * @param sgIes sgIes
    * @generated
    */
    public CadastroIes2020 setSgIes(java.lang.String sgIes) {
        this.sgIes = sgIes;
        return this;
    }
    /**
    * Obtém sgUfIes
    * return sgUfIes
    * @generated
    */
    public java.lang.String getSgUfIes() {
        return this.sgUfIes;
    }

    /**
    * Define sgUfIes
    * @param sgUfIes sgUfIes
    * @generated
    */
    public CadastroIes2020 setSgUfIes(java.lang.String sgUfIes) {
        this.sgUfIes = sgUfIes;
        return this;
    }
    /**
    * Obtém tpCategoriaAdministrativa
    * return tpCategoriaAdministrativa
    * @generated
    */
    public java.lang.Short getTpCategoriaAdministrativa() {
        return this.tpCategoriaAdministrativa;
    }

    /**
    * Define tpCategoriaAdministrativa
    * @param tpCategoriaAdministrativa tpCategoriaAdministrativa
    * @generated
    */
    public CadastroIes2020 setTpCategoriaAdministrativa(java.lang.Short tpCategoriaAdministrativa) {
        this.tpCategoriaAdministrativa = tpCategoriaAdministrativa;
        return this;
    }
    /**
    * Obtém tpOrganizacaoAcademica
    * return tpOrganizacaoAcademica
    * @generated
    */
    public java.lang.Short getTpOrganizacaoAcademica() {
        return this.tpOrganizacaoAcademica;
    }

    /**
    * Define tpOrganizacaoAcademica
    * @param tpOrganizacaoAcademica tpOrganizacaoAcademica
    * @generated
    */
    public CadastroIes2020 setTpOrganizacaoAcademica(java.lang.Short tpOrganizacaoAcademica) {
        this.tpOrganizacaoAcademica = tpOrganizacaoAcademica;
        return this;
    }
    /**
    * Obtém noSgIes
    * return noSgIes
    * @generated
    */
    public java.lang.String getNoSgIes() {
        return this.noSgIes;
    }

    /**
    * Define noSgIes
    * @param noSgIes noSgIes
    * @generated
    */
    public CadastroIes2020 setNoSgIes(java.lang.String noSgIes) {
        this.noSgIes = noSgIes;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
CadastroIes2020 object = (CadastroIes2020)obj;
        if (nuAnoCenso != null ? !nuAnoCenso.equals(object.nuAnoCenso) : object.nuAnoCenso != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((nuAnoCenso == null) ? 0 : nuAnoCenso.hashCode());
        return result;
    }

}