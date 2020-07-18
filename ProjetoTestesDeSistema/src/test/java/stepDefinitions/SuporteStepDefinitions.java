package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import auxiliares.Constantes;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SuportePageObject;
import runner.GerenciadorDeDriver;

public class SuporteStepDefinitions {

	private WebDriver driver = GerenciadorDeDriver.getDriver();
	private SuportePageObject supPagObj;

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
	public void usuario_clica_no_link_Alterar_produto() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("seleciona o novo produto")
	public void seleciona_o_novo_produto() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("tela de suporte do novo produto e exibida")
	public void tela_de_suporte_do_novo_produto_e_exibida() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("o usuario acessa a area de suporte")
	public void o_usuario_acessa_a_area_de_suporte() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("clica no botao Centro de Servico Autorizado Apple \\(AASP)")
	public void clica_no_botao_Centro_de_Servico_Autorizado_Apple_AASP() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("clica no botao servico e suporte")
	public void clica_no_botao_servico_e_suporte() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("e exibida a mensagem {string}")
	public void e_exibida_a_mensagem(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
