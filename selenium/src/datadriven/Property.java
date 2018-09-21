package datadriven;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Property {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties obj=new Properties();
		obj.load(new FileInputStream("D:\\\\Madhu\\"
				+ "src\\datadriven\\data.properties"));
		String UN=obj.getProperty("username");
		String PWD=obj.getProperty("password");
		WebDriver driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		driver.findElement(By.name("txtUserName")).sendKeys("UN");
		driver.findElement(By.name("txtPassword")).sendKeys("PWD");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();

	}

}
