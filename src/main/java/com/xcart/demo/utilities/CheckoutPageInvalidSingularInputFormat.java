package com.xcart.demo.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class CheckoutPageInvalidSingularInputFormat extends BasePage{

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
    //shipping address section elements
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

    //invalid guest account generated data (billing address) - invalid singular input format
    private String invalidGuestAccFirstNameFormat;
    private String invalidGuestAccLastNameFormat;
    private String invalidGuestAccAddress1Format;
    private String invalidGuestAccCityFormat;
    private String invalidGuestAccPostCodeFormat;
    private String invalidGuestAccEmailFormat;
    //existing test email
    private String existingTestEmail;

    public CheckoutPageInvalidSingularInputFormat(WebDriver driver) {super(driver);}

    //invalid guest account input data getter (billing and shipping address) - invalid billing first name format (special symbols only)
    public void invalidGuestAccountInputDataInvalidBillFirstNameFormatGetter(){

        invalidGuestAccFirstNameFormat = "$$%#$@##$@#";
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(9);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = TestDataGenerator.getRandomPostalCode();
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(6);

        validGuestShipAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestShipAccLastName = validGuestAccLastName;
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (invalid billing first name format): " + "\n");

        logger.info("Invalid guest first name format: " + invalidGuestAccFirstNameFormat);
        logger.info("Valid guest last name (invalid billing first name format): " + validGuestAccLastName);
        logger.info("Valid guest address1 (invalid billing first name format): " + validGuestAccAddress1);
        logger.info("Valid guest city (invalid billing first name format): " + validGuestAccCity);
        logger.info("Valid guest post code (invalid billing first name format): " + validGuestAccPostCode);
        logger.info("Valid guest email (invalid billing first name format): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (invalid billing first name format): " + validGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (invalid billing first name format): " + validGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (invalid billing first name format): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (invalid billing first name format): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (invalid billing first name format): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - invalid billing last name format (special symbols only)
    public void invalidGuestAccountInputDataInvalidBillLastNameFormatGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        invalidGuestAccLastNameFormat = "*^*^*%$%$";
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(9);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = TestDataGenerator.getRandomPostalCode();
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(6);

        validGuestShipAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestShipAccLastName = TestDataGenerator.getRandomLastName();
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (invalid billing last name format): " + "\n");

        logger.info("Valid guest first name (invalid billing last name format): " + validGuestAccFirstName);
        logger.info("Invalid guest last name format: " + invalidGuestAccLastNameFormat);
        logger.info("Valid guest address1 (invalid billing last name format): " + validGuestAccAddress1);
        logger.info("Valid guest city (invalid billing last name format): " + validGuestAccCity);
        logger.info("Valid guest post code (invalid billing last name format): " + validGuestAccPostCode);
        logger.info("Valid guest email (invalid billing last name format): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (invalid billing last name format): " + validGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (invalid billing last name format): " + validGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (invalid billing last name format): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (invalid billing last name format): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (invalid billing last name format): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - invalid billing address format (special symbols only)
    public void invalidGuestAccountInputDataInvalidBillAddressFormatGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        invalidGuestAccAddress1Format = "$%^%$^";
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = TestDataGenerator.getRandomPostalCode();
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(6);

        validGuestShipAccFirstName = validGuestAccFirstName;
        validGuestShipAccLastName = validGuestAccLastName;
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (invalid billing address format): " + "\n");

        logger.info("Valid guest first name (invalid billing address format): " + validGuestAccFirstName);
        logger.info("Valid guest last name (invalid billing address format): " + validGuestAccLastName);
        logger.info("Invalid guest address1 format: " + invalidGuestAccAddress1Format);
        logger.info("Valid guest city (invalid billing address format): " + validGuestAccCity);
        logger.info("Valid guest post code (invalid billing address format): " + validGuestAccPostCode);
        logger.info("Valid guest email (invalid billing address format): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (invalid billing address format): " + validGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (invalid billing address format): " + validGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (invalid billing address format): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (invalid billing address format): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (invalid billing address format): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - invalid billing city format (special symbols only)
    public void invalidGuestAccountInputDataInvalidBillCityFormatGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        invalidGuestAccCityFormat = "#$$^$%^%$^";
        validGuestAccPostCode = TestDataGenerator.getRandomPostalCode();
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(6);

        validGuestShipAccFirstName = validGuestAccFirstName;
        validGuestShipAccLastName = validGuestAccLastName;
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (invalid billing city format): " + "\n");

        logger.info("Valid guest first name (invalid billing city format): " + validGuestAccFirstName);
        logger.info("Valid guest last name (invalid billing city format): " + validGuestAccLastName);
        logger.info("Valid guest address1 (invalid billing city format): " + validGuestAccAddress1);
        logger.info("Invalid guest city format: " + invalidGuestAccCityFormat);
        logger.info("Valid guest post code (invalid billing city format): " + validGuestAccPostCode);
        logger.info("Valid guest email (invalid billing city format): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (invalid billing city format): " + validGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (invalid billing city format): " + validGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (invalid billing city format): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (invalid billing city format): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (invalid billing city format): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - invalid billing post code format (special symbols only)
    public void invalidGuestAccountInputDataInvalidBillPostCodeFormatGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        invalidGuestAccPostCodeFormat = "#%$#%@#@";
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(6);

        validGuestShipAccFirstName = validGuestAccFirstName;
        validGuestShipAccLastName = validGuestAccLastName;
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (invalid billing post code format): " + "\n");

        logger.info("Valid guest first name (invalid billing post code format): " + validGuestAccFirstName);
        logger.info("Valid guest last name (invalid billing post code format): " + validGuestAccLastName);
        logger.info("Valid guest address1 (invalid billing post code format): " + validGuestAccAddress1);
        logger.info("Valid guest city (invalid billing post code format): " + validGuestAccCity);
        logger.info("Invalid guest post code format: " + invalidGuestAccPostCodeFormat);
        logger.info("Valid guest email (invalid billing post code format): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (invalid billing post code format): " + validGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (invalid billing post code format): " + validGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (invalid billing post code format): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (invalid billing post code format): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (invalid billing post code format): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - invalid billing email format (missing '@')
    public void invalidGuestAccountInputDataInvalidBillEmailFormatGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = TestDataGenerator.getRandomPostalCode();
        invalidGuestAccEmailFormat = "Dfsfddsfgfakemail.com";

        validGuestShipAccFirstName = validGuestAccFirstName;
        validGuestShipAccLastName = validGuestAccLastName;
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (invalid billing email format): " + "\n");

        logger.info("Valid guest first name (invalid billing email format): " + validGuestAccFirstName);
        logger.info("Valid guest last name (invalid billing email format): " + validGuestAccLastName);
        logger.info("Valid guest address1 (invalid billing email format): " + validGuestAccAddress1);
        logger.info("Valid guest city (invalid billing email format): " + validGuestAccCity);
        logger.info("Valid guest post code (invalid billing email format): " + validGuestAccPostCode);
        logger.info("Invalid guest email format: " + invalidGuestAccEmailFormat);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - existing billing email format (test email)
    public void invalidGuestAccountInputDataExistingBillTestEmailGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = TestDataGenerator.getRandomPostalCode();
        existingTestEmail = "demo-customer@x-cart.com";

        validGuestShipAccFirstName = validGuestAccFirstName;
        validGuestShipAccLastName = validGuestAccLastName;
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (existing test email): " + "\n");

        logger.info("Valid guest first name (existing test email): " + validGuestAccFirstName);
        logger.info("Valid guest last name (existing test email): " + validGuestAccLastName);
        logger.info("Valid guest address1 (existing test email): " + validGuestAccAddress1);
        logger.info("Valid guest city (existing test email): " + validGuestAccCity);
        logger.info("Valid guest post code (existing test email): " + validGuestAccPostCode);
        logger.info("Existing test email: " + existingTestEmail);

        System.out.println("\n");

    }

    //invalid guest data input methods (billing address) - invalid singular input format
    public void inputInvalidGuestFirstNameFormatIntoFirstNameInputField(){checkoutPageNameAddressFirstNameInputField.sendKeys(invalidGuestAccFirstNameFormat);}
    public void inputInvalidGuestLastNameFormatIntoLastNameInputField(){checkoutPageNameAddressLastNameInputField.sendKeys(invalidGuestAccLastNameFormat);}
    public void inputInvalidGuestAddress1FormatIntoAddress1InputField(){checkoutPageNameAddressAddress1InputField.sendKeys(invalidGuestAccAddress1Format);}
    public void inputInvalidGuestCityFormatIntoCityInputField(){checkoutPageNameAddressCityInputField.sendKeys(invalidGuestAccCityFormat);}
    public void inputInvalidGuestPostCodeFormatIntoPostCodeInputField(){checkoutPageNameAddressPostCodeInputField.sendKeys(invalidGuestAccPostCodeFormat);}
    public void inputInvalidGuestEmailFormatIntoEmailInputField(){checkoutPageNameAddressEmailInputField.sendKeys(invalidGuestAccEmailFormat);}
    public void inputExistingTestBillEmailIntoEmailInputField(){checkoutPageNameAddressEmailInputField.sendKeys(existingTestEmail);}

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
