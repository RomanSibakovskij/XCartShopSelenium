package com.xcart.demo.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class CheckoutPageTooShortSingularInput extends BasePage{

    //name and address section (for guest)
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//input[@id='b_firstname']")
    private WebElement checkoutPageNameAddressFirstNameInputField;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//input[@id='b_lastname']")
    private WebElement checkoutPageNameAddressLastNameInputField;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//input[@id='b_address']")
    private WebElement checkoutPageNameAddressAddress1InputField;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//input[@id='b_city']")
    private WebElement checkoutPageNameAddressCityInputField;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//select[@id='b_country']")
    private WebElement checkoutPageNameAddressCountryDropdownMenu;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//select[@id='b_address_book_B_state']")
    private WebElement checkoutPageNameAddressStateDropdownMenu;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//input[@id='b_zipcode']")
    private WebElement checkoutPageNameAddressPostCodeInputField;
    @FindBy(xpath = "//fieldset[@id='personal_details']/ul[1]//input[@id='email']")
    private WebElement checkoutPageNameAddressEmailInputField;
    @FindBy(xpath = "//fieldset[@id='personal_details']//div[@class='optional-label'][2]//input")
    private WebElement checkoutPageNameAddressShipDiffAddressCheckbox;
    //shipping address section elements;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//input[@id='s_firstname']")
    private WebElement checkoutPageNameShipAddressFirstNameInputField;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//input[@id='s_lastname']")
    private WebElement checkoutPageNameShipAddressLastNameInputField;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//input[@id='s_address']")
    private WebElement checkoutPageNameShipAddressAddress1InputField;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//input[@id='s_city']")
    private WebElement checkoutPageNameShipAddressCityInputField;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//select[@id='s_country']")
    private WebElement checkoutPageNameShipAddressCountryDropdownMenu;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//select[@id='s_address_book_S_state']")
    private WebElement checkoutPageNameShipAddressStateDropdownMenu;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//input[@id='s_zipcode']")
    private WebElement checkoutPageNameShipAddressPostCodeInputField;
    //singular input error
    @FindBy(xpath = "//div[@class='error-label']")
    private WebElement checkoutPageGuestSingularInputError;
    //singular input error box element
    @FindBy(xpath = "//div[@role='dialog']")
    private WebElement checkoutPageSingularInputErrorBox;

    //valid guest account generated data (billing address) -> for remaining valid inputs
    private String validGuestAccFirstName;
    private String validGuestAccLastName;
    private String validGuestAccAddress1;
    private String validGuestAccCity;
    private int validGuestAccPostCode;
    private String validGuestAccEmail;

    //valid guest account generated data (shipping address) -> for remaining valid inputs
    private String validGuestShipAccFirstName;
    private String validGuestShipAccLastName;
    private String validGuestShipAccAddress1;
    private String validGuestShipAccCity;
    private int validGuestShipAccPostCode;

    //invalid guest account generated data (billing address) - too short singular input
    private String tooShortGuestAccFirstName;

    public CheckoutPageTooShortSingularInput(WebDriver driver) {super(driver);}

    //invalid guest account input data getter (billing and shipping address) - too short billing first name (1 char)
    public void invalidGuestAccountInputDataTooShortBillFirstNameGetter(){

        tooShortGuestAccFirstName = "D";
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(9);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = TestDataGenerator.getRandomPostalCode();
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(6);

        validGuestShipAccFirstName = "Douglas";
        validGuestShipAccLastName = validGuestAccLastName;
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (too short billing first name): " + "\n");

        logger.info("Too short guest first name: " + tooShortGuestAccFirstName);
        logger.info("Valid guest last name (too short billing first name): " + validGuestAccLastName);
        logger.info("Valid guest address1 (too short billing first name): " + validGuestAccAddress1);
        logger.info("Valid guest city (too short billing first name): " + validGuestAccCity);
        logger.info("Valid guest post code (too short billing first name): " + validGuestAccPostCode);
        logger.info("Valid guest email (too short billing first name): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (too short billing first name): " + validGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (too short billing first name): " + validGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (too short billing first name): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (too short billing first name): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (too short billing first name): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest data input methods (billing address) - too short singular input
    public void inputTooShortGuestFirstNameIntoFirstNameInputField(){checkoutPageNameAddressFirstNameInputField.sendKeys(tooShortGuestAccFirstName);}

    //valid guest data input methods (billing address) - for remaining inputs
    public void inputValidGuestFirstNameIntoFirstNameInputField(){checkoutPageNameAddressFirstNameInputField.sendKeys(validGuestAccFirstName);}
    public void inputValidGuestLastNameIntoLastNameInputField(){checkoutPageNameAddressLastNameInputField.sendKeys(validGuestAccLastName);}
    public void inputValidGuestAddress1IntoAddress1InputField(){checkoutPageNameAddressAddress1InputField.sendKeys(validGuestAccAddress1);}
    public void inputValidGuestCityIntoCityInputField(){checkoutPageNameAddressCityInputField.sendKeys(validGuestAccCity);}
    public void inputValidGuestPostCodeIntoPostCodeInputField(){checkoutPageNameAddressPostCodeInputField.sendKeys(String.valueOf(validGuestAccPostCode));}
    public void inputValidGuestEmailIntoEmailInputField(){checkoutPageNameAddressEmailInputField.sendKeys(validGuestAccEmail);}

    //valid guest data input methods (shipping address) - for remaining inputs
    public void inputValidGuestShipFirstNameIntoFirstNameInputField(){checkoutPageNameShipAddressFirstNameInputField.sendKeys(validGuestShipAccFirstName);}
    public void inputValidGuestShipLastNameIntoLastNameInputField(){checkoutPageNameShipAddressLastNameInputField.sendKeys(validGuestShipAccLastName);}

    public void inputValidGuestShipAddress1IntoAddress1InputField(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkoutPageNameAddressShipDiffAddressCheckbox);
        checkoutPageNameShipAddressAddress1InputField.sendKeys(validGuestShipAccAddress1);
    }

    public void inputValidGuestShipCityIntoCityInputField(){checkoutPageNameShipAddressCityInputField.sendKeys(validGuestShipAccCity);}
    public void inputValidGuestShipPostCodeIntoPostCodeInputField(){checkoutPageNameShipAddressPostCodeInputField.sendKeys(String.valueOf(validGuestShipAccPostCode));}

    //singular input error getter
    public String getSingularInputErrorMessage(){return checkoutPageGuestSingularInputError.getText();}

    //singular input error box text getter
    public String getCheckoutSingularInputErrorBoxMessage() {
        String boxErrorText = checkoutPageSingularInputErrorBox.getText();
        return boxErrorText.replace("Close", "").replace("OK", "").trim();
    }

}
