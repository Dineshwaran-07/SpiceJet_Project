package testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;
import pages.LoginPage;

public class LoginTest extends BaseClass {

	@Test(priority = 1)
	public void LoginwithValidCredentails() throws Exception {

		try {

			test = extent.startTest("ValidCredentials", "ValidCredentials Testcase run");

			LoginPage lpg = new LoginPage();
			Thread.sleep(3000);
			lpg.clickLogin();
			Thread.sleep(3000);
			lpg.clickEmailbutton();
			Thread.sleep(3000);
			lpg.enterEmail("dineshelan77@gmail.com");
			Thread.sleep(3000);
			lpg.enterPassword("DineshElan$0706");
			Thread.sleep(3000);
			lpg.clickonLoginButton();

			test.log(LogStatus.PASS, "ValidCredentials is Passed");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "ValidCredentials is Failed");
			 String screenShotPath =capture(driver, "screenShotName");
				test.addScreenCapture(screenShot(driver,screenShotPath));
		}

	}

	@Test(priority = 2)
	public void LoginwithInvalidCredentials() throws Exception {

		try {

			test = extent.startTest("InValidCredentials", "InValidCredentials Testcase run");

			LoginPage lpg = new LoginPage();
			Thread.sleep(3000);
			lpg.clickLogin();
			Thread.sleep(3000);
			lpg.clickEmailbutton();
			Thread.sleep(3000);
			lpg.enterEmail("dinuelan77@gmail.com");
			Thread.sleep(3000);
			lpg.enterPassword("DinuElan$$0706");
			Thread.sleep(3000);
			lpg.clickonLoginButton();
			Thread.sleep(3000);
			lpg.Accountname();

			test.log(LogStatus.PASS, "InValidCredentials is Passed");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "InValidCredentials is Failed");
			 String screenShotPath =capture(driver, "screenShotName");
				test.addScreenCapture(screenShot(driver,screenShotPath));
		}

	}
}