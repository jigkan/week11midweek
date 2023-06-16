package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Base {

        public static WebDriver driver;

        public void openBrowser(String url){
            ChromeOptions options=new ChromeOptions();
            driver=new ChromeDriver(options);
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        }
        public void closeBrowser()
        {driver.close();}


    }
