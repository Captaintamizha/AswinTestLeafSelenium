package week2.day2.Week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main (String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")).click();
		 driver.findElement(By.name("firstname")).sendKeys("crmsfa");
		 driver.findElement(By.name("lastname")).sendKeys("tester");
		 
		 WebElement bday =  driver.findElement(By.name("birthday_day"));
		 
		 Select S = new Select (bday);
		 S.selectByIndex(5);
		 
		 
		 WebElement bmonth =  driver.findElement(By.name("birthday_month"));
		 
		 Select S1 = new Select (bmonth);
		 
		 S1.selectByIndex(5);
		 
		 WebElement byear =  driver.findElement(By.name("birthday_year"));
		 
		 Select S2 = new Select (byear);
		 
		 S2.selectByIndex(20);
		 
		 driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		 
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/div[1]/input[1]")).sendKeys("test@test.com");
		 
		 driver.findElement(By.id("password_step_input")).sendKeys("Test@567123456");
		 
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[11]/button[1]")).click();
		 
		
	}

}
