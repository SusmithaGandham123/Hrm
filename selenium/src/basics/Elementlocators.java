package basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Elementlocators {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");

	}

}
