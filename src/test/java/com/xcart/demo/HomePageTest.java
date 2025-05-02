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

}
