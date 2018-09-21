package basics;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		String MainWindow=driver.getWindowHandle();
		System.out.println(MainWindow);
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);
		Set<String>s1=driver.getWindowHandles();
		Iterator<String>i1=s1.iterator();
		while(i1.hasNext()){	
			String childWindow=i1.next();
			if(!MainWindow.equalsIgnoreCase(childWindow)){
				driver.switchTo().window(childWindow);
				driver.findElement(By.name("emailid")).sendKeys("maheshtungala@gmail.com");			
                driver.findElement(By.name("btnLogin")).click();		
                 driver.close();	
			}
		}
		driver.switchTo().window(MainWindow);
	       Thread.sleep(3000);
	       //driver.close();  
	    driver.findElement(By.linkText("Click Here")).click();
	    Thread.sleep(3000);
	      driver.quit();	

	}

}
