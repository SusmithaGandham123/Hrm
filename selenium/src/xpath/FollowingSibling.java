package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowingSibling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://apps.qaplanet.in/WebApp/AssertXPath.html");
			//fetch an element "selenium" from the table using the descendant and contains..
		String text=driver.findElement(By.xpath("//table[@id='idCourse']/descendant::td[contains(text(),'Selenium')]")).getText();
			//print the value...
		System.out.println(text);
			//get the next elements of "selenium" in the table row...using following-sibling..
		List<WebElement> next = driver.findElements(By.xpath("//table[@id='idCourse']/descendant::td[contains(text(),'Selenium')]/following-sibling::td"));
		//System.out.println(next);
		System.out.println("The following siblings of Selenium are");
		for( WebElement e:next){
			System.out.println( e.getText());
		}
		System.out.println();
		 //get the previous element of "Kangs" in the table row....
		String previous = driver.findElement(By.xpath("//table[@id='idCourse']/descendant::td[contains(text(),'Kangs')]/preceding-sibling::td[2]")).getText();
		System.out.println("The Serial number for Kangs is " + previous);

	}

}
