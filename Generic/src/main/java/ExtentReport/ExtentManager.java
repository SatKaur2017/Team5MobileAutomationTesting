package ExtentReport;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.Reporter;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ExtentManager {

        private static ExtentReports extent;
        private static ITestContext context;

        public synchronized static ExtentReports getInstance() {
            if (extent == null) {
                File outputDirectory = new File(context.getOutputDirectory());
                File resultDirectory = new File(outputDirectory.getParentFile(), "html");
                extent = new ExtentReports(System.getProperty("user.dir") + "/Extent-Report/Extent Report.html", true);
                Reporter.log("Extent Report directory: " + resultDirectory, true);
                extent.addSystemInfo("Host Name" , "Pnt")
                        .addSystemInfo("Environment", "QA")
                        .addSystemInfo("User Name", "Matiur Rahman");
                extent.loadConfig(new File(System.getProperty("user.dir") + "/report-config.xml"));
            }

            return extent;
        }


        public static void setOutputDirectory(ITestContext context) {
            ExtentReport.ExtentManager.context = context;
        }
    }

