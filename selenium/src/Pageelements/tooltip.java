package Pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement app= driver.findElement(By.xpath("//a[@title='Google apps']"));
		//get the tooltip of the searchbox...
		String tooltip = app.getAttribute("title");
		System.out.println("The tooltip of the searchbox is "+ tooltip);
app.click();
	}

}
