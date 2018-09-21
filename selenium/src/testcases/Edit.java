package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr[4]/td[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnEditPers")).click();
		WebElement UN = driver.findElement(By.id("txtEmpFirstName"));
		UN.clear();
		UN.sendKeys("susmitha");
		driver.findElement(By.className("savebutton")).click();
		driver.findElement(By.className("backbutton")).click();

	}

}
