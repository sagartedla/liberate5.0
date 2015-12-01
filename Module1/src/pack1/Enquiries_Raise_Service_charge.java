package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Enquiries_Raise_Service_charge {

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
        //pass account number
        driver.findElementById("customerSearchForm:customerSearchFBTabSet:0:searchAcctNo").sendKeys("950007180100");
        Thread.sleep(5000);
        driver.findElementById("customerSearchForm:customerSearchFBTabSet:0:quickSearch:searchButton").click();
        Thread.sleep(5000);
        //click on Service Charges
        driver.findElement(By.xpath("//span[contains(text(),'Service Charges')]")).click();
        Thread.sleep(2000);
        //click on new button
        driver.findElement(By.xpath("//span[contains(text(),'New')]")).click();
        //seledt Service Charge Type:
        driver.findElementById("serviceChargesForm:serviceType").sendKeys("100-REFUND OF DEPOSIT");
        Thread.sleep(2000);
        driver.findElementById("serviceChargesForm:okNewSCharge").click();
        Thread.sleep(3000);
        String i=driver.findElement(By.xpath("//*[contains(text(),'New')]/./following::span[4]")).getText();
        System.out.println(i);
        Thread.sleep(3000);
        driver.quit();
        
    
    		
    		}
               
	}
	
