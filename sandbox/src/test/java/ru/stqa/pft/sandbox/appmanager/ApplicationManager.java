package ru.stqa.pft.sandbox.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {


    private final AuthorizationHelper authorizationHelper = new AuthorizationHelper();

    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
        authorizationHelper.driver = new ChromeDriver();
        openPage();
    }

    private void openPage() {
        authorizationHelper.driver.get("https://webtrader.roboforex.com/");
    }

    public void stop() {
        authorizationHelper.driver.quit();
    }

    public AuthorizationHelper getAuthorizationHelper() {
        return authorizationHelper;
    }
}
