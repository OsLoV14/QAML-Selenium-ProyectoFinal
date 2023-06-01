package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class DriverSetup {

    private WebDriver driver;

    public DriverSetup() {
        File chromeDriver = new File("C:\\Users\\OsLoV\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeDriver.getPath());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--disable-notifications");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public WebDriver getWebDriver() {
        return this.driver;
    }
}
