package locatersInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.findElement(By.id("alertButton")).click();
		Alert a1 = driver.switchTo().alert();
		a1.accept();

		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(6000);
		Alert a2 = driver.switchTo().alert();
		a2.accept();

		driver.findElement(By.id("confirmButton")).click();
		Alert a3 = driver.switchTo().alert();
		System.out.println(a3.getText());
		Thread.sleep(2000);
		a3.dismiss();

		driver.findElement(By.id("promtButton")).click();
		Alert a4 = driver.switchTo().alert();
		System.out.println(a4.getText());
		a4.sendKeys("Mike Tyson");
		Thread.sleep(2000);
		a4.accept();

	}

}
