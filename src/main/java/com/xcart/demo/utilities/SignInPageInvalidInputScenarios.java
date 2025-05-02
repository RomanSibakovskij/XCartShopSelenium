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

    //invalid sign in user input data - invalid singular input
    private String invalidLoginEmail;
    private String invalidLoginPassword;

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

    //invalid sign in user data getter - invalid user email
    public void invalidSignInDataInvalidEmailGetter(RegisterPage registerPage) {

        invalidLoginEmail = "fgdree@fakemail.com";
        validLoginPassword = registerPage.getValidPassword();

        System.out.println("Generated invalid user login data (invalid login email): " + "\n");

        logger.info("Invalid login email: " + invalidLoginEmail);
        logger.info("Valid user login password (invalid login email): " + validLoginPassword);

        System.out.println("\n");
    }

    //invalid sign in user data getter - invalid user password
    public void invalidSignInDataInvalidPasswordGetter(RegisterPage registerPage) {

        validLoginEmail = registerPage.getValidEmail();
        invalidLoginPassword = "Fdfgfg@#$@$%^%12321";

        System.out.println("Generated invalid user login data (invalid login password): " + "\n");

        logger.info("Valid user login email (invalid login password): " + validLoginEmail);
        logger.info("Invalid login password: " + invalidLoginPassword);

        System.out.println("\n");
    }

    //invalid user login input data methods - invalid singular input
    public void inputInvalidLoginEmailIntoEmailInputField(){
        signInFormPageEmailInputField.clear();
        signInFormPageEmailInputField.sendKeys(invalidLoginEmail);
    }
    public void inputInvalidLoginPasswordIntoPasswordInputField(){
        signInFormPagePasswordInputField.clear();
        signInFormPagePasswordInputField.sendKeys(invalidLoginPassword);
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
