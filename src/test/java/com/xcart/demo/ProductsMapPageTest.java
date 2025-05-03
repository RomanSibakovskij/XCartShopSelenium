package com.xcart.demo;

import com.xcart.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class ProductsMapPageTest extends TestMethods{

    //single product addition from products map to cart tests

    //Test 008 -> add single product ("Antec Nine Hundred ATX Gaming Case") from products map to cart test (as a guest)
    @Test
    @DisplayName("Single Product Addition From Products Map To Cart Test (as a guest)")
    @Tag("Add_Single_Product_To_Cart")
    @Tag("Test_As_A_Guest")
    void singleProductsMapProductGuestAddToCartTest() {
        addSingleProductFromProductsMapToCartGuestTest();
    }

    //Test 008a -> add single product ("Apple Dock Connector to USB Cable") from products map to cart test (as a registered user)
    @Test
    @DisplayName("Single Product Addition From Products Map To Cart Test (as a registered user)")
    @Tag("Add_Single_Product_To_Cart")
    @Tag("Test_As_A_Reg_User")
    void singleProductsMapProductRegUserAddToCartTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add single product ("Apple Dock Connector to USB Cable") from products map to cart test (as a registered user)
        addSingleProductFromProductsMapToCartRegUserTest();
    }

    //multiple products addition from products map to cart tests

    //Test 008b -> add multiple products ("Genius Traveler 6000X Ambidextrous Mouse") from products map to cart test (as a guest)
    @Test
    @DisplayName("Multiple Products Addition From Products Map To Cart (as a guest)")
    @Tag("Add_Multiple_Products_To_Cart")
    @Tag("Test_As_A_Guest")
    void multipleProductsMapProductsGuestAddToCartTest() {
        addMultipleProductsFromProductsMapToCartGuestTest();
    }

}
