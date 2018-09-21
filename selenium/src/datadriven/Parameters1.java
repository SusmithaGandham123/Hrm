package datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters1 {
	private static WebDriver driver;
	@Test 
	@Parameters({ "Username", "Password" })
		 
		  public void test(String Username, String Password) {
		  /* System.setProperty("webdriver.gecko.driver",
				   "C:\\Users\\class room\\Downloads\\geckodriver.exe");*/
			  driver = new ChromeDriver();
		 
		      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		      driver.get("http://apps.qaplanet.in/qahrm");
		 
		      driver.findElement(By.name("txtUserName")).sendKeys(Username);
		 
		      driver.findElement(By.name("txtPassword")).sendKeys(Password);
		 
		      driver.findElement(By.name("Submit")).click();	 
		      	 
		      driver.findElement(By.linkText("Logout")).click();
		 
		      driver.close();
		 
	  }

}
