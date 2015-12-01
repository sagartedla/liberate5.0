package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Payment_Enquiries_void_payment_number {

	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		WebDriverWait Wait = new WebDriverWait(driver,20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://172.21.73.80:8083/liberate-LONI02-S06");	
		//Driver.findElementByXPath("html/body/form[1]/div[2]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div[2]/table/tbody/tr/td/a").click();
        driver.findElementById("login:userName").sendKeys("libadmin");
        Thread.sleep(2000);
        driver.findElementById("login:userPassword").sendKeys("Ic3cr34m!");
        Thread.sleep(5000);
        driver.findElementById("login:loginButtonImg").click();
        Thread.sleep(10000);
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("iceGphImg")));
        // click on payments tab
        driver.findElement(By.xpath("//span[contains(text(),'Payments')]")).click();
        Thread.sleep(5000);
        //click on enquieries
        driver.findElement(By.xpath("//*[contains(text(),'Direct Debit')]/./following::span[1]")).click();
        Thread.sleep(5000);
        //click on OK ..keyboard shortcuts
        driver.findElementById("paymentEquiry:paymentNo").sendKeys("7287645");
        Thread.sleep(2000);
        //clck on search
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        Thread.sleep(2000);
        //click on search button
        driver.findElement(By.xpath("//html/body/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td/form/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td/table/tbody/tr[1]/td[1]/span")).click();
        Thread.sleep(3000);
        //select department
        driver.findElement(By.xpath("//input[@value='Account Details']")).click();
        Thread.sleep(3000);
        //driver.quit();
        
        // get table
    	 WebElement table = driver.findElement(By.xpath("//html/body/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td/form/div/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td/table"));
    	 List<WebElement> rowlist = table.findElements(By.tagName("tr"));
    	 System.out.println(rowlist.size());
    	 for(int i=0;i<rowlist.size();i++)
    	 {
    	 	List<WebElement> collist = rowlist.get(i).findElements(By.tagName("td"));
    	 	//List<WebElement> collist = rowlist.get(i).findElements(By.tagName("tr"));
    	 	System.out.println("Number of columns:"+collist.size());
    	 	
    	 	
    	 	for(int j=0;j<collist.size();j++)
    	 	{
    	 		System.out.println(collist.get(j).getText());
    	 	}
    	 }
  	        
    		
    		}
               
	}
	
