package webtables;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Table2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("http://apps.qaplanet.in/qahrm");
driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
driver.findElement(By.name("txtPassword")).sendKeys("lab1");
driver.findElement(By.name("Submit")).click();
driver.switchTo().frame("rightMenu");
int rowCount=driver.findElements(By.xpath("//*[@id='standardView']/table/tbody/tr")).size();		
System.out.println("the number of rows in emp tableare:"+rowCount);
int colCount=driver.findElements(By.xpath("//*[@id='standardView']/table/thead/tr/td")).size();
System.out.println("The number of columns in the emp table are :"+colCount);
ArrayList<WebElement> rows=(ArrayList<WebElement>)driver.findElements(By.xpath("//*[@id='standardView']/table/tbody/tr"));
/*Iterator ir=rows.iterator();
while(ir.hasNext()){
WebElement we=((WebElement)ir.next());
System.out.println(we.getText());
}*/
String[] linktxt=new String[rows.size()];
int i=0;
for(WebElement e:rows){
	linktxt[i]=e.getText();
System.out.println(linktxt[i]);
}
driver.close();
		
}

	}


