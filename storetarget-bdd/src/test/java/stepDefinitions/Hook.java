package stepDefinitions;

import base.ApplicationPageBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Hook extends ApplicationPageBase {

    @Before
    public  void initializeTest() {
        String getOsNameFromSystem = System.getProperty("os.name");
        String browserName = System.getProperty("browser", "chrome");
        System.out.println("**************"+browserName);
        System.out.println("**************"+getOsNameFromSystem);
        if(browserName.equalsIgnoreCase("chrome")){

            ChromeOptions options =new ChromeOptions();
            options.addArguments("--ignore-certificate-errors");
            //options.addArguments("--start-minimized"); // open Browser in maximized mode
            options.addArguments("--disable-infobars"); // disabling infobars
            options.addArguments("--disable-extensions"); // disabling extensions
            options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
            options.addArguments("--no-sandbox"); // Bypass OS security model
           // options.addArguments("--remote-debugging-port=8080");
            options.addArguments("--disable-setuid-sandbox");
            options.addArguments("--headless");

            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            System.out.println("Opening the browser : Chrome");
            if (getOsNameFromSystem.contains("Mac")) {
                System.setProperty("webdriver.chrome.driver", "driver/Mac/chromedriver");
            } else if (getOsNameFromSystem.contains("Windows")) {
                System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            } else if (getOsNameFromSystem.contains("Linux")) {
                System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
			}
            driver = new ChromeDriver(options);
        }
        else if (browserName.equalsIgnoreCase("firefox")){
            /*
             * https://chercher.tech/java/chrome-firefox-options-selenium-webdriver
             *
             * */
            FirefoxOptions options = new FirefoxOptions();
            //options.setHeadless(true);
            options.addArguments("--start-maximized");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--private");
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);


            if (getOsNameFromSystem.contains("Windows")) {
                System.setProperty("webdriver.gecko.driver", "../driver/geckodriver.exe");
               // driver = new FirefoxDriver(options);
            } else if (getOsNameFromSystem.contains("Mac")) {
                System.setProperty("webdriver.gecko.driver", "../driver/geckodriver");
              //  driver = new FirefoxDriver(options);
            }
            driver = new FirefoxDriver(capabilities);
        }

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // 20
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS); //35
        driver.get("https://www.target.com/");
       // driver.manage().window().maximize();
    }
    @After
    public void tearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : Chrome");
        driver.quit();
    }

}
