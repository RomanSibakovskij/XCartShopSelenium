package com.xcart.demo.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class RegisterPageTooShortSingularInput extends BasePage{

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

    //invalid register user singular input data - too short singular input
    private String tooShortFirstName;
    private String tooShortLastName;
    private String tooShortEmail;
    private String tooShortPassword;
    private String tooShortConfirmPassword;

    public RegisterPageTooShortSingularInput(WebDriver driver) {super(driver);}

    //invalid register user input data getter - too short user first name (1 char)
    public void invalidRegisterDataTooShortFirstNameGetter(){

        tooShortFirstName = "K";
        validLastName = TestDataGenerator.getRandomLastName();
        validEmail = TestDataGenerator.generateRandomEmailAddress(5);
        validPassword = TestDataGenerator.generateRandomPassword();
        validConfirmPassword = validPassword;

        System.out.println("Invalid generated user register data (too short first name): " + "\n");

        logger.info("Too short user first name: " + tooShortFirstName);
        logger.info("Valid user last name (too short first name): " + validLastName);
        logger.info("Valid user email (too short first name): " + validEmail);
        logger.info("Valid user password (too short first name): " + validPassword);
        logger.info("Valid matching confirm password (too short first name): " + validConfirmPassword);

        System.out.println("\n");

    }

    //invalid register user input data getter - too short user last name (1 char)
    public void invalidRegisterDataTooShortLastNameGetter(){

        validFirstName = TestDataGenerator.getRandomFirstName();
        tooShortLastName = "G";
        validEmail = TestDataGenerator.generateRandomEmailAddress(5);
        validPassword = TestDataGenerator.generateRandomPassword();
        validConfirmPassword = validPassword;

        System.out.println("Invalid generated user register data (too short last name): " + "\n");

        logger.info("Valid user first name (too short last name): " + validFirstName);
        logger.info("Too short user last name: " + tooShortLastName);
        logger.info("Valid user email (too short last name): " + validEmail);
        logger.info("Valid user password (too short last name): " + validPassword);
        logger.info("Valid matching confirm password (too short last name): " + validConfirmPassword);

        System.out.println("\n");

    }

    //invalid register user input data getter - too short user email (1 char -> name, domain)
    public void invalidRegisterDataTooShortEmailGetter(){

        validFirstName = TestDataGenerator.getRandomFirstName();
        validLastName = TestDataGenerator.getRandomLastName();
        tooShortEmail = TestDataGenerator.generateRandomTooShortEmailAddress(1);
        validPassword = TestDataGenerator.generateRandomPassword();
        validConfirmPassword = validPassword;

        System.out.println("Invalid generated user register data (too short email): " + "\n");

        logger.info("Valid user first name (too short email): " + validFirstName);
        logger.info("Valid user last name (too short email): " + validLastName);
        logger.info("Too short user email: " + tooShortEmail);
        logger.info("Valid user password (too short email): " + validPassword);
        logger.info("Valid matching confirm password (too short email): " + validConfirmPassword);

        System.out.println("\n");

    }

    //invalid register user input data getter - too short user password / confirm password (3 chars)
    public void invalidRegisterDataTooShortPasswordGetter(){

        validFirstName = TestDataGenerator.getRandomFirstName();
        validLastName = TestDataGenerator.getRandomLastName();
        validEmail = TestDataGenerator.generateRandomEmailAddress(8);
        tooShortPassword = "Gf%";
        tooShortConfirmPassword = tooShortPassword;

        System.out.println("Invalid generated user register data (too short password): " + "\n");

        logger.info("Valid user first name (too short password): " + validFirstName);
        logger.info("Valid user last name (too short password): " + validLastName);
        logger.info("Valid user user email (too short password): " + validEmail);
        logger.info("Too short user password (too short password): " + tooShortPassword);
        logger.info("Too short matching confirm password (too short password): " + tooShortConfirmPassword);

        System.out.println("\n");

    }

    //invalid register user data input methods - too short singular input
    public void inputTooShortFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(tooShortFirstName);}
    public void inputTooShortLastNameIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(tooShortLastName);}
    public void inputTooShortEmailIntoEmailInputField(){registerPageEmailInputField.sendKeys(tooShortEmail);}
    public void inputTooShortPasswordIntoPasswordInputField(){registerPagePasswordInputField.sendKeys(tooShortPassword);}
    public void inputTooShortConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(tooShortConfirmPassword);}

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
