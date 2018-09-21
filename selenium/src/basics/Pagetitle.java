package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagetitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.google.com");
		String expTitle="Google";
		String actTitle=driver.getTitle();
     	if(actTitle.equals(expTitle)){
     		if(driver.getTitle().equals("Google")){
     			System.out.println("TITLE MATCHING,TC PASSED");
     			
     	
     		}
     		else{
     			System.out.println("title not matchimg,tc failed");
     		}
     	}
		driver.close();
		

	}

}
