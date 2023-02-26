package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.selenium.Utils;

public class SearchOneWayPage extends Utils {

	@FindBy(xpath = "(//input[@autocapitalize='sentences'])[1]")
	WebElement originplace;

	@FindBy(xpath = "(//input[@autocapitalize='sentences'])[2]")
	WebElement destinationplace;

	@FindBy(xpath = "//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'][1]")
	WebElement departuredate;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu'])[70]")
	WebElement validate;

	@FindBy(xpath = "//div[@data-testid='home-page-flight-cta']")
	WebElement searchflight;

	public SearchOneWayPage() {

		PageFactory.initElements(driver, this);
	}

	public void Origin(String town) {
		originplace.sendKeys(town);
	}

	public void Destination(String city) {
		destinationplace.sendKeys(city);

	}

	public void DateofJourney() {
		departuredate.click();
		validate.click();

	}

	public void Searchflight() {
		searchflight.click();
	}
}