import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	    driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	    driver.findElement(By.name("Submit")).click();
	    WebElement ad=driver.findElement(By.id("admin"));
	    Actions a=new Actions(driver);
	    a.moveToElement(ad).perform();
	    Thread.sleep(1000);
	    WebElement jb=driver.findElement(By.linkText("Job"));
	    Actions b=new Actions(driver);
	    b.moveToElement(jb).perform();
	    WebElement JT=driver.findElement(By.linkText("Job Titles"));
	    JT.click();
	   driver.switchTo().frame("rightMenu");
	   driver.findElement(By.xpath("//input[@value='Add']")).click();
	   
		

	}

}
