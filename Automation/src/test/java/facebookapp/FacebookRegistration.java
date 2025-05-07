package facebookapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookRegistration {
	//accessmodifier returntype methodName()
	
	@Test
	public void facebookRegistration() throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		
		//Classname obj=new ClassName();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Thejaswi");
		
		Thread.sleep(4000);
		//driver.findElement(By.name("websubmit")).click();
		WebElement dobDate=driver.findElement(By.id("day"));
		
		Select sel=new Select(dobDate);
		
		//sel.selectByIndex(4);
		
		//sel.selectByValue("28");
		sel.selectByVisibleText("14");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']")).sendKeys("4256735445");
		driver.close();
		
		
	}
	

}
