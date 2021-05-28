package ru.stqa.pft.sandbox.appmanager;

import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    private WebDriver driver;

    public NavigationHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("https://webtrader.roboforex.com/");
    }

}
