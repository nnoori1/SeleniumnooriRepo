package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindGoogleElementClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Test Case: Open Chrome browser, 
		// open https://www.google.com/ web page
		// Search for "Herndon VA" and click on search
		// Close the browser
		
		// step1: open chrome browser
		
		System.setProperty("webdriver.chrome.driver","c://sits//chromedriver.exe") ;
		WebDriver driver = new ChromeDriver () ;
		
		// step2: open google
		
		driver.get("https://www.google.com/");
		
		// Step3: Search for "Herndon VA" and click on search
		
		driver.findElement(By.name("q")) .sendKeys("Herndon VA");
		Thread.sleep(5000);	
		
		WebElement element = driver.findElement(By.name("q")) ;
		element.submit();
		
		// close the browser
		driver.close();
		
		
		
		
		

	}

}
