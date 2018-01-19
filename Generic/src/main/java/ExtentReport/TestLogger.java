package ExtentReport;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.Reporter;

import java.io.File;

public class TestLogger {
    public static void log(final String message) {
        Reporter.log(message, true);
        ExtentReport.ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
    }

    public static void log(final StringUtils message) {
        Reporter.log(message + "<br>", true);
        ExtentReport.ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
    }

    public static void log(final String message, WebDriver driver) {
        Reporter.log(message + "<br>", true);
        ExtentReport.ExtentTestManager.getTest().log(LogStatus.INFO, message + "<br>");
    }
}
