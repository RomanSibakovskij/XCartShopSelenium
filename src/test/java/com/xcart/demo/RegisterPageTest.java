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

    //invalid user account creation tests

    //no singular input

    //Test 002a -> invalid user account creation test - no user first name
    @Test
    @DisplayName("Invalid User Account Creation Test - No First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoFirstNameTest() {
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //invalid user account creation test - no user first name
        invalidUserAccountCreationNoFirstNameTest();
    }

    //Test 002b -> invalid user account creation test - no user last name
    @Test
    @DisplayName("Invalid User Account Creation Test - No Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoLastNameTest() {
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //invalid user account creation test - no user last name
        invalidUserAccountCreationNoLastNameTest();
    }

    //Test 002c -> invalid user account creation test - no user email
    @Test
    @DisplayName("Invalid User Account Creation Test - No Email")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoEmailTest() {
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //invalid user account creation test - no user email
        invalidUserAccountCreationNoEmailTest();
    }

    //Test 002d -> invalid user account creation test - no user password and confirm password
    @Test
    @DisplayName("Invalid User Account Creation Test - No Password And Confirm Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidAccountCreationNoPasswordConfirmTest() {
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //invalid user account creation test - no user password / confirm password
        invalidUserAccountCreationNoPasswordConfirmTest();
    }

    //too short singular input

    //Test 002e -> invalid user account creation test - too short user first name (1 char) (the user account got created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountCreationTooShortFirstNameTest() {
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too short user first name (1 char)
        invalidUserAccountCreationTooShortFirstNameTest();
    }

    //Test 002f -> invalid user account creation test - too short user last name (1 char) (the user account got created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountCreationTooShortLastNameTest() {
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too short user last name (1 char)
        invalidUserAccountCreationTooShortLastNameTest();
    }

    //Test 002g -> invalid user account creation test - too short user email (1 char -> name, domain) (the user account got created, test has failed)
    @Test
    @DisplayName("Invalid User Account Creation Test - Too Short Email")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidAccountCreationTooShortEmailTest() {
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //invalid user account creation test - too short user email (1 char -> name, domain)
        invalidUserAccountCreationTooShortEmailTest();
    }

}
