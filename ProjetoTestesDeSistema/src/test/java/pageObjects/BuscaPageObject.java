package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import auxiliares.MetodosAuxiliares;

public class BuscaPageObject {

	private WebDriver driver;
	private String pageUrl = "https://www.apple.com/br/";
	private List<WebElement> lojas;
	private MetodosAuxiliares metValida = new MetodosAuxiliares();

	// Seletores
	private By campoBusca = By.cssSelector("#ac-globalnav .ac-gn-list .ac-gn-search");
	private By linkEncontreLoja = By.cssSelector("#ac-gn-searchresults ul li:nth-child(2) a");
	private By linkListaLojas = By.cssSelector("#retail-nav-search .store-list a");
	private By headerPagListaLojas = By.cssSelector(".main .section-switch-country .country-header");
	private By lojasBrasil = By.cssSelector(".section-country-stores #brstores ul:nth-child(1) a");

	// Ações
	public BuscaPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public BuscaPageObject() {
		// TODO Auto-generated constructor stub
	}

	public BuscaPageObject acessarPagina() {
		driver.get(pageUrl);
		return this;
	}

	public void clicarCampoBusca() {
		driver.findElement(campoBusca).click();
	}

	public void clicarLinkEncontraLoja() {
		driver.findElement(linkEncontreLoja).click();
	}

	public void clicarListaCompletaLoja() {
		driver.findElement(linkListaLojas).click();
	}

	public String validaHeaderLojas() {
		return driver.findElement(headerPagListaLojas).getText();
	}

	// compara os elementos retornados da pagina com os objetos que temos na base
	// e retorna true ou false
	public boolean validarLojasBrasil() {
		int cont = 0;
		metValida.preencherListaLojasBrasil();
		lojas = driver.findElements(lojasBrasil);
		for (int i = 0; i < lojas.size(); i++) {
			if (metValida.getLojasBrasil().contains(lojas.get(i).getText())) {
				cont++;
			}
		}
		if (cont == 2) {
			return true;
		} else {
			return false;
		}
	}

}
