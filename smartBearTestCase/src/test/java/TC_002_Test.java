

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/***
 * 
 * @author sudarshan
 *
 */
public class TC_002_Test extends Basedata {
	@Test(groups = "Functionality")
	// Testcase2: Verify that User is able to click on the price Dropdown
	public void TC_002_MobileRadioButton() {
		PomRepoForSmartBear psm = new PomRepoForSmartBear(driver);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		psm.getMobilePhoneNavBar().click();
		psm.getPriceDropDown().click();
		wait.until(ExpectedConditions.elementToBeClickable(psm.getPriceDropDown()));
		Reporter.log("User is able to click on the Price Dropdown", true);
		Assert.assertFalse(false, "User is not able to click on the Price drop down button");
	}

}
