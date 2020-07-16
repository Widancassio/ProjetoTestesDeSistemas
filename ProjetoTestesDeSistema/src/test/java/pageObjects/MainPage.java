package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

	// Seletores

	private WebDriver driver;
	private WebDriverWait wait;
	private String pageUrl = "https://www.apple.com/br/";

	private By navBar = By.cssSelector("#ac-globalnav");
	private By linkSuporte = By.cssSelector(".ac-gn-support");
	private By iconeIPhoneSuporte = By.cssSelector(".as-imagegrid-img-cont img");
	private By manualIPhone = By.cssSelector(".as-center .u-layout--2up img");

	// Ações

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	public MainPage acessarPagina() {
		driver.get(pageUrl);
		return this;
	}

	public void clicarLinkSuporte() {

		driver.findElement(linkSuporte).click();
	}

	public void clicarPdtIPhoneSuporte() {

		driver.findElement(iconeIPhoneSuporte).click();
	}

	public void clicarManualIPhone() {

		driver.findElement(manualIPhone).click();
	}
//	public void acessarSimpleFormDemo() {
//		wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(menuItemSimpleFormDemo));
//		driver.findElement(menuItemSimpleFormDemo).click();
//	}
}
