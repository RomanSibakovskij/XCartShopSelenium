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
    
}
