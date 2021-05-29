package ru.stqa.pft.sandbox.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
    WebDriver driver;

    private RegistrationHelper registrationHelper;
    private AuthorizationHelper authorizationHelper;
    private NavigationHelper navigationHelper;
    private WebDriverHelper webDriverHelper;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        authorizationHelper = new AuthorizationHelper(driver);
        registrationHelper = new RegistrationHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        webDriverHelper = new WebDriverHelper(driver);
//        private WebDriverHelper webDriverHelper;
        navigationHelper.openPage();
        navigationHelper.allowCookiesButtonClick();

    }

    public void stop() {
        driver.quit();
    }

    public AuthorizationHelper getAuthorizationHelper() {
        return authorizationHelper;
    }

    public RegistrationHelper getRegistrationHelper() {
        return registrationHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public WebDriverHelper getWebDriverHelper() {return webDriverHelper;}
}
