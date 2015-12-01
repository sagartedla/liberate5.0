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

public class PEL_PDL_Limelite {

	
	public static void main(String[] args) throws InterruptedException {
	  
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
        // click on lime lite 
        driver.findElement(By.xpath("//span[contains(text(),'LIME LITE')]")).click();
        Thread.sleep(5000);
        //click on OK ..keyboard shortcuts
        driver.findElementById("keyBoardShortCutForm:kbsc_commandbutton_Ok").click();
        //driver.findElement(By.id("keyBoardShortCutForm:kbsc_commandbutton_Ok")).click();
        //select application form
        driver.findElementById("selectCustomerTypeForm:spserviceType").sendKeys("Fixed/ADSL (Residential)");
        Thread.sleep(5000);
        //select service package
        driver.findElementById("selectCustomerTypeForm:spservicePackage").sendKeys("PEL RES-PEL FIXED RESIDENTIAL (PEL)");
        Thread.sleep(5000);
        //click on proceed button on service package page
        driver.findElementById("selectCustomerTypeForm:createCustomerLimeLite").click();
        Thread.sleep(5000);
        //enter surname
        driver.findElementById("creditValidationLIME:surname").sendKeys("testpiremme");
        Thread.sleep(2000);
        driver.findElementById("creditValidationLIME:firstName").click();
        Thread.sleep(2000);
        //enter firstname
        driver.findElementById("creditValidationLIME:firstName").sendKeys("seperfsd");
        Thread.sleep(5000);
        //enter date if birth
        driver.findElementById("creditValidationLIME:dateOfBirth_input").click();
        Thread.sleep(2000);
        driver.findElementById("creditValidationLIME:dateOfBirth_input").sendKeys("01/10/1996");
        Thread.sleep(2000);
        //Click Done on calander
        driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
        Thread.sleep(2000);
        //select ID type
        driver.findElementById("creditValidationLIME:customerIDDTOList:0:customerIdClassification").sendKeys("OT-Other");
        Thread.sleep(2000);
        driver.findElementById("creditValidationLIME:customerIDDTOList:0:customerIdClassificationError").sendKeys("hj434hj34");
      //click on proceed button on Customer Info - Credit Validation
        driver.findElementById("creditValidationLIME:creditValidation").click();
        Thread.sleep(2000);
        //select salutation
        driver.findElementById("createCustomerPostGSMResLIME:salutation").sendKeys("MR");
        Thread.sleep(2000);
        //enter address
        driver.findElementById("createCustomerPostGSMResLIME:billingAddress:1:addressValueText").sendKeys("addrvess12");
        Thread.sleep(2000);
        //select bill report
        driver.findElementById("createCustomerPostGSMResLIME:billReport").sendKeys("C1_BILL");
        Thread.sleep(2000);
        //select Interim Bill Report:
        driver.findElementById("createCustomerPostGSMResLIME:interimBillReport").sendKeys("C1_BILL");
        Thread.sleep(2000);
        //click on next button
        driver.findElementById("createCustomerPostGSMResLIME:createCustomerPostResLime").click();
        Thread.sleep(2000);
        //click on Same as Billing: check box
        driver.findElementById("createCustomerPostGSMResLIME:sameAsBillingContact").click();
        Thread.sleep(2000);
        //enter E-mail ID for electronic Bill
        driver.findElementByXPath("html/body/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td/form[1]/div[2]/div[1]/div[2]/div[2]/div[4]/div[4]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/div/input").sendKeys("dasdasd@gmail.com");
        Thread.sleep(2000);
        //click on accept
        driver.findElementById("createCustomerPostGSMResLIME:addContact").click();
        Thread.sleep(2000);
        //click on confirm button
        driver.findElementById("createCustomerPostGSMResLIME:confirmPostResLime").click();
        Thread.sleep(2000);
        //select application sourse
        driver.findElementById("servicePackageSelection:packageBasedApplicationSource").sendKeys("1-Cellular King");
        Thread.sleep(2000);
        //click proceed on service package screen
        driver.findElementById("servicePackageSelection:packageProceedLime").click();
        Thread.sleep(5000);
        //click proceed on pricingplan section
        driver.findElementById("durationPlanSelection:durationPricingPlan").click();
        Thread.sleep(5000);
      //click proceed on feature products
        driver.findElementById("packageProductSelectionLIME:packageproductSelect").click();
        Thread.sleep(5000);
      //click proceed on payments items section
        driver.findElementById("paymentItemsForm:selectPaymentItems").click();
        Thread.sleep(5000);
        //check check box Same as Account Address:
        driver.findElementById("serviceSelectionTelephoneLIME:serviceAddressLime").click();
        Thread.sleep(2000);
        //select exchnage
        driver.findElementById("serviceSelectionTelephoneLIME:exchangeID").sendKeys("BOT-BODDEN TOWN");
        Thread.sleep(2000);
        //select number area
        driver.findElementById("serviceSelectionTelephoneLIME:numberarea").sendKeys("BODD-BODD Number area");
        Thread.sleep(2000);
        //click on find
        driver.findElementById("serviceSelectionTelephoneLIME:searchServiceLime").click();
        Thread.sleep(2000);
        //click on proceed
        driver.findElementById("serviceSelectionTelephoneLIME:serviceSelectionTelePhoneLime").click();
        Thread.sleep(5000);
      //click yes on pop up "Do you want to provide Broadband on the same service order"
        driver.findElementById("serviceSelectionTelephoneLIME:yesPress").click();
        Thread.sleep(5000);       
      //select ADSL package
        driver.findElementById("broadBandPackageSelectionLIME:lspd_spservicePackage").sendKeys("ADSL-ADSL Broadband (PDL)");
        Thread.sleep(2000);  
        //click on proceed
       driver.findElementByXPath("//input[@value='Proceed']").click();
        Thread.sleep(5000);  
      //click on proceed on pricing plans section
        driver.findElementById("durationPlanSelection:durationPricingPlan").click();
         Thread.sleep(5000);  
         //click on proceed on feature products
         driver.findElementById("packageProductSelectionLIME:packageproductSelect").click();
          Thread.sleep(5000);  
          //click on proceed on payments item screen
          driver.findElementById("paymentItemsForm:selectPaymentItems").click();
           Thread.sleep(5000); 
         //click on proceed on service details screen
           driver.findElementById("serviceSelectionBroadBandLIME:serviceSelectionBroadBandLime").click();
            Thread.sleep(10000); 
            //click on OK button on pop up
            //driver.findElement(By.xpath("//input[@id='signoffServiceOrderForm:spsp_commandbutton_Ok]")).click();
         //click on submit order button
            driver.findElementById("signoffServiceOrderButForm:signOffOrderHeader").click();
             Thread.sleep(5000); 
             //click on OK button on pop up
             driver.findElement(By.xpath("//input[@id='signoffServiceOrderForm:Ok']")).click();
             
        
        
        //driver.findElement(By.id("customerSearchForm:customerSearchFBTabSet:0:quickSearch:searchButton")).click();
      //Wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("Account Prop")));
     //   Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Account Prop")));
   //    driver.findElementByXPath("html/body/table/tbody/tr[3]/td[1]/form/div/div/div[4]/a/span").click();
        //Driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td/form/div[1]/div/div[1]/a/span");
    //    WebElement element = driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td/form/div[1]/div/div[1]/a/span"));
    //    Actions action = new Actions(driver);
     //   action.moveToElement(element).click();
     //   action.perform();
       

        
        
	}  
        
	}