

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * This is the pom repository for the application We are storing the Locators of
 * the page
 * 
 * @author sudarshan
 *
 */
public class PomRepoForSmartBear {
	// Rule1: Creating the Constructor
	public PomRepoForSmartBear(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[.='Mobile phone']")
	private WebElement MobilePhoneNavBar;
	@FindBy(xpath = "//a[contains(text(),'Price')]")
	private WebElement PriceDropDown;
	@FindBy(xpath = "//span[contains(text(),'up to $25.00')]")
	private WebElement PriceRadioButton1;
	@FindBy(xpath = "//span[contains(text(),'up to $50.00')]")
	private WebElement PriceRadioButton2;
	@FindBy(xpath = "//span[contains(text(),'up to $100.00')]")
	private WebElement PriceRadioButton3;
	@FindBy(xpath = "//span[contains(text(),'up to $250.00')]")
	private WebElement PriceRadioButton4;
	@FindBy(xpath = "//span[contains(text(),'up to $1,000.00')]")
	private WebElement PriceRadioButton6;
	@FindBy(xpath = "//span[contains(text(),'up to $500.00')]")
	private WebElement PriceRadioButton5;
	@FindBy(id = "artlist-action-sort")
	private WebElement RelevencedropDown;
	@FindBy(xpath = "//option[text()='Name: A to Z']")
	private WebElement OptionDrop1;
	@FindBy(xpath = "//option[text()='Name: Z to A']")
	private WebElement OptionDrop2;
	@FindBy(xpath = "//option[text()='Price: Low to High']")
	private WebElement OptionDrop3;
	@FindBy(xpath = "//option[text()='Newest Arrivals']")
	private WebElement OptionDrop4;
	@FindBy(id = "artlist-action-pagesize")
	private WebElement PageSizeDropdown;
	@FindBy(xpath = "//option[text()='12']")
	private WebElement IconPerPage;
	@FindBy(xpath = "//img[contains(@title,'Phone Minus')]")
	private WebElement PhoneIcon;
	@FindBy(xpath = "//span[text()='Add to List']/..")
	private WebElement AddtoWishListButton;
	@FindBy(xpath = "//span[text()='View Wishlist']/../..")
	private WebElement ViewWishListPageButton;
	@FindBy(xpath = "//div[@class='alert alert-warning fade show']")
	private WebElement WarningText;
	@FindBy(xpath = "//strong[text()='Cart']/../..")
	private WebElement CartNavBarButton;
	@FindBy(xpath = "//h4[@class='no-item-title']")
	private WebElement EmptyPageVerfication;
	@FindBy(xpath = "//span[text()='Books']")
	private WebElement BookNavBarButton;
	@FindBy(xpath = "//span[text()='Furniture']/../..")
	private WebElement FurnitureButton;
	@FindBy(xpath = "//span[text()='Sports']")
	private WebElement SportsButton;
	@FindBy(xpath = "//span[text()='Fashion']/..")
	private WebElement FashionButton;
	@FindBy(xpath = "//span[text()='Gaming']/..")
	private WebElement GamingButton;
	@FindBy(xpath = "//span[text()='Watches']/..")
	private WebElement WathesButton;
	@FindBy(xpath = "//span[text()='Gift Cards']/..")
	private WebElement GiftCardButton;
	@FindBy(xpath = "//span[text()='Bestseller']")
	private WebElement BestSellerButton;
	@FindBy(xpath = "//span[text()='Cook and enjoy']")
	private WebElement CookEnjoyButton;
	@FindBy(xpath = "//span[text()='Basketball']")
	private WebElement BasketBallButon;
	@FindBy(xpath = "//span[text()='Soccer']")
	private WebElement SoccerButton;
	@FindBy(xpath = "//span[text()='Golf']")
	private WebElement GolfButton;
	@FindBy(xpath = "//span[text()='Sunglasses']")
	private WebElement SunglassButton;
	@FindBy(xpath = "//span[text()='Compare']/../../.")
	private WebElement CompareNavBar;
	@FindBy(xpath = "//strong[text()='List']/../..")
	private WebElement WishlistNavBar;
	@FindBy(id = "instasearch")
	private WebElement SearchBar;
	@FindBy(xpath = "//span[text()='Add to cart']/../..")
	private WebElement AddtocartButton;
	@FindBy(xpath = "//span[text()='Compare now']")
	private WebElement ComapreNowPopUpButton;
	@FindBy(xpath = "//h1[@class='heading-title fs-h1']")
	private WebElement CompareProductTextVerify;
	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement ShoppingCartPopUp;
	@FindBy(xpath = "//a[@title='Add to cart']")
	private WebElement AddButton;
	@FindBy(xpath = "//span[text()='Email a friend']")
	private WebElement EmailToFriend;
	@FindBy(id = "FriendEmail")
	private WebElement EmailNameBox;
	@FindBy(id = "YourEmailAddress")
	private WebElement EmailTextBox;
	@FindBy(xpath = "//button[text()='Send email']")
	private WebElement SendMailButton;
	@FindBy(id = "FriendEmail-error")
	private WebElement ErrortextOfMailBox;
	@FindBy(xpath = "//div[@class='result']")
	private WebElement ResultMessage;
	@FindBy(xpath = "//a[@class='share-link']")
	private WebElement EmailLink;
	@FindBy(xpath = "//a[@title='Remove']")
	private WebElement RemoveButton;

	public WebElement getRemoveButton() {
		return RemoveButton;
	}

	public WebElement getEmailLink() {
		return EmailLink;
	}

	public WebElement getEmailToFriend() {
		return EmailToFriend;
	}

	public WebElement getEmailNameBox() {
		return EmailNameBox;
	}

	public WebElement getEmailTextBox() {
		return EmailTextBox;
	}

	public WebElement getSendMailButton() {
		return SendMailButton;
	}

	public WebElement getErrortextOfMailBox() {
		return ErrortextOfMailBox;
	}

	public WebElement getResultMessage() {
		return ResultMessage;
	}

	public WebElement getAddButton() {
		return AddButton;
	}

	public WebElement getShoppingCartPopUp() {
		return ShoppingCartPopUp;
	}

	public WebElement getViewWishListPageButton() {
		return ViewWishListPageButton;
	}

	public WebElement getCartNavBarButton() {
		return CartNavBarButton;
	}

	public WebElement getBookNavBarButton() {
		return BookNavBarButton;
	}

	public WebElement getFurnitureButton() {
		return FurnitureButton;
	}

	public WebElement getSportsButton() {
		return SportsButton;
	}

	public WebElement getFashionButton() {
		return FashionButton;
	}

	public WebElement getGamingButton() {
		return GamingButton;
	}

	public WebElement getWathesButton() {
		return WathesButton;
	}

	public WebElement getGiftCardButton() {
		return GiftCardButton;
	}

	public WebElement getBestSellerButton() {
		return BestSellerButton;
	}

	public WebElement getCookEnjoyButton() {
		return CookEnjoyButton;
	}

	public WebElement getBasketBallButon() {
		return BasketBallButon;
	}

	public WebElement getSoccerButton() {
		return SoccerButton;
	}

	public WebElement getGolfButton() {
		return GolfButton;
	}

	public WebElement getSunglassButton() {
		return SunglassButton;
	}

	public WebElement getCompareNavBar() {
		return CompareNavBar;
	}

	public WebElement getWishlistNavBar() {
		return WishlistNavBar;
	}

	public WebElement getSearchBar() {
		return SearchBar;
	}

	public WebElement getAddtocartButton() {
		return AddtocartButton;
	}

	public WebElement getComapreNowPopUpButton() {
		return ComapreNowPopUpButton;
	}

	public WebElement getCompareProductTextVerify() {
		return CompareProductTextVerify;
	}

	public WebElement getMobilePhoneNavBar() {
		return MobilePhoneNavBar;
	}

	public WebElement getPriceDropDown() {
		return PriceDropDown;
	}

	public WebElement getPriceRadioButton1() {
		return PriceRadioButton1;
	}

	public WebElement getPriceRadioButton2() {
		return PriceRadioButton2;
	}

	public WebElement getPriceRadioButton3() {
		return PriceRadioButton3;
	}

	public WebElement getPriceRadioButton4() {
		return PriceRadioButton4;
	}

	public WebElement getPriceRadioButton6() {
		return PriceRadioButton6;
	}

	public WebElement getPriceRadioButton5() {
		return PriceRadioButton5;
	}

	public WebElement getRelevencedropDown() {
		return RelevencedropDown;
	}

	public WebElement getOptionDrop1() {
		return OptionDrop1;
	}

	public WebElement getOptionDrop2() {
		return OptionDrop2;
	}

	public WebElement getOptionDrop3() {
		return OptionDrop3;
	}

	public WebElement getOptionDrop4() {
		return OptionDrop4;
	}

	public WebElement getPageSizeDropdown() {
		return PageSizeDropdown;
	}

	public WebElement getIconPerPage() {
		return IconPerPage;
	}

	public WebElement getPhoneIcon() {
		return PhoneIcon;
	}

	public WebElement getAddtoWishListButton() {
		return AddtoWishListButton;
	}

	public WebElement getViewWishListButton() {
		return ViewWishListPageButton;
	}

	public WebElement getWarningText() {
		return WarningText;
	}

	public WebElement getCartPageButton() {
		return CartNavBarButton;
	}

	public WebElement getEmptyPageVerfication() {
		return EmptyPageVerfication;
	}

}
