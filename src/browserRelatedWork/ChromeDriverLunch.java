package browserRelatedWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverLunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://youtube.com");
		String str = driver.getCurrentUrl();
		System.out.println(str);
		
		if(str.equals("https://www.youtube.com/")) {
			System.out.println("Test case pass");
		}else {
			System.out.println("Test case fail");
		}
		
		//driver.get("https://www.instragram.com");
		
		driver.quit();

	}

}
