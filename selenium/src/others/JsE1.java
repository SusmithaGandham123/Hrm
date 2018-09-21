package others;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class JsE1 {
	@Test		
    public void scrollDown() throws InterruptedException 					
    {	
		/*System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\class room\\Downloads\\geckodriver.exe"); */
       WebDriver driver= new ChromeDriver();			
       //Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;				
        //Launching the Site.		
        driver.get("http://www.rediff.com/");		
       //driver.get("https://www.news.google.com");
        //Maximize window		
        //driver.manage().window().maximize();
        Thread.sleep(3000);
       //Vertical scroll down by 6000  pixels		
        js.executeScript("window.scrollBy(0,6000)");
        driver.findElement(By.linkText("Feedback")).click();
        //driver.quit();
        
}
}
