package locatersInSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowBasedPop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.findElement(By.xpath("//button[@id='windowButton']")).click();

		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();

		String parentWindowID = it.next();
		System.out.println(parentWindowID);

		String childWindowID = it.next();
		System.out.println(childWindowID);

		driver.switchTo().window(childWindowID);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
