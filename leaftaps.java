package Week2_day1_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leaftaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriverManager.chromedriver().setup();
	       ChromeDriver driver= new ChromeDriver();
	       driver.get("http://leaftaps.com/opentaps/control/main");
	       //String title=driver.getTitle();
	       //System.out.println("Title:"+ title);
	       driver.manage().window().maximize();
	       //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	       WebElement webuser=driver.findElement(By.id("username"));
	       webuser.sendKeys("demosalesmanager"); 
	       driver.findElement(By.id("password")).sendKeys("crmsfa");   
	       driver.findElement(By.className("decorativeSubmit")).click();
	       //driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS));
	       driver.findElement(By.linkText("CRM/SFA")).click();
	       
	       //String title1=driver.getTitle();
	       //System.out.println("Title:"+ title1);
	       
	       driver.findElement(By.linkText("Leads")).click();
	       driver.findElement(By.linkText("Create Lead")).click();
	       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Unite");
	       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ajith");
	       driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
	       WebElement countrycode=driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
	       
	       countrycode.clear();
	       countrycode.sendKeys("11");
	       
	      WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
	      Select drpdwn= new Select(drop1);
	      drpdwn.selectByIndex(2);
	      
	      
	      WebElement drop2 = driver.findElement(By.name("marketingCampaignId"));
	      Select drpdown1= new Select(drop2);
	      drpdown1.selectByVisibleText("Automobile");
	     
	      WebElement drop3 = driver.findElement(By.name("industryEnumId"));
	      Select drpdwn3= new Select(drop3);
	      drpdwn3.selectByValue("IND_HEALTH_CARE");
	      
	      
	     driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ranjish");
	     
	     driver.findElement(By.name("lastNameLocal")).sendKeys("eapen");
	     driver.findElement(By.name("personalTitle")).sendKeys("Mr");
	     driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/07/2021");
	     driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Associate");
	     
	     driver.findElement(By.name("departmentName")).sendKeys("SOFTWARE");
	     driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500000");
	     driver.findElement(By.name("numberEmployees")).sendKeys("2500");
	     
	     WebElement drop4 = driver.findElement(By.name("currencyUomId"));
	     Select drpdwn4= new Select(drop4);
	      drpdwn4.selectByValue("INR");
	      
	      //ownership
	      WebElement drop5 = driver.findElement(By.name("ownershipEnumId"));
		     Select drpdwn5= new Select(drop5);
		      drpdwn5.selectByValue("OWN_CCORP");
		      
		      
		      driver.findElement(By.name("sicCode")).sendKeys("150");
		      driver.findElement(By.name("tickerSymbol")).sendKeys("YES");
		      driver.findElement(By.name("description")).sendKeys("Learn selenim");
		      driver.findElement(By.name("importantNote")).sendKeys("Take notes");
		      
		      ///Contact details
		      
		      driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
		      driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
		      driver.findElement(By.name("primaryPhoneExtension")).sendKeys("91");
		      driver.findElement(By.name("primaryPhoneAskForName")).sendKeys("Ajith");
		      driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ajithanbalagan07@gmail.com");
		      driver.findElement(By.name("primaryWebUrl")).sendKeys("Dummy@abc.com");
		      
		      //Primary Address
		      
		      driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Ashok");
		      driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Asaithambi");
		      driver.findElement(By.name("generalAddress1")).sendKeys("91/a");
		      driver.findElement(By.name("generalAddress2")).sendKeys("Thirudan escape colony");
		      driver.findElement(By.name("generalCity")).sendKeys("Chennai");
		      driver.findElement(By.name("generalPostalCodeExt")).sendKeys("122");
		      driver.findElement(By.name("generalPostalCode")).sendKeys("91");
		      
				/*WebElement drop6 = driver.findElement(By.name("generalCountryGeoId"));
				Select drpdwn6 = new Select(drop6);
				drpdwn4.selectByValue("USA");
				*/
				WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select drop7= new Select(state);
				drop7.selectByValue("AK");
			

	       driver.findElement(By.className("smallSubmit")).click();
				
				//String title=driver.getTitle();
				
				
				String HomeTitle=driver.getTitle();
				System.out.println(HomeTitle);

				if(HomeTitle.equals("View Lead | opentaps CRM"))
				System.out.println("In home page");
				else 
				System.out.println("Not in home page");
		
	}
}
