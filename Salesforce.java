package Week2_day1_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		// String title=driver.getTitle();
		// System.out.println("Title:"+ title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.name("UserFirstName")).sendKeys("Ajith");
		driver.findElement(By.name("UserLastName")).sendKeys("Kumar");
		driver.findElementByName("UserEmail").sendKeys("ajithanblagan07@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Unite");
		driver.findElement(By.name("UserPhone")).sendKeys("987654321");

		WebElement utitle = driver.findElement(By.name("UserTitle"));
		Select title = new Select(utitle);
		title.selectByValue("Customer_Service_Manager_AP");

		WebElement cemployees = driver.findElement(By.name("CompanyEmployees"));
		Select employees = new Select(cemployees);
		employees.selectByValue("250");

		driver.findElement(By.id("SubscriptionAgreement-Kr91-cbxLbl")).click();
			
				
			

	}

}
