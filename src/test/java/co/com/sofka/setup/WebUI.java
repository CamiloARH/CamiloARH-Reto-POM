package co.com.sofka.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebUI {
    private static final String WEB_DRIVER_EDGE_DRIVER = "webdriver.chrome.driver";
    private static final String WEB_DRIVER_EDGE_DRIVER_PATH = "src/test/resources/driver/windows/chrome/chromedriver.exe";

    private static final String DEMO_QA_URL = "https://www.despegar.com.co/";

    protected WebDriver driver;

    private void setupWebDriver() {
        System.setProperty(WEB_DRIVER_EDGE_DRIVER, WEB_DRIVER_EDGE_DRIVER_PATH);
    }

    private void setupWebDriverChromeDriverUrl() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(DEMO_QA_URL);
    }

    protected void generalSetup() {
//        setUplog4();
        setupWebDriver();
        setupWebDriverChromeDriverUrl();
    }

    protected void quitDrive() {
        driver.quit();
    }

//    protected void setUplog4() {
//        PropertyConfigurator.configure(USER_DIR.value() + LOG4J_PROPERTIES_FILE_PATH.getValue());
//    }
}
