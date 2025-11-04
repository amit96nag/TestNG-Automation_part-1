package Config;

import Page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Setup {
    public WebDriver driver; // age setup dilam driver kore nilam declar
    @BeforeTest
    public void setup(){ // setup a ja lage korlam
       driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://dailyfinance.roadtocareer.net/");
    }
    //@AfterTest
    public void tearDown()
    {driver.quit();
    }
}
