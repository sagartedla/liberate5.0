package pack1;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opera.core.systems.scope.protos.ExecProtos.ActionList.Action;
import com.thoughtworks.selenium.Wait;

public class mouseoperation {

	
	public static void main(String[] args) throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver Driver  = new ChromeDriver();
		WebDriverWait Wait = new WebDriverWait(Driver,20);
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.get("http://172.21.73.76:8083/liberate-LONI01-S12");
		//Driver.findElementByXPath("html/body/form[1]/div[2]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div[2]/table/tbody/tr/td/a").click();
        Driver.findElementById("login:userName").sendKeys("libadmin");
        Thread.sleep(5000);
        Driver.findElementById("login:userPassword").sendKeys("Ic3cr34m!");
        Thread.sleep(5000);
        Driver.findElementById("login:loginButtonImg").click();
        Thread.sleep(10000);
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("iceGphImg")));
        Driver.findElement(By.xpath("//span[contains(text(),'Customer Care')]")).click();
        Driver.findElement(By.xpath("//input[@id='customerSearchForm:customerSearchFBTabSet:0:serviceNo']")).sendKeys("9474752");   
        Driver.findElement(By.id("customerSearchForm:customerSearchFBTabSet:0:quickSearch:searchButton")).click();
      //Wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("Account Prop")));
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Account Prop")));
       Driver.findElementByXPath("html/body/table/tbody/tr[3]/td[1]/form/div/div/div[4]/a/span").click();
        //Driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td/form/div[1]/div/div[1]/a/span");
        WebElement element = Driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td/form/div[1]/div/div[1]/a/span"));
        Actions action = new Actions(Driver);
        action.moveToElement(element).click();
        action.perform();
       

        
        
	}  
        
	}