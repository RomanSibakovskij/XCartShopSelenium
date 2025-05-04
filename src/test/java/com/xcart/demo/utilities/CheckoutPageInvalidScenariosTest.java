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

    //Test 025b -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short billing address (4 chars) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Short Billing Address")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Short_Singular_Input")
    void invalidGuestCheckoutConfirmationTooShortBillAddressTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too short billing address (4 chars)
        invalidGuestBillAndShipAddressCheckoutTooShortBillAddressTest();
    }

    //Test 025c -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short billing city (2 chars) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Short Billing City")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Short_Singular_Input")
    void invalidGuestCheckoutConfirmationTooShortBillCityTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too short billing city (2 chars)
        invalidGuestBillAndShipAddressCheckoutTooShortBillCityTest();
    }

    //Test 025d -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short billing post code (4 digits)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Short Billing Post Code")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Short_Singular_Input")
    void invalidGuestCheckoutConfirmationTooShortBillPostCodeTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too short billing post code (4 digits)
        invalidGuestBillAndShipAddressCheckoutTooShortBillPostCodeTest();
    }

    //Test 025e -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short billing email (1 char -> name, domain) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Short Billing Email")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Short_Singular_Input")
    void invalidGuestCheckoutConfirmationTooShortBillEmailTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too short billing email (1 char -> name, domain)
        invalidGuestBillAndShipAddressCheckoutTooShortBillEmailTest();
    }

    //Test 025f -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short shipping first name (1 char) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Short Shipping First Name")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Short_Singular_Input")
    void invalidGuestCheckoutConfirmationTooShortShipFirstNameTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too short shipping first name (1 char)
        invalidGuestBillAndShipAddressCheckoutTooShortShipFirstNameTest();
    }

    //Test 025g -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short shipping last name (1 char) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Short Shipping Last Name")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Short_Singular_Input")
    void invalidGuestCheckoutConfirmationTooShortShipLastNameTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too short shipping last name (1 char)
        invalidGuestBillAndShipAddressCheckoutTooShortShipLastNameTest();
    }

}
