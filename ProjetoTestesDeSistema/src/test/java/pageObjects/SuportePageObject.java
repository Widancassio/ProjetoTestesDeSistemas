package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import auxiliares.MetodosAuxiliares;

public class SuportePageObject {

	private WebDriver driver;
	private String pageUrl = "https://www.apple.com/br/";
	private List<WebElement> programas;
	private MetodosAuxiliares metValida = new MetodosAuxiliares();

	// Seletores
	private By linkSuporte = By.cssSelector(".ac-gn-support");
	private By iconeIPhoneSuporte = By.cssSelector(".as-imagegrid-img-cont img");
	private By iconeMacSuporte = By.cssSelector(".as-imagegrid .as-imagegrid-item + div img");
	private By manualIPhone = By.cssSelector(".as-center .u-layout--2up img");
	private By msgTelaManual = By.cssSelector("#header-section .Name");
	private By linkSaibaMaisReparos = By.cssSelector(".main .u-layout-item:nth-child(2) a");
	private By linkIniciarReparo = By.cssSelector("#faq-regular .container:nth-child(1) p:nth-child(2) a");
	private By linkAlterarProduto = By.cssSelector("body #aw-page-wrapper .change-product-link > span");
	private By novoPdtMac = By.cssSelector(".all-product-button-container li:nth-child(1)");
	private By novoPdtIPad = By.cssSelector(".all-product-button-container li:nth-child(2)");
	private By novoPdtIPhone = By.cssSelector(".all-product-button-container li:nth-child(3)");
	private By novoPdtAppleWatch = By.cssSelector(".all-product-button-container li:nth-child(4)");
	private By novoPdtAirPods = By.cssSelector(".all-product-button-container li:nth-child(5)");
	private By msgTelaNovoPdtSuporte = By.cssSelector(".main-body-hero-container h1");
	private By linkAASP = By.cssSelector(".main > div:nth-child(11) p a:nth-child(2)");
	private By servSupAASP = By.cssSelector("#service img");
	private By msgTelaAASPSevSuporte = By.cssSelector(".page-body #qp-awareness-content");
	private By linkTodosProgramas = By.cssSelector(".main div:last-child ul li:last-child a");
	private By msgPaginaTodosProgramas = By.cssSelector(".main .table-responsive h1");
	private By listaDeProgramas = By.cssSelector(".main section .icon-chevronright");

	// Ações
	public SuportePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public SuportePageObject() {
		// TODO Auto-generated constructor stub
	}

	public SuportePageObject acessarPagina() {
		driver.get(pageUrl);
		return this;
	}

	public void clicarLinkSuporte() {
		driver.findElement(linkSuporte).click();
	}

	public void clicarPdtSuporte(String produto) {
		if (produto.equals("IPhone")) {
			driver.findElement(iconeIPhoneSuporte).click();
		} else if (produto.equals("Mac")) {
			driver.findElement(iconeMacSuporte).click();
		}
	}

	public void clicarManualIPhone() {
		driver.findElement(manualIPhone).click();
	}

	public String validaPaginaManual() {
		return driver.findElement(msgTelaManual).getText();
	}

	public void iniciarReparoMac() {
		driver.findElement(linkSaibaMaisReparos).click();
		driver.findElement(linkIniciarReparo).click();
	}

	public void alterarPdtSuporte() {
		driver.findElement(linkAlterarProduto).click();
	}

	public void selecionarNovoPdtSuporte(String produto) {
		if (produto.equals("Mac")) {
			driver.findElement(novoPdtMac).click();
		} else if (produto.equals("IPad")) {
			driver.findElement(novoPdtIPad).click();
		} else if (produto.equals("IPhone")) {
			driver.findElement(novoPdtIPhone).click();
		} else if (produto.equals("Apple Watch")) {
			driver.findElement(novoPdtAppleWatch).click();
		} else if (produto.equals("AirPods")) {
			driver.findElement(novoPdtAirPods).click();
		}
	}

	public String validaPaginaNovoPdtSuporte() {
		return driver.findElement(msgTelaNovoPdtSuporte).getText();
	}

	public void clicarLinkAASP() {
		driver.findElement(linkAASP).click();
	}

	public void clicarLinkServicoSuporteAASP() {
		driver.findElement(servSupAASP).click();
	}

	public String validarMsgTelaAASP() {
		return driver.findElement(msgTelaAASPSevSuporte).getText();
	}

	public void clicarLinkTdsProgramas() {
		driver.findElement(linkTodosProgramas).click();
	}

	public String msgTelaTdsProgramas() {
		return driver.findElement(msgPaginaTodosProgramas).getText();
	}

	// compara os elementos retornados da pagina com os objetos que temos na base
	// e retorna true ou false
	public boolean validarTodosProgramas() {
		int cont = 0;
		metValida.preencherListaDeProgramas();
		programas = driver.findElements(listaDeProgramas);
		for (int i = 0; i < programas.size(); i++) {
			if (metValida.getProgramas().contains(programas.get(i).getText())) {
				cont++;
			}
		}
		if (cont == 14) {
			return true;
		} else {
			return false;
		}
	}

}
