package Utilities;

import com.relevantcodes.extentreports.ExtentReports;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;




public class ExtentManager
{
    private static ExtentReports extent;

    public synchronized static ExtentReports getReporter() {
        if (extent == null) {
            //Set HTML reporting file location
            //String workingDir = System.getProperty("user.dir");
            extent = new ExtentReports("./reports/Itonics_TestReport_" + timeStamp() + ".html", true);
        }
        return extent;
    }

    public static String timeStamp() {
        DateFormat timeFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date date = new Date();
        String timeStamp = timeFormat.format(date);
        return timeStamp;
    }
}
