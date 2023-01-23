

import org.testng.Reporter;
import org.testng.annotations.Test;

/***
 * 
 * @author sudarshan
 *
 */
public class TC_008_Test extends Basedata {
	@Test(groups = "Functionality")
	// TestCase8:Verify that user is able to click on the PageIcon Dropdown
	public void TC_008_PerPageDropDown() {
		PomRepoForSmartBear psm = new PomRepoForSmartBear(driver);
		psm.getMobilePhoneNavBar().click();
		Reporter.log("User Navigated to Mobile page sucessfully", true);
		psm.getPageSizeDropdown().click();
		Reporter.log("user clicked the PerPage DropDown Sucessfully" + psm.getPageSizeDropdown().getText(), true);
	}
}
