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

public class AlterLineProduct_PCL {

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
        driver.findElementById("customerSearchForm:customerSearchFBTabSet:0:serviceNo").sendKeys("9294416");
        Thread.sleep(5000);
        driver.findElementById("customerSearchForm:customerSearchFBTabSet:0:quickSearch:searchButton").click();
        Thread.sleep(5000);
        //click on Services
        driver.findElement(By.xpath("//span[contains(text(),'Customer Details')]/./following::span[1]")).click();
        Thread.sleep(2000);
        
        Robot robot = null;
        robot = new Robot(); 
        robot.mouseMove(1100,2000);
        Thread.sleep(2000);
        
        //hover over products
        driver.findElement(By.xpath("//span[contains(text(),'Copy/Move')]/./following::span[4]")).click();
        Thread.sleep(2000);
        //click on change line product
        driver.findElement(By.xpath("//span[contains(text(),'Change Line Product')]")).click();
        //select department
        driver.findElementById("alterForm:departmentCode").sendKeys("AQSAL - Anderson Sq Sales");
        Thread.sleep(2000);
        //select site
        driver.findElementById("alterForm:siteCode").sendKeys("ANSQ-Anderson Square Store");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@id='alterForm:fixedApplicationSource']/./following::select[1]")).sendKeys("50510-GSM Postpaid Primary Product");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@id='alterForm:fixedApplicationSource']/./following::select[1]")).sendKeys("50510-GSM Postpaid Primary Product");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@id='alterForm:serviceusageID']/./following::input[1]")).sendKeys("27-Nov-2015");
        Thread.sleep(2000);
       //Click Done on calander
        driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Accept']")).click();
        Thread.sleep(2000);
       
        if(driver.findElement(By.xpath("//input[@value='OK']/./preceding::span[3]")).getText().matches("Line Products successfully altered"))
        {  
        String g= driver.findElement(By.xpath("//input[@value='OK']/./preceding::span[3]")).getText();
        String h= driver.findElement(By.xpath("//input[@value='OK']/./preceding::span[2]")).getText();
        String i= driver.findElement(By.xpath("//input[@value='OK']/./preceding::span[1]")).getText();
        Thread.sleep(2000);
        System.out.println(g+h+i);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='OK']")).click();
        }
        Thread.sleep(2000);
        driver.quit();
            		
    		}
               
	}
	
