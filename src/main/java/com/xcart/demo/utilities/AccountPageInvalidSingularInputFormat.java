package com.xcart.demo.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class AccountPageInvalidSingularInputFormat extends BasePage{

    //personal information section
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[2]//input")
    private WebElement accountDetailsPageFirstNameInputField;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[3]//input")
    private WebElement accountDetailsPageLastNameInputField;
    //account information section
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[8]//input")
    private WebElement accountDetailsPageEmailInputField;
    //singular input error box element
    @FindBy(xpath = "//div[@role='dialog']")
    private WebElement accountEditPageSingularInputErrorBox;

    //valid edited user data (for remaining inputs)
    private String validEditedFirstName;
    private String validEditedLastName;
    private String validEditedEmail;

    //invalid singular edited user input data - invalid singular input format
    private String invalidEditedFirstNameFormat;
    private String invalidEditedLastNameFormat;
    private String invalidEditedEmailFormat;
    private String existingTestEmail;

    public AccountPageInvalidSingularInputFormat(WebDriver driver) {super(driver);}

    //invalid edited user input data getter - invalid user edited first name format (special symbols only)
    public void invalidEditedUserDataInvalidFirstNameFormatGetter() {

        invalidEditedFirstNameFormat = "!#@$%#$#^$%^$%";
        validEditedLastName = TestDataGenerator.getValidLastName();
        validEditedEmail = TestDataGenerator.generateRandomEmailAddress(12);

        System.out.println("Generated invalid edited user input data (invalid edited first name format): " + "\n");

        logger.info("Invalid edited user first name format: " + invalidEditedFirstNameFormat);
        logger.info("Valid edited user last name (invalid edited first name format): " + validEditedLastName);
        logger.info("Valid edited user email (invalid edited first name format): " + validEditedEmail);

        System.out.println("\n");
    }

    //invalid edited user input data getter - invalid user edited last name format (special symbols only)
    public void invalidEditedUserDataInvalidLastNameFormatGetter() {

        validEditedFirstName = TestDataGenerator.getValidFirstName();
        invalidEditedLastNameFormat = "#$%$%#^@#$!";
        validEditedEmail = TestDataGenerator.generateRandomEmailAddress(12);

        System.out.println("Generated invalid edited user input data (invalid edited last name format): " + "\n");

        logger.info("Valid edited user first name (invalid edited last name format): " + validEditedFirstName);
        logger.info("Invalid edited user last name format: " + invalidEditedLastNameFormat);
        logger.info("Valid edited user email (invalid edited last name format): " + validEditedEmail);

        System.out.println("\n");
    }

    //invalid edited user input data getter - invalid user edited email format (missing '@')
    public void invalidEditedUserDataInvalidEmailFormatGetter() {

        validEditedFirstName = TestDataGenerator.getValidFirstName();
        validEditedLastName = TestDataGenerator.getValidLastName();
        invalidEditedEmailFormat = "fgrrdffakemail.com";

        System.out.println("Generated invalid edited user input data (invalid edited email address format): " + "\n");

        logger.info("Valid edited user first name (invalid edited email address format): " + validEditedFirstName);
        logger.info("Valid edited user last name (invalid edited email address format): " + validEditedLastName);
        logger.info("Invalid edited user email format: " + invalidEditedEmailFormat);

        System.out.println("\n");
    }

    //invalid edited user input data getter - existing test email
    public void invalidEditedUserDataExistingEmailGetter() {

        validEditedFirstName = TestDataGenerator.getValidFirstName();
        validEditedLastName = TestDataGenerator.getValidLastName();
        existingTestEmail = "demo-customer@x-cart.com";

        System.out.println("Generated invalid edited user input data (existing test email address): " + "\n");

        logger.info("Valid edited user first name (existing test email address): " + validEditedFirstName);
        logger.info("Valid edited user last name (existing test email address): " + validEditedLastName);
        logger.info("Existing test email address: " + existingTestEmail);

        System.out.println("\n");
    }

    //invalid edited user account data input methods - invalid singular input format
    public void inputInvalidEditedFirstNameFormatIntoFirstNameInputField(){
        accountDetailsPageFirstNameInputField.clear();
        accountDetailsPageFirstNameInputField.sendKeys(invalidEditedFirstNameFormat);
    }
    public void inputInvalidEditedLastNameFormatIntoLastNameInputField(){
        accountDetailsPageLastNameInputField.clear();
        accountDetailsPageLastNameInputField.sendKeys(invalidEditedLastNameFormat);
    }
    public void inputInvalidEditedEmailFormatIntoEmailInputField(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accountDetailsPageEmailInputField);
        accountDetailsPageEmailInputField.clear();
        accountDetailsPageEmailInputField.sendKeys(invalidEditedEmailFormat);
    }

    //existing test email address input method
    public void inputExistingTestEmailIntoEmailInputField(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accountDetailsPageEmailInputField);
        accountDetailsPageEmailInputField.clear();
        accountDetailsPageEmailInputField.sendKeys(existingTestEmail);
    }

    //valid edited user account data input methods (for remaining inputs)
    public void inputValidEditedFirstNameIntoFirstNameInputField(){
        accountDetailsPageFirstNameInputField.clear();
        accountDetailsPageFirstNameInputField.sendKeys(validEditedFirstName);
    }
    public void inputValidEditedLastNameIntoLastNameInputField(){
        accountDetailsPageLastNameInputField.clear();
        accountDetailsPageLastNameInputField.sendKeys(validEditedLastName);
    }
    public void inputValidEditedEmailIntoEmailInputField(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accountDetailsPageEmailInputField);
        accountDetailsPageEmailInputField.clear();
        accountDetailsPageEmailInputField.sendKeys(validEditedEmail);
    }

    //singular input error box text getter
    public String getSingularInputErrorBoxMessage() {
        String boxErrorText = accountEditPageSingularInputErrorBox.getText();
        return boxErrorText.replace("Close", "").replace("OK", "").trim();
    }

}
