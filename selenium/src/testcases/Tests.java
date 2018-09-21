package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tests {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		WebElement UN=driver.findElement(By.className("logintext"));;
	    if(UN.isDisplayed()){
			System.out.println("the usernmae field is displayed");
			}
		else{
			System.out.println("the username field is not displayed");
		}
	    WebElement PWD=driver.findElement(By.className("logintext"));;
	    if(PWD.isDisplayed()){
			System.out.println("the password field is displayed");
			}
		else{
			System.out.println("the password field is not displayed");
		}
	    WebElement LI=driver.findElement(By.className("button"));;
	    if(LI.isDisplayed()){
			System.out.println("the login field is displayed");
			}
		else{
			System.out.println("the login field is not displayed");
		}
	    WebElement CL=driver.findElement(By.className("button"));;
	    if(CL.isDisplayed()){
			System.out.println("the clear field is displayed");
			}
		else{
			System.out.println("the clear field is not displayed");
		}
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
	   driver.findElement(By.xpath("//input[@value='Add']")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@class='savebutton']")).click();
	   Alert al=driver.switchTo().alert();
	   if(al.getText().equals("Please correct the following- Location Name has to be specified- Country should be selected!- Address should be specified- Zip Code should be specified")){
	   System.out.print(al.getText());}
	   al.accept();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@id='txtLocDescription']")).sendKeys("susmitha");
	   driver.findElement(By.xpath("//input[@value='Save']")).click();
	   Alert b1=driver.switchTo().alert();
	   System.out.print(b1.getText());
	   b1.accept();
	   Thread.sleep(1000);
	   WebElement UN1=driver.findElement(By.id("cmbCountry"));
	   Select drpcountry=new Select(UN1);
	   drpcountry.selectByVisibleText("India");
	   driver.findElement(By.xpath("//input[@value='Save']")).click();
	Alert c1=driver.switchTo().alert();
	System.out.print(c1.getText()); 
	   c1.accept();
	   	 Thread.sleep(1000);
	   driver.findElement(By.id("txtState")).sendKeys("Telangana");
	   Thread.sleep(1000);
	   driver.findElement(By.id("cmbDistrict")).sendKeys("Nalgonda");
	   Thread.sleep(1000);
	   driver.findElement(By.id("txtAddress")).sendKeys("2-79,chillakallu");
	   driver.findElement(By.xpath("//input[@value='Save']")).click();
	   Alert d1=driver.switchTo().alert();
	   System.out.print(d1.getText());
	   d1.accept();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@id='txtZIP']")).sendKeys("521175");
	   Thread.sleep(1000);
	   driver.findElement(By.id("txtPhone")).sendKeys("899564656");
	   Thread.sleep(1000);
	   driver.findElement(By.id("txtFax")).sendKeys("123444");
	   Thread.sleep(1000);
	   driver.findElement(By.id("txtComments")).sendKeys("testingTools");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//input[@value='Save']")).click(); 
	}

}
