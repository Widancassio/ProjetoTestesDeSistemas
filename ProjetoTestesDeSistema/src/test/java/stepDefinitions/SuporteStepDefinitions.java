package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SuportePageObject;
import runner.GerenciadorDeDriver;

public class SuporteStepDefinitions {

	private WebDriver driver = GerenciadorDeDriver.getDriver();
	private SuportePageObject supPagObj;

	@Given("o usuario acessa o site Apple")
	public void usuarioAcessaSiteApple() {
		supPagObj = new SuportePageObject(driver);
		supPagObj.acessarPagina();
	}

	@When("usuario clica no botao suporte")
	public void clicarBotaoSuporte() {
		supPagObj.clicarLinkSuporte();
	}

	@When("clica no icone iPhone")
	public void clicaIconeIPhone() {
		supPagObj.clicarPdtIPhoneSuporte();
	}

	@When("o usuario clica no botao Manual do usuario do iPhone")
	public void clicarBotaoManualIPhone() {
		supPagObj.clicarManualIPhone();
	}

	@Then("e exibido o manual do iPhone.")
	public void exibirManualIPhone() {
		String msgTelaManual = supPagObj.validaPaginaManual();
		assertEquals("Mensagem não condiz com a esperada!", SuportePageObject.expectedMsgManual ,msgTelaManual);
	}

	@Given("o usuario acessa {string}")
	public void o_usuario_acessa(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("seleciona o produto {string}")
	public void seleciona_o_produto(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
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
