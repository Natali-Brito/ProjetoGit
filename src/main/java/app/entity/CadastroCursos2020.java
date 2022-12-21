
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
* Classe que representa a tabela CADASTRO_CURSOS_2020
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CADASTRO_CURSOS_2020\"", schema="\"dbo\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.CadastroCursos2020")
public class CadastroCursos2020 implements Serializable {
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
    @Column(name = "ALUNO_DEFICIENTE", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short alunoDeficiente;


    /**
    * @generated
    */
    @Column(name = "ALUNO_PARFOR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short alunoParfor;


    /**
    * @generated
    */
    @Column(name = "APOIO_SOCIAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short apoioSocial;


    /**
    * @generated
    */
    @Column(name = "ATIV_EXTRACURRICULAR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ativExtracurricular;


    /**
    * @generated
    */
    @Column(name = "CO_CINE_AREA_DETALHADA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short coCineAreaDetalhada;


    /**
    * @generated
    */
    @Column(name = "CO_CINE_AREA_ESPECIFICA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short coCineAreaEspecifica;


    /**
    * @generated
    */
    @Column(name = "CO_CINE_AREA_GERAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short coCineAreaGeral;


    /**
    * @generated
    */
    @Column(name = "CO_CINE_ROTULO", nullable = true, unique = false, length=7, insertable=true, updatable=true)
        
        private java.lang.String coCineRotulo;


    /**
    * @generated
    */
    @Column(name = "CO_IES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short coIes;


    /**
    * @generated
    */
    @Column(name = "CO_MUNICIPIO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer coMunicipio;


    /**
    * @generated
    */
    @Column(name = "CO_REGIAO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short coRegiao;


    /**
    * @generated
    */
    @Column(name = "CO_UF", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short coUf;


    /**
    * @generated
    */
    @Column(name = "CONC_0_17", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short conc017;


    /**
    * @generated
    */
    @Column(name = "CONC_18_24", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short conc1824;


    /**
    * @generated
    */
    @Column(name = "CONC_25_29", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short conc2529;


    /**
    * @generated
    */
    @Column(name = "CONC_30_34", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short conc3034;


    /**
    * @generated
    */
    @Column(name = "CONC_35_39", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short conc3539;


    /**
    * @generated
    */
    @Column(name = "CONC_40_49", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short conc4049;


    /**
    * @generated
    */
    @Column(name = "CONC_50_59", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short conc5059;


    /**
    * @generated
    */
    @Column(name = "CONC_60_MAIS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short conc60Mais;


    /**
    * @generated
    */
    @Column(name = "CONC_ALUNO_DEFICIENTE", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concAlunoDeficiente;


    /**
    * @generated
    */
    @Column(name = "CONC_ALUNO_PARFOR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concAlunoParfor;


    /**
    * @generated
    */
    @Column(name = "CONC_AMARELA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concAmarela;


    /**
    * @generated
    */
    @Column(name = "CONC_APOIO_SOCIAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concApoioSocial;


    /**
    * @generated
    */
    @Column(name = "CONC_ATIV_EXTRACURRICULAR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concAtivExtracurricular;


    /**
    * @generated
    */
    @Column(name = "CONC_BRANCA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concBranca;


    /**
    * @generated
    */
    @Column(name = "CONC_CORND", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concCornd;


    /**
    * @generated
    */
    @Column(name = "CONC_DIURNO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concDiurno;


    /**
    * @generated
    */
    @Column(name = "CONC_FEM", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concFem;


    /**
    * @generated
    */
    @Column(name = "CONC_FIES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concFies;


    /**
    * @generated
    */
    @Column(name = "CONC_FINANC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concFinanc;


    /**
    * @generated
    */
    @Column(name = "CONC_FINANC_NREEMB", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concFinancNreemb;


    /**
    * @generated
    */
    @Column(name = "CONC_FINANC_NREEMB_OUTROS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concFinancNreembOutros;


    /**
    * @generated
    */
    @Column(name = "CONC_FINANC_REEMB", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concFinancReemb;


    /**
    * @generated
    */
    @Column(name = "CONC_FINANC_REEMB_OUTROS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concFinancReembOutros;


    /**
    * @generated
    */
    @Column(name = "CONC_INDIGENA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concIndigena;


    /**
    * @generated
    */
    @Column(name = "CONC_MASC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concMasc;


    /**
    * @generated
    */
    @Column(name = "CONC_MOB_ACADEMICA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concMobAcademica;


    /**
    * @generated
    */
    @Column(name = "CONC_NACBRAS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concNacbras;


    /**
    * @generated
    */
    @Column(name = "CONC_NACESTRANG", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concNacestrang;


    /**
    * @generated
    */
    @Column(name = "CONC_NOTURNO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concNoturno;


    /**
    * @generated
    */
    @Column(name = "CONC_NRPFIES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concNrpfies;


    /**
    * @generated
    */
    @Column(name = "CONC_PARDA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concParda;


    /**
    * @generated
    */
    @Column(name = "CONC_PRETA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concPreta;


    /**
    * @generated
    */
    @Column(name = "CONC_PROCESCPRIVADA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concProcescprivada;


    /**
    * @generated
    */
    @Column(name = "CONC_PROCESCPUBLICA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concProcescpublica;


    /**
    * @generated
    */
    @Column(name = "CONC_PROCNAOINFORMADA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concProcnaoinformada;


    /**
    * @generated
    */
    @Column(name = "CONC_PROUNII", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concProunii;


    /**
    * @generated
    */
    @Column(name = "CONC_PROUNIP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concProunip;


    /**
    * @generated
    */
    @Column(name = "CONC_RESERVA_VAGA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concReservaVaga;


    /**
    * @generated
    */
    @Column(name = "CONC_RPFIES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concRpfies;


    /**
    * @generated
    */
    @Column(name = "CONC_RVETINICO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concRvetinico;


    /**
    * @generated
    */
    @Column(name = "CONC_RVOUTROS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concRvoutros;


    /**
    * @generated
    */
    @Column(name = "CONC_RVPDEF", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concRvpdef;


    /**
    * @generated
    */
    @Column(name = "CONC_RVREDEPUBLICA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concRvredepublica;


    /**
    * @generated
    */
    @Column(name = "CONC_RVSOCIAL_RF", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short concRvsocialRf;


    /**
    * @generated
    */
    @Column(name = "IN_CAPITAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short inCapital;


    /**
    * @generated
    */
    @Column(name = "ING_0_17", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ing017;


    /**
    * @generated
    */
    @Column(name = "ING_18_24", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ing1824;


    /**
    * @generated
    */
    @Column(name = "ING_25_29", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ing2529;


    /**
    * @generated
    */
    @Column(name = "ING_30_34", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ing3034;


    /**
    * @generated
    */
    @Column(name = "ING_35_39", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ing3539;


    /**
    * @generated
    */
    @Column(name = "ING_40_49", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ing4049;


    /**
    * @generated
    */
    @Column(name = "ING_50_59", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ing5059;


    /**
    * @generated
    */
    @Column(name = "ING_ALUNO_DEFICIENTE", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingAlunoDeficiente;


    /**
    * @generated
    */
    @Column(name = "ING_ALUNO_PARFOR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingAlunoParfor;


    /**
    * @generated
    */
    @Column(name = "ING_AMARELA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingAmarela;


    /**
    * @generated
    */
    @Column(name = "ING_APOIO_SOCIAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingApoioSocial;


    /**
    * @generated
    */
    @Column(name = "ING_ATIV_EXTRACURRICULAR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingAtivExtracurricular;


    /**
    * @generated
    */
    @Column(name = "ING_AVALIACAO_SERIADA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingAvaliacaoSeriada;


    /**
    * @generated
    */
    @Column(name = "ING_BRANCA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingBranca;


    /**
    * @generated
    */
    @Column(name = "ING_CORND", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingCornd;


    /**
    * @generated
    */
    @Column(name = "ING_DIURNO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingDiurno;


    /**
    * @generated
    */
    @Column(name = "ING_EGR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingEgr;


    /**
    * @generated
    */
    @Column(name = "ING_ENEM", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingEnem;


    /**
    * @generated
    */
    @Column(name = "ING_FEM", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingFem;


    /**
    * @generated
    */
    @Column(name = "ING_FIES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingFies;


    /**
    * @generated
    */
    @Column(name = "ING_FINANC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingFinanc;


    /**
    * @generated
    */
    @Column(name = "ING_FINANC_NREEMB", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingFinancNreemb;


    /**
    * @generated
    */
    @Column(name = "ING_FINANC_NREEMB_OUTROS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingFinancNreembOutros;


    /**
    * @generated
    */
    @Column(name = "ING_FINANC_REEMB", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingFinancReemb;


    /**
    * @generated
    */
    @Column(name = "ING_FINANC_REEMB_OUTROS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingFinancReembOutros;


    /**
    * @generated
    */
    @Column(name = "ING_INDIGENA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingIndigena;


    /**
    * @generated
    */
    @Column(name = "ING_MASC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingMasc;


    /**
    * @generated
    */
    @Column(name = "ING_MOB_ACADEMICA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingMobAcademica;


    /**
    * @generated
    */
    @Column(name = "ING_NACBRAS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingNacbras;


    /**
    * @generated
    */
    @Column(name = "ING_NACESTRANG", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingNacestrang;


    /**
    * @generated
    */
    @Column(name = "ING_NOTURNO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingNoturno;


    /**
    * @generated
    */
    @Column(name = "ING_NRPFIES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingNrpfies;


    /**
    * @generated
    */
    @Column(name = "ING_OUTRA_FORMA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingOutraForma;


    /**
    * @generated
    */
    @Column(name = "ING_PARDA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingParda;


    /**
    * @generated
    */
    @Column(name = "ING_PRETA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingPreta;


    /**
    * @generated
    */
    @Column(name = "ING_PROCESCPRIVADA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingProcescprivada;


    /**
    * @generated
    */
    @Column(name = "ING_PROCESCPUBLICA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingProcescpublica;


    /**
    * @generated
    */
    @Column(name = "ING_PROCNAOINFORMADA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingProcnaoinformada;


    /**
    * @generated
    */
    @Column(name = "ING_PROUNII", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingProunii;


    /**
    * @generated
    */
    @Column(name = "ING_PROUNIP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingProunip;


    /**
    * @generated
    */
    @Column(name = "ING_RESERVA_VAGA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingReservaVaga;


    /**
    * @generated
    */
    @Column(name = "ING_RPFIES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingRpfies;


    /**
    * @generated
    */
    @Column(name = "ING_RVETINICO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingRvetinico;


    /**
    * @generated
    */
    @Column(name = "ING_RVOUTROS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingRvoutros;


    /**
    * @generated
    */
    @Column(name = "ING_RVPDEF", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingRvpdef;


    /**
    * @generated
    */
    @Column(name = "ING_RVREDEPUBLICA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingRvredepublica;


    /**
    * @generated
    */
    @Column(name = "ING_RVSOCIAL_RF", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingRvsocialRf;


    /**
    * @generated
    */
    @Column(name = "ING_SELECAO_SIMPLIFICA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingSelecaoSimplifica;


    /**
    * @generated
    */
    @Column(name = "ING_VESTIBULAR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingVestibular;


    /**
    * @generated
    */
    @Column(name = "ING_VG_NOVA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingVgNova;


    /**
    * @generated
    */
    @Column(name = "ING_VG_PROG_ESPECIAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingVgProgEspecial;


    /**
    * @generated
    */
    @Column(name = "ING_VG_REMANESC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short ingVgRemanesc;


    /**
    * @generated
    */
    @Column(name = "MAT_0_17", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short mat017;


    /**
    * @generated
    */
    @Column(name = "MAT_18_24", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short mat1824;


    /**
    * @generated
    */
    @Column(name = "MAT_25_29", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short mat2529;


    /**
    * @generated
    */
    @Column(name = "MAT_30_34", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short mat3034;


    /**
    * @generated
    */
    @Column(name = "MAT_35_39", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short mat3539;


    /**
    * @generated
    */
    @Column(name = "MAT_40_49", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short mat4049;


    /**
    * @generated
    */
    @Column(name = "MAT_50_59", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short mat5059;


    /**
    * @generated
    */
    @Column(name = "MAT_60_MAIS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short mat60Mais;


    /**
    * @generated
    */
    @Column(name = "MAT_ALUNO_DEFICIENTE", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matAlunoDeficiente;


    /**
    * @generated
    */
    @Column(name = "MAT_ALUNO_PARFOR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matAlunoParfor;


    /**
    * @generated
    */
    @Column(name = "MAT_AMARELA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matAmarela;


    /**
    * @generated
    */
    @Column(name = "MAT_APOIO_SOCIAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matApoioSocial;


    /**
    * @generated
    */
    @Column(name = "MAT_ATIV_EXTRACURRICULAR", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matAtivExtracurricular;


    /**
    * @generated
    */
    @Column(name = "MAT_BRANCA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matBranca;


    /**
    * @generated
    */
    @Column(name = "MAT_CORND", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matCornd;


    /**
    * @generated
    */
    @Column(name = "MAT_FIES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matFies;


    /**
    * @generated
    */
    @Column(name = "MAT_FINANC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matFinanc;


    /**
    * @generated
    */
    @Column(name = "MAT_FINANC_NREEMB", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matFinancNreemb;


    /**
    * @generated
    */
    @Column(name = "MAT_FINANC_NREEMB_OUTROS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matFinancNreembOutros;


    /**
    * @generated
    */
    @Column(name = "MAT_FINANC_REEMB", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matFinancReemb;


    /**
    * @generated
    */
    @Column(name = "MAT_FINANC_REEMB_OUTROS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matFinancReembOutros;


    /**
    * @generated
    */
    @Column(name = "MAT_INDIGENA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matIndigena;


    /**
    * @generated
    */
    @Column(name = "MAT_MOB_ACADEMICA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matMobAcademica;


    /**
    * @generated
    */
    @Column(name = "MAT_NACBRAS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matNacbras;


    /**
    * @generated
    */
    @Column(name = "MAT_NACESTRANG", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matNacestrang;


    /**
    * @generated
    */
    @Column(name = "MAT_NRPFIES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matNrpfies;


    /**
    * @generated
    */
    @Column(name = "MAT_PARDA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matParda;


    /**
    * @generated
    */
    @Column(name = "MAT_PRETA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matPreta;


    /**
    * @generated
    */
    @Column(name = "MAT_PROCESCPRIVADA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matProcescprivada;


    /**
    * @generated
    */
    @Column(name = "MAT_PROCESCPUBLICA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matProcescpublica;


    /**
    * @generated
    */
    @Column(name = "MAT_PROCNAOINFORMADA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matProcnaoinformada;


    /**
    * @generated
    */
    @Column(name = "MAT_PROUNII", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matProunii;


    /**
    * @generated
    */
    @Column(name = "MAT_PROUNIP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matProunip;


    /**
    * @generated
    */
    @Column(name = "MAT_RESERVA_VAGA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matReservaVaga;


    /**
    * @generated
    */
    @Column(name = "MAT_RPFIES", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matRpfies;


    /**
    * @generated
    */
    @Column(name = "MAT_RVETINICO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matRvetinico;


    /**
    * @generated
    */
    @Column(name = "MAT_RVOUTROS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matRvoutros;


    /**
    * @generated
    */
    @Column(name = "MAT_RVPDEF", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matRvpdef;


    /**
    * @generated
    */
    @Column(name = "MAT_RVREDEPUBLICA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matRvredepublica;


    /**
    * @generated
    */
    @Column(name = "MAT_RVSOCIAL_RF", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short matRvsocialRf;


    /**
    * @generated
    */
    @Column(name = "MOB_ACADEMICA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short mobAcademica;


    /**
    * @generated
    */
    @Column(name = "NO_CINE_AREA_DETALHADA", nullable = true, unique = false, length=98, insertable=true, updatable=true)
        
        private java.lang.String noCineAreaDetalhada;


    /**
    * @generated
    */
    @Column(name = "NO_CINE_AREA_ESPECIFICA", nullable = true, unique = false, length=98, insertable=true, updatable=true)
        
        private java.lang.String noCineAreaEspecifica;


    /**
    * @generated
    */
    @Column(name = "NO_CINE_AREA_GERAL", nullable = true, unique = false, length=58, insertable=true, updatable=true)
        
        private java.lang.String noCineAreaGeral;


    /**
    * @generated
    */
    @Column(name = "NO_CINE_ROTULO", nullable = true, unique = false, length=98, insertable=true, updatable=true)
        
        private java.lang.String noCineRotulo;


    /**
    * @generated
    */
    @Column(name = "NO_MUNICIPIO", nullable = true, unique = false, length=29, insertable=true, updatable=true)
        
        private java.lang.String noMunicipio;


    /**
    * @generated
    */
    @Column(name = "NO_REGIAO", nullable = true, unique = false, length=12, insertable=true, updatable=true)
        
        private java.lang.String noRegiao;


    /**
    * @generated
    */
    @Column(name = "NO_UF", nullable = true, unique = false, length=19, insertable=true, updatable=true)
        
        private java.lang.String noUf;


    /**
    * @generated
    */
    @Column(name = "QT_CONC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtConc;


    /**
    * @generated
    */
    @Column(name = "QT_CURSO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtCurso;


    /**
    * @generated
    */
    @Column(name = "QT_ING", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtIng;


    /**
    * @generated
    */
    @Column(name = "QT_ING_60_MAIS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtIng60Mais;


    /**
    * @generated
    */
    @Column(name = "QT_INSC_VG_NOVA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtInscVgNova;


    /**
    * @generated
    */
    @Column(name = "QT_INSC_VG_PROG_ESPECIAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtInscVgProgEspecial;


    /**
    * @generated
    */
    @Column(name = "QT_INSC_VG_REMANESC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtInscVgRemanesc;


    /**
    * @generated
    */
    @Column(name = "QT_INSCRITO_TOTAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtInscritoTotal;


    /**
    * @generated
    */
    @Column(name = "QT_INSCRITO_TOTAL_DIURNO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtInscritoTotalDiurno;


    /**
    * @generated
    */
    @Column(name = "QT_INSCRITO_TOTAL_EAD", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtInscritoTotalEad;


    /**
    * @generated
    */
    @Column(name = "QT_INSCRITO_TOTAL_NOTURNO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtInscritoTotalNoturno;


    /**
    * @generated
    */
    @Column(name = "QT_MAT", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtMat;


    /**
    * @generated
    */
    @Column(name = "QT_MAT_DIURNO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtMatDiurno;


    /**
    * @generated
    */
    @Column(name = "QT_MAT_FEM", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtMatFem;


    /**
    * @generated
    */
    @Column(name = "QT_MAT_MASC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtMatMasc;


    /**
    * @generated
    */
    @Column(name = "QT_MAT_NOTURNO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtMatNoturno;


    /**
    * @generated
    */
    @Column(name = "QT_VAGA_TOTAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtVagaTotal;


    /**
    * @generated
    */
    @Column(name = "QT_VAGA_TOTAL_DIURNO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtVagaTotalDiurno;


    /**
    * @generated
    */
    @Column(name = "QT_VAGA_TOTAL_EAD", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtVagaTotalEad;


    /**
    * @generated
    */
    @Column(name = "QT_VAGA_TOTAL_NOTURNO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtVagaTotalNoturno;


    /**
    * @generated
    */
    @Column(name = "QT_VG_NOVA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtVgNova;


    /**
    * @generated
    */
    @Column(name = "QT_VG_PROG_ESPECIAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short qtVgProgEspecial;


    /**
    * @generated
    */
    @Column(name = "QT_VG_REMANESC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtVgRemanesc;


    /**
    * @generated
    */
    @Column(name = "SG_UF", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String sgUf;


    /**
    * @generated
    */
    @Column(name = "SIT_DESVINCULADO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short sitDesvinculado;


    /**
    * @generated
    */
    @Column(name = "SIT_FALECIDO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short sitFalecido;


    /**
    * @generated
    */
    @Column(name = "SIT_TRANCADA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short sitTrancada;


    /**
    * @generated
    */
    @Column(name = "SIT_TRANSFERIDO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short sitTransferido;


    /**
    * @generated
    */
    @Column(name = "TP_CATEGORIA_ADMINISTRATIVA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short tpCategoriaAdministrativa;


    /**
    * @generated
    */
    @Column(name = "TP_GRAU_ACADEMICO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short tpGrauAcademico;


    /**
    * @generated
    */
    @Column(name = "TP_MODALIDADE_ENSINO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short tpModalidadeEnsino;


    /**
    * @generated
    */
    @Column(name = "TP_NIVEL_ACADEMICO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short tpNivelAcademico;


    /**
    * @generated
    */
    @Column(name = "TP_ORGANIZACAO_ACADEMICA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short tpOrganizacaoAcademica;


    /**
    * @generated
    */
    @Column(name = "TP_REDE", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short tpRede;


    /**
    * Construtor
    * @generated
    */
    public CadastroCursos2020(){
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
    public CadastroCursos2020 setNuAnoCenso(java.lang.Short nuAnoCenso) {
        this.nuAnoCenso = nuAnoCenso;
        return this;
    }
    /**
    * Obtém alunoDeficiente
    * return alunoDeficiente
    * @generated
    */
    public java.lang.Short getAlunoDeficiente() {
        return this.alunoDeficiente;
    }

    /**
    * Define alunoDeficiente
    * @param alunoDeficiente alunoDeficiente
    * @generated
    */
    public CadastroCursos2020 setAlunoDeficiente(java.lang.Short alunoDeficiente) {
        this.alunoDeficiente = alunoDeficiente;
        return this;
    }
    /**
    * Obtém alunoParfor
    * return alunoParfor
    * @generated
    */
    public java.lang.Short getAlunoParfor() {
        return this.alunoParfor;
    }

    /**
    * Define alunoParfor
    * @param alunoParfor alunoParfor
    * @generated
    */
    public CadastroCursos2020 setAlunoParfor(java.lang.Short alunoParfor) {
        this.alunoParfor = alunoParfor;
        return this;
    }
    /**
    * Obtém apoioSocial
    * return apoioSocial
    * @generated
    */
    public java.lang.Short getApoioSocial() {
        return this.apoioSocial;
    }

    /**
    * Define apoioSocial
    * @param apoioSocial apoioSocial
    * @generated
    */
    public CadastroCursos2020 setApoioSocial(java.lang.Short apoioSocial) {
        this.apoioSocial = apoioSocial;
        return this;
    }
    /**
    * Obtém ativExtracurricular
    * return ativExtracurricular
    * @generated
    */
    public java.lang.Short getAtivExtracurricular() {
        return this.ativExtracurricular;
    }

    /**
    * Define ativExtracurricular
    * @param ativExtracurricular ativExtracurricular
    * @generated
    */
    public CadastroCursos2020 setAtivExtracurricular(java.lang.Short ativExtracurricular) {
        this.ativExtracurricular = ativExtracurricular;
        return this;
    }
    /**
    * Obtém coCineAreaDetalhada
    * return coCineAreaDetalhada
    * @generated
    */
    public java.lang.Short getCoCineAreaDetalhada() {
        return this.coCineAreaDetalhada;
    }

    /**
    * Define coCineAreaDetalhada
    * @param coCineAreaDetalhada coCineAreaDetalhada
    * @generated
    */
    public CadastroCursos2020 setCoCineAreaDetalhada(java.lang.Short coCineAreaDetalhada) {
        this.coCineAreaDetalhada = coCineAreaDetalhada;
        return this;
    }
    /**
    * Obtém coCineAreaEspecifica
    * return coCineAreaEspecifica
    * @generated
    */
    public java.lang.Short getCoCineAreaEspecifica() {
        return this.coCineAreaEspecifica;
    }

    /**
    * Define coCineAreaEspecifica
    * @param coCineAreaEspecifica coCineAreaEspecifica
    * @generated
    */
    public CadastroCursos2020 setCoCineAreaEspecifica(java.lang.Short coCineAreaEspecifica) {
        this.coCineAreaEspecifica = coCineAreaEspecifica;
        return this;
    }
    /**
    * Obtém coCineAreaGeral
    * return coCineAreaGeral
    * @generated
    */
    public java.lang.Short getCoCineAreaGeral() {
        return this.coCineAreaGeral;
    }

    /**
    * Define coCineAreaGeral
    * @param coCineAreaGeral coCineAreaGeral
    * @generated
    */
    public CadastroCursos2020 setCoCineAreaGeral(java.lang.Short coCineAreaGeral) {
        this.coCineAreaGeral = coCineAreaGeral;
        return this;
    }
    /**
    * Obtém coCineRotulo
    * return coCineRotulo
    * @generated
    */
    public java.lang.String getCoCineRotulo() {
        return this.coCineRotulo;
    }

    /**
    * Define coCineRotulo
    * @param coCineRotulo coCineRotulo
    * @generated
    */
    public CadastroCursos2020 setCoCineRotulo(java.lang.String coCineRotulo) {
        this.coCineRotulo = coCineRotulo;
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
    public CadastroCursos2020 setCoIes(java.lang.Short coIes) {
        this.coIes = coIes;
        return this;
    }
    /**
    * Obtém coMunicipio
    * return coMunicipio
    * @generated
    */
    public java.lang.Integer getCoMunicipio() {
        return this.coMunicipio;
    }

    /**
    * Define coMunicipio
    * @param coMunicipio coMunicipio
    * @generated
    */
    public CadastroCursos2020 setCoMunicipio(java.lang.Integer coMunicipio) {
        this.coMunicipio = coMunicipio;
        return this;
    }
    /**
    * Obtém coRegiao
    * return coRegiao
    * @generated
    */
    public java.lang.Short getCoRegiao() {
        return this.coRegiao;
    }

    /**
    * Define coRegiao
    * @param coRegiao coRegiao
    * @generated
    */
    public CadastroCursos2020 setCoRegiao(java.lang.Short coRegiao) {
        this.coRegiao = coRegiao;
        return this;
    }
    /**
    * Obtém coUf
    * return coUf
    * @generated
    */
    public java.lang.Short getCoUf() {
        return this.coUf;
    }

    /**
    * Define coUf
    * @param coUf coUf
    * @generated
    */
    public CadastroCursos2020 setCoUf(java.lang.Short coUf) {
        this.coUf = coUf;
        return this;
    }
    /**
    * Obtém conc017
    * return conc017
    * @generated
    */
    public java.lang.Short getConc017() {
        return this.conc017;
    }

    /**
    * Define conc017
    * @param conc017 conc017
    * @generated
    */
    public CadastroCursos2020 setConc017(java.lang.Short conc017) {
        this.conc017 = conc017;
        return this;
    }
    /**
    * Obtém conc1824
    * return conc1824
    * @generated
    */
    public java.lang.Short getConc1824() {
        return this.conc1824;
    }

    /**
    * Define conc1824
    * @param conc1824 conc1824
    * @generated
    */
    public CadastroCursos2020 setConc1824(java.lang.Short conc1824) {
        this.conc1824 = conc1824;
        return this;
    }
    /**
    * Obtém conc2529
    * return conc2529
    * @generated
    */
    public java.lang.Short getConc2529() {
        return this.conc2529;
    }

    /**
    * Define conc2529
    * @param conc2529 conc2529
    * @generated
    */
    public CadastroCursos2020 setConc2529(java.lang.Short conc2529) {
        this.conc2529 = conc2529;
        return this;
    }
    /**
    * Obtém conc3034
    * return conc3034
    * @generated
    */
    public java.lang.Short getConc3034() {
        return this.conc3034;
    }

    /**
    * Define conc3034
    * @param conc3034 conc3034
    * @generated
    */
    public CadastroCursos2020 setConc3034(java.lang.Short conc3034) {
        this.conc3034 = conc3034;
        return this;
    }
    /**
    * Obtém conc3539
    * return conc3539
    * @generated
    */
    public java.lang.Short getConc3539() {
        return this.conc3539;
    }

    /**
    * Define conc3539
    * @param conc3539 conc3539
    * @generated
    */
    public CadastroCursos2020 setConc3539(java.lang.Short conc3539) {
        this.conc3539 = conc3539;
        return this;
    }
    /**
    * Obtém conc4049
    * return conc4049
    * @generated
    */
    public java.lang.Short getConc4049() {
        return this.conc4049;
    }

    /**
    * Define conc4049
    * @param conc4049 conc4049
    * @generated
    */
    public CadastroCursos2020 setConc4049(java.lang.Short conc4049) {
        this.conc4049 = conc4049;
        return this;
    }
    /**
    * Obtém conc5059
    * return conc5059
    * @generated
    */
    public java.lang.Short getConc5059() {
        return this.conc5059;
    }

    /**
    * Define conc5059
    * @param conc5059 conc5059
    * @generated
    */
    public CadastroCursos2020 setConc5059(java.lang.Short conc5059) {
        this.conc5059 = conc5059;
        return this;
    }
    /**
    * Obtém conc60Mais
    * return conc60Mais
    * @generated
    */
    public java.lang.Short getConc60Mais() {
        return this.conc60Mais;
    }

    /**
    * Define conc60Mais
    * @param conc60Mais conc60Mais
    * @generated
    */
    public CadastroCursos2020 setConc60Mais(java.lang.Short conc60Mais) {
        this.conc60Mais = conc60Mais;
        return this;
    }
    /**
    * Obtém concAlunoDeficiente
    * return concAlunoDeficiente
    * @generated
    */
    public java.lang.Short getConcAlunoDeficiente() {
        return this.concAlunoDeficiente;
    }

    /**
    * Define concAlunoDeficiente
    * @param concAlunoDeficiente concAlunoDeficiente
    * @generated
    */
    public CadastroCursos2020 setConcAlunoDeficiente(java.lang.Short concAlunoDeficiente) {
        this.concAlunoDeficiente = concAlunoDeficiente;
        return this;
    }
    /**
    * Obtém concAlunoParfor
    * return concAlunoParfor
    * @generated
    */
    public java.lang.Short getConcAlunoParfor() {
        return this.concAlunoParfor;
    }

    /**
    * Define concAlunoParfor
    * @param concAlunoParfor concAlunoParfor
    * @generated
    */
    public CadastroCursos2020 setConcAlunoParfor(java.lang.Short concAlunoParfor) {
        this.concAlunoParfor = concAlunoParfor;
        return this;
    }
    /**
    * Obtém concAmarela
    * return concAmarela
    * @generated
    */
    public java.lang.Short getConcAmarela() {
        return this.concAmarela;
    }

    /**
    * Define concAmarela
    * @param concAmarela concAmarela
    * @generated
    */
    public CadastroCursos2020 setConcAmarela(java.lang.Short concAmarela) {
        this.concAmarela = concAmarela;
        return this;
    }
    /**
    * Obtém concApoioSocial
    * return concApoioSocial
    * @generated
    */
    public java.lang.Short getConcApoioSocial() {
        return this.concApoioSocial;
    }

    /**
    * Define concApoioSocial
    * @param concApoioSocial concApoioSocial
    * @generated
    */
    public CadastroCursos2020 setConcApoioSocial(java.lang.Short concApoioSocial) {
        this.concApoioSocial = concApoioSocial;
        return this;
    }
    /**
    * Obtém concAtivExtracurricular
    * return concAtivExtracurricular
    * @generated
    */
    public java.lang.Short getConcAtivExtracurricular() {
        return this.concAtivExtracurricular;
    }

    /**
    * Define concAtivExtracurricular
    * @param concAtivExtracurricular concAtivExtracurricular
    * @generated
    */
    public CadastroCursos2020 setConcAtivExtracurricular(java.lang.Short concAtivExtracurricular) {
        this.concAtivExtracurricular = concAtivExtracurricular;
        return this;
    }
    /**
    * Obtém concBranca
    * return concBranca
    * @generated
    */
    public java.lang.Short getConcBranca() {
        return this.concBranca;
    }

    /**
    * Define concBranca
    * @param concBranca concBranca
    * @generated
    */
    public CadastroCursos2020 setConcBranca(java.lang.Short concBranca) {
        this.concBranca = concBranca;
        return this;
    }
    /**
    * Obtém concCornd
    * return concCornd
    * @generated
    */
    public java.lang.Short getConcCornd() {
        return this.concCornd;
    }

    /**
    * Define concCornd
    * @param concCornd concCornd
    * @generated
    */
    public CadastroCursos2020 setConcCornd(java.lang.Short concCornd) {
        this.concCornd = concCornd;
        return this;
    }
    /**
    * Obtém concDiurno
    * return concDiurno
    * @generated
    */
    public java.lang.Short getConcDiurno() {
        return this.concDiurno;
    }

    /**
    * Define concDiurno
    * @param concDiurno concDiurno
    * @generated
    */
    public CadastroCursos2020 setConcDiurno(java.lang.Short concDiurno) {
        this.concDiurno = concDiurno;
        return this;
    }
    /**
    * Obtém concFem
    * return concFem
    * @generated
    */
    public java.lang.Short getConcFem() {
        return this.concFem;
    }

    /**
    * Define concFem
    * @param concFem concFem
    * @generated
    */
    public CadastroCursos2020 setConcFem(java.lang.Short concFem) {
        this.concFem = concFem;
        return this;
    }
    /**
    * Obtém concFies
    * return concFies
    * @generated
    */
    public java.lang.Short getConcFies() {
        return this.concFies;
    }

    /**
    * Define concFies
    * @param concFies concFies
    * @generated
    */
    public CadastroCursos2020 setConcFies(java.lang.Short concFies) {
        this.concFies = concFies;
        return this;
    }
    /**
    * Obtém concFinanc
    * return concFinanc
    * @generated
    */
    public java.lang.Short getConcFinanc() {
        return this.concFinanc;
    }

    /**
    * Define concFinanc
    * @param concFinanc concFinanc
    * @generated
    */
    public CadastroCursos2020 setConcFinanc(java.lang.Short concFinanc) {
        this.concFinanc = concFinanc;
        return this;
    }
    /**
    * Obtém concFinancNreemb
    * return concFinancNreemb
    * @generated
    */
    public java.lang.Short getConcFinancNreemb() {
        return this.concFinancNreemb;
    }

    /**
    * Define concFinancNreemb
    * @param concFinancNreemb concFinancNreemb
    * @generated
    */
    public CadastroCursos2020 setConcFinancNreemb(java.lang.Short concFinancNreemb) {
        this.concFinancNreemb = concFinancNreemb;
        return this;
    }
    /**
    * Obtém concFinancNreembOutros
    * return concFinancNreembOutros
    * @generated
    */
    public java.lang.Short getConcFinancNreembOutros() {
        return this.concFinancNreembOutros;
    }

    /**
    * Define concFinancNreembOutros
    * @param concFinancNreembOutros concFinancNreembOutros
    * @generated
    */
    public CadastroCursos2020 setConcFinancNreembOutros(java.lang.Short concFinancNreembOutros) {
        this.concFinancNreembOutros = concFinancNreembOutros;
        return this;
    }
    /**
    * Obtém concFinancReemb
    * return concFinancReemb
    * @generated
    */
    public java.lang.Short getConcFinancReemb() {
        return this.concFinancReemb;
    }

    /**
    * Define concFinancReemb
    * @param concFinancReemb concFinancReemb
    * @generated
    */
    public CadastroCursos2020 setConcFinancReemb(java.lang.Short concFinancReemb) {
        this.concFinancReemb = concFinancReemb;
        return this;
    }
    /**
    * Obtém concFinancReembOutros
    * return concFinancReembOutros
    * @generated
    */
    public java.lang.Short getConcFinancReembOutros() {
        return this.concFinancReembOutros;
    }

    /**
    * Define concFinancReembOutros
    * @param concFinancReembOutros concFinancReembOutros
    * @generated
    */
    public CadastroCursos2020 setConcFinancReembOutros(java.lang.Short concFinancReembOutros) {
        this.concFinancReembOutros = concFinancReembOutros;
        return this;
    }
    /**
    * Obtém concIndigena
    * return concIndigena
    * @generated
    */
    public java.lang.Short getConcIndigena() {
        return this.concIndigena;
    }

    /**
    * Define concIndigena
    * @param concIndigena concIndigena
    * @generated
    */
    public CadastroCursos2020 setConcIndigena(java.lang.Short concIndigena) {
        this.concIndigena = concIndigena;
        return this;
    }
    /**
    * Obtém concMasc
    * return concMasc
    * @generated
    */
    public java.lang.Short getConcMasc() {
        return this.concMasc;
    }

    /**
    * Define concMasc
    * @param concMasc concMasc
    * @generated
    */
    public CadastroCursos2020 setConcMasc(java.lang.Short concMasc) {
        this.concMasc = concMasc;
        return this;
    }
    /**
    * Obtém concMobAcademica
    * return concMobAcademica
    * @generated
    */
    public java.lang.Short getConcMobAcademica() {
        return this.concMobAcademica;
    }

    /**
    * Define concMobAcademica
    * @param concMobAcademica concMobAcademica
    * @generated
    */
    public CadastroCursos2020 setConcMobAcademica(java.lang.Short concMobAcademica) {
        this.concMobAcademica = concMobAcademica;
        return this;
    }
    /**
    * Obtém concNacbras
    * return concNacbras
    * @generated
    */
    public java.lang.Short getConcNacbras() {
        return this.concNacbras;
    }

    /**
    * Define concNacbras
    * @param concNacbras concNacbras
    * @generated
    */
    public CadastroCursos2020 setConcNacbras(java.lang.Short concNacbras) {
        this.concNacbras = concNacbras;
        return this;
    }
    /**
    * Obtém concNacestrang
    * return concNacestrang
    * @generated
    */
    public java.lang.Short getConcNacestrang() {
        return this.concNacestrang;
    }

    /**
    * Define concNacestrang
    * @param concNacestrang concNacestrang
    * @generated
    */
    public CadastroCursos2020 setConcNacestrang(java.lang.Short concNacestrang) {
        this.concNacestrang = concNacestrang;
        return this;
    }
    /**
    * Obtém concNoturno
    * return concNoturno
    * @generated
    */
    public java.lang.Short getConcNoturno() {
        return this.concNoturno;
    }

    /**
    * Define concNoturno
    * @param concNoturno concNoturno
    * @generated
    */
    public CadastroCursos2020 setConcNoturno(java.lang.Short concNoturno) {
        this.concNoturno = concNoturno;
        return this;
    }
    /**
    * Obtém concNrpfies
    * return concNrpfies
    * @generated
    */
    public java.lang.Short getConcNrpfies() {
        return this.concNrpfies;
    }

    /**
    * Define concNrpfies
    * @param concNrpfies concNrpfies
    * @generated
    */
    public CadastroCursos2020 setConcNrpfies(java.lang.Short concNrpfies) {
        this.concNrpfies = concNrpfies;
        return this;
    }
    /**
    * Obtém concParda
    * return concParda
    * @generated
    */
    public java.lang.Short getConcParda() {
        return this.concParda;
    }

    /**
    * Define concParda
    * @param concParda concParda
    * @generated
    */
    public CadastroCursos2020 setConcParda(java.lang.Short concParda) {
        this.concParda = concParda;
        return this;
    }
    /**
    * Obtém concPreta
    * return concPreta
    * @generated
    */
    public java.lang.Short getConcPreta() {
        return this.concPreta;
    }

    /**
    * Define concPreta
    * @param concPreta concPreta
    * @generated
    */
    public CadastroCursos2020 setConcPreta(java.lang.Short concPreta) {
        this.concPreta = concPreta;
        return this;
    }
    /**
    * Obtém concProcescprivada
    * return concProcescprivada
    * @generated
    */
    public java.lang.Short getConcProcescprivada() {
        return this.concProcescprivada;
    }

    /**
    * Define concProcescprivada
    * @param concProcescprivada concProcescprivada
    * @generated
    */
    public CadastroCursos2020 setConcProcescprivada(java.lang.Short concProcescprivada) {
        this.concProcescprivada = concProcescprivada;
        return this;
    }
    /**
    * Obtém concProcescpublica
    * return concProcescpublica
    * @generated
    */
    public java.lang.Short getConcProcescpublica() {
        return this.concProcescpublica;
    }

    /**
    * Define concProcescpublica
    * @param concProcescpublica concProcescpublica
    * @generated
    */
    public CadastroCursos2020 setConcProcescpublica(java.lang.Short concProcescpublica) {
        this.concProcescpublica = concProcescpublica;
        return this;
    }
    /**
    * Obtém concProcnaoinformada
    * return concProcnaoinformada
    * @generated
    */
    public java.lang.Short getConcProcnaoinformada() {
        return this.concProcnaoinformada;
    }

    /**
    * Define concProcnaoinformada
    * @param concProcnaoinformada concProcnaoinformada
    * @generated
    */
    public CadastroCursos2020 setConcProcnaoinformada(java.lang.Short concProcnaoinformada) {
        this.concProcnaoinformada = concProcnaoinformada;
        return this;
    }
    /**
    * Obtém concProunii
    * return concProunii
    * @generated
    */
    public java.lang.Short getConcProunii() {
        return this.concProunii;
    }

    /**
    * Define concProunii
    * @param concProunii concProunii
    * @generated
    */
    public CadastroCursos2020 setConcProunii(java.lang.Short concProunii) {
        this.concProunii = concProunii;
        return this;
    }
    /**
    * Obtém concProunip
    * return concProunip
    * @generated
    */
    public java.lang.Short getConcProunip() {
        return this.concProunip;
    }

    /**
    * Define concProunip
    * @param concProunip concProunip
    * @generated
    */
    public CadastroCursos2020 setConcProunip(java.lang.Short concProunip) {
        this.concProunip = concProunip;
        return this;
    }
    /**
    * Obtém concReservaVaga
    * return concReservaVaga
    * @generated
    */
    public java.lang.Short getConcReservaVaga() {
        return this.concReservaVaga;
    }

    /**
    * Define concReservaVaga
    * @param concReservaVaga concReservaVaga
    * @generated
    */
    public CadastroCursos2020 setConcReservaVaga(java.lang.Short concReservaVaga) {
        this.concReservaVaga = concReservaVaga;
        return this;
    }
    /**
    * Obtém concRpfies
    * return concRpfies
    * @generated
    */
    public java.lang.Short getConcRpfies() {
        return this.concRpfies;
    }

    /**
    * Define concRpfies
    * @param concRpfies concRpfies
    * @generated
    */
    public CadastroCursos2020 setConcRpfies(java.lang.Short concRpfies) {
        this.concRpfies = concRpfies;
        return this;
    }
    /**
    * Obtém concRvetinico
    * return concRvetinico
    * @generated
    */
    public java.lang.Short getConcRvetinico() {
        return this.concRvetinico;
    }

    /**
    * Define concRvetinico
    * @param concRvetinico concRvetinico
    * @generated
    */
    public CadastroCursos2020 setConcRvetinico(java.lang.Short concRvetinico) {
        this.concRvetinico = concRvetinico;
        return this;
    }
    /**
    * Obtém concRvoutros
    * return concRvoutros
    * @generated
    */
    public java.lang.Short getConcRvoutros() {
        return this.concRvoutros;
    }

    /**
    * Define concRvoutros
    * @param concRvoutros concRvoutros
    * @generated
    */
    public CadastroCursos2020 setConcRvoutros(java.lang.Short concRvoutros) {
        this.concRvoutros = concRvoutros;
        return this;
    }
    /**
    * Obtém concRvpdef
    * return concRvpdef
    * @generated
    */
    public java.lang.Short getConcRvpdef() {
        return this.concRvpdef;
    }

    /**
    * Define concRvpdef
    * @param concRvpdef concRvpdef
    * @generated
    */
    public CadastroCursos2020 setConcRvpdef(java.lang.Short concRvpdef) {
        this.concRvpdef = concRvpdef;
        return this;
    }
    /**
    * Obtém concRvredepublica
    * return concRvredepublica
    * @generated
    */
    public java.lang.Short getConcRvredepublica() {
        return this.concRvredepublica;
    }

    /**
    * Define concRvredepublica
    * @param concRvredepublica concRvredepublica
    * @generated
    */
    public CadastroCursos2020 setConcRvredepublica(java.lang.Short concRvredepublica) {
        this.concRvredepublica = concRvredepublica;
        return this;
    }
    /**
    * Obtém concRvsocialRf
    * return concRvsocialRf
    * @generated
    */
    public java.lang.Short getConcRvsocialRf() {
        return this.concRvsocialRf;
    }

    /**
    * Define concRvsocialRf
    * @param concRvsocialRf concRvsocialRf
    * @generated
    */
    public CadastroCursos2020 setConcRvsocialRf(java.lang.Short concRvsocialRf) {
        this.concRvsocialRf = concRvsocialRf;
        return this;
    }
    /**
    * Obtém inCapital
    * return inCapital
    * @generated
    */
    public java.lang.Short getInCapital() {
        return this.inCapital;
    }

    /**
    * Define inCapital
    * @param inCapital inCapital
    * @generated
    */
    public CadastroCursos2020 setInCapital(java.lang.Short inCapital) {
        this.inCapital = inCapital;
        return this;
    }
    /**
    * Obtém ing017
    * return ing017
    * @generated
    */
    public java.lang.Short getIng017() {
        return this.ing017;
    }

    /**
    * Define ing017
    * @param ing017 ing017
    * @generated
    */
    public CadastroCursos2020 setIng017(java.lang.Short ing017) {
        this.ing017 = ing017;
        return this;
    }
    /**
    * Obtém ing1824
    * return ing1824
    * @generated
    */
    public java.lang.Short getIng1824() {
        return this.ing1824;
    }

    /**
    * Define ing1824
    * @param ing1824 ing1824
    * @generated
    */
    public CadastroCursos2020 setIng1824(java.lang.Short ing1824) {
        this.ing1824 = ing1824;
        return this;
    }
    /**
    * Obtém ing2529
    * return ing2529
    * @generated
    */
    public java.lang.Short getIng2529() {
        return this.ing2529;
    }

    /**
    * Define ing2529
    * @param ing2529 ing2529
    * @generated
    */
    public CadastroCursos2020 setIng2529(java.lang.Short ing2529) {
        this.ing2529 = ing2529;
        return this;
    }
    /**
    * Obtém ing3034
    * return ing3034
    * @generated
    */
    public java.lang.Short getIng3034() {
        return this.ing3034;
    }

    /**
    * Define ing3034
    * @param ing3034 ing3034
    * @generated
    */
    public CadastroCursos2020 setIng3034(java.lang.Short ing3034) {
        this.ing3034 = ing3034;
        return this;
    }
    /**
    * Obtém ing3539
    * return ing3539
    * @generated
    */
    public java.lang.Short getIng3539() {
        return this.ing3539;
    }

    /**
    * Define ing3539
    * @param ing3539 ing3539
    * @generated
    */
    public CadastroCursos2020 setIng3539(java.lang.Short ing3539) {
        this.ing3539 = ing3539;
        return this;
    }
    /**
    * Obtém ing4049
    * return ing4049
    * @generated
    */
    public java.lang.Short getIng4049() {
        return this.ing4049;
    }

    /**
    * Define ing4049
    * @param ing4049 ing4049
    * @generated
    */
    public CadastroCursos2020 setIng4049(java.lang.Short ing4049) {
        this.ing4049 = ing4049;
        return this;
    }
    /**
    * Obtém ing5059
    * return ing5059
    * @generated
    */
    public java.lang.Short getIng5059() {
        return this.ing5059;
    }

    /**
    * Define ing5059
    * @param ing5059 ing5059
    * @generated
    */
    public CadastroCursos2020 setIng5059(java.lang.Short ing5059) {
        this.ing5059 = ing5059;
        return this;
    }
    /**
    * Obtém ingAlunoDeficiente
    * return ingAlunoDeficiente
    * @generated
    */
    public java.lang.Short getIngAlunoDeficiente() {
        return this.ingAlunoDeficiente;
    }

    /**
    * Define ingAlunoDeficiente
    * @param ingAlunoDeficiente ingAlunoDeficiente
    * @generated
    */
    public CadastroCursos2020 setIngAlunoDeficiente(java.lang.Short ingAlunoDeficiente) {
        this.ingAlunoDeficiente = ingAlunoDeficiente;
        return this;
    }
    /**
    * Obtém ingAlunoParfor
    * return ingAlunoParfor
    * @generated
    */
    public java.lang.Short getIngAlunoParfor() {
        return this.ingAlunoParfor;
    }

    /**
    * Define ingAlunoParfor
    * @param ingAlunoParfor ingAlunoParfor
    * @generated
    */
    public CadastroCursos2020 setIngAlunoParfor(java.lang.Short ingAlunoParfor) {
        this.ingAlunoParfor = ingAlunoParfor;
        return this;
    }
    /**
    * Obtém ingAmarela
    * return ingAmarela
    * @generated
    */
    public java.lang.Short getIngAmarela() {
        return this.ingAmarela;
    }

    /**
    * Define ingAmarela
    * @param ingAmarela ingAmarela
    * @generated
    */
    public CadastroCursos2020 setIngAmarela(java.lang.Short ingAmarela) {
        this.ingAmarela = ingAmarela;
        return this;
    }
    /**
    * Obtém ingApoioSocial
    * return ingApoioSocial
    * @generated
    */
    public java.lang.Short getIngApoioSocial() {
        return this.ingApoioSocial;
    }

    /**
    * Define ingApoioSocial
    * @param ingApoioSocial ingApoioSocial
    * @generated
    */
    public CadastroCursos2020 setIngApoioSocial(java.lang.Short ingApoioSocial) {
        this.ingApoioSocial = ingApoioSocial;
        return this;
    }
    /**
    * Obtém ingAtivExtracurricular
    * return ingAtivExtracurricular
    * @generated
    */
    public java.lang.Short getIngAtivExtracurricular() {
        return this.ingAtivExtracurricular;
    }

    /**
    * Define ingAtivExtracurricular
    * @param ingAtivExtracurricular ingAtivExtracurricular
    * @generated
    */
    public CadastroCursos2020 setIngAtivExtracurricular(java.lang.Short ingAtivExtracurricular) {
        this.ingAtivExtracurricular = ingAtivExtracurricular;
        return this;
    }
    /**
    * Obtém ingAvaliacaoSeriada
    * return ingAvaliacaoSeriada
    * @generated
    */
    public java.lang.Short getIngAvaliacaoSeriada() {
        return this.ingAvaliacaoSeriada;
    }

    /**
    * Define ingAvaliacaoSeriada
    * @param ingAvaliacaoSeriada ingAvaliacaoSeriada
    * @generated
    */
    public CadastroCursos2020 setIngAvaliacaoSeriada(java.lang.Short ingAvaliacaoSeriada) {
        this.ingAvaliacaoSeriada = ingAvaliacaoSeriada;
        return this;
    }
    /**
    * Obtém ingBranca
    * return ingBranca
    * @generated
    */
    public java.lang.Short getIngBranca() {
        return this.ingBranca;
    }

    /**
    * Define ingBranca
    * @param ingBranca ingBranca
    * @generated
    */
    public CadastroCursos2020 setIngBranca(java.lang.Short ingBranca) {
        this.ingBranca = ingBranca;
        return this;
    }
    /**
    * Obtém ingCornd
    * return ingCornd
    * @generated
    */
    public java.lang.Short getIngCornd() {
        return this.ingCornd;
    }

    /**
    * Define ingCornd
    * @param ingCornd ingCornd
    * @generated
    */
    public CadastroCursos2020 setIngCornd(java.lang.Short ingCornd) {
        this.ingCornd = ingCornd;
        return this;
    }
    /**
    * Obtém ingDiurno
    * return ingDiurno
    * @generated
    */
    public java.lang.Short getIngDiurno() {
        return this.ingDiurno;
    }

    /**
    * Define ingDiurno
    * @param ingDiurno ingDiurno
    * @generated
    */
    public CadastroCursos2020 setIngDiurno(java.lang.Short ingDiurno) {
        this.ingDiurno = ingDiurno;
        return this;
    }
    /**
    * Obtém ingEgr
    * return ingEgr
    * @generated
    */
    public java.lang.Short getIngEgr() {
        return this.ingEgr;
    }

    /**
    * Define ingEgr
    * @param ingEgr ingEgr
    * @generated
    */
    public CadastroCursos2020 setIngEgr(java.lang.Short ingEgr) {
        this.ingEgr = ingEgr;
        return this;
    }
    /**
    * Obtém ingEnem
    * return ingEnem
    * @generated
    */
    public java.lang.Short getIngEnem() {
        return this.ingEnem;
    }

    /**
    * Define ingEnem
    * @param ingEnem ingEnem
    * @generated
    */
    public CadastroCursos2020 setIngEnem(java.lang.Short ingEnem) {
        this.ingEnem = ingEnem;
        return this;
    }
    /**
    * Obtém ingFem
    * return ingFem
    * @generated
    */
    public java.lang.Short getIngFem() {
        return this.ingFem;
    }

    /**
    * Define ingFem
    * @param ingFem ingFem
    * @generated
    */
    public CadastroCursos2020 setIngFem(java.lang.Short ingFem) {
        this.ingFem = ingFem;
        return this;
    }
    /**
    * Obtém ingFies
    * return ingFies
    * @generated
    */
    public java.lang.Short getIngFies() {
        return this.ingFies;
    }

    /**
    * Define ingFies
    * @param ingFies ingFies
    * @generated
    */
    public CadastroCursos2020 setIngFies(java.lang.Short ingFies) {
        this.ingFies = ingFies;
        return this;
    }
    /**
    * Obtém ingFinanc
    * return ingFinanc
    * @generated
    */
    public java.lang.Short getIngFinanc() {
        return this.ingFinanc;
    }

    /**
    * Define ingFinanc
    * @param ingFinanc ingFinanc
    * @generated
    */
    public CadastroCursos2020 setIngFinanc(java.lang.Short ingFinanc) {
        this.ingFinanc = ingFinanc;
        return this;
    }
    /**
    * Obtém ingFinancNreemb
    * return ingFinancNreemb
    * @generated
    */
    public java.lang.Short getIngFinancNreemb() {
        return this.ingFinancNreemb;
    }

    /**
    * Define ingFinancNreemb
    * @param ingFinancNreemb ingFinancNreemb
    * @generated
    */
    public CadastroCursos2020 setIngFinancNreemb(java.lang.Short ingFinancNreemb) {
        this.ingFinancNreemb = ingFinancNreemb;
        return this;
    }
    /**
    * Obtém ingFinancNreembOutros
    * return ingFinancNreembOutros
    * @generated
    */
    public java.lang.Short getIngFinancNreembOutros() {
        return this.ingFinancNreembOutros;
    }

    /**
    * Define ingFinancNreembOutros
    * @param ingFinancNreembOutros ingFinancNreembOutros
    * @generated
    */
    public CadastroCursos2020 setIngFinancNreembOutros(java.lang.Short ingFinancNreembOutros) {
        this.ingFinancNreembOutros = ingFinancNreembOutros;
        return this;
    }
    /**
    * Obtém ingFinancReemb
    * return ingFinancReemb
    * @generated
    */
    public java.lang.Short getIngFinancReemb() {
        return this.ingFinancReemb;
    }

    /**
    * Define ingFinancReemb
    * @param ingFinancReemb ingFinancReemb
    * @generated
    */
    public CadastroCursos2020 setIngFinancReemb(java.lang.Short ingFinancReemb) {
        this.ingFinancReemb = ingFinancReemb;
        return this;
    }
    /**
    * Obtém ingFinancReembOutros
    * return ingFinancReembOutros
    * @generated
    */
    public java.lang.Short getIngFinancReembOutros() {
        return this.ingFinancReembOutros;
    }

    /**
    * Define ingFinancReembOutros
    * @param ingFinancReembOutros ingFinancReembOutros
    * @generated
    */
    public CadastroCursos2020 setIngFinancReembOutros(java.lang.Short ingFinancReembOutros) {
        this.ingFinancReembOutros = ingFinancReembOutros;
        return this;
    }
    /**
    * Obtém ingIndigena
    * return ingIndigena
    * @generated
    */
    public java.lang.Short getIngIndigena() {
        return this.ingIndigena;
    }

    /**
    * Define ingIndigena
    * @param ingIndigena ingIndigena
    * @generated
    */
    public CadastroCursos2020 setIngIndigena(java.lang.Short ingIndigena) {
        this.ingIndigena = ingIndigena;
        return this;
    }
    /**
    * Obtém ingMasc
    * return ingMasc
    * @generated
    */
    public java.lang.Short getIngMasc() {
        return this.ingMasc;
    }

    /**
    * Define ingMasc
    * @param ingMasc ingMasc
    * @generated
    */
    public CadastroCursos2020 setIngMasc(java.lang.Short ingMasc) {
        this.ingMasc = ingMasc;
        return this;
    }
    /**
    * Obtém ingMobAcademica
    * return ingMobAcademica
    * @generated
    */
    public java.lang.Short getIngMobAcademica() {
        return this.ingMobAcademica;
    }

    /**
    * Define ingMobAcademica
    * @param ingMobAcademica ingMobAcademica
    * @generated
    */
    public CadastroCursos2020 setIngMobAcademica(java.lang.Short ingMobAcademica) {
        this.ingMobAcademica = ingMobAcademica;
        return this;
    }
    /**
    * Obtém ingNacbras
    * return ingNacbras
    * @generated
    */
    public java.lang.Short getIngNacbras() {
        return this.ingNacbras;
    }

    /**
    * Define ingNacbras
    * @param ingNacbras ingNacbras
    * @generated
    */
    public CadastroCursos2020 setIngNacbras(java.lang.Short ingNacbras) {
        this.ingNacbras = ingNacbras;
        return this;
    }
    /**
    * Obtém ingNacestrang
    * return ingNacestrang
    * @generated
    */
    public java.lang.Short getIngNacestrang() {
        return this.ingNacestrang;
    }

    /**
    * Define ingNacestrang
    * @param ingNacestrang ingNacestrang
    * @generated
    */
    public CadastroCursos2020 setIngNacestrang(java.lang.Short ingNacestrang) {
        this.ingNacestrang = ingNacestrang;
        return this;
    }
    /**
    * Obtém ingNoturno
    * return ingNoturno
    * @generated
    */
    public java.lang.Short getIngNoturno() {
        return this.ingNoturno;
    }

    /**
    * Define ingNoturno
    * @param ingNoturno ingNoturno
    * @generated
    */
    public CadastroCursos2020 setIngNoturno(java.lang.Short ingNoturno) {
        this.ingNoturno = ingNoturno;
        return this;
    }
    /**
    * Obtém ingNrpfies
    * return ingNrpfies
    * @generated
    */
    public java.lang.Short getIngNrpfies() {
        return this.ingNrpfies;
    }

    /**
    * Define ingNrpfies
    * @param ingNrpfies ingNrpfies
    * @generated
    */
    public CadastroCursos2020 setIngNrpfies(java.lang.Short ingNrpfies) {
        this.ingNrpfies = ingNrpfies;
        return this;
    }
    /**
    * Obtém ingOutraForma
    * return ingOutraForma
    * @generated
    */
    public java.lang.Short getIngOutraForma() {
        return this.ingOutraForma;
    }

    /**
    * Define ingOutraForma
    * @param ingOutraForma ingOutraForma
    * @generated
    */
    public CadastroCursos2020 setIngOutraForma(java.lang.Short ingOutraForma) {
        this.ingOutraForma = ingOutraForma;
        return this;
    }
    /**
    * Obtém ingParda
    * return ingParda
    * @generated
    */
    public java.lang.Short getIngParda() {
        return this.ingParda;
    }

    /**
    * Define ingParda
    * @param ingParda ingParda
    * @generated
    */
    public CadastroCursos2020 setIngParda(java.lang.Short ingParda) {
        this.ingParda = ingParda;
        return this;
    }
    /**
    * Obtém ingPreta
    * return ingPreta
    * @generated
    */
    public java.lang.Short getIngPreta() {
        return this.ingPreta;
    }

    /**
    * Define ingPreta
    * @param ingPreta ingPreta
    * @generated
    */
    public CadastroCursos2020 setIngPreta(java.lang.Short ingPreta) {
        this.ingPreta = ingPreta;
        return this;
    }
    /**
    * Obtém ingProcescprivada
    * return ingProcescprivada
    * @generated
    */
    public java.lang.Short getIngProcescprivada() {
        return this.ingProcescprivada;
    }

    /**
    * Define ingProcescprivada
    * @param ingProcescprivada ingProcescprivada
    * @generated
    */
    public CadastroCursos2020 setIngProcescprivada(java.lang.Short ingProcescprivada) {
        this.ingProcescprivada = ingProcescprivada;
        return this;
    }
    /**
    * Obtém ingProcescpublica
    * return ingProcescpublica
    * @generated
    */
    public java.lang.Short getIngProcescpublica() {
        return this.ingProcescpublica;
    }

    /**
    * Define ingProcescpublica
    * @param ingProcescpublica ingProcescpublica
    * @generated
    */
    public CadastroCursos2020 setIngProcescpublica(java.lang.Short ingProcescpublica) {
        this.ingProcescpublica = ingProcescpublica;
        return this;
    }
    /**
    * Obtém ingProcnaoinformada
    * return ingProcnaoinformada
    * @generated
    */
    public java.lang.Short getIngProcnaoinformada() {
        return this.ingProcnaoinformada;
    }

    /**
    * Define ingProcnaoinformada
    * @param ingProcnaoinformada ingProcnaoinformada
    * @generated
    */
    public CadastroCursos2020 setIngProcnaoinformada(java.lang.Short ingProcnaoinformada) {
        this.ingProcnaoinformada = ingProcnaoinformada;
        return this;
    }
    /**
    * Obtém ingProunii
    * return ingProunii
    * @generated
    */
    public java.lang.Short getIngProunii() {
        return this.ingProunii;
    }

    /**
    * Define ingProunii
    * @param ingProunii ingProunii
    * @generated
    */
    public CadastroCursos2020 setIngProunii(java.lang.Short ingProunii) {
        this.ingProunii = ingProunii;
        return this;
    }
    /**
    * Obtém ingProunip
    * return ingProunip
    * @generated
    */
    public java.lang.Short getIngProunip() {
        return this.ingProunip;
    }

    /**
    * Define ingProunip
    * @param ingProunip ingProunip
    * @generated
    */
    public CadastroCursos2020 setIngProunip(java.lang.Short ingProunip) {
        this.ingProunip = ingProunip;
        return this;
    }
    /**
    * Obtém ingReservaVaga
    * return ingReservaVaga
    * @generated
    */
    public java.lang.Short getIngReservaVaga() {
        return this.ingReservaVaga;
    }

    /**
    * Define ingReservaVaga
    * @param ingReservaVaga ingReservaVaga
    * @generated
    */
    public CadastroCursos2020 setIngReservaVaga(java.lang.Short ingReservaVaga) {
        this.ingReservaVaga = ingReservaVaga;
        return this;
    }
    /**
    * Obtém ingRpfies
    * return ingRpfies
    * @generated
    */
    public java.lang.Short getIngRpfies() {
        return this.ingRpfies;
    }

    /**
    * Define ingRpfies
    * @param ingRpfies ingRpfies
    * @generated
    */
    public CadastroCursos2020 setIngRpfies(java.lang.Short ingRpfies) {
        this.ingRpfies = ingRpfies;
        return this;
    }
    /**
    * Obtém ingRvetinico
    * return ingRvetinico
    * @generated
    */
    public java.lang.Short getIngRvetinico() {
        return this.ingRvetinico;
    }

    /**
    * Define ingRvetinico
    * @param ingRvetinico ingRvetinico
    * @generated
    */
    public CadastroCursos2020 setIngRvetinico(java.lang.Short ingRvetinico) {
        this.ingRvetinico = ingRvetinico;
        return this;
    }
    /**
    * Obtém ingRvoutros
    * return ingRvoutros
    * @generated
    */
    public java.lang.Short getIngRvoutros() {
        return this.ingRvoutros;
    }

    /**
    * Define ingRvoutros
    * @param ingRvoutros ingRvoutros
    * @generated
    */
    public CadastroCursos2020 setIngRvoutros(java.lang.Short ingRvoutros) {
        this.ingRvoutros = ingRvoutros;
        return this;
    }
    /**
    * Obtém ingRvpdef
    * return ingRvpdef
    * @generated
    */
    public java.lang.Short getIngRvpdef() {
        return this.ingRvpdef;
    }

    /**
    * Define ingRvpdef
    * @param ingRvpdef ingRvpdef
    * @generated
    */
    public CadastroCursos2020 setIngRvpdef(java.lang.Short ingRvpdef) {
        this.ingRvpdef = ingRvpdef;
        return this;
    }
    /**
    * Obtém ingRvredepublica
    * return ingRvredepublica
    * @generated
    */
    public java.lang.Short getIngRvredepublica() {
        return this.ingRvredepublica;
    }

    /**
    * Define ingRvredepublica
    * @param ingRvredepublica ingRvredepublica
    * @generated
    */
    public CadastroCursos2020 setIngRvredepublica(java.lang.Short ingRvredepublica) {
        this.ingRvredepublica = ingRvredepublica;
        return this;
    }
    /**
    * Obtém ingRvsocialRf
    * return ingRvsocialRf
    * @generated
    */
    public java.lang.Short getIngRvsocialRf() {
        return this.ingRvsocialRf;
    }

    /**
    * Define ingRvsocialRf
    * @param ingRvsocialRf ingRvsocialRf
    * @generated
    */
    public CadastroCursos2020 setIngRvsocialRf(java.lang.Short ingRvsocialRf) {
        this.ingRvsocialRf = ingRvsocialRf;
        return this;
    }
    /**
    * Obtém ingSelecaoSimplifica
    * return ingSelecaoSimplifica
    * @generated
    */
    public java.lang.Short getIngSelecaoSimplifica() {
        return this.ingSelecaoSimplifica;
    }

    /**
    * Define ingSelecaoSimplifica
    * @param ingSelecaoSimplifica ingSelecaoSimplifica
    * @generated
    */
    public CadastroCursos2020 setIngSelecaoSimplifica(java.lang.Short ingSelecaoSimplifica) {
        this.ingSelecaoSimplifica = ingSelecaoSimplifica;
        return this;
    }
    /**
    * Obtém ingVestibular
    * return ingVestibular
    * @generated
    */
    public java.lang.Short getIngVestibular() {
        return this.ingVestibular;
    }

    /**
    * Define ingVestibular
    * @param ingVestibular ingVestibular
    * @generated
    */
    public CadastroCursos2020 setIngVestibular(java.lang.Short ingVestibular) {
        this.ingVestibular = ingVestibular;
        return this;
    }
    /**
    * Obtém ingVgNova
    * return ingVgNova
    * @generated
    */
    public java.lang.Short getIngVgNova() {
        return this.ingVgNova;
    }

    /**
    * Define ingVgNova
    * @param ingVgNova ingVgNova
    * @generated
    */
    public CadastroCursos2020 setIngVgNova(java.lang.Short ingVgNova) {
        this.ingVgNova = ingVgNova;
        return this;
    }
    /**
    * Obtém ingVgProgEspecial
    * return ingVgProgEspecial
    * @generated
    */
    public java.lang.Short getIngVgProgEspecial() {
        return this.ingVgProgEspecial;
    }

    /**
    * Define ingVgProgEspecial
    * @param ingVgProgEspecial ingVgProgEspecial
    * @generated
    */
    public CadastroCursos2020 setIngVgProgEspecial(java.lang.Short ingVgProgEspecial) {
        this.ingVgProgEspecial = ingVgProgEspecial;
        return this;
    }
    /**
    * Obtém ingVgRemanesc
    * return ingVgRemanesc
    * @generated
    */
    public java.lang.Short getIngVgRemanesc() {
        return this.ingVgRemanesc;
    }

    /**
    * Define ingVgRemanesc
    * @param ingVgRemanesc ingVgRemanesc
    * @generated
    */
    public CadastroCursos2020 setIngVgRemanesc(java.lang.Short ingVgRemanesc) {
        this.ingVgRemanesc = ingVgRemanesc;
        return this;
    }
    /**
    * Obtém mat017
    * return mat017
    * @generated
    */
    public java.lang.Short getMat017() {
        return this.mat017;
    }

    /**
    * Define mat017
    * @param mat017 mat017
    * @generated
    */
    public CadastroCursos2020 setMat017(java.lang.Short mat017) {
        this.mat017 = mat017;
        return this;
    }
    /**
    * Obtém mat1824
    * return mat1824
    * @generated
    */
    public java.lang.Short getMat1824() {
        return this.mat1824;
    }

    /**
    * Define mat1824
    * @param mat1824 mat1824
    * @generated
    */
    public CadastroCursos2020 setMat1824(java.lang.Short mat1824) {
        this.mat1824 = mat1824;
        return this;
    }
    /**
    * Obtém mat2529
    * return mat2529
    * @generated
    */
    public java.lang.Short getMat2529() {
        return this.mat2529;
    }

    /**
    * Define mat2529
    * @param mat2529 mat2529
    * @generated
    */
    public CadastroCursos2020 setMat2529(java.lang.Short mat2529) {
        this.mat2529 = mat2529;
        return this;
    }
    /**
    * Obtém mat3034
    * return mat3034
    * @generated
    */
    public java.lang.Short getMat3034() {
        return this.mat3034;
    }

    /**
    * Define mat3034
    * @param mat3034 mat3034
    * @generated
    */
    public CadastroCursos2020 setMat3034(java.lang.Short mat3034) {
        this.mat3034 = mat3034;
        return this;
    }
    /**
    * Obtém mat3539
    * return mat3539
    * @generated
    */
    public java.lang.Short getMat3539() {
        return this.mat3539;
    }

    /**
    * Define mat3539
    * @param mat3539 mat3539
    * @generated
    */
    public CadastroCursos2020 setMat3539(java.lang.Short mat3539) {
        this.mat3539 = mat3539;
        return this;
    }
    /**
    * Obtém mat4049
    * return mat4049
    * @generated
    */
    public java.lang.Short getMat4049() {
        return this.mat4049;
    }

    /**
    * Define mat4049
    * @param mat4049 mat4049
    * @generated
    */
    public CadastroCursos2020 setMat4049(java.lang.Short mat4049) {
        this.mat4049 = mat4049;
        return this;
    }
    /**
    * Obtém mat5059
    * return mat5059
    * @generated
    */
    public java.lang.Short getMat5059() {
        return this.mat5059;
    }

    /**
    * Define mat5059
    * @param mat5059 mat5059
    * @generated
    */
    public CadastroCursos2020 setMat5059(java.lang.Short mat5059) {
        this.mat5059 = mat5059;
        return this;
    }
    /**
    * Obtém mat60Mais
    * return mat60Mais
    * @generated
    */
    public java.lang.Short getMat60Mais() {
        return this.mat60Mais;
    }

    /**
    * Define mat60Mais
    * @param mat60Mais mat60Mais
    * @generated
    */
    public CadastroCursos2020 setMat60Mais(java.lang.Short mat60Mais) {
        this.mat60Mais = mat60Mais;
        return this;
    }
    /**
    * Obtém matAlunoDeficiente
    * return matAlunoDeficiente
    * @generated
    */
    public java.lang.Short getMatAlunoDeficiente() {
        return this.matAlunoDeficiente;
    }

    /**
    * Define matAlunoDeficiente
    * @param matAlunoDeficiente matAlunoDeficiente
    * @generated
    */
    public CadastroCursos2020 setMatAlunoDeficiente(java.lang.Short matAlunoDeficiente) {
        this.matAlunoDeficiente = matAlunoDeficiente;
        return this;
    }
    /**
    * Obtém matAlunoParfor
    * return matAlunoParfor
    * @generated
    */
    public java.lang.Short getMatAlunoParfor() {
        return this.matAlunoParfor;
    }

    /**
    * Define matAlunoParfor
    * @param matAlunoParfor matAlunoParfor
    * @generated
    */
    public CadastroCursos2020 setMatAlunoParfor(java.lang.Short matAlunoParfor) {
        this.matAlunoParfor = matAlunoParfor;
        return this;
    }
    /**
    * Obtém matAmarela
    * return matAmarela
    * @generated
    */
    public java.lang.Short getMatAmarela() {
        return this.matAmarela;
    }

    /**
    * Define matAmarela
    * @param matAmarela matAmarela
    * @generated
    */
    public CadastroCursos2020 setMatAmarela(java.lang.Short matAmarela) {
        this.matAmarela = matAmarela;
        return this;
    }
    /**
    * Obtém matApoioSocial
    * return matApoioSocial
    * @generated
    */
    public java.lang.Short getMatApoioSocial() {
        return this.matApoioSocial;
    }

    /**
    * Define matApoioSocial
    * @param matApoioSocial matApoioSocial
    * @generated
    */
    public CadastroCursos2020 setMatApoioSocial(java.lang.Short matApoioSocial) {
        this.matApoioSocial = matApoioSocial;
        return this;
    }
    /**
    * Obtém matAtivExtracurricular
    * return matAtivExtracurricular
    * @generated
    */
    public java.lang.Short getMatAtivExtracurricular() {
        return this.matAtivExtracurricular;
    }

    /**
    * Define matAtivExtracurricular
    * @param matAtivExtracurricular matAtivExtracurricular
    * @generated
    */
    public CadastroCursos2020 setMatAtivExtracurricular(java.lang.Short matAtivExtracurricular) {
        this.matAtivExtracurricular = matAtivExtracurricular;
        return this;
    }
    /**
    * Obtém matBranca
    * return matBranca
    * @generated
    */
    public java.lang.Short getMatBranca() {
        return this.matBranca;
    }

    /**
    * Define matBranca
    * @param matBranca matBranca
    * @generated
    */
    public CadastroCursos2020 setMatBranca(java.lang.Short matBranca) {
        this.matBranca = matBranca;
        return this;
    }
    /**
    * Obtém matCornd
    * return matCornd
    * @generated
    */
    public java.lang.Short getMatCornd() {
        return this.matCornd;
    }

    /**
    * Define matCornd
    * @param matCornd matCornd
    * @generated
    */
    public CadastroCursos2020 setMatCornd(java.lang.Short matCornd) {
        this.matCornd = matCornd;
        return this;
    }
    /**
    * Obtém matFies
    * return matFies
    * @generated
    */
    public java.lang.Short getMatFies() {
        return this.matFies;
    }

    /**
    * Define matFies
    * @param matFies matFies
    * @generated
    */
    public CadastroCursos2020 setMatFies(java.lang.Short matFies) {
        this.matFies = matFies;
        return this;
    }
    /**
    * Obtém matFinanc
    * return matFinanc
    * @generated
    */
    public java.lang.Short getMatFinanc() {
        return this.matFinanc;
    }

    /**
    * Define matFinanc
    * @param matFinanc matFinanc
    * @generated
    */
    public CadastroCursos2020 setMatFinanc(java.lang.Short matFinanc) {
        this.matFinanc = matFinanc;
        return this;
    }
    /**
    * Obtém matFinancNreemb
    * return matFinancNreemb
    * @generated
    */
    public java.lang.Short getMatFinancNreemb() {
        return this.matFinancNreemb;
    }

    /**
    * Define matFinancNreemb
    * @param matFinancNreemb matFinancNreemb
    * @generated
    */
    public CadastroCursos2020 setMatFinancNreemb(java.lang.Short matFinancNreemb) {
        this.matFinancNreemb = matFinancNreemb;
        return this;
    }
    /**
    * Obtém matFinancNreembOutros
    * return matFinancNreembOutros
    * @generated
    */
    public java.lang.Short getMatFinancNreembOutros() {
        return this.matFinancNreembOutros;
    }

    /**
    * Define matFinancNreembOutros
    * @param matFinancNreembOutros matFinancNreembOutros
    * @generated
    */
    public CadastroCursos2020 setMatFinancNreembOutros(java.lang.Short matFinancNreembOutros) {
        this.matFinancNreembOutros = matFinancNreembOutros;
        return this;
    }
    /**
    * Obtém matFinancReemb
    * return matFinancReemb
    * @generated
    */
    public java.lang.Short getMatFinancReemb() {
        return this.matFinancReemb;
    }

    /**
    * Define matFinancReemb
    * @param matFinancReemb matFinancReemb
    * @generated
    */
    public CadastroCursos2020 setMatFinancReemb(java.lang.Short matFinancReemb) {
        this.matFinancReemb = matFinancReemb;
        return this;
    }
    /**
    * Obtém matFinancReembOutros
    * return matFinancReembOutros
    * @generated
    */
    public java.lang.Short getMatFinancReembOutros() {
        return this.matFinancReembOutros;
    }

    /**
    * Define matFinancReembOutros
    * @param matFinancReembOutros matFinancReembOutros
    * @generated
    */
    public CadastroCursos2020 setMatFinancReembOutros(java.lang.Short matFinancReembOutros) {
        this.matFinancReembOutros = matFinancReembOutros;
        return this;
    }
    /**
    * Obtém matIndigena
    * return matIndigena
    * @generated
    */
    public java.lang.Short getMatIndigena() {
        return this.matIndigena;
    }

    /**
    * Define matIndigena
    * @param matIndigena matIndigena
    * @generated
    */
    public CadastroCursos2020 setMatIndigena(java.lang.Short matIndigena) {
        this.matIndigena = matIndigena;
        return this;
    }
    /**
    * Obtém matMobAcademica
    * return matMobAcademica
    * @generated
    */
    public java.lang.Short getMatMobAcademica() {
        return this.matMobAcademica;
    }

    /**
    * Define matMobAcademica
    * @param matMobAcademica matMobAcademica
    * @generated
    */
    public CadastroCursos2020 setMatMobAcademica(java.lang.Short matMobAcademica) {
        this.matMobAcademica = matMobAcademica;
        return this;
    }
    /**
    * Obtém matNacbras
    * return matNacbras
    * @generated
    */
    public java.lang.Short getMatNacbras() {
        return this.matNacbras;
    }

    /**
    * Define matNacbras
    * @param matNacbras matNacbras
    * @generated
    */
    public CadastroCursos2020 setMatNacbras(java.lang.Short matNacbras) {
        this.matNacbras = matNacbras;
        return this;
    }
    /**
    * Obtém matNacestrang
    * return matNacestrang
    * @generated
    */
    public java.lang.Short getMatNacestrang() {
        return this.matNacestrang;
    }

    /**
    * Define matNacestrang
    * @param matNacestrang matNacestrang
    * @generated
    */
    public CadastroCursos2020 setMatNacestrang(java.lang.Short matNacestrang) {
        this.matNacestrang = matNacestrang;
        return this;
    }
    /**
    * Obtém matNrpfies
    * return matNrpfies
    * @generated
    */
    public java.lang.Short getMatNrpfies() {
        return this.matNrpfies;
    }

    /**
    * Define matNrpfies
    * @param matNrpfies matNrpfies
    * @generated
    */
    public CadastroCursos2020 setMatNrpfies(java.lang.Short matNrpfies) {
        this.matNrpfies = matNrpfies;
        return this;
    }
    /**
    * Obtém matParda
    * return matParda
    * @generated
    */
    public java.lang.Short getMatParda() {
        return this.matParda;
    }

    /**
    * Define matParda
    * @param matParda matParda
    * @generated
    */
    public CadastroCursos2020 setMatParda(java.lang.Short matParda) {
        this.matParda = matParda;
        return this;
    }
    /**
    * Obtém matPreta
    * return matPreta
    * @generated
    */
    public java.lang.Short getMatPreta() {
        return this.matPreta;
    }

    /**
    * Define matPreta
    * @param matPreta matPreta
    * @generated
    */
    public CadastroCursos2020 setMatPreta(java.lang.Short matPreta) {
        this.matPreta = matPreta;
        return this;
    }
    /**
    * Obtém matProcescprivada
    * return matProcescprivada
    * @generated
    */
    public java.lang.Short getMatProcescprivada() {
        return this.matProcescprivada;
    }

    /**
    * Define matProcescprivada
    * @param matProcescprivada matProcescprivada
    * @generated
    */
    public CadastroCursos2020 setMatProcescprivada(java.lang.Short matProcescprivada) {
        this.matProcescprivada = matProcescprivada;
        return this;
    }
    /**
    * Obtém matProcescpublica
    * return matProcescpublica
    * @generated
    */
    public java.lang.Short getMatProcescpublica() {
        return this.matProcescpublica;
    }

    /**
    * Define matProcescpublica
    * @param matProcescpublica matProcescpublica
    * @generated
    */
    public CadastroCursos2020 setMatProcescpublica(java.lang.Short matProcescpublica) {
        this.matProcescpublica = matProcescpublica;
        return this;
    }
    /**
    * Obtém matProcnaoinformada
    * return matProcnaoinformada
    * @generated
    */
    public java.lang.Short getMatProcnaoinformada() {
        return this.matProcnaoinformada;
    }

    /**
    * Define matProcnaoinformada
    * @param matProcnaoinformada matProcnaoinformada
    * @generated
    */
    public CadastroCursos2020 setMatProcnaoinformada(java.lang.Short matProcnaoinformada) {
        this.matProcnaoinformada = matProcnaoinformada;
        return this;
    }
    /**
    * Obtém matProunii
    * return matProunii
    * @generated
    */
    public java.lang.Short getMatProunii() {
        return this.matProunii;
    }

    /**
    * Define matProunii
    * @param matProunii matProunii
    * @generated
    */
    public CadastroCursos2020 setMatProunii(java.lang.Short matProunii) {
        this.matProunii = matProunii;
        return this;
    }
    /**
    * Obtém matProunip
    * return matProunip
    * @generated
    */
    public java.lang.Short getMatProunip() {
        return this.matProunip;
    }

    /**
    * Define matProunip
    * @param matProunip matProunip
    * @generated
    */
    public CadastroCursos2020 setMatProunip(java.lang.Short matProunip) {
        this.matProunip = matProunip;
        return this;
    }
    /**
    * Obtém matReservaVaga
    * return matReservaVaga
    * @generated
    */
    public java.lang.Short getMatReservaVaga() {
        return this.matReservaVaga;
    }

    /**
    * Define matReservaVaga
    * @param matReservaVaga matReservaVaga
    * @generated
    */
    public CadastroCursos2020 setMatReservaVaga(java.lang.Short matReservaVaga) {
        this.matReservaVaga = matReservaVaga;
        return this;
    }
    /**
    * Obtém matRpfies
    * return matRpfies
    * @generated
    */
    public java.lang.Short getMatRpfies() {
        return this.matRpfies;
    }

    /**
    * Define matRpfies
    * @param matRpfies matRpfies
    * @generated
    */
    public CadastroCursos2020 setMatRpfies(java.lang.Short matRpfies) {
        this.matRpfies = matRpfies;
        return this;
    }
    /**
    * Obtém matRvetinico
    * return matRvetinico
    * @generated
    */
    public java.lang.Short getMatRvetinico() {
        return this.matRvetinico;
    }

    /**
    * Define matRvetinico
    * @param matRvetinico matRvetinico
    * @generated
    */
    public CadastroCursos2020 setMatRvetinico(java.lang.Short matRvetinico) {
        this.matRvetinico = matRvetinico;
        return this;
    }
    /**
    * Obtém matRvoutros
    * return matRvoutros
    * @generated
    */
    public java.lang.Short getMatRvoutros() {
        return this.matRvoutros;
    }

    /**
    * Define matRvoutros
    * @param matRvoutros matRvoutros
    * @generated
    */
    public CadastroCursos2020 setMatRvoutros(java.lang.Short matRvoutros) {
        this.matRvoutros = matRvoutros;
        return this;
    }
    /**
    * Obtém matRvpdef
    * return matRvpdef
    * @generated
    */
    public java.lang.Short getMatRvpdef() {
        return this.matRvpdef;
    }

    /**
    * Define matRvpdef
    * @param matRvpdef matRvpdef
    * @generated
    */
    public CadastroCursos2020 setMatRvpdef(java.lang.Short matRvpdef) {
        this.matRvpdef = matRvpdef;
        return this;
    }
    /**
    * Obtém matRvredepublica
    * return matRvredepublica
    * @generated
    */
    public java.lang.Short getMatRvredepublica() {
        return this.matRvredepublica;
    }

    /**
    * Define matRvredepublica
    * @param matRvredepublica matRvredepublica
    * @generated
    */
    public CadastroCursos2020 setMatRvredepublica(java.lang.Short matRvredepublica) {
        this.matRvredepublica = matRvredepublica;
        return this;
    }
    /**
    * Obtém matRvsocialRf
    * return matRvsocialRf
    * @generated
    */
    public java.lang.Short getMatRvsocialRf() {
        return this.matRvsocialRf;
    }

    /**
    * Define matRvsocialRf
    * @param matRvsocialRf matRvsocialRf
    * @generated
    */
    public CadastroCursos2020 setMatRvsocialRf(java.lang.Short matRvsocialRf) {
        this.matRvsocialRf = matRvsocialRf;
        return this;
    }
    /**
    * Obtém mobAcademica
    * return mobAcademica
    * @generated
    */
    public java.lang.Short getMobAcademica() {
        return this.mobAcademica;
    }

    /**
    * Define mobAcademica
    * @param mobAcademica mobAcademica
    * @generated
    */
    public CadastroCursos2020 setMobAcademica(java.lang.Short mobAcademica) {
        this.mobAcademica = mobAcademica;
        return this;
    }
    /**
    * Obtém noCineAreaDetalhada
    * return noCineAreaDetalhada
    * @generated
    */
    public java.lang.String getNoCineAreaDetalhada() {
        return this.noCineAreaDetalhada;
    }

    /**
    * Define noCineAreaDetalhada
    * @param noCineAreaDetalhada noCineAreaDetalhada
    * @generated
    */
    public CadastroCursos2020 setNoCineAreaDetalhada(java.lang.String noCineAreaDetalhada) {
        this.noCineAreaDetalhada = noCineAreaDetalhada;
        return this;
    }
    /**
    * Obtém noCineAreaEspecifica
    * return noCineAreaEspecifica
    * @generated
    */
    public java.lang.String getNoCineAreaEspecifica() {
        return this.noCineAreaEspecifica;
    }

    /**
    * Define noCineAreaEspecifica
    * @param noCineAreaEspecifica noCineAreaEspecifica
    * @generated
    */
    public CadastroCursos2020 setNoCineAreaEspecifica(java.lang.String noCineAreaEspecifica) {
        this.noCineAreaEspecifica = noCineAreaEspecifica;
        return this;
    }
    /**
    * Obtém noCineAreaGeral
    * return noCineAreaGeral
    * @generated
    */
    public java.lang.String getNoCineAreaGeral() {
        return this.noCineAreaGeral;
    }

    /**
    * Define noCineAreaGeral
    * @param noCineAreaGeral noCineAreaGeral
    * @generated
    */
    public CadastroCursos2020 setNoCineAreaGeral(java.lang.String noCineAreaGeral) {
        this.noCineAreaGeral = noCineAreaGeral;
        return this;
    }
    /**
    * Obtém noCineRotulo
    * return noCineRotulo
    * @generated
    */
    public java.lang.String getNoCineRotulo() {
        return this.noCineRotulo;
    }

    /**
    * Define noCineRotulo
    * @param noCineRotulo noCineRotulo
    * @generated
    */
    public CadastroCursos2020 setNoCineRotulo(java.lang.String noCineRotulo) {
        this.noCineRotulo = noCineRotulo;
        return this;
    }
    /**
    * Obtém noMunicipio
    * return noMunicipio
    * @generated
    */
    public java.lang.String getNoMunicipio() {
        return this.noMunicipio;
    }

    /**
    * Define noMunicipio
    * @param noMunicipio noMunicipio
    * @generated
    */
    public CadastroCursos2020 setNoMunicipio(java.lang.String noMunicipio) {
        this.noMunicipio = noMunicipio;
        return this;
    }
    /**
    * Obtém noRegiao
    * return noRegiao
    * @generated
    */
    public java.lang.String getNoRegiao() {
        return this.noRegiao;
    }

    /**
    * Define noRegiao
    * @param noRegiao noRegiao
    * @generated
    */
    public CadastroCursos2020 setNoRegiao(java.lang.String noRegiao) {
        this.noRegiao = noRegiao;
        return this;
    }
    /**
    * Obtém noUf
    * return noUf
    * @generated
    */
    public java.lang.String getNoUf() {
        return this.noUf;
    }

    /**
    * Define noUf
    * @param noUf noUf
    * @generated
    */
    public CadastroCursos2020 setNoUf(java.lang.String noUf) {
        this.noUf = noUf;
        return this;
    }
    /**
    * Obtém qtConc
    * return qtConc
    * @generated
    */
    public java.lang.Short getQtConc() {
        return this.qtConc;
    }

    /**
    * Define qtConc
    * @param qtConc qtConc
    * @generated
    */
    public CadastroCursos2020 setQtConc(java.lang.Short qtConc) {
        this.qtConc = qtConc;
        return this;
    }
    /**
    * Obtém qtCurso
    * return qtCurso
    * @generated
    */
    public java.lang.Short getQtCurso() {
        return this.qtCurso;
    }

    /**
    * Define qtCurso
    * @param qtCurso qtCurso
    * @generated
    */
    public CadastroCursos2020 setQtCurso(java.lang.Short qtCurso) {
        this.qtCurso = qtCurso;
        return this;
    }
    /**
    * Obtém qtIng
    * return qtIng
    * @generated
    */
    public java.lang.Short getQtIng() {
        return this.qtIng;
    }

    /**
    * Define qtIng
    * @param qtIng qtIng
    * @generated
    */
    public CadastroCursos2020 setQtIng(java.lang.Short qtIng) {
        this.qtIng = qtIng;
        return this;
    }
    /**
    * Obtém qtIng60Mais
    * return qtIng60Mais
    * @generated
    */
    public java.lang.Short getQtIng60Mais() {
        return this.qtIng60Mais;
    }

    /**
    * Define qtIng60Mais
    * @param qtIng60Mais qtIng60Mais
    * @generated
    */
    public CadastroCursos2020 setQtIng60Mais(java.lang.Short qtIng60Mais) {
        this.qtIng60Mais = qtIng60Mais;
        return this;
    }
    /**
    * Obtém qtInscVgNova
    * return qtInscVgNova
    * @generated
    */
    public java.lang.Integer getQtInscVgNova() {
        return this.qtInscVgNova;
    }

    /**
    * Define qtInscVgNova
    * @param qtInscVgNova qtInscVgNova
    * @generated
    */
    public CadastroCursos2020 setQtInscVgNova(java.lang.Integer qtInscVgNova) {
        this.qtInscVgNova = qtInscVgNova;
        return this;
    }
    /**
    * Obtém qtInscVgProgEspecial
    * return qtInscVgProgEspecial
    * @generated
    */
    public java.lang.Short getQtInscVgProgEspecial() {
        return this.qtInscVgProgEspecial;
    }

    /**
    * Define qtInscVgProgEspecial
    * @param qtInscVgProgEspecial qtInscVgProgEspecial
    * @generated
    */
    public CadastroCursos2020 setQtInscVgProgEspecial(java.lang.Short qtInscVgProgEspecial) {
        this.qtInscVgProgEspecial = qtInscVgProgEspecial;
        return this;
    }
    /**
    * Obtém qtInscVgRemanesc
    * return qtInscVgRemanesc
    * @generated
    */
    public java.lang.Short getQtInscVgRemanesc() {
        return this.qtInscVgRemanesc;
    }

    /**
    * Define qtInscVgRemanesc
    * @param qtInscVgRemanesc qtInscVgRemanesc
    * @generated
    */
    public CadastroCursos2020 setQtInscVgRemanesc(java.lang.Short qtInscVgRemanesc) {
        this.qtInscVgRemanesc = qtInscVgRemanesc;
        return this;
    }
    /**
    * Obtém qtInscritoTotal
    * return qtInscritoTotal
    * @generated
    */
    public java.lang.Integer getQtInscritoTotal() {
        return this.qtInscritoTotal;
    }

    /**
    * Define qtInscritoTotal
    * @param qtInscritoTotal qtInscritoTotal
    * @generated
    */
    public CadastroCursos2020 setQtInscritoTotal(java.lang.Integer qtInscritoTotal) {
        this.qtInscritoTotal = qtInscritoTotal;
        return this;
    }
    /**
    * Obtém qtInscritoTotalDiurno
    * return qtInscritoTotalDiurno
    * @generated
    */
    public java.lang.Integer getQtInscritoTotalDiurno() {
        return this.qtInscritoTotalDiurno;
    }

    /**
    * Define qtInscritoTotalDiurno
    * @param qtInscritoTotalDiurno qtInscritoTotalDiurno
    * @generated
    */
    public CadastroCursos2020 setQtInscritoTotalDiurno(java.lang.Integer qtInscritoTotalDiurno) {
        this.qtInscritoTotalDiurno = qtInscritoTotalDiurno;
        return this;
    }
    /**
    * Obtém qtInscritoTotalEad
    * return qtInscritoTotalEad
    * @generated
    */
    public java.lang.Integer getQtInscritoTotalEad() {
        return this.qtInscritoTotalEad;
    }

    /**
    * Define qtInscritoTotalEad
    * @param qtInscritoTotalEad qtInscritoTotalEad
    * @generated
    */
    public CadastroCursos2020 setQtInscritoTotalEad(java.lang.Integer qtInscritoTotalEad) {
        this.qtInscritoTotalEad = qtInscritoTotalEad;
        return this;
    }
    /**
    * Obtém qtInscritoTotalNoturno
    * return qtInscritoTotalNoturno
    * @generated
    */
    public java.lang.Short getQtInscritoTotalNoturno() {
        return this.qtInscritoTotalNoturno;
    }

    /**
    * Define qtInscritoTotalNoturno
    * @param qtInscritoTotalNoturno qtInscritoTotalNoturno
    * @generated
    */
    public CadastroCursos2020 setQtInscritoTotalNoturno(java.lang.Short qtInscritoTotalNoturno) {
        this.qtInscritoTotalNoturno = qtInscritoTotalNoturno;
        return this;
    }
    /**
    * Obtém qtMat
    * return qtMat
    * @generated
    */
    public java.lang.Short getQtMat() {
        return this.qtMat;
    }

    /**
    * Define qtMat
    * @param qtMat qtMat
    * @generated
    */
    public CadastroCursos2020 setQtMat(java.lang.Short qtMat) {
        this.qtMat = qtMat;
        return this;
    }
    /**
    * Obtém qtMatDiurno
    * return qtMatDiurno
    * @generated
    */
    public java.lang.Short getQtMatDiurno() {
        return this.qtMatDiurno;
    }

    /**
    * Define qtMatDiurno
    * @param qtMatDiurno qtMatDiurno
    * @generated
    */
    public CadastroCursos2020 setQtMatDiurno(java.lang.Short qtMatDiurno) {
        this.qtMatDiurno = qtMatDiurno;
        return this;
    }
    /**
    * Obtém qtMatFem
    * return qtMatFem
    * @generated
    */
    public java.lang.Short getQtMatFem() {
        return this.qtMatFem;
    }

    /**
    * Define qtMatFem
    * @param qtMatFem qtMatFem
    * @generated
    */
    public CadastroCursos2020 setQtMatFem(java.lang.Short qtMatFem) {
        this.qtMatFem = qtMatFem;
        return this;
    }
    /**
    * Obtém qtMatMasc
    * return qtMatMasc
    * @generated
    */
    public java.lang.Short getQtMatMasc() {
        return this.qtMatMasc;
    }

    /**
    * Define qtMatMasc
    * @param qtMatMasc qtMatMasc
    * @generated
    */
    public CadastroCursos2020 setQtMatMasc(java.lang.Short qtMatMasc) {
        this.qtMatMasc = qtMatMasc;
        return this;
    }
    /**
    * Obtém qtMatNoturno
    * return qtMatNoturno
    * @generated
    */
    public java.lang.Short getQtMatNoturno() {
        return this.qtMatNoturno;
    }

    /**
    * Define qtMatNoturno
    * @param qtMatNoturno qtMatNoturno
    * @generated
    */
    public CadastroCursos2020 setQtMatNoturno(java.lang.Short qtMatNoturno) {
        this.qtMatNoturno = qtMatNoturno;
        return this;
    }
    /**
    * Obtém qtVagaTotal
    * return qtVagaTotal
    * @generated
    */
    public java.lang.Integer getQtVagaTotal() {
        return this.qtVagaTotal;
    }

    /**
    * Define qtVagaTotal
    * @param qtVagaTotal qtVagaTotal
    * @generated
    */
    public CadastroCursos2020 setQtVagaTotal(java.lang.Integer qtVagaTotal) {
        this.qtVagaTotal = qtVagaTotal;
        return this;
    }
    /**
    * Obtém qtVagaTotalDiurno
    * return qtVagaTotalDiurno
    * @generated
    */
    public java.lang.Short getQtVagaTotalDiurno() {
        return this.qtVagaTotalDiurno;
    }

    /**
    * Define qtVagaTotalDiurno
    * @param qtVagaTotalDiurno qtVagaTotalDiurno
    * @generated
    */
    public CadastroCursos2020 setQtVagaTotalDiurno(java.lang.Short qtVagaTotalDiurno) {
        this.qtVagaTotalDiurno = qtVagaTotalDiurno;
        return this;
    }
    /**
    * Obtém qtVagaTotalEad
    * return qtVagaTotalEad
    * @generated
    */
    public java.lang.Integer getQtVagaTotalEad() {
        return this.qtVagaTotalEad;
    }

    /**
    * Define qtVagaTotalEad
    * @param qtVagaTotalEad qtVagaTotalEad
    * @generated
    */
    public CadastroCursos2020 setQtVagaTotalEad(java.lang.Integer qtVagaTotalEad) {
        this.qtVagaTotalEad = qtVagaTotalEad;
        return this;
    }
    /**
    * Obtém qtVagaTotalNoturno
    * return qtVagaTotalNoturno
    * @generated
    */
    public java.lang.Short getQtVagaTotalNoturno() {
        return this.qtVagaTotalNoturno;
    }

    /**
    * Define qtVagaTotalNoturno
    * @param qtVagaTotalNoturno qtVagaTotalNoturno
    * @generated
    */
    public CadastroCursos2020 setQtVagaTotalNoturno(java.lang.Short qtVagaTotalNoturno) {
        this.qtVagaTotalNoturno = qtVagaTotalNoturno;
        return this;
    }
    /**
    * Obtém qtVgNova
    * return qtVgNova
    * @generated
    */
    public java.lang.Integer getQtVgNova() {
        return this.qtVgNova;
    }

    /**
    * Define qtVgNova
    * @param qtVgNova qtVgNova
    * @generated
    */
    public CadastroCursos2020 setQtVgNova(java.lang.Integer qtVgNova) {
        this.qtVgNova = qtVgNova;
        return this;
    }
    /**
    * Obtém qtVgProgEspecial
    * return qtVgProgEspecial
    * @generated
    */
    public java.lang.Short getQtVgProgEspecial() {
        return this.qtVgProgEspecial;
    }

    /**
    * Define qtVgProgEspecial
    * @param qtVgProgEspecial qtVgProgEspecial
    * @generated
    */
    public CadastroCursos2020 setQtVgProgEspecial(java.lang.Short qtVgProgEspecial) {
        this.qtVgProgEspecial = qtVgProgEspecial;
        return this;
    }
    /**
    * Obtém qtVgRemanesc
    * return qtVgRemanesc
    * @generated
    */
    public java.lang.Integer getQtVgRemanesc() {
        return this.qtVgRemanesc;
    }

    /**
    * Define qtVgRemanesc
    * @param qtVgRemanesc qtVgRemanesc
    * @generated
    */
    public CadastroCursos2020 setQtVgRemanesc(java.lang.Integer qtVgRemanesc) {
        this.qtVgRemanesc = qtVgRemanesc;
        return this;
    }
    /**
    * Obtém sgUf
    * return sgUf
    * @generated
    */
    public java.lang.String getSgUf() {
        return this.sgUf;
    }

    /**
    * Define sgUf
    * @param sgUf sgUf
    * @generated
    */
    public CadastroCursos2020 setSgUf(java.lang.String sgUf) {
        this.sgUf = sgUf;
        return this;
    }
    /**
    * Obtém sitDesvinculado
    * return sitDesvinculado
    * @generated
    */
    public java.lang.Short getSitDesvinculado() {
        return this.sitDesvinculado;
    }

    /**
    * Define sitDesvinculado
    * @param sitDesvinculado sitDesvinculado
    * @generated
    */
    public CadastroCursos2020 setSitDesvinculado(java.lang.Short sitDesvinculado) {
        this.sitDesvinculado = sitDesvinculado;
        return this;
    }
    /**
    * Obtém sitFalecido
    * return sitFalecido
    * @generated
    */
    public java.lang.Short getSitFalecido() {
        return this.sitFalecido;
    }

    /**
    * Define sitFalecido
    * @param sitFalecido sitFalecido
    * @generated
    */
    public CadastroCursos2020 setSitFalecido(java.lang.Short sitFalecido) {
        this.sitFalecido = sitFalecido;
        return this;
    }
    /**
    * Obtém sitTrancada
    * return sitTrancada
    * @generated
    */
    public java.lang.Short getSitTrancada() {
        return this.sitTrancada;
    }

    /**
    * Define sitTrancada
    * @param sitTrancada sitTrancada
    * @generated
    */
    public CadastroCursos2020 setSitTrancada(java.lang.Short sitTrancada) {
        this.sitTrancada = sitTrancada;
        return this;
    }
    /**
    * Obtém sitTransferido
    * return sitTransferido
    * @generated
    */
    public java.lang.Short getSitTransferido() {
        return this.sitTransferido;
    }

    /**
    * Define sitTransferido
    * @param sitTransferido sitTransferido
    * @generated
    */
    public CadastroCursos2020 setSitTransferido(java.lang.Short sitTransferido) {
        this.sitTransferido = sitTransferido;
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
    public CadastroCursos2020 setTpCategoriaAdministrativa(java.lang.Short tpCategoriaAdministrativa) {
        this.tpCategoriaAdministrativa = tpCategoriaAdministrativa;
        return this;
    }
    /**
    * Obtém tpGrauAcademico
    * return tpGrauAcademico
    * @generated
    */
    public java.lang.Short getTpGrauAcademico() {
        return this.tpGrauAcademico;
    }

    /**
    * Define tpGrauAcademico
    * @param tpGrauAcademico tpGrauAcademico
    * @generated
    */
    public CadastroCursos2020 setTpGrauAcademico(java.lang.Short tpGrauAcademico) {
        this.tpGrauAcademico = tpGrauAcademico;
        return this;
    }
    /**
    * Obtém tpModalidadeEnsino
    * return tpModalidadeEnsino
    * @generated
    */
    public java.lang.Short getTpModalidadeEnsino() {
        return this.tpModalidadeEnsino;
    }

    /**
    * Define tpModalidadeEnsino
    * @param tpModalidadeEnsino tpModalidadeEnsino
    * @generated
    */
    public CadastroCursos2020 setTpModalidadeEnsino(java.lang.Short tpModalidadeEnsino) {
        this.tpModalidadeEnsino = tpModalidadeEnsino;
        return this;
    }
    /**
    * Obtém tpNivelAcademico
    * return tpNivelAcademico
    * @generated
    */
    public java.lang.Short getTpNivelAcademico() {
        return this.tpNivelAcademico;
    }

    /**
    * Define tpNivelAcademico
    * @param tpNivelAcademico tpNivelAcademico
    * @generated
    */
    public CadastroCursos2020 setTpNivelAcademico(java.lang.Short tpNivelAcademico) {
        this.tpNivelAcademico = tpNivelAcademico;
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
    public CadastroCursos2020 setTpOrganizacaoAcademica(java.lang.Short tpOrganizacaoAcademica) {
        this.tpOrganizacaoAcademica = tpOrganizacaoAcademica;
        return this;
    }
    /**
    * Obtém tpRede
    * return tpRede
    * @generated
    */
    public java.lang.Short getTpRede() {
        return this.tpRede;
    }

    /**
    * Define tpRede
    * @param tpRede tpRede
    * @generated
    */
    public CadastroCursos2020 setTpRede(java.lang.Short tpRede) {
        this.tpRede = tpRede;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
CadastroCursos2020 object = (CadastroCursos2020)obj;
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