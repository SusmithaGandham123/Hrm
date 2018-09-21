package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2a {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
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
	    Thread.sleep(1000);
	    WebElement jb=driver.findElement(By.linkText("Job"));
	    Actions b=new Actions(driver);
	    b.moveToElement(jb).perform();
	}

}
