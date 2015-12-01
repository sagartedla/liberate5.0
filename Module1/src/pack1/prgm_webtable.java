package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class prgm_webtable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
FirefoxDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.get("http://www.w3schools.com/html/html_tables.asp");
WebElement table = driver.findElement(By.xpath("//html/body/div[3]/div[2]/div[1]/div[1]/table[1]"));
List<WebElement> rowlist = table.findElements(By.tagName("tr"));
System.out.println(rowlist.size());
for(int i=0;i<rowlist.size();i++)
{
	List<WebElement> collist = rowlist.get(i).findElements(By.tagName("th"));
	System.out.println("Number of columns:"+collist.size());
	
	
	for(int j=0;j<collist.size();j++)
	{
		System.out.println(collist.get(j).getText());
	}
}
driver.quit();
}
}