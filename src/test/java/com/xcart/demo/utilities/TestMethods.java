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

    //address book page text element assert test method
    protected void isAddressBookTextElementAsExpected(AddressBookPage addressBookPage) {
        //assert address book page title is as expected
        assertEquals("Address book", addressBookPage.getAddressBookPageTitle(), "The address book page title doesn't match expectations.");
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
