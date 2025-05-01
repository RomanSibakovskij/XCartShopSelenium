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

}
