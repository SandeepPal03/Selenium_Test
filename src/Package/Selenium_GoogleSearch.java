package Package;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class Selenium_GoogleSearch {
	static WebDriver driver;
	static int i = 0;
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Drivers\\geckodriver.exe");
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Drivers\\IEDriverServer.exe");	
		//driver = new IeDriver();
		
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		captureScreenShot(driver);

	}
	
	public static void captureScreenShot(WebDriver ldriver){
		i=i+1;
		File src = ((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
		try{
			FileUtils.copyFile(src, new File("C:\\Users\\Sandeep\\workspace\\Selenium_Test\\screenshots\\"+"Scrshot_"+ i +"_"+ System.currentTimeMillis()+".png"));
			
		}catch (IOException e){
			}
		}
	

}
