package testcases;



import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;
import pages.Signuppage;

public class SignupTest extends BaseClass {

	@Test
	public void Signup() throws Exception {

		try {
			test = extent.startTest("SignUp Check", "SignUp Testcase run");
			Signuppage signup = new Signuppage();
			signup.Signup();
			SwitchWindow();
			signup.SelectTitle();
			signup.EnterFirstName("Dineshwaran");
			signup.EnterLastName("Elanchaliyan");
			signup.EnterCountry("India");
			signup.EnterDateob("07/06/1998");
			signup.EnterMobile("6380058761");
			signup.EnterEmaiId("dineshelan77@gmail.com");
			signup.EnterPassword("Ballz$0706");
			signup.EnterConpassword("Ballz$0706");
			test.log(LogStatus.PASS, "Signup is Passed");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Signup is Failed");
			 String screenShotPath =capture(driver, "screenShotName");
				test.addScreenCapture(screenShot(driver,screenShotPath));
		}

	}

}