package com.xcart.demo;

import com.xcart.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class AccountDetailsPageTest extends TestMethods{

    //valid edit user account data tests

    //Test 003 -> valid edit user account data test
    @Test
    @DisplayName("Valid Edit User Account Test")
    @Tag("Valid_Edit_User_Account")
    @Tag("Edit_Login_Email")
    void validEditAccountEmailTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid edit user account data test
        validEditUserAccountTest();
    }

    //Test 003a -> valid edit user account (with password) test (demo version terminates with 403 error - test has failed)
    @Test
    @DisplayName("Valid Edit User Account (With Password) Test")
    @Tag("Valid_Edit_User_Account")
    @Tag("Edit_Login_Password")
    void validEditAccountPasswordTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid edit user password test
        validEditUserAccountPasswordTest();
    }

    //invalid edit user account data tests (since password section testing throws 403 error in demo, its testing is postponed)

    //no singular input

    //Test 003b -> invalid edit user account data test - no user first name
    @Test
    @DisplayName("Invalid Edit User Account Data Test - No First Name")
    @Tag("Invalid_Edit_User_Account")
    @Tag("No_Singular_Input")
    void invalidEditAccountNoFirstNameTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid edit user account data test - no user first name
        invalidEditUserAccountNoFirstNameTest();
    }

}
