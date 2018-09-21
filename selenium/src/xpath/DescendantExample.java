 package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DescendantExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("C:/Users/QAP27/Downloads/QAPlanet (2).html/");
		//get the S.No for the course Selenium from the table..
		String SNo = driver.findElement(By.xpath("//table/tbody/descendant::td[contains(text(),'Selenium')]/preceding-sibling::td[1]")).getText();
	
		System.out.println("The S.No for the course Selenium is " + SNo);
		
		/*String Course = driver.findElement(By.xpath
		("//table/tbody/descendant::td[contains(text(),'1')]/following-sibling::td[1]")).getText();
		
		System.out.println("The course name  for the SNo 1 is " + Course);*/
		driver.close();

	}

}
