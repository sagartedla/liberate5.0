package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class prgm_dropdown_select_class {

	
	public static void main(String[] args) throws Exception {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://172.21.73.76:8083/liberate-LONI01-S12");
	Thread.sleep(5000);
    driver.findElementByXPath("html/body/form[1]/div[2]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div[2]/table/tbody/tr/td/a").click();
    Thread.sleep(5000);
    driver.manage().window().maximize();
    Thread.sleep(5000);
    driver.findElementById("login:userName").sendKeys("libadmin");
    Thread.sleep(1000);
    driver.findElementById("login:userPassword").sendKeys("Ic3cr34m!");
    Thread.sleep(1000);
    driver.findElementById("login:loginButtonImg").click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//span[contains(text(),'Customer Care')]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@id='customerSearchForm:customerSearchFBTabSet:0:serviceNo']")).sendKeys("9220691");
    Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@id='customerSearchForm:customerSearchFBTabSet:0:quickSearch:searchButton']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//span[contains(text(),'Customer Details')]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//span[contains(text(),'Amend')]")).click();
    Thread.sleep(5000);
    WebElement droplist = driver.findElement(By.xpath("//select[@id='customerDetails:customerDetailsTabManagerSet:0:customerGeneralDetailsTb:nationality']"));
    Select s= new Select(droplist);
    List<WebElement> list1 = s.getOptions() ;
    System.out.println(list1.size());

  for (int i=0;i<list1.size(); i++)
  {
  	System.out.println(list1.get(i).getText());
 }
    //driver.quit();
  droplist.sendKeys("Fixed(Residential)");
  List<WebElement> List2= s.getAllSelectedOptions();
  for (int j=0;j<List2.size(); j++)
  {
  	System.out.println("selected value is :"+List2.get(j).getText());
 }
  driver.quit();
  
	}

}
