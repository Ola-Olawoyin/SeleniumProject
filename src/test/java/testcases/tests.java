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

		driver.get("https://www.qa.way2automation.com");
                driver.findElements(RelativeLocator.with(By.TagName("input").above(By.tagName("select").get(2).sendKeys("Ola Olawoyin");
		driver.findElements(RelativeLocator.with(By.TagName("input").above(By.tagName("select").get(1).sendKeys("07588859542");
		driver.findElements(RelativeLocator.with(By.TagName("input").above(By.tagName("select").get(0).sendKeys("oola.olawoyin@gmail.com");
		driver.findElements(RelativeLocator.with(By.TagName("input").below(By.tagName("select").get(0).sendKeys("London");
		driver.findElements(RelativeLocator.with(By.TagName("input").above(By.tagName("select").get(1).sendKeys("Ola17");
		driver.findElements(RelativeLocator.with(By.TagName("input").above(By.tagName("select").get(2).sendKeys("QAAuto17@");
		driver.findElement(RelativeLocator.with(By.TagName("input").get.near(By.linkText("Signin").click();
		//System.out.println(driver.getTitle());
		//driver.quit();

	}

}
