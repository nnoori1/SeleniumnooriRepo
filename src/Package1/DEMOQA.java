package Package1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import= codes are imported from JAR file and you don't see the codes

public class DEMOQA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int x =1;
		
		while (x < 10) {
		System.setProperty("webdriver.chrome.driver","c://sits//chromedriver.exe") ;
		// step 2: Open PHP Web driver
		WebDriver driver = new ChromeDriver () ;
		driver.get("http://demoqa.com");		
		// step 2: Click Registration
		driver.manage().window().maximize();
		//driver.findElement(By.id("menu-item-374")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-374\"]/a")).click();
		driver.findElement(By.name("first_name")).sendKeys("Naveed");
		driver.findElement(By.name("last_name")).sendKeys("Noori");
		driver.findElement(By.name("radio_4[]")).click();
		driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[3]/div/div[1]/input[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[2]/div/div/input[2]")).click();
		driver.findElement(By.id("dropdown_7")).sendKeys("Tajikistan");
		driver.findElement(By.id("mm_date_8")).sendKeys("7");
		driver.findElement(By.id("dd_date_8")).sendKeys("25");
		driver.findElement(By.id("yy_date_8")).sendKeys("1989");
		driver.findElement(By.xpath("//*[@id=\"phone_9\"]")).sendKeys("935713038602");
				
		Random username = new Random();
		int username1= username.nextInt(500) + 1;
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("nnoori000" +username1);
		driver.findElement(By.xpath("//*[@id=\"email_1\"]")).sendKeys("nnoori000"+username1+"@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("My name is Naveed. I live in Reston");
		driver.findElement(By.xpath("//*[@id=\"password_2\"]")).sendKeys("ByeBye@123");
		driver.findElement(By.xpath("//*[@id=\"confirm_password_password_2\"]")).sendKeys("ByeBye@123");
		driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[14]/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"post-49\"]/div/p")).click();
		Thread.sleep(3000);
		System.out.print(x);
		x=x+1;
		driver.close();
		}
		
		
		
		
		
		
		
				
		
		

		

	}

}
