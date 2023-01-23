

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
public class TC_Mobile_003_Test extends Basedata {
	@Test(groups = "Functionality")
	// TestCase3: Verify that user is able to click on the price Radio Buttton
	public void TC_003_MobilePriceRadioButton() throws InterruptedException {
		PomRepoForSmartBear psm = new PomRepoForSmartBear(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		psm.getMobilePhoneNavBar().click();
		wait.until(ExpectedConditions.elementToBeClickable(psm.getPriceRadioButton5()));
		psm.getPriceRadioButton5().click();
		Reporter.log("User is able to click on the Radio Button", true);
		Assert.assertFalse(false, "user is not able to click on the Price radio button");
		String text = psm.getPriceRadioButton5().getText();
		assertEquals(psm.getPriceRadioButton5().getText(), text, "User is not able to click on radio button");
		Reporter.log(" The selected Radio button is :" + " " + text, true);
	}

}
