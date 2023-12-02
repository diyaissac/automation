package basics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


// locators used to locate webelemets
//types: id, name, xpath, css, tagename,linktext



    // these are the annotations in junit
	//@before --> here we are providing details of things before test activity
	//@test
	//@after--> 
	
	//here we dont need public static void main
	
public class JunitDemo {	
	WebDriver driver;
	
	@Before
	public void setup()                // after annotation he have to create a corresponding method
	{
		//*[@name="field-keywords"]driver.get("https://www.facebook.com/");
	}
	
	
	// here execution takes place in alphabaetic order
	
	@Test
	public void login()
	{
		// using id, name
		driver.findElement(By.id("email")).sendKeys("diyaissac1997@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mummykky");
		driver.findElement(By.name("login")).click();
		}
	
	@Test
	public void pgesrc()
	{
		String src = driver.getPageSource();
		if(src.contains("gmail")) {
			System.out.println("test pass");
	}
		else
		{			System.out.println("test failed");
		}
	}
	
	
	@Test
	public void loGin() 
	{
		
	// using xpath
		driver.findElement(By.xpath("//input[@id ='email']")).sendKeys("diyaissac1997@gmail.com");
		driver.findElement(By.xpath("//input[@id ='pass']")).sendKeys("mummykku");
		driver.findElement(By.name("login")).click();
	}
	
	@After
	public void browserClose() 
	{
		driver.quit(); // to completely close browser
		driver.close(); // to close only one tab
	}
	
	
	//absolute xpath  -->. start from root node (/)  , its lengthy so its difficult
	// relative xpath --> most used > start from current node(//)> syntax:  //tagname[@attribute name = 'value']
	// IN CASE locating an element is different or having same attribute and value for the elements, then 
	//                     //*[id='wjdvgyu']/a[3]  --> here a is the child class 
	
	
	//open amazon.in
	//click todays deals
	//enter mobile in search fields
	//click hello sign in
	//emter invalid mail address
	//continue button
	//navigate to back page  -->driver.navigate.back();
	//click hambuger menu
	
	
	
	
	
	
	
	
	
	
	
	
	
}
