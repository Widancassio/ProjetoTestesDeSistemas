package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import auxiliares.MetodosAuxiliares;
import runner.GerenciadorDeDriver;

public class NewsroomPageObject {

	private WebDriver driver;
	private String pageUrl = "https://www.apple.com/br/";
	private List<WebElement> topicos;
	private MetodosAuxiliares metValida = new MetodosAuxiliares();
	private WebDriverWait wait;

	// Seletores
	private By linkNewsroom = By.cssSelector("nav div:nth-child(5) div:nth-child(4) li a");
	private By clicarArquivoNewsroom = By.cssSelector(".ac-ln-menu-tray ul li:last-child a");
	private By botaoResetar = By.cssSelector(".filter-bar div div:nth-child(3) button");
	private By btResetar = By.cssSelector(".filter-bar div div:nth-child(3) button[data-original-tabindex]");
	private By dropdownTopicos = By.cssSelector(".filter-bar-dropdown-label-value");
	private By opMacDropdown = By.cssSelector(".filter-bar-dropdown-content li:nth-child(2)");
	private By listaDeTopicos = By.cssSelector(".filter-bar-dropdown--opened ul li");

	// Ações
	public NewsroomPageObject(WebDriver driver) {
		this.driver = driver;
		this.wait = GerenciadorDeDriver.getWait();
	}

	public NewsroomPageObject() {
		// TODO Auto-generated constructor stub
	}

	public NewsroomPageObject acessarPagina() {
		driver.get(pageUrl);
		return this;
	}

	public void acessarNewsroom() {
		acessarPagina();
		driver.findElement(linkNewsroom).click();
	}

	public void filtrarNewsroom() throws InterruptedException {
//		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(clicarArquivoNewsroom)).click();
//		driver.findElement(clicarArquivoNewsroom).click();
		driver.findElement(dropdownTopicos).click();
		driver.findElement(opMacDropdown).click();
	}

	public void resetarFiltros() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(btResetar)).click();
	}

	public String filtroPosReset() {
		return driver.findElement(dropdownTopicos).getText();
	}

	public boolean validaBotaoOffTela() {
		WebElement btReset = driver.findElement(botaoResetar);
		if (btReset.getAttribute("data-original-tabindex") != null) {
			return false;
		}
		return true;
	}

	// compara os elementos retornados da pagina com os objetos que temos na base
	// e retorna true ou false
	public boolean validarTopicosAll() {
		int cont = 0;
		metValida.preencherListaDeTopicos();
		topicos = driver.findElements(listaDeTopicos);
		for (int i = 0; i < topicos.size(); i++) {
			if (metValida.getTopicos().contains(topicos.get(i).getText())) {
				cont++;
			}
		}
		if (cont == 16) {
			return true;
		} else {
			return false;
		}
	}

	public WebDriver getDriver() {
		return driver;
	}

}
