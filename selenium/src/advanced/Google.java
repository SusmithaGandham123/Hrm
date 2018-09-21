package advanced;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");

	    ArrayList<WebElement>links = (ArrayList<WebElement>) driver.findElements(By.tagName("a"));
	   /* Iterator itr=links.iterator();
	    while(itr.hasNext()){
	    	WebElement w=((WebElement)itr.next());//casting
	    	System.out.println(w.getText());
	       	} */
	    String[] test = new String[links.size()];
        int i=0;
        for(WebElement e :  links)
        {
        	test[i] = e.getText();
            System.out.println(test[i]);

        } 
        driver.close();
			

	}

}
