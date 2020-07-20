package stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import auxiliares.Constantes;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.NewsroomPageObject;
import runner.GerenciadorDeDriver;

public class NewsroomStepDefinitions {

	private WebDriver driver = GerenciadorDeDriver.getDriver();
	private NewsroomPageObject newsPageObject;

	@Given("o usuario acesse a pagina de Newsroom")
	public void acessarPaginaNewsroom() {
		newsPageObject = new NewsroomPageObject(driver);
		newsPageObject.acessarPagina();
		newsPageObject.acessarNewsroom();
	}

	@Given("o usuario realiza um filtro")
	public void realizarFiltroNewsroom() throws InterruptedException {
		newsPageObject.filtrarNewsroom();
	}

	@When("o usuario clica no botao resetar")
	public void clicarBotaoResetar() throws InterruptedException {
		newsPageObject.resetarFiltros();
	}

	@Then("os filtros sao resetados")
	public void validarFiltrosResetados() {
		assertEquals("Filtros não foram resetados", Constantes.VALOR_FILTRO_POS_RESET, newsPageObject.filtroPosReset());
	}

	@Then("sao exibidos todos os topicos")
	public void validarTopicosExibidos() {
		newsPageObject.validarTopicosAll();
	}

	@Then("o botao resetar sera removido da tela")
	public void validarBotaoResetarOff() {
		assertTrue("Botão não desapareceu da tela!", newsPageObject.validaBotaoOffTela());
	}

}
