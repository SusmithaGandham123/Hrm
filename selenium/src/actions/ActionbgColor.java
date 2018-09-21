package actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class ActionbgColor {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseUrl = "http://newtours.demoaut.com";
		WebDriver driver = new ChromeDriver();
         driver.get(baseUrl); 
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver.findElement(By.xpath("//html/body/"
        		+ "div/table/tbody"
                + "/tr/td"
                + "/table"
                + "/tbody"
                + "/tr/td"
                + "/table/"
                + "tbody/"
                + "tr/td"
                + "/table"
                + "/tbody"
                + "/tr"));    
Actions builder = new Actions(driver);
      //put the actions into a single action......
Action mouseOverHome = builder
.moveToElement(link_Home)
.build();
String bgColor = td_Home.getCssValue("background-color");
System.out.println("Before hover: " + bgColor); 

mouseOverHome.perform();
String bgColor1 = td_Home.getCssValue("background-color");

System.out.println("After hover: " + bgColor1);
//driver.quit();
driver.close();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
	}

}
