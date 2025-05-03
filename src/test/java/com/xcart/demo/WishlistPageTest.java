package com.xcart.demo;

import com.xcart.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class WishlistPageTest extends TestMethods{

    //product addition to wishlist tests

    //Test 011 -> add single featured product ("Thumb-Size R/C Mini Cooper [Detailed Images Demo]") to wishlist test (as a registered user)
    @Test
    @DisplayName("Single Featured Product Addition To Wishlist Test (as a registered user)")
    @Tag("Add_Single_Featured_Product_To_Wishlist")
    @Tag("Test_As_A_Reg_User")
    void singleFeaturedProductRegUserAddToWishlistTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add single featured product ("Thumb-Size R/C Mini Cooper [Detailed Images Demo]") to wishlist test (as a registered user)
        addFeaturedProductToWishlistRegUserTest();
    }

    //Test 011a -> add multiple featured products ("Thumb-Size R/C Mini Cooper [Detailed Images Demo]") to wishlist test (as a registered user)
    @Test
    @DisplayName("Multiple Featured Products Addition To Wishlist Test (as a registered user)")
    @Tag("Add_Multiple_Featured_Products_To_Wishlist")
    @Tag("Test_As_A_Reg_User")
    void multipleFeaturedProductsRegUserAddToWishlistTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add multiple featured products ("Thumb-Size R/C Mini Cooper [Detailed Images Demo]") to wishlist test (as a registered user)
        addMultipleFeaturedProductsToWishlistRegUserTest();
    }

    //product addition to cart from wishlist test

    //Test 011b -> add single featured product ("Thumb-Size R/C Mini Cooper [Detailed Images Demo]") to cart from wishlist test (as a registered user)
    @Test
    @DisplayName("Single Featured Product Addition To Cart From Wishlist Test (as a registered user)")
    @Tag("Add_Single_Featured_Product_To_Cart_From_Wishlist")
    @Tag("Test_As_A_Reg_User")
    void singleFeaturedProductRegUserAddToCartFromWishlistTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add single featured product ("Thumb-Size R/C Mini Cooper [Detailed Images Demo]") to cart from wishlist test (as a registered user)
        addFeaturedProductFromWishlistToCartRegUserTest();
    }

    //Test 011c -> add multiple featured products ("Thumb-Size R/C Mini Cooper [Detailed Images Demo]") to cart from wishlist test (as a registered user)
    @Test
    @DisplayName("Multiple Featured Products Addition To Cart From Wishlist Test (as a registered user)")
    @Tag("Add_Multiple_Featured_Products_To_Cart_From_Wishlist")
    @Tag("Test_As_A_Reg_User")
    void multipleFeaturedProductsRegUserAddToCartFromWishlistTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //add multiple featured products ("Thumb-Size R/C Mini Cooper [Detailed Images Demo]") to cart from wishlist test (as a registered user)
        addMultipleFeaturedProductsToCartFromWishlistRegUserTest();
    }

    //product quantity update in wishlist test

    //Test 011d -> update featured product ("Thumb-Size R/C Mini Cooper [Detailed Images Demo]") quantity in wishlist test (as a registered user)
    @Test
    @DisplayName("Update Featured Product Quantity In Wishlist Test (as a registered user)")
    @Tag("Update_Featured_Product_Quantity_In_Wishlist")
    @Tag("Test_As_A_Reg_User")
    void featuredProductRegUserQuantityUpdateInWishlistTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //update featured product ("Thumb-Size R/C Mini Cooper [Detailed Images Demo]") quantity in wishlist test (as a registered user)
        updateFeaturedProductQtyInWishlistRegUserTest();
    }

    //product remove from wishlist test

    //Test 011e -> remove single featured product ("Thumb-Size R/C Mini Cooper [Detailed Images Demo]") from wishlist test (as a registered user)
    @Test
    @DisplayName("Single Featured Product Removal From Wishlist Test (as a registered user)")
    @Tag("Remove_Single_Featured_Product_From_Wishlist")
    @Tag("Test_As_A_Reg_User")
    void singleFeaturedProductRegUserRemoveFromWishlistTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        //navigate user to 'Register' page test
        navigateToRegisterPageTest();
        //valid user account creation test
        validUserAccountCreationTest(registerPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //remove single featured product ("Thumb-Size R/C Mini Cooper [Detailed Images Demo]") from wishlist test (as a registered user)
        removeFeaturedProductFromWishlistRegUserTest();
    }

}
