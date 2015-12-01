package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class create_sim_orders {

	
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
        
        driver.findElement(By.xpath("//span[contains(text(),'Inventory')]")).click();
        Thread.sleep(5000);
        //click on service provisioning
        driver.findElement(By.xpath("//span[contains(text(),'Create SIM Order')]")).click();
        Thread.sleep(3000);
        //click on OK ..keyboard shortcuts
        for(int i=0;i<30;i++)
        {
        driver.findElementById("createsimorder:simVendor").sendKeys("4-Gemplus/Dhiraagu");
        Thread.sleep(2000);
        //enter account number
        driver.findElementById("createsimorder:simCardType").sendKeys("1-PLUG-IN");
        Thread.sleep(2000);
        //click on search button
        driver.findElementById("createsimorder:quantity").sendKeys("2");
        Thread.sleep(2000);
        //select department
        driver.findElementById("createsimorder:profileCode").sendKeys("05.01-CELTIC PROFILE");
        Thread.sleep(2000);
        //select site
        driver.findElement(By.xpath("//input[@value='Apply']")).click();
        Thread.sleep(2000);
        //select site
        driver.findElement(By.xpath("//input[@value='Raise Order']")).click();  
        Thread.sleep(5000);
        driver.findElementById("footerForm:close").click();
        Thread.sleep(2000);
        }
        
	}
	

}
