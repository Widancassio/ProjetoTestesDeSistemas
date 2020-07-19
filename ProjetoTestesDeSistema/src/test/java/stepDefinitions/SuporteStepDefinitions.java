package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import auxiliares.Constantes;
import auxiliares.MetodosValidadores;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SuportePageObject;
import runner.GerenciadorDeDriver;

public class SuporteStepDefinitions {

	private WebDriver driver = GerenciadorDeDriver.getDriver();
	private SuportePageObject supPagObj;
	private MetodosValidadores metValida = new MetodosValidadores();

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

	// step responsavel por escolher o produto do suporte através de um clique no
	// icone do produto desejado
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

	@Given("inicie uma solicitacao de servico")
	public void iniciarSolicitacaoServico() {
		supPagObj.iniciarReparoMac();
	}

	@When("usuario clica no link Alterar produto")
	public void alterarProdutoSuporte() throws InterruptedException {
		Thread.sleep(3000);
		supPagObj.alterarPdtSuporte();
	}

	@When("seleciona o produto {string}")
	public void selecionarNovoProduto(String produto) throws InterruptedException {
		Thread.sleep(3000);
		supPagObj.selecionarNovoPdtSuporte(produto);
	}

	@Then("tela de suporte do {string} e exibida")
	public void validaMsgTelaNovoPdtSuporte(String produto) throws InterruptedException {
		Thread.sleep(3000);
		String msgTelaNovoPdtSuporte = supPagObj.validaPaginaNovoPdtSuporte();
		assertEquals("Mensagem não condiz com o produto escolhido!", metValida.validaMsgProdutoSuporte(produto),
				msgTelaNovoPdtSuporte);
	}

}
