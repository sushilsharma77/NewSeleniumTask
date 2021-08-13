package locatersInSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckbox {

	public static String url = "https://www.facebook.com";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("u_3_b_Od")).sendKeys("Hello");

		
//		System.out.println(btn.isDisplayed());
//		System.out.println(btn.isEnabled());
//		System.out.println(btn.isSelected());
//
//		System.out.println(":::::::::::");
//
//		System.out.println(btn.isDisplayed());
//		System.out.println(btn.isEnabled());
//		System.out.println(btn.isSelected());

	}

}
