package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Screen;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Screen s=new Screen();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		driver.manage().window().maximize();
		// login 
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//enter the name of the employee.......
		driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("Tungala");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Mahesh");
		
		// click on browser button to upload a file....
		Thread.sleep(2000);
		WebElement Browse = driver.findElement(By.id("photofile"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",Browse);
		driver.findElement(By.id("photofile")).click();
		//upload file thru auto-it script....
		Runtime.getRuntime().exec("D:/aaa/gandham.exe");
		driver.findElement(By.xpath("//input[@id='btnEdit']")).click();

	}

}
