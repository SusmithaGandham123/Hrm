package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Editlocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	    driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	    driver.findElement(By.name("Submit")).click();
		WebElement ad=driver.findElement(By.id("admin"));
	    Actions a=new Actions(driver);
	    a.moveToElement(ad).perform();
	    Thread.sleep(3000);
	    WebElement CI=driver.findElement(By.linkText("Company Info"));
	    Actions b=new Actions(driver);
	    b.moveToElement(CI).perform();
	    WebElement Lo=driver.findElement(By.linkText("Locations"));
	   Lo.click();
	   driver.switchTo().frame("rightMenu");
	   driver.findElement(By.xpath("/html/body/div/div[2]/form/table/tbody/tr[39]/td[3]/a")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.id("editBtn")).click();
	   WebElement UN=driver.findElement(By.id("txtLocDescription"));
	   UN.clear();
	   UN.sendKeys("susmitha");
	   driver.findElement(By.className("savebutton")).click();
	   
	   

	}

}
