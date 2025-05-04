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

    //Test 020c -> add multiple featured products ("Iphone 5c") check out (billing and shipping address) confirmation test (as a guest)
    @Test
    @DisplayName("Multiple Featured Products Checkout (Billing and Shipping Address) Confirmation Test (as a guest)")
    @Tag("Multiple_Featured_Products_Checkout_Confirmation")
    @Tag("Multiple_Products")
    @Tag("Billing_And_Shipping_Address")
    @Tag("Test_As_A_Guest")
    void multipleFeaturedProductGuestBillAndShipCheckoutConfirmationTest() {
        //add multiple featured products ("Iphone 5c") to cart test (as a guest)
        addMultipleFeaturedProductsToCartGuestTest();
        //add multiple featured products ("Iphone 5c") to check out test (as a guest)
        addIphoneProductToCheckoutWithOptionsGuestTest();
        //valid guest products ("Iphone 5c") (billing and shipping address) checkout confirmation test
        validGuestProductBillAndShipAddressCheckoutConfirmationTest();
        //order invoice page test
        orderInvoicePageTest();
    }

    //Test 020d -> add multiple featured products ("Thumb-Size R/C Mini Cooper") check out confirmation test (as a registered user)
    @Test
    @DisplayName("Multiple Featured Product Checkout Confirmation Test (as a registered user)")
    @Tag("Multiple_Featured_Products_Checkout_Confirmation")
    @Tag("Multiple_Products")
    @Tag("Test_As_A_Reg_User")
    void multipleFeaturedProductRegUserCheckoutConfirmationTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add multiple featured products ("Thumb-Size R/C Mini Cooper") to cart test (as a registered user)
        addMultipleFeaturedProductToCartRegUserTest();
        //add multiple featured products ("Thumb-Size R/C Mini Cooper") to check out test (as a registered user)
        addProductToCheckoutLowerButtonTest();
        //registered user product ("Thumb-Size R/C Mini Cooper") checkout confirmation test
        validRegUserProductCheckoutConfirmationTest();
        //order invoice page test
        orderInvoicePageTest();
    }

    //single searched product check out confirmation tests

    //Test 021 -> single searched product with fax ordering payment method ("AMD A10-5800K") check out confirmation test (as a guest)
    @Test
    @DisplayName("Single Searched Product With Fax Ordering Payment Checkout Confirmation Test (as a guest)")
    @Tag("Single_Searched_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Valid_Guest_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void singleSearchedProductGuestCheckoutConfirmationTest() {
        //add single searched product ("AMD A10-5800K") to check out test (as a guest)
        addSingleSearchedProductToCartGuestTest();
        //add single searched product ("AMD A10-5800K") to check out test (as a guest)
        addProductToCheckoutTest();
        //valid guest product with fax ordering payment method ("AMD A10-5800K") checkout confirmation test
        validGuestProductFaxOrderCheckoutConfirmationTest();
        //order invoice page test
        orderInvoicePageTest();
    }

    //Test 021a -> add single featured product with shipping method example delivery method 2 selection ("R/C Desktop Forklift") check out confirmation test (as a registered user)
    @Test
    @DisplayName("Single Searched Product With Ex Delivery Method Two Checkout Confirmation Test (as a registered user)")
    @Tag("Single_Searched_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Reg_User_Checkout_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void singleSearchedProductRegUserCheckoutConfirmationTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add single featured product ("R/C Desktop Forklift") to cart test (as a registered user)
        addSingleSearchedProductToCartRegUserTest();
        //add single featured product ("R/C Desktop Forklift") to check out test (as a registered user)
        addProductToCheckoutLowerButtonTest();
        //registered user product ("R/C Desktop Forklift") checkout confirmation test (with shipping method example delivery method 2 selection)
        validRegUserProductCheckoutWithExMethodTwoConfirmationTest();
        //order invoice page test
        orderInvoicePageTest();
    }

    //multiple searched products check out confirmation tests

    //Test 021b -> multiple searched products with fax ordering payment method ("AMD A10-5800K") check out confirmation test (as a guest)
    @Test
    @DisplayName("Multiple Searched Products With Fax Ordering Payment Checkout Confirmation Test (as a guest)")
    @Tag("Multiple_Searched_Product_Checkout_Confirmation")
    @Tag("Multiple_Products")
    @Tag("Valid_Guest_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void multipleSearchedProductsGuestCheckoutConfirmationTest() {
        //add multiple searched products ("AMD A10-5800K") to cart test (as a guest)
        addMultipleSearchedProductToCartGuestTest();
        //add multiple searched products ("AMD A10-5800K") to check out test (as a guest)
        addProductToCheckoutTest();
        //valid guest products with fax ordering payment method ("AMD A10-5800K") checkout confirmation test
        validGuestProductFaxOrderCheckoutConfirmationTest();
        //order invoice page test
        orderInvoicePageTest();
    }

    //Test 021c -> multiple featured product with shipping method example delivery method 2 selection ("R/C Desktop Forklift") check out confirmation test (as a registered user)
    @Test
    @DisplayName("Multiple Searched Product With Ex Delivery Method Two Checkout Confirmation Test (as a registered user)")
    @Tag("Multiple_Searched_Product_Checkout_Confirmation")
    @Tag("Multiple_Products")
    @Tag("Reg_User_Checkout_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void multipleSearchedProductRegUserCheckoutConfirmationTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add multiple searched products ("R/C Desktop Forklift") to cart test (as a registered user)
        addMultipleSearchedProductsToCartRegUserTest();
        //add multiple featured product ("R/C Desktop Forklift") to check out test (as a registered user)
        addProductToCheckoutLowerButtonTest();
        //registered user products ("R/C Desktop Forklift") checkout confirmation test (with shipping method example delivery method 2 selection)
        validRegUserProductCheckoutWithExMethodTwoConfirmationTest();
        //order invoice page test
        orderInvoicePageTest();
    }

    //single product page product checkout confirmation tests

    //Test 022 -> add single product page product ("Digital Angel") check out confirmation test (as a guest)
    @Test
    @DisplayName("Single Product Page Product Addition Checkout Confirmation Test (as a guest)")
    @Tag("Add_Single_Product_Page_Product_To_Checkout")
    @Tag("Test_As_A_Guest")
    void singleProductPageProductGuestCheckoutConfirmationTest() {
        //add single searched product ("Digital Angel") to cart out test (as a guest)
        addSingleDigitalAngelProductToCartGuestTest();
        //add single searched product ("Digital Angel") to check out test (as a guest)
        addProductToCheckoutTest();
        //valid guest product with fax ordering payment method ("Digital Angel") checkout confirmation test
        validGuestProductFaxOrderCheckoutConfirmationTest();
        //order invoice page test
        orderInvoicePageTest();
    }

    //Test 022a -> add single featured product ("Digital Angel") check out confirmation test (as a registered user)
    @Test
    @DisplayName("Single Product Page Product Addition Checkout Confirmation Test (as a registered user)")
    @Tag("Add_Single_Product_Page_Product_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void singleProductPageProductRegUserCheckoutConfirmationTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add single featured product ("Digital Angel") to cart test (as a registered user)
        addSingleDigitalAngelProductToCartRegUserTest();;
        //add single featured product ("Digital Angel") to check out test (as a registered user)
        addProductToCheckoutLowerButtonTest();
        //registered user product ("Digital Angel") checkout confirmation test (with shipping method example delivery method 2 selection)
        validRegUserProductCheckoutWithExMethodTwoConfirmationTest();
        //order invoice page test
        orderInvoicePageTest();
    }

    //multiple single product page products check out confirmation tests

    //Test 022b -> add multiple single product page products ("Digital Angel") check out confirmation test (as a guest)
    @Test
    @DisplayName("Single Product Page Product Multiple Products Checkout Confirmation Test (as a guest)")
    @Tag("Add_Multiple_Searched_Products_To_Checkout")
    @Tag("Test_As_A_Guest")
    void multipleProductsSingleProductPageGuestCheckoutConfirmationTest() {
        //add multiple searched products ("Digital Angel") to cart test (as a guest)
        addMultipleDigitalAngelProductToCartGuestTest();;
        //add multiple searched products ("Digital Angel") to check out test (as a guest)
        addProductToCheckoutTest();
        //valid guest products with fax ordering payment method ("Digital Angel") checkout confirmation test
        validGuestProductFaxOrderCheckoutConfirmationTest();
        //order invoice page test
        orderInvoicePageTest();
    }

    //Test 022c -> add multiple single product page products ("Digital Angel") check out confirmation test (as a registered user)
    @Test
    @DisplayName("Single Product Page Product Multiple Products Checkout Confirmation Test (as a registered user)")
    @Tag("Add_Multiple_Searched_Products_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void multipleProductsSingleProductPageRegUserCheckoutConfirmationTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add multiple searched products ("Digital Angel") to cart test (as a registered user)
        addMultipleDigitalAngelProductsToCartRegUserTest();
        //add multiple featured product ("Digital Angel") to check out test (as a registered user)
        addProductToCheckoutLowerButtonTest();
        //registered user products ("Digital Angel") checkout confirmation test (with shipping method example delivery method 2 selection)
        validRegUserProductCheckoutWithExMethodTwoConfirmationTest();
        //order invoice page test
        orderInvoicePageTest();
    }

    //single product (from products map) check out confirmation tests

    //Test 023 -> single product ("Antec Nine Hundred ATX Gaming Case") (products map) check out confirmation test (as a guest)
    @Test
    @DisplayName("Single Product Addition (Products Map) With Ex Delivery Method One And Money Order Checkout Confirmation Test (as a guest)")
    @Tag("Single_Products_Map_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Valid_Guest_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void singleProductsMapProductGuestCheckoutConfirmationTest() {
        //add single product ("Antec Nine Hundred ATX Gaming Case") from products map to cart test (as a guest)
        addSingleProductFromProductsMapToCartGuestTest();
        //add single product ("Antec Nine Hundred ATX Gaming Case") from products map to check out test (as a guest)
        addProductToCheckoutTest();
        //valid guest product with example shipping delivery method 1 and money order payment method ("Antec Nine Hundred ATX Gaming Case") (from products map) checkout confirmation test
        validGuestProductExDeliveryOneAndMoneyOrderCheckoutConfirmationTest();
        //order invoice page test
        orderInvoicePageTest();
    }

    //Test 023a -> single product ("Apple Dock Connector to USB Cable") (products map) check out confirmation test (as a registered user)
    @Test
    @DisplayName("Single Product Addition (Products Map) Checkout Confirmation Test (as a registered user)")
    @Tag("Single_Products_Map_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Reg_User_Checkout_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void singleProductsMapProductRegUserCheckoutConfirmationTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add single product ("Apple Dock Connector to USB Cable") from products map to cart test (as a registered user)
        addSingleProductFromProductsMapToCartRegUserTest();
        //add single product ("Apple Dock Connector to USB Cable") from products map to check out test (as a registered user)
        addProductToCheckoutLowerButtonTest();
        //registered user product ("Apple Dock Connector to USB Cable") (from products map) checkout confirmation test
        validRegUserProductCheckoutConfirmationTest();
        //order invoice page test
        orderInvoicePageTest();
    }

    //multiple products addition (from products map) check out confirmation tests

    //Test 023b -> add multiple products ("Genius Traveler 6000X Ambidextrous Mouse") (from products map) check out confirmation test (as a guest)
    @Test
    @DisplayName("Multiple Products Addition (Products Map) With Ex Delivery Method One And Money Order Checkout Confirmation Test (as a guest)")
    @Tag("Multiple_Product_Map_Products_Checkout_Confirmation")
    @Tag("Multiple_Products")
    @Tag("Valid_Guest_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void multipleProductsMapProductsGuestCheckoutConfirmationTest() {
        //add multiple products ("Genius Traveler 6000X Ambidextrous Mouse") from products map to cart test (as a guest)
        addMultipleProductsFromProductsMapToCartGuestTest();
        //add multiple products ("Genius Traveler 6000X Ambidextrous Mouse") from products map to check out test (as a guest)
        addProductToCheckoutTest();
        //valid guest product with example shipping delivery method 1 and money order payment method ("Genius Traveler 6000X Ambidextrous Mouse") (from products map) checkout confirmation test
        validGuestProductExDeliveryOneAndMoneyOrderCheckoutConfirmationTest();
        //order invoice page test
        orderInvoicePageTest();
    }

    //Test 023c -> add multiple products ("iMac") (from products map) to check out test (as a registered user)
    @Test
    @DisplayName("Multiple Products Addition (Products Map) Checkout Confirmation Test(as a registered user)")
    @Tag("Multiple_Product_Map_Products_Checkout_Confirmation")
    @Tag("Multiple_Products")
    @Tag("Reg_User_Checkout_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void multipleProductsMapProductsRegUserCheckoutConfirmationTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add multiple products ("iMac") from products map to cart test (as a registered user)
        addMultipleProductsFromProductsMapToCartRegUserTest();
        //add multiple products ("iMac") from products map to check out test (as a registered user)
        addProductToCheckoutLowerButtonTest();
        //registered user product ("iMac") (from products map) checkout confirmation test
        validRegUserProductCheckoutConfirmationTest();
        //order invoice page test
        orderInvoicePageTest();
    }

    //single category product check out confirmation tests

    //Test 024 -> single category product ("Anna Karenina") check out confirmation (as a guest)
    @Test
    @DisplayName("Single Category Product With Ex Delivery Method One And Money Order Checkout Confirmation Test (as a guest)")
    @Tag("Single_Category_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Valid_Guest_Checkout_Confirmation")
    @Tag("Test_As_A_Guest")
    void singleCategoryProductGuestCheckoutConfirmationTest() {
        //add single category product ("Anna Karenina") to cart (as a guest)
        addSingleProductCategoryProductToCartTest();
        //add single category product ("Anna Karenina") to check out (as a guest)
        addProductToCheckoutTest();
        //valid guest single category product with example shipping delivery method 1 and money order payment method ("Anna Karenina") checkout confirmation test
        validGuestProductExDeliveryOneAndMoneyOrderCheckoutConfirmationTest();
        //order invoice page test
        orderInvoicePageTest();
    }

    //Test 024a -> single category product ("Anna Karenina") check out confirmation test (as a registered user) (with shipping method example delivery method 2 selection)
    @Test
    @DisplayName("Single Category Product With Ex Delivery Method Two Checkout Confirmation Test (as a registered user)")
    @Tag("Single_Category_Product_Checkout_Confirmation")
    @Tag("Single_Product")
    @Tag("Reg_User_Checkout_Confirmation")
    @Tag("Test_As_A_Reg_User")
    void singleCategoryProductRegUserCheckoutConfirmationTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add single category product ("Anna Karenina") to cart test (as a registered user)
        addSingleProductCategoryToCartRegUserTest();
        //add single category product ("Anna Karenina") to check out test (as a registered user)
        addProductToCheckoutLowerButtonTest();
        //registered user single category product ("Anna Karenina") checkout confirmation test (with shipping method example delivery method 2 selection)
        validRegUserProductCheckoutWithExMethodTwoConfirmationTest();
        //order invoice page test
        orderInvoicePageTest();
    }

}
