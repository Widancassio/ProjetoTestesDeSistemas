package runner;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GerenciadorDeDriver {

	private static WebDriver driver;

	public static WebDriver abrirDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\w.galindo.da.silva\\git\\repository\\TestesSistema\\src\\test\\resources\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	
	
	public static void fecharDriver() {
		driver.quit();
	}
}
