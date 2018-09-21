package Pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
	WebElement UN=driver.findElement(By.name("txtUserName"));
	if(UN.isDisplayed()){
		System.out.println("the usernmae field is displayed");
		
		
		
	}
	else{
		System.out.println("the username field is not displayed");
	}

	}

}
