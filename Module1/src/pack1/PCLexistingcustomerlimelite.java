package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PCLexistingcustomerlimelite {

	
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
        //click on service provisioning
        driver.findElement(By.xpath("//span[contains(text(),'Service Provisioning')]")).click();
        Thread.sleep(5000);
        //click on OK ..keyboard shortcuts
        driver.findElementById("keyBoardShortCutForm:kbsc_commandbutton_Ok").click();
        Thread.sleep(5000);
        //click on existing customer
        driver.findElement(By.xpath("//span[contains(text(),'Existing Customer')]")).click();
        Thread.sleep(5000);
        //enter account number
        driver.findElementById("sopackageSelection:searchAcctNo").sendKeys("960023720000");
        Thread.sleep(5000);
        //click on search button
        driver.findElementById("sopackageSelection:accountSearch").click();
        Thread.sleep(5000);
        //select department
        driver.findElementById("sopackageSelection:departmentCode").sendKeys("AQSAL - Anderson Sq Sales");
        Thread.sleep(5000);
        //select site
        driver.findElementById("sopackageSelection:siteCode").sendKeys("ANSQ-Anderson Square Store");
        Thread.sleep(5000);
        //select service type
        driver.findElementById("sopackageSelection:spserviceType").sendKeys("PCL - Provide Cellular/Mobile Service");
        Thread.sleep(5000);
        //select package
        driver.findElementById("sopackageSelection:spservicePackage").sendKeys("ECR500045-Testing Package(PCL)");
        Thread.sleep(5000);
        //click on proceed
        driver.findElementById("sopackageSelection:packageProceed").click();
        Thread.sleep(5000);
        //click proceed on pricing plans section
        driver.findElementById("durationPlanSelection:durationPricingPlan").click();
        Thread.sleep(5000);
        //click on handset
        driver.findElementByXPath("html/body/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td/form/div/div[3]/div[2]/div[2]/div[4]/div[2]/table/tbody/tr/td/table/tbody/tr/td[1]/span").click();
        Thread.sleep(5000);
        //click on proceed on feature products panel
        driver.findElementById("packageProductSelection:packageproductSelect").click();
        Thread.sleep(5000);
        //enter Bill Description ispf field
        driver.findElementById("packageProductSelection:productFieldDetails:0:productFieldValue").sendKeys("dfdfsdfsdf");
        Thread.sleep(5000);
        //click on proceed on Product Fields panel
        driver.findElementById("packageProductSelection:packageproductSelect").click();
        Thread.sleep(5000);
      //click on proceed on payements panel
        driver.findElementById("paymentItemsForm:selectPaymentItems").click();
        Thread.sleep(5000);
        //select exchange
        driver.findElementById("serviceSelectionMobile:exchangeID").sendKeys("MSCA-Post-paid GSM");
        Thread.sleep(5000);
      //select number area
        driver.findElementById("serviceSelectionMobile:numberarea").sendKeys("SMPO-GSM Post Paid Mobile");
        Thread.sleep(5000);
        //click on find button
        driver.findElementById("serviceSelectionMobile:searchMobileService").click();
        Thread.sleep(5000);
        //click on lookup
        driver.findElement(By.xpath("//input[@value='Look Up']")).click();
        Thread.sleep(5000);
        //select sim number
        Select dropdown=new Select(driver.findElement(By.xpath("//input[@value='Look Up']/./following::select[1]")));
    	dropdown.selectByIndex(2);
    	Thread.sleep(2000);
    	//select check box Same as Account Address:
    	driver.findElementByXPath("//input[@class='iceSelBoolChkbx']").click();
    	Thread.sleep(2000);
        //click on proceed on billing panel
    	driver.findElementById("serviceSelectionMobile:serviceSelectionMobile").click();
    	Thread.sleep(5000);
    	 //enter contract number
    	driver.findElementById("serviceDetailsAddtnForm:contractNumber").sendKeys("4323424");
    	Thread.sleep(5000);
    	//enter contract duration
    	driver.findElementById("serviceDetailsAddtnForm:contractDuration").sendKeys("12");
    	Thread.sleep(5000);
    	//enter contract description
    	driver.findElementById("serviceDetailsAddtnForm:contractDescription").sendKeys("dfdfds");
    	Thread.sleep(5000);
    	//click on submit button
    	driver.findElementById("serviceDetailsAddtnForm:serviceAdditionalDetials").click();
    	Thread.sleep(8000);
    	//click ok on pop up service order 
    	 //driver.findElement(By.xpath("//input[@id='signoffServiceOrderForm:spsp_commandbutton_Ok]")).click();
    	//click on submit order button
    	driver.findElementById("signoffServiceOrderButForm:signOffOrderHeader").click();
    	Thread.sleep(5000);
    	//click ok on Account Signoff Details 
    	driver.findElementById("browseGeneralSignOffFrm:accountSignoff").click();
    	Thread.sleep(5000);
    	//click  accept on Signoff Service Order - Account Sign Off
    	driver.findElementById("browseGeneralSignOffFrm:accountSignoffServiceOrder").click();
    	Thread.sleep(5000);
    	//click OK on success message pop up
    	driver.findElementById("signoffServiceOrderForm:Ok").click();
    	Thread.sleep(5000);
        
        
        
        
        
        
        
	}

}
