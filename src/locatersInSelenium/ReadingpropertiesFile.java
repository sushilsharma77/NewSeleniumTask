package locatersInSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadingpropertiesFile {

	static String browser;
	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\sushi\\eclipse-workspace"
		+ "\\NewSeleniumWork\\configs.properties");
		prop.load(file);

		browser = prop.getProperty("browser");
		System.out.println(browser);

		String url = prop.getProperty("url");
		System.out.println(url);

		String uname = prop.getProperty("userName");
		System.out.println(uname);

		String pword = prop.getProperty("password");
		System.out.println(pword);

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
		} else {
			System.out.println("Invalid browser.");
		}

		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pword);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
