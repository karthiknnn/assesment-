package pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	
	@FindBy(id="username")
	private WebElement usnf;
	
	@FindBy(id="password")
	private WebElement pwdf;
	
	@FindBy(id="log-in")
	private WebElement loginbth;
	
	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void  userrname(String us) {
		usnf.sendKeys(us);
	}
	public void  password(String ps) {
		pwdf.sendKeys(ps);
	}
	public void  loginbtn() {
		loginbth.click();
	}
	
}