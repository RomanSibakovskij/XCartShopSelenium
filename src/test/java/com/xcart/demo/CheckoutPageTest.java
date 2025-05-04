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

    //single featured product check out confirmation test (billing and shipping address)

    //Test 020a -> valid single featured product ("Iphone 5c") check out (billing and shipping address) confirmation test (as a guest)
    @Test
    @DisplayName("Single Featured Product Checkout (Billing and Shipping Address) Confirmation Test (as a guest)")
    @Tag("Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Billing_And_Shipping_Address")
    @Tag("Valid_Guest_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void singleFeaturedProductGuestBillAndShipCheckoutConfirmationTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //valid guest product ("Iphone 5c") (billing and shipping address) checkout confirmation test
        validGuestProductBillAndShipAddressCheckoutConfirmationTest();
        //order invoice page test
        orderInvoicePageTest();
    }

    //multiple featured product check out confirmation tests

    //Test 020b -> add multiple featured products ("Iphone 5c") check out confirmation test (as a guest)
    @Test
    @DisplayName("Multiple Featured Products Checkout Confirmation Test (as a guest)")
    @Tag("Multiple_Featured_Products_Checkout_Confirmation")
    @Tag("Multiple_Products")
    @Tag("Test_As_A_Guest")
    void multipleFeaturedProductGuestCheckoutConfirmationTest() {
        //add multiple featured products ("Iphone 5c") to cart test (as a guest)
        addMultipleFeaturedProductsToCartGuestTest();
        //add multiple featured products ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //valid guest products ("Iphone 5c") checkout confirmation test
        validGuestProductCheckoutConfirmationTest();
        //order invoice page test
        orderInvoicePageTest();
    }

}
