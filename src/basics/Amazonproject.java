package basics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//xpath
public class Amazonproject {

	WebDriver driver;
	@Before
	
	public void OpenBroswer()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ca");
		
	}
	
	@Test
	public void dealsStore()
	{
		driver.findElement(By.xpath("//*[@href=\"/deals?ref_=nav_cs_gb\"]")).click();
		
		
	}
	
	@Test
	public void mobileselection()
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}
	
	@Test
	public void signin() 
	{
		driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("diyaissac@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]/span[1]")).click();
		
		
	}
	@Test
	public void hambugermenu()
	{
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
		
	}
	
	@Test
	public void search() { // for performing multiple actions on a webelement
		
		WebElement search = driver.findElement(By.xpath("//*[@name=\"field-keywords\"]"));
		search.sendKeys("books");
		search.submit();  // here we are entering the search item and pressed enter simultaneously without clicking the search symbol
	}
	
	@After
	public void back()
	{
		driver.navigate().back();
		driver.navigate().back();
	}
}