package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class VerifyLoginTest {
	@Test(dataProvider="getData")
	void verifyLogin(String username, String password){
			String expTitle="OrangeHRM - New Level of HR Management";
			
		/*	System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\class room\\Downloads\\geckodriver.exe");  */
			WebDriver driver=new ChromeDriver();
			driver.get("http://apps.qaplanet.in/qahrm");
			String actualTitle=driver.getTitle();
			//driver.manage().window().maximize();
			//verify page title........
			if(actualTitle.equals(expTitle)){
				System.out.println("HomePage opened successfully");
			}
			//Enter userName and Password and click on the Login button....
			driver.findElement(By.name("txtUserName")).sendKeys(username);
			driver.findElement(By.name("txtPassword")).sendKeys(password);
			driver.findElement(By.name("Submit")).click();
			// verify the welcome message and also the Logout link ....
			//WebElement E=driver.findElement(By.xpath("//*[@id='option-menu']/li[1]"));
			WebElement SIGNOFF=driver.findElement(By.linkText("Logout"));
			if(SIGNOFF.isDisplayed()){
				System.out.println("Logout link is correctly displayed, so the test case is passed" );
			}
			Reporter.log("Verify Login Passed! ");
			
			SIGNOFF.click();
			driver.close();
		}
	@DataProvider
	public Object[][] getData()
	{
	//Rows - Number of times your test has to be repeated.
	//Columns - Number of parameters in test data.
		//declared a string array.......
	            Object [][] data = new Object [3][2];

		// 1st row
		data[0][0] ="qaplanet1";
		data[0][1] = "lab1";
		
		// 2nd row
		data[1][0] ="qaplanet2";
		data[1][1] ="lab2";
		
		// 3rd row
		data[2][0] ="qaplanet3";
		data[2][1] ="lab3";

	        return data;	
	}
}
