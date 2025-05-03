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

    //Test 012c -> add multiple featured products ("Thumb-Size R/C Mini Cooper") to check out test (as a registered user)
    @Test
    @DisplayName("Multiple Featured Product Addition To Checkout Test (as a registered user)")
    @Tag("Add_Multiple_Featured_Products_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void multipleFeaturedProductRegUserAddToCheckoutTest() {
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
    }

    //single searched product addition to cart tests

    //Test 013 -> add single searched product ("AMD A10-5800K") to check out test (as a guest)
    @Test
    @DisplayName("Single Searched Product Addition To Checkout Test (as a guest)")
    @Tag("Add_Single_Searched_Product_To_Checkout")
    @Tag("Test_As_A_Guest")
    void singleSearchedProductGuestAddToCheckoutTest() {
        //add single searched product ("AMD A10-5800K") to cart test (as a guest)
        addSingleSearchedProductToCartGuestTest();
        //add single searched product ("AMD A10-5800K") to check out test (as a guest)
        addProductToCheckoutTest();
    }

    //Test 013a -> add single featured product ("R/C Desktop Forklift") to check out test (as a registered user)
    @Test
    @DisplayName("Single Searched Product Addition To Checkout Test (as a registered user)")
    @Tag("Add_Single_Searched_Product_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void singleSearchedProductRegUserAddToCheckoutTest() {
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
    }

    //multiple searched products addition to check out tests

    //Test 013b -> add multiple searched products ("R/C Desktop Forklift") to check out test (as a guest)
    @Test
    @DisplayName("Multiple Searched Products Addition To Checkout Test (as a guest)")
    @Tag("Add_Multiple_Searched_Products_To_Checkout")
    @Tag("Test_As_A_Guest")
    void multipleSearchedProductsGuestAddToCheckoutTest() {
        //add multiple searched products ("R/C Desktop Forklift") to cart test (as a guest)
        addMultipleSearchedProductToCartGuestTest();
        //add multiple searched products ("R/C Desktop Forklift") to check out test (as a guest)
        addProductToCheckoutTest();
    }

    //Test 013c -> add multiple featured product ("R/C Desktop Forklift") to check out test (as a registered user)
    @Test
    @DisplayName("Multiple Searched Product Addition To Checkout Test (as a registered user)")
    @Tag("Add_Multiple_Searched_Products_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void multipleSearchedProductRegUserAddToCheckoutTest() {
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
    }

    //single product page product addition to cart tests

    //Test 014 -> add single product page product ("Digital Angel") to check out test (as a guest)
    @Test
    @DisplayName("Single Product Page Product Addition To Checkout Test (as a guest)")
    @Tag("Add_Single_Product_Page_Product_To_Checkout")
    @Tag("Test_As_A_Guest")
    void singleProductPageProductGuestAddToCheckoutTest() {
        //add single searched product ("Digital Angel") to cart out test (as a guest)
        addSingleDigitalAngelProductToCartGuestTest();
        //add single searched product ("Digital Angel") to check out test (as a guest)
        addProductToCheckoutTest();
    }

    //Test 014a -> add single featured product ("Digital Angel") to check out test (as a registered user)
    @Test
    @DisplayName("Single Product Page Product Addition To Checkout Test (as a registered user)")
    @Tag("Add_Single_Product_Page_Product_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void singleProductPageProductRegUserAddToCheckoutTest() {
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
    }

    //multiple single product page products addition to check out tests

    //Test 014b -> add multiple single product page products ("Digital Angel") to check out test (as a guest)
    @Test
    @DisplayName("Single Product Page Multiple Products Addition To Checkout Test (as a guest)")
    @Tag("Add_Multiple_Searched_Products_To_Checkout")
    @Tag("Test_As_A_Guest")
    void multipleProductsSingleProductPageGuestAddToCheckoutTest() {
        //add multiple searched products ("Digital Angel") to cart test (as a guest)
        addMultipleDigitalAngelProductToCartGuestTest();;
        //add multiple searched products ("Digital Angel") to check out test (as a guest)
        addProductToCheckoutTest();
    }

    //Test 014c -> add multiple single product page products ("Digital Angel") to check out test (as a registered user)
    @Test
    @DisplayName("Single Product Page Multiple Products Addition To Checkout Test (as a registered user)")
    @Tag("Add_Multiple_Searched_Products_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void multipleProductsSingleProductPageRegUserAddToCheckoutTest() {
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
    }

    //single product addition from products map to check out tests

    //Test 015 -> add single product ("Antec Nine Hundred ATX Gaming Case") from products map to check out test (as a guest)
    @Test
    @DisplayName("Single Product Addition From Products Map To Checkout Test (as a guest)")
    @Tag("Add_Single_Product_To_Checkout")
    @Tag("Test_As_A_Guest")
    void singleProductsMapProductGuestAddToCheckoutTest() {
        //add single product ("Antec Nine Hundred ATX Gaming Case") from products map to cart test (as a guest)
        addSingleProductFromProductsMapToCartGuestTest();
        //add single product ("Antec Nine Hundred ATX Gaming Case") from products map to check out test (as a guest)
        addProductToCheckoutTest();
    }

    //Test 015a -> add single product ("Apple Dock Connector to USB Cable") from products map to check out test (as a registered user)
    @Test
    @DisplayName("Single Product Addition From Products Map To Checkout Test (as a registered user)")
    @Tag("Add_Single_Product_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void singleProductsMapProductRegUserAddToCheckoutTest() {
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
    }

    //multiple products addition from products map to check out tests

    //Test 015b -> add multiple products ("Genius Traveler 6000X Ambidextrous Mouse") from products map to check out test (as a guest)
    @Test
    @DisplayName("Multiple Products Addition From Products Map To Checkout (as a guest)")
    @Tag("Add_Multiple_Products_To_Checkout")
    @Tag("Test_As_A_Guest")
    void multipleProductsMapProductsGuestAddToCheckoutTest() {
        //add multiple products ("Genius Traveler 6000X Ambidextrous Mouse") from products map to cart test (as a guest)
        addMultipleProductsFromProductsMapToCartGuestTest();
        //add multiple products ("Genius Traveler 6000X Ambidextrous Mouse") from products map to check out test (as a guest)
        addProductToCheckoutTest();
    }

    //Test 015c -> add multiple products ("iMac") from products map to check out test (as a registered user)
    @Test
    @DisplayName("Multiple Products Addition From Products Map To Checkout (as a registered user)")
    @Tag("Add_Multiple_Products_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void multipleProductsMapProductsRegUserAddToCheckoutTest() {
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
    }

    //single category product addition to check out tests

    //Test 016 -> add single category product ("Anna Karenina") to check out (as a guest)
    @Test
    @DisplayName("Single Category Product Addition To Checkout Test (as a guest)")
    @Tag("Add_Single_Category_Product_To_Checkout")
    @Tag("Test_As_A_Guest")
    void singleCategoryProductGuestAddProductToCheckoutTest() {
        //add single category product ("Anna Karenina") to cart (as a guest)
        addSingleProductCategoryProductToCartTest();
        //add single category product ("Anna Karenina") to check out (as a guest)
        addProductToCheckoutTest();
    }

    //Test 016a -> add single category product ("Anna Karenina") to check out test (as a registered user)
    @Test
    @DisplayName("Single Category Product Addition To Checkout Test (as a registered user)")
    @Tag("Add_Single_Category_Product_To_Checkout")
    @Tag("Test_As_A_Reg_User")
    void singleCategoryProductRegUserAddProductToCheckoutTest() {
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
    }

    //single category multiple products addition to check out tests

    //Test 016b -> add multiple single category products ("The Lord of the Rings: 50th Anniversary, One Vol. Edition") to check out test (as a guest)
    @Test
    @DisplayName("Multiple Single Category Products Addition To Checkout Test(as a guest)")
    @Tag("Add_Multiple_Single_Category_Products_To_Checkout")
    @Tag("Test_As_A_Guest")
    void multipleSingleCategoryProductsGuestAddToCheckoutTest() {
        //add multiple single category products ("The Lord of the Rings: 50th Anniversary, One Vol. Edition") to cart test (as a guest)
        addSetProductCategoryMultipleProductsToCartTest();
        //add multiple single category products ("The Lord of the Rings: 50th Anniversary, One Vol. Edition") to check out test (as a guest)
        addProductToCheckoutTest();
    }

}
