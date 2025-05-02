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

    //valid user login tests

    //Test 006 -> valid user login test
    @Test
    @DisplayName("Valid User Login Test")
    @Tag("Valid_User_Login")
    void validAccountLoginTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //valid user logout test
        userLogoutTest();
        //valid user login test
        validUserLoginTest(registerPage);
    }

    //Test 006a -> valid user login with edited email test
    @Test
    @DisplayName("Valid User Login With Edited Email Test")
    @Tag("Valid_User_Login")
    @Tag("Valid_Edited_Email_Login")
    void validAccountLoginWithEditedEmailTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid edit user account data test
        validEditUserAccountTest();
        //valid user logout test
        userLogoutTest();
        //valid user login test (with edited email)
        validUserEditedEmailLoginTest(registerPage);
    }

    //invalid login tests

    //no singular input

    //Test 006b -> invalid user login test - no login email
    @Test
    @DisplayName("Invalid User Login Test - No Login Email")
    @Tag("Invalid_User_Login")
    @Tag("No_Singular_Input")
    void invalidAccountLoginNoEmailTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //valid user logout test
        userLogoutTest();
        //invalid user login test - no login email
        invalidUserLoginNoLoginEmailTest(registerPage);
    }

    //Test 006c -> invalid user login test - no login password
    @Test
    @DisplayName("Invalid User Login Test - No Login Password")
    @Tag("Invalid_User_Login")
    @Tag("No_Singular_Input")
    void invalidAccountLoginNoPasswordTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //valid user logout test
        userLogoutTest();
        //invalid user login test - no login password
        invalidUserLoginNoLoginPasswordTest(registerPage);
    }

    //invalid singular input

    //Test 006d -> invalid user login test - invalid login email
    @Test
    @DisplayName("Invalid User Login Test - Invalid Login Email")
    @Tag("Invalid_User_Login")
    @Tag("Invalid_Singular_Input")
    void invalidAccountLoginInvalidEmailTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //valid user logout test
        userLogoutTest();
        //invalid user login test - invalid login email
        invalidUserLoginInvalidLoginEmailTest(registerPage);
    }

}
