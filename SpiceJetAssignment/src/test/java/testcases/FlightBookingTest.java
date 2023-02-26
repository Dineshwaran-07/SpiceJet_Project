package testcases;



import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;
import pages.FlightBookingPage;
import pages.SearchOneWayPage;

public class FlightBookingTest extends BaseClass {

	@Test
	public void BookFlight() throws Exception {

		try {

			test = extent.startTest("BookingFlight", "BookingFlight Test cases");

			SearchOneWayPage sp = new SearchOneWayPage();
			sp.Origin("Hy");
			sp.Destination("Vis");
			sp.DateofJourney();
			sp.Searchflight();

			FlightBookingPage fsp = new FlightBookingPage();
			fsp.clickContinue();
			fsp.Entername("Dineshwaran");
			fsp.EnterLastname("Elanchaliyan");
			fsp.EnterContactnumber("6382030761");
			fsp.EnterEmaiId("dineshelan77@gmail.com");
			fsp.Entercityfield("India");
			fsp.EnterCheckMark();
			fsp.ClickOnContinueButton();
			fsp.ClickOnContinueButton2();

			test.log(LogStatus.PASS, "BookingFlight is Passed");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "BookingFlight is Failed");
			 String screenShotPath =capture(driver, "BookingFailedScreenshot.png");
				test.addScreenCapture(screenShot(driver,screenShotPath));
		}

	}
}