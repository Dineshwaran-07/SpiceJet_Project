package testcases;



import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;
import pages.SearchRoundtripPage;

public class SearchRoundtripTest extends BaseClass {

	@Test
	public void FlightSearch() throws Exception {

		try {

			test = extent.startTest("RoundTrip", "Round Trip Testcase run");

			SearchRoundtripPage sp = new SearchRoundtripPage();
			sp.ClickonRoundTrip();
			sp.EnterFromOrigin("Che");
			sp.EnterToDestination("Mum");
			sp.DepartureDate();
			sp.ClickonDate();
			sp.ReturnDate();
			sp.Searchflight();
			test.log(LogStatus.PASS, "RoundTrip is Successful");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "RoundTrip is Failed");
			 String screenShotPath =capture(driver, "screenShotName");
				test.addScreenCapture(screenShot(driver,screenShotPath));
		}
	}
}