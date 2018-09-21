package others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlunitTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new HtmlUnitDriver();
	      // Navigate to Google		
	        driver.get("http://www.google.com");	
	        System.out.println("Page title is: " + driver.getTitle());
	 // Locate the searchbox using its name		
	   WebElement sbox = driver.findElement(By.name("q"));	
	      // Enter a search query		
	       sbox.sendKeys("Selenium");	
	   // Submit the query. Webdriver searches for the form using the text input element automatically		
	       // No need to locate/find the submit button	
	      // sbox.sendKeys("selenium");
	       sbox.submit();  //will click the search button next to the search box...
	       //driver.findElement(By.name("btnG")).click();
	        Thread.sleep(2000);
	       // This code will print the page title		
	       System.out.println("Page title is: " + driver.getTitle());		
	       driver.close();			
	}		
	}


