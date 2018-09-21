package synchronization;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//fetch the webpage............
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		driver.manage().window().maximize();
		//click on the submit button without entering username and password...
		driver.findElement(By.name("Submit")).click();	
		
        // Switching to Alert 
		Alert al=driver.switchTo().alert();  
		
	   // Capturing alert message. 
     String alertMessage=al.getText(); 
      // Displaying alert message		
    System.out.println(alertMessage);			
  Thread.sleep(2000);
    // Accepting alert		
      al.accept();	// to click on the ok button..........
    //to click on the cancel button..
    //alert.dismiss();
    Thread.sleep(3000);
    if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")){
    	System.out.println("Alert clicked successfully, back to homepage");
    }else {
    	System.out.println("Alert click failed, cannot come back to homepage");
    }
   driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
    Thread.sleep(3000);
     driver.close();
    //driver.quit();
		

	}

}
