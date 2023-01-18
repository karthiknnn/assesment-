package sakshingpdemo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Tc_01 extends Base_class {
	@Test
	public void loginn()
	{
		
		
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("admin");
	
	driver.findElement(By.id("log-in")).click();
	
	String value = "https://sakshingp.github.io/assignment/home.html";
	
	String curl = driver.getCurrentUrl();
	Assert.assertEquals(value, curl);
	
	
	System.out.println("succesfullylogin to application");
	
	driver.findElement(By.id("amount")).click();
	
	System.out.println("clicked on amount ");
	
	System.out.println("assesment by karthikeyan k ");
			

	
	
	}	
	
}
