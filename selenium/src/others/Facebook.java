package others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("maheshtungala");
		driver.findElement(By.id("pass")).sendKeys("were");
		//click the login button using the contains clause...
		//driver.findElement(By.xpath("//*[contains(@id,'u_0')]")).click();
		//driver.findElement(By.xpath("//input[starts-with(@id,'u_0')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'u_0')]")).click();

	}

}
