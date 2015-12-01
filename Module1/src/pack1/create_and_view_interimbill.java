package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class create_and_view_interimbill {

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
	        // click on customer care
	        driver.findElement(By.xpath("//span[contains(text(),'Customer Care')]")).click();
	        Thread.sleep(5000);
			//enter account number
	        driver.findElementById("customerSearchForm:customerSearchFBTabSet:0:searchAcctNo").sendKeys("250006330000");
	        Thread.sleep(5000);
	      //click on search button
	        driver.findElementById("customerSearchForm:customerSearchFBTabSet:0:quickSearch:searchButton").click();
	        Thread.sleep(5000);
	        //click on account details tab
	        driver.findElementById("dashboardForm:dashboardTabSet:0.1").click();
	        Thread.sleep(5000);
	        //click on interim bill
	        driver.findElement(By.xpath("//span[contains(text(),'Interim Bill')]")).click();
	        Thread.sleep(5000);
	        //click on rentals required check box
	        driver.findElementById("interimBillForm:checkbox1").click();
	        Thread.sleep(5000);
	      //click on Pricing Plans Required: check box
	        driver.findElementById("interimBillForm:checkbox2").click();
	        Thread.sleep(5000);
	        //click on create interimbill
	        driver.findElement(By.xpath("//input[@value='Create Interim Bill']")).click();
	        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Close']")));
	        //click on close
	        driver.findElement(By.xpath("//input[@value='Close']")).click();
	        Thread.sleep(5000);
	      //click on create browseinterimbill
	        driver.findElement(By.xpath("//input[@value='Browse Interim Bill']")).click();
	        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Close']")));
	        //click on close
	        driver.quit();
	}

}
