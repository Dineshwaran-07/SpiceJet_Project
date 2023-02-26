package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.selenium.Utils;

public class LoginPage extends Utils {

	@FindBy(xpath = "//div[contains(text(),'Login')]")
	WebElement loginbtn;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[4]")
	WebElement emailbtn;

	@FindBy(xpath = "(//input[@autocapitalize='sentences'])[3]")
	WebElement enterEmaid;

	@FindBy(xpath = "(//input[@autocapitalize='sentences'])[4]")
	WebElement pass;

	@FindBy(xpath = "(//input[@autocapitalize='sentences'])[4]")
	WebElement invPass;

	@FindBy(xpath = "//div[@data-testid='login-cta']")
	WebElement loginclikbtn;

	@FindBy(xpath = "(//div[@class='css-76zvg2 r-jwli3a r-ubezar r-1ozqkpa'])[1]")
	WebElement account;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public void clickLogin() {
		loginbtn.click();
	}

	public void clickEmailbutton() {
		emailbtn.click();
	}

	public void enterEmail(String Emailtype) {
		enterEmaid.sendKeys(Emailtype);
	}

	public void enterPassword(String PasswordType) {
		pass.sendKeys(PasswordType);
	}

	public void enterInvalidPassword(String PasswordType) {
		invPass.sendKeys(PasswordType);
	}

	public void clickonLoginButton() {
		loginclikbtn.click();
	}

	public void Accountname() {
		account.click();
	}
}