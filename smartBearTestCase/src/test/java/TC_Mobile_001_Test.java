

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/***
 * 
 * @author sudarshan
 *
 */
public class TC_Mobile_001_Test extends Basedata {
	@Test(groups = "Functionality")
	// TestCase1: Verify that User is able to click On the Mobile Phone
	// navBarElement
	public void TC_001_Mobile() throws InterruptedException {
		String expectedPage = "Shop. Apple";
		SoftAssert soft = new SoftAssert();
		PomRepoForSmartBear psm = new PomRepoForSmartBear(driver);
		Reporter.log("User Landed to Home Page Sucessfully", true);
		psm.getMobilePhoneNavBar().click();
		Reporter.log("User is Navigated to Mobile Phone Page Sucessfully", true);
		Reporter.log("User is clicking on Mobile button", true);
		soft.assertEquals(driver.getTitle(), expectedPage, "User is not able to click on Mobile Button");
		Reporter.log(driver.getTitle()+" "+"Mobile Page", true);
		soft.assertAll();

	}

}
