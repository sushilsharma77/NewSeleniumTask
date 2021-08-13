package browserRelatedWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoDriverLunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String expectedResult = "Facebook - Log In or Sign Up";
		
		if(title.equalsIgnoreCase(expectedResult)) {
			System.out.println("Test cas is pass");
		}else {
			System.out.println("Test case is fail");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//System.out.println(driver.getPageSource());
		
		driver.close();
		

	}

}
