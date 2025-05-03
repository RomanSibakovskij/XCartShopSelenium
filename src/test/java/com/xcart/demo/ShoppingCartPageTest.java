package com.xcart.demo;

import com.xcart.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class ShoppingCartPageTest extends TestMethods{

    //single featured product addition to check out tests

    //Test 012 -> add single featured product ("Iphone 5c") to check out test (as a guest)
    @Test
    @DisplayName("Single Featured Product Addition To Checkout Test (as a guest)")
    @Tag("Add_Single_Featured_Product_To_Checkout")
    @Tag("Test_As_A_Guest")
    void singleFeaturedProductGuestAddToCheckoutTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
    }

    //Test 012a -> add single featured product ("Thumb-Size R/C Mini Cooper") to check out test (as a registered user) (test fails due to $10 limit)
    @Test
    @DisplayName("Single Featured Product Addition To Checkout Test (as a registered user)")
    @Tag("Add_Single_Featured_Product_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void singleFeaturedProductRegUserAddToCheckoutTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add single featured product ("Thumb-Size R/C Mini Cooper") to cart test (as a registered user)
        addSingleFeaturedProductToCartRegUserTest();
        //add single featured product ("Thumb-Size R/C Mini Cooper") to check out test (as a registered user)
        addProductToCheckoutLowerButtonTest();
    }

    //multiple featured product addition to check out tests

    //Test 012b -> add multiple featured products ("Iphone 5c") to check out test (as a guest)
    @Test
    @DisplayName("Multiple Featured Products Addition To Checkout Test (as a guest)")
    @Tag("Add_Multiple_Featured_Products_To_Checkout")
    @Tag("Test_As_A_Guest")
    void multipleFeaturedProductGuestAddToCheckoutTest() {
        //add multiple featured products ("Iphone 5c") to cart test (as a guest)
        addMultipleFeaturedProductsToCartGuestTest();
        //add multiple featured products ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
    }

}
