package com.xcart.demo;

import com.xcart.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class SingleCategoryProductDashboardPageTest extends TestMethods{

    //single product addition to cart tests

    //Test 010 -> add single category product ("Anna Karenina") to cart test (as a guest)
    @Test
    @DisplayName("Single Category Product Addition To Cart Test (as a guest)")
    @Tag("Add_Single_Category_Product_To_Cart")
    @Tag("Test_As_A_Guest")
    void singleCategoryProductGuestAddProductToCartTest() {
        addSingleProductCategoryProductToCartTest();
    }

}
