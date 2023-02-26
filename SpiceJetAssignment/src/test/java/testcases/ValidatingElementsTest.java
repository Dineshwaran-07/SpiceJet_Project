package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;
import pages.ValidatingElementPage;

public class ValidatingElementsTest extends BaseClass {

	@Test(priority = 1)
	public void ValidationOnCheckin() throws Exception {

		try {

			test = extent.startTest("Validating First Element", "1st Element Testcase run");

			ValidatingElementPage vp = new ValidatingElementPage();
			Assert.assertTrue(vp.CheckIn());
			test.log(LogStatus.PASS, "Validating First Element is Successful");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Validating First Element is Failed");
			 String screenShotPath =capture(driver, "screenShotName");
				test.addScreenCapture(screenShot(driver,screenShotPath));
		}
	}

	@Test(priority = 2)
	public void ValidationOnFlightStatus() throws Exception {

		try {

			test = extent.startTest("Validating Second Element", "2nd Element Testcase run");

			ValidatingElementPage vp = new ValidatingElementPage();
			Assert.assertTrue(vp.FlightStatus());

			test.log(LogStatus.PASS, "Validating Second Element is Successful");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Validating Second Element is Failed");
			 String screenShotPath =capture(driver, "screenShotName");
				test.addScreenCapture(screenShot(driver,screenShotPath));
		}
	}

	@Test(priority = 3)
	public void ValidationOnManageBooking() throws Exception {

		try {

			test = extent.startTest("Validating Third Element", "3rd Element Testcase run");

			ValidatingElementPage vp = new ValidatingElementPage();
			Assert.assertTrue(vp.ManageBooking());

			test.log(LogStatus.PASS, "Validating Third Element is Successful");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Validating Third Element is Failed");
			 String screenShotPath =capture(driver, "screenShotName");
				test.addScreenCapture(screenShot(driver,screenShotPath));
		}
	}
}