

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

/***
 * 
 * @author sudarshan
 *
 */
public class TC_005_Test extends Basedata {
	@Test(groups = "Functionality")
	// Testcase5: Verify that User is able to Click on the Relevence Drop down
	public void TC_005_RelevenceDropDown() {
		PomRepoForSmartBear psm = new PomRepoForSmartBear(driver);
		psm.getMobilePhoneNavBar().click();
		WebElement drop = psm.getRelevencedropDown();
		drop.click();
		Select select = new Select(drop);
		List<WebElement> dropdown = select.getOptions();
		for (WebElement var : dropdown) {
			System.out.println(var);
		}
		Reporter.log("User is able to click on the Relevence dropdown", true);
	}
}
