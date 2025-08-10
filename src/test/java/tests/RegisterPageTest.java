package tests;

import helper.RegisterPageBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pom_ui.LoginPage;
import pom_ui.RegisterPage;
import utils.*;

public class RegisterPageTest extends BaseTestClass {

    RegisterPage registerPage;

    @BeforeEach
    public void clickRegisterButton() {
        driver.get(UrlResources.LOGIN_PAGE.getUrl());
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnRegisterLink();
    }

    @Test
    @DisplayName("Registration positive test")
    public void registerUsername() {
        registerPage = new RegisterPage(driver);
        RegisterPageBuilder registerPageBuilder = new RegisterPageBuilder.Builder()
                .setFirstName("Stefan")
                .setLastName("Automation")
                .setAddress("121 Street")
                .setCity("New York")
                .setState("New York")
                .setZipCode("121211")
                .setPhoneNumber("+40712121567")
                .setSocialSecurityNumber("1314567")
                .setUsername(DataGeneration.userName())
                .setPassword("user4")
                .setRepeatedPassword("user4")
                .build();
        registerPage.register(registerPageBuilder);
        Assertions.assertEquals("Welcome " + registerPageBuilder.getUsername(), registerPage.getTitle());
        Assertions.assertTrue(registerPage.getTitle().contains(registerPageBuilder.getUsername()),
                "Welcome message missing username");

    }
    @Test
    @DisplayName("Registration negative test")
    public void registerUsernameAlreadyExists() {
        registerPage = new RegisterPage(driver);
        RegisterPageBuilder registerPageBuilder = new RegisterPageBuilder.Builder()
                .setFirstName("Stefan")
                .setLastName("Automation")
                .setAddress("121 Street")
                .setCity("New York")
                .setState("New York")
                .setZipCode("121211")
                .setPhoneNumber("+40712121567")
                .setSocialSecurityNumber("1314567")
                .setUsername(Constants.USERNAME)
                .setPassword("user4")
                .setRepeatedPassword("user4")
                .build();
        registerPage.register(registerPageBuilder);
        Assertions.assertEquals("This username already exists.", registerPage.getUsernameError());
    }
}
