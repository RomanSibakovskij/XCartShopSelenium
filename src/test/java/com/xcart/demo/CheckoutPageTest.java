package com.xcart.demo;

import com.xcart.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CheckoutPageTest extends TestMethods{

    //single featured product check out confirmation test

    //Test 020 -> valid single featured product ("Iphone 5c") check out confirmation test (as a guest)
    @Test
    @DisplayName("Single Featured Product Checkout Confirmation Test (as a guest)")
    @Tag("Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Valid_Guest_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void singleFeaturedProductGuestCheckoutConfirmationTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //valid guest product ("Iphone 5c") checkout confirmation test
        validGuestProductCheckoutConfirmationTest();
        //order invoice page test
        orderInvoicePageTest();
    }

}
