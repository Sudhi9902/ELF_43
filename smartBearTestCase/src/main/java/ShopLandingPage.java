

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * @author sudarshan
 *
 */
public class ShopLandingPage {
	// Rule1: Creating the Constructor
	public ShopLandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Rule 2: Finding The Required Locators
	@FindBy(xpath = "//span[text()='Log in']/../..")
	private WebElement LoginButton;
	@FindBy(id = "UsernameOrEmail")
	private WebElement UserNameTextField;
	@FindBy(id = "Password")
	private WebElement PassWordTextField;
	@FindBy(id = "RememberMe")
	private WebElement RememberBox;
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	private WebElement LogInButton;
	@FindBy(xpath = "//span[text()='Sd99']/..")
	private WebElement UserDropDown;
	@FindBy(xpath = "//span[text()='Log out']")
	private WebElement logOutButton;
	public WebElement getLoginButton() {
		return LoginButton;
	}
	public WebElement getUserNameTextField() {
		return UserNameTextField;
	}
	public WebElement getPassWordTextField() {
		return PassWordTextField;
	}
	public WebElement getRememberBox() {
		return RememberBox;
	}
	public WebElement getLogInButton() {
		return LogInButton;
	}
	public WebElement getUserDropDown() {
		return UserDropDown;
	}
	public WebElement getLogOutButton() {
		return logOutButton;
	}
}
