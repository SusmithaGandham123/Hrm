package advanced;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Linkcount {
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	String baseUrl = "http://newtours.demoaut.com/";
    //WebDriver driver = new FirefoxDriver();
    String underConsTitle = "Under Construction: Mercury Tours";
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get(baseUrl);
    ArrayList<WebElement> linkElements = (ArrayList<WebElement>) driver.findElements(By.tagName("a"));
    String[] linkTexts = new String[linkElements.size()];
    int i = 0;
    //extract the link texts of each link element
    for (WebElement e : linkElements) {
        linkTexts[i] = e.getText();
        System.out.println(linkTexts[i]);
        i++;
    }
    //test each link
   for(String t : linkTexts) {
        driver.findElement(By.linkText(t)).click();
        if (driver.getTitle().equals(underConsTitle)) {
            System.out.println("\"" + t + "\"" + " is under construction.");
        } else {
            System.out.println("\"" + t + "\"" + " is working.");
        }
        driver.navigate().back();
    }
    driver.quit();
}

}