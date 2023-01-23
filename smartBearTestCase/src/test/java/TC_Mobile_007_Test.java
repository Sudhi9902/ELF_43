
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/***
 * 
 * @author sudarshan
 *
 */
public class TC_Mobile_007_Test extends Basedata {
	@Test(groups = "Functionality")
	// TestCase7: Verify that user is able to click on the Other Relevence Option
	public void TC_007_RelevenceDropDown() {
		String dropTittle = "Newest Arrivals";
		PomRepoForSmartBear psm = new PomRepoForSmartBear(driver);
		psm.getMobilePhoneNavBar().click();
		WebElement drop = psm.getRelevencedropDown();
		drop.click();
		Reporter.log("Relevence Dropdown is displayed", true);
		psm.getOptionDrop4().click();
		Reporter.log("User click other relevence dropdown Options Sucessfully :" + " " + psm.getOptionDrop4().getText(),
				true);
		Assert.assertEquals(psm.getOptionDrop4().getText(), dropTittle,
				"User Not able to click on the optionalDropdown");
	}

}
