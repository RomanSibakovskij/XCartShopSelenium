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

    //Test 025h -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short shipping address (4 chars) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Short Shipping Address")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Short_Singular_Input")
    void invalidGuestCheckoutConfirmationTooShortShipAddressTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too short shipping address (4 chars)
        invalidGuestBillAndShipAddressCheckoutTooShortShipAddressTest();
    }

    //Test 025i -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short shipping city (2 chars) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Short Shipping City")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Short_Singular_Input")
    void invalidGuestCheckoutConfirmationTooShortShipCityTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too short shipping city (2 chars)
        invalidGuestBillAndShipAddressCheckoutTooShortShipCityTest();
    }

    //Test 025j -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too short shipping post code (4 digits) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Short Shipping Post Code")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Short_Singular_Input")
    void invalidGuestCheckoutConfirmationTooShortShipPostCodeTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too short shipping post code (4 digits)
        invalidGuestBillAndShipAddressCheckoutTooShortShipPostCodeTest();
    }

    //too long singular input

    //Test 025k -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long billing first name (100 chars) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Long Billing First Name")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Long_Singular_Input")
    void invalidGuestCheckoutConfirmationTooLongBillFirstNameTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too long billing first name (100 chars)
        invalidGuestBillAndShipAddressCheckoutTooLongBillFirstNameTest();
    }

    //Test 025l -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long billing last name (100 chars) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Long Billing Last Name")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Long_Singular_Input")
    void invalidGuestCheckoutConfirmationTooLongBillLastNameTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too long billing last name (100 chars)
        invalidGuestBillAndShipAddressCheckoutTooLongBillLastNameTest();
    }

    //Test 025m -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long billing address (100 chars) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Long Billing Address")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Long_Singular_Input")
    void invalidGuestCheckoutConfirmationTooLongBillAddressTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too long billing address (100 chars)
        invalidGuestBillAndShipAddressCheckoutTooLongBillAddressTest();
    }

    //Test 025n -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long billing city (75 chars) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Long Billing City")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Long_Singular_Input")
    void invalidGuestCheckoutConfirmationTooLongBillCityTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too long billing city (75 chars)
        invalidGuestBillAndShipAddressCheckoutTooLongBillCityTest();
    }

    //Test 025o -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long billing post code (6 digits)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Long Billing Post Code")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Long_Singular_Input")
    void invalidGuestCheckoutConfirmationTooLongBillPostCodeTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too long billing post code (6 digits)
        invalidGuestBillAndShipAddressCheckoutTooLongBillPostCodeTest();
    }

    //Test 025p -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long billing email (100 chars -> name, domain)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Long Billing Email")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Long_Singular_Input")
    void invalidGuestCheckoutConfirmationTooLongBillEmailTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too long billing email (100 chars -> name, domain)
        invalidGuestBillAndShipAddressCheckoutTooLongBillEmailTest();
    }

    //Test 025q -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long shipping first name (100 chars) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Long Shipping First Name")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Long_Singular_Input")
    void invalidGuestCheckoutConfirmationTooLongShipFirstNameTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too long shipping first name (100 chars)
        invalidGuestBillAndShipAddressCheckoutTooLongShipFirstNameTest();
    }

    //Test 025r -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long shipping last name (100 chars) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Long Shipping Last Name")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Long_Singular_Input")
    void invalidGuestCheckoutConfirmationTooLongShipLastNameTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too long shipping last name (100 chars)
        invalidGuestBillAndShipAddressCheckoutTooLongShipLastNameTest();
    }

    //Test 025s -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long shipping address (100 chars) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Long Shipping Address")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Long_Singular_Input")
    void invalidGuestCheckoutConfirmationTooLongShipAddressTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too long shipping address (100 chars)
        invalidGuestBillAndShipAddressCheckoutTooLongShipAddressTest();
    }

    //Test 025t -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long shipping city (75 chars) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Long Shipping City")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Long_Singular_Input")
    void invalidGuestCheckoutConfirmationTooLongShipCityTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too long shipping address (75 chars)
        invalidGuestBillAndShipAddressCheckoutTooLongShipCityTest();
    }

    //Test 025u -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - too long shipping post code (6 digits) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Too Long Shipping Post Code")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Too_Long_Singular_Input")
    void invalidGuestCheckoutConfirmationTooLongShipPostCodeTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - too long shipping post code (6 digits)
        invalidGuestBillAndShipAddressCheckoutTooLongShipPostCodeTest();
    }

    //invalid singular input format

    //Test 025w -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid billing first name format (special symbols only) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Invalid First Name Format")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Invalid_Singular_Input")
    void invalidGuestCheckoutConfirmationInvalidBillFirstNameFormatTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - invalid billing first name format (special symbols only)
        invalidGuestBillAndShipAddressCheckoutInvalidBillFirstNameFormatTest();
    }

    //Test 025x -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid billing last name format (special symbols only) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Invalid Last Name Format")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Invalid_Singular_Input")
    void invalidGuestCheckoutConfirmationInvalidBillLastNameFormatTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - invalid billing last name format (special symbols only)
        invalidGuestBillAndShipAddressCheckoutInvalidBillLastNameFormatTest();
    }

    //Test 025y -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid billing address format (special symbols only) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Invalid Address Format")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Invalid_Singular_Input")
    void invalidGuestCheckoutConfirmationInvalidBillAddressFormatTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - invalid billing address format (special symbols only)
        invalidGuestBillAndShipAddressCheckoutInvalidBillAddressFormatTest();
    }

    //Test 025z -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid billing city format (special symbols only) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Invalid City Format")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Invalid_Singular_Input")
    void invalidGuestCheckoutConfirmationInvalidBillCityFormatTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - invalid billing city format (special symbols only)
        invalidGuestBillAndShipAddressCheckoutInvalidBillCityFormatTest();
    }

    //Test 025aa -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid billing post code format (special symbols only)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Invalid Post Code Format")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Invalid_Singular_Input")
    void invalidGuestCheckoutConfirmationInvalidBillPostCodeFormatTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - invalid billing post code format (special symbols only)
        invalidGuestBillAndShipAddressCheckoutInvalidBillPostCodeFormatTest();
    }

    //Test 025ab -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid billing email format (special symbols only)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Invalid Email Format")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Invalid_Singular_Input")
    void invalidGuestCheckoutConfirmationInvalidBillEmailFormatTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - invalid billing email format (special symbols only)
        invalidGuestBillAndShipAddressCheckoutInvalidBillEmailFormatTest();
    }

    //Test 025ac -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - existing billing test email (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Existing Test Email")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Invalid_Singular_Input")
    void invalidGuestCheckoutConfirmationExistingBillTestEmailTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - existing billing test email
        invalidGuestBillAndShipAddressCheckoutExistingBillTestEmailFormatTest();
    }

    //Test 025ad -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid shipping first name format (special symbols only) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Invalid Shipping First Name Format")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Invalid_Singular_Input")
    void invalidGuestCheckoutConfirmationInvalidShipFirstNameFormatTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - invalid shipping first name format (special symbols only)
        invalidGuestBillAndShipAddressCheckoutInvalidShipFirstNameFormatTest();
    }

    //Test 025ae -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid shipping last name format (special symbols only) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Invalid Shipping Last Name Format")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Invalid_Singular_Input")
    void invalidGuestCheckoutConfirmationInvalidShipLastNameFormatTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - invalid shipping last name format (special symbols only)
        invalidGuestBillAndShipAddressCheckoutInvalidShipLastNameFormatTest();
    }

    //Test 025af -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid shipping address format (special symbols only) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Invalid Shipping Address Format")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Invalid_Singular_Input")
    void invalidGuestCheckoutConfirmationInvalidShipAddressFormatTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - invalid shipping address format (special symbols only)
        invalidGuestBillAndShipAddressCheckoutInvalidShipAddressFormatTest();
    }

    //Test 025ag -> invalid single featured product ("Iphone 5c") check out confirmation test (as a guest) - invalid shipping city format (special symbols only) (the checkout doesn't get aborted, test has failed)
    @Test
    @DisplayName("Invalid Single Featured Product Checkout Confirmation Test (as a guest) - Invalid Shipping City Format")
    @Tag("Invalid_Single_Featured_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Test_As_A_Guest")
    @Tag("Invalid_Singular_Input")
    void invalidGuestCheckoutConfirmationInvalidShipCityFormatTest() {
        //add single featured product ("Iphone 5c") to cart test (as a guest)
        addSingleFeaturedProductToCartGuestTest();
        //add single featured product ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //invalid guest product ("Iphone 5c") checkout confirmation test - invalid shipping city format (special symbols only)
        invalidGuestBillAndShipAddressCheckoutInvalidShipCityFormatTest();
    }

}
