package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Services_Products_more_button {

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
        driver.findElementById("customerSearchForm:customerSearchFBTabSet:0:serviceNo").sendKeys("8840026");
        Thread.sleep(5000);
        driver.findElementById("customerSearchForm:customerSearchFBTabSet:0:quickSearch:searchButton").click();
        Thread.sleep(5000);
        //click on Services
        driver.findElement(By.xpath("//span[contains(text(),'Customer Details')]/./following::span[1]")).click();
        Thread.sleep(2000);
        //click on products tab
        driver.findElementById("customerServicesForm:serviceEnquiryTabs:0.6").click();
        Thread.sleep(2000);
        //capture records per page
        String a=driver.findElement(By.xpath("//input[@value='More Products']/./preceding::span[1]")).getText();
        System.out.println(a);
        Thread.sleep(5000);
        //seledt Service Charge Type:
        driver.findElement(By.xpath("//input[@value='More Products']")).click();
        Thread.sleep(2000);
        String b=driver.findElement(By.xpath("//input[@value='More Products']/./preceding::span[1]")).getText();
        System.out.println(b);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='More Products']")).click();
        Thread.sleep(5000);
        String c=driver.findElement(By.xpath("//input[@value='More Products']/./preceding::span[1]")).getText();
        System.out.println(c);
        driver.quit();
            		
    		}
               
	}
	
