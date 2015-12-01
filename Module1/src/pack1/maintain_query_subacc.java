package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class maintain_query_subacc {

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
        //click on maintain query
        driver.findElement(By.xpath("//span[contains(text(),'Maintain Query')]")).click();
        Thread.sleep(5000);
        //selct ACC-Account Number from search by drop down
        driver.findElement(By.xpath("//*[contains(text(),'Raise Date')]/./preceding::select[1]")).sendKeys("ACC-Account Number");
        Thread.sleep(2000);
        //pass subaaccount number
        driver.findElement(By.xpath("//*[contains(text(),'Raise Date')]/./preceding::input[1]")).sendKeys("950007180100");
        //clck on search
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        Thread.sleep(000);
        //click on search button
        driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td/form[1]/div[3]/div[2]/table[2]/tbody/tr[1]/td/div/div[2]/table/tbody/tr[1]/td[1]/div/span")).click();
        Thread.sleep(3000);
        //select department
        String i=driver.findElement(By.xpath("//*[contains(text(),'Query Number:')]/./following::span[1]")).getText();
        System.out.println(i);
        Thread.sleep(3000);
        //driver.quit();
        
    
    		
    		}
               
	}
	
