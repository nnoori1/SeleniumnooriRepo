package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FDA_Project {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://sits//chromedriver.exe") ;
		
		WebDriver driver = new ChromeDriver () ;
		driver.get("http://www.fda.gov/");// open FDA home page
		
		driver.findElement(By.xpath("//*[@id=\"fda-topmenu\"]/div/div/ul/li[4]/a")).click();//Click on Drugs tab 
		driver.findElement(By.xpath("//*[@id=\"Sub_Content\"]/div[1]/div[2]/div/div[1]/span[1]/a")).click();// Navigate to Emergency Preparedness 
		
		Thread.sleep(5000);
		
		
		if (driver.getPageSource().contains("Related FDA Resources")) {
			System.out.print("Text Verified");
		}
		else {
			System.out.print("Text Not Verified");
		}
			
		System.out.println(" The Title of page is : " +driver.getTitle());
		
		if (driver.getPageSource().contains("Public Health Emergency Preparedness and Response (Centers for Disease Control and Prevention)")) {
			System.out.print("Element is present");
		}
		else {
			System.out.print("Element not found");
			
		}
			
			driver.close();
			
		
		
		
		
	

			
				
			}
		}
