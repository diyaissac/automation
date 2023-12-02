package basics;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleVerfication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); // here driver is the object
		driver.get("https://www.google.com");
		
		String expected = "google";
		String actual = driver.getTitle(); // we can only get title by calling object so driver.gettitle
		
		if(expected.contentEquals(actual))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
