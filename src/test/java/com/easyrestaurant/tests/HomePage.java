package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage {
	
	@Test
	public void Testing() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
		WebDriver driver= new ChromeDriver();
		
		sleep(3000);
		driver.manage().window().maximize();
		
		String url = "http://localhost:3000";
		driver.get(url);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		sleep(3000);
		
		js.executeScript("window.scrollBy(0,1000)", "");
		
		
		
		//driver.close();
	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}