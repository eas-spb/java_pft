package ru.stqa.pft.sandbox.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    private WebDriver driver;

    public NavigationHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("https://webtrader.roboforex.com/");
    }

    public void allowCookiesButtonClick() {
        driver.findElement(By.xpath("//div[@id='AllowCookies_Allow_ViewButton']")).click();
    }

    public void tourWindowCloseButton() {
        driver.findElement(By.xpath("//span[@class='tour-window__close']")).click();
    }

    public void sleep(int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
