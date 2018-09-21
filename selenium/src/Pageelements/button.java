package Pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.google.com");
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		if(gmail.isDisplayed()){
			System.out.println("gmail is enabled");
			
		}
		else{
			System.out.println("gmail is not enabled");
		}
		driver.close();

	}

}
