package Pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//open the website........
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.name("userName")).sendKeys("mahesh");
		driver.findElement(By.name("password")).sendKeys("mahesh");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		WebElement rb=driver.findElement(By.cssSelector("input[value=oneway]"));
		//click on the radio button OneWay by using its CSSSelector....
		rb.click();
		//check whether it is selected or not.....
		if(rb.isSelected()){
			System.out.println("The radio button is selected");
		}else{
			System.out.println("The radio button cannot be identified");
		}
		
		//driver.close();

	}

}
