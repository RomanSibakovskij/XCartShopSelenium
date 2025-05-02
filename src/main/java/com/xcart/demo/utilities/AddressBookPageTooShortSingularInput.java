package com.xcart.demo.utilities;

import com.xcart.demo.RegisterPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class AddressBookPageTooShortSingularInput extends BasePage{

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

    //invalid user address input data - too short singular input
    private String tooShortAddressFirstName;
    private String tooShortAddressLastName;
    private String tooShortAddress1;
    private String tooShortAddressCity;

    public AddressBookPageTooShortSingularInput(WebDriver driver) {super(driver);}

    //invalid user new address data getter - too short first name (1 char)
    public void invalidUserNewAddressDataTooShortFirstNameGetter() {

        RegisterPage registerPage = new RegisterPage(driver);

        tooShortAddressFirstName = "D";
        validAddressLastName = registerPage.getValidLastName();
        validAddress1 = TestDataGenerator.generateRandomAddress(8);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid user new address data (too short first name): " + "\n");

        logger.info("Too short user first name: " + tooShortAddressFirstName);
        logger.info("Valid user last name (too short first name): " + validAddressLastName);
        logger.info("Valid user address1 (too short first name): " + validAddress1);
        logger.info("Valid user city (too short first name): " + validAddressCity);
        logger.info("Valid user post code (too short first name): " + validAddressPostCode);

        System.out.println("\n");
    }

    //invalid user new address data getter - too short last name (1 char)
    public void invalidUserNewAddressDataTooShortLastNameGetter() {

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidFirstName();
        tooShortAddressLastName = "A";
        validAddress1 = TestDataGenerator.generateRandomAddress(8);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid user new address data (too short last name): " + "\n");

        logger.info("Valid user first name (too short last name): " + validAddressFirstName);
        logger.info("Too short user last name: " + tooShortAddressLastName);
        logger.info("Valid user address1 (too short last name): " + validAddress1);
        logger.info("Valid user city (too short last name): " + validAddressCity);
        logger.info("Valid user post code (too short last name): " + validAddressPostCode);

        System.out.println("\n");
    }

    //invalid user new address data getter - too short address (4 chars)
    public void invalidUserNewAddressDataTooShortAddressGetter() {

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidFirstName();
        validAddressLastName = registerPage.getValidLastName();
        tooShortAddress1 = "3 St";
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid user new address data (too short address): " + "\n");

        logger.info("Valid user first name (too short address): " + validAddressFirstName);
        logger.info("Valid user last name (too short address): " + validAddressLastName);
        logger.info("Too short user address1: " + tooShortAddress1);
        logger.info("Valid user city (too short address): " + validAddressCity);
        logger.info("Valid user post code (too short address): " + validAddressPostCode);

        System.out.println("\n");
    }

    //invalid user new address data getter - too short city (2 chars)
    public void invalidUserNewAddressDataTooShortCityGetter() {

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidFirstName();
        validAddressLastName = registerPage.getValidLastName();
        validAddress1 = TestDataGenerator.generateRandomAddress(8);
        tooShortAddressCity = "D5";
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid user new address data (too short city): " + "\n");

        logger.info("Valid user first name (too short city): " + validAddressFirstName);
        logger.info("Valid user last name (too short city): " + validAddressLastName);
        logger.info("Valid user address1 (too short city): " + validAddress1);
        logger.info("Too short user city: " + tooShortAddressCity);
        logger.info("Valid user post code (too short city): " + validAddressPostCode);

        System.out.println("\n");
    }

    //invalid new address form data input methods - too short singular input
    public void inputTooShortFirstNameIntoAddressFirstNameInputField(){newAddressFormFirstNameInputField.sendKeys(tooShortAddressFirstName);}
    public void inputTooShortLastNameIntoAddressLastNameInputField(){newAddressFormLastNameInputField.sendKeys(tooShortAddressLastName);}
    public void inputTooShortAddress1IntoAddress1InputField(){newAddressFormAddress1InputField.sendKeys(tooShortAddress1);}
    public void inputTooShortCityIntoAddressCityInputField(){newAddressFormCityInputField.sendKeys(tooShortAddressCity);}

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
