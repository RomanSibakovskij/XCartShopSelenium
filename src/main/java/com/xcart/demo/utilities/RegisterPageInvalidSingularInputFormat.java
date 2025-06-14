package com.xcart.demo.utilities;

import com.xcart.demo.RegisterPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class RegisterPageInvalidSingularInputFormat extends BasePage{

    //personal information section
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[2]//input")
    private WebElement registerPageFirstNameInputField;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[3]//input")
    private WebElement registerPageLastNameInputField;
    //account information
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[8]//input")
    private WebElement registerPageEmailInputField;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[10]//input[@id='passwd1']")
    private WebElement registerPagePasswordInputField;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[11]//input[@id='passwd2']")
    private WebElement registerPageConfirmPasswordInputField;
    //singular input error box element
    @FindBy(xpath = "//div[@role='dialog']")
    private WebElement registerPagerSingularInputErrorBox;

    //valid register user data input (for remaining input)
    private String validFirstName;
    private String validLastName;
    private String validEmail;
    private String validPassword;
    private String validConfirmPassword;

    //invalid register user singular input data - invalid singular input format
    private String invalidFirstNameFormat;
    private String invalidLastNameFormat;
    private String invalidEmailFormat;

    public RegisterPageInvalidSingularInputFormat(WebDriver driver) {super(driver);}

    //invalid register user input data getter - invalid user first name format (special symbols only)
    public void invalidRegisterDataInvalidFirstNameFormatGetter(){

        invalidFirstNameFormat = "!@$@#$%$#^$%^";
        validLastName = TestDataGenerator.getRandomLastName();
        validEmail = TestDataGenerator.generateRandomEmailAddress(5);
        validPassword = TestDataGenerator.generateRandomPassword();
        validConfirmPassword = validPassword;

        System.out.println("Invalid generated user register data (invalid first name format): " + "\n");

        logger.info("Invalid first name input format: " + invalidFirstNameFormat);
        logger.info("Valid user last name (invalid first name format): " + validLastName);
        logger.info("Valid user email (invalid first name format): " + validEmail);
        logger.info("Valid user password (invalid first name format): " + validPassword);
        logger.info("Valid matching confirm password (invalid first name format): " + validConfirmPassword);

        System.out.println("\n");

    }

    //invalid register user input data getter - invalid user last name format (special symbols only)
    public void invalidRegisterDataInvalidLastNameFormatGetter(){

        validFirstName = TestDataGenerator.getRandomLastName();
        invalidLastNameFormat = "*&*&^%%$";
        validEmail = TestDataGenerator.generateRandomEmailAddress(5);
        validPassword = TestDataGenerator.generateRandomPassword();
        validConfirmPassword = validPassword;

        System.out.println("Invalid generated user register data (invalid last name format): " + "\n");

        logger.info("Valid user first name (invalid last name format): " + validFirstName);
        logger.info("Invalid last name input format: " + invalidLastNameFormat);
        logger.info("Valid user email (invalid last name format): " + validEmail);
        logger.info("Valid user password (invalid last name format): " + validPassword);
        logger.info("Valid matching confirm password (invalid last name format): " + validConfirmPassword);

        System.out.println("\n");

    }

    //invalid register user input data getter - invalid user email format (missing '@')
    public void invalidRegisterDataInvalidEmailFormatGetter(){

        validFirstName = TestDataGenerator.getRandomLastName();
        validLastName = TestDataGenerator.getRandomLastName();
        invalidEmailFormat = "Ghtfdsfakemail.com";
        validPassword = TestDataGenerator.generateRandomPassword();
        validConfirmPassword = validPassword;

        System.out.println("Invalid generated user register data (invalid email address format): " + "\n");

        logger.info("Valid user first name (invalid email address format): " + validFirstName);
        logger.info("Valid user last name (invalid email address format): " + validLastName);
        logger.info("Invalid email address input format: " + invalidEmailFormat);
        logger.info("Valid user password (invalid email address format): " + validPassword);
        logger.info("Valid matching confirm password (invalid email address format): " + validConfirmPassword);

        System.out.println("\n");

    }

    //invalid register user data input methods - invalid singular input format
    public void inputInvalidFirstNameFormatIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(invalidFirstNameFormat);}
    public void inputInvalidLastNameFormatIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(invalidLastNameFormat);}
    public void inputInvalidEmailIntoFormatEmailInputField(){registerPageEmailInputField.sendKeys(invalidEmailFormat);}

    //valid register user data input methods (for remaining valid inputs)
    public void inputValidFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(validFirstName);}
    public void inputValidLastNameIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(validLastName);}
    public void inputValidEmailIntoEmailInputField(){registerPageEmailInputField.sendKeys(validEmail);}
    public void inputValidPasswordIntoPasswordInputField(){registerPagePasswordInputField.sendKeys(validPassword);}
    public void inputValidConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(validConfirmPassword);}

    //singular input error box text getter
    public String getSingularInputErrorBoxMessage() {
        String boxErrorText = registerPagerSingularInputErrorBox.getText();
        return boxErrorText.replace("Close", "").replace("OK", "").trim();
    }

}
