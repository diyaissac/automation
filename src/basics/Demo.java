package basics;

import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args) {

     System.setProperty("webdriver.chrome.driver ","C:\\Users\\diyai\\Desktop\\eclipse\\selenium\\chromedriver116//chromedriver.exe" );
	                                               /*  //chromedriver.exe  is the extension and it should provide along with value */
	
	 ChromeDriver driver = new ChromeDriver();    // object creation
	 driver.get("https://www.google.com");
	

	}
	             

}
