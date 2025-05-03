package com.xcart.demo;

import com.xcart.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods {

    //user navigation to 'Register' page test

    //Test 001 -> navigate user to 'Register' page test
    @Test
    @DisplayName("User Navigation To Register Page Test")
    @Tag("Navigate_To_Register_Page")
    void navigateUserToRegisterPageTest() {
        navigateToRegisterPageTest();
    }

    //single featured product addition to cart tests

    //Test 007 -> add single featured product ("Iphone 5c") to cart test (as a guest)
    @Test
    @DisplayName("Single Featured Product Addition To Cart Test (as a guest)")
    @Tag("Add_Single_Featured_Product_To_Cart")
    @Tag("Test_As_A_Guest")
    void singleFeaturedProductGuestAddToCartTest() {
        addSingleFeaturedProductToCartGuestTest();
    }

    //Test 007a -> add single featured product ("Thumb-Size R/C Mini Cooper") to cart test (as a registered user)
    @Test
    @DisplayName("Single Featured Product Addition To Cart Test (as a registered user)")
    @Tag("Add_Single_Featured_Product_To_Cart")
    @Tag("Test_As_A_Reg_User")
    void singleFeaturedProductRegUserAddToCartTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add single featured product ("Thumb-Size R/C Mini Cooper") to cart test (as a registered user)
        addSingleFeaturedProductToCartRegUserTest();
    }

    //multiple featured products addition to cart tests

    //Test 007b -> add multiple featured products ("Iphone 5c") to cart test (as a guest)
    @Test
    @DisplayName("Multiple Featured Products Addition To Cart Test (as a guest)")
    @Tag("Add_Multiple_Featured_Products_To_Cart")
    @Tag("Test_As_A_Guest")
    void multipleFeaturedProductGuestAddToCartTest() {
        addMultipleFeaturedProductsToCartGuestTest();
    }

    //Test 007c -> add multiple featured products ("Thumb-Size R/C Mini Cooper") to cart test (as a registered user)
    @Test
    @DisplayName("Multiple Featured Product Addition To Cart Test (as a registered user)")
    @Tag("Add_Multiple_Featured_Products_To_Cart")
    @Tag("Test_As_A_Reg_User")
    void multipleFeaturedProductRegUserAddToCartTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add multiple featured products ("Thumb-Size R/C Mini Cooper") to cart test (as a registered user)
        addMultipleFeaturedProductToCartRegUserTest();
    }

    //single searched product addition to cart tests

    //Test 007d -> add single searched product ("AMD A10-5800K") to cart test (as a guest)
    @Test
    @DisplayName("Single Searched Product Addition To Cart Test (as a guest)")
    @Tag("Add_Single_Searched_Product_To_Cart")
    @Tag("Test_As_A_Guest")
    void singleSearchedProductGuestAddToCartTest() {
        addSingleSearchedProductToCartGuestTest();
    }

    //Test 007e -> add single featured product ("R/C Desktop Forklift") to cart test (as a registered user)
    @Test
    @DisplayName("Single Searched Product Addition To Cart Test (as a registered user)")
    @Tag("Add_Single_Searched_Product_To_Cart")
    @Tag("Test_As_A_Reg_User")
    void singleSearchedProductRegUserAddToCartTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add single featured product ("R/C Desktop Forklift") to cart test (as a registered user)
        addSingleSearchedProductToCartRegUserTest();
    }

    //multiple searched products addition to cart tests

    //Test 007f -> add multiple searched products ("R/C Desktop Forklift") to cart test (as a guest)
    @Test
    @DisplayName("Multiple Searched Products Addition To Cart Test (as a guest)")
    @Tag("Add_Multiple_Searched_Products_To_Cart")
    @Tag("Test_As_A_Guest")
    void multipleSearchedProductsGuestAddToCartTest() {
        addMultipleSearchedProductToCartGuestTest();
    }

}
