package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class USPSZipcodeSearchmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://sits//chromedriver.exe") ;
		
		String zipcode = "20878";
		USPSsearch (zipcode);
		
				
				
	}

	private static void USPSsearch(String i) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver () ;
		driver.get("https://usps.com/");
		driver.findElement(By.xpath("//*[@id=\"global-menu\"]/div/nav/ol/li[2]/a/span")).click();
		driver.findElement(By.name("Find USPS")).click();
		driver.findElement(By.name("address")).sendKeys(i);
		
		
		
		
		
	}

}
