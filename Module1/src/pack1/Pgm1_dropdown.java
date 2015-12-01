package pack1;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class Pgm1_dropdown {

	
	public static void main(String[] args) throws InterruptedException {
	  
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		//WebDriver Driver = null;
		//Driver = new ChromeDriver();
		FirefoxDriver Driver  = new FirefoxDriver();
	    //WebDriverWait Wait = new WebDriverWait(Driver,20);
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Driver.get("http://172.21.73.80:8081/liberate-LONI01-S10");
		//Thread.sleep(10000);
		//Driver.findElementByXPath("html/body/form[1]/div[2]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div[2]/table/tbody/tr/td").click();
	    Driver.manage().window().maximize();
        Driver.findElement(By.id("login:userName")).sendKeys("libadmin");
        Thread.sleep(2000);
		Driver.findElement(By.id("login:userPassword")).sendKeys("Ic3cr34m!");
		Driver.findElement(By.id("login:loginButtonImg")).click();
		Thread.sleep(10000);
	    Driver.findElementByXPath("html/body/table/tbody/tr[2]/td/form/div[1]/div/div[11]/a/span").click();
	    Driver.findElementByXPath("html/body/table/tbody/tr[2]/td/form/div[2]/div/div[10]/a/span").click();
	    Driver.findElementByXPath("html/body/table/tbody/tr[3]/td[1]/form/div/div/div[5]/a/span").click();
	    WebElement droplist = Driver.findElement(By.xpath("//select[@id='bulkMsgTariffChargesForm:serviceTypeList']"));
        List<WebElement> alllist = droplist.findElements(By.tagName("Option"));
       System.out.println(alllist.size());
        for(int i = 0;i<alllist.size();i++)
       {
       	System.out.println(alllist.get(i).getText());
        }
                
        Driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
       
        Driver.close();
	}    
	}


	