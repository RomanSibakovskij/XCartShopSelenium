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

    //Test 003c -> invalid edit user account data test - no user last name
    @Test
    @DisplayName("Invalid Edit User Account Data Test - No Last Name")
    @Tag("Invalid_Edit_User_Account")
    @Tag("No_Singular_Input")
    void invalidEditAccountNoLastNameTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid edit user account data test - no user last name
        invalidEditUserAccountNoLastNameTest();
    }

    //Test 003d -> invalid edit user account data test - no user email
    @Test
    @DisplayName("Invalid Edit User Account Data Test - No Email")
    @Tag("Invalid_Edit_User_Account")
    @Tag("No_Singular_Input")
    void invalidEditAccountNoEmailTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid edit user account data test - no user email
        invalidEditUserAccountNoEmailTest();
    }

    //too short singular input

    //Test 003e -> invalid edit user account data test - too short user first name (1 char) (the user account data got edited, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Too Short First Name")
    @Tag("Invalid_Edit_User_Account")
    @Tag("Too_Short_Singular_Input")
    void invalidEditAccountTooShortFirstNameTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid edit user account data test - too short user first name (1 char)
        invalidEditUserAccountTooShortFirstNameTest();
    }

    //Test 003f -> invalid edit user account data test - too short user last name (1 char) (the user account data got edited, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Too Short Last Name")
    @Tag("Invalid_Edit_User_Account")
    @Tag("Too_Short_Singular_Input")
    void invalidEditAccountTooShortLastNameTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid edit user account data test - too short user last name (1 char)
        invalidEditUserAccountTooShortLastNameTest();
    }

    //Test 003g -> invalid edit user account data test - too short user email (1 char -> name, domain) (the user account data got edited, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Too Short Email")
    @Tag("Invalid_Edit_User_Account")
    @Tag("Too_Short_Singular_Input")
    void invalidEditAccountTooShortEmailTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid edit user account data test - too short user email (1 char -> name, domain)
        invalidEditUserAccountTooShortEmailTest();
    }

    //too long singular input

    //Test 003h -> invalid edit user account data test - too long user first name (100 chars) (the user account data got edited, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Too Long First Name")
    @Tag("Invalid_Edit_User_Account")
    @Tag("Too_Long_Singular_Input")
    void invalidEditAccountTooLongFirstNameTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid edit user account data test - too long user first name (100 chars)
        invalidEditUserAccountTooLongFirstNameTest();
    }

    //Test 003i -> invalid edit user account data test - too long user last name (100 chars) (the user account data got edited, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Too Long Last Name")
    @Tag("Invalid_Edit_User_Account")
    @Tag("Too_Long_Singular_Input")
    void invalidEditAccountTooLongLastNameTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid edit user account data test - too long user last name (100 chars)
        invalidEditUserAccountTooLongLastNameTest();
    }

    //Test 003j -> invalid edit user account data test - too long user email (100 chars -> name, domain)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Too Long Email")
    @Tag("Invalid_Edit_User_Account")
    @Tag("Too_Long_Singular_Input")
    void invalidEditAccountTooLongEmailTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid edit user account data test - too long user email (100 chars -> name, domain)
        invalidEditUserAccountTooLongEmailTest();
    }

    //invalid singular input format

    //Test 003k -> invalid edit user account data test - invalid user first name format (special symbols only) (the user account data got edited, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Invalid First Name Format")
    @Tag("Invalid_Edit_User_Account")
    @Tag("Invalid_Singular_Input")
    void invalidEditAccountInvalidFirstNameFormatTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid edit user account data test - invalid user first name format (special symbols only)
        invalidEditUserAccountInvalidFirstNameFormatTest();
    }

    //Test 003l -> invalid edit user account data test - invalid user last name format (special symbols only) (the user account data got edited, test has failed)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Invalid Last Name Format")
    @Tag("Invalid_Edit_User_Account")
    @Tag("Invalid_Singular_Input")
    void invalidEditAccountInvalidLastNameFormatTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid edit user account data test - invalid user last name format (special symbols only)
        invalidEditUserAccountInvalidLastNameFormatTest();
    }

    //Test 003m -> invalid edit user account data test - invalid user email format (missing '@')
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Invalid Email Format")
    @Tag("Invalid_Edit_User_Account")
    @Tag("Invalid_Singular_Input")
    void invalidEditAccountInvalidEmailFormatTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid edit user account data test - invalid user email format (missing '@')
        invalidEditUserAccountInvalidEmailFormatTest();
    }

    //Test 003n -> invalid edit user account data test - existing test email (the test throws 403, so, technically, this test can be considered as passed)
    @Test
    @DisplayName("Invalid Edit User Account Data Test - Existing Test Email")
    @Tag("Invalid_Edit_User_Account")
    @Tag("Invalid_Singular_Input")
    void invalidEditAccountExistingTestEmailTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid edit user account data test - existing test email
        invalidEditUserAccountExistingTestEmailTest();
    }

    //user account removal test

    //Test 003o -> user account removal test (Selenium sometimes clicks on the wrong element with VALID selector provided during automation run)
    @Test
    @DisplayName("User Account Removal Test")
    @Tag("Valid_Edit_User_Account")
    @Tag("Account_Removal")
    void removeUserAccountTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user account removal test
        userAccountRemovalTest();
    }

}
