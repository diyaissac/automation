package basics;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*WebDriverManager is an open-source Java library used to manage ( handle different browsers)
the WebDriver versions within their own testing infrastructure. 
Instead of having a manual process for downloading, upgrading, 
and maintaining WebDriver versions, WebDriverManager provides an abstraction that handles these tasks.*/

public class WebdriverMnager {                 // using webdrivermanager
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	
		

	}

}
