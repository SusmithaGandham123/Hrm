package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Descendant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver Driver = new ChromeDriver();
		//Maximize Browser
		Driver.manage().window().maximize();
	// Open Url
	Driver.get("http://apps.qaplanet.in/qahrm/login.php");
		WebElement UsNam = Driver.findElement(By.xpath("//table/descendant::input[@name='txtUserName']"));
		WebElement UsPwd = Driver.findElement(By.xpath("//table/descendant::input[@name='txtPassword']"));
		WebElement Log = Driver.findElement(By.xpath("//table/descendant::input[@type='Submit']"));
		WebElement Clr = Driver.findElement(By.xpath("//table/descendant::input[@name='clear']"));
	// Using Boolean command Print the Element
		boolean UsrNmTr= UsNam.isDisplayed();
		System.out.println("UserName Present is "+UsrNmTr);
	// Using IF Command Print the Element
		if (UsPwd.isDisplayed())
					{
						System.out.println("Password is Present");
					}
		if (Log.isDisplayed())
					{
						System.out.println("Logout Button is Present");
					}
		if (Clr.isDisplayed())
					{
						System.out.println("Clear Button is Present");
					}
			else
					{
						System.out.println("Invalind Element");
					}
				// Create a String For UserName & Password
					String UN = "qaplanet1";
					String PWD = "lab1";
				// Pass the Commands
					UsNam.click();
					UsNam.clear();
					UsNam.sendKeys(UN);
					UsPwd.click();
					UsPwd.clear();
					UsPwd.sendKeys(PWD);
					Log.click();
				// Logout the Page
					WebElement LogOut = Driver.findElement(By.linkText("Logout"));
				// Using Boolean Logout button Checking
					boolean LgOt = LogOut.isDisplayed();
					System.out.println("Logout Link Present is "+LgOt);
					LogOut.click();

	}

}
