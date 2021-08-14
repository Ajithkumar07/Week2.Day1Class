package Week2_day1_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
	       ChromeDriver driver= new ChromeDriver();
	       driver.get("https://en-gb.facebook.com/");
	       //String title=driver.getTitle();
	       //System.out.println("Title:"+ title);
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	       
	      driver.findElement(By.linkText("Create New Account")).click();
	      
	      driver.findElement(By.name("firstname")).sendKeys("Ajith");
	      driver.findElement(By.name("lastname")).sendKeys("Kumar");
	      driver.findElement(By.name("reg_email__")).sendKeys("98989789789");
	      driver.findElement(By.id("password_step_input")).sendKeys("121212");
	      
	      
	      	WebElement Date = driver.findElement(By.name("birthday_day"));
			Select dy= new Select(Date);
			dy.selectByValue("7");
		

			WebElement Month = driver.findElement(By.name("birthday_year"));
			Select mon= new Select(Month);
			mon.selectByValue("6");
		

			WebElement Year = driver.findElement(By.name("birthday_year"));
			Select yer1= new Select(Year);
			yer1.selectByValue("1996");
	}
}
