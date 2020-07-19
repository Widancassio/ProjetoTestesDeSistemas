package stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import auxiliares.Constantes;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BuscaPageObject;
import runner.GerenciadorDeDriver;

public class BuscaStepDefinitions {

	private WebDriver driver = GerenciadorDeDriver.getDriver();
	private BuscaPageObject buscaPagObj;

	@Given("usuario acessa o site Apple")
	public void usuarioAcessaSiteApple() {
		buscaPagObj = new BuscaPageObject(driver);
		buscaPagObj.acessarPagina();
	}

	@When("o usuario acessa o campo de busca")
	public void clicarCampoBusca() {
		buscaPagObj.clicarCampoBusca();
	}

	@When("o usuario clica no link Encontre uma loja")
	public void clicarEncontraLoja() {
		buscaPagObj.clicarLinkEncontraLoja();
	}

	@When("clica em lista completa de lojas")
	public void buscaListaCompleta() {
		buscaPagObj.clicarListaCompletaLoja();
	}

	@Then("e exibida a lista de lojas do brasil")
	public void validarLojasBrasil() {
		assertEquals("Header diferente do esperado!", Constantes.HEADER_LOJAS, buscaPagObj.validaHeaderLojas());
		assertTrue("Lojas diferentes do esperado", buscaPagObj.validarLojasBrasil());
	}

}
