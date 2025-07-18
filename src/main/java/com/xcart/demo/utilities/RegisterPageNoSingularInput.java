package com.xcart.demo.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class RegisterPageNoSingularInput extends BasePage{

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
    private WebElement registerPageSingularInputErrorBox;

    //valid register user data input (for remaining input)
    private String validFirstName;
    private String validLastName;
    private String validEmail;
    private String validPassword;
    private String validConfirmPassword;

    //invalid register user singular input data - no singular input
    private String noUserFirstName;
    private String noUserLastName;
    private String noUserEmail;
    private String noUserPassword;
    private String noUserConfirmPassword;

    public RegisterPageNoSingularInput(WebDriver driver) {super(driver);}

    //invalid register user input data getter - no user first name
    public void invalidRegisterDataNoFirstNameGetter(){

        noUserFirstName = "";
        validLastName = TestDataGenerator.getRandomLastName();
        validEmail = TestDataGenerator.generateRandomEmailAddress(5);
        validPassword = TestDataGenerator.generateRandomPassword();
        validConfirmPassword = validPassword;

        System.out.println("Invalid generated user register data (no first name): " + "\n");

        logger.info("No user first name: " + noUserFirstName);
        logger.info("Valid user last name (no first name): " + validLastName);
        logger.info("Valid user email (no first name): " + validEmail);
        logger.info("Valid user password (no first name): " + validPassword);
        logger.info("Valid matching confirm password (no first name): " + validConfirmPassword);

        System.out.println("\n");

    }

    //invalid register user input data getter - no user last name
    public void invalidRegisterDataNoLastNameGetter(){

        validFirstName = TestDataGenerator.getRandomFirstName();
        noUserLastName = "";
        validEmail = TestDataGenerator.generateRandomEmailAddress(5);
        validPassword = TestDataGenerator.generateRandomPassword();
        validConfirmPassword = validPassword;

        System.out.println("Invalid generated user register data (no last name): " + "\n");

        logger.info("Valid user first name (no last name): " + validFirstName);
        logger.info("No user last name: " + noUserLastName);
        logger.info("Valid user email (no last name): " + validEmail);
        logger.info("Valid user password (no last name): " + validPassword);
        logger.info("Valid matching confirm password (no last name): " + validConfirmPassword);

        System.out.println("\n");

    }

    //invalid register user input data getter - no user email
    public void invalidRegisterDataNoEmailGetter(){

        validFirstName = TestDataGenerator.getRandomFirstName();
        validLastName = TestDataGenerator.getRandomLastName();
        noUserEmail = "";
        validPassword = TestDataGenerator.generateRandomPassword();
        validConfirmPassword = validPassword;

        System.out.println("Invalid generated user register data (no email): " + "\n");

        logger.info("Valid user first name (no email): " + validFirstName);
        logger.info("Valid user last name (no email): " + validLastName);
        logger.info("No user email: " + noUserEmail);
        logger.info("Valid user password (no email): " + validPassword);
        logger.info("Valid matching confirm password (no email): " + validConfirmPassword);

        System.out.println("\n");

    }

    //invalid register user input data getter - no user password / confirm password
    public void invalidRegisterDataNoPasswordConfirmGetter(){

        validFirstName = TestDataGenerator.getRandomFirstName();
        validLastName = TestDataGenerator.getRandomLastName();
        validEmail = TestDataGenerator.generateRandomEmailAddress(5);
        noUserPassword = "";
        noUserConfirmPassword = noUserPassword;


        System.out.println("Invalid generated user register data (no password / confirm password): " + "\n");

        logger.info("Valid user first name (no password / confirm password): " + validFirstName);
        logger.info("Valid user last name (no password / confirm password): " + validLastName);
        logger.info("Valid user email (no password / confirm password): " + validEmail);
        logger.info("No user password: " + noUserPassword);
        logger.info("No matching confirm password: " + noUserConfirmPassword);

        System.out.println("\n");

    }

    //invalid register user data input methods - no singular input
    public void inputNoFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(noUserFirstName);}
    public void inputNoLastNameIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(noUserLastName);}
    public void inputNoEmailIntoEmailInputField(){registerPageEmailInputField.sendKeys(noUserEmail);}
    public void inputNoPasswordIntoPasswordInputField(){registerPagePasswordInputField.sendKeys(noUserPassword);}
    public void inputNoConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(noUserConfirmPassword);}

    //valid register user data input methods (for remaining valid inputs)
    public void inputValidFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(validFirstName);}
    public void inputValidLastNameIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(validLastName);}
    public void inputValidEmailIntoEmailInputField(){registerPageEmailInputField.sendKeys(validEmail);}
    public void inputValidPasswordIntoPasswordInputField(){registerPagePasswordInputField.sendKeys(validPassword);}
    public void inputValidConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(validConfirmPassword);}

    //singular input error box text getter
    public String getSingularInputErrorBoxMessage() {
        String boxErrorText = registerPageSingularInputErrorBox.getText();
        return boxErrorText.replace("Close", "").replace("OK", "").trim();
    }

}
