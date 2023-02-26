package testcases;



import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basedriver.BaseClass;
import pages.SearchOneWayPage;

public class SearchOneWayTest extends BaseClass {

	@Test
	public void FlightSearch() throws InterruptedException, Exception {

		try {

			test = extent.startTest("Searching OneWay", "Searching OneWay Testcase run");

			SearchOneWayPage op = new SearchOneWayPage();
			op.Origin("Hy");
			op.Destination("Pune");
			Thread.sleep(3000);
			op.DateofJourney();
			Thread.sleep(3000);
			op.Searchflight();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "Searching OneWay is Passed");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Searching OneWay is Failed");
			 String screenShotPath =capture(driver, "screenShotName");
				test.addScreenCapture(screenShot(driver,screenShotPath));
		}
	}
}