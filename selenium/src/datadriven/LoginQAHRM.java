package datadriven;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.QAplanet;
public class LoginQAHRM {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		QAplanet p=new QAplanet(driver);  //page class object..
		driver.get("http://apps.qaplanet.in/qahrm");
		p.UN.sendKeys("qaplanet1");//enter username...
		p.PWD.sendKeys("lab1");   // enter password....
		p.LOGIN.click();          // click on the submit button...
        p.LOGOUT.click();        // click on the logout button...
		driver.close();           
		

	}

}
