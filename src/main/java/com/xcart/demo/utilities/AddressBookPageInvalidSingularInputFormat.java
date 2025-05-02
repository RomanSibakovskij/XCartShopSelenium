package com.xcart.demo.utilities;

import com.xcart.demo.RegisterPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class AddressBookPageInvalidSingularInputFormat extends BasePage{

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

    //invalid user address input data - invalid singular input format
    private String invalidAddressFirstNameFormat;
    private String invalidAddressLastNameFormat;
    private String invalidAddress1Format;

    public AddressBookPageInvalidSingularInputFormat(WebDriver driver) {super(driver);}

    //invalid user new address data getter - invalid first name format (special symbols only)
    public void invalidUserNewAddressDataInvalidFirstNameFormatGetter() {

        RegisterPage registerPage = new RegisterPage(driver);

        invalidAddressFirstNameFormat = "@$#$%^%$&";
        validAddressLastName = registerPage.getValidLastName();
        validAddress1 = TestDataGenerator.generateRandomAddress(8);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid user new address data (invalid first name format): " + "\n");

        logger.info("Invalid first name input format: " + invalidAddressFirstNameFormat);
        logger.info("Valid user last name (invalid first name format): " + validAddressLastName);
        logger.info("Valid user address1 (invalid first name format): " + validAddress1);
        logger.info("Valid user city (invalid first name format): " + validAddressCity);
        logger.info("Valid user post code (invalid first name format): " + validAddressPostCode);

        System.out.println("\n");
    }

    //invalid user new address data getter - invalid last name format (special symbols only)
    public void invalidUserNewAddressDataInvalidLastNameFormatGetter() {

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidFirstName();
        invalidAddressLastNameFormat = "$%$%^%^&%^&";
        validAddress1 = TestDataGenerator.generateRandomAddress(8);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid user new address data (invalid last name format): " + "\n");

        logger.info("Valid user first name (invalid last name format): " + validAddressFirstName);
        logger.info("Invalid last name input format: " + invalidAddressLastNameFormat);
        logger.info("Valid user address1 (invalid last name format): " + validAddress1);
        logger.info("Valid user city (invalid last name format): " + validAddressCity);
        logger.info("Valid user post code (invalid last name format): " + validAddressPostCode);

        System.out.println("\n");
    }

    //invalid user new address data getter - invalid address input format (special symbols only)
    public void invalidUserNewAddressDataInvalidAddressFormatGetter() {

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidFirstName();
        validAddressLastName = registerPage.getValidLastName();
        invalidAddress1Format = "@$@#$%$#^";
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated invalid user new address data (invalid address format): " + "\n");

        logger.info("Valid user first name (invalid address format): " + validAddressFirstName);
        logger.info("Valid user last name (invalid address format): " + validAddressLastName);
        logger.info("Invalid address1 input format: " + invalidAddress1Format);
        logger.info("Valid user city (invalid address format): " + validAddressCity);
        logger.info("Valid user post code (invalid address format): " + validAddressPostCode);

        System.out.println("\n");
    }

    //invalid new address form data input methods - invalid singular input format
    public void inputInvalidFirstNameFormatIntoAddressFirstNameInputField(){newAddressFormFirstNameInputField.sendKeys(invalidAddressFirstNameFormat);}
    public void inputInvalidLastNameFormatIntoAddressLastNameInputField(){newAddressFormLastNameInputField.sendKeys(invalidAddressLastNameFormat);}
    public void inputInvalidAddress1FormatIntoAddress1InputField(){newAddressFormAddress1InputField.sendKeys(invalidAddress1Format);}

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
