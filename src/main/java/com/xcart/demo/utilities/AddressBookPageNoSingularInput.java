package com.xcart.demo.utilities;

import com.xcart.demo.RegisterPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class AddressBookPageNoSingularInput extends BasePage{

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

    //invalid user address input data - no singular input
    private String noAddressFirstName;
    private String noAddressLastName;
    private String noAddress1;

    public AddressBookPageNoSingularInput(WebDriver driver) {super(driver);}

    //invalid user new address data getter - no first name
    public void invalidUserNewAddressDataNoFirstNameGetter() {

        RegisterPage registerPage = new RegisterPage(driver);

        noAddressFirstName = "";
        validAddressLastName = registerPage.getValidLastName();
        validAddress1 = TestDataGenerator.generateRandomAddress(8);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid user new address data (no first name): " + "\n");

        logger.info("No user first name: " + noAddressFirstName);
        logger.info("Valid user last name (no first name): " + validAddressLastName);
        logger.info("Valid user address1 (no first name): " + validAddress1);
        logger.info("Valid user city (no first name): " + validAddressCity);
        logger.info("Valid user post code (no first name): " + validAddressPostCode);

        System.out.println("\n");
    }

    //invalid user new address data getter - no last name
    public void invalidUserNewAddressDataNoLastNameGetter() {

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidFirstName();
        noAddressLastName = "";
        validAddress1 = TestDataGenerator.generateRandomAddress(8);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid user new address data (no last name): " + "\n");

        logger.info("Valid user first name (no last name): " + validAddressFirstName);
        logger.info("No user last name: " + noAddressLastName);
        logger.info("Valid user address1 (no last name): " + validAddress1);
        logger.info("Valid user city (no last name): " + validAddressCity);
        logger.info("Valid user post code (no last name): " + validAddressPostCode);

        System.out.println("\n");
    }

    //invalid user new address data getter - no user address (address1)
    public void invalidUserNewAddressDataNoAddressGetter() {

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidFirstName();
        validAddressLastName = registerPage.getValidLastName();
        noAddress1 = "";
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid user new address data (no user address): " + "\n");

        logger.info("Valid user first name (no user address): " + validAddressFirstName);
        logger.info("Valid user last name (no user address): " + validAddressLastName);
        logger.info("No user address1: " + noAddress1);
        logger.info("Valid user city (no user address): " + validAddressCity);
        logger.info("Valid user post code (no user address): " + validAddressPostCode);

        System.out.println("\n");
    }

    //invalid new address form data input methods - no singular input
    public void inputNoFirstNameIntoAddressFirstNameInputField(){newAddressFormFirstNameInputField.sendKeys(noAddressFirstName);}
    public void inputNoLastNameIntoAddressLastNameInputField(){newAddressFormLastNameInputField.sendKeys(noAddressLastName);}
    public void inputNoAddress1IntoAddress1InputField(){newAddressFormAddress1InputField.sendKeys(noAddress1);}

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
