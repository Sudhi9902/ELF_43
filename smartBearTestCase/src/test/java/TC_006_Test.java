

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/***
 * 
 * @author sudarshan
 *
 */
public class TC_006_Test extends Basedata {
	@Test(groups = "Functionality")
	// TestCase6: Verify That user is able to click on the Relevence dropdown option
	public void TC_006_RelevenceOptionSelection() {
		PomRepoForSmartBear psm = new PomRepoForSmartBear(driver);
		psm.getMobilePhoneNavBar().click();
		WebElement drop = psm.getRelevencedropDown();
		drop.click();
		Reporter.log("Relevence Dropdown is displayed", true);
		psm.getOptionDrop2().click();
		Reporter.log("User click relevence dropdown Options Sucessfully :" + " " + psm.getOptionDrop2().getText(),
				true);
		String dropTittle = "Name: Z to A";
		Assert.assertEquals(psm.getOptionDrop2().getText(), dropTittle,
				"User Not able to click on the optionalDropdown");
	}
}
