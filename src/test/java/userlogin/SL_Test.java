package userlogin;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SL_Test {

	@Test
	public void loginTest(){
		//System.setProperty("webdriver.chrome.driver","C:\\Jenkins\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);
		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	//	driver.get("https://opensource-demo.orangehrmlive.com/");
		AssertJUnit.assertEquals(driver.getTitle(), "Google");
	}
}
