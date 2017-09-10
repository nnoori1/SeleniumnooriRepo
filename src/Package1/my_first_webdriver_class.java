package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class my_first_webdriver_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test Case: Open Chrome Browser, Launch Facebook website
		// and Print the Title, Close the browser
		System.setProperty("webdriver.chrome.driver","c://sits//chromedriver.exe") ;
      
		// The Following statement is used to launch the Firefox Browser
		WebDriver driver = new ChromeDriver () ;
		// The following statement is sued to open Facebook page
		driver.get("https://www.facebook.com/");
		
		//The following statement print the title of the page
		System.out.println("THe Title of Facebook is : " + driver.getTitle());
		String Title;
		Title = driver.getTitle();
		System.out.println("The title of Facebook is : " + Title);
		
		driver.close();
	
	}

}
