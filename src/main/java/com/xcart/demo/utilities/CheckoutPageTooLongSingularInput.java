package com.xcart.demo.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class CheckoutPageTooLongSingularInput extends BasePage{

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

    //invalid guest account generated data (billing address) - too long singular input
    private String tooLongGuestAccFirstName;
    private String tooLongGuestAccLastName;
    private String tooLongGuestAccAddress1;
    private String tooLongGuestAccCity;
    private int tooLongGuestAccPostCode;
    private String tooLongGuestAccEmail;

    //invalid guest account generated data (shipping address) - too long singular input
    private String tooLongGuestShipAccFirstName;
    private String tooLongGuestShipAccLastName;
    private String tooLongGuestShipAccAddress1;
    private String tooLongGuestShipAccCity;

    public CheckoutPageTooLongSingularInput(WebDriver driver) {super(driver);}

    //invalid guest account input data getter (billing and shipping address) - too long billing first name (100 chars)
    public void invalidGuestAccountInputDataTooLongBillFirstNameGetter(){

        tooLongGuestAccFirstName = "Rdsffhgfhsdegttgyujiilukfgdsfdgchjkliiuikyuiiopopiiuyytrefdawsfgvxvxfgdsfsdfgeerweqerettuyhfgfdfgdfd";
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

        System.out.println("Generated input data for valid guest account (too long billing first name): " + "\n");

        logger.info("Too long guest first name: " + tooLongGuestAccFirstName);
        logger.info("Valid guest last name (too long billing first name): " + validGuestAccLastName);
        logger.info("Valid guest address1 (too long billing first name): " + validGuestAccAddress1);
        logger.info("Valid guest city (too long billing first name): " + validGuestAccCity);
        logger.info("Valid guest post code (too long billing first name): " + validGuestAccPostCode);
        logger.info("Valid guest email (too long billing first name): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (too long billing first name): " + validGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (too long billing first name): " + validGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (too long billing first name): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (too long billing first name): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (too long billing first name): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - too long billing last name (100 chars)
    public void invalidGuestAccountInputDataTooLongBillLastNameGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        tooLongGuestAccLastName = "Rdsffhgfhsdegttgyujiilukfgdsfdgchjkliiuikyuiiopopiiuyytrefdawsfgvxvxfgdsfsdfgeerweqerettuyhfgfdfgdfd";
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(9);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = TestDataGenerator.getRandomPostalCode();
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(6);

        validGuestShipAccFirstName = validGuestAccFirstName;
        validGuestShipAccLastName = TestDataGenerator.getRandomLastName();
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (too long billing last name): " + "\n");

        logger.info("Valid guest first name (too long billing last name): " + validGuestAccFirstName);
        logger.info("Too short guest last name: " + tooLongGuestAccLastName);
        logger.info("Valid guest address1 (too long billing last name): " + validGuestAccAddress1);
        logger.info("Valid guest city (too long billing last name): " + validGuestAccCity);
        logger.info("Valid guest post code (too long billing last name): " + validGuestAccPostCode);
        logger.info("Valid guest email (too long billing last name): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (too long billing last name): " + validGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (too long billing last name): " + validGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (too long billing last name): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (too long billing last name): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (too long billing last name): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - too long billing address (100 chars)
    public void invalidGuestAccountInputDataTooLongBillAddressGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        tooLongGuestAccAddress1 = TestDataGenerator.generateRandomAddress(93);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = TestDataGenerator.getRandomPostalCode();
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(6);

        validGuestShipAccFirstName = validGuestAccFirstName;
        validGuestShipAccLastName = validGuestAccLastName;
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (too long billing address): " + "\n");

        logger.info("Valid guest first name (too long billing address): " + validGuestAccFirstName);
        logger.info("Valid guest last name (too long billing address): " + tooLongGuestAccLastName);
        logger.info("Too long guest address1: " + tooLongGuestAccAddress1);
        logger.info("Valid guest city (too long billing address): " + validGuestAccCity);
        logger.info("Valid guest post code (too long billing address): " + validGuestAccPostCode);
        logger.info("Valid guest email (too long billing address): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (too long billing address): " + validGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (too long billing address): " + validGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (too long billing address): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (too long billing address): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (too long billing address): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - too long billing city (75 chars)
    public void invalidGuestAccountInputDataTooLongBillCityGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(8);
        tooLongGuestAccCity = "Rsfdgfdgffgvfdsfaghresrfeghtyjtrewaertuyikyujthygrfsdsffghnbvcsdsfdghfggshg";
        validGuestAccPostCode = TestDataGenerator.getRandomPostalCode();
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(6);

        validGuestShipAccFirstName = validGuestAccFirstName;
        validGuestShipAccLastName = validGuestAccLastName;
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (too long billing city): " + "\n");

        logger.info("Valid guest first name (too long billing city): " + validGuestAccFirstName);
        logger.info("Valid guest last name (too long billing city): " + tooLongGuestAccLastName);
        logger.info("Valid guest address1 (too long billing city): " + validGuestAccAddress1);
        logger.info("Too long guest city: " + tooLongGuestAccCity);
        logger.info("Valid guest post code (too long billing city): " + validGuestAccPostCode);
        logger.info("Valid guest email (too long billing city): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (too long billing city): " + validGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (too long billing city): " + validGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (too long billing city): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (too long billing city): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (too long billing city): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - too long billing post code (6 digits)
    public void invalidGuestAccountInputDataTooLongBillPostCodeGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(8);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        tooLongGuestAccPostCode = 878643;
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(6);

        validGuestShipAccFirstName = validGuestAccFirstName;
        validGuestShipAccLastName = validGuestAccLastName;
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (too long billing post code): " + "\n");

        logger.info("Valid guest first name (too long billing post code): " + validGuestAccFirstName);
        logger.info("Valid guest last name (too long billing post code): " + tooLongGuestAccLastName);
        logger.info("Valid guest address1 (too long billing post code): " + validGuestAccAddress1);
        logger.info("Valid guest city (too long billing post code): " + validGuestAccCity);
        logger.info("Too long guest post code: " + tooLongGuestAccPostCode);
        logger.info("Valid guest email (too long billing post code): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (too long billing post code): " + validGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (too long billing post code): " + validGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (too long billing post code): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (too long billing post code): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (too long billing post code): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - too long billing email address (100 chars -> name, domain)
    public void invalidGuestAccountInputDataTooLongBillEmailGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(8);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = TestDataGenerator.getRandomPostalCode();
        tooLongGuestAccEmail = TestDataGenerator.generateRandomTooLongEmailAddress(100);

        validGuestShipAccFirstName = validGuestAccFirstName;
        validGuestShipAccLastName = validGuestAccLastName;
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (too long billing email): " + "\n");

        logger.info("Valid guest first name (too long billing email): " + validGuestAccFirstName);
        logger.info("Valid guest last name (too long billing email): " + validGuestAccLastName);
        logger.info("Valid guest address1 (too long billing email): " + validGuestAccAddress1);
        logger.info("Valid guest city (too long billing email): " + validGuestAccCity);
        logger.info("Valid guest post code (too long billing email): " + validGuestAccPostCode);
        logger.info("Too long guest email: " + tooLongGuestAccEmail);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - too long shipping first name (100 chars)
    public void invalidGuestAccountInputDataTooLongShipFirstNameGetter(){

        validGuestAccFirstName = "Keith";
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(8);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = TestDataGenerator.getRandomPostalCode();
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(6);

        tooLongGuestShipAccFirstName = "Kdsffhgfhsdegttgyujiilukfgdsfdgchjkliiuikyuiiopopiiuyytrefdawsfgvxvxfgdsfsdfgeerweqerettuyhfgfdfgdfd";
        validGuestShipAccLastName = validGuestAccLastName;
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (too long shipping first name): " + "\n");

        logger.info("Valid guest first name (too long shipping first name): " + validGuestAccFirstName);
        logger.info("Valid guest last name (too long shipping first name): " + tooLongGuestAccLastName);
        logger.info("Valid guest address1 (too long shipping first name): " + validGuestAccAddress1);
        logger.info("Valid guest city (too long shipping first name): " + validGuestAccCity);
        logger.info("Valid guest post code (too long shipping first name): " + validGuestAccPostCode);
        logger.info("Valid guest email (too long shipping first name): " + validGuestAccEmail);

        logger.info("Too long guest (shipping address section) first name: " + tooLongGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (too long shipping first name): " + validGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (too long shipping first name): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (too long shipping first name): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (too long shipping first name): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - too long shipping last name (100 chars)
    public void invalidGuestAccountInputDataTooLongShipLastNameGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestAccLastName = "Lyndon";
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(8);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = TestDataGenerator.getRandomPostalCode();
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(6);

        validGuestShipAccFirstName = validGuestAccFirstName;
        tooLongGuestShipAccLastName = "Ldsffhgfhsdegttgyujiilukfgdsfdgchjkliiuikyuiiopopiiuyytrefdawsfgvxvxfgdsfsdfgeerweqerettuyhfgfdfgdfd";
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (too long shipping last name): " + "\n");

        logger.info("Valid guest first name (too long shipping last name): " + validGuestAccFirstName);
        logger.info("Valid guest last name (too long shipping last name): " + tooLongGuestAccLastName);
        logger.info("Valid guest address1 (too long shipping last name): " + validGuestAccAddress1);
        logger.info("Valid guest city (too long shipping last name): " + validGuestAccCity);
        logger.info("Valid guest post code (too long shipping last name): " + validGuestAccPostCode);
        logger.info("Valid guest email (too long shipping last name): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (too long shipping last name): " + validGuestShipAccFirstName);
        logger.info("Too long guest (shipping address section) last name: " + tooLongGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (too long shipping last name): " + validGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (too long shipping last name): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (too long shipping last name): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - too long shipping address (100 chars)
    public void invalidGuestAccountInputDataTooLongShipAddressGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(8);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = TestDataGenerator.getRandomPostalCode();
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(6);

        validGuestShipAccFirstName = validGuestAccFirstName;
        validGuestShipAccLastName = validGuestAccLastName;
        tooLongGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(93);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (too long shipping address): " + "\n");

        logger.info("Valid guest first name (too long shipping address): " + validGuestAccFirstName);
        logger.info("Valid guest last name (too long shipping address): " + tooLongGuestAccLastName);
        logger.info("Valid guest address1 (too long shipping address): " + validGuestAccAddress1);
        logger.info("Valid guest city (too long shipping address): " + validGuestAccCity);
        logger.info("Valid guest post code (too long shipping address): " + validGuestAccPostCode);
        logger.info("Valid guest email (too long shipping address): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (too long shipping address): " + validGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (too long shipping address): " + validGuestShipAccLastName);
        logger.info("Too long guest (shipping address section) address1: " + tooLongGuestShipAccAddress1);
        logger.info("Valid guest (shipping address section) city (too long shipping address): " + validGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (too long shipping address): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest account input data getter (billing and shipping address) - too long shipping city (75 chars)
    public void invalidGuestAccountInputDataTooLongShipCityGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(8);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = TestDataGenerator.getRandomPostalCode();
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(6);

        validGuestShipAccFirstName = validGuestAccFirstName;
        validGuestShipAccLastName = validGuestAccLastName;
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(5);
        tooLongGuestShipAccCity = "Rsfdgfdgffgvfdsfaghresrfeghtyjtrewaertuyikyujthygrfsdsffghnbvcsdsfdghfggshg";
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (too long shipping city): " + "\n");

        logger.info("Valid guest first name (too long shipping city): " + validGuestAccFirstName);
        logger.info("Valid guest last name (too long shipping city): " + tooLongGuestAccLastName);
        logger.info("Valid guest address1 (too long shipping city): " + validGuestAccAddress1);
        logger.info("Valid guest city (too long shipping city): " + validGuestAccCity);
        logger.info("Valid guest post code (too long shipping city): " + validGuestAccPostCode);
        logger.info("Valid guest email (too long shipping city): " + validGuestAccEmail);

        logger.info("Valid guest (shipping address section) first name (too long shipping city): " + validGuestShipAccFirstName);
        logger.info("Valid guest (shipping address section) last name (too long shipping city): " + validGuestShipAccLastName);
        logger.info("Valid guest (shipping address section) address1 (too long shipping city): " + validGuestShipAccAddress1);
        logger.info("Too long guest (shipping address section) city: " + tooLongGuestShipAccCity);
        logger.info("Valid guest (shipping address section) post code (too long shipping city): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //invalid guest data input methods (billing address) - too long singular input
    public void inputTooLongGuestFirstNameIntoFirstNameInputField(){checkoutPageNameAddressFirstNameInputField.sendKeys(tooLongGuestAccFirstName);}
    public void inputTooLongGuestLastNameIntoLastNameInputField(){checkoutPageNameAddressLastNameInputField.sendKeys(tooLongGuestAccLastName);}
    public void inputTooLongGuestAddress1IntoAddress1InputField(){checkoutPageNameAddressAddress1InputField.sendKeys(tooLongGuestAccAddress1);}
    public void inputTooLongGuestCityIntoCityInputField(){checkoutPageNameAddressCityInputField.sendKeys(tooLongGuestAccCity);}
    public void inputTooLongGuestPostCodeIntoPostCodeInputField(){checkoutPageNameAddressPostCodeInputField.sendKeys(String.valueOf(tooLongGuestAccPostCode));}
    public void inputTooLongGuestEmailIntoEmailInputField(){checkoutPageNameAddressEmailInputField.sendKeys(tooLongGuestAccEmail);}

    //valid guest data input methods (billing address) - for remaining inputs
    public void inputValidGuestFirstNameIntoFirstNameInputField(){checkoutPageNameAddressFirstNameInputField.sendKeys(validGuestAccFirstName);}
    public void inputValidGuestLastNameIntoLastNameInputField(){checkoutPageNameAddressLastNameInputField.sendKeys(validGuestAccLastName);}
    public void inputValidGuestAddress1IntoAddress1InputField(){checkoutPageNameAddressAddress1InputField.sendKeys(validGuestAccAddress1);}
    public void inputValidGuestCityIntoCityInputField(){checkoutPageNameAddressCityInputField.sendKeys(validGuestAccCity);}
    public void inputValidGuestPostCodeIntoPostCodeInputField(){checkoutPageNameAddressPostCodeInputField.sendKeys(String.valueOf(validGuestAccPostCode));}
    public void inputValidGuestEmailIntoEmailInputField(){checkoutPageNameAddressEmailInputField.sendKeys(validGuestAccEmail);}

    //invalid guest data input methods (shipping address) - too long singular input
    public void inputTooLongGuestShipFirstNameIntoFirstNameInputField(){checkoutPageNameShipAddressFirstNameInputField.sendKeys(tooLongGuestShipAccFirstName);}
    public void inputTooLongGuestShipLastNameIntoLastNameInputField(){checkoutPageNameShipAddressLastNameInputField.sendKeys(tooLongGuestShipAccLastName);}

    public void inputTooLongGuestShipAddress1IntoAddress1InputField(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkoutPageNameAddressShipDiffAddressCheckbox);
        checkoutPageNameShipAddressAddress1InputField.sendKeys(tooLongGuestShipAccAddress1);
    }

    public void inputTooLongGuestShipCityIntoCityInputField(){checkoutPageNameShipAddressCityInputField.sendKeys(tooLongGuestShipAccCity);}

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
