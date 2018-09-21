package webtables;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Table1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Qaplanet.html");
		int rowcount=driver.findElements(By.xpath("//*[@id='Table1']/tbody/tr")).size();
		int colcount =driver.findElements(By.xpath("//*[@id='Table1']/thead/tr/td")).size();
		System.out.println("the number of rows:"+rowcount);
		System.out.println("the number of columns:"+colcount);
		List<WebElement> e = driver.findElements(By.xpath("//*[@id='Table1']/tbody/tr/td"));
		System.out.println("The number of cells in the table are "+ e.size());
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='Table1']/tbody/tr"));
		Iterator itr=rows.iterator();
		while(itr.hasNext()){
			WebElement s=(WebElement)itr.next();
		System.out.println(s.getText());
		}
	}


}
