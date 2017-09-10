package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercurytoolsregisteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","c://sits//chromedriver.exe") ;
		
	// Step 3: Open Web browser	
	WebDriver driver = new ChromeDriver () ;
	
	// Step 4: Navigate to http://newtours.demoaut.com/
	
	driver.get("http://newtours.demoaut.com/");
	  // Step 5: Print the title of the page
	System.out.println(" The Title of page is : " +driver.getTitle());
	
	//Click on “REGISTER” link (use By Link text or By link)
	driver.findElement(By.linkText("REGISTER")).click();
	driver.findElement(By.name("firstName")).sendKeys("Naveed");
	driver.findElement(By.name("lastName")).sendKeys("Noori");
	driver.findElement(By.name("phone")).sendKeys("5713038602");
	driver.findElement(By.name("userName")).sendKeys("noorifsco@gmail.com");
	// Entering Mailing Information 
	driver.findElement(By.name("address1")).sendKeys("12060 greywing sq");
	driver.findElement(By.name("address2")).sendKeys("B3");
	driver.findElement(By.name("city")).sendKeys("Reston");
	driver.findElement(By.name("state")).sendKeys("VA");
	driver.findElement(By.name("postalCode")).sendKeys("20191");
	driver.findElement(By.name("country")).sendKeys("United States");
	// Entering   User Information
	driver.findElement(By.name("email")).sendKeys("noorifsco@gmail.com");
	driver.findElement(By.name("password")).sendKeys("byebye");
	driver.findElement(By.name("confirmPassword")).sendKeys("byebye");
	driver.findElement(By.name("register")).click();
	System.out.println(" The Title of page is : " +driver.getTitle());
	
	if (driver.getPageSource().contains("Thank you for registering")) {
		System.out.println("Test Case Passed");
		
	}
	
	else {
		System.out.println("Test Case Failed");
	}
	
	driver.close();
	
	
	
	
		
		
		
	}

}
