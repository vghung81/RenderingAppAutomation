package Functions;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public  class UltilityFunctions {

	static WebDriver driver;
	static WebDriverWait wait;
	

	public static WebDriver open_Browser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"D:/software/SMI_RenderingApp/Packages/chromedriver.exe");
				driver = new ChromeDriver();
			} 
			
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
		return driver;
	}
	
	public static void enter_URL(String URL) {
		driver.navigate().to(URL);
	}

	

	public static void enter_Text(WebElement textbox, String text ) {
		try {
				textbox.sendKeys(text);
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
		}
	}

	public static void click_On_Link(WebElement link) {
		try{
			link.click();
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
		}
	}

	public static void click_On_Button(WebElement button) {
		try {
			
			button.click();
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
		}
	}
	
	public static void close_Browser() {
		driver.quit();
	}
}
