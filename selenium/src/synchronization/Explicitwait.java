package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		WebDriverWait myWait=new WebDriverWait(driver,10);
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("txtUserName")));
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		myWait.until(ExpectedConditions.elementToBeClickable(By.name("Submit")));
		driver.findElement(By.name("Submit")).click();
		
	
		
		
		

	}

}
