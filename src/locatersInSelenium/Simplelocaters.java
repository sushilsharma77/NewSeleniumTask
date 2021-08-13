package locatersInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Simplelocaters {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("This is a link")).click();
		driver.findElement(By.id("fname")).sendKeys("Hello");
		driver.findElement(By.xpath("//*[@id=\"idOfButton\"]")).click();
		driver.findElement(By.cssSelector("#male")).click();
		driver.findElement(By.className("Automation")).click();
		
		Select select = new Select(driver.findElement(By.id("testingDropdown")));
		boolean isMultiple = select.isMultiple();
		System.out.println(isMultiple);
		select.selectByVisibleText("Manual Testing");
		//select.deselectByVisibleText("Manual Testing");
		select.selectByValue("Performance");
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
