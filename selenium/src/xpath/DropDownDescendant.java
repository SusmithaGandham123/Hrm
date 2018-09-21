package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownDescendant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://apps.qaplanet.in/WebApp/SelectAWebSite.html");
		driver.findElement(By.xpath("//select[@name='OptWeb']")).click();
		//select the 1st descendent..
		driver.findElement(By.xpath("//select[@name='OptWeb']/descendant::option[3]")).click();

	}

}
