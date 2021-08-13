package locatersInSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksFromAmazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		List<WebElement> listLinks = driver.findElements(By.tagName("a"));
		System.out.println(listLinks.size());
		
		for(WebElement links:listLinks) {
			String linksName = links.getText();
			System.out.println(linksName);
		}

	}

}
