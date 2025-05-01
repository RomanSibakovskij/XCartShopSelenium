package com.xcart.demo.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class AccountPageNoSingularInput extends BasePage{

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

    //invalid singular edited user input data - no singular input
    private String noEditedFirstName;
    private String noEditedLastName;
    private String noEditedEmail;

    public AccountPageNoSingularInput(WebDriver driver) {super(driver);}

    //invalid edited user input data getter - no user edited first name
    public void invalidEditedUserDataNoFirstNameGetter() {

        noEditedFirstName = "";
        validEditedLastName = TestDataGenerator.getRandomEditedLastName();
        validEditedEmail = TestDataGenerator.generateRandomEmailAddress(12);

        System.out.println("Generated invalid edited user input data (no edited first name): " + "\n");

        logger.info("No edited user first name: " + noEditedFirstName);
        logger.info("Valid edited user last name (no edited first name): " + validEditedLastName);
        logger.info("Valid edited user email (no edited first name): " + validEditedEmail);

        System.out.println("\n");
    }

    //invalid edited user input data getter - no user edited last name
    public void invalidEditedUserDataNoLastNameGetter() {

        validEditedFirstName = TestDataGenerator.getRandomEditedFirstName();
        noEditedLastName = "";
        validEditedEmail = TestDataGenerator.generateRandomEmailAddress(12);

        System.out.println("Generated invalid edited user input data (no edited last name): " + "\n");

        logger.info("Valid edited user first name (no edited last name): " + validEditedFirstName);
        logger.info("No edited user last name: " + noEditedLastName);
        logger.info("Valid edited user email (no edited last name): " + validEditedEmail);

        System.out.println("\n");
    }

    //invalid edited user input data getter - no user edited email
    public void invalidEditedUserDataNoEmailGetter() {

        validEditedFirstName = TestDataGenerator.getRandomEditedFirstName();
        validEditedLastName = TestDataGenerator.getRandomEditedLastName();
        noEditedEmail = "";

        System.out.println("Generated invalid edited user input data (no edited email address): " + "\n");

        logger.info("Valid edited user first name (no edited email address): " + validEditedFirstName);
        logger.info("Valid edited user last name (no edited email address): " + validEditedLastName);
        logger.info("No edited user email: " + noEditedEmail);

        System.out.println("\n");
    }

    //invalid edited user account data input methods - no singular input
    public void inputNoEditedFirstNameIntoFirstNameInputField(){
        accountDetailsPageFirstNameInputField.clear();
        accountDetailsPageFirstNameInputField.sendKeys(noEditedFirstName);
    }
    public void inputNoEditedLastNameIntoLastNameInputField(){
        accountDetailsPageLastNameInputField.clear();
        accountDetailsPageLastNameInputField.sendKeys(noEditedLastName);
    }
    public void inputNoEditedEmailIntoEmailInputField(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accountDetailsPageEmailInputField);
        accountDetailsPageEmailInputField.clear();
        accountDetailsPageEmailInputField.sendKeys(noEditedEmail);
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
