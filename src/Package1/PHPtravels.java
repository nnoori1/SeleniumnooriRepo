package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHPtravels {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","c://sits//chromedriver.exe") ;
		
		// step 2: Open PHP Web driver
		
		WebDriver driver = new ChromeDriver () ;
		driver.get("http://phptravels.net");
		
		// Step 3: Print the title of the page
		System.out.println(" The Title of page is : " +driver.getTitle());
		// Step 4: Click on mMy Account By Xpath
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[2]/a")).click();
		// Step 4: Click on Sign Up By Xpath
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Haroon");
		driver.findElement(By.name("lastname")).sendKeys("Siddiqi");
		driver.findElement(By.name("phone")).sendKeys("2403106506");
		driver.findElement(By.name("email")).sendKeys("haronjann@gmail.com");
		driver.findElement(By.name("password")).sendKeys("byebye");
		driver.findElement(By.name("confirmpassword")).sendKeys("byebye");
		driver.findElement(By.xpath("//*[@id=\'headersignupform\']/div[9]/button")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
		driver.close();
		
		

		

		


		
		
				
				
				
				
		

	}

}
