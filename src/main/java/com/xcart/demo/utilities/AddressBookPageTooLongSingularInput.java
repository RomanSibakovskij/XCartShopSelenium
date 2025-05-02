package com.xcart.demo.utilities;

import com.xcart.demo.RegisterPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class AddressBookPageTooLongSingularInput extends BasePage{

    //new address form elements
    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement newAddressFormFirstNameInputField;
    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement newAddressFormLastNameInputField;
    @FindBy(xpath = "//input[@id='address']")
    private WebElement newAddressFormAddress1InputField;
    @FindBy(xpath = "//input[@id='city']")
    private WebElement newAddressFormCityInputField;
    @FindBy(xpath = "//input[@id='zipcode']")
    private WebElement newAddressFormPostCodeInputField;
    //singular input error box element
    @FindBy(xpath = "//div[@role='dialog'][2]")
    private WebElement addressBookPageSingularInputErrorBox;

    //valid user address input data (for remaining inputs)
    private String validAddressFirstName;
    private String validAddressLastName;
    private String validAddress1;
    private String validAddressCity;
    private int validAddressPostCode;

    //invalid user address input data - too long singular input
    private String tooLongAddressFirstName;
    private String tooLongAddressLastName;

    public AddressBookPageTooLongSingularInput(WebDriver driver) {super(driver);}

    //invalid user new address data getter - too long first name (100 chars)
    public void invalidUserNewAddressDataTooLongFirstNameGetter() {

        RegisterPage registerPage = new RegisterPage(driver);

        tooLongAddressFirstName = "Dsfdgfdgffgvfdsfaghresrfeghtyjtrewaertuyikyujthygrfsdsffghnbvcsdsfdghfggswfregrthgfsadedfhgdsfsedrhf";
        validAddressLastName = registerPage.getValidLastName();
        validAddress1 = TestDataGenerator.generateRandomAddress(8);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid user new address data (too long first name): " + "\n");

        logger.info("Too long user first name: " + tooLongAddressFirstName);
        logger.info("Valid user last name (too long first name): " + validAddressLastName);
        logger.info("Valid user address1 (too long first name): " + validAddress1);
        logger.info("Valid user city (too long first name): " + validAddressCity);
        logger.info("Valid user post code (too long first name): " + validAddressPostCode);

        System.out.println("\n");
    }

    //invalid user new address data getter - too long last name (100 chars)
    public void invalidUserNewAddressDataTooLongLastNameGetter() {

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidFirstName();
        tooLongAddressLastName = "Asfdgfdgffgvfdsfaghresrfeghtyjtrewaertuyikyujthygrfsdsffghnbvcsdsfdghfggswfregrthgfsadedfhgdsfsedrhf";
        validAddress1 = TestDataGenerator.generateRandomAddress(8);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid user new address data (too long last name): " + "\n");

        logger.info("Valid user first name (too long last name): " + validAddressFirstName);
        logger.info("Too long user last name: " + tooLongAddressLastName);
        logger.info("Valid user address1 (too long last name): " + validAddress1);
        logger.info("Valid user city (too long last name): " + validAddressCity);
        logger.info("Valid user post code (too long last name): " + validAddressPostCode);

        System.out.println("\n");
    }

    //invalid new address form data input methods - too long singular input
    public void inputTooLongFirstNameIntoAddressFirstNameInputField(){newAddressFormFirstNameInputField.sendKeys(tooLongAddressFirstName);}
    public void inputTooLongLastNameIntoAddressLastNameInputField(){newAddressFormLastNameInputField.sendKeys(tooLongAddressLastName);}

    //new address form data input methods (for remaining inputs)
    public void inputValidFirstNameIntoAddressFirstNameInputField(){newAddressFormFirstNameInputField.sendKeys(validAddressFirstName);}
    public void inputValidLastNameIntoAddressLastNameInputField(){newAddressFormLastNameInputField.sendKeys(validAddressLastName);}
    public void inputValidAddress1IntoAddress1InputField(){newAddressFormAddress1InputField.sendKeys(validAddress1);}
    public void inputValidCityIntoAddressCityInputField(){newAddressFormCityInputField.sendKeys(validAddressCity);}
    public void inputValidPostCodeIntoAddressPostCodeInputField(){newAddressFormPostCodeInputField.sendKeys(String.valueOf(validAddressPostCode));}

    //singular input error box text getter
    public String getSingularInputErrorBoxMessage() {
        String boxErrorText = addressBookPageSingularInputErrorBox.getText();
        return boxErrorText.replace("Close", "").replace("OK", "").trim();
    }

}
