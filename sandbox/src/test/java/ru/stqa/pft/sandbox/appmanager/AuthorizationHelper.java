package ru.stqa.pft.sandbox.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

public class AuthorizationHelper {
    private WebDriver driver;

    public AuthorizationHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void setPassword() {
        driver.findElement(By.xpath("//input[@class='password__field password__field_mode_password']")).sendKeys("f30shOS");
    }

    public void setLogin() {
        driver.findElement(By.xpath("//input[@class='input__field input__field_mode_email']")).sendKeys("qatest3003+5@gmail.com");
    }

    public void loginButtonClick() {
        driver.findElement(By.xpath("//div[@class='button button_type_brand']")).click();
    }

    public boolean isElementTourWindowDisplayed() {
        try {
            return driver.findElement(By.xpath("//span[@class='tour-window__title'][contains(text(),'RoboForex WebTrader Overview')]")).isDisplayed();
        } catch (NoSuchElementException | TimeoutException | NullPointerException e) {
            return false;
        }
    }
}
