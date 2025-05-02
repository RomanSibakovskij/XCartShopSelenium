package com.xcart.demo;

import com.xcart.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class SignInFormPageTest extends TestMethods{

    //valid user logout test

    //Test 005 -> valid user logout test
    @Test
    @DisplayName("Valid User Logout Test")
    @Tag("Valid_User_Logout")
    public void validAccountLogoutTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //valid user logout test
        userLogoutTest();
    }

    
}
