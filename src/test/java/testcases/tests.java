package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tests {

	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}

		else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}

		driver.get("https://www.testingementor.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
