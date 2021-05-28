package ru.stqa.pft.sandbox.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthorizationHelper {
    protected WebDriver driver;

    public void setPassword(String password) {
        driver.findElement(By.xpath("//input[@class='password__field password__field_mode_password']")).sendKeys("password");
    }

    public void setLogin(String login) {
        driver.findElement(By.xpath("//input[@class='input__field input__field_mode_email']")).sendKeys(login);
    }

    public void loginButtonClick() {
        driver.findElement(By.xpath("//div[@class='button button_type_brand']")).click();
    }
}
