package com.xcart.demo.utilities;

import com.xcart.demo.RegisterPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class SignInPageInvalidInputScenarios extends BasePage{

    //sign-in form elements
    @FindBy(xpath = "//form[@name='authform']//input[@id='username']")
    private WebElement signInFormPageEmailInputField;
    @FindBy(xpath = "//form[@name='authform']//input[@id='password']")
    private WebElement signInFormPagePasswordInputField;

    //valid sign in user input data (for remaining inputs)
    private String validLoginEmail;
    private String validLoginPassword;

    //invalid sign in user input data - no singular input
    private String noLoginEmail;
    private String noLoginPassword;

    public SignInPageInvalidInputScenarios(WebDriver driver) {super(driver);}

    //invalid sign in user data getter - no user email
    public void invalidSignInDataNoEmailGetter(RegisterPage registerPage) {

        noLoginEmail = "";
        validLoginPassword = registerPage.getValidPassword();

        System.out.println("Generated invalid user login data (no login email): " + "\n");

        logger.info("No login email: " + noLoginEmail);
        logger.info("Valid user login password (no login email): " + validLoginPassword);

        System.out.println("\n");
    }

    //invalid sign in user data getter - no user password
    public void invalidSignInDataNoPasswordGetter(RegisterPage registerPage) {

        validLoginEmail = registerPage.getValidEmail();
        noLoginPassword = "";

        System.out.println("Generated invalid user login data (no login password): " + "\n");

        logger.info("Valid user login email (no login password): " + validLoginEmail);
        logger.info("No login password: " + noLoginPassword);

        System.out.println("\n");
    }

    //invalid user login input data methods - no singular input
    public void inputNoLoginEmailIntoEmailInputField(){
        signInFormPageEmailInputField.clear();
        signInFormPageEmailInputField.sendKeys(noLoginEmail);
    }
    public void inputNoLoginPasswordIntoPasswordInputField(){
        signInFormPagePasswordInputField.clear();
        signInFormPagePasswordInputField.sendKeys(noLoginPassword);
    }

    //valid user login input data methods (for remaining inputs)
    public void inputValidLoginEmailIntoEmailInputField(){
        signInFormPageEmailInputField.clear();
        signInFormPageEmailInputField.sendKeys(validLoginEmail);
    }
    public void inputValidLoginPasswordIntoPasswordInputField(){
        signInFormPagePasswordInputField.clear();
        signInFormPagePasswordInputField.sendKeys(validLoginPassword);
    }


}
