package locatersInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);

		Actions action = new Actions(driver);
		action.dragAndDrop(driver.findElement(By.xpath("//div[text()='Drag me']")),
				driver.findElement(By.xpath("//p[text()='Drop here']"))).perform();

		String droped = driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
		System.out.println(droped);

		if (droped.equals("Dropped!")) {
			System.out.println("Drag and Drop action has successed. Test case passed");
		} else {
			System.out.println("Test case failed");
		}
		
		driver.close();

	}

}
