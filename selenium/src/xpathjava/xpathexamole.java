package xpathjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathexamole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/QAP27/Downloads/QAPlanet.html");
		//fetch the innertext of the 2nd row 2nd col...
	/*	String text = driver.findElement(By.xpath
				("//html/body/table/tbody/tr[2]/td[2]")).getText();*/
	/*	String text = driver.findElement(By.xpath
				("//table/tbody/tr[2]/td[2]")).getText();*/
	/*	String text = driver.findElement(By.xpath
				("//table[@id='Table1']/tbody/tr[2]/td[2]")).getText(); */
		String text = driver.findElement(By.xpath
				("//*[@id='Table1']/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
		driver.close();

	}

}
