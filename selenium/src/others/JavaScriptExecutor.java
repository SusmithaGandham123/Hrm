package others;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScriptExecutor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in");
		//WebElement goButton = driver.findElement(By.id("lst-ib"));
		JavascriptExecutor 	js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('lst-ib').value ='selenium';");

	}

}
