package runner;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pageObjects.MainPage;

public class Executor {

	WebDriver gDriver = GerenciadorDeDriver.abrirDriver();
	MainPage mainPage = new MainPage(gDriver);

	@Test
	public void acessarSiteApple() throws InterruptedException {

		mainPage.acessarPagina();
		mainPage.clicarLinkSuporte();
		mainPage.clicarPdtIPhoneSuporte();
		mainPage.clicarManualIPhone();
		gDriver.quit();
		

	}

}
