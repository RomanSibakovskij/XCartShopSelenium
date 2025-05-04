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
    private String tooShortGuestAccLastName;
    private String tooShortGuestAccAddress1;
    private String tooShortGuestAccCity;
    private int tooShortGuestAccPostCode;
    private String tooShortGuestAccEmail;

    //invalid guest account generated data (shipping address) - too short singular input
    private String tooShortGuestShipAccFirstName;
    private String tooShortGuestShipAccLastName;
    private String tooShortGuestShipAccAddress1;

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

    //invalid guest account input data getter (billing and shipping address) - too short billing last name (1 char)
    public void invalidGuestAccountInputDataTooShortBillLastNameGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        tooShortGuestAccLastName = "B";
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(9);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = TestDataGenerator.getRandomPostalCode();
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(6);

        validGuestShipAccFirstName = validGuestAccFirstName;
        validGuestShipAccLastName = "Brandon";
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (too short billing last name): " + "\n");

        logger.info("Valid guest first name (too short billing last name): " + validGuestAccFirstName);
        logger.info("Too short guest last name: " + tooShortGuestAccLastName);
        logger.info("Valid guest address1 (too short billing last name): " + validGuestAccAddress1);
        logger.info("Valid guest city (too short billing last name): " + validGuestAccCity);
        logger.info("Valid guest post code (too short billing last name): " + validGuestAccPostCode);
        logger.info("Valid guest email (too short billing last name): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (too short billing last name): " + validGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (too short billing last name): " + validGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (too short billing last name): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (too short billing last name): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (too short billing last name): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - too short billing address (4 chars)
    public void invalidGuestAccountInputDataTooShortBillAddressGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        tooShortGuestAccAddress1 = "4 Rd";
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = TestDataGenerator.getRandomPostalCode();
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(6);

        validGuestShipAccFirstName = validGuestAccFirstName;
        validGuestShipAccLastName = validGuestAccLastName;
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (too short billing address): " + "\n");

        logger.info("Valid guest first name (too short billing address): " + validGuestAccFirstName);
        logger.info("Valid guest last name (too short billing address): " + validGuestAccLastName);
        logger.info("Too short guest address1: " + tooShortGuestAccAddress1);
        logger.info("Valid guest city (too short billing address): " + validGuestAccCity);
        logger.info("Valid guest post code (too short billing address): " + validGuestAccPostCode);
        logger.info("Valid guest email (too short billing address): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (too short billing address): " + validGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (too short billing address): " + validGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (too short billing address): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (too short billing address): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (too short billing address): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - too short billing city (2 chars)
    public void invalidGuestAccountInputDataTooShortBillCityGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(6);
        tooShortGuestAccCity = "G6";
        validGuestAccPostCode = TestDataGenerator.getRandomPostalCode();
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(6);

        validGuestShipAccFirstName = validGuestAccFirstName;
        validGuestShipAccLastName = validGuestAccLastName;
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (too short billing city): " + "\n");

        logger.info("Valid guest first name (too short billing city): " + validGuestAccFirstName);
        logger.info("Valid guest last name (too short billing city): " + validGuestAccLastName);
        logger.info("Valid guest address1 (too short billing city): " + validGuestAccAddress1);
        logger.info("Too short guest city: " + tooShortGuestAccCity);
        logger.info("Valid guest post code (too short billing city): " + validGuestAccPostCode);
        logger.info("Valid guest email (too short billing city): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (too short billing city): " + validGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (too short billing city): " + validGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (too short billing city): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (too short billing city): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (too short billing city): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - too short billing post code (4 digits)
    public void invalidGuestAccountInputDataTooShortBillPostCodeGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(6);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        tooShortGuestAccPostCode = 5465;
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(6);

        validGuestShipAccFirstName = validGuestAccFirstName;
        validGuestShipAccLastName = validGuestAccLastName;
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (too short billing post code): " + "\n");

        logger.info("Valid guest first name (too short billing post code): " + validGuestAccFirstName);
        logger.info("Valid guest last name (too short billing post code): " + validGuestAccLastName);
        logger.info("Valid guest address1 (too short billing post code): " + validGuestAccAddress1);
        logger.info("Valid guest city (too short billing post code): " + validGuestAccCity);
        logger.info("Too short guest post code: " + tooShortGuestAccPostCode);
        logger.info("Valid guest email (too short billing post code): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (too short billing post code): " + validGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (too short billing post code): " + validGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (too short billing post code): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (too short billing post code): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (too short billing post code): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - too short billing email (1 char -> name, domain)
    public void invalidGuestAccountInputDataTooShortBillEmailGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(6);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = 54625;
        tooShortGuestAccEmail = TestDataGenerator.generateRandomTooShortEmailAddress(1);

        validGuestShipAccFirstName = validGuestAccFirstName;
        validGuestShipAccLastName = validGuestAccLastName;
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (too short billing email): " + "\n");

        logger.info("Valid guest first name (too short billing email): " + validGuestAccFirstName);
        logger.info("Valid guest last name (too short billing email): " + validGuestAccLastName);
        logger.info("Valid guest address1 (too short billing email): " + validGuestAccAddress1);
        logger.info("Valid guest city (too short billing email): " + validGuestAccCity);
        logger.info("Valid guest post code (too short billing email): " + validGuestAccPostCode);
        logger.info("Too short guest email: " + tooShortGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (too short billing email): " + validGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (too short billing email): " + validGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (too short billing email): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (too short billing email): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (too short billing email): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - too short shipping first name (1 char)
    public void invalidGuestAccountInputDataTooShortShipFirstNameGetter(){

        validGuestAccFirstName = "Thomas";
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(6);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = 54625;
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(7);

        tooShortGuestShipAccFirstName = "T";
        validGuestShipAccLastName = validGuestAccLastName;
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (too short shipping first name): " + "\n");

        logger.info("Valid guest first name (too short shipping first name): " + validGuestAccFirstName);
        logger.info("Valid guest last name (too short shipping first name): " + validGuestAccLastName);
        logger.info("Valid guest address1 (too short shipping first name): " + validGuestAccAddress1);
        logger.info("Valid guest city (too short shipping first name): " + validGuestAccCity);
        logger.info("Valid guest post code (too short shipping first name): " + validGuestAccPostCode);
        logger.info("Valid guest email (too short shipping first name): " + tooShortGuestAccEmail);

        logger.info("Too short guest (shipping address section) first name: " + tooShortGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (too short shipping first name): " + validGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (too short shipping first name): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (too short shipping first name): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (too short shipping first name): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - too short shipping last name (1 char)
    public void invalidGuestAccountInputDataTooShortShipLastNameGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestAccLastName = "De Perez";
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(6);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = 54625;
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(7);

        validGuestShipAccFirstName = validGuestAccFirstName;
        tooShortGuestShipAccLastName = "D";
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (too short shipping last name): " + "\n");

        logger.info("Valid guest first name (too short shipping last name): " + validGuestAccFirstName);
        logger.info("Valid guest last name (too short shipping last name): " + validGuestAccLastName);
        logger.info("Valid guest address1 (too short shipping last name): " + validGuestAccAddress1);
        logger.info("Valid guest city (too short shipping last name): " + validGuestAccCity);
        logger.info("Valid guest post code (too short shipping last name): " + validGuestAccPostCode);
        logger.info("Valid guest email (too short shipping last name): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (too short shipping last name): " + validGuestShipAccFirstName);
        logger.info("Too short guest (shipping address section) last name: " + tooShortGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (too short shipping last name): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (too short shipping last name): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (too short shipping last name): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - too short shipping address (4 chars)
    public void invalidGuestAccountInputDataTooShortShipAddressGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(6);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = 54625;
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(7);

        validGuestShipAccFirstName = validGuestAccFirstName;
        validGuestShipAccLastName = validGuestAccLastName;
        tooShortGuestShipAccAddress1 = "5 Ln";
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (too short shipping address): " + "\n");

        logger.info("Valid guest first name (too short shipping address): " + validGuestAccFirstName);
        logger.info("Valid guest last name (too short shipping address): " + validGuestAccLastName);
        logger.info("Valid guest address1 (too short shipping address): " + validGuestAccAddress1);
        logger.info("Valid guest city (too short shipping address): " + validGuestAccCity);
        logger.info("Valid guest post code (too short shipping address): " + validGuestAccPostCode);
        logger.info("Valid guest email (too short shipping address): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (too short shipping address): " + validGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (too short shipping address): " + validGuestShipAccLastName);
        logger.info("Too short guest (shipping address section) address1: " + tooShortGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (too short shipping address): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (too short shipping address): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest data input methods (billing address) - too short singular input
    public void inputTooShortGuestFirstNameIntoFirstNameInputField(){checkoutPageNameAddressFirstNameInputField.sendKeys(tooShortGuestAccFirstName);}
    public void inputTooShortGuestLastNameIntoLastNameInputField(){checkoutPageNameAddressLastNameInputField.sendKeys(tooShortGuestAccLastName);}
    public void inputTooShortGuestAddress1IntoAddress1InputField(){checkoutPageNameAddressAddress1InputField.sendKeys(tooShortGuestAccAddress1);}
    public void inputTooShortGuestCityIntoCityInputField(){checkoutPageNameAddressCityInputField.sendKeys(tooShortGuestAccCity);}
    public void inputTooShortGuestPostCodeIntoPostCodeInputField(){checkoutPageNameAddressPostCodeInputField.sendKeys(String.valueOf(tooShortGuestAccPostCode));}
    public void inputTooShortGuestEmailIntoEmailInputField(){checkoutPageNameAddressEmailInputField.sendKeys(tooShortGuestAccEmail);}

    //invalid guest data input methods (shipping address) - too short singular input
    public void inputTooShortGuestShipFirstNameIntoFirstNameInputField(){checkoutPageNameShipAddressFirstNameInputField.sendKeys(tooShortGuestShipAccFirstName);}
    public void inputTooShortGuestShipLastNameIntoLastNameInputField(){checkoutPageNameShipAddressLastNameInputField.sendKeys(tooShortGuestShipAccLastName);}

    public void inputTooShortGuestShipAddress1IntoAddress1InputField(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkoutPageNameAddressShipDiffAddressCheckbox);
        checkoutPageNameShipAddressAddress1InputField.sendKeys(tooShortGuestShipAccAddress1);
    }

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
