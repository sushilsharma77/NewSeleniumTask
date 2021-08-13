package locatersInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.switchTo().frame("frame1");
		WebElement frame = driver.findElement(By.xpath("//*[@id='sampleHeading']"));
		System.out.println(frame.getText());
		
		driver.switchTo().defaultContent();
		String titleOfDeafultWindow = driver.getTitle();
		System.out.println(titleOfDeafultWindow);
	}

}
