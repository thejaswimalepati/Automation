package facebookapp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsPractice {
@Test
		// TODO Auto-generated method stub
		public void alertsPractice() throws InterruptedException  {
			
			WebDriverManager.chromedriver().setup();
			
			//Classname obj=new ClassName();
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://demoqa.com/alerts");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("alertButton")).click();
			Thread.sleep(3000);
			Alert simpleAlert= driver.switchTo().alert();
			String simpleAlertMsg=simpleAlert.getText();
			System.out.println(simpleAlertMsg);
			String ExpectedMsg="You clicked a button";
			if(simpleAlertMsg.equals(ExpectedMsg)) {
				
				System.out.println("Both actual and expected are equal");
			}else {
				System.out.println("Both actual and expected not are equal");
			}
			
			simpleAlert.accept();
			Thread.sleep(3000);
			
			driver.close();
			

	}

}
