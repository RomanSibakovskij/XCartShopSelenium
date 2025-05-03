package com.xcart.demo;

import com.xcart.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class SingleProductPageTest extends TestMethods{


    //single product addition from single product page to cart tests

    //Test 009 -> add single product ("Digital Angel") from single product page to cart test (as a guest)
    @Test
    @DisplayName("Single Product Addition From Single Product Page To Cart Test (as a guest)")
    @Tag("Add_Single_Product_To_Cart")
    @Tag("Single_Product_Page_Test")
    @Tag("Test_As_A_Guest")
    void singleProductPageProductGuestAddToCartTest() {
        addSingleDigitalAngelProductToCartGuestTest();
    }

    //Test 009a -> add single product ("Digital Angel") from single product page to cart test (as a registered user)
    @Test
    @DisplayName("Single Product Addition From Single Product Page To Cart Test (as a registered user)")
    @Tag("Add_Single_Product_To_Cart")
    @Tag("Single_Product_Page_Test")
    @Tag("Test_As_A_Reg_User")
    void singleProductPageProductRegUserAddToCartTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add single product ("Digital Angel") from single product page to cart test (as a registered user)
        addSingleDigitalAngelProductToCartRegUserTest();
    }

    //multiple products addition from single product page to cart tests

    //Test 009b -> add multiple products ("Digital Angel") from single product page to cart test (as a guest)
    @Test
    @DisplayName("Multiple Products Addition From Single Product Page To Cart Test (as a guest)")
    @Tag("Add_Multiple_Products_To_Cart")
    @Tag("Single_Product_Page_Test")
    @Tag("Test_As_A_Guest")
    void multipleProductsPageProductGuestAddToCartTest() {
        addMultipleDigitalAngelProductToCartGuestTest();
    }

    //Test 009c -> add multiple products ("Digital Angel") from single product page to cart test (as a registered user)
    @Test
    @DisplayName("Multiple Products Addition From Single Product Page To Cart Test (as a registered user)")
    @Tag("Add_Multiple_Products_To_Cart")
    @Tag("Single_Product_Page_Test")
    @Tag("Test_As_A_Reg_User")
    void multipleProductsPageProductRegUserAddToCartTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add multiple products ("Digital Angel") from single product page to cart test (as a registered user)
        addMultipleDigitalAngelProductsToCartRegUserTest();
    }

    //product addition from single product page to wishlist tests (only registered users have this feature)

    //Test 009d -> add single product ("Digital Angel") from single product page to wishlist test (as a registered user)
    @Test
    @DisplayName("Single Product Addition From Single Product Page To Wishlist Test (as a registered user)")
    @Tag("Add_Single_Product_From_Single_Product_Page_To_Wishlist")
    @Tag("Single_Product_Page_Test")
    @Tag("Test_As_A_Reg_User")
    void singleProductPageProductRegUserAddToWishlistTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add single product ("Digital Angel") from single product page to wishlist test (as a registered user)
        addSingleDigitalAngelProductToWishlistRegUserTest();
    }

}
