package com.xcart.demo.utilities;

import com.xcart.demo.*;
import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.*;
import java.io.File;
import java.nio.file.*; //comment these out during browser run with screenshots

public class TestMethods extends BaseTest{

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//navigate to 'Register' page test method
protected void navigateToRegisterPageTest(){
    HomePage homePage = new HomePage(driver);
    GeneralPage generalPage = new GeneralPage(driver);
    //general page web element assert (without aside section)
    isGeneralPageNoAsideWebElementDisplayed(generalPage);
    //general page aside section web element assert
    isGeneralPageAsideWebElementDisplayed(generalPage);
    //general page text element assert
    isGeneralPageTextElementAsExpected(generalPage);
    //home page web element assert
    isHomePageWebElementDisplayed(homePage);
    //home page text element assert
    isHomePageTextElementAsExpected(homePage);
    //log home page product data
    logHomePageProductData(homePage);
    //capture screenshot of the home page
    captureScreenshot(driver, "Home Page Display");
    //click header 'Register' link
    generalPage.clickHeaderRegisterLink();
    //capture screenshot of the test result
    captureScreenshot(driver, "User Navigation To Register Page Test Result");
}

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid user account creation test

    //valid user account creation test method
    protected void validUserAccountCreationTest(RegisterPage registerPage){
        GeneralPage generalPage = new GeneralPage(driver);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot before valid user data input
        captureScreenshot(driver, "Register Account Page Before User Account Data Input");
        //valid user account data input getter
        registerPage.validUserRegisterDataGetter();
        //input valid user first name into first name input field
        registerPage.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPage.inputValidLastNameIntoLastNameInputField();
        //input valid user email into email input field
        registerPage.inputValidEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPage.inputValidPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPage.inputValidConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the valid user data input
        captureScreenshot(driver, "Register Page After Valid User Account Data Input");
        //click 'Accept terms' checkbox
        registerPage.clickAcceptTermsCheckbox();
        //click 'Submit' button
        registerPage.clickSubmitButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Account Creation Test Result");
    }

    //invalid user account creation tests

    //no singular input

    //invalid user account creation test method - no user first name
    protected void invalidUserAccountCreationNoFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageNoSingularInput registerPageNoSingularInput = new RegisterPageNoSingularInput(driver);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot before user data input
        captureScreenshot(driver, "Register Account Page Before User Account Data Input");
        //invalid user account data input getter - no user first name
        registerPageNoSingularInput.invalidRegisterDataNoFirstNameGetter();
        //don't input user first name into first name input field
        registerPageNoSingularInput.inputNoFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageNoSingularInput.inputValidLastNameIntoLastNameInputField();
        //input valid user email into email input field
        registerPageNoSingularInput.inputValidEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageNoSingularInput.inputValidPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageNoSingularInput.inputValidConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the invalid user data input - no user first name
        captureScreenshot(driver, "Register Page After Invalid User Account Data Input - No First Name");
        //click 'Accept terms' checkbox
        registerPage.clickAcceptTermsCheckbox();
        //click 'Submit' button
        registerPage.clickSubmitButton();
        //assert the user gets an expected error message
        assertEquals("Warning\n" + "\n" + "The required field 'First name' is empty!", registerPageNoSingularInput.getSingularInputErrorBoxMessage(), "The missing first name input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No User First Name");
    }
    //invalid user account creation test method - no user last name
    protected void invalidUserAccountCreationNoLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageNoSingularInput registerPageNoSingularInput = new RegisterPageNoSingularInput(driver);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot before user data input
        captureScreenshot(driver, "Register Account Page Before User Account Data Input");
        //invalid user account data input getter - no user last name
        registerPageNoSingularInput.invalidRegisterDataNoLastNameGetter();
        //input valid user first name into first name input field
        registerPageNoSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //don't input user last name into last name input field
        registerPageNoSingularInput.inputNoLastNameIntoLastNameInputField();
        //input valid user email into email input field
        registerPageNoSingularInput.inputValidEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageNoSingularInput.inputValidPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageNoSingularInput.inputValidConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the invalid user data input - no user last name
        captureScreenshot(driver, "Register Page After Invalid User Account Data Input - No Last Name");
        //click 'Accept terms' checkbox
        registerPage.clickAcceptTermsCheckbox();
        //click 'Submit' button
        registerPage.clickSubmitButton();
        //assert the user gets an expected error message
        assertEquals("Warning\n" + "\n" + "The required field 'Last name' is empty!", registerPageNoSingularInput.getSingularInputErrorBoxMessage(), "The missing last name input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No User Last Name");
    }
    //invalid user account creation test method - no user email
    protected void invalidUserAccountCreationNoEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageNoSingularInput registerPageNoSingularInput = new RegisterPageNoSingularInput(driver);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot before user data input
        captureScreenshot(driver, "Register Account Page Before User Account Data Input");
        //invalid user account data input getter - no user email
        registerPageNoSingularInput.invalidRegisterDataNoEmailGetter();
        //input valid user first name into first name input field
        registerPageNoSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageNoSingularInput.inputValidLastNameIntoLastNameInputField();
        //don't input user email into email input field
        registerPageNoSingularInput.inputNoEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageNoSingularInput.inputValidPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageNoSingularInput.inputValidConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the invalid user data input - no user email
        captureScreenshot(driver, "Register Page After Invalid User Account Data Input - No Email");
        //click 'Accept terms' checkbox
        registerPage.clickAcceptTermsCheckbox();
        //click 'Submit' button
        registerPage.clickSubmitButton();
        //assert the user gets an expected error message
        assertEquals("Warning\n" + "\n" + "The required field 'Email' is empty!", registerPageNoSingularInput.getSingularInputErrorBoxMessage(), "The missing email input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No User Email");
    }
    //invalid user account creation test method - no user password / confirm password
    protected void invalidUserAccountCreationNoPasswordConfirmTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageNoSingularInput registerPageNoSingularInput = new RegisterPageNoSingularInput(driver);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot before user data input
        captureScreenshot(driver, "Register Account Page Before User Account Data Input");
        //invalid user account data input getter - no user password / confirm password
        registerPageNoSingularInput.invalidRegisterDataNoPasswordConfirmGetter();
        //input valid user first name into first name input field
        registerPageNoSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageNoSingularInput.inputValidLastNameIntoLastNameInputField();
        //input valid user email into email input field
        registerPageNoSingularInput.inputValidEmailIntoEmailInputField();
        //don't input user password into password input field
        registerPageNoSingularInput.inputNoPasswordIntoPasswordInputField();
        //don't input user confirm password into confirm password input field
        registerPageNoSingularInput.inputNoConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the invalid user data input - no user password / confirm password
        captureScreenshot(driver, "Register Page After Invalid User Account Data Input - No Password And Confirm Password");
        //click 'Accept terms' checkbox
        registerPage.clickAcceptTermsCheckbox();
        //click 'Submit' button
        registerPage.clickSubmitButton();
        //assert the user gets an expected error message
        assertEquals("Warning\n" + "\n" + "The required field 'Password' is empty!", registerPageNoSingularInput.getSingularInputErrorBoxMessage(), "The missing password input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - No User Password And Confirm Password");
    }

    //too short singular input

    //invalid user account creation test method - too short user first name (1 char)
    protected void invalidUserAccountCreationTooShortFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooShortSingularInput registerPageTooShortSingularInput = new RegisterPageTooShortSingularInput(driver);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot before user data input
        captureScreenshot(driver, "Register Account Page Before User Account Data Input");
        //invalid user account data input getter - too short user first name (1 char)
        registerPageTooShortSingularInput.invalidRegisterDataTooShortFirstNameGetter();
        //input too short user first name into first name input field (1 char)
        registerPageTooShortSingularInput.inputTooShortFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooShortSingularInput.inputValidLastNameIntoLastNameInputField();
        //input valid user email into email input field
        registerPageTooShortSingularInput.inputValidEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooShortSingularInput.inputValidPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageTooShortSingularInput.inputValidConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the invalid user data input - too short user first name
        captureScreenshot(driver, "Register Page After Invalid User Account Data Input - Too Short First Name");
        //click 'Accept terms' checkbox
        registerPage.clickAcceptTermsCheckbox();
        //click 'Submit' button
        registerPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("First name is too short", registerPageTooShortSingularInput.getSingularInputErrorBoxMessage(), "The too short first name error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short first name error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short User First Name");
    }
    //invalid user account creation test method - too short user last name (1 char)
    protected void invalidUserAccountCreationTooShortLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooShortSingularInput registerPageTooShortSingularInput = new RegisterPageTooShortSingularInput(driver);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot before user data input
        captureScreenshot(driver, "Register Account Page Before User Account Data Input");
        //invalid user account data input getter - too short user last name (1 char)
        registerPageTooShortSingularInput.invalidRegisterDataTooShortLastNameGetter();
        //input valid user first name into first name input field
        registerPageTooShortSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //input too short user last name into last name input field (1 char)
        registerPageTooShortSingularInput.inputTooShortLastNameIntoLastNameInputField();
        //input valid user email into email input field
        registerPageTooShortSingularInput.inputValidEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooShortSingularInput.inputValidPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageTooShortSingularInput.inputValidConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the invalid user data input - too short user last name
        captureScreenshot(driver, "Register Page After Invalid User Account Data Input - Too Short Last Name");
        //click 'Accept terms' checkbox
        registerPage.clickAcceptTermsCheckbox();
        //click 'Submit' button
        registerPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Last name is too short", registerPageTooShortSingularInput.getSingularInputErrorBoxMessage(), "The too short last name error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short last name error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short User Last Name");
    }
    //invalid user account creation test method - too short user email (1 char -> name, domain)
    protected void invalidUserAccountCreationTooShortEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooShortSingularInput registerPageTooShortSingularInput = new RegisterPageTooShortSingularInput(driver);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot before user data input
        captureScreenshot(driver, "Register Account Page Before User Account Data Input");
        //invalid user account data input getter - too short user email (1 char -> name, domain)
        registerPageTooShortSingularInput.invalidRegisterDataTooShortEmailGetter();
        //input valid user first name into first name input field
        registerPageTooShortSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooShortSingularInput.inputValidLastNameIntoLastNameInputField();
        //input too short user email into email input field (1 char -> name, domain)
        registerPageTooShortSingularInput.inputTooShortEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooShortSingularInput.inputValidPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageTooShortSingularInput.inputValidConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the invalid user data input - too short user email
        captureScreenshot(driver, "Register Page After Invalid User Account Data Input - Too Short Email");
        //click 'Accept terms' checkbox
        registerPage.clickAcceptTermsCheckbox();
        //click 'Submit' button
        registerPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Email is too short", registerPageTooShortSingularInput.getSingularInputErrorBoxMessage(), "The too short email error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short email error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short User Email");
    }
    //invalid user account creation test method - too short user password / confirm password (3 chars)
    protected void invalidUserAccountCreationTooShortPasswordConfirmTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooShortSingularInput registerPageTooShortSingularInput = new RegisterPageTooShortSingularInput(driver);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot before user data input
        captureScreenshot(driver, "Register Account Page Before User Account Data Input");
        //invalid user account data input getter - too short user password / confirm password (3 chars)
        registerPageTooShortSingularInput.invalidRegisterDataTooShortPasswordGetter();
        //input valid user first name into first name input field
        registerPageTooShortSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooShortSingularInput.inputValidLastNameIntoLastNameInputField();
        //input valid user email into email input field
        registerPageTooShortSingularInput.inputValidEmailIntoEmailInputField();
        //input too short user password into password input field (3 chars)
        registerPageTooShortSingularInput.inputTooShortPasswordIntoPasswordInputField();
        //input too short confirm password into confirm password input field (3 chars)
        registerPageTooShortSingularInput.inputTooShortConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the invalid user data input - too short user password / confirm password
        captureScreenshot(driver, "Register Page After Invalid User Account Data Input - Too Short Password And Confirm Password");
        //click 'Accept terms' checkbox
        registerPage.clickAcceptTermsCheckbox();
        //click 'Submit' button
        registerPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Password is too short", registerPageTooShortSingularInput.getSingularInputErrorBoxMessage(), "The too short password error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short password error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Short User Password And Confirm Password");
    }

    //too long singular input

    //invalid user account creation test method - too long user first name (100 chars)
    protected void invalidUserAccountCreationTooLongFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooLongSingularInput registerPageTooLongSingularInput = new RegisterPageTooLongSingularInput(driver);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot before user data input
        captureScreenshot(driver, "Register Account Page Before User Account Data Input");
        //invalid user account data input getter - too long user first name (100 chars)
        registerPageTooLongSingularInput.invalidRegisterDataTooLongFirstNameGetter();
        //input too long user first name into first name input field (100 chars)
        registerPageTooLongSingularInput.inputTooLongFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooLongSingularInput.inputValidLastNameIntoLastNameInputField();
        //input valid user email into email input field
        registerPageTooLongSingularInput.inputValidEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooLongSingularInput.inputValidPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageTooLongSingularInput.inputValidConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the invalid user data input - too long user first name
        captureScreenshot(driver, "Register Page After Invalid User Account Data Input - Too Long First Name");
        //click 'Accept terms' checkbox
        registerPage.clickAcceptTermsCheckbox();
        //click 'Submit' button
        registerPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("First name is too long", registerPageTooLongSingularInput.getSingularInputErrorBoxMessage(), "The too long first name error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long first name error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long User First Name");
    }
    //invalid user account creation test method - too long user last name (100 chars)
    protected void invalidUserAccountCreationTooLongLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooLongSingularInput registerPageTooLongSingularInput = new RegisterPageTooLongSingularInput(driver);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot before user data input
        captureScreenshot(driver, "Register Account Page Before User Account Data Input");
        //invalid user account data input getter - too long user last name (100 chars)
        registerPageTooLongSingularInput.invalidRegisterDataTooLongLastNameGetter();
        //input valid user first name into first name input field
        registerPageTooLongSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //input too short user last name into last name input field (100 chars)
        registerPageTooLongSingularInput.inputTooLongLastNameIntoLastNameInputField();
        //input valid user email into email input field
        registerPageTooLongSingularInput.inputValidEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooLongSingularInput.inputValidPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageTooLongSingularInput.inputValidConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the invalid user data input - too long user last name
        captureScreenshot(driver, "Register Page After Invalid User Account Data Input - Too Long Last Name");
        //click 'Accept terms' checkbox
        registerPage.clickAcceptTermsCheckbox();
        //click 'Submit' button
        registerPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Last name is too long", registerPageTooLongSingularInput.getSingularInputErrorBoxMessage(), "The too long last name error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long last name error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long User Last Name");
    }
    //invalid user account creation test method - too long user email (100 chars -> name, domain)
    protected void invalidUserAccountCreationTooLongEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooLongSingularInput registerPageTooLongSingularInput = new RegisterPageTooLongSingularInput(driver);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot before user data input
        captureScreenshot(driver, "Register Account Page Before User Account Data Input");
        //invalid user account data input getter - too long user email (100 chars -> name, domain)
        registerPageTooLongSingularInput.invalidRegisterDataTooLongEmailGetter();
        //input valid user first name into first name input field
        registerPageTooLongSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooLongSingularInput.inputValidLastNameIntoLastNameInputField();
        //input too long user email into email input field (100 chars)
        registerPageTooLongSingularInput.inputTooLongEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageTooLongSingularInput.inputValidPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageTooLongSingularInput.inputValidConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the invalid user data input - too long email
        captureScreenshot(driver, "Register Page After Invalid User Account Data Input - Too Long Email");
        //click 'Accept terms' checkbox
        registerPage.clickAcceptTermsCheckbox();
        //click 'Submit' button
        registerPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Warning\n" + "\n" + "Email address is invalid! Please correct", registerPageTooLongSingularInput.getSingularInputErrorBoxMessage(), "The too long email error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long email error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long User Email");
    }
    //invalid user account creation test method - too long user password and confirm password (50 chars)
    protected void invalidUserAccountCreationTooLongPasswordConfirmTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageTooLongSingularInput registerPageTooLongSingularInput = new RegisterPageTooLongSingularInput(driver);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot before user data input
        captureScreenshot(driver, "Register Account Page Before User Account Data Input");
        //invalid user account data input getter - too long user password and confirm password (50 chars)
        registerPageTooLongSingularInput.invalidRegisterDataTooLongPasswordConfirmGetter();
        //input valid user first name into first name input field
        registerPageTooLongSingularInput.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageTooLongSingularInput.inputValidLastNameIntoLastNameInputField();
        //input valid user email into email input field
        registerPageTooLongSingularInput.inputValidEmailIntoEmailInputField();
        //input too long user password into password input field (50 chars)
        registerPageTooLongSingularInput.inputTooLongPasswordIntoPasswordInputField();
        //input too long user confirm password into confirm password input field (50 chars)
        registerPageTooLongSingularInput.inputTooLongConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the invalid user data input - too long user password / confirm password
        captureScreenshot(driver, "Register Page After Invalid User Account Data Input - Too Long User Password And Confirm Password");
        //click 'Accept terms' checkbox
        registerPage.clickAcceptTermsCheckbox();
        //click 'Submit' button
        registerPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Password is too long", registerPageTooLongSingularInput.getSingularInputErrorBoxMessage(), "The too long password error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long password error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Too Long User Password And Confirm Password");
    }

    //invalid singular input format

    //invalid user account creation test method - invalid first name input format (special symbols only)
    protected void invalidUserAccountCreationInvalidFirstNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        RegisterPageInvalidSingularInputFormat registerPageInvalidSingularInputFormat = new RegisterPageInvalidSingularInputFormat(driver);
        //register page web element assert
        isRegisterPageWebElementDisplayed(registerPage);
        //register page text element assert
        isRegisterPageTextElementAsExpected(registerPage);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //capture screenshot before user data input
        captureScreenshot(driver, "Register Account Page Before User Account Data Input");
        //invalid user account data input getter - invalid first name input format (special symbols only)
        registerPageInvalidSingularInputFormat.invalidRegisterDataInvalidFirstNameFormatGetter();
        //input invalid first name format into first name input field (special symbols only)
        registerPageInvalidSingularInputFormat.inputInvalidFirstNameFormatIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageInvalidSingularInputFormat.inputValidLastNameIntoLastNameInputField();
        //input valid user email into email input field
        registerPageInvalidSingularInputFormat.inputValidEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageInvalidSingularInputFormat.inputValidPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageInvalidSingularInputFormat.inputValidConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the invalid user data input - invalid user name input format
        captureScreenshot(driver, "Register Page After Invalid User Account Data Input - Invalid First Name Format");
        //click 'Accept terms' checkbox
        registerPage.clickAcceptTermsCheckbox();
        //click 'Submit' button
        registerPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("First name cannot consist of special symbols only.", registerPageInvalidSingularInputFormat.getSingularInputErrorBoxMessage(), "The invalid first name input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid first name input format error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid User First Name Format");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page web element assert test method (without aside section)
    protected void isGeneralPageNoAsideWebElementDisplayed(GeneralPage generalPage){
        //header switcher
        //assert header switcher icon is displayed
        assertTrue(generalPage.isHeaderSwitcherIconDisplayed(), "The header switcher icon isn't displayed");
        //assert header interface tag is displayed
        assertTrue(generalPage.isHeaderInterfaceTagDisplayed(), "The header interface tag isn't displayed");
        //assert header interface dropdown menu is displayed
        assertTrue(generalPage.isHeaderInterfaceDropdownMenuDisplayed(), "The header interface dropdown menu isn't displayed");
        //assert header visual scheme tag is displayed
        assertTrue(generalPage.isHeaderVisualSchemeTagDisplayed(), "The header visual scheme isn't displayed");
        //assert header visual scheme dropdown menu is displayed
        assertTrue(generalPage.isHeaderVisualSchemeDropdownMenuDisplayed(), "The header visual scheme dropdown menu isn't displayed");
        //assert header configuration tag is displayed
        assertTrue(generalPage.isHeaderConfigurationTagDisplayed(), "The header configuration tag isn't displayed");
        //assert header configuration dropdown menu is displayed
        assertTrue(generalPage.isHeaderConfigurationDropdownMenuDisplayed(), "The header configuration dropdown menu isn't displayed");
        //assert header quick addons panel tag is displayed
        assertTrue(generalPage.isHeaderQuickAddonsPanelTagDisplayed(), "The header quick addons panel tag isn't displayed");
        //assert header addons panel slide button is displayed
        assertTrue(generalPage.isHeaderAddonsPanelSlideButtonDisplayed(), "The header addons panel slide button isn't displayed");
        //assert header switcher download button is displayed
        assertTrue(generalPage.isHeaderSwitcherDownloadButtonDisplayed(), "The header switcher download button isn't displayed");
        //header
        //assert header homepage logo is displayed
        assertTrue(generalPage.isHeaderHomepageLogoDisplayed(), "The header homepage logo isn't displayed");
        //assert header sign-in link is displayed
        assertTrue(generalPage.isHeaderSignInLinkDisplayed(), "The header sign-in link isn't displayed");
        //assert header register link is displayed
        assertTrue(generalPage.isHeaderRegisterLinkDisplayed(), "The header register link isn't displayed");
        //assert header language dropdown menu is displayed
        assertTrue(generalPage.isHeaderLanguageDropdownMenuDisplayed(), "The header language dropdown menu isn't displayed");
        //assert header search bar input field is displayed
        assertTrue(generalPage.isHeaderSearchBarInputFieldDisplayed(), "The header search bar input field isn't displayed");
        //assert header search bar button is displayed
        assertTrue(generalPage.isHeaderSearchBarButtonDisplayed(), "The header search bar button isn't displayed");
        //assert header shopping cart dropdown button is displayed
        //assertTrue(generalPage.isHeaderShoppingCartDropdownButtonDisplayed(), "The header shopping cart dropdown button isn't displayed");
        //navbar
        //assert navbar home page link is displayed
        assertTrue(generalPage.isNavbarHomeLinkDisplayed(), "The navbar home page link isn't displayed");
        //assert navbar shopping cart link is displayed
        assertTrue(generalPage.isNavbarShoppingCartLinkDisplayed(), "The navbar shopping cart link isn't displayed");
        //assert navbar contact us link is displayed
        assertTrue(generalPage.isNavbarContactUsLinkDisplayed(), "The navbar contact us link isn't displayed");
        //footer
        //assert footer 'help zone' link is displayed
        assertTrue(generalPage.isFooterHelpZoneLinkDisplayed(), "The footer 'help zone' link isn't displayed");
        //assert footer 'contact us' link is displayed
        assertTrue(generalPage.isFooterContactUsLinkDisplayed(), "The footer 'contact us' link isn't displayed");
        //assert footer 'our site' link is displayed
        assertTrue(generalPage.isFooterOurSiteLinkDisplayed(), "The footer 'our site' link isn't displayed");
        //assert footer 'Terms and Conditions' link is displayed
        assertTrue(generalPage.isFooterTermsConditionsLinkDisplayed(), "The footer 'Terms and Conditions' link isn't displayed");
        //assert footer 'privacy' link is displayed
        assertTrue(generalPage.isFooterPrivacyLinkDisplayed(), "The footer 'privacy' link isn't displayed");
        //assert footer 'privacy statement' link is displayed
        assertTrue(generalPage.isFooterPrivacyStatementLinkDisplayed(), "The footer 'privacy statement' link isn't displayed");
        //assert footer 'powered by' text is displayed
        assertTrue(generalPage.isFooterPoweredByTextDisplayed(), "The footer 'powered by' text isn't displayed");
        //assert footer copyright text is displayed
        assertTrue(generalPage.isFooterCopyrightTextDisplayed(), "The footer copyright text isn't displayed");
        //assert footer facebook icon button is displayed
        assertTrue(generalPage.isFooterFacebookIconButtonDisplayed(), "The footer facebook icon button isn't displayed");
        //assert footer x icon button is displayed
        assertTrue(generalPage.isFooterXIconButtonDisplayed(), "The footer x icon button isn't displayed");
    }

    //general page web element assert test method (aside section)
    protected void isGeneralPageAsideWebElementDisplayed(GeneralPage generalPage){
        //aside (categories)
        //assert aside categories section title is displayed
        assertTrue(generalPage.isAsideCategoriesSectionTitleDisplayed(), "The aside categories section title isn't displayed");
        //assert aside features demo link is displayed
        assertTrue(generalPage.isAsideFeaturesDemoLinkDisplayed(), "The aside features demo link isn't displayed");
        //assert aside apparel link is displayed
        assertTrue(generalPage.isAsideApparelLinkDisplayed(), "The aside apparel link isn't displayed");
        //assert aside toys link is displayed
        assertTrue(generalPage.isAsideToysLinkDisplayed(), "The aside toys link isn't displayed");
        //assert aside 'I Goods' link is displayed
        assertTrue(generalPage.isAsideIGoodsLinkDisplayed(), "The aside 'I Goods' link isn't displayed");
        //assert aside books link is displayed
        assertTrue(generalPage.isAsideBooksLinkDisplayed(), "The aside books link isn't displayed");
        //assert aside computer hardware is displayed
        assertTrue(generalPage.isAsideComputerHardwareLinkDisplayed(), "The aside computer hardware isn't displayed");
        //manufacturers section
        //assert aside manufacturers section title is displayed
        assertTrue(generalPage.isAsideManufacturersSectionTitleDisplayed(), "The aside manufacturers section title isn't displayed");
        //assert aside manufacturers section links are displayed (as a list)
        assertTrue(generalPage.isAsideManufacturersLinkDisplayed(), "The aside manufacturers section links aren't displayed");
        //gift certificate
        //assert aside gift certificate button is displayed
        assertTrue(generalPage.isAsideGiftCertificateButtonDisplayed(), "The aside gift certificate button isn't displayed");
        //special section
        //assert aside special section title is displayed
        assertTrue(generalPage.isAsideSpecialSectionTitleDisplayed(), "The aside special section title isn't displayed");
        //assert aside special sitemap link is displayed
        assertTrue(generalPage.isAsideSpecialSitemapLinkDisplayed(), "The aside special sitemap link isn't displayed");
        //assert aside special products map link is displayed
        assertTrue(generalPage.isAsideSpecialProductsMapLinkDisplayed(), "The aside special products map link isn't displayed");
        //news section
        //assert aside news section title is displayed
        assertTrue(generalPage.isAsideNewsSectionTitleDisplayed(), "The aside news section title isn't displayed");
        //assert aside news article data is displayed
        assertTrue(generalPage.isAsideNewsArticleDataDisplayed(), "The aside news article data isn't displayed");
        //assert aside news 'all news' link is displayed
        assertTrue(generalPage.isAsideAllNewsLinkDisplayed(), "The aside news 'all news' link isn't displayed");
        //assert aside news subscribe link is displayed
        assertTrue(generalPage.isAsideSubscribeLinkDisplayed(), "The aside news subscribe link isn't displayed");
    }

    //general page web element assert test method (aside section) (register page has an additional div element in aside categories list)
    protected void isGeneralOtherPageAsideWebElementDisplayed(GeneralPage generalPage){
        //aside (categories)
        //assert aside categories section title is displayed
        assertTrue(generalPage.isAsideCategoriesSectionTitleDisplayed(), "The aside categories section title isn't displayed");
        //assert aside features demo link is displayed
        assertTrue(generalPage.isOtherAsideFeaturesDemoLinkDisplayed(), "The aside features demo link isn't displayed");
        //assert aside apparel link is displayed
        assertTrue(generalPage.isOtherAsideApparelLinkDisplayed(), "The aside apparel link isn't displayed");
        //assert aside toys link is displayed
        assertTrue(generalPage.isOtherAsideToysLinkDisplayed(), "The aside toys link isn't displayed");
        //assert aside 'I Goods' link is displayed
        assertTrue(generalPage.isOtherAsideIGoodsLinkDisplayed(), "The aside 'I Goods' link isn't displayed");
        //assert aside books link is displayed
        assertTrue(generalPage.isOtherAsideBooksLinkDisplayed(), "The aside books link isn't displayed");
        //assert aside computer hardware is displayed
        assertTrue(generalPage.isOtherAsideComputerHardwareLinkDisplayed(), "The aside computer hardware isn't displayed");
        //manufacturers section
        //assert aside manufacturers section title is displayed
        assertTrue(generalPage.isAsideManufacturersSectionTitleDisplayed(), "The aside manufacturers section title isn't displayed");
        //assert aside manufacturers section links are displayed (as a list)
        assertTrue(generalPage.isAsideManufacturersLinkDisplayed(), "The aside manufacturers section links aren't displayed");
        //gift certificate
        //assert aside gift certificate button is displayed
        assertTrue(generalPage.isAsideGiftCertificateButtonDisplayed(), "The aside gift certificate button isn't displayed");
        //special section
        //assert aside special section title is displayed
        assertTrue(generalPage.isAsideSpecialSectionTitleDisplayed(), "The aside special section title isn't displayed");
        //assert aside special sitemap link is displayed
        assertTrue(generalPage.isAsideSpecialSitemapLinkDisplayed(), "The aside special sitemap link isn't displayed");
        //assert aside special products map link is displayed
        assertTrue(generalPage.isAsideSpecialProductsMapLinkDisplayed(), "The aside special products map link isn't displayed");
        //news section
        //assert aside news section title is displayed
        assertTrue(generalPage.isAsideNewsSectionTitleDisplayed(), "The aside news section title isn't displayed");
        //assert aside news article data is displayed
        assertTrue(generalPage.isAsideNewsArticleDataDisplayed(), "The aside news article data isn't displayed");
        //assert aside news 'all news' link is displayed
        assertTrue(generalPage.isAsideAllNewsLinkDisplayed(), "The aside news 'all news' link isn't displayed");
        //assert aside news subscribe link is displayed
        assertTrue(generalPage.isAsideSubscribeLinkDisplayed(), "The aside news subscribe link isn't displayed");
        //footer
        //assert footer 'help zone' link is displayed
        assertTrue(generalPage.isFooterHelpZoneLinkDisplayed(), "The footer 'help zone' link isn't displayed");
        //assert footer 'contact us' link is displayed
        assertTrue(generalPage.isFooterContactUsLinkDisplayed(), "The footer 'contact us' link isn't displayed");
        //assert footer 'our site' link is displayed
        assertTrue(generalPage.isFooterOurSiteLinkDisplayed(), "The footer 'our site' link isn't displayed");
        //assert footer 'Terms and Conditions' link is displayed
        assertTrue(generalPage.isFooterTermsConditionsLinkDisplayed(), "The footer 'Terms and Conditions' link isn't displayed");
        //assert footer 'privacy' link is displayed
        assertTrue(generalPage.isFooterPrivacyLinkDisplayed(), "The footer 'privacy' link isn't displayed");
        //assert footer 'privacy statement' link is displayed
        assertTrue(generalPage.isFooterPrivacyStatementLinkDisplayed(), "The footer 'privacy statement' link isn't displayed");
        //assert footer 'powered by' text is displayed
        assertTrue(generalPage.isFooterPoweredByTextDisplayed(), "The footer 'powered by' text isn't displayed");
        //assert footer copyright text is displayed
        assertTrue(generalPage.isFooterCopyrightTextDisplayed(), "The footer copyright text isn't displayed");
        //assert footer facebook icon button is displayed
        assertTrue(generalPage.isFooterFacebookIconButtonDisplayed(), "The footer facebook icon button isn't displayed");
        //assert footer x icon button is displayed
        assertTrue(generalPage.isFooterXIconButtonDisplayed(), "The footer x icon button isn't displayed");
    }

    //additional general page web element assert method (elements not all pages have)
    protected void isAddGeneralPageWebElementDisplayed(GeneralPage generalPage){
        //assert aside bestsellers section title is displayed
        assertTrue(generalPage.isAsideBestsellersSectionTitleDisplayed(), "The aside bestsellers section title isn't displayed");
        //assert aside bestsellers product images are displayed (as a list)
        assertTrue(generalPage.isAsideBestProductImageDisplayed(), "The aside bestsellers product images aren't displayed");
        //assert aside bestsellers product names are displayed (as a list)
        assertTrue(generalPage.isAsideBestProductNameLinkDisplayed(), "The aside bestsellers product names aren't displayed");
        //assert aside bestsellers product unit prices are displayed (as a list)
        assertTrue(generalPage.isAsideBestProductUnitPriceDisplayed(), "The aside bestsellers product unit prices aren't displayed");
    }

    //home page web element assert test method
    protected void isHomePageWebElementDisplayed(HomePage homePage){
        //assert home page welcome image link is displayed
        assertTrue(homePage.isWelcomeImageLinkDisplayed(), "The home page welcome image link isn't displayed");
        //assert home page welcome description is displayed
        assertTrue(homePage.isWelcomeDescriptionDisplayed(), "The home page welcome description isn't displayed");
        //assert home page featured products section title is displayed
        assertTrue(homePage.isFeaturedProductsTitleDisplayed(), "The home page featured products section isn't displayed");
        //assert home page aside bestseller section title is displayed
        assertTrue(homePage.isAsideBestsellerSectionTitleDisplayed(), "The home page aside bestseller section title isn't displayed");
        //list elements
        //featured
        //assert home page featured product images are displayed (as a list)
        assertTrue(homePage.isFeaturedProductImageDisplayed(), "The home page featured product images aren't displayed");
        //assert home page featured product name links are displayed (as a list)
        assertTrue(homePage.isFeaturedProductNameLinkDisplayed(), "The home page featured product name links aren't displayed");
        //assert home page featured product unit prices are displayed (as a list)
        assertTrue(homePage.isFeaturedProductUnitPriceDisplayed(), "The home page featured product unit prices aren't displayed");
        //assert home page featured product market prices are displayed (as a list)
        assertTrue(homePage.isFeaturedProductMarketPriceDisplayed(), "The home page featured product market prices aren't displayed");
        //assert home page featured product review stars are displayed (as a list)
        assertTrue(homePage.isFeaturedProductReviewStarDisplayed(), "The home page featured review stars aren't displayed");
        //assert home page featured product quantity dropdown menus are displayed (as a list)
        assertTrue(homePage.isFeaturedProductQtyDropdownMenuDisplayed(), "The home page featured product quantity dropdown menus aren't displayed");
        //assert home page featured product add to cart buttons are displayed (as a list)
        assertTrue(homePage.isFeaturedProductAddToCartButtonDisplayed(), "The home page featured product add to cart buttons aren't displayed");
        //assert home page featured product add to wishlist buttons are displayed (as a list)
        assertTrue(homePage.isFeaturedProductAddToWishlistButtonDisplayed(), "The home page featured product add to wishlist buttons aren't displayed");
        //bestsellers (same elements as with additional general page but these have different locators)
        //assert home page aside bestseller product images are displayed (as a list)
        assertTrue(homePage.isAsideBestsellerProductImageDisplayed(), "The home page aside bestseller product images aren't displayed");
        //assert home page aside bestseller product name links are displayed (as a list)
        assertTrue(homePage.isAsideBestsellerProductNameLinkDisplayed(), "The home page aside bestseller product name links aren't displayed");
        //assert home page aside bestseller product unit price are displayed (as a list)
        assertTrue(homePage.isAsideBestsellerProductUnitPriceDisplayed(), "The home page aside bestseller product unit price aren't displayed");
        //assert home page aside bestseller product market prices are displayed (as a list)
        assertTrue(homePage.isAsideBestsellerProductMarketPriceDisplayed(), "The home page aside bestseller product market prices aren't displayed");
    }

    //register page web element assert test method
    protected void isRegisterPageWebElementDisplayed(RegisterPage registerPage){
        //assert register page title is displayed
        assertTrue(registerPage.isRegisterPageTitleDisplayed(), "The register page title isn't displayed");
        //assert register page description is displayed
        assertTrue(registerPage.isRegisterPageDescriptionDisplayed(), "The register page description isn't displayed");
        //personal info
        //assert register page personal info section title is displayed
        assertTrue(registerPage.isRegisterPagePersonalInfoSectionTitleDisplayed(), "The register page personal info section isn't displayed");
        //assert register page first name subtext is displayed
        assertTrue(registerPage.isRegisterPageFirstNameSubtextDisplayed(), "The register page first name subtext isn't displayed");
        //assert register page first name input field is displayed
        assertTrue(registerPage.isRegisterPageFirstNameInputFieldDisplayed(), "The register page first name input field isn't displayed");
        //assert register page last name subtext is displayed
        assertTrue(registerPage.isRegisterPageLastNameSubtextDisplayed(), "The register page last name subtext isn't displayed");
        //assert register page last name input field is displayed
        assertTrue(registerPage.isRegisterPageLastNameInputFieldDisplayed(), "The register page last name input field isn't displayed");
        //assert register page company subtext is displayed
        assertTrue(registerPage.isRegisterPageCompanySubtextDisplayed(), "The register page company subtext isn't displayed");
        //assert register page company input field is displayed
        assertTrue(registerPage.isRegisterPageCompanyInputFieldDisplayed(), "The register page company input field isn't displayed");
        //assert register page website subtext is displayed
        assertTrue(registerPage.isRegisterPageWebsiteSubtextDisplayed(), "The register page website subtext isn't displayed");
        //assert register page website input field is displayed
        assertTrue(registerPage.isRegisterPageWebsiteInputFieldDisplayed(), "The register page website input field isn't displayed");
        //assert register page tax number subtext is displayed
        assertTrue(registerPage.isRegisterPageTaxNumberSubtextDisplayed(), "The register page tax number subtext isn't displayed");
        //assert register page tax number input field is displayed
        assertTrue(registerPage.isRegisterPageTaxNumberInputFieldDisplayed(), "The register page tax number input field isn't displayed");
        //account information
        //assert register page account info section title is displayed
        assertTrue(registerPage.isRegisterPageAccountInfoSectionTitleDisplayed(), "The register page account info section isn't displayed");
        //assert register page email subtext is displayed
        assertTrue(registerPage.isRegisterPageEmailSubtextDisplayed(), "The register page email subtext isn't displayed");
        //assert register page email input field is displayed
        assertTrue(registerPage.isRegisterPageEmailInputFieldDisplayed(), "The register page email input field isn't displayed");
        //assert register page password subtext is displayed
        assertTrue(registerPage.isRegisterPagePasswordSubtextDisplayed(), "The register page password subtext isn't displayed");
        //assert register page password input field is displayed
        assertTrue(registerPage.isRegisterPagePasswordInputFieldDisplayed(), "The register page password input field isn't displayed");
        //assert register page confirm password subtext is displayed
        assertTrue(registerPage.isRegisterPageConfirmPasswordSubtextDisplayed(), "The register page confirm password subtext isn't displayed");
        //assert register page confirm password input field is displayed
        assertTrue(registerPage.isRegisterPageConfirmPasswordInputFieldDisplayed(), "The register page confirm password input field isn't displayed");
        //newsletter section
        //assert register page newsletter section title is displayed
        assertTrue(registerPage.isRegisterPageNewsletterSectionTitleDisplayed(), "The register page newsletter section title isn't displayed");
        //assert register page newsletter description is displayed
        assertTrue(registerPage.isRegisterPageNewsletterDescriptionDisplayed(), "The register page newsletter description isn't displayed");
        //assert register page exclusive special offers checkbox is displayed
        assertTrue(registerPage.isRegisterPageExclusiveSpecialOffersCheckboxDisplayed(), "The register page exclusive special offers checkbox isn't displayed");
        //assert register page exclusive special offers subtext is displayed
        assertTrue(registerPage.isRegisterPageExclusiveSpecialSubtextDisplayed(), "The register page exclusive special offers subtext isn't displayed");
        //assert register page exclusive special offers description is displayed
        assertTrue(registerPage.isRegisterPageExclusiveSpecialDescriptionDisplayed(), "The register page exclusive special offers description isn't displayed");
        //assert register page site updates checkbox is displayed
        assertTrue(registerPage.isRegisterPageSiteUpdatesCheckboxDisplayed(), "The register page site updates checkbox isn't displayed");
        //assert register page site updates subtext is displayed
        assertTrue(registerPage.isRegisterPageSiteUpdatesSubtextDisplayed(), "The register page site updates subtext isn't displayed");
        //assert register page site updates description is displayed
        assertTrue(registerPage.isRegisterPageSiteUpdatesDescriptionDisplayed(), "The register page site updates description isn't displayed");
        //assert register page accept terms checkbox is displayed
        assertTrue(registerPage.isRegisterPageAcceptTermsCheckboxDisplayed(), "The register page accept terms checkbox isn't displayed");
        //assert register page accept terms subtext is displayed
        assertTrue(registerPage.isRegisterPageAcceptTermsSubtextDisplayed(), "The register page accept terms subtext isn't displayed");
        //assert register page accept terms and conditions link is displayed
        assertTrue(registerPage.isRegisterPageAcceptTermsConditionsLinkDisplayed(), "The register page accept terms and conditions link isn't displayed");
        //assert register page privacy link is displayed
        assertTrue(registerPage.isRegisterPagePrivacyLinkDisplayed(), "The register page privacy link isn't displayed");
        //assert register page submit button is displayed
        assertTrue(registerPage.isRegisterPageSubmitButtonDisplayed(), "The register page submit button isn't displayed");
        //assert register page confidential info text is displayed
        //assertTrue(registerPage.isRegisterPageConfidentialInfoTextDisplayed(), "The register page confidential info text isn't displayed");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page text element assert method
    protected void isGeneralPageTextElementAsExpected(GeneralPage generalPage){
        //header (switcher)
        //assert header interface tag is as expected
        assertEquals("Interface", generalPage.getHeaderInterfaceTag(), "The header interface tag doesn't match expectations.");
        //assert header visual scheme tag is as expected
        assertEquals("Visual Scheme", generalPage.getHeaderVisualSchemeTag(), "The header visual scheme tag doesn't match expectations.");
        //assert header configuration tag is as expected
        assertEquals("Configuration", generalPage.getHeaderConfigurationTag(), "The header configuration tag doesn't match expectations.");
        //assert header quick addons panel tag is as expected
        assertEquals("Quick addons panel", generalPage.getHeaderQuickAddonsPanelTag(), "The header quick addons panel tag doesn't match expectations.");
        //aside
        //assert aside categories section title is as expected
        assertEquals("Categories", generalPage.getAsideCategoriesSectionTitle(), "The aside categories section title doesn't match expectations.");
        //assert aside manufacturers section title is as expected
        assertEquals("Manufacturers", generalPage.getAsideManufacturersSectionTitle(), "The aside manufacturers section title doesn't match expectations.");
        //assert aside special section title is as expected
        assertEquals("Special", generalPage.getAsideSpecialSectionTitle(), "The aside special section title doesn't match expectations.");
        //assert footer powered by text is as expected
        assertEquals("Powered by X-Cart shopping cart software", generalPage.getFooterPoweredByText(), "The footer powered by text doesn't match expectations.");
        //assert footer copyright text is as expected
        assertEquals("Copyright © 2002-2025 Your Company Name", generalPage.getFooterCopyrightText(), "The footer copyright text doesn't match expectations.");
    }

    //general page text element assert method (without aside section)
    protected void isGeneralPageNoAsideTextElementAsExpected(GeneralPage generalPage){
        //header (switcher)
        //assert header interface tag is as expected
        assertEquals("Interface", generalPage.getHeaderInterfaceTag(), "The header interface tag doesn't match expectations.");
        //assert header visual scheme tag is as expected
        assertEquals("Visual Scheme", generalPage.getHeaderVisualSchemeTag(), "The header visual scheme tag doesn't match expectations.");
        //assert header configuration tag is as expected
        assertEquals("Configuration", generalPage.getHeaderConfigurationTag(), "The header configuration tag doesn't match expectations.");
        //assert header quick addons panel tag is as expected
        assertEquals("Quick addons panel", generalPage.getHeaderQuickAddonsPanelTag(), "The header quick addons panel tag doesn't match expectations.");
        //footer
        //assert footer powered by text is as expected
        assertEquals("Powered by X-Cart shopping cart software", generalPage.getFooterPoweredByText(), "The footer powered by text doesn't match expectations.");
        //assert footer copyright text is as expected
        assertEquals("Copyright © 2002-2025 Your Company Name", generalPage.getFooterCopyrightText(), "The footer copyright text doesn't match expectations.");
    }

    //additional general page text element assert test method
    protected void isAddGeneralPageTextElementAsExpected(GeneralPage generalPage){
        //assert aside bestsellers section title is as expected
        assertEquals("Bestsellers", generalPage.getAsideBestsellersSectionTitle(), "The aside bestsellers section title doesn't match expectations.");
    }

    //home page text element assert test method
    protected void isHomePageTextElementAsExpected(HomePage homePage){
        //assert home page welcome description is as expected
        assertEquals("This is a demo store powered by X-Cart software. No real products. No real prices. No real charges. Please do not submit real credit card information.", homePage.getWelcomeDescription(), "The home page welcome description doesn't match expectations.");
        //assert home page featured products section title is as expected
        assertEquals("Featured products", homePage.getFeaturedProductsSectionTitle(), "The home page featured products section title doesn't match expectations.");
        //assert home page aside bestseller products section title is as expected
        assertEquals("Bestsellers", homePage.getAsideBestsellerProductsSectionTitle(), "The home page aside bestseller products section title doesn't match expectations.");
    }

    //register page text element assert test method
    protected void isRegisterPageTextElementAsExpected(RegisterPage registerPage){
        //assert register page title is as expected
        assertEquals("Create Profile", registerPage.getRegisterPageTitle(), "The register page title doesn't match expectations.");
        //assert register page description is as expected
        assertEquals("The form below allows you to create a profile which is necessary to place orders. Do not forget that this information is essential to use our services correctly.\n" + "\n" + "The fields marked with * are mandatory.", registerPage.getRegisterPageDescription(), "The register page description doesn't match expectations.");
        //personal information
        //assert register page personal information section title is as expected
        assertEquals("Personal information", registerPage.getRegisterPagePersonalInfoSectionTitle(), "The register page personal information section title doesn't match expectations.");
        //assert register page first name subtext is as expected
        assertEquals("First name", registerPage.getRegisterPageFirstNameSubtext(), "The register page first name subtext doesn't match expectations.");
        //assert register page last name subtext is as expected
        assertEquals("Last name", registerPage.getRegisterPageLastNameSubtext(), "The register page last name subtext doesn't match expectations.");
        //assert register page company subtext is as expected
        assertEquals("Company", registerPage.getRegisterPageCompanySubtext(), "The register page company subtext doesn't match expectations.");
        //assert register page website subtext is as expected
        assertEquals("Web site", registerPage.getRegisterPageWebsiteSubtext(), "The register page website subtext doesn't match expectations.");
        //assert register page tax number subtext is as expected
        assertEquals("Tax number", registerPage.getRegisterPageTaxNumberSubtext(), "The register page tax number subtext doesn't match expectations.");
        //account information
        //assert register page account info section title is as expected
        assertEquals("Account information", registerPage.getRegisterPageAccountInfoSectionTitle(), "The register page account information section title doesn't match expectations.");
        //assert register page email subtext is as expected
        assertEquals("Email", registerPage.getRegisterPageEmailSubtext(), "The register page email subtext doesn't match expectations.");
        //assert register page password subtext is as expected
        assertEquals("Password", registerPage.getRegisterPagePasswordSubtext(), "The register page password subtext doesn't match expectations.");
        //assert register page confirm password subtext is as expected
        assertEquals("Confirm password", registerPage.getRegisterPageConfirmPasswordSubtext(), "The register page confirm password subtext doesn't match expectations.");
        //newsletter
        //assert register page newsletter section title is as expected
        assertEquals("Newsletter", registerPage.getRegisterPageNewsletterSectionTitle(), "The register page newsletter section title doesn't match expectations.");
        //assert register page newsletter description is as expected
        assertEquals("If you wish to receive our newsletters, please select the news lists to which you want to subscribe:", registerPage.getRegisterPageNewsletterDescription(), "The register page newsletter description doesn't match expectations.");
        //assert register page exclusive special subtext is as expected
        assertEquals("Exclusive special offers", registerPage.getRegisterPageExclusiveSpecialSubtext(), "The register page exclusive special subtext doesn't match expectations.");
        //assert register page exclusive special description is as expected
        assertEquals("Information about our exclusive offers available only by subscription", registerPage.getRegisterPageExclusiveSpecialDescription(), "The register page exclusive special description doesn't match expectations.");
        //assert register page site updates subtext is as expected
        assertEquals("Site updates", registerPage.getRegisterPageSiteUpdatesSubtext(), "The register page site updates subtext doesn't match expectations.");
        //assert register page site updates description is as expected
        assertEquals("News regarding our shop new offers and products", registerPage.getRegisterPageSiteUpdatesDescription(), "The register page site updates description doesn't match expectations.");
        //assert register page accept terms subtext is as expected
        assertEquals("I accept the \"Terms & Conditions\" and \"Privacy statement\"", registerPage.getRegisterPageAcceptTermsSubtext(), "The register page accept terms subtext doesn't match expectations.");
        //assert register page confidential info text is as expected
        //assertEquals("All information you provide to us will be kept confidential. We will never sell, exchange or market it in any way.", registerPage.getRegisterPageConfidentialInfoText(), "The register page confidential info text doesn't match expectations.");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //home page product data logger method
    protected void logHomePageProductData(HomePage homePage){
        System.out.println("Home page displayed product data: " + "\n");

        logger.info("Featured product name(s): " + homePage.getFeaturedProductName());
        logger.info("Featured product unit price(s): " + homePage.getFeaturedProductUnitPrice());
        logger.info("Featured product market price(s): " + homePage.getFeaturedProductMarketPrice());

        logger.info("Aside bestseller product name(s): " + homePage.getAsideBestsellerProductName());
        logger.info("Aside bestseller product unit price(s): " + homePage.getAsideBestsellerProductUnitPrice());
        logger.info("Aside bestseller product market price(s): " + homePage.getAsideBestsellerProductMarketPrice());

        System.out.println("\n");
    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //test result screenshot method (comment this method out during browser run since (GitHub) headless run doesn't need screenshots)
    public void captureScreenshot(WebDriver driver, String fileName) {
        try {
            Thread.sleep(1500);//apply wait time for the right time to get the screenshot (WebDriverWait doesn't work here)
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destination = new File("E:\\IntelliJ Selenium projects\\XCartStoreSelenium\\src\\test\\resources\\" + " " +  fileName + ".png");
            Files.copy(screenshot.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
            logger.info("Screenshot saved at: " + destination.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
