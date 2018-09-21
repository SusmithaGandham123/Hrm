package advanced;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/QAP27/Downloads/cssform%20(3).html");
		ArrayList<WebElement> al=(ArrayList<WebElement>) driver.findElements(By.tagName("input"));
	
		  //create an iterator object for this al object..
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			WebElement w=(WebElement)itr.next();
			w.sendKeys("hello");
		}

	}

}
