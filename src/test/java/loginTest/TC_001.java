package loginTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObject.loginPom;
import utility.BaseClass;

public class TC_001 extends BaseClass{

    
     @Test
     public void Test() {
    	 
        loginPom login=PageFactory.initElements(driver, loginPom.class);

                 
    	 login.getTxt_email().sendKeys("abc");
     }
	
	
	
	
	
}
