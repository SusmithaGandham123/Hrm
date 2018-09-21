package Pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		WebElement UN=driver.findElement(By.name("txtUserName"));
		
		//driver.findElement(By.name("txtUserName")).sendKeys("fewed");
		UN.sendKeys("wwe");
		Thread.sleep(3000);
		//driver.findElement(By.name("txtUserName")).clear();
		UN.clear();
		Thread.sleep(3000);
		//driver.findElement(By.name("txtUserName")).sendKeys("qaplanet");
		UN.sendKeys("qaplanet");
		

	}

}
