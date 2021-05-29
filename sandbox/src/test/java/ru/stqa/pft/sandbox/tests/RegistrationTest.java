package ru.stqa.pft.sandbox.tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class RegistrationTest extends TestBase{

    @Test
    public void testRegistration(){
        app.getRegistrationHelper().registrationButtonClick();
        app.getRegistrationHelper().setEmail();
        app.getRegistrationHelper().setName();
        app.getRegistrationHelper().setPhone();
        app.getRegistrationHelper().setSurname();
        app.getRegistrationHelper().openAccountButtonClick();
        app.getNavigationHelper().sleep(3000);
        Assert.assertTrue(app.getRegistrationHelper().isDemoAccountDetailsModalWindowDisplayed());
    }





}
