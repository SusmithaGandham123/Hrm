package actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragandDrop {
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver  driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(5000);
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        Actions a=new Actions(driver);
        WebElement e1=driver.findElement(By.id("draggable"));
        WebElement e2=driver.findElement(By.id("droppable"));
        a.clickAndHold(e1).dragAndDrop(e1, e2).perform();
         Thread.sleep(3000);
        driver.close();
	}

}
