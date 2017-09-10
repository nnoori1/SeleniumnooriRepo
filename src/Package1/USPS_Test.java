package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class USPS_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 2: Open chrome web driver
		System.setProperty("webdriver.chrome.driver","c://sits//chromedriver.exe") ;
		
	
		// Step 3: Open USPS web driver	
		WebDriver driver = new ChromeDriver () ;
		// Step 4: Navigate to http://https://www.usps.com/
		driver.get("https://www.usps.com/");
		// Step 4: Navigate to http://https://www.usps.com/
		 // Step 5: Print the title of the page
		System.out.println(" The Title of page is : " +driver.getTitle());
		
		//Click on “REGISTER” link (use By Link text or By link)
		driver.findElement(By.linkText("Register/ Sign In")).click();
		
	}

}
