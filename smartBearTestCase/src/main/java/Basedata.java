
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

/***
 * 
 * @author Sudarshan
 *
 */
public class Basedata {
	public WebDriver driver;
	String expectedTittle = "Shop";

	@Parameters("browserName")
	@BeforeClass
	// Step1: Launching the Browser
	public void browserSetUp(@Optional("chrome") String bname) {
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(bname, "chrome");
		driver = new ChromeDriver();
		Reporter.log("The empty browser is Launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser window is Maximized", true);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(ReadData.fromPropertyFile("Url"));
		String actualTittle = driver.getTitle();
		soft.assertEquals(actualTittle, expectedTittle, "Home Page is Displayed");
		Reporter.log("User Navigted to HomePage Suceesfully", true);
		Reporter.log(actualTittle, true);

	}

	@BeforeMethod
	public void LoginUser() {
		ShopLandingPage sp = new ShopLandingPage(driver);
		sp.getLoginButton().click();
		sp.getUserNameTextField().sendKeys(ReadData.fromPropertyFile("UserName"));
		sp.getPassWordTextField().sendKeys(ReadData.fromPropertyFile("Password"));
		sp.getLogInButton().click();
		Reporter.log("User Login Sucessfully", true);
	}

	@AfterMethod
	public void LogOut() {
		ShopLandingPage sp = new ShopLandingPage(driver);
		sp.getUserDropDown().click();
		sp.getLogOutButton().click();
		Reporter.log("User Logout Sucessfully", true);
	}

	@AfterClass
	public void quitBrowser() {
		driver.quit();
		Reporter.log("Server Closed Sucessfully", true);
	}
}
