package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EventBrite_TestCases {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Step 2: Open chrome web driver
		System.setProperty("webdriver.chrome.driver","c://sits//chromedriver.exe") ;
		
		// Step 3: Open web driver	
		WebDriver driver = new ChromeDriver () ;
		
		// Enter URL as www.eventbrite.com
		
		driver.get("https://www.eventbrite.com");
		
		// Click Signin button "Lets Get Started" Page should be displayed
		
		driver.findElement(By.xpath("//*[@id=\"global-header\"]/div/div[2]/a")).click();
		
		// Give 3 seconds thread
		
		Thread.sleep (2000);
		
		// Email text box and get started button should be displayed
		
		driver.findElement(By.xpath("//*[@id=\"signin-email\"]")).sendKeys("noori17458@mailing.com");
		
		// click on Get started
		
		driver.findElement(By.xpath("//*[@id=\"auth-modalv2\"]/div/div/dialog/div[1]/div/div/main/div/div/div/div/div/div/form/div[2]/button")).click();
		
		// Enter First Name
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Naveed");
		
		// Enter Last Name
		
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Noori");
		
		// Enter Password
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456789");
		
		// Click on Signup Button
		
		driver.findElement(By.xpath("//*[@id=\"auth-modalv2\"]/div/div/dialog/div[1]/div/div/main/div/div/div/div/div/div/div[2]/form/div[3]/button")).click();
		
		// CLick on Create Event
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"global-header\"]/div/div[2]/div[5]/a")).click();
		
		
		
	}

}
