package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectATV32 {

	// Seletores

		private WebDriver driver;
		private WebDriverWait wait;
		private String pageUrl = "https://www.seleniumeasy.com/test/";

		private By btTableMenu = By.cssSelector("#navbar-brand-centered .nav > li:nth-child(3)");
		private By btTableSortSearch = By.cssSelector(".dropdown-menu > li:nth-child(4)");
		private By seletorSearchInput = By.cssSelector("#example_filter input");
		private By seletorLinhasTabela = By.cssSelector("#example tbody tr");
		private By seletorMsgShowing = By.cssSelector("#example_info");
		

		private By btFecharAds = By.cssSelector("#at-cv-lightbox-close");
		
		
		// Ações

		public PageObjectATV32(WebDriver driver) {
			this.driver = driver;
		}

		
		public PageObjectATV32 acessarPagina() {
			driver.get(pageUrl);
			return this;
		}
		
		public void clicarBotaoFecharAds() {
			wait = new WebDriverWait(driver, 10);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(this.btFecharAds));
			driver.findElement(btFecharAds).click();
		}
		
		public void acessarTable() {
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(btTableMenu));
			driver.findElement(btTableMenu).click();
			driver.findElement(btTableSortSearch).click();
		}
	
}
