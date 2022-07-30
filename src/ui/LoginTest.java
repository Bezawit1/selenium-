package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//this simple test is about launching a specific address and pass username and password
//and click on login button and the user should successfully login and close

public class LoginTest {
	public static String browser = "Chrome"; // EXTERNAL configuration xls..
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (browser.equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");

			driver = new ChromeDriver();
		} else {
			System.out.println("install the jar");
		}
	
		driver.get("https://iwork-employee-ui.herokuapp.com");
		
	}
}


