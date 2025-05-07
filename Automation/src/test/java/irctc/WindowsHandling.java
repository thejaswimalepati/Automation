package irctc;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {
	@Test
	public void windowsHandling() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		//Classname obj=new ClassName();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-searchs");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'BUSES')]")).click();
		
		String paremntWindow=driver.getWindowHandle();
		
		Set <String> allWindows=driver.getWindowHandles();
		for(String window:allWindows) {
			String title=driver.switchTo().window(window).getTitle();
			System.out.println(title);
			if(title.contains("Bus Reservation")) {
				Thread.sleep(3000);
				driver.findElement(By.id("departFrom")).sendKeys("Bangalore");
				Thread.sleep(3000);
				driver.close();
			}else if(title.contains("flights")) {
				//logic
		}
		
		driver.switchTo().window(paremntWindow);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}}
