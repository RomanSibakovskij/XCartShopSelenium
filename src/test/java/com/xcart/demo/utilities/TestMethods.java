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
    //invalid user account creation test method - invalid last name input format (special symbols only)
    protected void invalidUserAccountCreationInvalidLastNameFormatTest(){
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
        //invalid user account data input getter - invalid last name input format (special symbols only)
        registerPageInvalidSingularInputFormat.invalidRegisterDataInvalidLastNameFormatGetter();
        //input valid user first name into first name input field
        registerPageInvalidSingularInputFormat.inputValidFirstNameIntoFirstNameInputField();
        //input invalid user last name format into last name input field (special symbols only)
        registerPageInvalidSingularInputFormat.inputInvalidLastNameFormatIntoLastNameInputField();
        //input valid user email into email input field
        registerPageInvalidSingularInputFormat.inputValidEmailIntoEmailInputField();
        //input valid user password into password input field
        registerPageInvalidSingularInputFormat.inputValidPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageInvalidSingularInputFormat.inputValidConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the invalid user data input - invalid user last name input format
        captureScreenshot(driver, "Register Page After Invalid User Account Data Input - Invalid Last Name Format");
        //click 'Accept terms' checkbox
        registerPage.clickAcceptTermsCheckbox();
        //click 'Submit' button
        registerPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Last name cannot consist of special symbols only.", registerPageInvalidSingularInputFormat.getSingularInputErrorBoxMessage(), "The invalid last name input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid last name input format error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid User Last Name Format");
    }
    //invalid user account creation test method - invalid email input format (missing '@')
    protected void invalidUserAccountCreationInvalidEmailFormatTest(){
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
        //invalid user account data input getter - invalid email input format (missing '@')
        registerPageInvalidSingularInputFormat.invalidRegisterDataInvalidEmailFormatGetter();
        //input valid user first name into first name input field
        registerPageInvalidSingularInputFormat.inputValidFirstNameIntoFirstNameInputField();
        //input valid user last name into last name input field
        registerPageInvalidSingularInputFormat.inputValidLastNameIntoLastNameInputField();
        //input invalid user email format into email input field (missing '@')
        registerPageInvalidSingularInputFormat.inputInvalidEmailIntoFormatEmailInputField();
        //input valid user password into password input field
        registerPageInvalidSingularInputFormat.inputValidPasswordIntoPasswordInputField();
        //input valid user confirm password into confirm password input field
        registerPageInvalidSingularInputFormat.inputValidConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the invalid user data input - invalid email input format
        captureScreenshot(driver, "Register Page After Invalid User Account Data Input - Invalid Email Format");
        //click 'Accept terms' checkbox
        registerPage.clickAcceptTermsCheckbox();
        //click 'Submit' button
        registerPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Warning\n" + "\n" + "Email address is invalid! Please correct", registerPageInvalidSingularInputFormat.getSingularInputErrorBoxMessage(), "The invalid email input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid email input format error wasn't triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Creation Test Result - Invalid User Email Format");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid edit user account tests

    //valid edit user account data (with email) test method
    protected void validEditUserAccountTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);
        //general page web element assert
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Account Details' link
        accountPage.clickAccountDetailsLink();
        //capture screenshot of the account details page before data input
        captureScreenshot(driver, "Account Details Page Display Before Data Input");
        //account details page web element assert
        isAccountDetailsPageWebElementDisplayed(accountDetailsPage);
        //account details text element assert
        isAccountDetailsPageTextElementAsExpected(accountDetailsPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //valid edited user account data getter
        accountDetailsPage.validEditedUserDataGetter(registerPage);
        //input valid edited first name into first name input field
        accountDetailsPage.inputValidEditedFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountDetailsPage.inputValidEditedLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountDetailsPage.inputValidEditedEmailIntoEmailInputField();
        //capture screenshot of the account details page after valid edited data input
        captureScreenshot(driver, "Account Details Page Display After Valid Edited Data Input");
        //click 'Submit' button
        accountDetailsPage.clickSubmitButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid Edit User Account (With User Email) Test Result");
    }
    //valid edit user account data (with login password) test method (the test throws 403 error)
    protected void validEditUserAccountPasswordTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Account Details' link
        accountPage.clickAccountDetailsLink();
        //capture screenshot of the account details page before data input
        captureScreenshot(driver, "Account Details Page Display Before Data Input");
        //account details page web element assert
        isAccountDetailsPageWebElementDisplayed(accountDetailsPage);
        //account details text element assert
        isAccountDetailsPageTextElementAsExpected(accountDetailsPage);
        //valid edited user account data getter
        accountDetailsPage.validEditedUserDataGetter(registerPage);
        //input valid edited first name into first name input field
        accountDetailsPage.inputValidEditedFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountDetailsPage.inputValidEditedLastNameIntoLastNameInputField();
        //click 'Change Password' link
        accountDetailsPage.clickChangePasswordLink();
        //capture screenshot of the change password form before data input
        captureScreenshot(driver, "Account Details Page Change Password Form Display Before Data Input");
        //change password form web element assert
        isChangePasswordFormWebElementDisplayed(accountDetailsPage);
        //change password for text element assert
        isChangePasswordFormTextElementAsExpected(accountDetailsPage);
        //input valid old password into old password input field
        accountDetailsPage.inputValidOldPasswordIntoOldPasswordInputField();
        //input valid new password into new password input field
        accountDetailsPage.inputValidNewPasswordIntoNewPasswordInputField();
        //input matching confirm password into confirm password input field
        accountDetailsPage.inputValidConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of the account details page after valid edited data input
        captureScreenshot(driver, "Account Details Page Change Password Form Display After Valid New Password Input");
        //click 'Submit' button (change password form)
        accountDetailsPage.clickSubmitNewPasswordButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad();
        //assert the user gets an expected error (since this operation is disabled on demo)
        assertEquals("403\n" + "Permission denied\n" + "Sorry, this operation is disabled on the demo.", accountPage.getAccountErrorBlockMessage(), "The account error block message doesn't match expectations.");
        logger.error("The user account operation is disabled on the demo (user password change test).");
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid Edit User Account Password Test Result");
    }

    //invalid edit user account tests (password edit negative testing is being postponed, since its edit throws 403 on demo)

    //no singular input

    //invalid edit user account data test method - no user first name
    protected void invalidEditUserAccountNoFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AccountPageNoSingularInput accountPageNoSingularInput = new AccountPageNoSingularInput(driver);
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);
        //general page web element assert
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Account Details' link
        accountPage.clickAccountDetailsLink();
        //capture screenshot of the account details page before data input
        captureScreenshot(driver, "Account Details Page Display Before Data Input");
        //account details page web element assert
        isAccountDetailsPageWebElementDisplayed(accountDetailsPage);
        //account details text element assert
        isAccountDetailsPageTextElementAsExpected(accountDetailsPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //invalid edited user account data getter - no user first name
        accountPageNoSingularInput.invalidEditedUserDataNoFirstNameGetter();
        //don't input edited first name into first name input field
        accountPageNoSingularInput.inputNoEditedFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountPageNoSingularInput.inputValidEditedLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountPageNoSingularInput.inputValidEditedEmailIntoEmailInputField();
        //capture screenshot of the account details page after invalid edited data input - no edited first name
        captureScreenshot(driver, "Account Details Page Display After Invalid Edited Data Input - No First Name");
        //click 'Submit' button
        accountDetailsPage.clickSubmitButton();
        //assert the user gets an expected error message
        assertEquals("Warning\n" + "\n" + "The required field 'First name' is empty!", accountPageNoSingularInput.getSingularInputErrorBoxMessage(), "The missing first name input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - No First Name");
    }
    //invalid edit user account data test method - no user last name
    protected void invalidEditUserAccountNoLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AccountPageNoSingularInput accountPageNoSingularInput = new AccountPageNoSingularInput(driver);
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);
        //general page web element assert
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Account Details' link
        accountPage.clickAccountDetailsLink();
        //capture screenshot of the account details page before data input
        captureScreenshot(driver, "Account Details Page Display Before Data Input");
        //account details page web element assert
        isAccountDetailsPageWebElementDisplayed(accountDetailsPage);
        //account details text element assert
        isAccountDetailsPageTextElementAsExpected(accountDetailsPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //invalid edited user account data getter - no user last name
        accountPageNoSingularInput.invalidEditedUserDataNoLastNameGetter();
        //input valid edited first name into first name input field
        accountPageNoSingularInput.inputValidEditedFirstNameIntoFirstNameInputField();
        //don't input edited last name into last name input field
        accountPageNoSingularInput.inputNoEditedLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountPageNoSingularInput.inputValidEditedEmailIntoEmailInputField();
        //capture screenshot of the account details page after invalid edited data input - no edited last name
        captureScreenshot(driver, "Account Details Page Display After Invalid Edited Data Input - No Last Name");
        //click 'Submit' button
        accountDetailsPage.clickSubmitButton();
        //assert the user gets an expected error message
        assertEquals("Warning\n" + "\n" + "The required field 'Last name' is empty!", accountPageNoSingularInput.getSingularInputErrorBoxMessage(), "The missing last name input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - No Last Name");
    }
    //invalid edit user account data test method - no user email
    protected void invalidEditUserAccountNoEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AccountPageNoSingularInput accountPageNoSingularInput = new AccountPageNoSingularInput(driver);
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);
        //general page web element assert
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Account Details' link
        accountPage.clickAccountDetailsLink();
        //capture screenshot of the account details page before data input
        captureScreenshot(driver, "Account Details Page Display Before Data Input");
        //account details page web element assert
        isAccountDetailsPageWebElementDisplayed(accountDetailsPage);
        //account details text element assert
        isAccountDetailsPageTextElementAsExpected(accountDetailsPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //invalid edited user account data getter - no user email
        accountPageNoSingularInput.invalidEditedUserDataNoEmailGetter();
        //input valid edited first name into first name input field
        accountPageNoSingularInput.inputValidEditedFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountPageNoSingularInput.inputValidEditedLastNameIntoLastNameInputField();
        //don't input edited email into email input field
        accountPageNoSingularInput.inputNoEditedEmailIntoEmailInputField();
        //capture screenshot of the account details page after invalid edited data input - no edited email
        captureScreenshot(driver, "Account Details Page Display After Invalid Edited Data Input - No Email");
        //click 'Submit' button
        accountDetailsPage.clickSubmitButton();
        //assert the user gets an expected error message
        assertEquals("Warning\n" + "\n" + "The required field 'Email' is empty!", accountPageNoSingularInput.getSingularInputErrorBoxMessage(), "The missing email input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - No Email");
    }

    //too short singular input

    //invalid edit user account data test method - too short user first name (1 char)
    protected void invalidEditUserAccountTooShortFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AccountPageTooShortSingularInput accountPageTooShortSingularInput = new AccountPageTooShortSingularInput(driver);
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);
        //general page web element assert
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Account Details' link
        accountPage.clickAccountDetailsLink();
        //capture screenshot of the account details page before data input
        captureScreenshot(driver, "Account Details Page Display Before Data Input");
        //account details page web element assert
        isAccountDetailsPageWebElementDisplayed(accountDetailsPage);
        //account details text element assert
        isAccountDetailsPageTextElementAsExpected(accountDetailsPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //invalid edited user account data getter - too short user first name (1 char)
        accountPageTooShortSingularInput.invalidEditedUserDataTooShortFirstNameGetter();
        //input too short edited first name into first name input field (1 char)
        accountPageTooShortSingularInput.inputTooShortEditedFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountPageTooShortSingularInput.inputValidEditedLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountPageTooShortSingularInput.inputValidEditedEmailIntoEmailInputField();
        //capture screenshot of the account details page after invalid edited data input - too short edited first name
        captureScreenshot(driver, "Account Details Page Display After Invalid Edited Data Input - Too Short First Name");
        //click 'Submit' button
        accountDetailsPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("First name is too short!", accountPageTooShortSingularInput.getSingularInputErrorBoxMessage(), "The too short first name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short first name error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Too Short First Name");
    }
    //invalid edit user account data test method - too short user last name (1 char)
    protected void invalidEditUserAccountTooShortLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AccountPageTooShortSingularInput accountPageTooShortSingularInput = new AccountPageTooShortSingularInput(driver);
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);
        //general page web element assert
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Account Details' link
        accountPage.clickAccountDetailsLink();
        //capture screenshot of the account details page before data input
        captureScreenshot(driver, "Account Details Page Display Before Data Input");
        //account details page web element assert
        isAccountDetailsPageWebElementDisplayed(accountDetailsPage);
        //account details text element assert
        isAccountDetailsPageTextElementAsExpected(accountDetailsPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //invalid edited user account data getter - too short user last name (1 char)
        accountPageTooShortSingularInput.invalidEditedUserDataTooShortLastNameGetter();
        //input valid edited first name into first name input field
        accountPageTooShortSingularInput.inputValidEditedFirstNameIntoFirstNameInputField();
        //input too short edited last name into last name input field (1 char)
        accountPageTooShortSingularInput.inputTooShortEditedLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountPageTooShortSingularInput.inputValidEditedEmailIntoEmailInputField();
        //capture screenshot of the account details page after invalid edited data input - too short edited last name
        captureScreenshot(driver, "Account Details Page Display After Invalid Edited Data Input - Too Short Last Name");
        //click 'Submit' button
        accountDetailsPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Last name is too short!", accountPageTooShortSingularInput.getSingularInputErrorBoxMessage(), "The too short last name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short last name error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Too Short Last Name");
    }
    //invalid edit user account data test method - too short user email (1 char -> name, domain)
    protected void invalidEditUserAccountTooShortEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AccountPageTooShortSingularInput accountPageTooShortSingularInput = new AccountPageTooShortSingularInput(driver);
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);
        //general page web element assert
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Account Details' link
        accountPage.clickAccountDetailsLink();
        //capture screenshot of the account details page before data input
        captureScreenshot(driver, "Account Details Page Display Before Data Input");
        //account details page web element assert
        isAccountDetailsPageWebElementDisplayed(accountDetailsPage);
        //account details text element assert
        isAccountDetailsPageTextElementAsExpected(accountDetailsPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //invalid edited user account data getter - too short user email (1 char)
        accountPageTooShortSingularInput.invalidEditedUserDataTooShortEmailGetter();
        //input valid edited first name into first name input field
        accountPageTooShortSingularInput.inputValidEditedFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountPageTooShortSingularInput.inputValidEditedLastNameIntoLastNameInputField();
        //input too short edited email into email input field (1 char -> name, domain)
        accountPageTooShortSingularInput.inputTooShortEditedEmailIntoEmailInputField();
        //capture screenshot of the account details page after invalid edited data input - too short edited email
        captureScreenshot(driver, "Account Details Page Display After Invalid Edited Data Input - Too Short Email");
        //click 'Submit' button
        accountDetailsPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Warning\n" + "\n" + "Email is invalid!", accountPageTooShortSingularInput.getSingularInputErrorBoxMessage(), "The too short email input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short email error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Too Short Email");
    }

    //too long singular input

    //invalid edit user account data test method - too long user first name (100 chars)
    protected void invalidEditUserAccountTooLongFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AccountPageTooLongSingularInput accountPageTooLongSingularInput = new AccountPageTooLongSingularInput(driver);
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);
        //general page web element assert
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Account Details' link
        accountPage.clickAccountDetailsLink();
        //capture screenshot of the account details page before data input
        captureScreenshot(driver, "Account Details Page Display Before Data Input");
        //account details page web element assert
        isAccountDetailsPageWebElementDisplayed(accountDetailsPage);
        //account details text element assert
        isAccountDetailsPageTextElementAsExpected(accountDetailsPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //invalid edited user account data getter - too long user first name (100 chars)
        accountPageTooLongSingularInput.invalidEditedUserDataTooLongFirstNameGetter();
        //input too long edited first name into first name input field (100 chars)
        accountPageTooLongSingularInput.inputTooLongEditedFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountPageTooLongSingularInput.inputValidEditedLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountPageTooLongSingularInput.inputValidEditedEmailIntoEmailInputField();
        //capture screenshot of the account details page after invalid edited data input - too long edited first name
        captureScreenshot(driver, "Account Details Page Display After Invalid Edited Data Input - Too Long First Name");
        //click 'Submit' button
        accountDetailsPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("First name is too long!", accountPageTooLongSingularInput.getSingularInputErrorBoxMessage(), "The too long first name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long first name error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Too Long First Name");
    }
    //invalid edit user account data test method - too long user last name (100 chars)
    protected void invalidEditUserAccountTooLongLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AccountPageTooLongSingularInput accountPageTooLongSingularInput = new AccountPageTooLongSingularInput(driver);
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);
        //general page web element assert
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Account Details' link
        accountPage.clickAccountDetailsLink();
        //capture screenshot of the account details page before data input
        captureScreenshot(driver, "Account Details Page Display Before Data Input");
        //account details page web element assert
        isAccountDetailsPageWebElementDisplayed(accountDetailsPage);
        //account details text element assert
        isAccountDetailsPageTextElementAsExpected(accountDetailsPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //invalid edited user account data getter - too long user last name (100 chars)
        accountPageTooLongSingularInput.invalidEditedUserDataTooLongLastNameGetter();
        //input valid edited first name into first name input field
        accountPageTooLongSingularInput.inputValidEditedFirstNameIntoFirstNameInputField();
        //input too long edited last name into last name input field (100 chars)
        accountPageTooLongSingularInput.inputTooLongEditedLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountPageTooLongSingularInput.inputValidEditedEmailIntoEmailInputField();
        //capture screenshot of the account details page after invalid edited data input - too long edited last name
        captureScreenshot(driver, "Account Details Page Display After Invalid Edited Data Input - Too Long Last Name");
        //click 'Submit' button
        accountDetailsPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Last name is too long!", accountPageTooLongSingularInput.getSingularInputErrorBoxMessage(), "The too long last name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long last name error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Too Long Last Name");
    }
    //invalid edit user account data test method - too long user email (100 chars -> name, domain)
    protected void invalidEditUserAccountTooLongEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AccountPageTooLongSingularInput accountPageTooLongSingularInput = new AccountPageTooLongSingularInput(driver);
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);
        //general page web element assert
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Account Details' link
        accountPage.clickAccountDetailsLink();
        //capture screenshot of the account details page before data input
        captureScreenshot(driver, "Account Details Page Display Before Data Input");
        //account details page web element assert
        isAccountDetailsPageWebElementDisplayed(accountDetailsPage);
        //account details text element assert
        isAccountDetailsPageTextElementAsExpected(accountDetailsPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //invalid edited user account data getter - too long user email (100 chars)
        accountPageTooLongSingularInput.invalidEditedUserDataTooLongEmailGetter();
        //input valid edited first name into first name input field
        accountPageTooLongSingularInput.inputValidEditedFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountPageTooLongSingularInput.inputValidEditedLastNameIntoLastNameInputField();
        //input too long edited email into email input field (100 chars -> name, domain)
        accountPageTooLongSingularInput.inputTooLongEditedEmailIntoEmailInputField();
        //capture screenshot of the account details page after invalid edited data input - too long edited email
        captureScreenshot(driver, "Account Details Page Display After Invalid Edited Data Input - Too Long Email");
        //click 'Submit' button
        accountDetailsPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Warning\n" + "\n" + "Email address is invalid! Please correct", accountPageTooLongSingularInput.getSingularInputErrorBoxMessage(), "The too long email input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long email error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Too Long Email");
    }

    //invalid singular input format

    //invalid edit user account data test method - invalid user first name format (special symbols only)
    protected void invalidEditUserAccountInvalidFirstNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AccountPageInvalidSingularInputFormat accountPageInvalidSingularInputFormat = new AccountPageInvalidSingularInputFormat(driver);
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);
        //general page web element assert
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Account Details' link
        accountPage.clickAccountDetailsLink();
        //capture screenshot of the account details page before data input
        captureScreenshot(driver, "Account Details Page Display Before Data Input");
        //account details page web element assert
        isAccountDetailsPageWebElementDisplayed(accountDetailsPage);
        //account details text element assert
        isAccountDetailsPageTextElementAsExpected(accountDetailsPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //invalid edited user account data getter - invalid user first name format (special symbols only)
        accountPageInvalidSingularInputFormat.invalidEditedUserDataInvalidFirstNameFormatGetter();
        //input invalid edited first name format into first name input field (special symbols only)
        accountPageInvalidSingularInputFormat.inputInvalidEditedFirstNameFormatIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountPageInvalidSingularInputFormat.inputValidEditedLastNameIntoLastNameInputField();
        //input valid edited email into email input field
        accountPageInvalidSingularInputFormat.inputValidEditedEmailIntoEmailInputField();
        //capture screenshot of the account details page after invalid edited data input - invalid first name format
        captureScreenshot(driver, "Account Details Page Display After Invalid Edited Data Input - Invalid First Name Format");
        //click 'Submit' button
        accountDetailsPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("First name cannot consist of special symbols only", accountPageInvalidSingularInputFormat.getSingularInputErrorBoxMessage(), "The invalid first name input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid first name input format error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Invalid First Name Format");
    }
    //invalid edit user account data test method - invalid user last name format (special symbols only)
    protected void invalidEditUserAccountInvalidLastNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AccountPageInvalidSingularInputFormat accountPageInvalidSingularInputFormat = new AccountPageInvalidSingularInputFormat(driver);
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);
        //general page web element assert
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Account Details' link
        accountPage.clickAccountDetailsLink();
        //capture screenshot of the account details page before data input
        captureScreenshot(driver, "Account Details Page Display Before Data Input");
        //account details page web element assert
        isAccountDetailsPageWebElementDisplayed(accountDetailsPage);
        //account details text element assert
        isAccountDetailsPageTextElementAsExpected(accountDetailsPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //invalid edited user account data getter - invalid user last name format (special symbols only)
        accountPageInvalidSingularInputFormat.invalidEditedUserDataInvalidLastNameFormatGetter();
        //input valid edited first name into first name input field
        accountPageInvalidSingularInputFormat.inputValidEditedFirstNameIntoFirstNameInputField();
        //input invalid edited last name format into last name input field (special symbols only)
        accountPageInvalidSingularInputFormat.inputInvalidEditedLastNameFormatIntoLastNameInputField();
        //input valid edited email into email input field
        accountPageInvalidSingularInputFormat.inputValidEditedEmailIntoEmailInputField();
        //capture screenshot of the account details page after invalid edited data input - invalid last name format
        captureScreenshot(driver, "Account Details Page Display After Invalid Edited Data Input - Invalid Last Name Format");
        //click 'Submit' button
        accountDetailsPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Last name cannot consist of special symbols only", accountPageInvalidSingularInputFormat.getSingularInputErrorBoxMessage(), "The invalid last name input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid last name input format error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Invalid Last Name Format");
    }
    //invalid edit user account data test method - invalid user email format (missing '@')
    protected void invalidEditUserAccountInvalidEmailFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AccountPageInvalidSingularInputFormat accountPageInvalidSingularInputFormat = new AccountPageInvalidSingularInputFormat(driver);
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);
        //general page web element assert
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Account Details' link
        accountPage.clickAccountDetailsLink();
        //capture screenshot of the account details page before data input
        captureScreenshot(driver, "Account Details Page Display Before Data Input");
        //account details page web element assert
        isAccountDetailsPageWebElementDisplayed(accountDetailsPage);
        //account details text element assert
        isAccountDetailsPageTextElementAsExpected(accountDetailsPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //invalid edited user account data getter - invalid user email format (missing '@')
        accountPageInvalidSingularInputFormat.invalidEditedUserDataInvalidEmailFormatGetter();
        //input valid edited first name into first name input field
        accountPageInvalidSingularInputFormat.inputValidEditedFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountPageInvalidSingularInputFormat.inputValidEditedLastNameIntoLastNameInputField();
        //input invalid edited email format into email input field (missing '@')
        accountPageInvalidSingularInputFormat.inputInvalidEditedEmailFormatIntoEmailInputField();
        //capture screenshot of the account details page after invalid edited data input - invalid email input format
        captureScreenshot(driver, "Account Details Page Display After Invalid Edited Data Input - Invalid Email Format");
        //click 'Submit' button
        accountDetailsPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Warning\n" + "\n" + "Email address is invalid! Please correct", accountPageInvalidSingularInputFormat.getSingularInputErrorBoxMessage(), "The invalid email input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid email input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Invalid Email Input Format");
    }
    //invalid edit user account data test method - existing test email
    protected void invalidEditUserAccountExistingTestEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AccountPageInvalidSingularInputFormat accountPageInvalidSingularInputFormat = new AccountPageInvalidSingularInputFormat(driver);
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);
        //general page web element assert
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Account Details' link
        accountPage.clickAccountDetailsLink();
        //capture screenshot of the account details page before data input
        captureScreenshot(driver, "Account Details Page Display Before Data Input");
        //account details page web element assert
        isAccountDetailsPageWebElementDisplayed(accountDetailsPage);
        //account details text element assert
        isAccountDetailsPageTextElementAsExpected(accountDetailsPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //invalid edited user account data getter - existing test email
        accountPageInvalidSingularInputFormat.invalidEditedUserDataExistingEmailGetter();
        //input valid edited first name into first name input field
        accountPageInvalidSingularInputFormat.inputValidEditedFirstNameIntoFirstNameInputField();
        //input valid edited last name into last name input field
        accountPageInvalidSingularInputFormat.inputValidEditedLastNameIntoLastNameInputField();
        //input existing test email into email input field
        accountPageInvalidSingularInputFormat.inputExistingTestEmailIntoEmailInputField();
        //capture screenshot of the account details page after invalid edited data input - existing email
        captureScreenshot(driver, "Account Details Page Display After Invalid Edited Data Input - Existing Test Email");
        //click 'Submit' button
        accountDetailsPage.clickSubmitButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Warning\n" + "\n" + "Email address is invalid! Please correct", accountPageInvalidSingularInputFormat.getSingularInputErrorBoxMessage(), "The existing email input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The existing email input error doesn't get triggered, test has failed.");
        }
        //wait for elements to load
        generalPage.waitForElementsToLoad();
        //assert the user gets the expected error message
        assertEquals("403\n" + "Permission denied\n" + "Sorry, this operation is disabled on the demo.", accountPage.getAccountErrorBlockMessage(), "The account error block message doesn't match expectations.");
        logger.error("The user account operation is disabled on the demo (existing email test).");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Edit User Account Data Test Result - Existing Test Email");
    }

    //user account removal test

    //user account removal test method
    protected void userAccountRemovalTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Account Details' link
        accountPage.clickAccountDetailsLink();
        //capture screenshot of the account details page before account removal
        captureScreenshot(driver, "Account Details Page Display Before Account Removal");
        //account details page web element assert
        isAccountDetailsPageWebElementDisplayed(accountDetailsPage);
        //account details text element assert
        isAccountDetailsPageTextElementAsExpected(accountDetailsPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //click 'Delete account link'
        accountDetailsPage.clickDeleteAccountLink();
        //wait for elements to load
        generalPage.waitForElementsToLoad();
        //assert the user gets expected removal confirmation text messages
        assertEquals("Confirmation", accountDetailsPage.getAccountRemovalTitle(), "The account removal message title doesn't match expectations.");
        assertEquals("Do you really want to delete your profile?", accountDetailsPage.getAccountRemovalQuestion(), "The account removal question doesn't match expectations.");
        //click 'Yes' button
        accountDetailsPage.clickYesButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad();
        //assert the user gets an expected error (since this operation is disabled on demo)
        assertEquals("403\n" + "Permission denied\n" + "Sorry, this operation is disabled on the demo.", accountPage.getAccountErrorBlockMessage(), "The account error block message doesn't match expectations.");
        logger.error("The user account operation is disabled on the demo (user account removal test).");
        //capture screenshot of the test result
        captureScreenshot(driver, "User Account Removal Test Result");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid user address addition test

    //valid user address addition test method
    protected void validUserAddressAdditionTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //valid new address data getter
        addressBookPage.validUserNewAddressDataGetter();
        //input valid first name into new address first name input field
        addressBookPage.inputValidFirstNameIntoAddressFirstNameInputField();
        //input valid last name into new address last name input field
        addressBookPage.inputValidLastNameIntoAddressLastNameInputField();
        //click 'State dropdown menu
        addressBookPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        addressBookPage.selectIllinoisStateOption();
        //input valid address 1 into new address 1 input field
        addressBookPage.inputValidAddress1IntoAddress1InputField();
        //input valid city into new address city input field
        addressBookPage.inputValidCityIntoAddressCityInputField();
        //input valid post code into new address post code input field
        addressBookPage.inputValidPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after valid user address data input
        captureScreenshot(driver, "New Address Form After Valid Data Input");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //log address book data
        logAddressBookPageData(addressBookPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid New Address Addition Test Result");
    }
    //valid user second address addition test method
    protected void validUserSecondAddressAdditionTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //address form additional text element assert
        isNewAddressFormTextElementAsExpected(addressBookPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //valid new address data getter (for second address)
        addressBookPage.validUserSecondNewAddressDataGetter();
        //input valid first name into new address first name input field
        addressBookPage.inputValidFirstNameIntoAddressFirstNameInputField();
        //input valid last name into new address last name input field
        addressBookPage.inputValidLastNameIntoAddressLastNameInputField();
        //click 'State dropdown menu
        addressBookPage.clickStateDropdownMenu();
        //select 'Illinois' state option
        addressBookPage.selectIllinoisStateOption();
        //input valid address 1 into new address 1 input field
        addressBookPage.inputValidSecondAddress1IntoAddress1InputField();
        //input valid city into new address city input field
        addressBookPage.inputValidSecondCityIntoAddressCityInputField();
        //input valid post code into new address post code input field
        addressBookPage.inputValidSecondPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after valid user address data input
        captureScreenshot(driver, "New (Second) Address Form After Valid Data Input");
        //click 'Shipping address' checkbox
        addressBookPage.clickShippingAddressCheckbox();
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad();
        //log address book data (to verify both addresses are present)
        logAddressBookPageData(addressBookPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid Second New Address Addition Test Result");
    }

    //valid edit user address test method
    protected void validUserEditAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //click 'Change' address button
        addressBookPage.clickChangeAddressButton(0);
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //valid new address data getter (for second address)
        addressBookPage.validUserSecondNewAddressDataGetter();
        //input valid address 1 into new address 1 input field
        addressBookPage.inputValidSecondAddress1IntoAddress1InputField();
        //input valid city into new address city input field
        addressBookPage.inputValidSecondCityIntoAddressCityInputField();
        //input valid post code into new address post code input field
        addressBookPage.inputValidSecondPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after valid user address data input (edited data)
        captureScreenshot(driver, "New Address Form After Valid Edited Data Input");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //wait for elements to load
        generalPage.waitForElementsToLoad();
        //log address book data
        logAddressBookPageData(addressBookPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Edit Address Test Result");
    }

    //invalid user address addition tests

    //no singular input (the country by default is set to 'United States' and there are no blank options for country and state dropdown menus, therefore, their testing is canceled)

    //invalid user address addition test method - no user first name
    protected void invalidUserAddressAdditionNoFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageNoSingularInput addressBookPageNoSingularInput = new AddressBookPageNoSingularInput(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - no first name
        addressBookPageNoSingularInput.invalidUserNewAddressDataNoFirstNameGetter();
        //don't input first name into new address first name input field
        addressBookPageNoSingularInput.inputNoFirstNameIntoAddressFirstNameInputField();
        //input valid last name into new address last name input field
        addressBookPageNoSingularInput.inputValidLastNameIntoAddressLastNameInputField();
        //input valid address 1 into new address 1 input field
        addressBookPageNoSingularInput.inputValidAddress1IntoAddress1InputField();
        //input valid city into new address city input field
        addressBookPageNoSingularInput.inputValidCityIntoAddressCityInputField();
        //input valid post code into new address post code input field
        addressBookPageNoSingularInput.inputValidPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - no first name
        captureScreenshot(driver, "New Address Form After Invalid Data Input - No First Name");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message
        assertEquals("Warning\n" + "\n" + "The required field 'First name' is empty!", addressBookPageNoSingularInput.getSingularInputErrorBoxMessage(), "The missing first name input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - No User First Name");
    }
    //invalid user address addition test method - no user last name
    protected void invalidUserAddressAdditionNoLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageNoSingularInput addressBookPageNoSingularInput = new AddressBookPageNoSingularInput(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - no last name
        addressBookPageNoSingularInput.invalidUserNewAddressDataNoLastNameGetter();
        //input valid first name into new address first name input field
        addressBookPageNoSingularInput.inputValidFirstNameIntoAddressFirstNameInputField();
        //don't input last name into new address last name input field
        addressBookPageNoSingularInput.inputNoLastNameIntoAddressLastNameInputField();
        //input valid address 1 into new address 1 input field
        addressBookPageNoSingularInput.inputValidAddress1IntoAddress1InputField();
        //input valid city into new address city input field
        addressBookPageNoSingularInput.inputValidCityIntoAddressCityInputField();
        //input valid post code into new address post code input field
        addressBookPageNoSingularInput.inputValidPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - no last name
        captureScreenshot(driver, "New Address Form After Invalid Data Input - No Last Name");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message
        assertEquals("Warning\n" + "\n" + "The required field 'Last name' is empty!", addressBookPageNoSingularInput.getSingularInputErrorBoxMessage(), "The missing last name input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - No User Last Name");
    }
    //invalid user address addition test method - no user address
    protected void invalidUserAddressAdditionNoAddress1Test(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageNoSingularInput addressBookPageNoSingularInput = new AddressBookPageNoSingularInput(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - no address
        addressBookPageNoSingularInput.invalidUserNewAddressDataNoAddressGetter();
        //input valid first name into new address first name input field
        addressBookPageNoSingularInput.inputValidFirstNameIntoAddressFirstNameInputField();
        //input valid last name into new address last name input field
        addressBookPageNoSingularInput.inputValidLastNameIntoAddressLastNameInputField();
        //don't input address 1 into new address 1 input field
        addressBookPageNoSingularInput.inputNoAddress1IntoAddress1InputField();
        //input valid city into new address city input field
        addressBookPageNoSingularInput.inputValidCityIntoAddressCityInputField();
        //input valid post code into new address post code input field
        addressBookPageNoSingularInput.inputValidPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - no address
        captureScreenshot(driver, "New Address Form After Invalid Data Input - No Address");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message
        assertEquals("Warning\n" + "\n" + "The required field 'Address' is empty!", addressBookPageNoSingularInput.getSingularInputErrorBoxMessage(), "The missing address input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - No User Address");
    }
    //invalid user address addition test method - no user city
    protected void invalidUserAddressAdditionNoCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageNoSingularInput addressBookPageNoSingularInput = new AddressBookPageNoSingularInput(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - no city
        addressBookPageNoSingularInput.invalidUserNewAddressDataNoCityGetter();
        //input valid first name into new address first name input field
        addressBookPageNoSingularInput.inputValidFirstNameIntoAddressFirstNameInputField();
        //input valid last name into new address last name input field
        addressBookPageNoSingularInput.inputValidLastNameIntoAddressLastNameInputField();
        //input valid address 1 into new address 1 input field
        addressBookPageNoSingularInput.inputValidAddress1IntoAddress1InputField();
        //don't input city into new address city input field
        addressBookPageNoSingularInput.inputNoCityIntoAddressCityInputField();
        //input valid post code into new address post code input field
        addressBookPageNoSingularInput.inputValidPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - no city
        captureScreenshot(driver, "New Address Form After Invalid Data Input - No City");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message
        assertEquals("Warning\n" + "\n" + "The required field 'City' is empty!", addressBookPageNoSingularInput.getSingularInputErrorBoxMessage(), "The missing city input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - No User City");
    }
    //invalid user address addition test method - no user post code
    protected void invalidUserAddressAdditionNoPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageNoSingularInput addressBookPageNoSingularInput = new AddressBookPageNoSingularInput(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - no post code
        addressBookPageNoSingularInput.invalidUserNewAddressDataNoPostCodeGetter();
        //input valid first name into new address first name input field
        addressBookPageNoSingularInput.inputValidFirstNameIntoAddressFirstNameInputField();
        //input valid last name into new address last name input field
        addressBookPageNoSingularInput.inputValidLastNameIntoAddressLastNameInputField();
        //input valid address 1 into new address 1 input field
        addressBookPageNoSingularInput.inputValidAddress1IntoAddress1InputField();
        //input valid city into new address city input field
        addressBookPageNoSingularInput.inputValidCityIntoAddressCityInputField();
        //don't input post code into new address post code input field
        addressBookPageNoSingularInput.inputNoPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - no post code
        captureScreenshot(driver, "New Address Form After Invalid Data Input - No Post Code");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message
        assertEquals("Warning\n" + "\n" + "The required field 'Zip/Postal code' is empty!", addressBookPageNoSingularInput.getSingularInputErrorBoxMessage(), "The missing post code input error message doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - No User Post Code");
    }

    //too short singular input

    //invalid user address addition test method - too short user first name (1 char)
    protected void invalidUserAddressAdditionTooShortFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageTooShortSingularInput addressBookPageTooShortSingularInput = new AddressBookPageTooShortSingularInput(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - too short first name (1 char)
        addressBookPageTooShortSingularInput.invalidUserNewAddressDataTooShortFirstNameGetter();
        //input too short first name into new address first name input field (1 char)
        addressBookPageTooShortSingularInput.inputTooShortFirstNameIntoAddressFirstNameInputField();
        //input valid last name into new address last name input field
        addressBookPageTooShortSingularInput.inputValidLastNameIntoAddressLastNameInputField();
        //input valid address 1 into new address 1 input field
        addressBookPageTooShortSingularInput.inputValidAddress1IntoAddress1InputField();
        //input valid city into new address city input field
        addressBookPageTooShortSingularInput.inputValidCityIntoAddressCityInputField();
        //input valid post code into new address post code input field
        addressBookPageTooShortSingularInput.inputValidPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - too short first name
        captureScreenshot(driver, "New Address Form After Invalid Data Input - Too Short First Name");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("First name is too short", addressBookPageTooShortSingularInput.getSingularInputErrorBoxMessage(), "The too short first name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short first name input error message doesn't get triggered, test has failed");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - Too Short User First Name");
    }
    //invalid user address addition test method - too short user last name (1 char)
    protected void invalidUserAddressAdditionTooShortLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageTooShortSingularInput addressBookPageTooShortSingularInput = new AddressBookPageTooShortSingularInput(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - too short last name (1 char)
        addressBookPageTooShortSingularInput.invalidUserNewAddressDataTooShortLastNameGetter();
        //input valid first name into new address first name input field
        addressBookPageTooShortSingularInput.inputValidFirstNameIntoAddressFirstNameInputField();
        //input too short last name into new address last name input field (1 char)
        addressBookPageTooShortSingularInput.inputTooShortLastNameIntoAddressLastNameInputField();
        //input valid address 1 into new address 1 input field
        addressBookPageTooShortSingularInput.inputValidAddress1IntoAddress1InputField();
        //input valid city into new address city input field
        addressBookPageTooShortSingularInput.inputValidCityIntoAddressCityInputField();
        //input valid post code into new address post code input field
        addressBookPageTooShortSingularInput.inputValidPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - too short last name
        captureScreenshot(driver, "New Address Form After Invalid Data Input - Too Short Last Name");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Last name is too short", addressBookPageTooShortSingularInput.getSingularInputErrorBoxMessage(), "The too short last name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short last name input error message doesn't get triggered, test has failed");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - Too Short User Last Name");
    }
    //invalid user address addition test method - too short user post code (4 chars)
    protected void invalidUserAddressAdditionTooShortAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageTooShortSingularInput addressBookPageTooShortSingularInput = new AddressBookPageTooShortSingularInput(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - too short address (4 chars)
        addressBookPageTooShortSingularInput.invalidUserNewAddressDataTooShortAddressGetter();
        //input valid first name into new address first name input field
        addressBookPageTooShortSingularInput.inputValidFirstNameIntoAddressFirstNameInputField();
        //input valid last name into new address last name input field
        addressBookPageTooShortSingularInput.inputValidLastNameIntoAddressLastNameInputField();
        //input too short address 1 into new address 1 input field (4 chars)
        addressBookPageTooShortSingularInput.inputTooShortAddress1IntoAddress1InputField();
        //input valid city into new address city input field
        addressBookPageTooShortSingularInput.inputValidCityIntoAddressCityInputField();
        //input valid post code into new address post code input field
        addressBookPageTooShortSingularInput.inputValidPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - too short address
        captureScreenshot(driver, "New Address Form After Invalid Data Input - Too Short Address");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Address is too short", addressBookPageTooShortSingularInput.getSingularInputErrorBoxMessage(), "The too short address input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short address input error message doesn't get triggered, test has failed");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - Too Short User Address");
    }
    //invalid user address addition test method - too short user city (2 chars)
    protected void invalidUserAddressAdditionTooShortCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageTooShortSingularInput addressBookPageTooShortSingularInput = new AddressBookPageTooShortSingularInput(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - too short city (2 chars)
        addressBookPageTooShortSingularInput.invalidUserNewAddressDataTooShortCityGetter();
        //input valid first name into new address first name input field
        addressBookPageTooShortSingularInput.inputValidFirstNameIntoAddressFirstNameInputField();
        //input valid last name into new address last name input field
        addressBookPageTooShortSingularInput.inputValidLastNameIntoAddressLastNameInputField();
        //input valid address 1 into new address 1 input field
        addressBookPageTooShortSingularInput.inputValidAddress1IntoAddress1InputField();
        //input too short city into new address city input field (2 chars)
        addressBookPageTooShortSingularInput.inputTooShortCityIntoAddressCityInputField();
        //input valid post code into new address post code input field
        addressBookPageTooShortSingularInput.inputValidPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - too short city
        captureScreenshot(driver, "New Address Form After Invalid Data Input - Too Short City");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("City is too short", addressBookPageTooShortSingularInput.getSingularInputErrorBoxMessage(), "The too short city input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short city input error message doesn't get triggered, test has failed");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - Too Short User City");
    }
    //invalid user address addition test method - too short user post code (4 digits)
    protected void invalidUserAddressAdditionTooShortPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageTooShortSingularInput addressBookPageTooShortSingularInput = new AddressBookPageTooShortSingularInput(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - too short post code (3 digits)
        addressBookPageTooShortSingularInput.invalidUserNewAddressDataTooShortPostCodeGetter();
        //input valid first name into new address first name input field
        addressBookPageTooShortSingularInput.inputValidFirstNameIntoAddressFirstNameInputField();
        //input valid last name into new address last name input field
        addressBookPageTooShortSingularInput.inputValidLastNameIntoAddressLastNameInputField();
        //input valid address 1 into new address 1 input field
        addressBookPageTooShortSingularInput.inputValidAddress1IntoAddress1InputField();
        //input valid city into new address city input field
        addressBookPageTooShortSingularInput.inputValidCityIntoAddressCityInputField();
        //input too short post code into new address post code input field (4 digits)
        addressBookPageTooShortSingularInput.inputTooShortPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - too short post code
        captureScreenshot(driver, "New Address Form After Invalid Data Input - Too Short Post Code");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Warning\n" + "\n" + "Make sure that you have 5 digits in your zip code", addressBookPageTooShortSingularInput.getSingularInputErrorBoxMessage(), "The too short post code input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short post code input error message doesn't get triggered, test has failed");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - Too Short User Post Code");
    }

    //too long singular input

    //invalid user address addition test method - too long user first name (100 chars)
    protected void invalidUserAddressAdditionTooLongFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageTooLongSingularInput addressBookPageTooLongSingularInput = new AddressBookPageTooLongSingularInput(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - too long first name (100 chars)
        addressBookPageTooLongSingularInput.invalidUserNewAddressDataTooLongFirstNameGetter();
        //input too short first name into new address first name input field (100 chars)
        addressBookPageTooLongSingularInput.inputTooLongFirstNameIntoAddressFirstNameInputField();
        //input valid last name into new address last name input field
        addressBookPageTooLongSingularInput.inputValidLastNameIntoAddressLastNameInputField();
        //input valid address 1 into new address 1 input field
        addressBookPageTooLongSingularInput.inputValidAddress1IntoAddress1InputField();
        //input valid city into new address city input field
        addressBookPageTooLongSingularInput.inputValidCityIntoAddressCityInputField();
        //input valid post code into new address post code input field
        addressBookPageTooLongSingularInput.inputValidPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - too long first name
        captureScreenshot(driver, "New Address Form After Invalid Data Input - Too Long First Name");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("First name is too long", addressBookPageTooLongSingularInput.getSingularInputErrorBoxMessage(), "The too long first name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long first name input error message doesn't get triggered, test has failed");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - Too Long User First Name");
    }
    //invalid user address addition test method - too long user last name (100 chars)
    protected void invalidUserAddressAdditionTooLongLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageTooLongSingularInput addressBookPageTooLongSingularInput = new AddressBookPageTooLongSingularInput(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - too long last name (100 chars)
        addressBookPageTooLongSingularInput.invalidUserNewAddressDataTooLongLastNameGetter();
        //input valid first name into new address first name input field
        addressBookPageTooLongSingularInput.inputValidFirstNameIntoAddressFirstNameInputField();
        //input too long last name into new address last name input field (100 chars)
        addressBookPageTooLongSingularInput.inputTooLongLastNameIntoAddressLastNameInputField();
        //input valid address 1 into new address 1 input field
        addressBookPageTooLongSingularInput.inputValidAddress1IntoAddress1InputField();
        //input valid city into new address city input field
        addressBookPageTooLongSingularInput.inputValidCityIntoAddressCityInputField();
        //input valid post code into new address post code input field
        addressBookPageTooLongSingularInput.inputValidPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - too long last name
        captureScreenshot(driver, "New Address Form After Invalid Data Input - Too Long Last Name");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Last name is too long", addressBookPageTooLongSingularInput.getSingularInputErrorBoxMessage(), "The too long last name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long last name input error message doesn't get triggered, test has failed");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - Too Long User Last Name");
    }
    //invalid user address addition test method - too long user address (100 chars)
    protected void invalidUserAddressAdditionTooLongAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageTooLongSingularInput addressBookPageTooLongSingularInput = new AddressBookPageTooLongSingularInput(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - too long address (100 chars)
        addressBookPageTooLongSingularInput.invalidUserNewAddressDataTooLongAddressGetter();
        //input valid first name into new address first name input field
        addressBookPageTooLongSingularInput.inputValidFirstNameIntoAddressFirstNameInputField();
        //input valid last name into new address last name input field
        addressBookPageTooLongSingularInput.inputValidLastNameIntoAddressLastNameInputField();
        //input too long address 1 into new address 1 input field (100 chars)
        addressBookPageTooLongSingularInput.inputTooLongAddress1IntoAddress1InputField();
        //input valid city into new address city input field
        addressBookPageTooLongSingularInput.inputValidCityIntoAddressCityInputField();
        //input valid post code into new address post code input field
        addressBookPageTooLongSingularInput.inputValidPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - too long address
        captureScreenshot(driver, "New Address Form After Invalid Data Input - Too Long Address");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Address is too long", addressBookPageTooLongSingularInput.getSingularInputErrorBoxMessage(), "The too long address input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long address input error message doesn't get triggered, test has failed");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - Too Long User Address");
    }
    //invalid user address addition test method - too long user city (75 chars)
    protected void invalidUserAddressAdditionTooLongCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageTooLongSingularInput addressBookPageTooLongSingularInput = new AddressBookPageTooLongSingularInput(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - too long city (75 chars)
        addressBookPageTooLongSingularInput.invalidUserNewAddressDataTooLongCityGetter();
        //input valid first name into new address first name input field
        addressBookPageTooLongSingularInput.inputValidFirstNameIntoAddressFirstNameInputField();
        //input valid last name into new address last name input field
        addressBookPageTooLongSingularInput.inputValidLastNameIntoAddressLastNameInputField();
        //input valid address 1 into new address 1 input field
        addressBookPageTooLongSingularInput.inputValidAddress1IntoAddress1InputField();
        //input too long city into new address city input field (75 chars)
        addressBookPageTooLongSingularInput.inputTooLongCityIntoAddressCityInputField();
        //input valid post code into new address post code input field
        addressBookPageTooLongSingularInput.inputValidPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - too long city
        captureScreenshot(driver, "New Address Form After Invalid Data Input - Too Long City");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("City is too long", addressBookPageTooLongSingularInput.getSingularInputErrorBoxMessage(), "The too long city input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long city input error message doesn't get triggered, test has failed");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - Too Long User City");
    }
    //invalid user address addition test method - too long user post code (6 digits)
    protected void invalidUserAddressAdditionTooLongPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageTooLongSingularInput addressBookPageTooLongSingularInput = new AddressBookPageTooLongSingularInput(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - too long post code (6 digits)
        addressBookPageTooLongSingularInput.invalidUserNewAddressDataTooLongPostCodeGetter();
        //input valid first name into new address first name input field
        addressBookPageTooLongSingularInput.inputValidFirstNameIntoAddressFirstNameInputField();
        //input valid last name into new address last name input field
        addressBookPageTooLongSingularInput.inputValidLastNameIntoAddressLastNameInputField();
        //input valid address 1 into new address 1 input field
        addressBookPageTooLongSingularInput.inputValidAddress1IntoAddress1InputField();
        //input valid city into new address city input field
        addressBookPageTooLongSingularInput.inputValidCityIntoAddressCityInputField();
        //input too long post code into new address post code input field (6 digits)
        addressBookPageTooLongSingularInput.inputTooLongPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - too long post code
        captureScreenshot(driver, "New Address Form After Invalid Data Input - Too Long Post Code");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Warning\n" + "\n" + "Make sure that you have 5 digits in your zip code", addressBookPageTooLongSingularInput.getSingularInputErrorBoxMessage(), "The too long post code input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long post code input error message doesn't get triggered, test has failed");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - Too Long User Post Code");
    }

    //invalid singular input format

    //invalid user address addition test method - invalid user first name format (special symbols only)
    protected void invalidUserAddressAdditionInvalidFirstNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageInvalidSingularInputFormat addressBookPageInvalidSingularInputFormat = new AddressBookPageInvalidSingularInputFormat(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - invalid first name input format (special symbols only)
        addressBookPageInvalidSingularInputFormat.invalidUserNewAddressDataInvalidFirstNameFormatGetter();
        //input invalid first name into new address first name input field (special symbols only)
        addressBookPageInvalidSingularInputFormat.inputInvalidFirstNameFormatIntoAddressFirstNameInputField();
        //input valid last name into new address last name input field
        addressBookPageInvalidSingularInputFormat.inputValidLastNameIntoAddressLastNameInputField();
        //input valid address 1 into new address 1 input field
        addressBookPageInvalidSingularInputFormat.inputValidAddress1IntoAddress1InputField();
        //input valid city into new address city input field
        addressBookPageInvalidSingularInputFormat.inputValidCityIntoAddressCityInputField();
        //input valid post code into new address post code input field
        addressBookPageInvalidSingularInputFormat.inputValidPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - invalid first name format
        captureScreenshot(driver, "New Address Form After Invalid Data Input - Invalid First Name Format");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("First name cannot consist of special symbols only.", addressBookPageInvalidSingularInputFormat.getSingularInputErrorBoxMessage(), "The invalid first name input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid first name input error message doesn't get triggered, test has failed");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - Invalid User First Name Format");
    }
    //invalid user address addition test method - invalid user last name format (special symbols only)
    protected void invalidUserAddressAdditionInvalidLastNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageInvalidSingularInputFormat addressBookPageInvalidSingularInputFormat = new AddressBookPageInvalidSingularInputFormat(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - invalid last name input format (special symbols only)
        addressBookPageInvalidSingularInputFormat.invalidUserNewAddressDataInvalidLastNameFormatGetter();
        //input valid first name into new address first name input field
        addressBookPageInvalidSingularInputFormat.inputValidFirstNameIntoAddressFirstNameInputField();
        //input invalid last name format into new address last name input field (special symbols only)
        addressBookPageInvalidSingularInputFormat.inputInvalidLastNameFormatIntoAddressLastNameInputField();
        //input valid address 1 into new address 1 input field
        addressBookPageInvalidSingularInputFormat.inputValidAddress1IntoAddress1InputField();
        //input valid city into new address city input field
        addressBookPageInvalidSingularInputFormat.inputValidCityIntoAddressCityInputField();
        //input valid post code into new address post code input field
        addressBookPageInvalidSingularInputFormat.inputValidPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - invalid last name format
        captureScreenshot(driver, "New Address Form After Invalid Data Input - Invalid Last Name Format");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Last name cannot consist of special symbols only.", addressBookPageInvalidSingularInputFormat.getSingularInputErrorBoxMessage(), "The invalid last name input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid last name input format error message doesn't get triggered, test has failed");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - Invalid User Last Name Format");
    }
    //invalid user address addition test method - invalid user address format (special symbols only)
    protected void invalidUserAddressAdditionInvalidAddressFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageInvalidSingularInputFormat addressBookPageInvalidSingularInputFormat = new AddressBookPageInvalidSingularInputFormat(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - invalid address input format (special symbols only)
        addressBookPageInvalidSingularInputFormat.invalidUserNewAddressDataInvalidAddressFormatGetter();
        //input valid first name into new address first name input field
        addressBookPageInvalidSingularInputFormat.inputValidFirstNameIntoAddressFirstNameInputField();
        //input valid last name into new address last name input field
        addressBookPageInvalidSingularInputFormat.inputValidLastNameIntoAddressLastNameInputField();
        //input invalid address 1 format into new address 1 input field (special symbols only)
        addressBookPageInvalidSingularInputFormat.inputInvalidAddress1FormatIntoAddress1InputField();
        //input valid city into new address city input field
        addressBookPageInvalidSingularInputFormat.inputValidCityIntoAddressCityInputField();
        //input valid post code into new address post code input field
        addressBookPageInvalidSingularInputFormat.inputValidPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - invalid address input format
        captureScreenshot(driver, "New Address Form After Invalid Data Input - Invalid Address Input Format");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Address cannot consist of special symbols only", addressBookPageInvalidSingularInputFormat.getSingularInputErrorBoxMessage(), "The invalid address input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid address input format error message doesn't get triggered, test has failed");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - Invalid User Address Format");
    }
    //invalid user address addition test method - invalid user city input format (special symbols only)
    protected void invalidUserAddressAdditionInvalidCityFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageInvalidSingularInputFormat addressBookPageInvalidSingularInputFormat = new AddressBookPageInvalidSingularInputFormat(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - invalid city input format (special symbols only)
        addressBookPageInvalidSingularInputFormat.invalidUserNewAddressDataInvalidCityFormatGetter();
        //input valid first name into new address first name input field
        addressBookPageInvalidSingularInputFormat.inputValidFirstNameIntoAddressFirstNameInputField();
        //input valid last name into new address last name input field
        addressBookPageInvalidSingularInputFormat.inputValidLastNameIntoAddressLastNameInputField();
        //input valid address 1 into new address 1 input field
        addressBookPageInvalidSingularInputFormat.inputValidAddress1IntoAddress1InputField();
        //input invalid city format into new address city input field (special symbols only)
        addressBookPageInvalidSingularInputFormat.inputInvalidCityFormatIntoAddressCityInputField();
        //input valid post code into new address post code input field
        addressBookPageInvalidSingularInputFormat.inputValidPostCodeIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - invalid city input format
        captureScreenshot(driver, "New Address Form After Invalid Data Input - Invalid City Format");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("City cannot consist of special symbols only.", addressBookPageInvalidSingularInputFormat.getSingularInputErrorBoxMessage(), "The invalid city input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid city input format error message doesn't get triggered, test has failed");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - Invalid User City Format");
    }
    //invalid user address addition test method - invalid user post code input format (special symbols only)
    protected void invalidUserAddressAdditionInvalidPostCodeFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        AddressBookPageInvalidSingularInputFormat addressBookPageInvalidSingularInputFormat = new AddressBookPageInvalidSingularInputFormat(driver);
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
        //account page web element assert (navbar links)
        isAccountPageNavbarWebElementDisplayed(accountPage);
        //address book web element assert
        isAddressBookPageWebElementDisplayed(addressBookPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //capture screenshot of the address book page
        captureScreenshot(driver, "Address Book Page Display");
        //assert the address book title is as expected (since the user gets here first)
        assertEquals("Address book", accountPage.getAccountPageTitle(), "The address book page title doesn't match expectations");
        //click 'Add address' link
        addressBookPage.clickAddAddressLink();
        //capture screenshot of the new address form
        captureScreenshot(driver, "New Address Form Display");
        //address form web element assert
        isAddressFormWebElementDisplayed(addressBookPage);
        //address form text element assert
        isAddressFormTextElementAsExpected(addressBookPage);
        //invalid new address data getter - invalid post code format (special symbols only)
        addressBookPageInvalidSingularInputFormat.invalidUserNewAddressDataInvalidPostCodeFormatGetter();
        //input valid first name into new address first name input field
        addressBookPageInvalidSingularInputFormat.inputValidFirstNameIntoAddressFirstNameInputField();
        //input valid last name into new address last name input field
        addressBookPageInvalidSingularInputFormat.inputValidLastNameIntoAddressLastNameInputField();
        //input valid address 1 into new address 1 input field
        addressBookPageInvalidSingularInputFormat.inputValidAddress1IntoAddress1InputField();
        //input valid city into new address city input field
        addressBookPageInvalidSingularInputFormat.inputValidCityIntoAddressCityInputField();
        //input invalid post code format into new address post code input field (special symbols only)
        addressBookPageInvalidSingularInputFormat.inputInvalidPostCodeFormatIntoAddressPostCodeInputField();
        //capture screenshot of the address form after invalid user address data input - invalid post code input format
        captureScreenshot(driver, "New Address Form After Invalid Data Input - Invalid Post Code Format");
        //click 'Save' button
        addressBookPage.clickSaveButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Warning\n" + "\n" + "Make sure that you have 5 digits in your zip code", addressBookPageInvalidSingularInputFormat.getSingularInputErrorBoxMessage(), "The invalid post code input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid post code input format error message doesn't get triggered, test has failed");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid New Address Addition Test Result - Invalid User Post Code Format");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //user logout test method
    protected void userLogoutTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        AddressBookPage addressBookPage = new AddressBookPage(driver);
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
        //click 'Sign out' header nav link (locator for 'Register' link)
        generalPage.clickHeaderSignOutLink();
        //capture screenshot of the test result
        captureScreenshot(driver, "User Logout Test Result");
    }

    //valid user login tests

    //valid user login test method
    protected void validUserLoginTest(RegisterPage registerPage){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SignInFormPage signInFormPage = new SignInFormPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //click 'Sign in' header nav link
        generalPage.clickHeaderSignInLink();
        //capture screenshot of the sign-in form before valid data input
        captureScreenshot(driver, "Sign In Form Page Display Before Data Input");
        //sign-in form page web element assert
        isSignInFormPageWebElementDisplayed(signInFormPage);
        //sign-in form page text element assert
        isSignInFormPageTextAsExpected(signInFormPage);
        //valid sign-in user data getter
        signInFormPage.validSignInDataGetter(registerPage);
        //input valid user login email into email input field
        signInFormPage.inputValidLoginEmailIntoEmailInputField();
        //input valid user login password into password input field
        signInFormPage.inputValidLoginPasswordIntoPasswordInputField();
        //capture screenshot of the sign-in form after valid data input
        captureScreenshot(driver, "Sign In Form Page Display After Valid Data Input");
        //click 'Submit' button
        signInFormPage.clickSubmitLoginButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Login Test Result");
    }

    //valid user login with edited email test method
    protected void validUserEditedEmailLoginTest(RegisterPage registerPage){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SignInFormPage signInFormPage = new SignInFormPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //click 'Sign in' header nav link
        generalPage.clickHeaderSignInLink();
        //capture screenshot of the sign-in form before valid data input
        captureScreenshot(driver, "Sign In Form Page Display Before Data Input");
        //sign-in form page web element assert
        isSignInFormPageWebElementDisplayed(signInFormPage);
        //sign-in form page text element assert
        isSignInFormPageTextAsExpected(signInFormPage);
        //valid edited sign-in user data getter
        signInFormPage.validEditedEmailSignInDataGetter(registerPage);
        //input valid edited user login email into email input field
        signInFormPage.inputValidEditedLoginEmailIntoEmailInputField();
        //input valid user login password into password input field
        signInFormPage.inputValidLoginPasswordIntoPasswordInputField();
        //capture screenshot of the sign-in form after valid data input
        captureScreenshot(driver, "Sign In Form Page Display After Valid Data Input");
        //click 'Submit' button
        signInFormPage.clickSubmitLoginButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Login Test Result");
    }

    //invalid user login tests

    //no singular input

    //invalid user login test method - no login email
    protected void invalidUserLoginNoLoginEmailTest(RegisterPage registerPage){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SignInFormPage signInFormPage = new SignInFormPage(driver);
        SignInPageInvalidInputScenarios signInPageInvalidInputScenarios = new SignInPageInvalidInputScenarios(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //click 'Sign in' header nav link
        generalPage.clickHeaderSignInLink();
        //capture screenshot of the sign-in form before valid data input
        captureScreenshot(driver, "Sign In Form Page Display Before Data Input");
        //sign-in form page web element assert
        isSignInFormPageWebElementDisplayed(signInFormPage);
        //sign-in form page text element assert
        isSignInFormPageTextAsExpected(signInFormPage);
        //invalid sign-in user data getter - no login email
        signInPageInvalidInputScenarios.invalidSignInDataNoEmailGetter(registerPage);
        //don't input user login email into email input field
        signInPageInvalidInputScenarios.inputNoLoginEmailIntoEmailInputField();
        //input valid user login password into password input field
        signInPageInvalidInputScenarios.inputValidLoginPasswordIntoPasswordInputField();
        //capture screenshot of the sign-in form after invalid data input - no login email
        captureScreenshot(driver, "Sign In Form Page Display After Invalid Data Input - No Login Email");
        //click 'Submit' button
        signInFormPage.clickSubmitLoginButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Warning\n" + "\n" + "The required field 'Email' is empty!", signInFormPage.getSingularInputErrorBoxMessage(), "The missing login email input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The missing login email input error message doesn't get triggered, test has failed");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Login Test Result - No Login Email");
    }
    //invalid user login test method - no login password
    protected void invalidUserLoginNoLoginPasswordTest(RegisterPage registerPage){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SignInFormPage signInFormPage = new SignInFormPage(driver);
        SignInPageInvalidInputScenarios signInPageInvalidInputScenarios = new SignInPageInvalidInputScenarios(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //click 'Sign in' header nav link
        generalPage.clickHeaderSignInLink();
        //capture screenshot of the sign-in form before valid data input
        captureScreenshot(driver, "Sign In Form Page Display Before Data Input");
        //sign-in form page web element assert
        isSignInFormPageWebElementDisplayed(signInFormPage);
        //sign-in form page text element assert
        isSignInFormPageTextAsExpected(signInFormPage);
        //invalid sign-in user data getter - no login password
        signInPageInvalidInputScenarios.invalidSignInDataNoPasswordGetter(registerPage);
        //input valid user login email into email input field
        signInPageInvalidInputScenarios.inputValidLoginEmailIntoEmailInputField();
        //don't input user login password into password input field
        signInPageInvalidInputScenarios.inputNoLoginPasswordIntoPasswordInputField();
        //capture screenshot of the sign-in form after invalid data input - no login password
        captureScreenshot(driver, "Sign In Form Page Display After Invalid Data Input - No Login Password");
        //click 'Submit' button
        signInFormPage.clickSubmitLoginButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("Warning\n" + "\n" + "The required field 'Password' is empty!", signInFormPage.getSingularInputErrorBoxMessage(), "The missing login password input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The missing login password input error message doesn't get triggered, test has failed");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Login Test Result - No Login Password");
    }

    //invalid singular input

    //invalid user login test method - invalid login email
    protected void invalidUserLoginInvalidLoginEmailTest(RegisterPage registerPage){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SignInFormPage signInFormPage = new SignInFormPage(driver);
        SignInPageInvalidInputScenarios signInPageInvalidInputScenarios = new SignInPageInvalidInputScenarios(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //click 'Sign in' header nav link
        generalPage.clickHeaderSignInLink();
        //capture screenshot of the sign-in form before valid data input
        captureScreenshot(driver, "Sign In Form Page Display Before Data Input");
        //sign-in form page web element assert
        isSignInFormPageWebElementDisplayed(signInFormPage);
        //sign-in form page text element assert
        isSignInFormPageTextAsExpected(signInFormPage);
        //invalid sign-in user data getter - invalid login email
        signInPageInvalidInputScenarios.invalidSignInDataInvalidEmailGetter(registerPage);
        //input invalid user login email into email input field
        signInPageInvalidInputScenarios.inputInvalidLoginEmailIntoEmailInputField();
        //input valid user login password into password input field
        signInPageInvalidInputScenarios.inputValidLoginPasswordIntoPasswordInputField();
        //capture screenshot of the sign-in form after invalid data input - invalid login email
        captureScreenshot(driver, "Sign In Form Page Display After Invalid Data Input - Invalid Login Email");
        //click 'Submit' button
        signInFormPage.clickSubmitLoginButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("You have failed to login. This could be due to an incorrect Email or Password.", signInFormPage.getInvalidInputErrorBoxMessage(), "The invalid login email input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid login email input error message doesn't get triggered, test has failed");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Login Test Result - Invalid Login Email");
    }
    //invalid user login test method - invalid login password
    protected void invalidUserLoginInvalidLoginPasswordTest(RegisterPage registerPage){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        SignInFormPage signInFormPage = new SignInFormPage(driver);
        SignInPageInvalidInputScenarios signInPageInvalidInputScenarios = new SignInPageInvalidInputScenarios(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (register page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //click 'Sign in' header nav link
        generalPage.clickHeaderSignInLink();
        //capture screenshot of the sign-in form before valid data input
        captureScreenshot(driver, "Sign In Form Page Display Before Data Input");
        //sign-in form page web element assert
        isSignInFormPageWebElementDisplayed(signInFormPage);
        //sign-in form page text element assert
        isSignInFormPageTextAsExpected(signInFormPage);
        //invalid sign-in user data getter - invalid login password
        signInPageInvalidInputScenarios.invalidSignInDataInvalidPasswordGetter(registerPage);
        //input valid user login email into email input field
        signInPageInvalidInputScenarios.inputValidLoginEmailIntoEmailInputField();
        //input invalid user login password into password input field
        signInPageInvalidInputScenarios.inputInvalidLoginPasswordIntoPasswordInputField();
        //capture screenshot of the sign-in form after valid data input
        captureScreenshot(driver, "Sign In Form Page Display After Invalid Data Input - Invalid Login Password");
        //click 'Submit' button
        signInFormPage.clickSubmitLoginButton();
        //assert the user gets an expected error message, log the issue otherwise
        try {
            assertEquals("You have failed to login. This could be due to an incorrect Email or Password.", signInFormPage.getInvalidInputErrorBoxMessage(), "The invalid login password input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid login password input error message doesn't get triggered, test has failed");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Login Test Result - Invalid Login Password");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //featured product addition to cart tests

    //single product

    //single featured product ('Iphone 5c') add to cart test method (as a guest)
    protected void addSingleFeaturedProductToCartGuestTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
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
        //click 'Iphone 5c' product add to cart button
        homePage.clickFeaturedProductAddToCartButton(3);
        //assert shopping cart form addition success message is as expected
        assertEquals("1 item added to cart", homePage.getShoppingCartFormAdditionSuccessMessage(), "The shopping cart form addition success message doesn't match expectations or the product addition to cart has failed.");
        //capture screenshot of the single product addition to cart (shopping cart form)
        captureScreenshot(driver, "Single Featured Product Shopping Cart Form Display");
        //shopping cart form web element assert
        isShoppingCartFormWebElementDisplayed(homePage);
        //shopping cart form text element assert
        isShoppingCartFormTextElementAsExpected(homePage);
        //log shopping cart form product data
        logShoppingCartFormProductData(homePage);
        //click shopping cart form 'View Cart' button
        homePage.clickViewCartButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Single Featured Product Addition To Cart Test Result (guest)");
    }
    //single featured product ('Thumb-Size R/C Mini Cooper') add to cart test method (as a registered user)
    protected void addSingleFeaturedProductToCartRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
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
        //click 'Home' navbar link
        generalPage.clickNavbarHomeLink();
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //click 'Thumb-Size R/C Mini Cooper' product add to cart button
        homePage.clickFeaturedProductAddToCartButton(2);
        //assert shopping cart form addition success message is as expected
        assertEquals("1 item added to cart", homePage.getShoppingCartFormAdditionSuccessMessage(), "The shopping cart form addition success message doesn't match expectations or the product addition to cart has failed.");
        //capture screenshot of the single product addition to cart (shopping cart form)
        captureScreenshot(driver, "Single Featured Product Shopping Cart Form Display");
        //shopping cart form web element assert
        isShoppingCartFormWebElementDisplayed(homePage);
        //shopping cart form text element assert
        isShoppingCartFormTextElementAsExpected(homePage);
        //log shopping cart form product data
        logShoppingCartFormProductData(homePage);
        //click shopping cart form 'View Cart' button
        homePage.clickViewCartButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Single Featured Product Addition To Cart Test Result (registered user)");
    }

    //multiple products

    //multiple featured products ('Iphone 5c') add to cart test method (as a guest)
    protected void addMultipleFeaturedProductsToCartGuestTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
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
        //click 'Iphone 5c' product quantity dropdown menu
        homePage.clickFeaturedProductQtyDropdownMenu(3);
        //set 'Iphone 5c' product quantity
        homePage.selectFeaturedProductQty(3);
        //click 'Iphone 5c' product add to cart button
        homePage.clickFeaturedProductAddToCartButton(3);
        //assert shopping cart form addition success message is as expected
        assertEquals("5 items added to cart", homePage.getShoppingCartFormAdditionSuccessMessage(), "The shopping cart form addition success message doesn't match expectations or the product addition to cart has failed.");
        //capture screenshot of the multiple products addition to cart (shopping cart form)
        captureScreenshot(driver, "Multiple Featured Product Shopping Cart Form Display");
        //shopping cart form web element assert
        isShoppingCartFormWebElementDisplayed(homePage);
        //shopping cart form text element assert
        isShoppingCartFormTextElementAsExpected(homePage);
        //log shopping cart form product data
        logShoppingCartFormProductData(homePage);
        //click shopping cart form 'View Cart' button
        homePage.clickViewCartButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Multiple Featured Product Addition To Cart Test Result (guest)");
    }
    //multiple featured products ('Thumb-Size R/C Mini Cooper') add to cart test method (as a registered user)
    protected void addMultipleFeaturedProductToCartRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
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
        //click 'Home' navbar link
        generalPage.clickNavbarHomeLink();
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //click 'Thumb-Size R/C Mini Cooper' product quantity dropdown menu
        homePage.clickFeaturedProductQtyDropdownMenu(2);
        //set 'Thumb-Size R/C Mini Cooper' product quantity
        homePage.selectFeaturedProductQty(2);
        //click 'Thumb-Size R/C Mini Cooper' product add to cart button
        homePage.clickFeaturedProductAddToCartButton(2);
        //assert shopping cart form addition success message is as expected
        assertEquals("5 items added to cart", homePage.getShoppingCartFormAdditionSuccessMessage(), "The shopping cart form addition success message doesn't match expectations or the product addition to cart has failed.");
        //capture screenshot of the multiple products addition to cart (shopping cart form)
        captureScreenshot(driver, "Multiple Featured Product Shopping Cart Form Display");
        //shopping cart form web element assert
        isShoppingCartFormWebElementDisplayed(homePage);
        //shopping cart form text element assert
        isShoppingCartFormTextElementAsExpected(homePage);
        //log shopping cart form product data
        logShoppingCartFormProductData(homePage);
        //click shopping cart form 'View Cart' button
        homePage.clickViewCartButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Multiple Featured Product Addition To Cart Test Result (registered user)");
    }

    //searched product addition to cart tests

    //single searched product tests

    //add searched product ('AMD A10-5800K') to cart test method (as a guest)
    protected void addSingleSearchedProductToCartGuestTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
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
        //input search query ('AMD A10-5800K') into header search bar
        generalPage.inputAMDProductSearchQueryIntoSearchBar();
        //click 'Search' button
        generalPage.clickSearchBarButton();
        //capture screenshot of the searched product dashboard page
        captureScreenshot(driver, "Searched Product Dashboard Page Display");
        //searched product dashboard page web element asserts (with the addition of 'This page URL' link)
        isSingleProductCategoryDashboardPageWebElementDisplayed(singleProductCategoryDashboardPage);
        isSearchedProductDashboardPageWebElementDisplayed(singleProductCategoryDashboardPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //single product dashboard text element assert
        isSingleProductCategoryDashboardPageTextElementAsExpected(singleProductCategoryDashboardPage);
        //log searched product dashboard page displayed product data (same exact logger method as for single product category dashboard page)
        logSingleProductCategoryDashboardPageProductData(singleProductCategoryDashboardPage);
        //click 'Add to cart' button
        singleProductCategoryDashboardPage.clickSetProductAddToCartButton(0);
        //capture screenshot of the searched products addition to cart (shopping cart form)
        captureScreenshot(driver, "Searched Product Shopping Cart Form Display");
        //shopping cart form web element assert
        isShoppingCartFormWebElementDisplayed(homePage);
        //shopping cart form text element assert
        isShoppingCartFormTextElementAsExpected(homePage);
        //log shopping cart form product data
        logShoppingCartFormProductData(homePage);
        //click shopping cart form 'View Cart' button
        homePage.clickViewCartButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Single Searched Product (AMD A10-5800K) Addition To Cart Test Result (guest)");
    }
    //add searched product ('R/C Desktop Forklift') to cart test method (as a registered user)
    protected void addSingleSearchedProductToCartRegUserTest() {
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
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
        //click 'Home' navbar link
        generalPage.clickNavbarHomeLink();
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //input search query ('R/C Desktop Forklift') into header search bar
        generalPage.inputRCForkliftProductSearchQueryIntoSearchBar();
        //click 'Search' button
        generalPage.clickSearchBarButton();
        //capture screenshot of the searched product dashboard page
        captureScreenshot(driver, "Searched Product Dashboard Page Display");
        //searched product dashboard page web element asserts (with the addition of 'This page URL' link)
        isSingleProductCategoryDashboardPageWebElementDisplayed(singleProductCategoryDashboardPage);
        isSearchedProductDashboardPageWebElementDisplayed(singleProductCategoryDashboardPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //single product dashboard text element assert
        isSingleProductCategoryDashboardPageTextElementAsExpected(singleProductCategoryDashboardPage);
        //log searched product dashboard page displayed product data (same exact logger method as for single product category dashboard page)
        logSingleProductCategoryDashboardPageProductData(singleProductCategoryDashboardPage);
        //click 'Add to cart' button
        singleProductCategoryDashboardPage.clickSetProductAddToCartButton(0);
        //capture screenshot of the searched products addition to cart (shopping cart form)
        captureScreenshot(driver, "Searched Product Shopping Cart Form Display (RC Forklift)");
        //shopping cart form web element assert
        isShoppingCartFormWebElementDisplayed(homePage);
        //shopping cart form text element assert
        isShoppingCartFormTextElementAsExpected(homePage);
        //log shopping cart form product data
        logShoppingCartFormProductData(homePage);
        //click shopping cart form 'View Cart' button
        homePage.clickViewCartButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Single Searched Product (RC Forklift) Addition To Cart Test Result (registered user)");
    }

    //multiple searched product addition to cart test

    //add multiple searched products ('R/C Desktop Forklift') to cart test method (as a guest)
    protected void addMultipleSearchedProductToCartGuestTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
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
        //input search query ('R/C Desktop Forklift') into header search bar
        generalPage.inputRCForkliftProductSearchQueryIntoSearchBar();
        //click 'Search' button
        generalPage.clickSearchBarButton();
        //capture screenshot of the searched product dashboard page
        captureScreenshot(driver, "Searched Product Dashboard Page Display");
        //searched product dashboard page web element asserts (with the addition of 'This page URL' link)
        isSingleProductCategoryDashboardPageWebElementDisplayed(singleProductCategoryDashboardPage);
        isSearchedProductDashboardPageWebElementDisplayed(singleProductCategoryDashboardPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //single product dashboard text element assert
        isSingleProductCategoryDashboardPageTextElementAsExpected(singleProductCategoryDashboardPage);
        //log searched product dashboard page displayed product data (same exact logger method as for single product category dashboard page)
        logSingleProductCategoryDashboardPageProductData(singleProductCategoryDashboardPage);
        //click product quantity dropdown menu
        singleProductCategoryDashboardPage.clickSetProductQtyDropdownMenu(0);
        //select set product quantity
        singleProductCategoryDashboardPage.selectSetProductQty(0);
        //set the set review stars review for a product //this product is being already set as rated already (sometimes this bug occurs even though the product hasn't been rated by test yet)
        //singleProductCategoryDashboardPage.selectSetReviewStarsForSetProduct(0);
        //capture screenshot of the multiple searched products review stars setting
        //captureScreenshot(driver, "Multiple Searched Products Review Stars Setting Display");
        //click 'Add to cart' button
        singleProductCategoryDashboardPage.clickSetProductAddToCartButton(0);
        //capture screenshot of the multiple searched products addition to cart (shopping cart form)
        captureScreenshot(driver, "Multiple Searched Products Shopping Cart Form Display");
        //shopping cart form web element assert
        isShoppingCartFormWebElementDisplayed(homePage);
        //shopping cart form text element assert
        isShoppingCartFormTextElementAsExpected(homePage);
        //log shopping cart form product data
        logShoppingCartFormProductData(homePage);
        //click shopping cart form 'View Cart' button
        homePage.clickViewCartButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Multiple Searched Products (RC Desktop Forklift) Addition To Cart Test Result (guest)");
    }
    //add multiple searched products ('R/C Desktop Forklift') to cart test method (as a registered user)
    protected void addMultipleSearchedProductsToCartRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
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
        //click 'Home' navbar link
        generalPage.clickNavbarHomeLink();
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //input search query ('R/C Desktop Forklift') into header search bar
        generalPage.inputRCForkliftProductSearchQueryIntoSearchBar();
        //click 'Search' button
        generalPage.clickSearchBarButton();
        //capture screenshot of the searched product dashboard page
        captureScreenshot(driver, "Searched Product Dashboard Page Display");
        //searched product dashboard page web element asserts (with the addition of 'This page URL' link)
        isSingleProductCategoryDashboardPageWebElementDisplayed(singleProductCategoryDashboardPage);
        isSearchedProductDashboardPageWebElementDisplayed(singleProductCategoryDashboardPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //single product dashboard text element assert
        isSingleProductCategoryDashboardPageTextElementAsExpected(singleProductCategoryDashboardPage);
        //log searched product dashboard page displayed product data (same exact logger method as for single product category dashboard page)
        logSingleProductCategoryDashboardPageProductData(singleProductCategoryDashboardPage);
        //click product quantity dropdown menu
        singleProductCategoryDashboardPage.clickSetProductQtyDropdownMenu(0);
        //select set product quantity
        singleProductCategoryDashboardPage.selectSetProductQty(0);
        //click 'Add to cart' button
        singleProductCategoryDashboardPage.clickSetProductAddToCartButton(0);
        //capture screenshot of the multiple searched products addition to cart (shopping cart form)
        captureScreenshot(driver, "Multiple Searched Product Shopping Cart Form Display (RC Forklift)");
        //shopping cart form web element assert
        isShoppingCartFormWebElementDisplayed(homePage);
        //shopping cart form text element assert
        isShoppingCartFormTextElementAsExpected(homePage);
        //log shopping cart form product data
        logShoppingCartFormProductData(homePage);
        //click shopping cart form 'View Cart' button
        homePage.clickViewCartButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Multiple Searched Product (RC Forklift) Addition To Cart Test Result (registered user)");
    }

    //product addition from products map to cart tests

    //single product

    //add single product ('Antec Nine Hundred ATX Gaming Case') from product map to cart test (as a guest)
    protected void addSingleProductFromProductsMapToCartGuestTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        ProductsMapPage productsMapPage = new ProductsMapPage(driver);
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
        //click 'Products map' aside link
        generalPage.clickAsideProductsMapLink();
        //capture screenshot of the products map display
        captureScreenshot(driver, "Products Map Page Display");
        //products map web element assert
        isProductsMapPageWebElementDisplayed(productsMapPage);
        //products map text element assert
        isProductsMapTextElementAsExpected(productsMapPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //log products map page product data
        logProductsMapPageProductData(productsMapPage);
        //click set product ('Antec Nine Hundred ATX Gaming Case') add to cart button
        productsMapPage.clickProductsMapAddToCartButton(8);
        //capture screenshot of the single searched product addition to cart (shopping cart form)
        captureScreenshot(driver, "Single Product Shopping Cart Form Display (Antec Nine Hundred ATX Gaming Case)");
        //shopping cart form web element assert
        isShoppingCartFormWebElementDisplayed(homePage);
        //shopping cart form text element assert
        isShoppingCartFormTextElementAsExpected(homePage);
        //log shopping cart form product data
        logShoppingCartFormProductData(homePage);
        //click shopping cart form 'View Cart' button
        homePage.clickViewCartButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Single Product (Antec Nine Hundred ATX Gaming Case) Addition From Products Map To Cart Test Result (guest)");
    }
    //add single product ('Apple Dock Connector to USB Cable') from product map to cart test (as a registered user)
    protected void addSingleProductFromProductsMapToCartRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        ProductsMapPage productsMapPage = new ProductsMapPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (this page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //click 'Products map' aside link
        generalPage.clickAsideProductsMapLink();
        //capture screenshot of the products map display
        captureScreenshot(driver, "Products Map Page Display");
        //products map web element assert
        isProductsMapPageWebElementDisplayed(productsMapPage);
        //products map text element assert
        isProductsMapTextElementAsExpected(productsMapPage);
        //log products map page product data
        logProductsMapPageProductData(productsMapPage);
        //click set product ('Apple Dock Connector to USB Cable') add to cart button
        productsMapPage.clickProductsMapAddToCartButton(9);
        //capture screenshot of the single searched product addition to cart (shopping cart form)
        captureScreenshot(driver, "Single Product Shopping Cart Form Display (Apple Dock Connector to USB Cable)");
        //shopping cart form web element assert
        isShoppingCartFormWebElementDisplayed(homePage);
        //shopping cart form text element assert
        isShoppingCartFormTextElementAsExpected(homePage);
        //log shopping cart form product data
        logShoppingCartFormProductData(homePage);
        //click shopping cart form 'View Cart' button
        homePage.clickViewCartButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Single Product (Apple Dock Connector to USB Cable) Addition From Products Map To Cart Test Result (registered user)");
    }

    //multiple products addition from products map to cart tests

    //add multiple products ('Genius Traveler 6000X Ambidextrous Mouse') from product map to cart test (as a guest)
    protected void addMultipleProductsFromProductsMapToCartGuestTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        ProductsMapPage productsMapPage = new ProductsMapPage(driver);
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
        //click 'Products map' aside link
        generalPage.clickAsideProductsMapLink();
        //capture screenshot of the products map display
        captureScreenshot(driver, "Products Map Page Display");
        //products map web element assert
        isProductsMapPageWebElementDisplayed(productsMapPage);
        //products map text element assert
        isProductsMapTextElementAsExpected(productsMapPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //log products map page product data
        logProductsMapPageProductData(productsMapPage);
        //click set product first letter on letter list ('G')
        productsMapPage.clickSetProductFirstLetterOnList(5);
        //capture screenshot of the products map display after set letter selection
        captureScreenshot(driver, "Products Map Page Display After Set First Letter Selection");
        //click set product ('Genius Traveler 6000X Ambidextrous Mouse') quantity dropdown menu
        productsMapPage.clickSetProductQtyDropdownMenu(1);
        //select set product quantity (7)
        productsMapPage.selectSetProductQtySeven(1);
        //click set product ('Genius Traveler 6000X Ambidextrous Mouse') add to cart button
        productsMapPage.clickProductsMapAddToCartButton(1);
        //capture screenshot of the multiple products addition to cart (shopping cart form)
        captureScreenshot(driver, "Multiple Products Shopping Cart Form Display (Genius Traveler 6000X Ambidextrous Mouse)");
        //shopping cart form web element assert
        isShoppingCartFormWebElementDisplayed(homePage);
        //shopping cart form text element assert
        isShoppingCartFormTextElementAsExpected(homePage);
        //log shopping cart form product data
        logShoppingCartFormProductData(homePage);
        //click shopping cart form 'View Cart' button
        homePage.clickViewCartButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Multiple Products (Genius Traveler 6000X Ambidextrous Mouse) Addition From Products Map To Cart Test Result (guest)");
    }
    //add multiple products ('iMac') from product map to cart test (as a registered user)
    protected void addMultipleProductsFromProductsMapToCartRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        ProductsMapPage productsMapPage = new ProductsMapPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (this page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //click 'Products map' aside link
        generalPage.clickAsideProductsMapLink();
        //capture screenshot of the products map display
        captureScreenshot(driver, "Products Map Page Display");
        //products map web element assert
        isProductsMapPageWebElementDisplayed(productsMapPage);
        //products map text element assert
        isProductsMapTextElementAsExpected(productsMapPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //log products map page product data
        logProductsMapPageProductData(productsMapPage);
        //click set product first letter on letter list ('I')
        productsMapPage.clickSetProductFirstLetterOnList(7);
        //capture screenshot of the products map display after set letter selection
        captureScreenshot(driver, "Products Map Page Display After Set First Letter Selection");
        //click set product ('iMac') quantity dropdown menu
        productsMapPage.clickSetProductQtyDropdownMenu(2);
        //select set product quantity (7)
        productsMapPage.selectSetProductQtySeven(2);
        //click set product ('iMac') add to cart button
        productsMapPage.clickProductsMapAddToCartButton(2);
        //capture screenshot of the multiple products addition to cart (shopping cart form)
        captureScreenshot(driver, "Multiple Products Shopping Cart Form Display (iMac)");
        //shopping cart form web element assert
        isShoppingCartFormWebElementDisplayed(homePage);
        //shopping cart form text element assert
        isShoppingCartFormTextElementAsExpected(homePage);
        //log shopping cart form product data
        logShoppingCartFormProductData(homePage);
        //click shopping cart form 'View Cart' button
        homePage.clickViewCartButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Multiple Products (iMac) Addition From Products Map To Cart Test Result (registered user)");
    }

    //single product page product addition to cart tests

    //add single product ('Digital Angel') from single product page to cart test method (as a guest)
    protected void addSingleDigitalAngelProductToCartGuestTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
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
        //click 'Digital Angel' product name link
        homePage.clickFeaturedProductNameLink(1);
        //capture screenshot of the set single product page
        captureScreenshot(driver, "Single Product ('Digital Angel') Page Display");
        //assert the user got onto correct product page
        assertEquals("Digital Angel [Product Options Demo]", singleProductPage.getSingleProductPageTitle(), "The single product page title doesn't match expectations or the user is on the wrong product page.");
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //log single product page data
        logSingleProductPageProductData(singleProductPage);
        //click 'Customers also bought; link
        singleProductPage.clickCustomersAlsoBoughtLink();
        //single product page ('Digital Angel') web element assert
        isSingleProductTShirtPageWebElementDisplayed(singleProductPage);
        //log specific single product page data
        logSingleProductTShirtPageProductData(singleProductPage);
        logSingleProductTShirtPageCustomersBoughtProductData(singleProductPage);
        //click size dropdown menu
        singleProductPage.clickProductSizeDropdownMenu();
        //select 'L' size
        singleProductPage.selectLSizeOption();
        //click 'Add to cart' button
        singleProductPage.clickAddToCartButton();
        //click shopping cart form 'View Cart' button (since the shopping cart form elements somehow are not being seen as in other pages, separate click method is being used)
        singleProductPage.clickViewCartShoppingCartFormButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Single Product ('Digital Angel') From Single Product Page To Cart Test Result (guest)");
    }
    //add single product ('Digital Angel') from single product page to cart test method (as a registered user)
    protected void addSingleDigitalAngelProductToCartRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (this page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //click 'Home' navbar link
        generalPage.clickNavbarHomeLink();
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //click 'Digital Angel' product name link
        homePage.clickFeaturedProductNameLink(1);
        //capture screenshot of the set single product page
        captureScreenshot(driver, "Single Product ('Digital Angel') Page Display");
        //assert the user got onto correct product page
        assertEquals("Digital Angel [Product Options Demo]", singleProductPage.getSingleProductPageTitle(), "The single product page title doesn't match expectations or the user is on the wrong product page.");
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //log single product page data
        logSingleProductPageProductData(singleProductPage);
        //click 'Customers also bought; link
        singleProductPage.clickCustomersAlsoBoughtLink();
        //single product page ('Digital Angel') web element assert
        isSingleProductTShirtPageWebElementDisplayed(singleProductPage);
        //log specific single product page data
        logSingleProductTShirtPageProductData(singleProductPage);
        logSingleProductTShirtPageCustomersBoughtProductData(singleProductPage);
        //click size dropdown menu
        singleProductPage.clickProductSizeDropdownMenu();
        //select 'L' size
        singleProductPage.selectLSizeOption();
        //click 'Add to cart' button
        singleProductPage.clickAddToCartButton();
        //click shopping cart form 'View Cart' button (since the shopping cart form elements somehow are not being seen as in other pages, separate click method is being used)
        singleProductPage.clickViewCartShoppingCartFormButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Single Product ('Digital Angel') From Single Product Page To Cart Test Result (registered user)");
    }

    //single product page multiple products addition to cart tests

    //add multiple products ('Digital Angel') from single product page to cart test method (as a guest)
    protected void addMultipleDigitalAngelProductToCartGuestTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
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
        //click 'Digital Angel' product name link
        homePage.clickFeaturedProductNameLink(1);
        //capture screenshot of the set single product page
        captureScreenshot(driver, "Single Product ('Digital Angel') Page Display");
        //assert the user got onto correct product page
        assertEquals("Digital Angel [Product Options Demo]", singleProductPage.getSingleProductPageTitle(), "The single product page title doesn't match expectations or the user is on the wrong product page.");
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //log single product page data
        logSingleProductPageProductData(singleProductPage);
        //click 'Customers also bought; link
        singleProductPage.clickCustomersAlsoBoughtLink();
        //single product page ('Digital Angel') web element assert
        isSingleProductTShirtPageWebElementDisplayed(singleProductPage);
        //log specific single product page data
        logSingleProductTShirtPageProductData(singleProductPage);
        logSingleProductTShirtPageCustomersBoughtProductData(singleProductPage);
        //click size dropdown menu
        singleProductPage.clickProductSizeDropdownMenu();
        //select 'L' size
        singleProductPage.selectLSizeOption();
        //click product quantity dropdown menu
        singleProductPage.clickProductQtyDropdownMenu();
        //select set product quantity
        singleProductPage.selectThreeProductQtyOption();
        //click 'Add to cart' button
        singleProductPage.clickAddToCartButton();
        //click shopping cart form 'View Cart' button (since the shopping cart form elements somehow are not being seen as in other pages, separate click method is being used)
        singleProductPage.clickViewCartShoppingCartFormButton();
        //wait for elements to load (to prevent Selenium from skipping click 'View Cart' button)
        generalPage.waitForElementsToLoad();
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Multiple Products ('Digital Angel') From Single Product Page To Cart Test Result (guest)");
    }
    //add multiple products ('Digital Angel') from single product page to cart test method (as a registered user)
    protected void addMultipleDigitalAngelProductsToCartRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (this page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //click 'Home' navbar link
        generalPage.clickNavbarHomeLink();
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //click 'Digital Angel' product name link
        homePage.clickFeaturedProductNameLink(1);
        //capture screenshot of the set single product page
        captureScreenshot(driver, "Single Product ('Digital Angel') Page Display");
        //assert the user got onto correct product page
        assertEquals("Digital Angel [Product Options Demo]", singleProductPage.getSingleProductPageTitle(), "The single product page title doesn't match expectations or the user is on the wrong product page.");
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //log single product page data
        logSingleProductPageProductData(singleProductPage);
        //click 'Customers also bought; link
        singleProductPage.clickCustomersAlsoBoughtLink();
        //single product page ('Digital Angel') web element assert
        isSingleProductTShirtPageWebElementDisplayed(singleProductPage);
        //log specific single product page data
        logSingleProductTShirtPageProductData(singleProductPage);
        logSingleProductTShirtPageCustomersBoughtProductData(singleProductPage);
        //click size dropdown menu
        singleProductPage.clickProductSizeDropdownMenu();
        //select 'L' size
        singleProductPage.selectLSizeOption();
        //click product quantity dropdown menu
        singleProductPage.clickProductQtyDropdownMenu();
        //select set product quantity
        singleProductPage.selectThreeProductQtyOption();
        //click 'Add to cart' button
        singleProductPage.clickAddToCartButton();
        //click shopping cart form 'View Cart' button (since the shopping cart form elements somehow are not being seen as in other pages, separate click method is being used)
        singleProductPage.clickViewCartShoppingCartFormButton();
        //wait for elements to load (to prevent Selenium from skipping click 'View Cart' button)
        generalPage.waitForElementsToLoad();
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Multiple Products ('Digital Angel') From Single Product Page To Cart Test Result (registered user)");
    }

    //single product page product/products addition to wishlist tests (only registered user has this feature)

    //add single product ('Digital Angel') from single product page to wishlist test method (as a registered user)
    protected void addSingleDigitalAngelProductToWishlistRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (this page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //click 'Home' navbar link
        generalPage.clickNavbarHomeLink();
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //click 'Digital Angel' product name link
        homePage.clickFeaturedProductNameLink(1);
        //capture screenshot of the set single product page
        captureScreenshot(driver, "Single Product ('Digital Angel') Page Display");
        //assert the user got onto correct product page
        assertEquals("Digital Angel [Product Options Demo]", singleProductPage.getSingleProductPageTitle(), "The single product page title doesn't match expectations or the user is on the wrong product page.");
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //log single product page data
        logSingleProductPageProductData(singleProductPage);
        //click 'Customers also bought; link
        singleProductPage.clickCustomersAlsoBoughtLink();
        //single product page ('Digital Angel') web element assert
        isSingleProductTShirtPageWebElementDisplayed(singleProductPage);
        //log specific single product page data
        logSingleProductTShirtPageProductData(singleProductPage);
        logSingleProductTShirtPageCustomersBoughtProductData(singleProductPage);
        //click size dropdown menu
        singleProductPage.clickProductSizeDropdownMenu();
        //select 'L' size
        singleProductPage.selectLSizeOption();
        //click 'Add to wishlist' button
        singleProductPage.clickAddToWishlistButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Single Product ('Digital Angel') From Single Product Page To Wishlist Test Result (registered user)");
    }
    //add multiple products ('Digital Angel') from single product page to wishlist test method (as a registered user)
    protected void addMultipleDigitalAngelProductsToWishlistRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (this page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //click 'Home' navbar link
        generalPage.clickNavbarHomeLink();
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //click 'Digital Angel' product name link
        homePage.clickFeaturedProductNameLink(1);
        //capture screenshot of the set single product page
        captureScreenshot(driver, "Single Product ('Digital Angel') Page Display");
        //assert the user got onto correct product page
        assertEquals("Digital Angel [Product Options Demo]", singleProductPage.getSingleProductPageTitle(), "The single product page title doesn't match expectations or the user is on the wrong product page.");
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //log single product page data
        logSingleProductPageProductData(singleProductPage);
        //click 'Customers also bought; link
        singleProductPage.clickCustomersAlsoBoughtLink();
        //single product page ('Digital Angel') web element assert
        isSingleProductTShirtPageWebElementDisplayed(singleProductPage);
        //log specific single product page data
        logSingleProductTShirtPageProductData(singleProductPage);
        logSingleProductTShirtPageCustomersBoughtProductData(singleProductPage);
        //click size dropdown menu
        singleProductPage.clickProductSizeDropdownMenu();
        //select 'L' size
        singleProductPage.selectLSizeOption();
        //click product quantity dropdown menu
        singleProductPage.clickProductQtyDropdownMenu();
        //select set product quantity
        singleProductPage.selectThreeProductQtyOption();
        //click 'Add to wishlist' button
        singleProductPage.clickAddToWishlistButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Multiple Products ('Digital Angel') From Single Product Page To Wishlist Test Result (registered user)");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //single product category dashboard page addition to cart tests

    //add single product category to cart test method (as a guest)
    protected void addSingleProductCategoryProductToCartTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        ProductsMapPage productsMapPage = new ProductsMapPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
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
        //click 'Books' aside link
        generalPage.clickAsideBooksLink();
        //capture screenshot of the single category product dashboard page display
        captureScreenshot(driver, "Single Category Product Dashboard (Books) Page Display");
        //assert the user gets onto expected category page
        assertEquals("Books", singleProductCategoryDashboardPage.getSingleProductCategoryDashboardPageTitle(), "The single category product page dashboard page title doesn't match expectations or the user is on the wrong category page.");
        assertEquals("My Description of the category", singleProductCategoryDashboardPage.getSingleProductCategoryDashboardPageDescription(), "The single category product page dashboard page subtitle doesn't match expectations or the user is on the wrong category page.");
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //log single category product dashboard page product data
        logProductsMapPageProductData(productsMapPage);
        //click 'Sort by product' link
        singleProductCategoryDashboardPage.clickSortByProductLink();
        //click set product ('Anna Karenina') add to cart button
        productsMapPage.clickProductsMapAddToCartButton(0);
        //capture screenshot of the single searched product addition to cart (shopping cart form)
        captureScreenshot(driver, "Single Product Shopping Cart Form Display (Anna Karenina)");
        //shopping cart form web element assert
        isShoppingCartFormWebElementDisplayed(homePage);
        //shopping cart form text element assert
        isShoppingCartFormTextElementAsExpected(homePage);
        //log shopping cart form product data
        logShoppingCartFormProductData(homePage);
        //click shopping cart form 'View Cart' button
        homePage.clickViewCartButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Single Product (by Category) (Anna Karenina) Addition To Cart Test Result (guest)");
    }
    //add single category product ('Anna Karenina') to cart test (as a registered user)
    protected void addSingleProductCategoryToCartRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        ProductsMapPage productsMapPage = new ProductsMapPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (this page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //click 'Books' aside link
        generalPage.clickOtherAsideBooksLink();
        //capture screenshot of the single category product dashboard page display
        captureScreenshot(driver, "Single Category Product Dashboard (Books) Page Display");
        //assert the user gets onto expected category page
        assertEquals("Books", singleProductCategoryDashboardPage.getSingleProductCategoryDashboardPageTitle(), "The single category product page dashboard page title doesn't match expectations or the user is on the wrong category page.");
        assertEquals("My Description of the category", singleProductCategoryDashboardPage.getSingleProductCategoryDashboardPageDescription(), "The single category product page dashboard page description doesn't match expectations or the user is on the wrong category page.");
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //log single category product dashboard page product data
        logProductsMapPageProductData(productsMapPage);
        //click 'Sort by product' link
        singleProductCategoryDashboardPage.clickSortByProductLink();
        //click set product ('Anna Karenina') add to cart button
        productsMapPage.clickProductsMapAddToCartButton(0);
        //capture screenshot of the single searched product addition to cart (shopping cart form)
        captureScreenshot(driver, "Single Product Shopping Cart Form Display (Anna Karenina)");
        //shopping cart form web element assert
        isShoppingCartFormWebElementDisplayed(homePage);
        //shopping cart form text element assert
        isShoppingCartFormTextElementAsExpected(homePage);
        //log shopping cart form product data
        logShoppingCartFormProductData(homePage);
        //click shopping cart form 'View Cart' button
        homePage.clickViewCartButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Single Product (by Category) (Anna Karenina) Addition To Cart Test Result (registered user)");
    }

    //multiple single category products addition to cart tests

    //add multiple product category products ('The Lord of the Rings: 50th Anniversary, One Vol. Edition') to cart test (as a guest)
    protected void addSetProductCategoryMultipleProductsToCartTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        ProductsMapPage productsMapPage = new ProductsMapPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
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
        //click 'Books' aside link
        generalPage.clickAsideBooksLink();
        //capture screenshot of the single category product dashboard page display
        captureScreenshot(driver, "Single Category Product Dashboard (Books) Page Display");
        //assert the user gets onto expected category page
        assertEquals("Books", singleProductCategoryDashboardPage.getSingleProductCategoryDashboardPageTitle(), "The single category product page dashboard page title doesn't match expectations or the user is on the wrong category page.");
        assertEquals("My Description of the category", singleProductCategoryDashboardPage.getSingleProductCategoryDashboardPageDescription(), "The single category product page dashboard page subtitle doesn't match expectations or the user is on the wrong category page.");
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //log single category product dashboard page product data
        logProductsMapPageProductData(productsMapPage);
        //click 'Sort by sales' link
        singleProductCategoryDashboardPage.clickSortBySalesLink();
        //click set product ('The Lord of the Rings: 50th Anniversary, One Vol. Edition') quantity dropdown menu
        productsMapPage.clickSetProductQtyDropdownMenu(0);
        //select set product quantity (7)
        productsMapPage.selectSetProductQtySeven(0);
        //click set product ('The Lord of the Rings: 50th Anniversary, One Vol. Edition') add to cart button
        productsMapPage.clickProductsMapAddToCartButton(0);
        //capture screenshot of the multiple searched product addition to cart (shopping cart form)
        captureScreenshot(driver, "Multiple Products Shopping Cart Form Display (The Lord of the Rings)");
        //shopping cart form web element assert
        isShoppingCartFormWebElementDisplayed(homePage);
        //shopping cart form text element assert
        isShoppingCartFormTextElementAsExpected(homePage);
        //log shopping cart form product data
        logShoppingCartFormProductData(homePage);
        //click shopping cart form 'View Cart' button
        homePage.clickViewCartButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Multiple Products (by Category) (The Lord of the Rings) Addition To Cart Test Result (guest)");
    }
    //add multiple single category products ('The Lord of the Rings: 50th Anniversary, One Vol. Edition') to cart test (as a registered user)
    protected void addSetProductCategoryMultipleProductsToCartRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        ProductsMapPage productsMapPage = new ProductsMapPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (this page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //click 'Books' aside link
        generalPage.clickOtherAsideBooksLink();
        //capture screenshot of the single category product dashboard page display
        captureScreenshot(driver, "Single Category Product Dashboard (Books) Page Display");
        //assert the user gets onto expected category page
        assertEquals("Books", singleProductCategoryDashboardPage.getSingleProductCategoryDashboardPageTitle(), "The single category product page dashboard page title doesn't match expectations or the user is on the wrong category page.");
        assertEquals("My Description of the category", singleProductCategoryDashboardPage.getSingleProductCategoryDashboardPageDescription(), "The single category product page dashboard page description doesn't match expectations or the user is on the wrong category page.");
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //log single category product dashboard page product data
        logProductsMapPageProductData(productsMapPage);
        //click 'Sort by product' link
        singleProductCategoryDashboardPage.clickSortByProductLink();
        //click set product ('The Lord of the Rings: 50th Anniversary, One Vol. Edition') quantity dropdown menu
        productsMapPage.clickSetProductQtyDropdownMenu(4);
        //select set product quantity
        productsMapPage.selectSetProductQtySeven(4);
        //click set product ('The Lord of the Rings: 50th Anniversary, One Vol. Edition') add to cart button
        productsMapPage.clickProductsMapAddToCartButton(4);
        //capture screenshot of the multiple searched products addition to cart (shopping cart form)
        captureScreenshot(driver, "Multiple Product Shopping Cart Form Display (The Lord of the Rings)");
        //shopping cart form web element assert
        isShoppingCartFormWebElementDisplayed(homePage);
        //shopping cart form text element assert
        isShoppingCartFormTextElementAsExpected(homePage);
        //log shopping cart form product data
        logShoppingCartFormProductData(homePage);
        //click shopping cart form 'View Cart' button
        homePage.clickViewCartButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Multiple Products (by singular Category) (The Lord of the Rings) Addition To Cart Test Result (registered user)");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //featured product addition to wishlist tests

    //add featured product ('Thumb-Size R/C Mini Cooper [Detailed Images Demo]') to wishlist test method (only registered user has this feature)
    protected void addFeaturedProductToWishlistRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        WishlistPage wishlistPage = new WishlistPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (this page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //click 'Home' navbar link
        generalPage.clickNavbarHomeLink();
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //click set product ('Thumb-Size R/C Mini Cooper [Detailed Images Demo]') add to wishlist button
        homePage.clickFeaturedProductAddToWishlistButton(2);
        //wishlist page web element assert
        isWishlistPageWebElementDisplayed(wishlistPage);
        //wishlist page text element assert
        isWishlistPageTextElementAsExpected(wishlistPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //log wishlist page product data
        logWishlistPageProductData(wishlistPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Single Featured Product (Thumb-Size RC Mini Cooper) Add To Wishlist Test Result");
    }
    //add multiple featured products ('Thumb-Size R/C Mini Cooper [Detailed Images Demo]') to wishlist test method (only registered user has this feature)
    protected void addMultipleFeaturedProductsToWishlistRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        WishlistPage wishlistPage = new WishlistPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (this page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //click 'Home' navbar link
        generalPage.clickNavbarHomeLink();
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //set featured product quantity
        homePage.selectFeaturedProductQty(2);
        //click set product ('Thumb-Size R/C Mini Cooper [Detailed Images Demo]') add to wishlist button
        homePage.clickFeaturedProductAddToWishlistButton(2);
        //wishlist page web element assert
        isWishlistPageWebElementDisplayed(wishlistPage);
        //wishlist page text element assert
        isWishlistPageTextElementAsExpected(wishlistPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //log wishlist page product data
        logWishlistPageProductData(wishlistPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Multiple Featured Products (Thumb-Size RC Mini Cooper) Add To Wishlist Test Result");
    }

    //featured product addition to cart from wishlist tests

    //add featured product ('Thumb-Size R/C Mini Cooper [Detailed Images Demo]') from wishlist to cart test method (only registered user has this feature)
    protected void addFeaturedProductFromWishlistToCartRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        WishlistPage wishlistPage = new WishlistPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (this page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //click 'Home' navbar link
        generalPage.clickNavbarHomeLink();
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //click set product ('Thumb-Size R/C Mini Cooper [Detailed Images Demo]') add to wishlist button
        homePage.clickFeaturedProductAddToWishlistButton(2);
        //wishlist page web element assert
        isWishlistPageWebElementDisplayed(wishlistPage);
        //wishlist page text element assert
        isWishlistPageTextElementAsExpected(wishlistPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //log wishlist page product data
        logWishlistPageProductData(wishlistPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Wishlist Page Display");
        //click 'Add to cart' product button
        wishlistPage.clickAddToCartFromWishlistButton(0);
        //capture screenshot of the test result
        captureScreenshot(driver, "Single Featured Product (Thumb-Size RC Mini Cooper) Add To Cart From Wishlist Test Result");
    }
    //add multiple featured products ('Thumb-Size R/C Mini Cooper [Detailed Images Demo]') to cart from wishlist test method (only registered user has this feature)
    protected void addMultipleFeaturedProductsToCartFromWishlistRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        WishlistPage wishlistPage = new WishlistPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (this page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //click 'Home' navbar link
        generalPage.clickNavbarHomeLink();
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //set featured product quantity
        homePage.selectFeaturedProductQty(2);
        //click set product ('Thumb-Size R/C Mini Cooper [Detailed Images Demo]') add to wishlist button
        homePage.clickFeaturedProductAddToWishlistButton(2);
        //wishlist page web element assert
        isWishlistPageWebElementDisplayed(wishlistPage);
        //wishlist page text element assert
        isWishlistPageTextElementAsExpected(wishlistPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //log wishlist page product data
        logWishlistPageProductData(wishlistPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Wishlist Page Display");
        //click 'Add to cart' product button
        wishlistPage.clickAddToCartFromWishlistButton(0);
        //capture screenshot of the test result
        captureScreenshot(driver, "Multiple Featured Products (Thumb-Size RC Mini Cooper) Add To Cart From Wishlist Test Result");
    }

    //update product quantity in wishlist test

    //update featured product quantity ('Thumb-Size R/C Mini Cooper [Detailed Images Demo]') in wishlist test method (only registered user has this feature)
    protected void updateFeaturedProductQtyInWishlistRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        WishlistPage wishlistPage = new WishlistPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (this page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //click 'Home' navbar link
        generalPage.clickNavbarHomeLink();
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //click set product ('Thumb-Size R/C Mini Cooper [Detailed Images Demo]') add to wishlist button
        homePage.clickFeaturedProductAddToWishlistButton(2);
        //wishlist page web element assert
        isWishlistPageWebElementDisplayed(wishlistPage);
        //wishlist page text element assert
        isWishlistPageTextElementAsExpected(wishlistPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //log wishlist page product data
        logWishlistPageProductData(wishlistPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Wishlist Page Display");
        //update product quantity
        wishlistPage.updateWishlistProductQuantity(0);
        //click 'Update' button
        wishlistPage.clickUpdateWishlistButton(0);
        //capture screenshot of the test result
        captureScreenshot(driver, "Single Featured Product (Thumb-Size RC Mini Cooper) Quantity Update In Wishlist Test Result");
    }

    //remove product from wishlist test

    //remove featured product from wishlist test method
    protected void removeFeaturedProductFromWishlistRegUserTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        HomePage homePage = new HomePage(driver);
        AccountPage accountPage = new AccountPage(driver);
        WishlistPage wishlistPage = new WishlistPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page aside section web element assert (this page has an additional div in aside categories section)
        isGeneralOtherPageAsideWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //additional general page web element assert
        isAddGeneralPageWebElementDisplayed(generalPage);
        //additional general page text element assert
        isAddGeneralPageTextElementAsExpected(generalPage);
        //click 'Home' navbar link
        generalPage.clickNavbarHomeLink();
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //log home page product data
        logHomePageProductData(homePage);
        //click set product ('Thumb-Size R/C Mini Cooper [Detailed Images Demo]') add to wishlist button
        homePage.clickFeaturedProductAddToWishlistButton(2);
        //wishlist page web element assert
        isWishlistPageWebElementDisplayed(wishlistPage);
        //wishlist page text element assert
        isWishlistPageTextElementAsExpected(wishlistPage);
        //account page breadcrumb web element assert
        isAccountPageBreadcrumbDisplayed(accountPage);
        //log wishlist page product data
        logWishlistPageProductData(wishlistPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Wishlist Page Display");
        //remove product from wishlist page
        wishlistPage.clickProductRemoveFromWishlistButton(0);
        //assert the user gets an expected message
        assertEquals("Your wish list is empty", wishlistPage.getWishlistPageEmptyMessage(), "The wishlist is empty message doesn't match expectations or the product removal from wishlist has failed.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Remove Featured Product (Thumb-Size RC Mini Cooper) From Wishlist Test Result");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //product addition (with available product details) to check out test method (as a guest -> both single and multiple products)
    protected void addIphoneProductToCheckoutWithOptionsGuestTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //shopping cart web element asserts
        isShoppingCartPageWebElementDisplayed(shoppingCartPage);
        isShoppingCartProductDetailsSectionWebElementDisplayed(shoppingCartPage);
        //shopping cart text element assert
        isShoppingCartPageTextElementAsExpected(shoppingCartPage);
        //log shopping cart product details data
        logShoppingCartPageProductDetailsData(shoppingCartPage);
        //log shopping cart product data
        logShoppingCartPageProductData(shoppingCartPage);
        //capture screenshot of shopping cart page display
        captureScreenshot(driver, "Shopping Cart Display");
        //click 'Edit options' link
        shoppingCartPage.clickEditOptionsLink(0);
        //capture screenshot of options form
        captureScreenshot(driver, "Shopping Cart Iphone Options Form Display");
        //click 'Capacity' dropdown menu
        shoppingCartPage.clickCapacityDropdownMenu();
        //select '32 GB' option
        shoppingCartPage.select32GBOption();
        //click 'Color' dropdown menu
        shoppingCartPage.clickColorDropdownMenu();
        //select 'Yellow' color option
        shoppingCartPage.selectYellowColorOption();
        //click 'Update' button
        shoppingCartPage.clickUpdateProductDetailsButton();
        //capture screenshot of updated product data
        captureScreenshot(driver, "Shopping Cart Updated Iphone Product Details");
        //log shopping cart product details data (for confirmation)
        logShoppingCartPageProductDetailsData(shoppingCartPage);
        //log shopping cart product data (for confirmation)
        logShoppingCartPageProductData(shoppingCartPage);
        //click upper 'Checkout' button
        shoppingCartPage.clickUpperCheckoutButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Add Iphone Product To Checkout Test Result");
    }

    //product addition to check out (with clicking lower checkout button) test method (as a registered user -> both single and multiple products)
    protected void addProductToCheckoutLowerButtonTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //shopping cart web element assert
        isShoppingCartPageWebElementDisplayed(shoppingCartPage);
        //shopping cart text element assert
        isShoppingCartPageTextElementAsExpected(shoppingCartPage);
        //log shopping cart product data
        logShoppingCartPageProductData(shoppingCartPage);
        //capture screenshot of shopping cart page display
        captureScreenshot(driver, "Shopping Cart Display (register user)");
        //click lower 'Checkout' button
        shoppingCartPage.clickLowerCheckoutButton();
        //assert if the error message appears if the order total amount is less than $10, log the issue otherwise
        try {
            if(shoppingCartPage.isShoppingCartTenDollarLimitErrorMessageDisplayed()){
                assertEquals("Error: A minimum order subtotal of $10.00 is required to checkout.\n" + "Please review your cart.", shoppingCartPage.getShoppingCartTenDollarErrorMessage(), "The shopping cart 10 dollar error message doesn't match expectations");
            }
        } catch (Exception e) {
            System.out.println("No error message displayed as expected for orders meeting the minimum amount");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Product Addition To Checkout Test Result (registered user)");
    }

    //product addition  to check out test method (as a guest -> both single and multiple products)
    protected void addProductToCheckoutTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //shopping cart web element assert
        isShoppingCartPageWebElementDisplayed(shoppingCartPage);
        //shopping cart text element assert
        isShoppingCartPageTextElementAsExpected(shoppingCartPage);
        //log shopping cart product data
        logShoppingCartPageProductData(shoppingCartPage);
        //capture screenshot of shopping cart page display
        captureScreenshot(driver, "Shopping Cart Display (guest)");
        //click upper 'Checkout' button
        shoppingCartPage.clickUpperCheckoutButton();
        //assert if the error message appears if the order total amount is less than $10
        try {
            if(shoppingCartPage.isShoppingCartTenDollarLimitErrorMessageDisplayed()){
                assertEquals("Error: A minimum order subtotal of $10.00 is required to checkout.\n" + "Please review your cart.", shoppingCartPage.getShoppingCartTenDollarErrorMessage(), "The shopping cart 10 dollar error message doesn't match expectations");
            }
        } catch (Exception e) {
            System.out.println("No error message displayed as expected for orders meeting the minimum amount");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Product Addition To Checkout Test Result (guest)");
    }

    //update product count in shopping cart test method (as a guest only -> registered user will have the same result)
    protected void updateShoppingCartQuantityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //shopping cart web element assert
        isShoppingCartPageWebElementDisplayed(shoppingCartPage);
        //shopping cart text element assert
        isShoppingCartPageTextElementAsExpected(shoppingCartPage);
        //shopping cart web element asserts
        isShoppingCartPageWebElementDisplayed(shoppingCartPage);
        isShoppingCartProductDetailsSectionWebElementDisplayed(shoppingCartPage);
        //shopping cart text element assert
        isShoppingCartPageTextElementAsExpected(shoppingCartPage);
        //log shopping cart product details data
        logShoppingCartPageProductDetailsData(shoppingCartPage);
        //log shopping cart product data
        logShoppingCartPageProductData(shoppingCartPage);
        //capture screenshot of shopping cart page display
        captureScreenshot(driver, "Shopping Cart Display Before Quantity Update");
        //change product quantity
        shoppingCartPage.changeShoppingCartProductQty(0);
        //click 'Update' cart button
        shoppingCartPage.clickUpdateCartButton();
        //log shopping cart product data
        logShoppingCartPageProductData(shoppingCartPage);
        //capture screenshot of product quantity update in shopping cart page
        captureScreenshot(driver, "Updated Product Quantity in Shopping Cart");
        //click upper 'Checkout' button
        shoppingCartPage.clickUpperCheckoutButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Recently Updated Product (by quantity) Addition To Checkout Test Result");
    }

    //remove product from shopping cart test method (as a guest only -> registered user will have the same result)
    protected void removeProductFromShoppingCartTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //shopping cart web element assert
        isShoppingCartPageWebElementDisplayed(shoppingCartPage);
        //shopping cart text element assert
        isShoppingCartPageTextElementAsExpected(shoppingCartPage);
        //log shopping cart product data
        logShoppingCartPageProductData(shoppingCartPage);
        //capture screenshot of shopping cart page display
        captureScreenshot(driver, "Shopping Cart Display Before Product Removal");
        //click 'Product remove' cart button
        shoppingCartPage.clickProductRemoveButton(0);
        //capture screenshot of shopping cart page display
        captureScreenshot(driver, "Shopping Cart Display After Product Removal");
        //assert the user gets the expected message
        assertEquals("Your shopping cart is empty", shoppingCartPage.getShoppingEmptyMessage(), "The shopping cart is empty message doesn't match expectations.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Product Removal From Shopping Cart Test Result");
    }

    //move product from shopping cart to wishlist test method (only registered user has this feature)
    protected void moveProductFromShoppingCartToWishlistTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        WishlistPage wishlistPage = new WishlistPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //shopping cart web element assert
        isShoppingCartPageWebElementDisplayed(shoppingCartPage);
        //shopping cart text element assert
        isShoppingCartPageTextElementAsExpected(shoppingCartPage);
        //log shopping cart product data
        logShoppingCartPageProductData(shoppingCartPage);
        //capture screenshot of shopping cart page display
        captureScreenshot(driver, "Shopping Cart Display Before Moving Product To Wishlist");
        //click 'Product remove' cart button
        shoppingCartPage.clickMoveToWishlistButton(0);
        //capture screenshot of shopping cart page display after moving the product to wishlist
        captureScreenshot(driver, "Shopping Cart Display After Product Moving Product To Wishlist");
        //click 'My Account' header link
        generalPage.clickHeaderMyAccountLink();
        //click 'Wishlist' account page navbar link
        accountPage.clickWishlistLink();
        //wishlist page web element assert
        isWishlistPageWebElementDisplayed(wishlistPage);
        //wishlist page text element assert
        isWishlistPageTextElementAsExpected(wishlistPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Move Product From Shopping Cart To Wishlist Test Result");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid guest product checkout confirmation test method (both for single / multiple products)
    protected void validGuestProductCheckoutConfirmationTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //valid guest account data input getter
        checkoutPage.validGuestAccountInputDataGetter();
        //input valid guest first name into first name input field
        checkoutPage.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPage.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPage.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPage.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPage.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPage.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //log order summary data
        logCheckoutPageOrderSummaryData(checkoutPage);
        //click 'Accept Terms' checkbox
        checkoutPage.clickAcceptTermsCheckbox();
        //click 'Submit order' button
        checkoutPage.clickSubmitOrderButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Guest Checkout Confirmation Test Result");
    }

    //valid guest product checkout confirmation test method (billing and shipping address) (both for single / multiple products)
    protected void validGuestProductBillAndShipAddressCheckoutConfirmationTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //valid guest account data input getter
        checkoutPage.validGuestAccountInputDataGetter();
        //input valid guest first name into first name input field
        checkoutPage.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPage.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPage.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPage.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPage.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPage.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (billing address)");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //valid guest account data input getter (shipping address section)
        checkoutPage.validGuestAccountShipAddressInputDataGetter();
        //input valid guest first name into first name input field (shipping address section)
        checkoutPage.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPage.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPage.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPage.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPage.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (shipping address)");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //log order summary data
        logCheckoutPageOrderSummaryData(checkoutPage);
        //click 'Accept Terms' checkbox
        checkoutPage.clickAcceptTermsCheckbox();
        //click 'Submit order' button
        checkoutPage.clickSubmitOrderButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Guest Checkout Confirmation Test Result (billing and shipping address)");
    }

    //valid guest product with fax ordering checkout confirmation test method (applicable to any product count)
    protected void validGuestProductFaxOrderCheckoutConfirmationTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //valid guest account data input getter
        checkoutPage.validGuestAccountInputDataGetter();
        //input valid guest first name into first name input field
        checkoutPage.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPage.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPage.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPage.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPage.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPage.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //log order summary data
        logCheckoutPageOrderSummaryData(checkoutPage);
        //click 'Fax ordering' radio button
        checkoutPage.clickFaxOrderingRadioButton();
        //log order summary without price surcharge data (for confirmation)
        logCheckoutPageOrderSummaryNoSurchargeData(checkoutPage);
        //click 'Accept Terms' checkbox
        checkoutPage.clickAcceptTermsCheckbox();
        //click 'Submit order' button
        checkoutPage.clickSubmitOrderButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Guest Checkout (With Fax Ordering Payment Method) Confirmation Test Result");
    }

    //valid guest product with example shipping delivery method 1 and money order checkout confirmation test method (applicable to any product count)
    protected void validGuestProductExDeliveryOneAndMoneyOrderCheckoutConfirmationTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //valid guest account data input getter
        checkoutPage.validGuestAccountInputDataGetter();
        //input valid guest first name into first name input field
        checkoutPage.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPage.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPage.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPage.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPage.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPage.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //log order summary data
        logCheckoutPageOrderSummaryData(checkoutPage);
        //click 'Example shipping delivery method 1' radio button
        checkoutPage.clickExampleDelivery1RadioButton();
        //click 'Money order' radio button
        checkoutPage.clickMoneyOrderRadioButton();
        //log order summary without price surcharge data (for confirmation)
        logCheckoutPageOrderSummaryNoSurchargeData(checkoutPage);
        //click 'Accept Terms' checkbox
        checkoutPage.clickAcceptTermsCheckbox();
        //click 'Submit order' button
        checkoutPage.clickSubmitOrderButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Guest Checkout (With Example Shipping Delivery Method 1 and Money Order Payment Method) Confirmation Test Result");
    }

    //registered user product checkout confirmation test method (both for single / multiple products)
    protected void validRegUserProductCheckoutConfirmationTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (registered user)");
        //checkout page registered user specific parts web element assert
        isCheckoutPageRegUserWebElementDisplayed(checkoutPage);
        //checkout page registered user specific parts text element assert
        isCheckoutPageRegUserTextElementAsExpected(checkoutPage);
        //log order summary data
        logCheckoutPageOrderSummaryData(checkoutPage);
        //click 'Accept Terms' checkbox
        checkoutPage.clickAcceptTermsCheckbox();
        //click 'Submit order' button
        checkoutPage.clickSubmitOrderButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Registered User Checkout Confirmation Test Result");
    }

    //registered user product checkout with example method 2 confirmation test method (applicable to any product count)
    protected void validRegUserProductCheckoutWithExMethodTwoConfirmationTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (registered user)");
        //checkout page registered user specific parts web element assert
        isCheckoutPageRegUserWebElementDisplayed(checkoutPage);
        //checkout page registered user specific parts text element assert
        isCheckoutPageRegUserTextElementAsExpected(checkoutPage);
        //log order summary data
        logCheckoutPageOrderSummaryData(checkoutPage);
        //click shipping method 'Example delivery method two' radio button
        checkoutPage.clickExampleDelivery2RadioButton();
        //log order summary data (for confirmation of applied changes)
        logCheckoutPageOrderSummaryData(checkoutPage);
        //click 'Accept Terms' checkbox
        checkoutPage.clickAcceptTermsCheckbox();
        //click 'Submit order' button
        checkoutPage.clickSubmitOrderButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Registered User Checkout (Example Shipping Method 2) Confirmation Test Result");
    }

    //invalid guest checkout confirmation tests (the checkout form doesn't allow no singular input tests - 'Submit' button stays inactive so no singular input tests are skipped)

    //too short singular input

    //invalid guest product checkout confirmation test method (billing and shipping address) - too short billing first name (1 char)
    protected void invalidGuestBillAndShipAddressCheckoutTooShortBillFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too short billing first name (1 char)
        checkoutPageTooShortSingularInput.invalidGuestAccountInputDataTooShortBillFirstNameGetter();
        //input too short guest first name into first name input field (1 char)
        checkoutPageTooShortSingularInput.inputTooShortGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooShortSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooShortSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooShortSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooShortSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooShortSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (billing address) - Too Short Billing First Name");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (shipping address)");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("First name is too short.", checkoutPageTooShortSingularInput.getSingularInputErrorMessage(), "The too short billing address first name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short billing address first name input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Short Billing First Name");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - too short billing last name (1 char)
    protected void invalidGuestBillAndShipAddressCheckoutTooShortBillLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too short billing last name (1 char)
        checkoutPageTooShortSingularInput.invalidGuestAccountInputDataTooShortBillLastNameGetter();
        //input valid guest first name into first name input field
        checkoutPageTooShortSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input too short guest last name into last name input field (1 char)
        checkoutPageTooShortSingularInput.inputTooShortGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooShortSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooShortSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooShortSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooShortSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (billing address) - Too Short Billing Last Name");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (shipping address)");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Last name is too short.", checkoutPageTooShortSingularInput.getSingularInputErrorMessage(), "The too short billing address last name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short billing address last name input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Short Billing Last Name");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - too short billing address (4 chars)
    protected void invalidGuestBillAndShipAddressCheckoutTooShortBillAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too short billing address (4 chars)
        checkoutPageTooShortSingularInput.invalidGuestAccountInputDataTooShortBillAddressGetter();
        //input valid guest first name into first name input field
        checkoutPageTooShortSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooShortSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input too short guest address 1 into address 1 input field (4 chars)
        checkoutPageTooShortSingularInput.inputTooShortGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooShortSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooShortSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooShortSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (billing address) - Too Short Billing Address");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (shipping address)");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Address1 is too short.", checkoutPageTooShortSingularInput.getSingularInputErrorMessage(), "The too short billing address input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short billing address input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Short Billing Address");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - too short billing city (2 chars)
    protected void invalidGuestBillAndShipAddressCheckoutTooShortBillCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too short billing city (2 chars)
        checkoutPageTooShortSingularInput.invalidGuestAccountInputDataTooShortBillCityGetter();
        //input valid guest first name into first name input field
        checkoutPageTooShortSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooShortSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooShortSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input too short guest city into city input field (2 chars)
        checkoutPageTooShortSingularInput.inputTooShortGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooShortSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooShortSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (billing address) - Too Short Billing City");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (shipping address)");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("City is too short.", checkoutPageTooShortSingularInput.getSingularInputErrorMessage(), "The too short billing address city  input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short billing address city input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Short Billing City");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - too short billing post code (4 digits)
    protected void invalidGuestBillAndShipAddressCheckoutTooShortBillPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too short billing post code (4 digits)
        checkoutPageTooShortSingularInput.invalidGuestAccountInputDataTooShortBillPostCodeGetter();
        //input valid guest first name into first name input field
        checkoutPageTooShortSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooShortSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooShortSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooShortSingularInput.inputValidGuestCityIntoCityInputField();
        //input too short guest post code into post code input field (4 digits)
        checkoutPageTooShortSingularInput.inputTooShortGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooShortSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (billing address) - Too Short Billing Post Code");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (shipping address)");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Warning\n" + "\n" + "Make sure that you have 5 digits in your billing address zip code", checkoutPageTooShortSingularInput.getCheckoutSingularInputErrorBoxMessage(), "The too short billing address post code input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short billing address post code input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Short Billing Post Code");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - too short billing email (1 char -> name, domain)
    protected void invalidGuestBillAndShipAddressCheckoutTooShortBillEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too short billing email (1 char -> name, domain)
        checkoutPageTooShortSingularInput.invalidGuestAccountInputDataTooShortBillEmailGetter();
        //input valid guest first name into first name input field
        checkoutPageTooShortSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooShortSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooShortSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooShortSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooShortSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input too short guest email into email input field (1 char -> name, domain)
        checkoutPageTooShortSingularInput.inputTooShortGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (billing address) - Too Short Billing Email");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (shipping address)");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Email address is too short.", checkoutPageTooShortSingularInput.getCheckoutSingularInputErrorBoxMessage(), "The too short billing address email input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short billing address email input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Short Billing Email");
    }

    //invalid guest product checkout confirmation test method (billing and shipping address) - too short shipping first name (1 char)
    protected void invalidGuestBillAndShipAddressCheckoutTooShortShipFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too short shipping first name (1 char)
        checkoutPageTooShortSingularInput.invalidGuestAccountInputDataTooShortShipFirstNameGetter();
        //input valid guest first name into first name input field
        checkoutPageTooShortSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooShortSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooShortSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooShortSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooShortSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooShortSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (billing address)");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input too short guest first name into first name input field (shipping address section) (1 char)
        checkoutPageTooShortSingularInput.inputTooShortGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (shipping address) - No Shipping First Name");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("First name is too short.", checkoutPageTooShortSingularInput.getCheckoutSingularInputErrorBoxMessage(), "The too short shipping address first name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short shipping address first name input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Short Shipping First Name");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - too short shipping last name (1 char)
    protected void invalidGuestBillAndShipAddressCheckoutTooShortShipLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too short shipping last name (1 char)
        checkoutPageTooShortSingularInput.invalidGuestAccountInputDataTooShortShipLastNameGetter();
        //input valid guest first name into first name input field
        checkoutPageTooShortSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooShortSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooShortSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooShortSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooShortSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooShortSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (billing address)");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input too short guest last name into last name input field (shipping address section) (1 char)
        checkoutPageTooShortSingularInput.inputTooShortGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (shipping address) - Too Short Shipping Last Name");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Last name is too short.", checkoutPageTooShortSingularInput.getCheckoutSingularInputErrorBoxMessage(), "The too short shipping address last name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short shipping address last name input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Short Shipping Last Name");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - too short shipping address (4 chars)
    protected void invalidGuestBillAndShipAddressCheckoutTooShortShipAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too short shipping address (4 chars)
        checkoutPageTooShortSingularInput.invalidGuestAccountInputDataTooShortShipAddressGetter();
        //input valid guest first name into first name input field
        checkoutPageTooShortSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooShortSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooShortSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooShortSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooShortSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooShortSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (billing address)");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipLastNameIntoLastNameInputField();
        //input too short guest address 1 into address 1 input field (shipping address section) (4 chars)
        checkoutPageTooShortSingularInput.inputTooShortGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (shipping address) - Too Short Shipping Address");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Address is too short.", checkoutPageTooShortSingularInput.getCheckoutSingularInputErrorBoxMessage(), "The too short shipping address input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short shipping address input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Short Shipping Address");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - too short shipping city (2 chars)
    protected void invalidGuestBillAndShipAddressCheckoutTooShortShipCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too short shipping city (2 chars)
        checkoutPageTooShortSingularInput.invalidGuestAccountInputDataTooShortShipCityGetter();
        //input valid guest first name into first name input field
        checkoutPageTooShortSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooShortSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooShortSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooShortSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooShortSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooShortSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (billing address)");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipAddress1IntoAddress1InputField();
        //input too short guest city into city input field (shipping address section) (2 chars)
        checkoutPageTooShortSingularInput.inputTooShortGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (shipping address) - Too Short Shipping City");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("City is too short.", checkoutPageTooShortSingularInput.getCheckoutSingularInputErrorBoxMessage(), "The too short shipping address city input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short shipping address city input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Short Shipping City");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - too short shipping post code (4 digits)
    protected void invalidGuestBillAndShipAddressCheckoutTooShortShipPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooShortSingularInput checkoutPageTooShortSingularInput = new CheckoutPageTooShortSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too short shipping post code (4 digits)
        checkoutPageTooShortSingularInput.invalidGuestAccountInputDataTooShortShipPostCodeGetter();
        //input valid guest first name into first name input field
        checkoutPageTooShortSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooShortSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooShortSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooShortSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooShortSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooShortSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (billing address)");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageTooShortSingularInput.inputValidGuestShipCityIntoCityInputField();
        //input too short guest post code into post code input field (shipping address section) (4 digits)
        checkoutPageTooShortSingularInput.inputTooShortGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (shipping address) - Too Short Shipping Post Code");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Warning\n" + "\n" + "Make sure that you have 5 digits in your shipping address zip code", checkoutPageTooShortSingularInput.getCheckoutSingularInputErrorBoxMessage(), "The too short shipping address post code input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too short shipping address post code input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Short Shipping Post Code");
    }

    //too long singular input

    //invalid guest product checkout confirmation test method (billing and shipping address) - too long billing first name (100 chars)
    protected void invalidGuestBillAndShipAddressCheckoutTooLongBillFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too long billing first name (100 chars)
        checkoutPageTooLongSingularInput.invalidGuestAccountInputDataTooLongBillFirstNameGetter();
        //input too long guest first name into first name input field (100 chars)
        checkoutPageTooLongSingularInput.inputTooLongGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooLongSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooLongSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooLongSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooLongSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooLongSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (billing address) - Too Long Billing First Name");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (shipping address)");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("First name is too long.", checkoutPageTooLongSingularInput.getSingularInputErrorMessage(), "The too long billing address first name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long billing address first name input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Long Billing First Name");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - too long billing last name (100 chars)
    protected void invalidGuestBillAndShipAddressCheckoutTooLongBillLastNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too long billing last name (100 chars)
        checkoutPageTooLongSingularInput.invalidGuestAccountInputDataTooLongBillLastNameGetter();
        //input valid guest first name into first name input field
        checkoutPageTooLongSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input too long guest last name into last name input field (100 chars)
        checkoutPageTooLongSingularInput.inputTooLongGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooLongSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooLongSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooLongSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooLongSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (billing address) - Too Long Billing Last Name");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (shipping address)");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Last name is too long.", checkoutPageTooLongSingularInput.getSingularInputErrorMessage(), "The too long billing address last name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long billing address last name input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Long Billing Last Name");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - too long billing address (100 chars)
    protected void invalidGuestBillAndShipAddressCheckoutTooLongBillAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too long billing address (100 chars)
        checkoutPageTooLongSingularInput.invalidGuestAccountInputDataTooLongBillAddressGetter();
        //input valid guest first name into first name input field
        checkoutPageTooLongSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooLongSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input too long guest address 1 into address 1 input field (100 chars)
        checkoutPageTooLongSingularInput.inputTooLongGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooLongSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooLongSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooLongSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (billing address) - Too Long Billing Address");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (shipping address)");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Address is too long.", checkoutPageTooLongSingularInput.getSingularInputErrorMessage(), "The too long billing address input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long billing address input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Long Billing Address");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - too long billing city (75 chars)
    protected void invalidGuestBillAndShipAddressCheckoutTooLongBillCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too long billing city (75 chars)
        checkoutPageTooLongSingularInput.invalidGuestAccountInputDataTooLongBillCityGetter();
        //input valid guest first name into first name input field
        checkoutPageTooLongSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooLongSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooLongSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input too long guest city into city input field (75 chars)
        checkoutPageTooLongSingularInput.inputTooLongGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooLongSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooLongSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (billing address) - Too Long Billing City");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (shipping address)");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("City is too long.", checkoutPageTooLongSingularInput.getSingularInputErrorMessage(), "The too long billing address city input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long billing address city input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Long Billing City");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - too long billing post code (6 digits)
    protected void invalidGuestBillAndShipAddressCheckoutTooLongBillPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too long billing post code (6 digits)
        checkoutPageTooLongSingularInput.invalidGuestAccountInputDataTooLongBillPostCodeGetter();
        //input valid guest first name into first name input field
        checkoutPageTooLongSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooLongSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooLongSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooLongSingularInput.inputValidGuestCityIntoCityInputField();
        //input too long guest post code into post code input field (6 digits)
        checkoutPageTooLongSingularInput.inputTooLongGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooLongSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (billing address) - Too Long Billing Post Code");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (shipping address)");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Warning\n" + "\n" + "Make sure that you have 5 digits in your billing address zip code", checkoutPageTooLongSingularInput.getCheckoutSingularInputErrorBoxMessage(), "The too long billing address post code input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long billing address post code input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Long Billing Post Code");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - too long billing email (100 chars -> name, domain)
    protected void invalidGuestBillAndShipAddressCheckoutTooLongBillEmailTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too long billing email (100 chars -> name, domain)
        checkoutPageTooLongSingularInput.invalidGuestAccountInputDataTooLongBillEmailGetter();
        //input valid guest first name into first name input field
        checkoutPageTooLongSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooLongSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooLongSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooLongSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooLongSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input too long guest email into email input field (100 chars -> name, domain)
        checkoutPageTooLongSingularInput.inputTooLongGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (billing address) - Too Long Billing Email");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Email address is invalid! Please correct", checkoutPageTooLongSingularInput.getSingularInputErrorMessage(), "The too long billing address email input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long billing address email input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Long Billing Email");
    }

    //invalid guest product checkout confirmation test method (billing and shipping address) - too long shipping first name (100 chars)
    protected void invalidGuestBillAndShipAddressCheckoutTooLongShipFirstNameTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too long shipping first name (100 chars)
        checkoutPageTooLongSingularInput.invalidGuestAccountInputDataTooLongShipFirstNameGetter();
        //input valid guest first name into first name input field
        checkoutPageTooLongSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooLongSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooLongSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooLongSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooLongSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooLongSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (billing address)");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input too long guest first name into first name input field (shipping address section) (100 chars)
        checkoutPageTooLongSingularInput.inputTooLongGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after invalid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (shipping address) - Too Long Shipping First Name");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("First name is too long", checkoutPageTooLongSingularInput.getCheckoutSingularInputErrorBoxMessage(), "The too long shipping address first name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long shipping address first name input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Long Shipping First Name");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - too long shipping last name (100 chars)
    protected void invalidGuestBillAndShipAddressCheckoutTooLongShipLastNameTest() {
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too long shipping last name (100 chars)
        checkoutPageTooLongSingularInput.invalidGuestAccountInputDataTooLongShipLastNameGetter();
        //input valid guest first name into first name input field
        checkoutPageTooLongSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooLongSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooLongSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooLongSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooLongSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooLongSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (billing address)");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input too long guest last name into last name input field (shipping address section) (100 chars)
        checkoutPageTooLongSingularInput.inputTooLongGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after invalid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (shipping address) - Too Long Shipping First Name");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try {
            assertEquals("Last name is too long", checkoutPageTooLongSingularInput.getCheckoutSingularInputErrorBoxMessage(), "The too long shipping address last name input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long shipping address last name input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Long Shipping Last Name");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - too long shipping address (100 chars)
    protected void invalidGuestBillAndShipAddressCheckoutTooLongShipAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too long shipping address (100 chars)
        checkoutPageTooLongSingularInput.invalidGuestAccountInputDataTooLongShipAddressGetter();
        //input valid guest first name into first name input field
        checkoutPageTooLongSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooLongSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooLongSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooLongSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooLongSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooLongSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (billing address)");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipLastNameIntoLastNameInputField();
        //input too long guest address 1 into address 1 input field (shipping address section) (100 chars)
        checkoutPageTooLongSingularInput.inputTooLongGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after invalid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (shipping address) - Too Long Shipping Address");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Address is too long", checkoutPageTooLongSingularInput.getCheckoutSingularInputErrorBoxMessage(), "The too long shipping address input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long shipping address input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Long Shipping Address");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - too long shipping city (75 chars)
    protected void invalidGuestBillAndShipAddressCheckoutTooLongShipCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too long shipping city (75 chars)
        checkoutPageTooLongSingularInput.invalidGuestAccountInputDataTooLongShipCityGetter();
        //input valid guest first name into first name input field
        checkoutPageTooLongSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooLongSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooLongSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooLongSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooLongSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooLongSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (billing address)");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipAddress1IntoAddress1InputField();
        //input too long guest city into city input field (shipping address section) (75 chars)
        checkoutPageTooLongSingularInput.inputTooLongGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after invalid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (shipping address) - Too Long Shipping City");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("City is too long", checkoutPageTooLongSingularInput.getCheckoutSingularInputErrorBoxMessage(), "The too long shipping address city input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long shipping address city input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Long Shipping City");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - too long shipping post code (6 digits)
    protected void invalidGuestBillAndShipAddressCheckoutTooLongShipPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageTooLongSingularInput checkoutPageTooLongSingularInput = new CheckoutPageTooLongSingularInput(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - too long shipping post code (6 digits)
        checkoutPageTooLongSingularInput.invalidGuestAccountInputDataTooLongShipPostCodeGetter();
        //input valid guest first name into first name input field
        checkoutPageTooLongSingularInput.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageTooLongSingularInput.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageTooLongSingularInput.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageTooLongSingularInput.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageTooLongSingularInput.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageTooLongSingularInput.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (billing address)");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageTooLongSingularInput.inputValidGuestShipCityIntoCityInputField();
        //input too long guest post code into post code input field (shipping address section) (6 digits)
        checkoutPageTooLongSingularInput.inputTooLongGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after invalid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (shipping address) - Too Long Shipping Post Code");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Warning\n" + "\n" + "Make sure that you have 5 digits in your shipping address zip code", checkoutPageTooLongSingularInput.getCheckoutSingularInputErrorBoxMessage(), "The too long shipping address post code input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The too long shipping address post code input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Too Long Shipping Post Code");
    }

    //invalid singular input format

    //invalid guest product checkout confirmation test method (billing and shipping address) - invalid billing first name format (special symbols only)
    protected void invalidGuestBillAndShipAddressCheckoutInvalidBillFirstNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - invalid billing first name format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidGuestAccountInputDataInvalidBillFirstNameFormatGetter();
        //input invalid guest first name format into first name input field (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidGuestFirstNameFormatIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (billing address) - Invalid Billing First Name Format");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (shipping address)");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("First name cannot consist of special symbols only.", checkoutPageInvalidSingularInputFormat.getSingularInputErrorMessage(), "The invalid billing address first name input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid billing address first name input format error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Invalid Billing First Name Format");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - invalid billing last name format (special symbols only)
    protected void invalidGuestBillAndShipAddressCheckoutInvalidBillLastNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - invalid billing last name format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidGuestAccountInputDataInvalidBillLastNameFormatGetter();
        //input valid guest first name into first name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestFirstNameIntoFirstNameInputField();
        //input invalid guest last name format into last name input field (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidGuestLastNameFormatIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (billing address) - Invalid Billing Last Name Format");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (shipping address)");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Last name cannot consist of special symbols only.", checkoutPageInvalidSingularInputFormat.getSingularInputErrorMessage(), "The invalid billing address last name input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid billing address last name input format error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Invalid Billing Last Name Format");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - invalid billing address format (special symbols only)
    protected void invalidGuestBillAndShipAddressCheckoutInvalidBillAddressFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - invalid billing address format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidGuestAccountInputDataInvalidBillAddressFormatGetter();
        //input valid guest first name into first name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestLastNameIntoLastNameInputField();
        //input invalid guest address 1 format into address 1 input field (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidGuestAddress1FormatIntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (billing address) - Invalid Billing Address Format");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (shipping address)");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Address cannot consist of special symbols only.", checkoutPageInvalidSingularInputFormat.getSingularInputErrorMessage(), "The invalid billing address input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid billing address input format error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Invalid Billing Address Format");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - invalid billing city format (special symbols only)
    protected void invalidGuestBillAndShipAddressCheckoutInvalidBillCityFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - invalid billing city format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidGuestAccountInputDataInvalidBillCityFormatGetter();
        //input valid guest first name into first name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestAddress1IntoAddress1InputField();
        //input invalid guest city format into city input field (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidGuestCityFormatIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (billing address) - Invalid Billing City Format");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (shipping address)");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("City cannot consist of special symbols only.", checkoutPageInvalidSingularInputFormat.getSingularInputErrorMessage(), "The invalid billing address city input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid billing address city input format error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Invalid Billing City Format");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - invalid billing post code format (special symbols only)
    protected void invalidGuestBillAndShipAddressCheckoutInvalidBillPostCodeFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - invalid billing post code format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidGuestAccountInputDataInvalidBillPostCodeFormatGetter();
        //input valid guest first name into first name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestCityIntoCityInputField();
        //input invalid guest post code format into post code input field (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidGuestPostCodeFormatIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (billing address) - Invalid Billing Post Code Format");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (shipping address)");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Post code cannot consist of special symbols only.", checkoutPageInvalidSingularInputFormat.getSingularInputErrorMessage(), "The invalid billing address post code input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid billing address post code input format error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Invalid Billing Post Code Format");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - invalid billing email format (special symbols only)
    protected void invalidGuestBillAndShipAddressCheckoutInvalidBillEmailFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - invalid billing email format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidGuestAccountInputDataInvalidBillEmailFormatGetter();
        //input valid guest first name into first name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestPostCodeIntoPostCodeInputField();
        //input invalid guest email format into email input field (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidGuestEmailFormatIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (billing address) - Invalid Billing Email Format");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Email address is invalid! Please correct", checkoutPageInvalidSingularInputFormat.getSingularInputErrorMessage(), "The invalid billing address email format input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid billing address email input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Invalid Billing Email Format");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - existing billing email
    protected void invalidGuestBillAndShipAddressCheckoutExistingBillTestEmailFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - existing billing email
        checkoutPageInvalidSingularInputFormat.invalidGuestAccountInputDataExistingBillTestEmailGetter();
        //input valid guest first name into first name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestPostCodeIntoPostCodeInputField();
        //input existing test email format into email input field
        checkoutPageInvalidSingularInputFormat.inputExistingTestBillEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (billing address) - Existing Billing Test Email");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Email address is invalid! Please correct", checkoutPageInvalidSingularInputFormat.getSingularInputErrorMessage(), "The existing billing test address email format input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The existing billing test address email input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Existing Billing Test Email");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - invalid shipping first name format (special symbols only)
    protected void invalidGuestBillAndShipAddressCheckoutInvalidShipFirstNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - invalid shipping first name format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidGuestAccountInputDataInvalidShipFirstNameFormatGetter();
        //input valid guest first name into first name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (billing address)");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input invalid guest first name format into first name input field (shipping address section) (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidGuestShipFirstNameFormatIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (shipping address) - Invalid Shipping First Name Format");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("First name cannot consist of special symbols only.", checkoutPageInvalidSingularInputFormat.getSingularInputErrorMessage(), "The invalid shipping address first name input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid shipping address first name input format error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Invalid Shipping First Name Format");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - invalid shipping last name format (special symbols only)
    protected void invalidGuestBillAndShipAddressCheckoutInvalidShipLastNameFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - invalid shipping last name format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidGuestAccountInputDataInvalidShipLastNameFormatGetter();
        //input valid guest first name into first name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (billing address)");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input invalid guest last name format into last name input field (shipping address section) (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidGuestShipLastNameFormatIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (shipping address) - Invalid Shipping Last Name Format");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Last name cannot consist of special symbols only.", checkoutPageInvalidSingularInputFormat.getSingularInputErrorMessage(), "The invalid shipping address last name input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid shipping address last name input format error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Invalid Shipping Last Name Format");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - invalid shipping address format (special symbols only)
    protected void invalidGuestBillAndShipAddressCheckoutInvalidShipAddressFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - invalid shipping address format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidGuestAccountInputDataInvalidShipAddressFormatGetter();
        //input valid guest first name into first name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (billing address)");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipLastNameIntoLastNameInputField();
        //input invalid guest address 1 format into address 1 input field (shipping address section) (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidGuestShipAddress1FormatIntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipCityIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (shipping address) - Invalid Shipping Address Format");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Address cannot consist of special symbols only.", checkoutPageInvalidSingularInputFormat.getSingularInputErrorMessage(), "The invalid shipping address input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid shipping address input format error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Invalid Shipping Address Format");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - invalid shipping city format (special symbols only)
    protected void invalidGuestBillAndShipAddressCheckoutInvalidShipCityFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - invalid shipping city format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidGuestAccountInputDataInvalidShipCityFormatGetter();
        //input valid guest first name into first name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (billing address)");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipAddress1IntoAddress1InputField();
        //input invalid guest city format into city input field (shipping address section) (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidGuestShipCityFormatIntoCityInputField();
        //input valid guest post code into post code input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipPostCodeIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (shipping address) - Invalid Shipping City Format");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("City cannot consist of special symbols only.", checkoutPageInvalidSingularInputFormat.getSingularInputErrorMessage(), "The invalid shipping address city input format error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid shipping address city input format error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Invalid Shipping City Format");
    }
    //invalid guest product checkout confirmation test method (billing and shipping address) - invalid shipping post code format (special symbols only)
    protected void invalidGuestBillAndShipAddressCheckoutInvalidShipPostCodeFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutPageInvalidSingularInputFormat checkoutPageInvalidSingularInputFormat = new CheckoutPageInvalidSingularInputFormat(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //checkout page web element assert
        isCheckoutPageWebElementDisplayed(checkoutPage);
        //checkout page text element assert
        isCheckoutPageTextElementAsExpected(checkoutPage);
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Display (guest)");
        //checkout page guest name address section web element assert
        isCheckoutPageGuestWebElementDisplayed(checkoutPage);
        //checkout page guest name address section text element assert
        isCheckoutPageGuestTextElementAsExpected(checkoutPage);
        //invalid guest account data (billing and shipping address) input getter - invalid shipping post code format (special symbols only)
        checkoutPageInvalidSingularInputFormat.invalidGuestAccountInputDataInvalidShipPostCodeFormatGetter();
        //input valid guest first name into first name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestAddress1IntoAddress1InputField();
        //input valid guest city into city input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestCityIntoCityInputField();
        //input valid guest post code into post code input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestPostCodeIntoPostCodeInputField();
        //input valid guest email into email input field
        checkoutPageInvalidSingularInputFormat.inputValidGuestEmailIntoEmailInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Valid Guest Account Data Input (billing address)");
        //click 'Ship to a different address' checkbox
        checkoutPage.clickShipDiffAddressCheckbox();
        //capture screenshot of the checkout page
        captureScreenshot(driver, "Checkout Page Shipping Address Section Display (guest)");
        //checkout page (shipping address section) web element assert
        isCheckoutPageShippingAddressSectionWebElementDisplayed(checkoutPage);
        //checkout page (shipping address section) text element assert
        isCheckoutPageShipAddressSectionTextElementAsExpected(checkoutPage);
        //input valid guest first name into first name input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipFirstNameIntoFirstNameInputField();
        //input valid guest last name into last name input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipLastNameIntoLastNameInputField();
        //input valid guest address 1 into address 1 input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipAddress1IntoAddress1InputField();
        //input valid guest city into city input field (shipping address section)
        checkoutPageInvalidSingularInputFormat.inputValidGuestShipCityIntoCityInputField();
        //input invalid guest post code format into post code input field (shipping address section) (special symbols only)
        checkoutPageInvalidSingularInputFormat.inputInvalidGuestShipPostCodeFormatIntoPostCodeInputField();
        //capture screenshot of the checkout page after valid guest data input
        captureScreenshot(driver, "Checkout Page Display After Invalid Guest Account Data Input (shipping address) - Invalid Shipping Post Code Format");
        //click 'Submit' button
        checkoutPage.clickSubmitButton();
        //assert the user gets an expected error, log the issue otherwise
        try{
            assertEquals("Warning\n" + "\n" + "Make sure that you have 5 digits in your shipping address zip code", checkoutPageInvalidSingularInputFormat.getCheckoutSingularInputErrorBoxMessage(), "The invalid shipping address post code input error message doesn't match expectations.");
        } catch (Exception e) {
            logger.error("The invalid shipping address post code input error doesn't get triggered, test has failed.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Guest Checkout Confirmation Test Result (billing and shipping address) - Invalid Shipping Post Code Format");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //order invoice page test method
    protected void orderInvoicePageTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        OrderInvoicePage orderInvoicePage = new OrderInvoicePage(driver);
        //general page web element assert (without aside section)
        isGeneralPageNoAsideWebElementDisplayed(generalPage);
        //general page text element assert (without aside section)
        isGeneralPageNoAsideTextElementAsExpected(generalPage);
        //order invoice page web element assert
        isOrderInvoicePageWebElementDisplayed(orderInvoicePage);
        //order invoice page table web element assert
        isOrderInvoicePageProductTableWebElementDisplayed(orderInvoicePage);
        //order invoice page text element assert
        isOrderInvoicePageTextElementAsExpected(orderInvoicePage);
        //log order invoice page data
        logOrderInvoicePageData(orderInvoicePage);
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

    //account page web element assert test method
    protected void isAccountPageNavbarWebElementDisplayed(AccountPage accountPage) {
        //assert account page nav link is displayed
        assertTrue(accountPage.isAccountDetailsLinkDisplayed(), "The account page account details nav link isn't displayed");
        //assert account page address book nav link is displayed
        assertTrue(accountPage.isAddressBookLinkDisplayed(), "The account page address book nav link isn't displayed");
        //assert account page order history nav link is displayed
        assertTrue(accountPage.isOrderHistoryLinkDisplayed(), "The account page order history nav link isn't displayed");
        //assert account page returns nav link is displayed
        assertTrue(accountPage.isReturnsLinkDisplayed(), "The account page returns nav link isn't displayed");
        //assert account page wishlist nav link is displayed
        assertTrue(accountPage.isWishlistLinkDisplayed(), "The account page wishlist nav link isn't displayed");
    }

    //account page breadcrumb web element assert test method
    protected void isAccountPageBreadcrumbDisplayed(AccountPage accountPage) {
        //assert account page breadcrumb is displayed
        assertTrue(accountPage.isAccountPageBreadcrumbDisplayed(), "The account page breadcrumb isn't displayed");
    }

    //account details page web element assert test method
    protected void isAccountDetailsPageWebElementDisplayed(AccountDetailsPage accountDetailsPage) {
        //assert account details page title is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageTitleDisplayed(), "The account details page title isn't displayed");
        //assert account details page description is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageDescriptionDisplayed(), "The account details page description isn't displayed");
        //personal information
        //assert account details personal information is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPagePersonalInfoSectionTitleDisplayed(), "The account details page personal information section title isn't displayed");
        //assert account details page first name subtext is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageFirstNameSubtextDisplayed(), "The account details page first name subtext isn't displayed");
        //assert account details page first name input field is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageFirstNameInputFieldDisplayed(), "The account details page first name input field isn't displayed");
        //assert account details page last name subtext is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageLastNameSubtextDisplayed(), "The account details page last name subtext isn't displayed");
        //assert account details page last name input field is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageLastNameInputFieldDisplayed(), "The account details page last name input field isn't displayed");
        //assert account details page company subtext is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageCompanySubtextDisplayed(), "The account details page company subtext isn't displayed");
        //assert account details page company input field is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageCompanyInputFieldDisplayed(), "The account details page company input field isn't displayed");
        //assert account details page website subtext is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageWebsiteSubtextDisplayed(), "The account details page website subtext isn't displayed");
        //assert account details page website input field is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageWebsiteInputFieldDisplayed(), "The account details page website input field isn't displayed");
        //assert account details page tax number subtext is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageTaxNumberSubtextDisplayed(), "The account details page tax number subtext isn't displayed");
        //assert account details page tax number input field is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageTaxNumberInputFieldDisplayed(), "The account details page tax number input field isn't displayed");
        //account information
        //assert account details page account information section title is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageAccountInfoSectionTitleDisplayed(), "The account details page account information section title isn't displayed");
        //assert account details page email subtext is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageEmailSubtextDisplayed(), "The account details page email subtext isn't displayed");
        //assert account details page email input field is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageEmailInputFieldDisplayed(), "The account details page email input field isn't displayed");
        //assert account details page password subtext is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPagePasswordSubtextDisplayed(), "The account details page password subtext isn't displayed");
        //assert account details page change password form link is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageChangePasswordFormLinkDisplayed(), "The account details page change password form link isn't displayed");
        //newsletter section
        //assert account details page newsletter section title is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageNewsletterSectionTitleDisplayed(), "The account details page newsletter section title isn't displayed");
        //assert account details page newsletter subtext is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageNewsletterSubtextDisplayed(), "The account details page newsletter subtext isn't displayed");
        //assert account details page exclusive offers checkbox is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageExclusiveOffersCheckboxDisplayed(), "The account details page exclusive offers checkbox isn't displayed");
        //assert account details page exclusive offers subtext is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageExclusiveOffersSubtextDisplayed(), "The account details page exclusive offers subtext isn't displayed");
        //assert account details page exclusive offers description is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageExclusiveOffersDescriptionDisplayed(), "The account details page exclusive offers description isn't displayed");
        //assert account details page site updates checkbox is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageSiteUpdatesCheckboxDisplayed(), "The account details page site updates checkbox isn't displayed");
        //assert account details page site updates subtext is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageSiteUpdatesSubtextDisplayed(), "The account details page site updates subtext isn't displayed");
        //assert account details page site updates description is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageSiteUpdatesDescriptionDisplayed(), "The account details page site updates description isn't displayed");
        //assert account details page delete account link is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageDeleteAccountLinkDisplayed(), "The account details page delete account link isn't displayed");
        //assert account details page submit button is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageSubmitButtonDisplayed(), "The account details page submit button isn't displayed");
    }

    //change password form web element assert method
    protected void isChangePasswordFormWebElementDisplayed(AccountDetailsPage accountDetailsPage) {
        //assert account details page change password form title is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageChangePasswordSectionTitleDisplayed(), "The account details page change password form title isn't displayed");
        //assert account details page change password form email subtext is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageFormEmailSubtextDisplayed(), "The account details page change password form email subtext isn't displayed");
        //assert account details page change password form email is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageFormEmailAddressDisplayed(), "The account details page change password form email isn't displayed");
        //assert account details page change password form old password subtext is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageOldPasswordSubtextDisplayed(), "The account details page change password form old password subtext isn't displayed");
        //assert account details page change password form old password input field is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageOldPasswordInputFieldDisplayed(), "The account details page change password form old password input field isn't displayed");
        //assert account details page change password form new password subtext is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageNewPasswordSubtextDisplayed(), "The account details page change password form new password subtext isn't displayed");
        //assert account details page change password form new password input field is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageNewPasswordInputFieldDisplayed(), "The account details page change password form new password input field isn't displayed");
        //assert account details page change password form confirm password subtext is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageConfirmPasswordSubtextDisplayed(), "The account details page change password form confirm password subtext isn't displayed");
        //assert account details page change password form confirm password input field is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageConfirmPasswordInputFieldDisplayed(), "The account details page change password form confirm password input field isn't displayed");
        //assert account details page change password form submit button is displayed
        assertTrue(accountDetailsPage.isAccountDetailsPageFormSubmitButtonDisplayed(), "The account details page change password form submit button isn't displayed");
    }

    //address book page web element assert test method
    protected void isAddressBookPageWebElementDisplayed(AddressBookPage addressBookPage) {
        //assert address book page title is displayed
        assertTrue(addressBookPage.isAddressBookPageTitleDisplayed(), "The address book page title isn't displayed");
        //assert address book add address link is displayed
        assertTrue(addressBookPage.isAddAddressLinkDisplayed(), "The address book page add address link isn't displayed");
        //list elements
        //assert address book address entry titles are displayed (as a list)
        assertTrue(addressBookPage.isAddressBookEntryTitleDisplayed(), "The address book page address entry titles aren't displayed");
        //assert address book address entry usernames are displayed (as a list)
        assertTrue(addressBookPage.isAddressBookEntryUserNameDisplayed(), "The address book page address entry username aren't displayed");
        //assert address book address entries data are displayed (as a list)
        assertTrue(addressBookPage.isAddressBookEntryDataDisplayed(), "The address book page address entry data aren't displayed");
        //assert address book address entry change buttons are displayed (as a list)
        assertTrue(addressBookPage.isAddressBookEntryChangeButtonDisplayed(), "The address book page address entry change buttons aren't displayed");
    }

    //new address form web element assert test method
    protected void isAddressFormWebElementDisplayed(AddressBookPage addressBookPage) {
        //assert new address form title is displayed
        assertTrue(addressBookPage.isNewAddressFormTitleDisplayed(), "The new address form title isn't displayed");
        //assert new address form first name subtext is displayed
        assertTrue(addressBookPage.isNewAddressFormFirstNameSubtextDisplayed(), "The new address form first name subtext isn't displayed");
        //assert new address form first name input field is displayed
        assertTrue(addressBookPage.isNewAddressFormFirstNameInputFieldDisplayed(), "The new address form first name input field isn't displayed");
        //assert new address form last name subtext is displayed
        assertTrue(addressBookPage.isNewAddressFormLastNameSubtextDisplayed(), "The new address form last name subtext isn't displayed");
        //assert new address form last name input field is displayed
        assertTrue(addressBookPage.isNewAddressFormLastNameInputFieldDisplayed(), "The new address form last name input field isn't displayed");
        //assert new address form address 1 subtext is displayed
        assertTrue(addressBookPage.isNewAddressFormAddress1SubtextDisplayed(), "The new address form address 1 subtext isn't displayed");
        //assert new address form address 1 input field is displayed
        assertTrue(addressBookPage.isNewAddressFormAddress1InputFieldDisplayed(), "The new address form address 1 input field isn't displayed");
        //assert new address form address 2 subtext is displayed
        assertTrue(addressBookPage.isNewAddressFormAddress2SubtextDisplayed(), "The new address form address 2 subtext isn't displayed");
        //assert new address form address 2 input field is displayed
        assertTrue(addressBookPage.isNewAddressFormAddress2InputFieldDisplayed(), "The new address form address 2 input field isn't displayed");
        //assert new address form city subtext is displayed
        assertTrue(addressBookPage.isNewAddressFormCitySubtextDisplayed(), "The new address form city subtext isn't displayed");
        //assert new address form city input field is displayed
        assertTrue(addressBookPage.isNewAddressFormCityInputFieldDisplayed(), "The new address form city input field isn't displayed");
        //assert new address form country subtext is displayed
        assertTrue(addressBookPage.isNewAddressFormCountrySubtextDisplayed(), "The new address form country subtext isn't displayed");
        //assert new address form country dropdown menu is displayed
        assertTrue(addressBookPage.isNewAddressFormCountryDropdownMenuDisplayed(), "The new address form country dropdown menu isn't displayed");
        //assert new address form state subtext is displayed
        assertTrue(addressBookPage.isNewAddressFormStateSubtextDisplayed(), "The new address form state subtext isn't displayed");
        //assert new address form state dropdown menu is displayed
        assertTrue(addressBookPage.isNewAddressFormStateDropdownMenuDisplayed(), "The new address form state dropdown menu isn't displayed");
        //assert new address form post code subtext is displayed
        assertTrue(addressBookPage.isNewAddressFormPostCodeSubtextDisplayed(), "The new address form post code subtext isn't displayed");
        //assert new address form post code input field is displayed
        assertTrue(addressBookPage.isNewAddressFormPostCodeInputFieldDisplayed(), "The new address form post code input field isn't displayed");
        //assert new address form phone subtext is displayed
        assertTrue(addressBookPage.isNewAddressFormPhoneSubtextDisplayed(), "The new address form phone subtext isn't displayed");
        //assert new address form phone input field is displayed
        assertTrue(addressBookPage.isNewAddressFormPhoneInputFieldDisplayed(), "The new address form phone input field isn't displayed");
        //assert new address form fax subtext is displayed
        assertTrue(addressBookPage.isNewAddressFormFaxSubtextDisplayed(), "The new address form fax subtext isn't displayed");
        //assert new address form fax input field is displayed
        assertTrue(addressBookPage.isNewAddressFormFaxInputFieldDisplayed(), "The new address form fax input field isn't displayed");
        //assert new address form save button is displayed
        assertTrue(addressBookPage.isNewAddressFormSaveButtonDisplayed(), "The new address form save button isn't displayed");
    }

    //sign in form page web element assert test method
    protected void isSignInFormPageWebElementDisplayed(SignInFormPage signInFormPage) {
        //assert sign in form page title is displayed
        assertTrue(signInFormPage.isSignInFormPageTitleDisplayed(), "The sign in form page title isn't displayed");
        //assert sign in form page close button is displayed
        assertTrue(signInFormPage.isSignInFormPageCloseButtonDisplayed(), "The sign in form page close button isn't displayed");
        //assert sign in form page email subtext is displayed
        assertTrue(signInFormPage.isSignInFormPageEmailSubtextDisplayed(), "The sign in form page email subtext isn't displayed");
        //assert sign in form page email input field is displayed
        assertTrue(signInFormPage.isSignInFormPageEmailInputFieldDisplayed(), "The sign in form page email input field isn't displayed");
        //assert sign in form page password subtext is displayed
        assertTrue(signInFormPage.isSignInFormPagePasswordSubtextDisplayed(), "The sign in form page password subtext isn't displayed");
        //assert sign in form page password input field is displayed
        assertTrue(signInFormPage.isSignInFormPagePasswordInputFieldDisplayed(), "The sign in form page password input field isn't displayed");
        //assert sign in form page forgot password link is displayed
        assertTrue(signInFormPage.isSignInFormPageForgotPasswordLinkDisplayed(), "The sign in form page forgot password link isn't displayed");
        //assert sign in form page submit button is displayed
        assertTrue(signInFormPage.isSignInFormPageSubmitButtonDisplayed(), "The sign in form page submit button isn't displayed");
    }

    //shopping cart form web element assert test method
    protected void isShoppingCartFormWebElementDisplayed(HomePage homePage) {
        //assert shopping cart form addition success message is displayed
        //assertTrue(homePage.isShoppingCartFormAdditionSuccessMessageDisplayed(), "The shopping cart form addition success message isn't displayed");
        //assert shopping cart form close button is displayed
        assertTrue(homePage.isShoppingCartFormCloseButtonDisplayed(), "The shopping cart form close button isn't displayed");
        //assert shopping cart form product thumb image is displayed
        assertTrue(homePage.isShoppingCartFormProductThumbImageDisplayed(), "The shopping cart form product thumb image isn't displayed");
        //assert shopping cart form product name link is displayed
        assertTrue(homePage.isShoppingCartFormProductNameLinkDisplayed(), "The shopping cart form product name link isn't displayed");
        //assert shopping cart form product unit price is displayed
        assertTrue(homePage.isShoppingCartFormProductUnitPriceDisplayed(), "The shopping cart form product unit price isn't displayed");
        //assert shopping cart form product alt unit price is displayed
        assertTrue(homePage.isShoppingCartFormProductAltUnitPriceDisplayed(), "The shopping cart form product alt unit price isn't displayed");
        //assert shopping cart form your cart section subtitle is displayed
        assertTrue(homePage.isShoppingCartFormYourCartSectionSubtitleDisplayed(), "The shopping cart form 'Your Cart' section subtitle isn't displayed");
        //assert shopping cart form your cart section item count is displayed
        assertTrue(homePage.isShoppingCartFormYourCartSectionItemCountDisplayed(), "The shopping cart form 'Your Cart' section item count isn't displayed");
        //assert shopping cart form your cart section subtotal price is displayed
        assertTrue(homePage.isShoppingCartFormYourCartSectionSubtotalPriceDisplayed(), "The shopping cart form 'Your Cart' section subtotal price isn't displayed");
        //assert shopping cart form your cart section view cart button is displayed
        assertTrue(homePage.isShoppingCartFormYourCartSectionViewCartButtonDisplayed(), "The shopping cart form 'Your Cart' section view cart button isn't displayed");
        //assert shopping cart form continue shopping button is displayed
        assertTrue(homePage.isShoppingCartFormContinueShoppingButtonDisplayed(), "The shopping cart form continue shopping button isn't displayed");
        //assert shopping cart form proceed to checkout is displayed
        assertTrue(homePage.isShoppingCartFormProceedToCheckoutButtonDisplayed(), "The shopping cart form proceed to checkout button isn't displayed");
    }

    //single product category dashboard page web element assert test method
    protected void isSingleProductCategoryDashboardPageWebElementDisplayed(SingleProductCategoryDashboardPage singleProductCategoryDashboardPage) {
        //assert single product category dashboard page title is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryDashboardPageTitleDisplayed(), "The single product category dashboard page title isn't displayed");
        //assert single product category dashboard page subtitle is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryDashboardPageSubtitleDisplayed(), "The single product category dashboard page subtitle isn't displayed");
        //assert single product category dashboard page product sort link is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryDashboardPageProductSortLinkDisplayed(), "The single product category dashboard page product sort link isn't displayed");
        //assert single product category dashboard page product price sort link is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryDashboardPageProductPriceSortLinkDisplayed(), "The single product category dashboard page product price sort link isn't displayed");
        //assert single product category dashboard page product default sort link is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryDashboardPageProductDefaultSortLinkDisplayed(), "The single product category dashboard page product default sort link isn't displayed");
        //assert single product category dashboard page product sales sort link is displayed
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryDashboardPageProductSalesSortLinkDisplayed(), "The single product category dashboard page product sales sort link isn't displayed");
        //list elements
        //assert single product category dashboard page product images are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryDashboardPageProductImageDisplayed(), "The single product category dashboard page product images aren't displayed");
        //assert single product category dashboard page product names are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryDashboardPageProductNameLinkDisplayed(), "The single product category dashboard page product names aren't displayed");
        //assert single product category dashboard page product unit prices are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryDashboardPageProductUnitPriceDisplayed(), "The single product category dashboard page product unit prices aren't displayed");
        //assert single product category dashboard page product alt prices are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryDashboardPageProductAltPriceDisplayed(), "The single product category dashboard page product alt prices aren't displayed");
        //assert single product category dashboard page product review stars are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryDashboardPageProductReviewStarDisplayed(), "The single product category dashboard page product review stars aren't displayed");
        //assert single product category dashboard page product quantity dropdown menus are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryDashboardPageProductQtyDropdownMenuDisplayed(), "The single product category dashboard page product quantity dropdown menus aren't displayed");
        //assert single product category dashboard page product add to cart buttons are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryDashboardPageProductAddToCartButtonDisplayed(), "The single product category dashboard page product add to cart buttons aren't displayed");
        //assert single product category dashboard page product add to wishlist buttons are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isSingleProductCategoryDashboardPageProductAddToWishlistButtonDisplayed(), "The single product category dashboard page product add to wishlist buttons aren't displayed");
    }

    //searched product dashboard page web element assert test method
    protected void isSearchedProductDashboardPageWebElementDisplayed(SingleProductCategoryDashboardPage singleProductCategoryDashboardPage) {
        //assert searched product dashboard page this page URL link is displayed
        assertTrue(singleProductCategoryDashboardPage.isSearchedProductDashboardPageThisPageURLDisplayed(), "The searched product dashboard page 'this page URL' link isn't displayed");
    }

    //products map page web element assert test method
    protected void isProductsMapPageWebElementDisplayed(ProductsMapPage productsMapPage) {
        //assert products map page title is displayed
        assertTrue(productsMapPage.isProductsMapPageTitleDisplayed(), "The products map page title isn't displayed");
        //list elements
        //assert product map page letter list elements are displayed (as a list)
        assertTrue(productsMapPage.isProductsMapPageLetterListDisplayed(), "The products map page letter list elements aren't displayed");
        //assert products map page upper pagination elements are displayed (as a list)
        assertTrue(productsMapPage.isProductsMapPageUpperPaginationDisplayed(), "The products map page upper pagination elements aren't displayed");
        //assert products map page product images are displayed (as a list)
        assertTrue(productsMapPage.isProductsMapPageProductImageDisplayed(), "The products map page product images aren't displayed");
        //assert products map page product name link are displayed (as a list)
        assertTrue(productsMapPage.isProductsMapPageProductNameLinkDisplayed(), "The products map page product name links aren't displayed");
        //assert products map page product unit prices are displayed (as a list)
        assertTrue(productsMapPage.isProductsMapPageProductUnitPriceDisplayed(), "The products map page product unit prices aren't displayed");
        //assert products map page product alt prices are displayed (as a list)
        assertTrue(productsMapPage.isProductsMapPageProductAltPriceDisplayed(), "The products map page product alt prices aren't displayed");
        //assert products map page product rating stars are displayed (as a list)
        assertTrue(productsMapPage.isProductsMapPageProductRatingStarDisplayed(), "The products map page product rating stars aren't displayed");
        //assert products map page product quantity dropdown menus are displayed (as a list)
        assertTrue(productsMapPage.isProductsMapPageProductQtyDropdownMenuDisplayed(), "The products map page product quantity dropdown menus aren't displayed");
        //assert products map page product add to cart buttons are displayed (as a list)
        assertTrue(productsMapPage.isProductsMapPageProductAddToCartButtonDisplayed(), "The products map page product add to cart buttons aren't displayed");
        //assert products map page product add to wishlist are displayed (as a list)
        assertTrue(productsMapPage.isProductsMapPageProductAddToWishlistDisplayed(), "The products map page product product add to wishlist buttons aren't displayed");
        //assert products map page lower pagination elements are displayed (as a list)
        assertTrue(productsMapPage.isProductsMapPageLowerPaginationDisplayed(), "The products map page product lower pagination elements aren't displayed");
    }

    //single product page web element assert test method
    protected void isSingleProductPageWebElementDisplayed(SingleProductPage singleProductPage) {
        //assert single product page previous product link is displayed
        assertTrue(singleProductPage.isSingleProductPagePreviousLinkDisplayed(), "The single product page previous product link isn't displayed");
        //assert single product page next product link is displayed
        assertTrue(singleProductPage.isSingleProductPageNextLinkDisplayed(), "The single product page next product link isn't displayed");
        //assert single product page title is displayed
        assertTrue(singleProductPage.isSingleProductPageTitleDisplayed(), "The single product page title isn't displayed");
        //assert single product page main image is displayed
        assertTrue(singleProductPage.isSingleProductMainImageDisplayed(), "The single product page main image isn't displayed");
        //assert single product page product SKU is displayed
        assertTrue(singleProductPage.isSingleProductSKUDisplayed(), "The single product page product SKU isn't displayed");
        //assert single product page product unit price is displayed
        assertTrue(singleProductPage.isSingleProductUnitPriceDisplayed(), "The single product page product unit price isn't displayed");
        //assert single product page product alt price is displayed
        assertTrue(singleProductPage.isSingleProductAltPriceDisplayed(), "The single product page product alt price isn't displayed");
        //assert single product page product quantity dropdown menu is displayed
        assertTrue(singleProductPage.isSingleProductQtyDropdownMenuDisplayed(), "The single product page product quantity dropdown menu isn't displayed");
        //assert single product page product add to cart button is displayed
        assertTrue(singleProductPage.isSingleProductAddToCartButtonDisplayed(), "The single product page product add to cart button isn't displayed");
        //assert single product page product add to wishlist is displayed
        assertTrue(singleProductPage.isSingleProductAddToWishlistButtonDisplayed(), "The single product page product add to wishlist button isn't displayed");
        //assert single product page product description is displayed
        assertTrue(singleProductPage.isSingleProductDescriptionDisplayed(), "The single product page product description isn't displayed");
        //assert single product page product demo box text is displayed
        assertTrue(singleProductPage.isSingleProductDemoBoxTextDisplayed(), "The single product page product demo box text isn't displayed");
        //assert single product page product think geek link is displayed
        assertTrue(singleProductPage.isSingleProductThinkGeekLinkDisplayed(), "The single product page product think geek link isn't displayed");
        //assert single product page product x button is displayed
        assertTrue(singleProductPage.isSingleProductXButtonDisplayed(), "The single product page product X button isn't displayed");
        //assert single product page product pin it button is displayed
        assertTrue(singleProductPage.isSingleProductPinItButtonDisplayed(), "The single product page product pin it button isn't displayed");
        //assert single product page product ask questions button is displayed
        assertTrue(singleProductPage.isSingleProductAskQuestionButtonDisplayed(), "The single product page product ask question button isn't displayed");
        //send to friend section
        //assert single product page send to friend link is displayed
        assertTrue(singleProductPage.isSingleProductSendToFriendLinkDisplayed(), "The single product page send to friend link isn't displayed");
        //assert single product page send to friend name input field is displayed
        assertTrue(singleProductPage.isSingleProductNameInputFieldDisplayed(), "The single product page send to friend name input field isn't displayed");
        //assert single product page send to friend email input field is displayed
        assertTrue(singleProductPage.isSingleProductEmailInputFieldDisplayed(), "The single product page send to friend email input field isn't displayed");
        //assert single product page send to friend recipient email input field is displayed
        assertTrue(singleProductPage.isSingleProductRecipientEmailInputFieldDisplayed(), "The single product page send to friend recipient email input field isn't displayed");
        //assert single product page send to friend add personal message checkbox is displayed
        assertTrue(singleProductPage.isSingleProductAddPersonalMessageCheckboxDisplayed(), "The single product page send to friend add personal message checkbox isn't displayed");
        //assert single product page send to friend captcha hint is displayed
        assertTrue(singleProductPage.isSingleProductCaptchaHintDisplayed(), "The single product page send to friend captcha hint isn't displayed");
        //assert single product page send to friend captcha image box is displayed
        assertTrue(singleProductPage.isSingleProductCaptchaImageBoxDisplayed(), "The single product page send to friend captcha image box isn't displayed");
        //assert single product page send to friend captcha different code link is displayed
        assertTrue(singleProductPage.isSingleProductCaptchaDifferentCodeLinkDisplayed(), "The single product page send to friend captcha different code link isn't displayed");
        //assert single product page send to friend captcha code input field is displayed
        assertTrue(singleProductPage.isSingleProductCaptchaCodeInputFieldDisplayed(), "The single product page send to friend captcha code input field isn't displayed");
        //assert single product page send to friend button is displayed
        assertTrue(singleProductPage.isSingleProductSendToFriendButtonDisplayed(), "The single product page send to friend button isn't displayed");
        //customers feedback section
        //assert single product page customers feedback link is displayed
        assertTrue(singleProductPage.isSingleProductCustomersFeedbackLinkDisplayed(), "The single product page customers feedback link isn't displayed");
    }

    //single product page (Digital Angel' t-shirt) web element assert test method
    protected void isSingleProductTShirtPageWebElementDisplayed(SingleProductPage singleProductPage) {
        //assert single product page product weight is displayed
        assertTrue(singleProductPage.isSingleProductWeightDisplayed(), "The single product page product weight isn't displayed");
        //assert single product page product size dropdown menu is displayed
        assertTrue(singleProductPage.isSingleProductSizeDropdownMenuDisplayed(), "The single product page product size dropdown menu isn't displayed");
        //customers also bought section
        //assert single product page customers also bought link is displayed
        assertTrue(singleProductPage.isSingleProductCustomersAlsoBoughtLinkDisplayed(), "The single product page customers also bought link isn't displayed");
        //list elements
        //assert single product page customers also bought product images are displayed (as a list)
        assertTrue(singleProductPage.isSingleProductCustomersAlsoBoughtProductImageDisplayed(), "The single product page customers also bought product images aren't displayed");
        //assert single product page customers also bought product name links are displayed (as a list)
        assertTrue(singleProductPage.isSingleProductCustomersAlsoBoughtProductNameLinkDisplayed(), "The single product page customers also bought product name links aren't displayed");
        //assert single product page customers also bought product unit prices are displayed (as a list)
        assertTrue(singleProductPage.isSingleProductCustomersAlsoBoughtProductUnitPriceDisplayed(), "The single product page customers also bought product unit prices aren't displayed");
    }

    //wishlist page web element assert test method
    protected void isWishlistPageWebElementDisplayed(WishlistPage wishlistPage) {
        //assert wishlist page title is displayed
        assertTrue(wishlistPage.isWishlistPageTitleDisplayed(), "The wishlist page title isn't displayed");
        //assert wishlist page clear wishlist button is displayed
        assertTrue(wishlistPage.isWishlistPageClearWishlistButtonDisplayed(), "The wishlist page clear wishlist button isn't displayed");
        //assert wishlist page send wishlist subtext is displayed
        assertTrue(wishlistPage.isWishlistPageSendWishlistSubtextDisplayed(), "The wishlist page send wishlist subtext isn't displayed");
        //assert wishlist page email input field is displayed
        assertTrue(wishlistPage.isWishlistPageEmailInputDisplayed(), "The wishlist page email input field isn't displayed");
        //assert wishlist page send button is displayed
        assertTrue(wishlistPage.isWishlistPageSendButtonDisplayed(), "The wishlist page send button isn't displayed");
        //list elements
        //assert wishlist page product remove buttons are displayed (as a list)
        assertTrue(wishlistPage.isWishlistProductRemoveButtonDisplayed(), "The wishlist product remove buttons aren't displayed");
        //assert wishlist page product images are displayed (as a list)
        assertTrue(wishlistPage.isWishlistProductImageDisplayed(), "The wishlist product images aren't displayed");
        //assert wishlist page product name link are displayed (as a list)
        assertTrue(wishlistPage.isWishlistProductNameLinkDisplayed(), "The wishlist product name link aren't displayed");
        //assert wishlist page product unit prices are displayed (as a list)
        assertTrue(wishlistPage.isWishlistProductUnitPriceDisplayed(), "The wishlist product unit prices aren't displayed");
        //assert wishlist page product quantity input fields are displayed (as a list)
        assertTrue(wishlistPage.isWishlistProductQtyInputFieldDisplayed(), "The wishlist product quantity input fields aren't displayed");
        //assert wishlist page product total prices are displayed (as a list)
        assertTrue(wishlistPage.isWishlistProductTotalPriceDisplayed(), "The wishlist product total prices aren't displayed");
        //assert wishlist page product alt prices are displayed (as a list)
        assertTrue(wishlistPage.isWishlistProductAltPriceDisplayed(), "The wishlist product alt prices aren't displayed");
        //assert wishlist page product update buttons are displayed (as a list)
        assertTrue(wishlistPage.isWishlistProductUpdateButtonDisplayed(), "The wishlist product update buttons aren't displayed");
        //assert wishlist page product add to cart buttons are displayed (as a list)
        assertTrue(wishlistPage.isWishlistProductAddToCartButtonDisplayed(), "The wishlist product add to cart buttons aren't displayed");
    }

    //shopping cart page web element assert test method
    protected void isShoppingCartPageWebElementDisplayed(ShoppingCartPage shoppingCartPage) {
        //assert shopping cart page title is displayed
        assertTrue(shoppingCartPage.isShoppingCartPageTitleDisplayed(), "The shopping cart page title isn't displayed");
        //assert shopping cart page upper continue shopping button is displayed
        //assertTrue(shoppingCartPage.isShoppingCartPageUpperContinueShoppingButtonDisplayed(), "The shopping cart page upper continue shopping button isn't displayed");
        //assert shopping cart page upper checkout button is displayed
        assertTrue(shoppingCartPage.isShoppingCartPageUpperCheckoutButtonDisplayed(), "The shopping cart page upper checkout button isn't displayed");
        //assert shopping cart page description is displayed
        assertTrue(shoppingCartPage.isShoppingCartPageDescriptionDisplayed(), "The shopping cart page description isn't displayed");
        //order subtotal
        //assert shopping cart subtotal subtext is displayed
        assertTrue(shoppingCartPage.isShoppingCartSubtotalSubtextDisplayed(), "The shopping cart subtotal subtext isn't displayed");
        //assert shopping cart page order subtotal price is displayed
        assertTrue(shoppingCartPage.isShoppingCartOrderSubtotalPriceDisplayed(), "The shopping cart page order subtotal price isn't displayed");
        //assert shopping cart page order alt price is displayed
        assertTrue(shoppingCartPage.isShoppingCartOrderSubtotalAltPriceDisplayed(), "The shopping cart page order alt price isn't displayed");
        //assert shopping cart page add gift wrap checkbox is displayed
        assertTrue(shoppingCartPage.isShoppingCartAddGiftWrapCheckboxDisplayed(), "The shopping cart page add gift wrap checkbox isn't displayed");
        //assert shopping cart page add gift wrap subtitle is displayed
        assertTrue(shoppingCartPage.isShoppingCartAddGiftWrapSubtitleDisplayed(), "The shopping cart page add gift wrap subtitle isn't displayed");
        //assert shopping cart page update gift wrap button is displayed
        assertTrue(shoppingCartPage.isShoppingCartUpdateGiftWrapButtonDisplayed(), "The shopping cart page update gift wrap button isn't displayed");
        //assert shopping cart page update cart button is displayed
        assertTrue(shoppingCartPage.isShoppingCartUpdateCartButtonDisplayed(), "The shopping cart page update cart button isn't displayed");
        //assert shopping cart page clear cart link is displayed
        assertTrue(shoppingCartPage.isShoppingCartClearCartLinkDisplayed(), "The shopping cart page clear cart link isn't displayed");
        //assert shopping cart page checkout button is displayed
        assertTrue(shoppingCartPage.isShoppingCartCheckoutButtonDisplayed(), "The shopping cart page checkout button isn't displayed");
        //discount section
        //assert shopping cart page discount section title is displayed
        assertTrue(shoppingCartPage.isShoppingCartDiscountSectionTitleDisplayed(), "The shopping cart page discount section title isn't displayed");
        //assert shopping cart page discount subtext is displayed
        assertTrue(shoppingCartPage.isShoppingCartDiscountSubtextDisplayed(), "The shopping cart page discount subtext isn't displayed");
        //assert shopping cart page discount coupon code is displayed
        assertTrue(shoppingCartPage.isShoppingCartDiscountCouponCodeInputDisplayed(), "The shopping cart page discount coupon code isn't displayed");
        //assert shopping cart page discount code submit button is displayed
        assertTrue(shoppingCartPage.isShoppingCartDiscountCodeSubmitButtonDisplayed(), "The shopping cart page discount code submit button isn't displayed");
        //list elements
        //assert shopping cart page product remove buttons are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductRemoveButtonDisplayed(), "The shopping cart page product remove buttons aren't displayed");
        //assert shopping cart page product images are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductImageDisplayed(), "The shopping cart page product images aren't displayed");
        //assert shopping cart page product name links are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductNameLinkDisplayed(), "The shopping cart page product name links aren't displayed");
        //assert shopping cart page product unit prices are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductUnitPriceDisplayed(), "The shopping cart page product unit prices aren't displayed");
        //assert shopping cart page product quantities are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductQtyInputFieldDisplayed(), "The shopping cart page product quantities aren't displayed");
        //assert shopping cart page product total prices are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductTotalPriceDisplayed(), "The shopping cart page product total prices aren't displayed");
        //assert shopping cart page product alt prices are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductAltPriceDisplayed(), "The shopping cart page product alt prices aren't displayed");
        //assert shopping cart page product update item buttons are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageUpdateItemButtonDisplayed(), "The shopping cart page update item buttons aren't displayed");
        //assert shopping cart page move to wishlist buttons are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageMoveToWishlistButtonDisplayed(), "The shopping cart page move to wishlist buttons aren't displayed");
    }

    //shopping cart page product details section web element assert test method
    protected void isShoppingCartProductDetailsSectionWebElementDisplayed(ShoppingCartPage shoppingCartPage) {
        //assert shopping cart page product details are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductDetailsDisplayed(), "The shopping cart page product details aren't displayed");
        //assert shopping cart page product options links are displayed (as a list)
        assertTrue(shoppingCartPage.isShoppingCartPageProductOptionsLinkDisplayed(), "The shopping cart page product options links aren't displayed");
    }

    //checkout page web element assert test method
    protected void isCheckoutPageWebElementDisplayed(CheckoutPage checkoutPage) {
        //assert checkout page title is displayed
        assertTrue(checkoutPage.isCheckoutPageTitleDisplayed(), "The checkout page title isn't displayed");
        //shipping method
        //assert checkout page shipping method section title is displayed
        assertTrue(checkoutPage.isCheckoutPageShipMethodSectionTitleDisplayed(), "The checkout page shipping method section title isn't displayed");
        //payment method
        //assert checkout page payment method section title is displayed
        assertTrue(checkoutPage.isCheckoutPayMethodSectionTitleDisplayed(), "The checkout page payment method section title isn't displayed");
        //assert checkout page payment method phone ordering radio button is displayed
        assertTrue(checkoutPage.isCheckoutPayMethodPhoneOrderingRadioButtonDisplayed(), "The checkout page payment method phone ordering radio button isn't displayed");
        //assert checkout page payment method phone ordering subtext is displayed
        assertTrue(checkoutPage.isCheckoutPayMethodPhoneOrderingSubtextDisplayed(), "The checkout page payment method phone ordering subtext isn't displayed");
        //assert checkout page payment method gift certificate radio button is displayed
        assertTrue(checkoutPage.isCheckoutPayMethodGiftCertificateRadioButtonDisplayed(), "The checkout page payment method gift certificate radio button isn't displayed");
        //assert checkout page payment method gift certificate subtext is displayed
        assertTrue(checkoutPage.isCheckoutPayMethodGiftCertificateSubtextDisplayed(), "The checkout page payment method gift certificate subtext isn't displayed");
        //assert checkout page payment method fax ordering radio button is displayed
        assertTrue(checkoutPage.isCheckoutPayMethodFaxOrderingRadioButtonDisplayed(), "The checkout page payment method fax ordering radio button isn't displayed");
        //assert checkout page payment method fax ordering subtext is displayed
        assertTrue(checkoutPage.isCheckoutPayMethodFaxOrderingSubtextDisplayed(), "The checkout page payment method fax ordering subtext isn't displayed");
        //assert checkout page payment method money order radio button is displayed
        assertTrue(checkoutPage.isCheckoutPayMethodMoneyOrderRadioButtonDisplayed(), "The checkout page payment method money order radio button isn't displayed");
        //assert checkout page payment method money order subtext is displayed
        assertTrue(checkoutPage.isCheckoutPayMethodMoneyOrderSubtextDisplayed(), "The checkout page payment method money order subtext isn't displayed");
        //assert checkout page payment method purchase order radio button is displayed
        assertTrue(checkoutPage.isCheckoutPayMethodPurchaseOrderRadioButtonDisplayed(), "The checkout page payment method purchase order radio button isn't displayed");
        //assert checkout page payment method purchase order subtext is displayed
        assertTrue(checkoutPage.isCheckoutPayMethodPurchaseOrderSubtextDisplayed(), "The checkout page payment method purchase order subtext isn't displayed");
        //assert checkout page payment method sage pay go radio button is displayed
        assertTrue(checkoutPage.isCheckoutPayMethodSagePayGoRadioButtonDisplayed(), "The checkout page payment method sage pay go radio button isn't displayed");
        //assert checkout page payment method sage pay go subtext is displayed
        assertTrue(checkoutPage.isCheckoutPayMethodSagePayGoSubtextDisplayed(), "The checkout page payment method sgae pay go subtext isn't displayed");
        //assert checkout page payment method x payments ordering radio button is displayed
        assertTrue(checkoutPage.isCheckoutPayMethodXPaymentsRadioButtonDisplayed(), "The checkout page payment method x payment radio button isn't displayed");
        //assert checkout page payment method x payment subtext is displayed
        assertTrue(checkoutPage.isCheckoutPayMethodXPaymentsSubtextDisplayed(), "The checkout page payment method x payment subtext isn't displayed");
        //order summary
        //assert checkout page order summary section title is displayed
        assertTrue(checkoutPage.isCheckoutPageOrderSummarySectionTitleDisplayed(), "The checkout page order summary section title isn't displayed");
        //assert checkout page order summary subtotal price is displayed
        assertTrue(checkoutPage.isCheckoutPageOrderSummarySubtotalPriceDisplayed(), "The checkout page order summary subtotal price isn't displayed");
        //assert checkout page order summary shipping cost is displayed
        assertTrue(checkoutPage.isCheckoutPageOrderSummaryShippingCostDisplayed(), "The checkout page order summary shipping cost isn't displayed");
        //assert checkout page order summary pay method surcharge is displayed
        assertTrue(checkoutPage.isCheckoutPageOrderSummaryPayMethodSurchargeDisplayed(), "The checkout page order summary pay method surcharge isn't displayed");
        //assert checkout page order summary total price is displayed
        assertTrue(checkoutPage.isCheckoutPageOrderSummaryTotalPriceDisplayed(), "The checkout page order summary total price isn't displayed");
        //assert checkout page order summary total alt price is displayed
        assertTrue(checkoutPage.isCheckoutPageOrderSummaryTotalAltPriceDisplayed(), "The checkout page order summary total alt price isn't displayed");
        //discount coupon
        //assert checkout page discount coupon section title is displayed
        assertTrue(checkoutPage.isCheckoutPageDiscountCouponSectionTitleDisplayed(), "The checkout page discount coupon section title isn't displayed");
        //assert checkout page discount coupon section subtitle is displayed
        assertTrue(checkoutPage.isCheckoutPageDiscountCouponSectionSubtitleDisplayed(), "The checkout page discount coupon section subtitle isn't displayed");
        //assert checkout page discount coupon textarea is displayed
        assertTrue(checkoutPage.isCheckoutPageDiscountCouponTextareaDisplayed(), "The checkout page discount coupon section textarea isn't displayed");
        //assert checkout page discount coupon accept terms checkbox is displayed
        assertTrue(checkoutPage.isCheckoutPageDiscountCouponAcceptTermsCheckboxDisplayed(), "The checkout page discount coupon accept terms checkbox isn't displayed");
        //assert checkout page discount coupon accept terms subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageDiscountCouponAcceptTermsSubtextDisplayed(), "The checkout page discount coupon accept terms subtext isn't displayed");
        //assert checkout page discount coupon section terms page link is displayed
        assertTrue(checkoutPage.isCheckoutPageDiscountCouponTermsPageLinkDisplayed(), "The checkout page discount coupon section terms page link isn't displayed");
        //assert checkout page discount coupon section privacy page link is displayed
        assertTrue(checkoutPage.isCheckoutPageDiscountCouponPrivacyPageLinkDisplayed(), "The checkout page discount coupon section privacy page link isn't displayed");
        //assert checkout page submit order button is displayed
        assertTrue(checkoutPage.isCheckoutPageSubmitOrderButtonDisplayed(), "The checkout page submit order button isn't displayed");
    }

    //checkout page guest only web element assert test method
    protected void isCheckoutPageGuestWebElementDisplayed(CheckoutPage checkoutPage) {
        //assert checkout page guest description is displayed
        assertTrue(checkoutPage.isCheckoutPageGuestDescriptionDisplayed(), "The checkout page guest description isn't displayed");
        //assert checkout page sign-in link is displayed
        assertTrue(checkoutPage.isCheckoutPageSignInLinkDisplayed(), "The checkout page sign-in link isn't displayed");
        //name and address
        //assert checkout page name and address section title is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressSectionTitleDisplayed(), "The checkout page name and address section title isn't displayed");
        //assert checkout page name and address section cancel button is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressCancelButtonDisplayed(), "The checkout page name and address section cancel button isn't displayed");
        //assert checkout page first name subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressFirstNameSubtextDisplayed(), "The checkout page first name subtext isn't displayed");
        //assert checkout page first name input field is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressFirstNameInputFieldDisplayed(), "The checkout page first name input field isn't displayed");
        //assert checkout page last name subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressLastNameSubtextDisplayed(), "The checkout page last name subtext isn't displayed");
        //assert checkout page last name input field is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressLastNameInputFieldDisplayed(), "The checkout page last name input field isn't displayed");
        //assert checkout page address 1 subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressAddress1SubtextDisplayed(), "The checkout page address 1 subtext isn't displayed");
        //assert checkout page address 1 input field is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressAddress1InputFieldDisplayed(), "The checkout page address 1 input field isn't displayed");
        //assert checkout page address 2 subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressAddress2SubtextDisplayed(), "The checkout page address 2 subtext isn't displayed");
        //assert checkout page address 2 input field is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressAddress2InputFieldDisplayed(), "The checkout page address 2 input field isn't displayed");
        //assert checkout page city subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressCitySubtextDisplayed(), "The checkout page city subtext isn't displayed");
        //assert checkout page city input field is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressCityInputFieldDisplayed(), "The checkout page city input field isn't displayed");
        //assert checkout page country subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressCountrySubtextDisplayed(), "The checkout page country subtext isn't displayed");
        //assert checkout page country input field is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressCountryDropdownMenuDisplayed(), "The checkout page first country dropdown menu isn't displayed");
        //assert checkout page state subtext is displayed
        //assertTrue(checkoutPage.isCheckoutPageNameAddressStateSubtextDisplayed(), "The checkout page state subtext isn't displayed");
        //assert checkout page state input field is displayed
        //assertTrue(checkoutPage.isCheckoutPageNameAddressStateDropdownMenuDisplayed(), "The checkout page state dropdown menu isn't displayed");
        //assert checkout page post code subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressPostCodeSubtextDisplayed(), "The checkout page post code subtext isn't displayed");
        //assert checkout page post code input field is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressPostCodeInputFieldDisplayed(), "The checkout page post code input field isn't displayed");
        //assert checkout page phone subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressPhoneSubtextDisplayed(), "The checkout page phone subtext isn't displayed");
        //assert checkout page phone input field is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressPhoneInputFieldDisplayed(), "The checkout page phone input field isn't displayed");
        //assert checkout page fax subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressFaxSubtextDisplayed(), "The checkout page fax subtext isn't displayed");
        //assert checkout page fax input field is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressFaxInputFieldDisplayed(), "The checkout page fax input field isn't displayed");
        //assert checkout page email subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressEmailSubtextDisplayed(), "The checkout page email subtext isn't displayed");
        //assert checkout page email input field is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressEmailInputFieldDisplayed(), "The checkout page email input field isn't displayed");
        //assert checkout page create account subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressCreateAccountSubtextDisplayed(), "The checkout page create account subtext isn't displayed");
        //assert checkout page create account checkbox is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressCreateAccountCheckboxDisplayed(), "The checkout page create account checkbox isn't displayed");
        //assert checkout page ship to a different address subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressShipDiffAddressSubtextDisplayed(), "The checkout page ship to a different address subtext isn't displayed");
        //assert checkout page ship to a different address checkbox is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressShipDiffAddressCheckboxDisplayed(), "The checkout page ship to a different address checkbox isn't displayed");
        //assert checkout page name and address submit button is displayed
        assertTrue(checkoutPage.isCheckoutPageNameAddressSubmitButtonDisplayed(), "The checkout page name and address submit button isn't displayed");
    }

    //checkout page shipping address section web element assert test method
    protected void isCheckoutPageShippingAddressSectionWebElementDisplayed(CheckoutPage checkoutPage){
        //assert checkout page shipping address section first name subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameShipAddressFirstNameSubtextDisplayed(), "The checkout page shipping address section first name subtext isn't displayed");
        //assert checkout page shipping address section first name input field is displayed
        assertTrue(checkoutPage.isCheckoutPageNameShipAddressFirstNameInputFieldDisplayed(), "The checkout page shipping address section first name input field isn't displayed");
        //assert checkout page shipping address section last name subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameShipAddressLastNameSubtextDisplayed(), "The checkout page shipping address section last name subtext isn't displayed");
        //assert checkout page shipping address section last name input field is displayed
        assertTrue(checkoutPage.isCheckoutPageNameShipAddressLastNameInputFieldDisplayed(), "The checkout page shipping address section last name input field isn't displayed");
        //assert checkout page shipping address section address 1 subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameShipAddressAddress1SubtextDisplayed(), "The checkout page shipping address section address 1 subtext isn't displayed");
        //assert checkout page shipping address section address 1 input field is displayed
        assertTrue(checkoutPage.isCheckoutPageNameShipAddressAddress1InputFieldDisplayed(), "The checkout page shipping address section address 1 input field isn't displayed");
        //assert checkout page shipping address section address 2 subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameShipAddressAddress2SubtextDisplayed(), "The checkout page shipping address section address 2 subtext isn't displayed");
        //assert checkout page shipping address section address 2 input field is displayed
        assertTrue(checkoutPage.isCheckoutPageNameShipAddressAddress2InputFieldDisplayed(), "The checkout page shipping address section address 2 input field isn't displayed");
        //assert checkout page shipping address section city subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameShipAddressCitySubtextDisplayed(), "The checkout page shipping address section city subtext isn't displayed");
        //assert checkout page shipping address section city input field is displayed
        assertTrue(checkoutPage.isCheckoutPageNameShipAddressCityInputFieldDisplayed(), "The checkout page shipping address section city input field isn't displayed");
        //assert checkout page shipping address section country subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameShipAddressCountrySubtextDisplayed(), "The checkout page shipping address section country subtext isn't displayed");
        //assert checkout page shipping address section country input field is displayed
        assertTrue(checkoutPage.isCheckoutPageNameShipAddressCountryDropdownMenuDisplayed(), "The checkout page shipping address section country dropdown menu isn't displayed");
        //assert checkout page shipping address section state subtext is displayed
        //assertTrue(checkoutPage.isCheckoutPageNameShipAddressStateSubtextDisplayed(), "The checkout page shipping address section state subtext isn't displayed");
        //assert checkout page shipping address section state input field is displayed
        //assertTrue(checkoutPage.isCheckoutPageNameShipAddressStateDropdownMenuDisplayed(), "The checkout page shipping address section state dropdown menu isn't displayed");
        //assert checkout page shipping address section post code subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameShipAddressPostCodeSubtextDisplayed(), "The checkout page shipping address section post code subtext isn't displayed");
        //assert checkout page shipping address section post code input field is displayed
        assertTrue(checkoutPage.isCheckoutPageNameShipAddressPostCodeInputFieldDisplayed(), "The checkout page shipping address section post code input field isn't displayed");
        //assert checkout page shipping address section phone subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameShipAddressPhoneSubtextDisplayed(), "The checkout page shipping address section phone subtext isn't displayed");
        //assert checkout page shipping address section phone input field is displayed
        assertTrue(checkoutPage.isCheckoutPageNameShipAddressPhoneInputFieldDisplayed(), "The checkout page shipping address section phone input field isn't displayed");
        //assert checkout page shipping address section fax subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageNameShipAddressFaxSubtextDisplayed(), "The checkout page shipping address section fax subtext isn't displayed");
        //assert checkout page shipping address section fax input field is displayed
        assertTrue(checkoutPage.isCheckoutPageNameShipAddressFaxInputFieldDisplayed(), "The checkout page shipping address section fax input field isn't displayed");
    }

    //checkout page registered user only web element assert test method
    protected void isCheckoutPageRegUserWebElementDisplayed(CheckoutPage checkoutPage) {
        //assert checkout page registered user description is displayed
        assertTrue(checkoutPage.isCheckoutPageRegUserDescriptionDisplayed(), "The checkout page registered user description isn't displayed");
        //assert checkout page view profile link is displayed
        assertTrue(checkoutPage.isCheckoutPageViewProfileLinkDisplayed(), "The checkout page view profile link isn't displayed");
        //assert checkout page sign out link is displayed
        assertTrue(checkoutPage.isCheckoutPageSignOutLinkDisplayed(), "The checkout page sign out link isn't displayed");
    }

    //checkout page shipping method section web element assert test method
    protected void isCheckoutPageShippingSectionWebElementDisplayed(CheckoutPage checkoutPage) {
        //assert checkout page shipping method example US delivery radio button is displayed
        assertTrue(checkoutPage.isCheckoutPageShipMethodExampleUSDeliveryRadioButtonDisplayed(), "The checkout page shipping method example US delivery radio button isn't displayed");
        //assert checkout page shipping method example US delivery subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageShipMethodExampleUSDeliverySubtextDisplayed(), "The checkout page shipping method example US delivery subtext isn't displayed");
        //assert checkout page shipping method example US delivery price is displayed
        assertTrue(checkoutPage.isCheckoutPageShipMethodExampleUSDeliveryPriceDisplayed(), "The checkout page shipping method example US delivery price isn't displayed");
        //assert checkout page shipping method example US delivery one radio button is displayed
        assertTrue(checkoutPage.isCheckoutPageShipMethodExampleUSDelivery1RadioButtonDisplayed(), "The checkout page shipping method example US delivery one radio button isn't displayed");
        //assert checkout page shipping method example US delivery one subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageShipMethodExampleUSDelivery1SubtextDisplayed(), "The checkout page shipping method example US delivery one subtext isn't displayed");
        //assert checkout page shipping method example US delivery one price is displayed
        assertTrue(checkoutPage.isCheckoutPageShipMethodExampleUSDelivery1PriceDisplayed(), "The checkout page shipping method example US delivery one price isn't displayed");
        //assert checkout page shipping method example US delivery two radio button is displayed
        assertTrue(checkoutPage.isCheckoutPageShipMethodExampleUSDelivery2RadioButtonDisplayed(), "The checkout page shipping method example US delivery two radio button isn't displayed");
        //assert checkout page shipping method example US delivery two subtext is displayed
        assertTrue(checkoutPage.isCheckoutPageShipMethodExampleUSDelivery2SubtextDisplayed(), "The checkout page shipping method example US delivery two subtext isn't displayed");
        //assert checkout page shipping method example US delivery two price is displayed
        assertTrue(checkoutPage.isCheckoutPageShipMethodExampleUSDelivery2PriceDisplayed(), "The checkout page shipping method example US delivery two price isn't displayed");
    }

    //order invoice page web element assert test method
    protected void isOrderInvoicePageWebElementDisplayed(OrderInvoicePage orderInvoicePage){
        //assert order invoice page title is displayed
        assertTrue(orderInvoicePage.isOrderInvoicePageTitleDisplayed(), "The order invoice page title isn't displayed");
        //assert order invoice page subtitle is displayed
        assertTrue(orderInvoicePage.isOrderInvoicePageSubtitleDisplayed(), "The order invoice page subtitle isn't displayed");
        //assert order invoice page order placement success message is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceOrderPlacementSuccessMessageDisplayed(), "The order invoice page order placement success message isn't displayed");
        //assert order invoice page print invoice link is displayed
        assertTrue(orderInvoicePage.isOrderInvoicePagePrintInvoiceLinkDisplayed(), "The order invoice page print invoice link isn't displayed");
        //order invoice table
        //assert order invoice table x cart logo is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceXCartLogoDisplayed(), "The order invoice table X cart logo isn't displayed");
        //assert order invoice table column one (data block) is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceColumnOneDisplayed(), "The order invoice table column one isn't displayed");
        //assert order invoice table column two (data block) is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceColumnTwoDisplayed(), "The order invoice table column two isn't displayed");
        //table
        //assert order invoice table order email subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceOrderEmailSubtextDisplayed(), "The order invoice table order email subtext isn't displayed");
        //assert order invoice table order email is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceOrderEmailDisplayed(), "The order invoice table order email isn't displayed");
        //billing address column
        //assert order invoice table billing address subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceBillingAddressSubtextDisplayed(), "The order invoice table billing address subtext isn't displayed");
        //assert order invoice table billing address first name subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceBillingAddressFirstNameSubtextDisplayed(), "The order invoice table billing address first name subtext isn't displayed");
        //assert order invoice table billing address first name is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceBillingAddressFirstNameDisplayed(), "The order invoice table billing address first name isn't displayed");
        //assert order invoice table billing address last name subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceBillingAddressLastNameSubtextDisplayed(), "The order invoice table billing address last name subtext isn't displayed");
        //assert order invoice table billing address last name is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceBillingAddressLastNameDisplayed(), "The order invoice table billing address last name isn't displayed");
        //assert order invoice table billing address1 subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceBillingAddress1SubtextDisplayed(), "The order invoice table billing address1 subtext isn't displayed");
        //assert order invoice table billing address1 is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceBillingAddressDisplayed(), "The order invoice table billing address1 isn't displayed");
        //assert order invoice table billing address city subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceBillingAddressCitySubtextDisplayed(), "The order invoice table billing address city subtext isn't displayed");
        //assert order invoice table billing address city is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceBillingAddressCityDisplayed(), "The order invoice table billing address city isn't displayed");
        //assert order invoice table billing address state subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceBillingAddressStateSubtextDisplayed(), "The order invoice table billing address state subtext isn't displayed");
        //assert order invoice table billing address state is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceBillingAddressStateDisplayed(), "The order invoice table billing address state isn't displayed");
        //assert order invoice table billing address country subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceBillingAddressCountrySubtextDisplayed(), "The order invoice table billing address country subtext isn't displayed");
        //assert order invoice table billing address country is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceBillingAddressCountryDisplayed(), "The order invoice table billing address country isn't displayed");
        //assert order invoice table billing address post code subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceBillingAddressPostCodeSubtextDisplayed(), "The order invoice table billing address post code subtext isn't displayed");
        //assert order invoice table billing address post code is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceBillingAddressPostCodeDisplayed(), "The order invoice table billing address post code isn't displayed");
        //assert order invoice table billing address phone subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceBillingAddressPhoneSubtextDisplayed(), "The order invoice table billing address phone subtext isn't displayed");
        //assert order invoice table billing address phone is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceBillingAddressPhoneDisplayed(), "The order invoice table billing address phone isn't displayed");
        //assert order invoice table billing address fax subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceBillingAddressFaxSubtextDisplayed(), "The order invoice table billing address fax subtext isn't displayed");
        //shipping address column
        //assert order invoice table shipping address subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceShippingAddressSubtextDisplayed(), "The order invoice table shipping address subtext isn't displayed");
        //assert order invoice table shipping address first name subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceShippingAddressFirstNameSubtextDisplayed(), "The order invoice table shipping address first name subtext isn't displayed");
        //assert order invoice table shipping address first name is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceShippingAddressFirstNameDisplayed(), "The order invoice table shipping address first name isn't displayed");
        //assert order invoice table shipping address last name subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceShippingAddressLastNameSubtextDisplayed(), "The order invoice table shipping address last name subtext isn't displayed");
        //assert order invoice table shipping address last name is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceShippingAddressLastNameDisplayed(), "The order invoice table shipping address last name isn't displayed");
        //assert order invoice table shipping address1 subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceShippingAddress1SubtextDisplayed(), "The order invoice table shipping address1 subtext isn't displayed");
        //assert order invoice table shipping address1 is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceShippingAddressDisplayed(), "The order invoice table shipping address isn't displayed");
        //assert order invoice table shipping city subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceShippingAddressCitySubtextDisplayed(), "The order invoice table shipping city subtext isn't displayed");
        //assert order invoice table shipping city is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceShippingAddressCityDisplayed(), "The order invoice table shipping city isn't displayed");
        //assert order invoice table shipping state subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceShippingAddressStateSubtextDisplayed(), "The order invoice table shipping state subtext isn't displayed");
        //assert order invoice table shipping state is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceShippingAddressStateDisplayed(), "The order invoice table shipping state isn't displayed");
        //assert order invoice table shipping country subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceShippingAddressCountrySubtextDisplayed(), "The order invoice table shipping country subtext isn't displayed");
        //assert order invoice table shipping country is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceShippingAddressCountryDisplayed(), "The order invoice table shipping country isn't displayed");
        //assert order invoice table shipping post code subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceShippingAddressPostCodeSubtextDisplayed(), "The order invoice table shipping post code subtext isn't displayed");
        //assert order invoice table shipping city is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceShippingAddressPostCodeDisplayed(), "The order invoice table shipping post code isn't displayed");
        //assert order invoice table shipping phone subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceShippingAddressPhoneSubtextDisplayed(), "The order invoice table shipping phone subtext isn't displayed");
        //assert order invoice table shipping city is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceShippingAddressPhoneDisplayed(), "The order invoice table shipping phone isn't displayed");
        //assert order invoice table shipping fax subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceShippingAddressFaxSubtextDisplayed(), "The order invoice table shipping fax subtext isn't displayed");
        //assert order invoice page thank you message is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceThankYouMessageDisplayed(), "The order invoice page thank you message isn't displayed");
        //assert order invoice page continue shopping button is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceContinueShoppingButtonDisplayed(), "The order invoice page continue shopping button isn't displayed");
    }

    //order invoice product table web element assert text method
    protected void isOrderInvoicePageProductTableWebElementDisplayed(OrderInvoicePage orderInvoicePage){
        //assert order products table subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceProductsOrderedSubtextDisplayed(), "The order products table subtext isn't displayed");
        //list elements
        //assert order products table product SKU codes are displayed (as a list)
        assertTrue(orderInvoicePage.isOrderInvoiceProductSKUCodeDisplayed(), "The order products table product SKU codes aren't displayed");
        //assert order products table product details are displayed (as a list)
        assertTrue(orderInvoicePage.isOrderInvoiceProductDetailsDisplayed(), "The order products table product details aren't displayed");
        //assert order products table product item prices are displayed (as a list)
        assertTrue(orderInvoicePage.isOrderInvoiceProductItemPriceDisplayed(), "The order products table product item prices aren't displayed");
        //assert order products table product quantities are displayed (as a list)
        assertTrue(orderInvoicePage.isOrderInvoiceProductQtyDisplayed(), "The order products table product quantities aren't displayed");
        //assert order products table product total prices are displayed (as a list)
        assertTrue(orderInvoicePage.isOrderInvoiceProductTotalPriceDisplayed(), "The order products table product total prices aren't displayed");
        //singular table elements
        //assert order products table order subtotal price subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceProductsOrderSubtotalPriceSubtextDisplayed(), "The order products table order subtotal price subtext isn't displayed");
        //assert order products table order subtotal price is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceProductsOrderSubtotalPriceDisplayed(), "The order products table order subtotal price isn't displayed");
        //assert order products table order shipping price subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceProductsOrderShippingPriceSubtextDisplayed(), "The order products table order shipping price subtext isn't displayed");
        //assert order products table order shipping price is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceProductsOrderShippingPriceDisplayed(), "The order products table order shipping price isn't displayed");
        //assert order products table order payment method surcharge subtext is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceProductsOrderPaymentMethodSurchargeSubtextDisplayed(), "The order products table order payment method surcharge subtext isn't displayed");
        //assert order products table order payment method surcharge is displayed
        assertTrue(orderInvoicePage.isOrderInvoiceProductsOrderPaymentMethodSurchargeDisplayed(), "The order products table order payment method surcharge isn't displayed");
        //assert order products table order total price subtext is displayed
        //assertTrue(orderInvoicePage.isOrderInvoiceProductsOrderTotalPriceSubtextDisplayed(), "The order products table order total price subtext isn't displayed");
        //assert order products table order total price is displayed
        //assertTrue(orderInvoicePage.isOrderInvoiceProductsOrderTotalPriceDisplayed(), "The order products table order total price isn't displayed");
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

    //account details page text element assert test method
    protected void isAccountDetailsPageTextElementAsExpected(AccountDetailsPage accountDetailsPage) {
        //assert account details page title is as expected
        assertEquals("Account details", accountDetailsPage.getAccountDetailsPageTitle(), "The account details page title doesn't match expectations.");
        //assert account details page description is as expected
        assertEquals("This form enables you to modify your profile so that your data is always up to date\n" + "\n" + "The fields marked with * are mandatory.", accountDetailsPage.getAccountDetailsPageDescription(), "The account details page description doesn't match expectations.");
        //personal information
        //assert account details page personal information section title is as expected
        assertEquals("Personal information", accountDetailsPage.getAccountDetailsPagePersonalInfoSectionTitle(), "The account details page personal information section title doesn't match expectations.");
        //assert account details page first name subtext is as expected
        assertEquals("First name", accountDetailsPage.getAccountDetailsPageFirstNameSubtext(), "The account details page first name subtext doesn't match expectations.");
        //assert account details page last name subtext is as expected
        assertEquals("Last name", accountDetailsPage.getAccountDetailsPageLastNameSubtext(), "The account details page last name subtext doesn't match expectations.");
        //assert account details page company subtext is as expected
        assertEquals("Company", accountDetailsPage.getAccountDetailsPageCompanySubtext(), "The account details page company subtext doesn't match expectations.");
        //assert account details page website subtext is as expected
        assertEquals("Web site", accountDetailsPage.getAccountDetailsPageWebsiteSubtext(), "The account details page website subtext doesn't match expectations.");
        //assert account details page tax number subtext is as expected
        assertEquals("Tax number", accountDetailsPage.getAccountDetailsPageTaxNumberSubtext(), "The account details page tax number subtext doesn't match expectations.");
        //account information
        //assert account details page account information section title is as expected
        assertEquals("Account information", accountDetailsPage.getAccountDetailsPageAccountInfoSectionTitle(), "The account details page account information section title doesn't match expectations.");
        //assert account details page email subtext is as expected
        assertEquals("Email", accountDetailsPage.getAccountDetailsPageEmailSubtext(), "The account details page email subtext doesn't match expectations.");
        //assert account details page password subtext is as expected
        assertEquals("Password", accountDetailsPage.getAccountDetailsPagePasswordSubtext(), "The account details page password subtext doesn't match expectations.");
        //newsletter section
        //assert account details page newsletter section title is as expected
        assertEquals("Newsletter", accountDetailsPage.getAccountDetailsPageNewsletterSectionTitle(), "The account details page newsletter section title doesn't match expectations.");
        //assert account details page newsletter subtext is as expected
        assertEquals("If you wish to receive our newsletters, please select the news lists to which you want to subscribe:", accountDetailsPage.getAccountDetailsPageNewsletterSubtext(), "The account details page newsletter subtext doesn't match expectations.");
        //assert account details page exclusive offers subtext is as expected
        assertEquals("Exclusive special offers", accountDetailsPage.getAccountDetailsPageExclusiveOffersSubtext(), "The account details page exclusive offers subtext doesn't match expectations.");
        //assert account details page exclusive offers description is as expected
        assertEquals("Information about our exclusive offers available only by subscription", accountDetailsPage.getAccountDetailsPageExclusiveOffersDescription(), "The account details page exclusive offers description doesn't match expectations.");
        //assert account details page site updates subtext is as expected
        assertEquals("Site updates", accountDetailsPage.getAccountDetailsPageSiteUpdatesSubtext(), "The account details page site updates subtext doesn't match expectations.");
        //assert account details page site updates description is as expected
        assertEquals("News regarding our shop new offers and products", accountDetailsPage.getAccountDetailsPageSiteUpdatesDescription(), "The account details page site updates description doesn't match expectations.");
    }

    //change password form text element assert test method
    protected void isChangePasswordFormTextElementAsExpected(AccountDetailsPage accountDetailsPage) {
        //assert change password form section title is as expected
        assertEquals("Change password", accountDetailsPage.getAccountDetailsPageChangePasswordFormSectionTitle(), "The account details page change password form section title doesn't match expectations.");
        //assert change password form email subtext is as expected
        assertEquals("Email:", accountDetailsPage.getAccountDetailsPageChangePasswordFormEmailSubtext(), "The account details page change password form email subtext doesn't match expectations.");
        //assert change password form old password subtext is as expected
        assertEquals("Old Password:", accountDetailsPage.getAccountDetailsPageChangePasswordFormOldPasswordSubtext(), "The account details page change password form old password subtext doesn't match expectations.");
        //assert change password form new password subtext is as expected
        assertEquals("New Password:", accountDetailsPage.getAccountDetailsPageChangePasswordFormNewPasswordSubtext(), "The account details page change password form new password subtext doesn't match expectations.");
        //assert change password form confirm password subtext is as expected
        assertEquals("Confirm password:", accountDetailsPage.getAccountDetailsPageChangePasswordFormConfirmPasswordSubtext(), "The account details page change password form confirm password subtext doesn't match expectations.");

    }

    //new address form page text element assert test method
    protected void isNewAddressFormTextElementAsExpected(AddressBookPage addressBookPage) {
        //assert new address form title is as expected
        assertEquals("New address", addressBookPage.getNewAddressFormTitle(), "The new address form title doesn't match expectations.");
        //assert new address form use billing address subtext is as expected
        assertEquals("Use as billing address", addressBookPage.getNewAddressFormUseBillingAddressSubtext(), "The new address form 'use billing address' subtext doesn't match expectations.");
        //assert new address form use shipping address subtext is as expected
        assertEquals("Use as shipping address", addressBookPage.getNewAddressFormUseShippingAddressSubtext(), "The new address form 'use shipping address' subtext doesn't match expectations.");
    }

    //address form text element test method
    protected void isAddressFormTextElementAsExpected(AddressBookPage addressBookPage) {
        //assert new address form first name subtext is as expected
        assertEquals("First name", addressBookPage.getNewAddressFormFirstNameSubtext(), "The new address form first name subtext doesn't match expectations.");
        //assert new address form last name subtext is as expected
        assertEquals("Last name", addressBookPage.getNewAddressFormLastNameSubtext(), "The new address form last name subtext doesn't match expectations.");
        //assert new address form address 1 subtext is as expected
        assertEquals("Address", addressBookPage.getNewAddressFormAddress1Subtext(), "The new address form address 1 subtext doesn't match expectations.");
        //assert new address form address 2 subtext is as expected
        assertEquals("Address (line 2)", addressBookPage.getNewAddressFormAddress2Subtext(), "The new address form address 2 subtext doesn't match expectations.");
        //assert new address form city subtext is as expected
        assertEquals("City", addressBookPage.getNewAddressFormCitySubtext(), "The new address form city subtext doesn't match expectations.");
        //assert new address form country subtext is as expected
        assertEquals("Country", addressBookPage.getNewAddressFormCountrySubtext(), "The new address form country subtext doesn't match expectations.");
        //assert new address form state subtext is as expected
        assertEquals("State", addressBookPage.getNewAddressFormStateSubtext(), "The new address form state subtext doesn't match expectations.");
        //assert new address form post code subtext is as expected
        assertEquals("Zip/Postal code", addressBookPage.getNewAddressFormPostCodeSubtext(), "The new address form post code subtext doesn't match expectations.");
        //assert new address form phone subtext is as expected
        assertEquals("Phone", addressBookPage.getNewAddressFormPhoneSubtext(), "The new address form phone subtext doesn't match expectations.");
        //assert new address form fax subtext is as expected
        assertEquals("Fax", addressBookPage.getNewAddressFormFaxSubtext(), "The new address form fax subtext doesn't match expectations.");
    }

    //sign in form page text element assert test method
    protected void isSignInFormPageTextAsExpected(SignInFormPage signInFormPage) {
        //assert sign in form page title is as expected
        assertEquals("Authentication", signInFormPage.getSignInFormPageTitle(), "The sign in form page title doesn't match expectations.");
        //assert sign in form page email subtext is as expected
        assertEquals("Email", signInFormPage.getSignInFormPageEmailSubtext(), "The sign in form page email subtext doesn't match expectations.");
        //assert sign in form page password subtext is as expected
        assertEquals("Password", signInFormPage.getSignInFormPagePasswordSubtext(), "The sign in form page password subtext doesn't match expectations.");
    }

    //shopping cart form text element assert test method
    protected void isShoppingCartFormTextElementAsExpected(HomePage homePage) {
        //assert shopping cart form your cart section subtitle is as expected
        assertEquals("Your cart", homePage.getShoppingCartFormYourCartSectionSubtitle(), "The shopping cart form your cart section subtitle doesn't match expectations.");
    }

    //single product category dashboard page text element assert test method
    protected void isSingleProductCategoryDashboardPageTextElementAsExpected(SingleProductCategoryDashboardPage singleProductCategoryDashboardPage) {
        //assert single product category dashboard page subtitle is as expected
        assertEquals("Products", singleProductCategoryDashboardPage.getSingleProductCategoryDashboardPageSubtitle(), "The single product category dashboard page subtitle doesn't match expectations.");
    }

    //products map page text element assert test method
    protected void isProductsMapTextElementAsExpected(ProductsMapPage productsMapPage) {
        //assert products map page title is as expected
        assertEquals("Products Map", productsMapPage.getProductsMapPageTitle(), "The products map page title doesn't match expectations.");
    }

    //wishlist page text element assert test method
    protected void isWishlistPageTextElementAsExpected(WishlistPage wishlistPage) {
        //assert wishlist page title is as expected
        assertEquals("Wish list", wishlistPage.getWishlistPageTitle(), "The wishlist page title doesn't match expectations.");
        //assert wishlist page send wishlist subtext is as expected
        assertEquals("Send entire wish list by email:", wishlistPage.getWishlistPageSendWishlistSubtext(), "The wishlist page send wishlist subtext doesn't match expectations.");
    }

    //shopping cart page text element assert test method
    protected void isShoppingCartPageTextElementAsExpected(ShoppingCartPage shoppingCartPage) {
        //assert shopping cart page title is as expected
        assertEquals("Your shopping cart", shoppingCartPage.getShoppingCartPageTitle(), "The shopping cart page title doesn't match expectations.");
        //assert shopping cart page description is as expected
        assertEquals("Please note: 1) Delivery Method is ignored if you are ordering Gift Certificates or electronically distributed products. 2) Gift Certificates are redeemed during Checkout process.", shoppingCartPage.getShoppingCartPageDescription(), "The shopping cart page description doesn't match expectations.");
        //assert shopping cart page subtotal subtitle is as expected
        assertEquals("Subtotal:", shoppingCartPage.getShoppingCartSubtotalSubtitle(), "The shopping cart page subtotal subtitle doesn't match expectations.");
        //assert shopping cart page add gift to wrap subtitle is as expected
        assertEquals("Add gift wrap", shoppingCartPage.getShoppingCartAddGiftWrapSubtitle(), "The shopping cart page add gift to wrap subtitle doesn't match expectations.");
        //assert shopping cart page discount section title is as expected
        assertEquals("Redeem a discount coupon", shoppingCartPage.getShoppingCartDiscountSectionTitle(), "The shopping cart page discount section title doesn't match expectations.");
        //assert shopping cart page discount subtext is as expected
        assertEquals("Have a coupon?", shoppingCartPage.getShoppingCartDiscountSubtext(), "The shopping cart page discount subtext doesn't match expectations.");
    }

    //checkout page text element assert test method
    protected void isCheckoutPageTextElementAsExpected(CheckoutPage checkoutPage) {
        //assert checkout page title is as expected
        assertEquals("Checkout", checkoutPage.getCheckoutPageTitle(), "The checkout page title doesn't match expectations.");
        //shipping method
        //assert checkout page shipping method section title is as expected
        assertEquals("Shipping method", checkoutPage.getCheckoutPageShipMethodSectionTitle(), "The checkout page shipping method section title doesn't match expectations.");
        //payment method
        //assert checkout page payment method section title is as expected
        assertEquals("Payment method", checkoutPage.getCheckoutPagePayMethodSectionTitle(), "The checkout page payment method section title doesn't match expectations.");
        //assert checkout page payment method phone ordering subtext is as expected
        assertEquals("Phone Ordering\n" +
                "Phone: (555) 555-5555", checkoutPage.getCheckoutPagePayMethodPhoneOrderingSubtext(), "The checkout page payment method phone ordering subtext doesn't match expectations.");
        //assert checkout page payment method gift certificate subtext is as expected
        assertEquals("Gift Certificate", checkoutPage.getCheckoutPagePayMethodGiftCertificateSubtext(), "The checkout page payment method gift certificate subtext doesn't match expectations.");
        //assert checkout page payment method fax ordering subtext is as expected
        assertEquals("Fax Ordering\n" +
                "Fax: (555) 555-5555", checkoutPage.getCheckoutPagePayMethodFaxOrderingSubtext(), "The checkout page payment method fax ordering subtext doesn't match expectations.");
        //assert checkout page payment method money order subtext is as expected
        assertEquals("Money Order\n" +
                "US Banks Only", checkoutPage.getCheckoutPagePayMethodMoneyOrderingSubtext(), "The checkout page payment method money order subtext doesn't match expectations.");
        //assert checkout page payment method purchase order subtext is as expected //Selenium fails to find this element with VALID selector
        assertEquals("Purchase Order", checkoutPage.getCheckoutPagePayMethodPurchaseOrderSubtext(), "The checkout page payment method purchase order subtext doesn't match expectations.");
        //assert checkout page payment method sage pay go subtext is as expected
        assertEquals("Sage Pay Go - Form protocol(test cards)", checkoutPage.getCheckoutPagePayMethodSagePayGoSubtext(), "The checkout page payment method sage pay go subtext doesn't match expectations.");
        //assert checkout page payment method x payment subtext is as expected
        assertEquals("X-Payments: X-Payments DEMO", checkoutPage.getCheckoutPagePayMethodXPaymentSubtext(), "The checkout page payment method x payment subtext doesn't match expectations.");
        //order summary
        //assert checkout page order summary section title is as expected
        assertEquals("Order summary", checkoutPage.getCheckoutPageOrderSummarySectionTitle(), "The checkout page order summary section title doesn't match expectations.");
        //discount coupon
        //assert checkout page discount coupon section title link is as expected
        assertEquals("Redeem a discount coupon", checkoutPage.getCheckoutPageDiscountCouponSectionTitle(), "The checkout page discount coupon section title link doesn't match expectations.");
        //assert checkout page discount coupon section subtitle is as expected
        assertEquals("Customer notes:", checkoutPage.getCheckoutPageDiscountCouponSectionSubtitle(), "The checkout page discount coupon section subtitle doesn't match expectations.");
        //assert checkout page discount coupon section accept terms subtext is as expected
        assertEquals("I accept the \"Terms & Conditions\" and \"Privacy statement\"", checkoutPage.getCheckoutPageDiscountCouponAcceptTermsSubtext(), "The checkout page discount coupon accept terms subtext doesn't match expectations.");
    }

    //checkout page (guest) text element assert test method
    protected void isCheckoutPageGuestTextElementAsExpected(CheckoutPage checkoutPage) {
        //assert checkout page guest description is as expected
        assertEquals("Please enter your Name and Address then click \"Submit\" below before selecting Shipping and Payment Method.\n" +
                "If you already have an account please sign in", checkoutPage.getCheckoutPageGuestDescription(), "The checkout page guest description doesn't match expectations.");
        //assert checkout page name address section title is as expected
        assertEquals("Name and address", checkoutPage.getCheckoutPageNameAddressSectionTitle(), "The checkout page name address section title doesn't match expectations.");
        //assert checkout page name address first name subtext is as expected
        assertEquals("First name", checkoutPage.getCheckoutPageNameAddressFirstNameSubtext(), "The checkout page name address first name subtext doesn't match expectations.");
        //assert checkout page name address last name subtext is as expected
        assertEquals("Last name", checkoutPage.getCheckoutPageNameAddressLastNameSubtext(), "The checkout page name address last name subtext doesn't match expectations.");
        //assert checkout page name address section address 1 subtext is as expected
        assertEquals("Address", checkoutPage.getCheckoutPageNameAddressAddress1Subtext(), "The checkout page name address section address 1 subtext doesn't match expectations.");
        //assert checkout page name address section address 2 subtext is as expected
        assertEquals("Address (line 2)", checkoutPage.getCheckoutPageNameAddressAddress2Subtext(), "The checkout page name address section address 2 subtext doesn't match expectations.");
        //assert checkout page name address city subtext is as expected
        assertEquals("City", checkoutPage.getCheckoutPageNameAddressCitySubtext(), "The checkout page name address city subtext doesn't match expectations.");
        //assert checkout page name address country subtext is as expected
        assertEquals("Country", checkoutPage.getCheckoutPageNameAddressCountrySubtext(), "The checkout page name address country subtext doesn't match expectations.");
        //assert checkout page name address state subtext is as expected
        //assertEquals("State", checkoutPage.getCheckoutPageNameAddressStateSubtext(), "The checkout page name address state subtext doesn't match expectations.");
        //assert checkout page name address post code subtext is as expected
        assertEquals("Zip/Postal code", checkoutPage.getCheckoutPageNameAddressPostCodeSubtext(), "The checkout page name address post code subtext doesn't match expectations.");
        //assert checkout page name address phone subtext is as expected
        assertEquals("Phone", checkoutPage.getCheckoutPageNameAddressPhoneSubtext(), "The checkout page name address phone subtext doesn't match expectations.");
        //assert checkout page name address fax subtext is as expected
        assertEquals("Fax", checkoutPage.getCheckoutPageNameAddressFaxSubtext(), "The checkout page name address fax subtext doesn't match expectations.");
        //assert checkout page name address email subtext is as expected
        assertEquals("Email", checkoutPage.getCheckoutPageNameAddressEmailSubtext(), "The checkout page name address email subtext doesn't match expectations.");
        //assert checkout page name address create account subtext is as expected
        assertEquals("Create account for this Email", checkoutPage.getCheckoutPageNameAddressCreateAccountSubtext(), "The checkout page name address create account subtext doesn't match expectations.");
        //assert checkout page name address ship to a different address subtext is as expected
        assertEquals("Ship to a different address", checkoutPage.getCheckoutPageNameAddressShipDiffAddressSubtext(), "The checkout page name address ship to a different address subtext doesn't match expectations.");
    }

    //checkout page (shipping address section) text element assert test method
    protected void isCheckoutPageShipAddressSectionTextElementAsExpected(CheckoutPage checkoutPage){
        //assert checkout page name address shipping address section first name subtext is as expected
        assertEquals("First name", checkoutPage.getCheckoutPageNameShipAddressFirstNameSubtext(), "The checkout page name address first name subtext doesn't match expectations.");
        //assert checkout page name address shipping address section last name subtext is as expected
        assertEquals("Last name", checkoutPage.getCheckoutPageNameShipAddressLastNameSubtext(), "The checkout page name address last name subtext doesn't match expectations.");
        //assert checkout page name address shipping address section address 1 subtext is as expected
        assertEquals("Address", checkoutPage.getCheckoutPageNameShipAddressAddress1Subtext(), "The checkout page name address section address 1 subtext doesn't match expectations.");
        //assert checkout page name address shipping address section address 2 subtext is as expected
        assertEquals("Address (line 2)", checkoutPage.getCheckoutPageNameShipAddressAddress2Subtext(), "The checkout page name address section address 2 subtext doesn't match expectations.");
        //assert checkout page name address shipping address section city subtext is as expected
        assertEquals("City", checkoutPage.getCheckoutPageNameShipAddressCitySubtext(), "The checkout page name address city subtext doesn't match expectations.");
        //assert checkout page name address shipping address section country subtext is as expected
        assertEquals("Country", checkoutPage.getCheckoutPageNameShipAddressCountrySubtext(), "The checkout page name address country subtext doesn't match expectations.");
        //assert checkout page name address shipping address section state subtext is as expected
        //assertEquals("State", checkoutPage.getCheckoutPageNameShipAddressStateSubtext(), "The checkout page name address state subtext doesn't match expectations.");
        //assert checkout page name address shipping address section post code subtext is as expected
        assertEquals("Zip/Postal code", checkoutPage.getCheckoutPageNameShipAddressPostCodeSubtext(), "The checkout page name address post code subtext doesn't match expectations.");
        //assert checkout page name address shipping address section phone subtext is as expected
        assertEquals("Phone", checkoutPage.getCheckoutPageNameShipAddressPhoneSubtext(), "The checkout page name address phone subtext doesn't match expectations.");
        //assert checkout page name address shipping address section fax subtext is as expected
        assertEquals("Fax", checkoutPage.getCheckoutPageNameShipAddressFaxSubtext(), "The checkout page name address fax subtext doesn't match expectations.");
    }

    //checkout page (registered user) text element assert test method
    protected void isCheckoutPageRegUserTextElementAsExpected(CheckoutPage checkoutPage) {
        //assert checkout page registered user description is as expected
        assertEquals("Greetings", checkoutPage.getCheckoutPageRegUserDescription(), "The checkout page registered user description doesn't match expectations.");
    }

    //checkout page (shipping method) text element assert test method
    protected void isCheckoutPageShipMethodTextElementAsExpected(CheckoutPage checkoutPage) {
        //assert checkout page shipping method example US delivery subtext is as expected
        assertEquals("Example US delivery", checkoutPage.getCheckoutPageShipMethodExampleUSDeliverySubtext(), "The checkout page shipping method example US delivery subtext doesn't match expectations.");
        //assert checkout page shipping method example US delivery price is as expected
        assertEquals("$15.00", checkoutPage.getCheckoutPageShipMethodExampleUSDeliveryPrice(), "The checkout page shipping method example US delivery price doesn't match expectations.");
        //assert checkout page shipping method example US delivery one subtext is as expected
        assertEquals("Example national delivery method1", checkoutPage.getCheckoutPageShipMethodExampleDelivery1Subtext(), "The checkout page shipping method example US delivery one subtext doesn't match expectations.");
        //assert checkout page shipping method example US delivery one price is as expected
        assertEquals("$9.00", checkoutPage.getCheckoutPageShipMethodExampleDelivery1Price(), "The checkout page shipping method example US delivery one price doesn't match expectations.");
        //assert checkout page shipping method example US delivery two subtext is as expected
        assertEquals("Example national delivery method2", checkoutPage.getCheckoutPageShipMethodExampleDelivery2Subtext(), "The checkout page shipping method example US delivery two subtext doesn't match expectations.");
        //assert checkout page shipping method example US delivery two price is as expected
        assertEquals("$11.00", checkoutPage.getCheckoutPageShipMethodExampleDelivery2Price(), "The checkout page shipping method example US delivery two price doesn't match expectations.");
    }

    //order invoice page text element test method
    protected void isOrderInvoicePageTextElementAsExpected(OrderInvoicePage orderInvoicePage){
        //assert order invoice page title is as expected
        assertEquals("Invoice", orderInvoicePage.getOrderInvoicePageTitle(), "The order invoice page title doesn't match expectations.");
        //assert order invoice page subtitle is as expected
        assertEquals("Confirmation", orderInvoicePage.getOrderInvoicePageSubtitle(), "The order invoice page subtitle doesn't match expectations.");
        //assert order invoice page order placement success message is as expected
        assertEquals("Congratulations! Your order has been successfully placed.\n" +
                "Thank you for using our store. An order notification has been sent to your email address.\n" +
                "Your order will be processed according to the delivery details.", orderInvoicePage.getOrderInvoiceOrderPlacementSuccessMessage(), "The order invoice page order placement success message doesn't match expectations.");
        //billing address column
        //assert order invoice billing address subtext is as expected
        assertEquals("Billing address", orderInvoicePage.getOrderInvoiceBillingAddressSubtext(), "The order invoice billing address subtext doesn't match expectations.");
        //assert order invoice billing address first name subtext is as expected
        assertEquals("First name:", orderInvoicePage.getOrderInvoiceBillingAddressFirstNameSubtext(), "The order invoice billing address first name subtext doesn't match expectations.");
        //assert order invoice billing address last name subtext is as expected
        assertEquals("Last name:", orderInvoicePage.getOrderInvoiceBillingAddressLastNameSubtext(), "The order invoice billing address last name subtext doesn't match expectations.");
        //assert order invoice billing address1 subtext is as expected
        assertEquals("Address:", orderInvoicePage.getOrderInvoiceBillingAddress1Subtext(), "The order invoice billing address1 subtext doesn't match expectations.");
        //assert order invoice billing address city subtext is as expected
        assertEquals("City:", orderInvoicePage.getOrderInvoiceBillingAddressCitySubtext(), "The order invoice billing address city subtext doesn't match expectations.");
        //assert order invoice billing address state subtext is as expected
        assertEquals("State:", orderInvoicePage.getOrderInvoiceBillingAddressStateSubtext(), "The order invoice billing address state subtext doesn't match expectations.");
        //assert order invoice billing address country subtext is as expected
        assertEquals("Country:", orderInvoicePage.getOrderInvoiceBillingAddressCountrySubtext(), "The order invoice billing address country subtext doesn't match expectations.");
        //assert order invoice billing address post code subtext is as expected
        assertEquals("Zip/Postal code:", orderInvoicePage.getOrderInvoiceBillingAddressPostCodeSubtext(), "The order invoice billing address post code subtext doesn't match expectations.");
        //assert order invoice billing address phone subtext is as expected
        assertEquals("Phone:", orderInvoicePage.getOrderInvoiceBillingAddressPhoneSubtext(), "The order invoice billing address phone subtext doesn't match expectations.");
        //assert order invoice billing address fax subtext is as expected
        assertEquals("Fax:", orderInvoicePage.getOrderInvoiceBillingAddressFaxSubtext(), "The order invoice billing address fax subtext doesn't match expectations.");
        //shipping address column
        //assert order invoice shipping address subtext is as expected
        assertEquals("Shipping address", orderInvoicePage.getOrderInvoiceShippingAddressSubtext(), "The order invoice shipping address subtext doesn't match expectations.");
        //assert order invoice shipping address first name subtext is as expected
        assertEquals("First name:", orderInvoicePage.getOrderInvoiceShippingAddressFirstNameSubtext(), "The order invoice shipping address first name subtext doesn't match expectations.");
        //assert order invoice shipping address last name subtext is as expected
        assertEquals("Last name:", orderInvoicePage.getOrderInvoiceShippingAddressLastNameSubtext(), "The order invoice shipping address last name subtext doesn't match expectations.");
        //assert order invoice shipping address1 subtext is as expected
        assertEquals("Address:", orderInvoicePage.getOrderInvoiceShippingAddress1Subtext(), "The order invoice shipping address1 subtext doesn't match expectations.");
        //assert order invoice shipping address city subtext is as expected
        assertEquals("City:", orderInvoicePage.getOrderInvoiceShippingAddressCitySubtext(), "The order invoice shipping address city subtext doesn't match expectations.");
        //assert order invoice shipping address state subtext is as expected
        assertEquals("State:", orderInvoicePage.getOrderInvoiceShippingAddressStateSubtext(), "The order invoice shipping address state subtext doesn't match expectations.");
        //assert order invoice shipping address country subtext is as expected
        assertEquals("Country:", orderInvoicePage.getOrderInvoiceShippingAddressCountrySubtext(), "The order invoice shipping address country subtext doesn't match expectations.");
        //assert order invoice shipping address post code subtext is as expected
        assertEquals("Zip/Postal code:", orderInvoicePage.getOrderInvoiceShippingAddressPostCodeSubtext(), "The order invoice shipping address post code subtext doesn't match expectations.");
        //assert order invoice shipping address phone subtext is as expected
        assertEquals("Phone:", orderInvoicePage.getOrderInvoiceShippingAddressPhoneSubtext(), "The order invoice shipping address phone subtext doesn't match expectations.");
        //assert order invoice billing address fax subtext is as expected
        assertEquals("Fax:", orderInvoicePage.getOrderInvoiceShippingAddressFaxSubtext(), "The order invoice shipping address fax subtext doesn't match expectations.");
        //order products table
        //assert order invoice products ordered subtext is as expected
        assertEquals("Products ordered", orderInvoicePage.getOrderInvoiceProductsOrderedSubtext(), "The order invoice products ordered subtext doesn't match expectations.");
        //assert order invoice order subtotal price subtext is as expected
        assertEquals("Subtotal:", orderInvoicePage.getOrderInvoiceProductsOrderSubtotalPriceSubtext(), "The order invoice products order subtotal price subtext doesn't match expectations.");
        //assert order invoice order shipping method subtext is as expected
        //assertEquals("Invoice", orderInvoicePage.getOrderInvoiceProductsOrderShippingPriceSubtext(), "The order invoice products order shipping price subtext doesn't match expectations.");
        //assert order invoice order payment method subtext is as expected
        //assertEquals("Invoice", orderInvoicePage.getOrderInvoiceProductsOrderPaymentMethodSurchargeSubtext(), "The order invoice products order payment method subtext doesn't match expectations.");
        //assert order invoice order total price subtext is as expected //Selenium sometimes fails to find this element
        //assertEquals("Total:", orderInvoicePage.getOrderInvoiceProductsOrderTotalPriceSubtext(), "The order invoice products order total price subtext doesn't match expectations.");
        //assert order invoice thank you message is as expected
        assertEquals("Thank you for your purchase!", orderInvoicePage.getOrderInvoiceThankYouMessage(), "The order invoice page thank you message doesn't match expectations.");
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

    //address book data logger method
    protected void logAddressBookPageData(AddressBookPage addressBookPage){
        System.out.println("Address book page displayed user address data: " + "\n");

        logger.info("Address entry title(s): " + addressBookPage.getAddressEntryTitle());
        logger.info("Address entry username(s): " + addressBookPage.getAddressEntryUserName());
        logger.info("Address entry data; " + addressBookPage.getAddressEntryData());

        System.out.println("\n");
    }

    //shopping cart form data logger method
    protected void logShoppingCartFormProductData(HomePage homePage){
        System.out.println("Shopping cart form page displayed product data: " + "\n");

        logger.info("Shopping cart form page product name(s): " + homePage.getShoppingCartFormProductNameLinkText());
        logger.info("Shopping cart form page product unit price(s): " + homePage.getShoppingCartFormProductUnitPriceText());
        logger.info("Shopping cart form page product alternative unit price(s): " + homePage.getShoppingCartFormProductAltUnitPriceText());
        logger.info("Shopping cart form page product item(s) count: " + homePage.getShoppingCartFormYourCartSectionItemCount());
        logger.info("Shopping cart form page product subtotal price(s): " + homePage.getShoppingCartFormYourCartSectionSubtotalPrice());

        System.out.println("\n");
    }

    //single product category dashboard page data logger method
    protected void logSingleProductCategoryDashboardPageProductData(SingleProductCategoryDashboardPage singleProductCategoryDashboardPage){
        System.out.println("Single product category dashboard page displayed product data: " + "\n");

        logger.info("Single product category dashboard page product name(s): " + singleProductCategoryDashboardPage.getSingleCategoryDashboardPageProductName());
        logger.info("Single product category dashboard page product unit price(s): " + singleProductCategoryDashboardPage.getSingleCategoryDashboardPageProductUnitPrice());
        logger.info("Single product category dashboard page product alt price(s): " + singleProductCategoryDashboardPage.getSingleCategoryDashboardPageProductAltPrice());

        System.out.println("\n");
    }

    //products map page product data logger method
    protected void logProductsMapPageProductData(ProductsMapPage productsMapPage){
        System.out.println("Product map page displayed product data: " + "\n");

        logger.info("Product map page product name(s): " + productsMapPage.getProductMapPageProductName());
        logger.info("Product map page product unit price(s): " + productsMapPage.getProductMapPageProductUnitPrice());
        logger.info("Product map page product alt price(s): " + productsMapPage.getProductMapPageProductAltPrice());

        System.out.println("\n");
    }

    //single product page data logger method
    protected void logSingleProductPageProductData(SingleProductPage singleProductPage){
        System.out.println("Single product page displayed product data: " + "\n");

        logger.info("Single product unit price: " + singleProductPage.getSingleProductUnitPrice());
        logger.info("Single product alt price: " + singleProductPage.getSingleProductAltPrice());
        logger.info("Single product description: " + singleProductPage.getSingleProductDescription());

        System.out.println("\n");
    }

    //single product page ('Digital Angel' t-shirt) data logger method
    protected void logSingleProductTShirtPageProductData(SingleProductPage singleProductPage){
        System.out.println("Single product page ('Digital Angel' t-shirt) displayed product data: " + "\n");

        logger.info("Single product SKU: " + singleProductPage.getSingleProductSKU());
        logger.info("Single product weight: " + singleProductPage.getSingleProductWeight());

        System.out.println("\n");
    }

    //single product page ('Digital Angel' t-shirt) customers also bought section data logger method
    protected void logSingleProductTShirtPageCustomersBoughtProductData(SingleProductPage singleProductPage){
        System.out.println("Single product page ('Digital Angel' t-shirt) customers also bought section displayed product data: " + "\n");

        logger.info("Customers also bought section product name(s): " + singleProductPage.getCustomersAlsoBoughtProductName());
        logger.info("Customers also bought section product unit price(s): " + singleProductPage.getCustomersAlsoBoughtProductUnitPrice());

        System.out.println("\n");
    }

    //wishlist page product data logger method
    protected void logWishlistPageProductData(WishlistPage wishlistPage){
        System.out.println("Wishlist page displayed product data: " + "\n");

        logger.info("Wishlist product name(s): " + wishlistPage.getWishlistPageProductName());
        logger.info("Wishlist product unit price(s): " + wishlistPage.getWishlistPageProductUnitPrice());
        logger.info("Wishlist product quantity(ies): " + wishlistPage.getWishlistPageProductQty());
        logger.info("Wishlist product total price(s): " + wishlistPage.getWishlistPageProductTotalPrice());
        logger.info("Wishlist product alt price(s): " + wishlistPage.getWishlistPageProductAltPrice());

        System.out.println("\n");
    }

    //shopping cart page product data logger method
    protected void logShoppingCartPageProductData(ShoppingCartPage shoppingCartPage){
        System.out.println("Shopping cart displayed product data: " + "\n");

        logger.info("Shopping cart product name(s): " + shoppingCartPage.getShoppingCartPageProductName());
        logger.info("Shopping cart product unit price(s): " + shoppingCartPage.getShoppingCartPageProductUnitPrice());
        logger.info("Shopping cart product quantity(ies): " + shoppingCartPage.getShoppingCartPageProductQty());
        logger.info("Shopping cart product total price(s): " + shoppingCartPage.getShoppingCartPageProductTotalPrice());
        logger.info("Shopping cart product alt price(s): " + shoppingCartPage.getShoppingCartPageProductAltPrice());

        System.out.println("\n");
    }

    //shopping cart page product details data logger method (not all products have this part)
    protected void logShoppingCartPageProductDetailsData(ShoppingCartPage shoppingCartPage){
        System.out.println("Shopping cart displayed product details data: " + "\n");

        logger.info("Shopping cart product(s) details: " + shoppingCartPage.getShoppingCartPageProductDetails());

        System.out.println("\n");
    }

    //checkout page order summary data logger method
    protected void logCheckoutPageOrderSummaryData(CheckoutPage checkoutPage){
        System.out.println("Checkout page displayed order summary data: " + "\n");

        logger.info("Checkout order summary subtotal price: " + checkoutPage.getOrderSummarySubtotalPrice());
        logger.info("Checkout order summary shipping cost: " + checkoutPage.getOrderSummaryShippingCost());
        logger.info("Checkout order summary pay method surcharge: " + checkoutPage.getOrderSummaryPayMethodSurcharge());
        logger.info("Checkout order summary total price: " + checkoutPage.getOrderSummaryTotalPrice());
        logger.info("Checkout order summary total alt price: " + checkoutPage.getOrderSummaryTotalAltPrice());

        System.out.println("\n");
    }

    //checkout page order summary data logger method (without price surcharge)
    protected void logCheckoutPageOrderSummaryNoSurchargeData(CheckoutPage checkoutPage){
        System.out.println("Checkout page displayed order summary data (no price surcharge): " + "\n");

        logger.info("Checkout order summary subtotal price (no price surcharge): " + checkoutPage.getOrderSummarySubtotalPrice());
        logger.info("Checkout order summary shipping cost (no price surcharge): " + checkoutPage.getOrderSummaryShippingCost());
        logger.info("Checkout order summary total price (no price surcharge): " + checkoutPage.getOrderSummaryTotalPrice());
        logger.info("Checkout order summary total alt price (no price surcharge): " + checkoutPage.getOrderSummaryTotalAltPrice());

        System.out.println("\n");
    }

    //order invoice page data logger method
    protected void logOrderInvoicePageData(OrderInvoicePage orderInvoicePage){
        System.out.println("Order invoice page displayed data: " + "\n");

        logger.info("Order invoice product SKU code(s): " + orderInvoicePage.getOrderInvoiceProductSKU());
        logger.info("Order invoice product(s) details: " + orderInvoicePage.getOrderInvoiceProductDetails());
        logger.info("Order invoice product item price(s): " + orderInvoicePage.getOrderInvoiceProductItemPrice());
        logger.info("Order invoice product quantity(ies): " + orderInvoicePage.getOrderInvoiceProductQty());
        logger.info("Order invoice product total price(s): " + orderInvoicePage.getOrderInvoiceProductTotalPrice());
        //log these elements if they are present
        if (orderInvoicePage.isOrderInvoiceProductsOrderSubtotalPriceDisplayed()) {
            logger.info("Order invoice product order subtotal price: " + orderInvoicePage.getOrderInvoiceProductOrderSubtotalPrice());
        }

        if (orderInvoicePage.isOrderInvoiceProductsOrderShippingPriceDisplayed()) {
            logger.info("Order invoice product order shipping price: " + orderInvoicePage.getOrderInvoiceProductOrderShippingPrice());
        }

        if (orderInvoicePage.isOrderInvoiceProductsOrderPaymentMethodSurchargeDisplayed()) {
            logger.info("Order invoice product order payment method surcharge: " + orderInvoicePage.getOrderInvoiceProductOrderPaymentMethodSurcharge());
        }
        //log the issue if order price isn't displayed
        try {
            if (orderInvoicePage.isOrderInvoiceProductsOrderTotalPriceDisplayed()) {
                logger.info("Order invoice product order total price: " + orderInvoicePage.getOrderInvoiceProductOrderTotalPrice());
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {
            logger.info("Order total price element is not present on the page");
        }

        System.out.println("\n");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //test result screenshot method (comment this method out during browser run since (GitHub) headless run doesn't need screenshots)
    public void captureScreenshot(WebDriver driver, String fileName) {
        try {
            Thread.sleep(1500);//apply wait time for the right time to get the screenshot (WebDriverWait doesn't work here)
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destination = new File("E:\\IntelliJ Selenium projects\\XCartShopSelenium\\src\\test\\resources\\" + " " +  fileName + ".png");
            Files.copy(screenshot.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
            logger.info("Screenshot saved at: " + destination.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
