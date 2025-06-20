package com.xcart.demo.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class RegisterPageTooLongSingularInput extends BasePage{

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

    //invalid register user singular input data - too long singular input
    private String tooLongFirstName;
    private String tooLongLastName;
    private String tooLongEmail;
    private String tooLongPassword;
    private String tooLongConfirmPassword;

    public RegisterPageTooLongSingularInput(WebDriver driver) {super(driver);}

    //invalid register user input data getter - too long user first name (100 chars)
    public void invalidRegisterDataTooLongFirstNameGetter(){

        tooLongFirstName = "Dfgrfdsdsfdsdsdvfdgfgjhjkhjkyurtrgddsdsfsfdsdadsafsddfdsfgfdgrffdfghfgjhkluiopujhcvdxczcdsfgfdhfghjg";
        validLastName = TestDataGenerator.getRandomLastName();
        validEmail = TestDataGenerator.generateRandomEmailAddress(5);
        validPassword = TestDataGenerator.generateRandomPassword();
        validConfirmPassword = validPassword;

        System.out.println("Invalid generated user register data (too long first name): " + "\n");

        logger.info("Too long user first name: " + tooLongFirstName);
        logger.info("Valid user last name (too long first name): " + validLastName);
        logger.info("Valid user email (too long first name): " + validEmail);
        logger.info("Valid user password (too long first name): " + validPassword);
        logger.info("Valid matching confirm password (too long first name): " + validConfirmPassword);

        System.out.println("\n");

    }

    //invalid register user input data getter - too long user last name (100 chars)
    public void invalidRegisterDataTooLongLastNameGetter(){

        validFirstName = TestDataGenerator.getRandomFirstName();
        tooLongLastName = "Dfgrfdsdsfdsdsdvfdgfgjhjkhjkyurtrgddsdsfsfdsdadsafsddfdsfgfdgrffdfghfgjhkluiopujhcvdxczcdsfgfdhfghjg";
        validEmail = TestDataGenerator.generateRandomEmailAddress(5);
        validPassword = TestDataGenerator.generateRandomPassword();
        validConfirmPassword = validPassword;

        System.out.println("Invalid generated user register data (too long last name): " + "\n");

        logger.info("Valid user first name (too long last name): " + validFirstName);
        logger.info("Too long user last name: " + tooLongLastName);
        logger.info("Valid user email (too long last name): " + validEmail);
        logger.info("Valid user password (too long last name): " + validPassword);
        logger.info("Valid matching confirm password (too long last name): " + validConfirmPassword);

        System.out.println("\n");

    }

    //invalid register user input data getter - too long user email (100 chars -> name, domain)
    public void invalidRegisterDataTooLongEmailGetter(){

        validFirstName = TestDataGenerator.getRandomFirstName();
        validLastName = TestDataGenerator.getRandomLastName();
        tooLongEmail = TestDataGenerator.generateRandomTooLongEmailAddress(90);
        validPassword = TestDataGenerator.generateRandomPassword();
        validConfirmPassword = validPassword;

        System.out.println("Invalid generated user register data (too long email): " + "\n");

        logger.info("Valid user first name (too long email): " + validFirstName);
        logger.info("Valid user last name (too long email): " + validLastName);
        logger.info("Too long user email: " + tooLongEmail);
        logger.info("Valid user password (too long email): " + validPassword);
        logger.info("Valid matching confirm password (too long email): " + validConfirmPassword);

        System.out.println("\n");

    }

    //invalid register user input data getter - too long user password and confirm password (50 chars)
    public void invalidRegisterDataTooLongPasswordConfirmGetter(){

        validFirstName = TestDataGenerator.getRandomFirstName();
        validLastName = TestDataGenerator.getRandomLastName();
        validEmail = TestDataGenerator.generateRandomEmailAddress(7);
        tooLongPassword = "FfghfdfdvfcdESRFEGRDFGDS3$%^%&^%&dgbfdgdfdscvcxgSD";
        tooLongConfirmPassword = tooLongPassword;

        System.out.println("Invalid generated user register data (too long password and confirm password): " + "\n");

        logger.info("Valid user first name (too long password and confirm password): " + validFirstName);
        logger.info("Valid user last name (too long password and confirm password): " + validLastName);
        logger.info("Valid user email (too long password and confirm password): " + validEmail);
        logger.info("Too long user password: " + tooLongPassword);
        logger.info("Too long matching confirm password: " + tooLongConfirmPassword);

        System.out.println("\n");

    }

    //invalid register user data input methods - too long singular input
    public void inputTooLongFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(tooLongFirstName);}
    public void inputTooLongLastNameIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(tooLongLastName);}
    public void inputTooLongEmailIntoEmailInputField(){registerPageEmailInputField.sendKeys(tooLongEmail);}
    public void inputTooLongPasswordIntoPasswordInputField(){registerPagePasswordInputField.sendKeys(tooLongPassword);}
    public void inputTooLongConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(tooLongConfirmPassword);}

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
