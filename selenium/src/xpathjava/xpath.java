package xpathjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/QAP27/Downloads/cssform%20(1).html");
		driver.findElement(By.cssSelector("input:nth-child(1)")).sendKeys("hello");
		driver.findElement(By.cssSelector("input:nth-child(2)")).sendKeys("hello");
		driver.findElement(By.cssSelector("input:nth-child(3)")).click();
		
		
		
	}

}
