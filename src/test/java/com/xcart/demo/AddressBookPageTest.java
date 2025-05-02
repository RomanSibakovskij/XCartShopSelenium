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

    //Test 004i -> invalid user address addition test - too short user last name (1 char) (the user address gets accepted, test has failed)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Short Last Name")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Short_Singular_Input")
    void invalidAddressAdditionTooShortLastNameTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - too short user last name (1 char)
        invalidUserAddressAdditionTooShortLastNameTest();
    }

    //Test 004j -> invalid user address addition test - too short user address (4 chars) (the user address gets accepted, test has failed)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Short Address")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Short_Singular_Input")
    void invalidAddressAdditionTooShortAddressTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - too short user address (4 chars)
        invalidUserAddressAdditionTooShortAddressTest();
    }

    //Test 004k -> invalid user address addition test - too short user city (2 chars) (the user address gets accepted, test has failed)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Short City")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Short_Singular_Input")
    void invalidAddressAdditionTooShortCityTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - too short user city (2 chars)
        invalidUserAddressAdditionTooShortCityTest();
    }

    //Test 004l -> invalid user address addition test - too short user post code (4 digits)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Short Post Code")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Short_Singular_Input")
    void invalidAddressAdditionTooShortPostCodeTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - too short user post code (4 digits)
        invalidUserAddressAdditionTooShortPostCodeTest();
    }

    //too long singular input

    //Test 004m -> invalid user address addition test - too long user first name (100 chars) (the user address gets accepted, test has failed)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Long First Name")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidAddressAdditionTooLongFirstNameTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - too long user first name (100 chars)
        invalidUserAddressAdditionTooLongFirstNameTest();
    }

    //Test 004n -> invalid user address addition test - too long user last name (100 chars) (the user address gets accepted, test has failed)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Long Last Name")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidAddressAdditionTooLongLastNameTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - too long user last name (100 chars)
        invalidUserAddressAdditionTooLongLastNameTest();
    }

    //Test 004o -> invalid user address addition test - too long user address (100 chars) (the user address gets accepted, test has failed)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Long Address")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidAddressAdditionTooLongAddressTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - too long user address (100 chars)
        invalidUserAddressAdditionTooLongAddressTest();
    }

    //Test 004p -> invalid user address addition test - too long user city (75 chars) (the user address gets accepted, test has failed)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Long City")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidAddressAdditionTooLongCityTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - too long user city (75 chars)
        invalidUserAddressAdditionTooLongCityTest();
    }

    //Test 004q -> invalid user address addition test - too long user post code (6 digits)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Long Post Code")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidAddressAdditionTooLongPostCodeTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - too long user post code (6 digits)
        invalidUserAddressAdditionTooLongPostCodeTest();
    }

    //invalid singular input format

    //Test 004r -> invalid user address addition test - invalid user first name format (special symbols only) (the user address gets accepted, test has failed)
    @Test
    @DisplayName("Invalid User Address Addition Test - Invalid First Name Format")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAddressAdditionInvalidFirstNameFormatTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - invalid user first name format (special symbols only)
        invalidUserAddressAdditionInvalidFirstNameFormatTest();
    }

    //Test 004s -> invalid user address addition test - invalid user last name format (special symbols only) (the user address gets accepted, test has failed)
    @Test
    @DisplayName("Invalid User Address Addition Test - Invalid Last Name Format")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAddressAdditionInvalidLastNameFormatTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //invalid user address addition test - invalid user last name format (special symbols only)
        invalidUserAddressAdditionInvalidLastNameFormatTest();
    }

}
