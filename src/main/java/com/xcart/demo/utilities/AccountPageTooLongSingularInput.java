package com.xcart.demo.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class AccountPageTooLongSingularInput extends BasePage{

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

    //invalid singular edited user input data - too long singular input
    private String tooLongEditedFirstName;

    public AccountPageTooLongSingularInput(WebDriver driver) {super(driver);}

    //invalid edited user input data getter - too long user edited first name (100 chars)
    public void invalidEditedUserDataTooLongFirstNameGetter() {

        tooLongEditedFirstName = "Rsfdgfdgffgvfdsfaghresrfeghtyjtrewaertuyikyujthygrfsdsffghnbvcsdsfdghfggswfregrthgfsadedfhgdsfsedrhf";
        validEditedLastName = TestDataGenerator.getRandomEditedLastName();
        validEditedEmail = TestDataGenerator.generateRandomEmailAddress(12);

        System.out.println("Generated invalid edited user input data (too long edited first name): " + "\n");

        logger.info("Too long edited user first name: " + tooLongEditedFirstName);
        logger.info("Valid edited user last name (too long edited first name): " + validEditedLastName);
        logger.info("Valid edited user email (too long edited first name): " + validEditedEmail);

        System.out.println("\n");
    }

    //invalid edited user account data input methods - too short singular input
    public void inputTooLongEditedFirstNameIntoFirstNameInputField(){
        accountDetailsPageFirstNameInputField.clear();
        accountDetailsPageFirstNameInputField.sendKeys(tooLongEditedFirstName);
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
