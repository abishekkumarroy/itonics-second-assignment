import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.LogManager;

public  class BaseTest {

    public static WebDriver createInstance() {
        WebDriver driver = null;
        WebDriverManager.chromedriver().setup();  // Added Dynamic webdriver manager
        System.setProperty("webdriver.chrome.silentOutput", "true");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE);
        LogManager.getLogManager().reset();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");

        driver = new ChromeDriver(options);


        System.out.println("Setting screen size");
        driver.manage().window().fullscreen();

        driver.manage().window().setSize(new Dimension(1920, 1080));
        Dimension size = driver.manage().window().getSize();
        System.out.println("Width is :"+size.getWidth());
        System.out.println("Height is :"+size.getHeight());

        System.out.println("Setting screen size completed");

        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

        return driver;

    }

    public static String timeStamps() {
        DateFormat timeFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date date = new Date();
        String timeStamp = timeFormat.format(date);
        return timeStamp;
    }


}
