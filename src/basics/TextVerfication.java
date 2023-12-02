package basics;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextVerfication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	
	    String src = driver.getPageSource();  // to get pagesource
	    if(src.contains("Gmail")) {          //  to verify the text
	    	System.out.println("present");
	    }
	    else
	    {
	    	System.out.println("Not Present");
	    }
	}
}
