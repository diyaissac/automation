package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		WebDriver driver;  // Webdriver is the interface
		WebDriverManager.chromedriver().setup(); //browser loading
		driver = new ChromeDriver();   // this is called cross browser testing -- testing in different browsers
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
			
	}

}






















