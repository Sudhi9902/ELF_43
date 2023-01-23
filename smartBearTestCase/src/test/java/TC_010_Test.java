

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_010_Test extends Basedata {
	@Test(groups = "System")
	//TestCase10:Verify that user able to send the email without using the email
	//System Testing
	public void TC_010_EmailTofriend() {
		String Tittle = "Shop. iPhone Plus";
		PomRepoForSmartBear psb = new PomRepoForSmartBear(driver);
		psb.getMobilePhoneNavBar().click();
		Reporter.log("User Clicking On Mobile Phones Button", true);
		Reporter.log("User Navigated to Mobile page sucessfully", true);
		psb.getPhoneIcon().click();
		Assert.assertEquals(driver.getTitle(), Tittle, "User is not able to Click on Iphone");
		Reporter.log("user Clicked on Iphone SucessFully: " + " " + driver.getTitle(), true);
		psb.getAddtoWishListButton().click();
		Reporter.log("user add the product to wishList SucessFully", true);
		psb.getViewWishListPageButton().click();
		Reporter.log("User clicked on the wishList button on popupPage sucessfully ", true);
		Reporter.log("User Navigated to WishList Page sucessfully ", true);
		psb.getEmailToFriend().click();
		Reporter.log("user clicked on the Email to friend Sucessfully", true);
		psb.getSendMailButton().click();
		String error = psb.getErrortextOfMailBox().getText();
		Reporter.log("User is not able Send a mail Witout Enter the Email in Textbox"+" "+error, true);
	}

}
