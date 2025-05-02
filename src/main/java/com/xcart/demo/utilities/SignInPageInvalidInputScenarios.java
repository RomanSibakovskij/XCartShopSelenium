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

    public SignInPageInvalidInputScenarios(WebDriver driver) {super(driver);}

    

}
