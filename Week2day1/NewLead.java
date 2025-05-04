package week2.day1.Week2day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class NewLead {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		
		
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aswin");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		WebElement Source1 = driver.findElement(By.name("dataSourceId"));
		Select s1 = new Select (Source1);
		s1.selectByIndex(5);
		
		WebElement Source2 = driver.findElement(By.name("marketingCampaignId"));
		Select s2 = new Select (Source2);
		s2.deselectByVisibleText("Automobile");
		
		WebElement Source3 = driver.findElement(By.name("ownershipEnumId"));
		Select s3 = new Select (Source3);
		s3.deselectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.close();
		
		
		

}
}