package Pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/QAP27/Downloads/Checkbox.html");
		//driver.manage().window().maximize();
		WebElement chkBox=driver.findElement(By.name("vehicle2"));
		
		for(int i=1;i<3;i++){
			chkBox.click();
			System.out.println(chkBox.isSelected());
			Thread.sleep(2000);
		}
		driver.close();
	}

	}


