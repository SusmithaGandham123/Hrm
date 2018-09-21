package actions;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MultipleActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseUrl = "https://www.google.co.in";
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
        WebElement sbox=driver.findElement(By.id("lst-ib"));
        Actions obj=new Actions(driver);
        Action obj1= obj.moveToElement(sbox).keyDown(Keys.SHIFT).sendKeys("s").
        keyUp(Keys.SHIFT).sendKeys("elenium").sendKeys(Keys.ENTER).build();
        Thread.sleep(2000);
        obj1.perform();
        Thread.sleep(5000);
        driver.close();//closes the browser.....
        
       

	}

}
