package basics;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingTagName {
//tagname USED TO --> locating multiple elements (links) (tagname eg:<a, <input) and storing it 
	

	
	
WebDriver driver;

@Before
public void open() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.amazon.ca/");
}


@Test
public void webelements() 
{	
List<WebElement> // here webelement is given becox we are storing webelements , if thats a string then list<String>
li = driver.findElements(By.tagName("a"));
System.out.println("total no. of links = " + li.size()); // here we get no. of links
// to display links
for(WebElement links:li) //for each loop
{
	String link = links.getAttribute("href"); // to get links , here attribute href is given becoz the link is in href attribute
	String text = links.getText();            // to get text
	System.out.println(link + "-----------"+ text);
	
}

}




	
	
	
}
