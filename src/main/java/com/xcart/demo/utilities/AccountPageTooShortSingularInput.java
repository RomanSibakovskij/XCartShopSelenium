package com.xcart.demo.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class AccountPageTooShortSingularInput extends BasePage{

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

    //invalid singular edited user input data - too short singular input
    private String tooShortEditedFirstName;
    private String tooShortEditedLastName;

    public AccountPageTooShortSingularInput(WebDriver driver) {super(driver);}

    //invalid edited user input data getter - too short user edited first name (1 char)
    public void invalidEditedUserDataTooShortFirstNameGetter() {

        tooShortEditedFirstName = "D";
        validEditedLastName = TestDataGenerator.getRandomEditedLastName();
        validEditedEmail = TestDataGenerator.generateRandomEmailAddress(12);

        System.out.println("Generated invalid edited user input data (too short edited first name): " + "\n");

        logger.info("Too short edited user first name: " + tooShortEditedFirstName);
        logger.info("Valid edited user last name (too short edited first name): " + validEditedLastName);
        logger.info("Valid edited user email (too short edited first name): " + validEditedEmail);

        System.out.println("\n");
    }

    //invalid edited user input data getter - too short user edited last name (1 char)
    public void invalidEditedUserDataTooShortLastNameGetter() {

        validEditedFirstName = TestDataGenerator.getRandomEditedFirstName();
        tooShortEditedLastName = "K";
        validEditedEmail = TestDataGenerator.generateRandomEmailAddress(12);

        System.out.println("Generated invalid edited user input data (too short edited last name): " + "\n");

        logger.info("Valid edited user first name (too short edited last name): " + validEditedFirstName);
        logger.info("Too short edited user last name: " + tooShortEditedLastName);
        logger.info("Valid edited user email (too short edited last name): " + validEditedEmail);

        System.out.println("\n");
    }

    //invalid edited user account data input methods - too short singular input
    public void inputTooShortEditedFirstNameIntoFirstNameInputField(){
        accountDetailsPageFirstNameInputField.clear();
        accountDetailsPageFirstNameInputField.sendKeys(tooShortEditedFirstName);
    }
    public void inputTooShortEditedLastNameIntoLastNameInputField(){
        accountDetailsPageLastNameInputField.clear();
        accountDetailsPageLastNameInputField.sendKeys(tooShortEditedLastName);
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
