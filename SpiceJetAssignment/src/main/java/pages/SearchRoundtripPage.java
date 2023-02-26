package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.selenium.Utils;



public class SearchRoundtripPage extends Utils {

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[2]")
	WebElement roundway;

	@FindBy(xpath = "(//input[@autocapitalize='sentences'])[1]")
	WebElement fromplace;

	@FindBy(xpath = "(//input[@autocapitalize='sentences'])[2]")
	WebElement toplace;

	@FindBy(xpath = "(//div[@style='font-family: inherit;'])[121]")
	WebElement departuredate;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[4]")
	WebElement dateselection;

	@FindBy(xpath = "(//div[@style='font-family: inherit;'])[152]")
	WebElement returndate;

	@FindBy(xpath = "//div[@data-testid='home-page-flight-cta']")
	WebElement searchflight;

	public SearchRoundtripPage() {

		PageFactory.initElements(driver, this);
	}

	public void ClickonRoundTrip() {
		roundway.click();
	}

	public void EnterFromOrigin(String Text) {
		fromplace.sendKeys(Text);
	}

	public void EnterToDestination(String Text) {
		toplace.sendKeys(Text);
	}

	public void DepartureDate() {

		Actions act = new Actions(driver);
		act.doubleClick(departuredate).perform();

	}

	public void ClickonDate() {
		dateselection.click();
	}

	public void ReturnDate() {
		returndate.click();
	}

	public void Searchflight() {
		searchflight.click();
	}
}