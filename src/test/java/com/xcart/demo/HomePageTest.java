package com.xcart.demo;

import com.xcart.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods {

    //user navigation to 'Register' page test

    //Test 001 -> navigate user to 'Register' page test
    @Test
    @DisplayName("User Navigation To Register Page Test")
    @Tag("Navigate_To_Register_Page")
    void navigateUserToRegisterPageTest() {
        navigateToRegisterPageTest();
    }


}
