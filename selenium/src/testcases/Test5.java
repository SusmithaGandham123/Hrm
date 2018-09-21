package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 {

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
	    Thread.sleep(1000);
	    WebElement jb=driver.findElement(By.linkText("Job"));
	    Actions b=new Actions(driver);
	    b.moveToElement(jb).perform();
	    WebElement JT=driver.findElement(By.linkText("Job Titles"));
	    JT.click();
	   driver.switchTo().frame("rightMenu");
	   driver.findElement(By.xpath("//input[@value='Add']")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@value='Save']")).click();
       Alert al=driver.switchTo().alert();
	   System.out.println(al.getText());
	   al.accept();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@id='txtJobTitleName']")).sendKeys("Testing");
	   driver.findElement(By.xpath("//input[@value='Save']")).click();
	   Alert b1=driver.switchTo().alert();
	   System.out.println(b1.getText());
	   b1.accept();
	   driver.findElement(By.id("txtJobTitleDesc")).sendKeys("software");
	   driver.findElement(By.xpath("//input[@value='Save']")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.id("editBtn")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.id("cmbUnAssEmploymentStatus")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@value='Add Employment Status']")).click();
	   Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='txtEmpStatDesc']")).sendKeys("selenium is good");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@value='Edit Employment Status']")).click();
	  Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@id='txtEmpStatDesc']")).sendKeys("100%");
      driver.findElement(By.xpath("//input[@value='Save']")).click();
	   
      
	}

}
