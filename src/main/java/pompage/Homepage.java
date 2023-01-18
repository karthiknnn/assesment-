package pompage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	@FindBy(id="amount")
	private WebElement amountbttn;
	
	public void  amountfield() {
		amountbttn.click();
	}
	
}
