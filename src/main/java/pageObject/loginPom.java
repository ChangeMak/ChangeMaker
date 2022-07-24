package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPom  {

	
	@FindBy(how=How.XPATH,using="") private WebElement txt_email;
	@FindBy(how=How.XPATH,using="") private WebElement txt_pass;
	
	public WebElement getTxt_email() {
		return txt_email;
	}
	
	public WebElement getTxt_pass() {
		return txt_pass;
	}
	
	
}
