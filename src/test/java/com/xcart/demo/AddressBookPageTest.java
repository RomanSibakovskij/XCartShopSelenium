package com.xcart.demo;

import com.xcart.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class AddressBookPageTest extends TestMethods{

    //valid user address addition tests (there's no 'Remove address' button present so it's testing is aborted until it'll be present)

    //Test 004 -> valid user address addition test
    @Test
    @DisplayName("Valid User Address Addition Test")
    @Tag("Valid_User_Address_Addition")
    void validAddressAdditionTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
    }

    //Test 004a -> valid multiple user addresses addition test (second user address fails to be added, test has failed)
    @Test
    @DisplayName("Valid Multiple User Addresses Addition Test")
    @Tag("Valid_User_Address_Addition")
    @Tag("Multiple_Addresses_Addition")
    void validMultipleAddressesAdditionTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //valid second user address addition test
        validUserSecondAddressAdditionTest();
    }

    //Test 004b -> valid edit user address test (the address fails to be edited, test has failed)
    @Test
    @DisplayName("Valid Edit User Address Test")
    @Tag("Valid_Edit_User_Address")
    void validEditUserAddressTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //valid edit user address test
        validUserEditAddressTest();
    }

    //invalid user address addition tests

    //no singular input (the country by default is set to 'United States' and there are no blank options for country and state dropdown menus, therefore, their testing is canceled)

    //Test 004c -> invalid user address addition test - no user first name
    @Test
    @DisplayName("Invalid User Address Addition Test - No First Name")
    @Tag("Invalid_User_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidAddressAdditionNoFirstNameTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - no user first name
        invalidUserAddressAdditionNoFirstNameTest();
    }

    //Test 004d -> invalid user address addition test - no user last name
    @Test
    @DisplayName("Invalid User Address Addition Test - No Last Name")
    @Tag("Invalid_User_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidAddressAdditionNoLastNameTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - no user last name
        invalidUserAddressAdditionNoLastNameTest();
    }

    //Test 004e -> invalid user address addition test - no user address
    @Test
    @DisplayName("Invalid User Address Addition Test - No Address")
    @Tag("Invalid_User_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidAddressAdditionNoAddressTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - no user address
        invalidUserAddressAdditionNoAddress1Test();
    }

    //Test 004f -> invalid user address addition test - no user city
    @Test
    @DisplayName("Invalid User Address Addition Test - No City")
    @Tag("Invalid_User_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidAddressAdditionNoCityTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - no user city
        invalidUserAddressAdditionNoCityTest();
    }

    //Test 004g -> invalid user address addition test - no user post code
    @Test
    @DisplayName("Invalid User Address Addition Test - No Post Code")
    @Tag("Invalid_User_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidAddressAdditionNoPostCodeTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - no user post code
        invalidUserAddressAdditionNoPostCodeTest();
    }

    //too short singular input

    //Test 004h -> invalid user address addition test - too short user first name (1 char) (the user address gets accepted, test has failed)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Short First Name")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Short_Singular_Input")
    void invalidAddressAdditionTooShortFirstNameTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - too short user first name (1 char)
        invalidUserAddressAdditionTooShortFirstNameTest();
    }

}
