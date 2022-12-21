window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Cadastro = window.blockly.js.blockly.Cadastro || {};

/**
 * @function AdicionarEscolha
 *
 * Descreva esta função...
 *
 * @param curso
 * @param instituicao
 * @param iraCursar
 * @param status
 *
 * @author Pedro Barreto
 * @since 14/12/2022 19:03:22
 *
 */
window.blockly.js.blockly.Cadastro.AdicionarEscolhaArgs = [{ description: 'curso', id: '4a370591' }, { description: 'instituicao', id: '963eb95a' }, { description: 'iraCursar', id: 'fe411022' }, { description: 'status2', id: '576440e0' }];
window.blockly.js.blockly.Cadastro.AdicionarEscolha = async function(curso, instituicao, iraCursar, status2) {
 var status;
  //
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.Cadastro:SalvarEscolha', async function(sender_item) {
      item = sender_item;
    //
    if (item) {
      //
      this.cronapi.screen.hideModal("modalAdicionar");
      //
      this.cronapi.screen.refreshDatasource("ListaDeEscolhas", 'false');
    } else {
      //
      this.cronapi.screen.notify('info','Não é possível adicionar');
    }
  }.bind(this), curso, instituicao, iraCursar, status2);
}

/**
 * @function Salva
 *
 * Descreva esta função...
 *
 * @param ies
 * @param curso
 * @param iraCursar
 * @param status
 * @param mostrar
 * @param esconder
 *
 * @author Pedro Barreto
 * @since 14/12/2022 19:03:22
 *
 */
window.blockly.js.blockly.Cadastro.SalvaArgs = [{ description: 'ies', id: '65250eca' }, { description: 'curso', id: '1fa96b44' }, { description: 'iraCursar', id: '1a465ffe' }, { description: 'status2', id: '030f397f' }, { description: 'mostrar', id: '52044ef2' }, { description: 'esconder', id: '7546931d' }];
window.blockly.js.blockly.Cadastro.Salva = async function(ies, curso, iraCursar, status2, mostrar, esconder) {

  //
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.Cadastro:SalvarEscolha', async function(sender_item) {
      item = sender_item;
    //
    if (item) {
      //
      this.cronapi.screen.notify('success','Salvo');
      //
      this.cronapi.screen.hideComponent(esconder);
      //
      this.cronapi.screen.showComponent(mostrar);
      //
      this.cronapi.screen.refreshDatasource("Escolhas", 'false');
    } else {
      //
      this.cronapi.screen.notify('info','Não foi possível salvar sua escolha.');
    }
  }.bind(this), ies, curso, iraCursar, status2);
}
