package ru.stqa.pft.sandbox.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

public class RegistrationHelper {
    private WebDriver driver;

    public RegistrationHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void registrationButtonClick() {
        driver.findElement(By.xpath("//div[@class='button button_type_quick-demo']")).click();
    }

    public void setEmail() {
        driver.findElement(By.xpath("//input[@class='input__field input__field_mode_email']")).sendKeys("qatest3003+6@gmail.com");
    }

    public void setName() {
        driver.findElement(By.xpath("//div[@class='quick-demo-acc-form__name']//input")).sendKeys("Ivan");
    }

    public void setPhone() {
        driver.findElement(By.xpath("//div[@class='quick-demo-acc-form__phone']//input")).sendKeys("0000000002");
    }

    public void setSurname() {
        driver.findElement(By.xpath("//div[@class='quick-demo-acc-form__surname']//input")).sendKeys("Ivanov");
    }

    public void openAccountButtonClick() {
        driver.findElement(By.xpath("//div[@class='button button_type_brand']")).click();
    }

    public boolean isDemoAccountDetailsModalWindowDisplayed() {
        try {
            return driver.findElement(By.xpath("//span[text()='Demo Account details']")).isDisplayed();
        } catch (NoSuchElementException | TimeoutException | NullPointerException e) {
            return false;
        }
    }

}
