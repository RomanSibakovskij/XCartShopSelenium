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

}
