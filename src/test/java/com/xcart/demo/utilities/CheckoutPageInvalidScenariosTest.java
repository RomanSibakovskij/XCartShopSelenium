package com.xcart.demo.utilities;

import org.junit.jupiter.api.*;

public class CheckoutPageInvalidScenariosTest extends TestMethods{

    //invalid guest checkout tests (since the input forms don't allow missing inputs, no singular input testing is redundant)

    //too short singular input

    //Test 025 -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short billing first name (1 char) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Short Billing First Name")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Short_Singular_Input")
    void invalidGuestCheckoutConfirmationTooShortBillFirstNameTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too short billing first name (1 char)
        invalidGuestBillAndShipAddressCheckoutTooShortBillFirstNameTest();
    }

    //Test 025a -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short billing last name (1 char) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Short Billing Last Name")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Short_Singular_Input")
    void invalidGuestCheckoutConfirmationTooShortBillLastNameTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too short billing last name (1 char)
        invalidGuestBillAndShipAddressCheckoutTooShortBillLastNameTest();
    }

}
