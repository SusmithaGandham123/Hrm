package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class QAplanet {
	public QAplanet(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="txtUserName")
	public WebElement UN;
		
	@FindBy(name="txtPassword")
	public WebElement PWD;
	
	@FindBy(xpath="//input[@name='Submit']")
	public WebElement LOGIN;
	
	@FindBy(xpath="//*[@id='option-menu']/li[3]/a")
	public WebElement LOGOUT;
}
