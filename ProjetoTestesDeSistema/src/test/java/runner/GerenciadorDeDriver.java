package runner;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GerenciadorDeDriver {

	private static WebDriver driver;
	private static WebDriverWait wait;

	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\w.galindo.da.silva\\git\\repository\\TestesSistema\\src\\test\\resources\\chromedriver.exe");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
		return driver;
	}

	public static void endSession() {
		if (driver != null) {
			driver.quit();
			driver = null;
			wait = null;
		}
	}

	public static WebDriverWait getWait() {
		if (wait == null) {
			wait = new WebDriverWait(getDriver(), 20);
		}
		return wait;
	}
}
