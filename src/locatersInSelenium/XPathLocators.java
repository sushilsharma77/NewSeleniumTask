package locatersInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocators {
	
	 static String url = "https://www.expedia.com/user/createaccount?"
			+ "%20&uurl=e3id%3Dredr%26rurl%3D%2F%3Flogout%3D1";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='create-account-firstname']"))
		.sendKeys("Hello");
		
		driver.findElement(By.xpath("//input[@name='create-account-lastname']"))
		.sendKeys("World");
		
		driver.findElement(By.xpath("//input[@aria-describedby='create_email_error']"))
		.sendKeys("Helloworld@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"create-account-password\"]"))
		.sendKeys("HelloWorld$7245");
		
		driver.findElement(By.xpath("//*[@id=\"create-account-confirm-password\"]"))
		.sendKeys("HelloWorld$7245");
		
		driver.findElement(By.xpath("//button[contains(@id,'submit-button')]")).click();
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
