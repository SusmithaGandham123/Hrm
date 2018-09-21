package others;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Coordinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//fetch the AUT.......
		driver.get("http://apps.qaplanet.in/qahrm");
		//Locate element for which you wants to retrieve x y coordinates.
		WebElement UN=driver.findElement(By.name("txtUserName"));
		 //Use point class to get x and y coordinates of element.
		Point p=UN.getLocation();
		System.out.println(p);
		//get the x co-ordinates.......
		int xcord=p.getX();
		System.out.println("Element's Position from left side Is "+xcord +" pixels.");
		//get the y co-ordinates......
		int ycord=p.getY();
		System.out.println("Element's Position from top Is "+ycord +" pixels.");
		// get the width of the button..
		int FieldWidth = UN.getSize().getWidth();
        System.out.println("UserName field's  width Is "+FieldWidth+" pixels");
        int FieldHeight = UN.getSize().getHeight();
        System.out.println("UserName fields's  height Is "+FieldHeight+" pixels");
		driver.close();

	}

}
