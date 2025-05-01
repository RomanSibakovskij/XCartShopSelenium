package com.xcart.demo;

import com.xcart.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class RegisterPageTest extends TestMethods{

    //valid user account creation test

    //Test 002 -> valid user account creation test
    @Test
    @DisplayName("Valid User Account Creation Test")
    @Tag("Valid_User_Account_Creation")
    void validAccountCreationTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
    }


}
