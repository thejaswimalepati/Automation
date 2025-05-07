package irctc;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IrctcRegistration {
	@Test
public void irctcRegistration() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		//Classname obj=new ClassName();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-searchs");
		
		driver.manage().window().maximize();
		
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')] ")).click();
		//Thread.sleep(3000);
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
		try {
		driver.findElement(By.id("userName")).sendKeys("Thejaswi");
		}catch(NoSuchElementException e) {
			System.out.println("Due to NoSuchElementException the username textbox didn't enter the given value");
		}catch(ElementNotInteractableException e) {
			System.out.println("Due to ElementNotInteractableException the username textbox didn't enter the given value");
		}catch (StaleElementReferenceException e) {
			System.out.println("Due to StaleElementReferenceException the username textbox didn't enter the given value");
		}catch (WebDriverException e) {
			System.out.println("Due to WebDriverException the username textbox didn't enter the given value");
		}
		
		Thread.sleep(3000);
		driver.findElement(By.id("fullName")).sendKeys("Thejaswi Malepati");
		
		Thread.sleep(3000);
		driver.close();	
}
}
