package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import auxiliares.Constantes;
import auxiliares.MetodosValidadores;
import io.cucumber.core.backend.Container;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SuportePageObject;
import runner.GerenciadorDeDriver;

public class SuporteStepDefinitions {

	private WebDriver driver = GerenciadorDeDriver.getDriver();
	private SuportePageObject supPagObj;
	private MetodosValidadores metValida = new MetodosValidadores();

	// ******* Backgrounds da funcionalidade Suporte
	// **********************************************************************************

	// esse step será executado sempre antes dos próximos pois o mesmo está definido
	// como background.
	@Given("o usuario acessa o site Apple")
	public void usuarioAcessaSiteApple() {
		supPagObj = new SuportePageObject(driver);
		supPagObj.acessarPagina();
	}

	// esse step será executado sempre antes dos próximos pois o mesmo está definido
	// como background.
	@Given("o usuario esteja na area de suporte")
	public void acessarAreaSuporte() {
		supPagObj.clicarLinkSuporte();
	}

	// ********** Metodos do cenário Visualizar manual do iPhone
	// *******************************************************************************

	// step responsavel por escolher o produto do suporte através de um clique no
	// icone do produto desejado
	// OBS este Given também está sendo usado no cenário @AlterarProdutoSuporte
	@Given("o usuario escolha o produto {string}")
	public void selecionarPdtSuporte(String string) {
		supPagObj.clicarPdtSuporte(string);
	}

	// step responsavel por clicar no botao Manual atraves de um clique na imagem do
	// Manual
	@When("o usuario clica no botao Manual do usuario do iPhone")
	public void clicarBotaoManualIPhone() {
		supPagObj.clicarManualIPhone();
	}

	// step responsavel por realizar a assertiva com a mensagem de exibição da
	// pagina do manual do iphone
	@Then("e exibido o manual do iPhone.")
	public void exibirManualIPhone() {
		String msgTelaManual = supPagObj.validaPaginaManual();
		assertEquals("Mensagem não condiz com a esperada!", Constantes.expectedMsgManual, msgTelaManual);
	}

	// ********** Metodos do cenário Alterar produto que recebera
	// suporte***********************************************************************
	// step responsavel por iniciar uma nova solicitação de serviço de reparo para o
	// produto
	@Given("inicie uma solicitacao de servico")
	public void iniciarSolicitacaoServico() {
		supPagObj.iniciarReparoMac();
	}

	// step responsavel por clicar no link de alterar produto
	@When("usuario clica no link Alterar produto")
	public void alterarProdutoSuporte() throws InterruptedException {
		Thread.sleep(3000);
		supPagObj.alterarPdtSuporte();
	}

	// step responsavel por escolher o novo produto para reparo
	@When("seleciona o produto {string}")
	public void selecionarNovoProduto(String produto) throws InterruptedException {
		Thread.sleep(3000);
		supPagObj.selecionarNovoPdtSuporte(produto);
	}

	// step que valida se o produto escolhido está correto
	@Then("tela de suporte do {string} e exibida")
	public void validarMsgTelaNovoPdtSuporte(String produto) throws InterruptedException {
		Thread.sleep(3000);
		String msgTelaNovoPdtSuporte = supPagObj.validaPaginaNovoPdtSuporte();
		assertEquals("Mensagem não condiz com o produto escolhido!", metValida.validaMsgProdutoSuporte(produto),
				msgTelaNovoPdtSuporte);
	}

	// ********** Metodos do cenário Alterar produto que recebera
	// suporte***********************************************************************
	// step responsavel por clicar no link da pagina AASP
	@When("usuario clica no botao Centro de Servico Autorizado Apple AASP")
	public void clicarLinkAASP() {
		supPagObj.clicarLinkAASP();
	}

	// step responsavel por clicar no link de servico e suporte da pagina AASP
	@When("clica no botao servico e suporte")
	public void clicarLinkServSupAASP() {
		supPagObj.clicarLinkServicoSuporteAASP();
	}

	// step responsavel por validar a mensagem exibida e confirmar tela correta
	@Then("e exibida uma mensagem de alerta")
	public void validarPaginaServSuporte() {
		assertEquals("Mensagem não condiz com esperado!", Constantes.expectedMsgPagAASPServSuporte,
				supPagObj.validarMsgTelaAASP());
	}

}
