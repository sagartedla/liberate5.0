package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.Robot;

public class Customer_enquiry_local_account {

		public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		WebDriverWait Wait = new WebDriverWait(driver,20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://172.21.73.80:8081/liberate-LONI01-S10");	
		//Driver.findElementByXPath("html/body/form[1]/div[2]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div[2]/table/tbody/tr/td/a").click();
        driver.findElementById("login:userName").sendKeys("libadmin");
        Thread.sleep(2000);
        driver.findElementById("login:userPassword").sendKeys("Ic3cr34m!");
        Thread.sleep(5000);
        driver.findElementById("login:loginButtonImg").click();
        Thread.sleep(10000);
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("iceGphImg")));
        // click on cutomr care tab
        driver.findElement(By.xpath("//span[contains(text(),'Customer Care')]")).click();
        Thread.sleep(5000);
        //pass local account number
        driver.findElementById("customerSearchForm:customerSearchFBTabSet:0:localAcctNo").sendKeys("2013667");
        Thread.sleep(2000);
        //click on search button
        driver.findElementById("customerSearchForm:customerSearchFBTabSet:0:quickSearch:searchButton").click();
        Thread.sleep(5000);
        
     // get table
   	 WebElement table = driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td/form/div/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td/div/div/table/tbody/tr[1]/td/div[1]/div/div"));
   	 List<WebElement> rowlist = table.findElements(By.tagName("tr"));
   	 System.out.println(rowlist.size());
   	 for(int i=0;i<rowlist.size();i++)
   	 {
   	 	List<WebElement> collist = rowlist.get(i).findElements(By.tagName("td"));
   	 	//List<WebElement> collist = rowlist.get(i).findElements(By.tagName("tr"));
   	 	//System.out.println("Number of columns:"+collist.size());
   	 	
   	 	
   	 	for(int j=0;j<collist.size();j++)
   	 	{
   	 		System.out.println(collist.get(j).getText());
   	 	}
   	 }
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[contains(text(),'Customer Search')]/./following::a[26]")).click();
    Thread.sleep(2000);
 // get table
  	 WebElement table1 = driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td/form/div/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td/div/div[1]/div"));
  	 List<WebElement> rowlist1 = table1.findElements(By.tagName("tr"));
  	 System.out.println(rowlist1.size());
  	 for(int i=0;i<rowlist1.size();i++)
  	 {
  	 	List<WebElement> collist1 = rowlist1.get(i).findElements(By.tagName("td"));
  	 	//List<WebElement> collist1 = rowlist1.get(i).findElements(By.tagName("tr"));
  	 	//System.out.println("Number of columns:"+collist1.size());
  	 	
  	 	
  	 	for(int j=0;j<collist1.size();j++)
  	 	{
  	 		System.out.println(collist1.get(j).getText());
  	 	}
  	 }
  	Thread.sleep(2000);
        driver.quit();
            		
    		}
               
	}
	
