package pack1;

//this require fast track

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.Robot;

public class APR_PCL {

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
        // click on customer care tab
        driver.findElement(By.xpath("//span[contains(text(),'Customer Care')]")).click();
        Thread.sleep(5000);
        //pass account number
        driver.findElementById("customerSearchForm:customerSearchFBTabSet:0:serviceNo").sendKeys("9281494");
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
        driver.findElement(By.xpath("//span[contains(text(),'Alter products')]")).click();
        //select department
        driver.findElementById("alterProductForm:departmentCode").sendKeys("AQSAL - Anderson Sq Sales");
        Thread.sleep(2000);
        //select site
        driver.findElementById("alterProductForm:siteCode").sendKeys("ANSQ-Anderson Square Store");
        Thread.sleep(2000);
        //click on on proceed
        driver.findElement(By.xpath("//select[@id='alterProductForm:fixedApplicationSource']/./following::input[3]")).click();
        Thread.sleep(5000);
        //capture product to be altered
        String f= driver.findElement(By.xpath("//span[@id='alterProductsDetailsForm:plantItemList:0:productCode']")).getText();
        String e= driver.findElement(By.xpath("//span[@id='alterProductsDetailsForm:plantItemList:0:productDescription']")).getText();
        System.out.println("altered product: "+e+f);
        //click on product to be altered
        driver.findElementById("alterProductsDetailsForm:plantItemList:0:productCode").click();
        Thread.sleep(2000);
        //select product
        driver.findElementById("alterProductsDetailsForm:changedProduct").sendKeys("50533-Barring of Outgoing International Calls");
        Thread.sleep(2000);
        driver.findElementById("alterProductsDetailsForm:changedProduct").sendKeys("50533-Barring of Outgoing International Calls");
        Thread.sleep(2000);
        //click on accept button   
        driver.findElement(By.xpath("//input[@value='Accept']")).click();
        Thread.sleep(5000);
        //capture command
        String a= driver.findElement(By.xpath("//input[@id='signoffServiceOrderForm:pricingPlanProvide']/./following::span[46]")).getText();
        System.out.println(a);
        Thread.sleep(2000);
        //capture selected product
        String b= driver.findElement(By.xpath("//input[@id='signoffServiceOrderForm:pricingPlanProvide']/./following::span[47]")).getText();
        System.out.println("selected product: "+b);
        Thread.sleep(2000);
        //click on submit order button
        driver.findElement(By.xpath("//input[@id='signoffServiceOrderButForm:signOffOrderHeader']")).click();
        Thread.sleep(5000);
        //capture service order number
        String c= driver.findElement(By.xpath("//label[contains(text(),'Service Order:')]/./following::span[1]")).getText();
        System.out.println(c);
        Thread.sleep(2000);
        //click on OK button sign off page
        driver.findElement(By.xpath("//input[@id='browseGeneralSignOffFrm:accountSignoff']")).click();
        Thread.sleep(5000);
        //click on accept button on account signoff page
        driver.findElement(By.xpath("//input[@id='browseGeneralSignOffFrm:accountSignoffServiceOrder']")).click();
        Thread.sleep(5000);
        //capture success message
        String d= driver.findElement(By.xpath("//input[@id='signoffServiceOrderForm:Ok']/./preceding::span[1]")).getText();
        System.out.println(d);
        Thread.sleep(2000);
        //click on OK button
        driver.findElement(By.xpath("//input[@id='signoffServiceOrderForm:Ok']")).click();
        driver.quit();
            		
    		}
               
	}
	
