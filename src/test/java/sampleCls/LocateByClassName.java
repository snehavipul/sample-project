package sampleCls;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByClassName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("http://zero.webappsecurity.com/");
		// Fetching the title of current page
				System.out.println("The page title before clicking on Sign In Button is : " + driver.getTitle());

				// Finding the WebElement for SignIn button
				WebElement signInButton = driver.findElement(By.className("signin"));

				// Clicking on the Sign In box
				signInButton.click();

				// Waiting for login page to load
				Thread.sleep(4000);
				
				// Fetching the title of the updated page
				System.out.println("The page title after clicking on Sign In Button is : " + driver.getTitle());
				
				// -------------------------------------------------------------------------------------------------
				
				// Sending text to Login Text Box
				WebElement loginTextBox = driver.findElement(By.id("user_login"));
				loginTextBox.sendKeys("username");
				
				// Sending text to password text box
				WebElement passwordTextBox = driver.findElement(By.id("user_password"));
				passwordTextBox.sendKeys("password");
				
				// Click operation on SignIn Button on login page
				WebElement SignInButtonLogInPage = driver.findElement(By.name("submit"));
				SignInButtonLogInPage.click();
				
				// Fetching the title of the updated page
				System.out.println("The page title after clicking on Sign In Button is : " + driver.getTitle());
				
			
				// Closing The browser
				driver.quit();

	}

}
