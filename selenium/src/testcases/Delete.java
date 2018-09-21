package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	    driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	    driver.findElement(By.name("Submit")).click();
	    driver.switchTo().frame("rightMenu");
	    driver.findElement(By.className("plainbtn")).click();
	    Alert a1=driver.switchTo().alert();
		   System.out.print(a1.getText());
		   a1.accept();
		   driver.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr[4]/td[1]/input")).click();
		   driver.findElement(By.xpath("//input[@value='Delete']")).click();

	}

}
