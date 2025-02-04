package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import auxiliares.Constantes;
import runner.GerenciadorDeDriver;

public class LojaPageObject {

	private WebDriver driver;
	private String pageUrl = "https://www.apple.com/br/";
	private WebDriverWait wait;

	// Seletores
	private By linkMusic = By.cssSelector(".ac-gn-link-music");
	private By linkIPhone = By.cssSelector(".ac-gn-link-iphone");
	private By linkIPhone11Pro = By.cssSelector(".chapternav-items li:nth-child(1) a");
	private By linkAirPods = By.cssSelector(".chapternav-item-airpods a");
	private By linkAirPodsPro = By.cssSelector(".chapternav-item-airpods-pro a");
	private By botaoComprarPagDemo = By.cssSelector(".ac-ln-content .ac-ln-menu .ac-ln-action-button a");
	private By botaoComprarAirPods = By.cssSelector(".pd-container-two a");
	private By botaoColocarNaSacola = By.cssSelector(".as-pdp-displayarea button");
	private By iconeSacolaNavbar = By.cssSelector(".ac-gn-list li:last-child");
	private By linkSacola = By.cssSelector(".ac-gn-bagview-nav li:nth-child(1)");
	private By linkRemoverSacola = By.cssSelector(".rs-iteminfo-pricedetails button");
	private By alertaSacolaVazia = By.cssSelector("#bag-content h1");
	private By btComprarTelaAirPodsPro = By.cssSelector(".ac-ln-content .ac-ln-button");
	private By headerSacola = By.cssSelector(".rs-bag-header");
	private By produtoAirPodsPro = By.cssSelector("#cart-items h2 a");
	private By modeloIPhone11Pro = By.cssSelector(".as-dimension-choices .form-selector-twocolumns:nth-child(1)");
	private By corIPhone11Pro = By.cssSelector(".as-dimension-color .form-selector-singlecolumn:nth-child(4)");
	private By capacidadeIPhone11Pro = By.cssSelector("#primary #Item3 .form-selector > div:nth-child(1)");
	private By botaoColocarNaSacolaIPhone11Pro = By.cssSelector(".as-purchaseinfo-button button");
	private By dropdownQtdProdutos = By.cssSelector(".rs-quantity-dropdown option:nth-child(3)");
	private By valorTotalSacola = By.cssSelector(".rs-iteminfo-pricedetails span");
	private By qtdItensSacola = By.cssSelector("#ac-gn-bag .ac-gn-bag-badge-number");

	// A��es
	public LojaPageObject(WebDriver driver) {
		this.driver = driver;
		this.wait = GerenciadorDeDriver.getWait();
	}

	public LojaPageObject() {
		// TODO Auto-generated constructor stub
	}

	public LojaPageObject acessarPagina() {
		driver.get(pageUrl);
		return this;
	}

	public void inserirProdutoSacola() {
		selecionarProduto("Music");
		selecionarPdtsMusic("AirPods");
		clicarBtComprarPagDemo();
		driver.findElement(botaoComprarAirPods).click();
		clicarBtColocarNaSacola();
	}

	public void abrirSacola() {
		driver.findElement(iconeSacolaNavbar).click();
	}

	public void clicarLinkSacola() {
		driver.findElement(linkSacola).click();
	}

	public void clicarLinkRemoverDaSacola() {
		wait.until(ExpectedConditions.elementToBeClickable(linkRemoverSacola)).click();
	}

	public String alertaSacola() throws InterruptedException {
		wait.until(ExpectedConditions.textToBe(alertaSacolaVazia, Constantes.MSG_SACOLA_VAZIA));
		return driver.findElement(alertaSacolaVazia).getText();
	}

	public void selecionarProduto(String produto) {

		if (produto.equals("Music")) {
			driver.findElement(linkMusic).click();
		} else if (produto.equals("iPhone")) {
			driver.findElement(linkIPhone).click();
		}
	}

	public void selecionarPdtsMusic(String pdtMusic) {
		if (pdtMusic.equals("AirPods Pro")) {
			driver.findElement(linkAirPodsPro).click();
		} else if (pdtMusic.equals("AirPods")) {
			driver.findElement(linkAirPods).click();
		}
	}

	public void selecionarPdtsIPhone(String pdtIPhone) {
		if (pdtIPhone.equals("iPhone 11 Pro")) {
			driver.findElement(linkIPhone11Pro).click();
		}
	}

	public void clicarBtComprarTelaAirPodsPro() {
		driver.findElement(btComprarTelaAirPodsPro).click();
	}

	public void clicarBtColocarNaSacola() {
		driver.findElement(botaoColocarNaSacola).click();
	}

	public String validaHeaderSacola() {
		return driver.findElement(headerSacola).getText();
	}

	public String validaProdutoSacola() {
		return driver.findElement(produtoAirPodsPro).getText();
	}

	public void clicarBtComprarPagDemo() {
		driver.findElement(botaoComprarPagDemo).click();
	}

	public void personalizarIPhone11Pro() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(modeloIPhone11Pro)).click();
		wait.until(ExpectedConditions.elementToBeClickable(corIPhone11Pro)).click();
		wait.until(ExpectedConditions.elementToBeClickable(capacidadeIPhone11Pro)).click();
	}

	public void validaBtColocaSacolaExibido() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(botaoColocarNaSacolaIPhone11Pro));
	}

	public void alterarQtdItensSacola() {
		driver.findElement(dropdownQtdProdutos).click();
	}

	public String validarValorTotal() throws InterruptedException {
		wait.until(ExpectedConditions.textToBe(valorTotalSacola, Constantes.VALOR_TOTAL_SACOLA));
		return driver.findElement(valorTotalSacola).getText();
	}

	public int validarQtdItensSacola() {
		int qtdItens = Integer.parseInt(driver.findElement(qtdItensSacola).getText());
		return qtdItens;
	}
}
