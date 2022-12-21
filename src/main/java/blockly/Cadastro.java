package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Cadastro {

public static final int TIMEOUT = 300;

/**
 *
 * Descreva esta função...
 *
 * @param ies<app.entity.CadastroIes2020>
 *
 * @author Pedro Barreto
 * @since 13/12/2022 17:16:49
 *
 */
public static Var NovoNome(@ParamMetaData(description = "ies", id = "55c68077") Var ies) throws Exception {
 return new Callable<Var>() {

   private Var nome = Var.VAR_NULL;
   private Var sg = Var.VAR_NULL;

   public Var call() throws Exception {
    nome =
    cronapi.object.Operations.getObjectField(ies, Var.valueOf("noIes"));
    sg =
    cronapi.object.Operations.getObjectField(ies, Var.valueOf("sgIes"));
    return
Var.valueOf(
nome.getObjectAsString() +
Var.valueOf(" - ").getObjectAsString() +
sg.getObjectAsString());
   }
 }.call();
}

/**
 *
 * cadastro
 *
 * @param ies
 * @param curso
 * @param iraCursar
 * @param status
 *
 * @author Pedro Barreto
 * @since 13/12/2022 17:16:49
 *
 */
public static Var SalvarEscolha(@ParamMetaData(description = "ies", id = "f5605017") Var ies, @ParamMetaData(description = "curso", id = "2500aae1") Var curso, @ParamMetaData(description = "iraCursar", id = "905fdff0") Var iraCursar, @ParamMetaData(description = "status", id = "49cc2338") Var status) throws Exception {
 return new Callable<Var>() {

   private Var retorno = Var.VAR_NULL;
   private Var exp = Var.VAR_NULL;

   public Var call() throws Exception {
    retorno =
    Var.VAR_FALSE;
    if ((
    Var.valueOf(
    cronapi.logic.Operations.isNullOrEmpty(curso).getObjectAsBoolean() ||
    cronapi.logic.Operations.isNullOrEmpty(ies).getObjectAsBoolean()))
    .negate().getObjectAsBoolean()) {
        try {
             cronapi.database.Operations.insert(Var.valueOf("app.entity.Escolhas"),Var.valueOf("usuario",
            cronapi.util.Operations.getCurrentUserName()),Var.valueOf("curso",curso),Var.valueOf("instituicao",ies),Var.valueOf("iraCursar",iraCursar),Var.valueOf("status",status));
            retorno =
            Var.VAR_TRUE;
         } catch (Exception exp_exception) {
              exp = Var.valueOf(exp_exception);
             cronapi.util.Operations.log(
            Var.valueOf("General"),
            Var.valueOf("SEVERE"),
            Var.valueOf("Erro ao salvar."), exp);
         }
    }
    return retorno;
   }
 }.call();
}

/**
 *
 * Descreva esta função...
 *
 * @param curso
 * @param instituicao
 *
 * @author Pedro Barreto
 * @since 13/12/2022 17:16:49
 *
 */
public static Var adicionar(@ParamMetaData(description = "curso", id = "50789bcb") Var curso, @ParamMetaData(description = "instituicao", id = "4e6c784a") Var instituicao) throws Exception {
 return new Callable<Var>() {

   private Var retorno = Var.VAR_NULL;
   private Var total = Var.VAR_NULL;
   private Var usuario = Var.VAR_NULL;

   public Var call() throws Exception {
    retorno =
    Var.VAR_FALSE;
    usuario =
    cronapi.text.Operations.normalize(
    cronapi.util.Operations.getCurrentUserName());
    total =
    Var.valueOf(consultarTotalEscolhas());
    if (
    Var.valueOf(total.compareTo(
    Var.valueOf(3)) < 0).getObjectAsBoolean()) {
        retorno =
        Var.valueOf(SalvarEscolha(instituicao, curso, Var.VAR_NULL, Var.VAR_NULL));
    }
    return retorno;
   }
 }.call();
}

/**
 *
 * Descreva esta função...
 *
 * @author Pedro Barreto
 * @since 13/12/2022 17:16:49
 *
 */
public static Var consultarTotalEscolhas() throws Exception {
 return new Callable<Var>() {

   private Var total = Var.VAR_NULL;

   public Var call() throws Exception {
    total =
    cronapi.list.Operations.size(
    cronapi.database.Operations.query(Var.valueOf("app.entity.Escolhas"),Var.valueOf("select \n	e.id \nfrom \n	Escolhas e \nwhere \n	e.usuario = :usuario"),Var.valueOf("usuario",
    cronapi.util.Operations.getCurrentUserName())));
    return total;
   }
 }.call();
}

}

