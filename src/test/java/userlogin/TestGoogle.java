package userlogin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WebDriver wd = new FirefoxDriver();
//		wd.get("http://google.com/");
//		wd.quit();
		
		System.setProperty("webdriver.chrome.driver","C:\\Download\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://phoenixdev.mpts.intra.chrysler.com/smarttrack/");
	
	
	List<WebElement> elements = driver.findElements(By.tagName("p"));
    for (WebElement e : elements) {
        System.out.println(e.getText());
    }
			
	
	//wb.findElement(By.name("Guest"));
	}

}
