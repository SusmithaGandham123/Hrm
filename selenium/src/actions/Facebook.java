package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
 
public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	    WebElement UserName=driver.findElement(By.id("email"));
		Actions builder=new Actions(driver);
		Action s=builder.moveToElement(UserName).click().keyDown
				(Keys.SHIFT).sendKeys("hello").
				keyUp(Keys.SHIFT).doubleClick(UserName).
				contextClick().build();
	       s.perform();
	       Thread.sleep(3000);
		//driver.close();

	}

}
