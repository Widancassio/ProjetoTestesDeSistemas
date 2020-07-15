package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

	// Seletores

	private WebDriver driver;
	private WebDriverWait wait;
	private String pageUrl = "https://www.seleniumeasy.com/test/";

	private By navBarMenuEsquerdo = By.cssSelector(".navbar-nav");
	private By menuLateralExemplos = By.cssSelector(".navbar-right");
	private By navBarMenuDireito = By.cssSelector("#treemenu");
	private By dropdownInputForms = By.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li:nth-child(1) > a");

	private By menuItemSimpleFormDemo = By
			.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(1) > a");
	private By menuItemRadioButtonsDemo = By
			.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(2) > a");
	private By menuItemSelectDropdownList = By
			.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(3) > a");
	private By menuItemInputFormSubmit = By
			.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(4) > a");
	private By menuItemAjaxFormSubmit = By
			.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(5) > a");
	private By menuItemJQuerySelectDropdown = By
			.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(6) > a");

	private By dropdownDataPickers = By.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li.dropdown.open > a");
	private By menuItemBootstrapDatePicker = By
			.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(1) > a");
	private By menuItemJQueryDatePicker = By
			.cssSelector("#navbar-brand-centered > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(2) > a");

	private By btFecharAds = By.cssSelector("#at-cv-lightbox-close");
	
	
	// Ações

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public MainPage acessarPagina() {
		driver.get(pageUrl);
		return this;
	}
	
	public void clicarBotaoFecharAds() {
		wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(this.btFecharAds));
		driver.findElement(btFecharAds).click();
	}
	
	public void acessarSimpleFormDemo() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(menuItemSimpleFormDemo));
		driver.findElement(menuItemSimpleFormDemo).click();
	}
}
