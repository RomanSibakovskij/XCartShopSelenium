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


}
