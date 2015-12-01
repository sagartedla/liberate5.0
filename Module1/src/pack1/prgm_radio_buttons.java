package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class prgm_radio_buttons {

	
	public static void main(String[] args) throws Exception {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://172.21.73.76:8083/liberate-LONI01-S12");
	Thread.sleep(5000);
    driver.findElementByXPath("html/body/form[1]/div[2]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div[2]/table/tbody/tr/td/a").click();
    Thread.sleep(5000);
    driver.manage().window().maximize();
    Thread.sleep(5000);
    driver.findElementById("login:userName").sendKeys("libadmin");
    Thread.sleep(1000);
    driver.findElementById("login:userPassword").sendKeys("Ic3cr34m!");
    Thread.sleep(1000);
    driver.findElementById("login:loginButtonImg").click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//span[contains(text(),'Customer Care')]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//span[@class='iceMnuBarItemLabel subtabItemLabel']")).click();  
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='keyBoardShortCutForm:kbsc_commandbutton_Ok']")).click(); 
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[@class='iceMnuBarVrtItemLabel leftnavVrtItemLabel']")).click(); 
    List<WebElement> radiob = driver.findElements(By.xpath("//label[@class='iceSelOneRb']"));
    System.out.println(radiob.size());
    for (int j=0;j<radiob.size(); j++)
  {
  	System.out.println(radiob.get(j).getText());
 }
  driver.quit();
  
	}

}
