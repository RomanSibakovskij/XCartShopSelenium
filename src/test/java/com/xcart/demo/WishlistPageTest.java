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

}
