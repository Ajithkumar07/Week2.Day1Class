package week2.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Module1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    WebDriverManager.chromedriver().setup();
	       ChromeDriver driver= new ChromeDriver();
	       driver.get("http://leaftaps.com/opentaps/control/main");
	       String title=driver.getTitle();
	       System.out.println("Title:"+ title);
	       driver.manage().window().maximize();
	       //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	       WebElement webuser=driver.findElement(By.id("username"));
	       webuser.sendKeys("demosalesmanager"); 
	       driver.findElement(By.id("password")).sendKeys("crmsfa");   
	       driver.findElement(By.className("decorativeSubmit")).click();
	       //driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS));
	       driver.findElement(By.linkText("CRM/SFA")).click();
	       
	       String title1=driver.getTitle();
	       System.out.println("Title:"+ title1);
	       
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
	      
	      
	  

	       //driver.findElement(By.className("smallSubmit")).click();
	       
	       
	      // driver.close();
	}
	

}
