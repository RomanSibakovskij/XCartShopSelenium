package com.xcart.demo;

import com.xcart.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;

public class SignInFormPage extends BasePage{

    //sign in form page web elements
    @FindBy(xpath = "//div[@class='ui-dialog-titlebar ui-corner-all ui-widget-header ui-helper-clearfix']/span")
    private WebElement signInFormPageTitle;
    @FindBy(xpath = "//div[@class='ui-dialog-titlebar ui-corner-all ui-widget-header ui-helper-clearfix']/button")
    private WebElement signInFormPageCloseButton;
    @FindBy(xpath = "//form[@name='authform']//label[@for='username']")
    private WebElement signInFormPageEmailSubtext;
    @FindBy(xpath = "//form[@name='authform']//input[@id='username']")
    private WebElement signInFormPageEmailInputField;
    @FindBy(xpath = "//form[@name='authform']//label[@for='password']")
    private WebElement signInFormPagePasswordSubtext;
    @FindBy(xpath = "//form[@name='authform']//input[@id='password']")
    private WebElement signInFormPagePasswordInputField;
    @FindBy(xpath = "//form[@name='authform']//a")
    private WebElement signInFormPageForgotPasswordLink;
    @FindBy(xpath = "//form[@name='authform']//button")
    private WebElement signInFormPageSubmitButton;
    //singular input error box element
    @FindBy(xpath = "//div[@role='dialog'][2]")
    private WebElement signInFormPageSingularInputErrorBox;

    //valid sign in user input data
    private String validLoginEmail;
    private String validLoginPassword;

    //valid edited sign in user input data
    private String validEditedLoginEmail;

    public SignInFormPage(WebDriver driver) {super(driver);}

    //valid sign in user data getter
    public void validSignInDataGetter(RegisterPage registerPage) {

        validLoginEmail = registerPage.getValidEmail();
        validLoginPassword = registerPage.getValidPassword();

        System.out.println("Generated valid user login data: " + "\n");

        logger.info("Valid user login email: " + validLoginEmail);
        logger.info("Valid user login password: " + validLoginPassword);

        System.out.println("\n");
    }

    //valid user login input data methods
    public void inputValidLoginEmailIntoEmailInputField(){
        signInFormPageEmailInputField.clear();
        signInFormPageEmailInputField.sendKeys(validLoginEmail);
    }
    public void inputValidLoginPasswordIntoPasswordInputField(){
        signInFormPagePasswordInputField.clear();
        signInFormPagePasswordInputField.sendKeys(validLoginPassword);
    }

    //valid sign in user data (with edited email) getter
    public void validEditedEmailSignInDataGetter(RegisterPage registerPage) {

        AccountDetailsPage accountDetailsPage = new AccountDetailsPage(driver);

        validEditedLoginEmail = accountDetailsPage.getValidEditedEmail();
        validLoginPassword = registerPage.getValidPassword();

        System.out.println("Generated valid user login data (with edited email): " + "\n");

        logger.info("Valid edited user login email: " + validEditedLoginEmail);
        logger.info("Valid user login password (with edited email): " + validLoginPassword);

        System.out.println("\n");
    }

    //valid edited user login input data method
    public void inputValidEditedLoginEmailIntoEmailInputField(){
        signInFormPageEmailInputField.clear();
        signInFormPageEmailInputField.sendKeys(validEditedLoginEmail);
    }

    //click 'Submit' button method
    public void clickSubmitLoginButton(){
        Actions action = new Actions(driver);
        action.moveToElement(signInFormPageSubmitButton).click().perform();
    }

    //sign in form page text element getters
    public String getSignInFormPageTitle() {return signInFormPageTitle.getText();}
    public String getSignInFormPageEmailSubtext() {return signInFormPageEmailSubtext.getText();}
    public String getSignInFormPagePasswordSubtext() {return signInFormPagePasswordSubtext.getText();}

    //singular input error box text getter
    public String getSingularInputErrorBoxMessage() {
        String boxErrorText = signInFormPageSingularInputErrorBox.getText();
        return boxErrorText.replace("Close", "").replace("OK", "").trim();
    }

    //sign in form page web element assert methods
    public boolean isSignInFormPageTitleDisplayed() {return signInFormPageTitle.isDisplayed();}
    public boolean isSignInFormPageCloseButtonDisplayed() {return signInFormPageCloseButton.isDisplayed();}
    public boolean isSignInFormPageEmailSubtextDisplayed() {return signInFormPageEmailSubtext.isDisplayed();}
    public boolean isSignInFormPageEmailInputFieldDisplayed() {return signInFormPageEmailInputField.isDisplayed();}
    public boolean isSignInFormPagePasswordSubtextDisplayed() {return signInFormPagePasswordSubtext.isDisplayed();}
    public boolean isSignInFormPagePasswordInputFieldDisplayed() {return signInFormPagePasswordInputField.isDisplayed();}
    public boolean isSignInFormPageForgotPasswordLinkDisplayed() {return signInFormPageForgotPasswordLink.isDisplayed();}
    public boolean isSignInFormPageSubmitButtonDisplayed() {return signInFormPageSubmitButton.isDisplayed();}

}
