

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/***
 * 
 * @author sudarshan
 *
 */
public class TC_Mobile_009_Test extends Basedata {
	String FinalPage = "Shop. Shopping Cart";

	@Test(groups = "System")
	// System Testing
	// Testcase9: Verify that User is Able Click on the Remove button of product in
	// Shoppingcart Page
	public void TC_009_ClickOnMobilePhone() {
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
		psb.getAddButton().click();
		Reporter.log("User Clicked On The AddTocart Button Sucessfully", true);
		psb.getCartNavBarButton().click();
		Reporter.log("User Navigated To Addto cart Page Sucessfully", true);
		psb.getRemoveButton().click();
		Reporter.log("User Remove the Product From the Cart page sucessfully", true);
		Assert.assertEquals(driver.getTitle(), FinalPage, "User is not able to click on the Remove Button");
	}

}
