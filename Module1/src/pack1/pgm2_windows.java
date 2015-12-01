package pack1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pgm2_windows {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver Driver  = new FirefoxDriver();
		Driver.get("http://www.rediff.com/");
		Thread.sleep(5000);
        Driver.manage().window().maximize();
        Set s = Driver.getWindowHandles();
        System.out.println(s.size());
        Iterator<String> it = s.iterator();
        Driver.switchTo().window(it.next());
        System.out.println(Driver.getTitle());
       // Driver.switchTo().window(it.next());
       // System.out.println(Driver.getTitle());
        Driver.findElement(By.xpath("html/body/div[2]/div[4]/span[4]/span/a[1]")).click();
    	//Alert al =  Driver.switchTo().alert();
        Driver.navigate().back();

	}

}
