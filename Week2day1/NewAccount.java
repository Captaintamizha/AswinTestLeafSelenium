package week2.day1.Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAccount {
	
	public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	
	String title = driver.getTitle();
	System.out.println(title);
	//enter the uname
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	//enter the password
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	//click login
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Accounts")).click();
	
	driver.findElement(By.linkText("Create Account")).click();
	
	driver.findElement(By.id("accountName")).sendKeys("demotestash");
	
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	
	driver.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
	driver.findElement(By.className("smallSubmit")).click();
	
	String Title = driver.getTitle();
	System.out.println(Title + "Is correct");
	
	

}}
