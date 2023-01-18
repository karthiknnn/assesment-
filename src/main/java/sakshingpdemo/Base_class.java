package sakshingpdemo;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Base_class {
	
	public WebDriver driver;
	public propertyfile pdata=new propertyfile();
	public Webdriveruti utilies=new Webdriveruti();
	
	
	@BeforeMethod
	public void openApp() throws IOException {
      WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(pdata.gerPropertydata("url"));
	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	
	}
	
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException
	
	{
		int status = res.getStatus();
	     String name = res.getName();
	     if(status==2) {
	    photo p=new photo();
	    p.getPhoto(driver, name);
	     }
		driver.quit();
	}
	
	
	
}
