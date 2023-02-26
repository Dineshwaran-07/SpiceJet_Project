package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.selenium.Utils;



public class ValidatingElementPage extends Utils {

	@FindBy(xpath = "(//div[contains(text(),'check-in')])[1]")
	WebElement checkinele;

	@FindBy(xpath = "//div[contains(text(),'flight status')]")
	WebElement flightStatusele;

	@FindBy(xpath = "//div[contains(text(),'manage booking')]")
	WebElement manageBookingele;

	public ValidatingElementPage() {

		PageFactory.initElements(driver, this);
	}

	public boolean CheckIn() {

		return checkinele.isDisplayed();
	}

	public boolean FlightStatus() {

		return flightStatusele.isDisplayed();
	}

	public boolean ManageBooking() {

		return manageBookingele.isDisplayed();
	}

}