

import static org.testng.Assert.assertEquals;

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
public class TC_004_Test extends Basedata {
	@Test(groups = "Functionality")
	// TestCase4: Verify that user is able to click on the Rs 25.00 price radio
	// button
	public void TC_004_MobileRadioButtonOfRs25() {
		PomRepoForSmartBear psm = new PomRepoForSmartBear(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		psm.getMobilePhoneNavBar().click();
		wait.until(ExpectedConditions.elementToBeClickable(psm.getPriceRadioButton1()));
		psm.getPriceRadioButton1().click();
		Reporter.log("User is able to click on the Rs 25.00 price Radio Button", true);
		Assert.assertFalse(false, "user is not able to click on the Rs 25.00 Price radio button");
		String text = psm.getPriceRadioButton1().getText();
		assertEquals(psm.getPriceRadioButton1().getText(), text, "User is not able to click on radio button");
		Reporter.log(" The selected Radio button is :" + " " + text, true);
	}

}
