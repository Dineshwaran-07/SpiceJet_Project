package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.selenium.Utils;



public class FlightBookingPage extends Utils {

	@FindBy(xpath = "//div[@data-testid='continue-search-page-cta']")
	WebElement continuebn;

	@FindBy(xpath = "//input[@data-testid='first-inputbox-contact-details']")
	WebElement fname;

	@FindBy(xpath = "//input[@data-testid='last-inputbox-contact-details']")
	WebElement lName;

	@FindBy(xpath = "//input[@data-testid='contact-number-input-box']")
	WebElement mbl;

	@FindBy(xpath = "//input[@data-testid='emailAddress-inputbox-contact-details']")
	WebElement mail;

	@FindBy(xpath = "//input[@data-testid='city-inputbox-contact-details']")
	WebElement city;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[5]")
	WebElement firstpassenger;

	@FindBy(xpath = "//div[@data-testid='traveller-info-continue-cta']")
	WebElement cntnbtn;

	@FindBy(xpath = "(//div[@data-testid='add-ons-continue-footer-button'])[3]")
	WebElement cntnbtn2;

	public FlightBookingPage() {

		PageFactory.initElements(driver, this);
	}

	public void clickContinue() {
		continuebn.click();
	}

	public void Entername(String FandMText) {
		fname.sendKeys(FandMText);
	}

	public void EnterLastname(String LnameText) {
		lName.sendKeys(LnameText);
	}

	public void EnterContactnumber(String CnumberText) {
		mbl.sendKeys(CnumberText);
	}

	public void EnterEmaiId(String EmailText) {
		mail.sendKeys(EmailText);
	}

	public void Entercityfield(String cityText) {
		city.sendKeys(cityText);
	}

	public void EnterCheckMark() {
		firstpassenger.click();
	}

	public void ClickOnContinueButton() {
		cntnbtn.click();
	}

	public void ClickOnContinueButton2() {
		cntnbtn2.click();
	}

}