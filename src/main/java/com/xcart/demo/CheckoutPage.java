package com.xcart.demo;

import com.xcart.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CheckoutPage extends BasePage{

    //checkout page web elements
    @FindBy(xpath = "//div[@id='center-main']/h1")
    private WebElement checkoutPageTitle;
    @FindBy(xpath = "//div[@id='opc_authbox']")
    private WebElement checkoutPageGuestDescription;
    @FindBy(xpath = "//div[@id='opc_authbox']/a")
    private WebElement checkoutPageSignInLink;
    @FindBy(xpath = "//div[@id='opc_authbox']")
    private WebElement checkoutPageRegUserDescription;
    @FindBy(xpath = "//div[@id='opc_authbox']/a[1]")
    private WebElement checkoutPageViewProfileLink;
    @FindBy(xpath = "//div[@id='opc_authbox']/a[2]")
    private WebElement checkoutPageSignOutLink;
    //name and address section (for guest)
    @FindBy(xpath = "//ul[@id='opc-sections']/li[1]//h2")
    private WebElement checkoutPageNameAddressSectionTitle;
    @FindBy(xpath = "//fieldset/div/div[@class='buttons-box']/a[2]")
    private WebElement checkoutPageNameAddressCancelButton;
    //input form
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//label[@for='b_firstname']")
    private WebElement checkoutPageNameAddressFirstNameSubtext;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//input[@id='b_firstname']")
    private WebElement checkoutPageNameAddressFirstNameInputField;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//label[@for='b_lastname']")
    private WebElement checkoutPageNameAddressLastNameSubtext;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//input[@id='b_lastname']")
    private WebElement checkoutPageNameAddressLastNameInputField;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//label[@for='b_address']")
    private WebElement checkoutPageNameAddressAddress1Subtext;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//input[@id='b_address']")
    private WebElement checkoutPageNameAddressAddress1InputField;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//label[@for='b_address_2']")
    private WebElement checkoutPageNameAddressAddress2Subtext;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//label[@for='b_address_2']")
    private WebElement checkoutPageNameAddressAddress2InputField;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//label[@for='b_city']")
    private WebElement checkoutPageNameAddressCitySubtext;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//input[@id='b_city']")
    private WebElement checkoutPageNameAddressCityInputField;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//label[@for='b_country']")
    private WebElement checkoutPageNameAddressCountrySubtext;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//select[@id='b_country']")
    private WebElement checkoutPageNameAddressCountryDropdownMenu;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//label[@for='b_address_book_B_state']")
    private WebElement checkoutPageNameAddressStateSubtext;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//select[@id='b_address_book_B_state']")
    private WebElement checkoutPageNameAddressStateDropdownMenu;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//label[@for='b_zipcode']")
    private WebElement checkoutPageNameAddressPostCodeSubtext;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//input[@id='b_zipcode']")
    private WebElement checkoutPageNameAddressPostCodeInputField;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//label[@for='b_phone']")
    private WebElement checkoutPageNameAddressPhoneSubtext;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//input[@id='b_phone']")
    private WebElement checkoutPageNameAddressPhoneInputField;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//label[@for='b_fax']")
    private WebElement checkoutPageNameAddressFaxSubtext;
    @FindBy(xpath = "//fieldset[@id='personal_details']/div[@class='address-book-content']/ul/li//input[@id='b_fax']")
    private WebElement checkoutPageNameAddressFaxInputField;
    @FindBy(xpath = "//fieldset[@id='personal_details']/ul[1]//label[@for='email']")
    private WebElement checkoutPageNameAddressEmailSubtext;
    @FindBy(xpath = "//fieldset[@id='personal_details']/ul[1]//input[@id='email']")
    private WebElement checkoutPageNameAddressEmailInputField;
    @FindBy(xpath = "//fieldset[@id='personal_details']//div[@class='optional-label'][1]/label")
    private WebElement checkoutPageNameAddressCreateAccountSubtext;
    @FindBy(xpath = "//fieldset[@id='personal_details']//div[@class='optional-label'][1]//input")
    private WebElement checkoutPageNameAddressCreateAccountCheckbox;
    @FindBy(xpath = "//fieldset[@id='personal_details']//div[@class='optional-label'][2]/label")
    private WebElement checkoutPageNameAddressShipDiffAddressSubtext;
    @FindBy(xpath = "//fieldset[@id='personal_details']//div[@class='optional-label'][2]//input")
    private WebElement checkoutPageNameAddressShipDiffAddressCheckbox;
    @FindBy(xpath = "//fieldset[@id='personal_details']//button")
    private WebElement checkoutPageNameAddressSubmitButton;
    //shipping address section elements
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//label[@for='s_firstname']")
    private WebElement checkoutPageNameShipAddressFirstNameSubtext;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//input[@id='s_firstname']")
    private WebElement checkoutPageNameShipAddressFirstNameInputField;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//label[@for='s_lastname']")
    private WebElement checkoutPageNameShipAddressLastNameSubtext;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//input[@id='s_lastname']")
    private WebElement checkoutPageNameShipAddressLastNameInputField;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//label[@for='s_address']")
    private WebElement checkoutPageNameShipAddressAddress1Subtext;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//input[@id='s_address']")
    private WebElement checkoutPageNameShipAddressAddress1InputField;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//label[@for='s_address_2']")
    private WebElement checkoutPageNameShipAddressAddress2Subtext;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//label[@for='s_address_2']")
    private WebElement checkoutPageNameShipAddressAddress2InputField;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//label[@for='s_city']")
    private WebElement checkoutPageNameShipAddressCitySubtext;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//input[@id='s_city']")
    private WebElement checkoutPageNameShipAddressCityInputField;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//label[@for='s_country']")
    private WebElement checkoutPageNameShipAddressCountrySubtext;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//select[@id='s_country']")
    private WebElement checkoutPageNameShipAddressCountryDropdownMenu;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//label[@for='s_address_book_S_state']")
    private WebElement checkoutPageNameShipAddressStateSubtext;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//select[@id='s_address_book_S_state']")
    private WebElement checkoutPageNameShipAddressStateDropdownMenu;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//label[@for='s_zipcode']")
    private WebElement checkoutPageNameShipAddressPostCodeSubtext;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//input[@id='s_zipcode']")
    private WebElement checkoutPageNameShipAddressPostCodeInputField;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//label[@for='s_phone']")
    private WebElement checkoutPageNameShipAddressPhoneSubtext;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//input[@id='s_phone']")
    private WebElement checkoutPageNameShipAddressPhoneInputField;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//label[@for='s_fax']")
    private WebElement checkoutPageNameShipAddressFaxSubtext;
    @FindBy(xpath = "//div[@id='ship2diff_box']//ul/li//input[@id='s_fax']")
    private WebElement checkoutPageNameShipAddressFaxInputField;
    //shipping method section
    @FindBy(xpath = "//ul[@id='opc-sections']/li[2]/div[1]/h2")
    private WebElement checkoutPageShipMethodSectionTitle;
    //radio buttons
    @FindBy(xpath = "//table[@class='checkout-shippings']/tbody/tr[1]/td[1]/input")
    private WebElement checkoutPageShipMethodExampleUSDeliveryRadioButton;
    @FindBy(xpath = "//table[@class='checkout-shippings']/tbody/tr[1]/td[2]")
    private WebElement checkoutPageShipMethodExampleUSDeliverySubtext;
    @FindBy(xpath = "//table[@class='checkout-shippings']/tbody/tr[1]/td[2]")
    private WebElement checkoutPageShipMethodExampleUSDeliveryPrice;
    @FindBy(xpath = "//table[@class='checkout-shippings']/tbody/tr[2]//input")
    private WebElement checkoutPageShipMethodExampleDelivery1RadioButton;
    @FindBy(xpath = "//table[@class='checkout-shippings']/tbody/tr[2]/td[2]")
    private WebElement checkoutPageShipMethodExampleDelivery1Subtext;
    @FindBy(xpath = "//table[@class='checkout-shippings']/tbody/tr[2]/td[3]")
    private WebElement checkoutPageShipMethodExampleDelivery1Price;
    @FindBy(xpath = "//table[@class='checkout-shippings']/tbody/tr[3]//input")
    private WebElement checkoutPageShipMethodExampleDelivery2RadioButton;
    @FindBy(xpath = "//table[@class='checkout-shippings']/tbody/tr[3]/td[2]")
    private WebElement checkoutPageShipMethodExampleDelivery2Subtext;
    @FindBy(xpath = "//table[@class='checkout-shippings']/tbody/tr[3]/td[3]")
    private WebElement checkoutPageShipMethodExampleDelivery2Price;
    //payment method section
    @FindBy(xpath = "//ul[@id='opc-sections']/li[2]/div[2]/h2")
    private WebElement checkoutPagePayMethodSectionTitle;
    //radio buttons
    @FindBy(xpath = "//ul[@id='opc-sections']/li[2]/div[2]//tbody/tr[1]//input")
    private WebElement checkoutPagePayMethodPhoneOrderingRadioButton;
    @FindBy(xpath = "//ul[@id='opc-sections']/li[2]/div[2]//tbody/tr[1]/td[2]")
    private WebElement checkoutPagePayMethodPhoneOrderingSubtext;
    @FindBy(xpath = "//ul[@id='opc-sections']/li[2]/div[2]//tbody/tr[3]//input")
    private WebElement checkoutPagePayMethodGiftCertificateRadioButton;
    @FindBy(xpath = "//ul[@id='opc-sections']/li[2]/div[2]//tbody/tr[3]/td[2]")
    private WebElement checkoutPagePayMethodGiftCertificateSubtext;
    @FindBy(xpath = "//ul[@id='opc-sections']/li[2]/div[2]//tbody/tr[5]//input")
    private WebElement checkoutPagePayMethodFaxOrderingRadioButton;
    @FindBy(xpath = "//ul[@id='opc-sections']/li[2]/div[2]//tbody/tr[5]/td[2]")
    private WebElement checkoutPagePayMethodFaxOrderingSubtext;
    @FindBy(xpath = "//ul[@id='opc-sections']/li[2]/div[2]//tbody/tr[7]//input")
    private WebElement checkoutPagePayMethodMoneyOrderRadioButton;
    @FindBy(xpath = "//ul[@id='opc-sections']/li[2]/div[2]//tbody/tr[7]/td[2]")
    private WebElement checkoutPagePayMethodMoneyOrderSubtext;
    @FindBy(xpath = "//ul[@id='opc-sections']/li[2]/div[2]//tbody/tr[11]//input")
    private WebElement checkoutPagePayMethodPurchaseOrderRadioButton;
    @FindBy(xpath = "//ul[@id='opc-sections']/li[2]/div[2]//tbody/tr[11]/td[2]")
    private WebElement checkoutPagePayMethodPurchaseOrderSubtext;
    @FindBy(xpath = "//ul[@id='opc-sections']/li[2]/div[2]//tbody/tr[13]//input")
    private WebElement checkoutPagePayMethodSagePayGoRadioButton;
    @FindBy(xpath = "//ul[@id='opc-sections']/li[2]/div[2]//tbody/tr[13]/td[2]")
    private WebElement checkoutPagePayMethodSagePayGoSubtext;
    @FindBy(xpath = "//ul[@id='opc-sections']/li[2]/div[2]//tbody/tr[15]//input")
    private WebElement checkoutPagePayMethodXPaymentsRadioButton;
    @FindBy(xpath = "//ul[@id='opc-sections']/li[2]/div[2]//tbody/tr[15]/td[2]")
    private WebElement checkoutPagePayMethodXPaymentsSubtext;
    //order summary section
    @FindBy(xpath = "//ul[@id='opc-sections']/li[3]/div[1]/h2")
    private WebElement checkoutPageOrderSummarySectionTitle;
    @FindBy(xpath = "//ul[@id='opc-sections']/li[3]/div[1]//table[@class='totals'][1]//tr[1]/td[@class='total-value']")
    private WebElement checkoutPageOrderSummarySubtotalPrice;
    @FindBy(xpath = "//ul[@id='opc-sections']/li[3]/div[1]//table[@class='totals'][1]//tr[3]/td[2]")
    private WebElement checkoutPageOrderSummaryShippingCost;
    @FindBy(xpath = "//ul[@id='opc-sections']/li[3]/div[1]//table[@class='totals'][1]//tr[4]/td[2]")
    private WebElement checkoutPageOrderSummaryPayMethodSurcharge;
    @FindBy(xpath = "//ul[@id='opc-sections']/li[3]/div[1]//table[@class='totals'][2]/tbody/tr/td[2]")
    private WebElement checkoutPageOrderSummaryTotalPrice;
    @FindBy(xpath = "//ul[@id='opc-sections']/li[3]/div[1]//table[@class='totals'][2]/tbody/tr/td[3]")
    private WebElement checkoutPageOrderSummaryTotalAltPrice;
    //discount coupon section
    @FindBy(xpath = "//div[@id='opc_coupon']//h3")
    private WebElement checkoutPageDiscountCouponSectionTitle;
    @FindBy(xpath = "//form[@id='checkout_form']//label[@for='customer_notes']")
    private WebElement checkoutPageDiscountCouponSectionSubtitle;
    @FindBy(xpath = "//form[@id='checkout_form']//textarea")
    private WebElement checkoutPageDiscountCouponTextarea;
    @FindBy(xpath = "//form[@id='checkout_form']/div[2]//input")
    private WebElement checkoutPageDiscountCouponAcceptTermsCheckbox;
    @FindBy(xpath = "//form[@id='checkout_form']/div[2]//label")
    private WebElement checkoutPageDiscountCouponAcceptTermsSubtext;
    @FindBy(xpath = "//form[@id='checkout_form']/div[2]//a[1]")
    private WebElement checkoutPageDiscountCouponTermsLink;
    @FindBy(xpath = "//form[@id='checkout_form']/div[2]//a[2]")
    private WebElement checkoutPageDiscountCouponPrivacyLink;
    //submit order button
    @FindBy(xpath = "//div[@id='btn_box']//button")
    private WebElement checkoutPageSubmitOrderButton;

    //valid guest account generated data (billing address)
    private String validGuestAccFirstName;
    private String validGuestAccLastName;
    private String validGuestAccAddress1;
    private String validGuestAccCity;
    private int validGuestAccPostCode;
    private String validGuestAccEmail;

    //valid guest account generated data (shipping address)
    private String validGuestShipAccFirstName;
    private String validGuestShipAccLastName;
    private String validGuestShipAccAddress1;
    private String validGuestShipAccCity;
    private int validGuestShipAccPostCode;

    public CheckoutPage(WebDriver driver) {super(driver);}

    //valid guest account input data getter (billing address)
    public void validGuestAccountInputDataGetter(){

        validGuestAccFirstName = TestDataGenerator.getRandomFirstName();
        validGuestAccLastName = TestDataGenerator.getRandomLastName();
        validGuestAccAddress1 = TestDataGenerator.generateRandomAddress(9);
        validGuestAccCity = TestDataGenerator.getRandomCity();
        validGuestAccPostCode = TestDataGenerator.getRandomPostalCode();
        validGuestAccEmail = TestDataGenerator.generateRandomEmailAddress(6);

        System.out.println("Generated input data for valid guest account: " + "\n");

        logger.info("Valid guest first name: " + validGuestAccFirstName);
        logger.info("Valid guest last name: " + validGuestAccLastName);
        logger.info("Valid guest address1: " + validGuestAccAddress1);
        logger.info("Valid guest city: " + validGuestAccCity);
        logger.info("Valid guest post code: " + validGuestAccPostCode);
        logger.info("Valid guest email: " + validGuestAccEmail);

        System.out.println("\n");

    }

    //valid guest data input methods (billing address)
    public void inputValidGuestFirstNameIntoFirstNameInputField(){checkoutPageNameAddressFirstNameInputField.sendKeys(validGuestAccFirstName);}
    public void inputValidGuestLastNameIntoLastNameInputField(){checkoutPageNameAddressLastNameInputField.sendKeys(validGuestAccLastName);}
    public void inputValidGuestAddress1IntoAddress1InputField(){checkoutPageNameAddressAddress1InputField.sendKeys(validGuestAccAddress1);}
    public void inputValidGuestCityIntoCityInputField(){checkoutPageNameAddressCityInputField.sendKeys(validGuestAccCity);}
    public void inputValidGuestPostCodeIntoPostCodeInputField(){checkoutPageNameAddressPostCodeInputField.sendKeys(String.valueOf(validGuestAccPostCode));}
    public void inputValidGuestEmailIntoEmailInputField(){checkoutPageNameAddressEmailInputField.sendKeys(validGuestAccEmail);}

    //click 'Submit' button (guest account) method
    public void clickSubmitButton(){checkoutPageNameAddressSubmitButton.click();}

    //valid guest account input data getter (shipping address)
    public void validGuestAccountShipAddressInputDataGetter(){

        validGuestShipAccFirstName = validGuestAccFirstName;
        validGuestShipAccLastName = validGuestAccLastName;
        validGuestShipAccAddress1 = TestDataGenerator.generateRandomAddress(4);
        validGuestShipAccCity = TestDataGenerator.getRandomCity();
        validGuestShipAccPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated input data for valid guest account (shipping address section): " + "\n");

        logger.info("Valid guest first name (shipping address section): " + validGuestShipAccFirstName);
        logger.info("Valid guest last name (shipping address section): " + validGuestShipAccLastName);
        logger.info("Valid guest address1 (shipping address section): " + validGuestShipAccAddress1);
        logger.info("Valid guest city (shipping address section): " + validGuestShipAccCity);
        logger.info("Valid guest post code (shipping address section): " + validGuestShipAccPostCode);

        System.out.println("\n");

    }

    //click 'Ship to a different address' checkbox method
    public void clickShipDiffAddressCheckbox() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkoutPageNameAddressShipDiffAddressCheckbox);
        Actions action = new Actions(driver);
        action.moveToElement(checkoutPageNameAddressShipDiffAddressCheckbox).click().perform();
    }

    //valid guest data input methods (shipping address)
    public void inputValidGuestShipFirstNameIntoFirstNameInputField(){checkoutPageNameShipAddressFirstNameInputField.sendKeys(validGuestAccFirstName);}
    public void inputValidGuestShipLastNameIntoLastNameInputField(){checkoutPageNameShipAddressLastNameInputField.sendKeys(validGuestAccLastName);}

    public void inputValidGuestShipAddress1IntoAddress1InputField(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkoutPageNameAddressShipDiffAddressCheckbox);
        checkoutPageNameShipAddressAddress1InputField.sendKeys(validGuestAccAddress1);
    }

    public void inputValidGuestShipCityIntoCityInputField(){checkoutPageNameShipAddressCityInputField.sendKeys(validGuestAccCity);}
    public void inputValidGuestShipPostCodeIntoPostCodeInputField(){checkoutPageNameShipAddressPostCodeInputField.sendKeys(String.valueOf(validGuestAccPostCode));}

    //click 'Fax ordering payment method' radio button
    public void clickFaxOrderingRadioButton(){
        Actions action = new Actions(driver);
        action.moveToElement(checkoutPagePayMethodFaxOrderingRadioButton).click().perform();
    }

    //click 'Example delivery method 1' radio button
    public void clickExampleDelivery1RadioButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(850));
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPageShipMethodExampleDelivery1RadioButton));
        checkoutPageShipMethodExampleDelivery1RadioButton.click();
    }

    //click 'Example delivery method 2' radio button
    public void clickExampleDelivery2RadioButton(){
        Actions action = new Actions(driver);
        action.moveToElement(checkoutPageShipMethodExampleDelivery2RadioButton).click().perform();
    }

    //click 'Money order payment method' radio button
    public void clickMoneyOrderRadioButton(){
        Actions action = new Actions(driver);
        action.moveToElement(checkoutPagePayMethodMoneyOrderRadioButton).click().perform();
    }

    //click 'Accept Terms' checkbox method
    public void clickAcceptTermsCheckbox(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".blockUI.blockOverlay")));
        checkoutPageDiscountCouponAcceptTermsCheckbox.click();
    }

    //click 'Submit order' button method
    public void clickSubmitOrderButton() {
        Actions action = new Actions(driver);
        action.moveToElement(checkoutPageSubmitOrderButton).click().perform();
    }

    //checkout page order section order data getters
    public String getOrderSummarySubtotalPrice() {return checkoutPageOrderSummarySubtotalPrice.getText();}
    public String getOrderSummaryShippingCost() {return checkoutPageOrderSummaryShippingCost.getText();}
    public String getOrderSummaryPayMethodSurcharge() {return checkoutPageOrderSummaryPayMethodSurcharge.getText();}
    public String getOrderSummaryTotalPrice() {return checkoutPageOrderSummaryTotalPrice.getText();}
    public String getOrderSummaryTotalAltPrice() {return checkoutPageOrderSummaryTotalAltPrice.getText();}

    //checkout page text element getters
    public String getCheckoutPageTitle() {return checkoutPageTitle.getText();}
    public String getCheckoutPageGuestDescription() {return checkoutPageGuestDescription.getText();}
    public String getCheckoutPageRegUserDescription() {
        String fullText = checkoutPageRegUserDescription.getText().trim();
        return fullText.substring(0, fullText.indexOf(","));
    }
    public String getCheckoutPageNameAddressSectionTitle() {return checkoutPageNameAddressSectionTitle.getText();}
    //name and address
    public String getCheckoutPageNameAddressFirstNameSubtext() {return checkoutPageNameAddressFirstNameSubtext.getText();}
    public String getCheckoutPageNameAddressLastNameSubtext() {return checkoutPageNameAddressLastNameSubtext.getText();}
    public String getCheckoutPageNameAddressAddress1Subtext() {return checkoutPageNameAddressAddress1Subtext.getText();}
    public String getCheckoutPageNameAddressAddress2Subtext() {return checkoutPageNameAddressAddress2Subtext.getText();}
    public String getCheckoutPageNameAddressCitySubtext() {return checkoutPageNameAddressCitySubtext.getText();}
    public String getCheckoutPageNameAddressCountrySubtext() {return checkoutPageNameAddressCountrySubtext.getText();}
    public String getCheckoutPageNameAddressStateSubtext() {return checkoutPageNameAddressStateSubtext.getText();}
    public String getCheckoutPageNameAddressPostCodeSubtext() {return checkoutPageNameAddressPostCodeSubtext.getText();}
    public String getCheckoutPageNameAddressPhoneSubtext() {return checkoutPageNameAddressPhoneSubtext.getText();}
    public String getCheckoutPageNameAddressFaxSubtext() {return checkoutPageNameAddressFaxSubtext.getText();}
    public String getCheckoutPageNameAddressEmailSubtext() {return checkoutPageNameAddressEmailSubtext.getText();}
    public String getCheckoutPageNameAddressCreateAccountSubtext() {return checkoutPageNameAddressCreateAccountSubtext.getText();}
    public String getCheckoutPageNameAddressShipDiffAddressSubtext() {return checkoutPageNameAddressShipDiffAddressSubtext.getText();}
    //shipping address section
    public String getCheckoutPageNameShipAddressFirstNameSubtext() {return checkoutPageNameShipAddressFirstNameSubtext.getText();}
    public String getCheckoutPageNameShipAddressLastNameSubtext() {return checkoutPageNameShipAddressLastNameSubtext.getText();}
    public String getCheckoutPageNameShipAddressAddress1Subtext() {return checkoutPageNameShipAddressAddress1Subtext.getText();}
    public String getCheckoutPageNameShipAddressAddress2Subtext() {return checkoutPageNameShipAddressAddress2Subtext.getText();}
    public String getCheckoutPageNameShipAddressCitySubtext() {return checkoutPageNameShipAddressCitySubtext.getText();}
    public String getCheckoutPageNameShipAddressCountrySubtext() {return checkoutPageNameShipAddressCountrySubtext.getText();}
    public String getCheckoutPageNameShipAddressStateSubtext() {return checkoutPageNameShipAddressStateSubtext.getText();}
    public String getCheckoutPageNameShipAddressPostCodeSubtext() {return checkoutPageNameShipAddressPostCodeSubtext.getText();}
    public String getCheckoutPageNameShipAddressPhoneSubtext() {return checkoutPageNameShipAddressPhoneSubtext.getText();}
    public String getCheckoutPageNameShipAddressFaxSubtext() {return checkoutPageNameShipAddressFaxSubtext.getText();}
    //shipping method
    public String getCheckoutPageShipMethodSectionTitle() {return checkoutPageShipMethodSectionTitle.getText();}
    public String getCheckoutPageShipMethodExampleUSDeliverySubtext() {return checkoutPageShipMethodExampleUSDeliverySubtext.getText();}
    public String getCheckoutPageShipMethodExampleUSDeliveryPrice() {return checkoutPageShipMethodExampleUSDeliveryPrice.getText();}
    public String getCheckoutPageShipMethodExampleDelivery1Subtext() {return checkoutPageShipMethodExampleDelivery1Subtext.getText();}
    public String getCheckoutPageShipMethodExampleDelivery1Price() {return checkoutPageShipMethodExampleDelivery1Price.getText();}
    public String getCheckoutPageShipMethodExampleDelivery2Subtext() {return checkoutPageShipMethodExampleDelivery2Subtext.getText();}
    public String getCheckoutPageShipMethodExampleDelivery2Price() {return checkoutPageShipMethodExampleDelivery2Price.getText();}
    //payment method
    public String getCheckoutPagePayMethodSectionTitle() {return checkoutPagePayMethodSectionTitle.getText();}
    public String getCheckoutPagePayMethodPhoneOrderingSubtext() {return checkoutPagePayMethodPhoneOrderingSubtext.getText();}
    public String getCheckoutPagePayMethodGiftCertificateSubtext() {return checkoutPagePayMethodGiftCertificateSubtext.getText();}
    public String getCheckoutPagePayMethodFaxOrderingSubtext() {return checkoutPagePayMethodFaxOrderingSubtext.getText();}
    public String getCheckoutPagePayMethodMoneyOrderingSubtext() {return checkoutPagePayMethodMoneyOrderSubtext.getText();}
    public String getCheckoutPagePayMethodPurchaseOrderSubtext() {return checkoutPagePayMethodPurchaseOrderSubtext.getText();}
    public String getCheckoutPagePayMethodSagePayGoSubtext() {return checkoutPagePayMethodSagePayGoSubtext.getText();}
    public String getCheckoutPagePayMethodXPaymentSubtext() {return checkoutPagePayMethodXPaymentsSubtext.getText();}
    //order summary
    public String getCheckoutPageOrderSummarySectionTitle() {return checkoutPageOrderSummarySectionTitle.getText();}
    //discount section
    public String getCheckoutPageDiscountCouponSectionTitle() {return checkoutPageDiscountCouponSectionTitle.getText();}
    public String getCheckoutPageDiscountCouponSectionSubtitle() {return checkoutPageDiscountCouponSectionSubtitle.getText();}
    public String getCheckoutPageDiscountCouponAcceptTermsSubtext() {return checkoutPageDiscountCouponAcceptTermsSubtext.getText();}

    //checkout page web element assert methods
    public boolean isCheckoutPageTitleDisplayed() {return checkoutPageTitle.isDisplayed();}
    //guest only parts
    public boolean isCheckoutPageGuestDescriptionDisplayed() {return checkoutPageGuestDescription.isDisplayed();}
    public boolean isCheckoutPageSignInLinkDisplayed() {return checkoutPageSignInLink.isDisplayed();}
    //reg user only parts
    public boolean isCheckoutPageRegUserDescriptionDisplayed() {return checkoutPageRegUserDescription.isDisplayed();}
    public boolean isCheckoutPageViewProfileLinkDisplayed() {return checkoutPageViewProfileLink.isDisplayed();}
    public boolean isCheckoutPageSignOutLinkDisplayed() {return checkoutPageSignOutLink.isDisplayed();}
    //guest only parts
    //name and address section
    public boolean isCheckoutPageNameAddressSectionTitleDisplayed() {return checkoutPageNameAddressSectionTitle.isDisplayed();}
    public boolean isCheckoutPageNameAddressCancelButtonDisplayed() {return checkoutPageNameAddressCancelButton.isDisplayed();}
    public boolean isCheckoutPageNameAddressFirstNameSubtextDisplayed() {return checkoutPageNameAddressFirstNameSubtext.isDisplayed();}
    public boolean isCheckoutPageNameAddressFirstNameInputFieldDisplayed() {return checkoutPageNameAddressFirstNameInputField.isDisplayed();}
    public boolean isCheckoutPageNameAddressLastNameSubtextDisplayed() {return checkoutPageNameAddressLastNameSubtext.isDisplayed();}
    public boolean isCheckoutPageNameAddressLastNameInputFieldDisplayed() {return checkoutPageNameAddressLastNameInputField.isDisplayed();}
    public boolean isCheckoutPageNameAddressAddress1SubtextDisplayed() {return checkoutPageNameAddressAddress1Subtext.isDisplayed();}
    public boolean isCheckoutPageNameAddressAddress1InputFieldDisplayed() {return checkoutPageNameAddressAddress1InputField.isDisplayed();}
    public boolean isCheckoutPageNameAddressAddress2SubtextDisplayed() {return checkoutPageNameAddressAddress2Subtext.isDisplayed();}
    public boolean isCheckoutPageNameAddressAddress2InputFieldDisplayed() {return checkoutPageNameAddressAddress2InputField.isDisplayed();}
    public boolean isCheckoutPageNameAddressCitySubtextDisplayed() {return checkoutPageNameAddressCitySubtext.isDisplayed();}
    public boolean isCheckoutPageNameAddressCityInputFieldDisplayed() {return checkoutPageNameAddressCityInputField.isDisplayed();}
    public boolean isCheckoutPageNameAddressCountrySubtextDisplayed() {return checkoutPageNameAddressCountrySubtext.isDisplayed();}
    public boolean isCheckoutPageNameAddressCountryDropdownMenuDisplayed() {return checkoutPageNameAddressCountryDropdownMenu.isDisplayed();}
    public boolean isCheckoutPageNameAddressStateSubtextDisplayed() {return checkoutPageNameAddressStateSubtext.isDisplayed();}
    public boolean isCheckoutPageNameAddressStateDropdownMenuDisplayed() {return checkoutPageNameAddressStateDropdownMenu.isDisplayed();}
    public boolean isCheckoutPageNameAddressPostCodeSubtextDisplayed() {return checkoutPageNameAddressPostCodeSubtext.isDisplayed();}
    public boolean isCheckoutPageNameAddressPostCodeInputFieldDisplayed() {return checkoutPageNameAddressPostCodeInputField.isDisplayed();}
    public boolean isCheckoutPageNameAddressPhoneSubtextDisplayed() {return checkoutPageNameAddressPhoneSubtext.isDisplayed();}
    public boolean isCheckoutPageNameAddressPhoneInputFieldDisplayed() {return checkoutPageNameAddressPhoneInputField.isDisplayed();}
    public boolean isCheckoutPageNameAddressFaxSubtextDisplayed() {return checkoutPageNameAddressFaxSubtext.isDisplayed();}
    public boolean isCheckoutPageNameAddressFaxInputFieldDisplayed() {return checkoutPageNameAddressFaxInputField.isDisplayed();}
    public boolean isCheckoutPageNameAddressEmailSubtextDisplayed() {return checkoutPageNameAddressEmailSubtext.isDisplayed();}
    public boolean isCheckoutPageNameAddressEmailInputFieldDisplayed() {return checkoutPageNameAddressEmailInputField.isDisplayed();}
    public boolean isCheckoutPageNameAddressCreateAccountSubtextDisplayed() {return checkoutPageNameAddressCreateAccountSubtext.isDisplayed();}
    public boolean isCheckoutPageNameAddressCreateAccountCheckboxDisplayed() {return checkoutPageNameAddressCreateAccountCheckbox.isDisplayed();}
    public boolean isCheckoutPageNameAddressShipDiffAddressSubtextDisplayed() {return checkoutPageNameAddressShipDiffAddressSubtext.isDisplayed();}
    public boolean isCheckoutPageNameAddressShipDiffAddressCheckboxDisplayed() {return checkoutPageNameAddressShipDiffAddressCheckbox.isDisplayed();}
    public boolean isCheckoutPageNameAddressSubmitButtonDisplayed() {return checkoutPageNameAddressSubmitButton.isDisplayed();}
    //shipping address section
    public boolean isCheckoutPageNameShipAddressFirstNameSubtextDisplayed() {return checkoutPageNameShipAddressFirstNameSubtext.isDisplayed();}
    public boolean isCheckoutPageNameShipAddressFirstNameInputFieldDisplayed() {return checkoutPageNameShipAddressFirstNameInputField.isDisplayed();}
    public boolean isCheckoutPageNameShipAddressLastNameSubtextDisplayed() {return checkoutPageNameShipAddressLastNameSubtext.isDisplayed();}
    public boolean isCheckoutPageNameShipAddressLastNameInputFieldDisplayed() {return checkoutPageNameShipAddressLastNameInputField.isDisplayed();}
    public boolean isCheckoutPageNameShipAddressAddress1SubtextDisplayed() {return checkoutPageNameShipAddressAddress1Subtext.isDisplayed();}
    public boolean isCheckoutPageNameShipAddressAddress1InputFieldDisplayed() {return checkoutPageNameShipAddressAddress1InputField.isDisplayed();}
    public boolean isCheckoutPageNameShipAddressAddress2SubtextDisplayed() {return checkoutPageNameShipAddressAddress2Subtext.isDisplayed();}
    public boolean isCheckoutPageNameShipAddressAddress2InputFieldDisplayed() {return checkoutPageNameShipAddressAddress2InputField.isDisplayed();}
    public boolean isCheckoutPageNameShipAddressCitySubtextDisplayed() {return checkoutPageNameShipAddressCitySubtext.isDisplayed();}
    public boolean isCheckoutPageNameShipAddressCityInputFieldDisplayed() {return checkoutPageNameShipAddressCityInputField.isDisplayed();}
    public boolean isCheckoutPageNameShipAddressCountrySubtextDisplayed() {return checkoutPageNameShipAddressCountrySubtext.isDisplayed();}
    public boolean isCheckoutPageNameShipAddressCountryDropdownMenuDisplayed() {return checkoutPageNameShipAddressCountryDropdownMenu.isDisplayed();}
    public boolean isCheckoutPageNameShipAddressStateSubtextDisplayed() {return checkoutPageNameShipAddressStateSubtext.isDisplayed();}
    public boolean isCheckoutPageNameShipAddressStateDropdownMenuDisplayed() {return checkoutPageNameShipAddressStateDropdownMenu.isDisplayed();}
    public boolean isCheckoutPageNameShipAddressPostCodeSubtextDisplayed() {return checkoutPageNameShipAddressPostCodeSubtext.isDisplayed();}
    public boolean isCheckoutPageNameShipAddressPostCodeInputFieldDisplayed() {return checkoutPageNameShipAddressPostCodeInputField.isDisplayed();}
    public boolean isCheckoutPageNameShipAddressPhoneSubtextDisplayed() {return checkoutPageNameShipAddressPhoneSubtext.isDisplayed();}
    public boolean isCheckoutPageNameShipAddressPhoneInputFieldDisplayed() {return checkoutPageNameShipAddressPhoneInputField.isDisplayed();}
    public boolean isCheckoutPageNameShipAddressFaxSubtextDisplayed() {return checkoutPageNameShipAddressFaxSubtext.isDisplayed();}
    public boolean isCheckoutPageNameShipAddressFaxInputFieldDisplayed() {return checkoutPageNameShipAddressFaxInputField.isDisplayed();}
    //shipping method (not available for all products)
    public boolean isCheckoutPageShipMethodSectionTitleDisplayed() {return checkoutPageShipMethodSectionTitle.isDisplayed();}
    public boolean isCheckoutPageShipMethodExampleUSDeliveryRadioButtonDisplayed() {return checkoutPageShipMethodExampleUSDeliveryRadioButton.isDisplayed();}
    public boolean isCheckoutPageShipMethodExampleUSDeliverySubtextDisplayed() {return checkoutPageShipMethodExampleUSDeliverySubtext.isDisplayed();}
    public boolean isCheckoutPageShipMethodExampleUSDeliveryPriceDisplayed() {return checkoutPageShipMethodExampleUSDeliveryPrice.isDisplayed();}
    public boolean isCheckoutPageShipMethodExampleUSDelivery1RadioButtonDisplayed() {return checkoutPageShipMethodExampleDelivery1RadioButton.isDisplayed();}
    public boolean isCheckoutPageShipMethodExampleUSDelivery1SubtextDisplayed() {return checkoutPageShipMethodExampleDelivery1Subtext.isDisplayed();}
    public boolean isCheckoutPageShipMethodExampleUSDelivery1PriceDisplayed() {return checkoutPageShipMethodExampleDelivery1Price.isDisplayed();}
    public boolean isCheckoutPageShipMethodExampleUSDelivery2RadioButtonDisplayed() {return checkoutPageShipMethodExampleDelivery2RadioButton.isDisplayed();}
    public boolean isCheckoutPageShipMethodExampleUSDelivery2SubtextDisplayed() {return checkoutPageShipMethodExampleDelivery2Subtext.isDisplayed();}
    public boolean isCheckoutPageShipMethodExampleUSDelivery2PriceDisplayed() {return checkoutPageShipMethodExampleDelivery2Price.isDisplayed();}
    //payment method section
    public boolean isCheckoutPayMethodSectionTitleDisplayed() {return checkoutPagePayMethodSectionTitle.isDisplayed();}
    public boolean isCheckoutPayMethodPhoneOrderingRadioButtonDisplayed() {return checkoutPagePayMethodPhoneOrderingRadioButton.isDisplayed();}
    public boolean isCheckoutPayMethodPhoneOrderingSubtextDisplayed() {return checkoutPagePayMethodPhoneOrderingSubtext.isDisplayed();}
    public boolean isCheckoutPayMethodGiftCertificateRadioButtonDisplayed() {return checkoutPagePayMethodGiftCertificateRadioButton.isDisplayed();}
    public boolean isCheckoutPayMethodGiftCertificateSubtextDisplayed() {return checkoutPagePayMethodGiftCertificateSubtext.isDisplayed();}
    public boolean isCheckoutPayMethodFaxOrderingRadioButtonDisplayed() {return checkoutPagePayMethodFaxOrderingRadioButton.isDisplayed();}
    public boolean isCheckoutPayMethodFaxOrderingSubtextDisplayed() {return checkoutPagePayMethodFaxOrderingSubtext.isDisplayed();}
    public boolean isCheckoutPayMethodMoneyOrderRadioButtonDisplayed() {return checkoutPagePayMethodMoneyOrderRadioButton.isDisplayed();}
    public boolean isCheckoutPayMethodMoneyOrderSubtextDisplayed() {return checkoutPagePayMethodMoneyOrderSubtext.isDisplayed();}
    public boolean isCheckoutPayMethodPurchaseOrderRadioButtonDisplayed() {return checkoutPagePayMethodPurchaseOrderRadioButton.isDisplayed();}
    public boolean isCheckoutPayMethodPurchaseOrderSubtextDisplayed() {return checkoutPagePayMethodPurchaseOrderSubtext.isDisplayed();}
    public boolean isCheckoutPayMethodSagePayGoRadioButtonDisplayed() {return checkoutPagePayMethodSagePayGoRadioButton.isDisplayed();}
    public boolean isCheckoutPayMethodSagePayGoSubtextDisplayed() {return checkoutPagePayMethodSagePayGoSubtext.isDisplayed();}
    public boolean isCheckoutPayMethodXPaymentsRadioButtonDisplayed() {return checkoutPagePayMethodXPaymentsRadioButton.isDisplayed();}
    public boolean isCheckoutPayMethodXPaymentsSubtextDisplayed() {return checkoutPagePayMethodXPaymentsSubtext.isDisplayed();}
    //order summary section
    public boolean isCheckoutPageOrderSummarySectionTitleDisplayed() {return checkoutPageOrderSummarySectionTitle.isDisplayed();}
    public boolean isCheckoutPageOrderSummarySubtotalPriceDisplayed() {return checkoutPageOrderSummarySubtotalPrice.isDisplayed();}
    public boolean isCheckoutPageOrderSummaryShippingCostDisplayed() {return checkoutPageOrderSummaryShippingCost.isDisplayed();}
    public boolean isCheckoutPageOrderSummaryPayMethodSurchargeDisplayed() {return checkoutPageOrderSummaryPayMethodSurcharge.isDisplayed();}
    public boolean isCheckoutPageOrderSummaryTotalPriceDisplayed() {return checkoutPageOrderSummaryTotalPrice.isDisplayed();}
    public boolean isCheckoutPageOrderSummaryTotalAltPriceDisplayed() {return checkoutPageOrderSummaryTotalAltPrice.isDisplayed();}
    //discount coupon section
    public boolean isCheckoutPageDiscountCouponSectionTitleDisplayed() {return checkoutPageDiscountCouponSectionTitle.isDisplayed();}
    public boolean isCheckoutPageDiscountCouponSectionSubtitleDisplayed() {return checkoutPageDiscountCouponSectionSubtitle.isDisplayed();}
    public boolean isCheckoutPageDiscountCouponTextareaDisplayed() {return checkoutPageDiscountCouponTextarea.isDisplayed();}
    public boolean isCheckoutPageDiscountCouponAcceptTermsCheckboxDisplayed() {return checkoutPageDiscountCouponAcceptTermsCheckbox.isDisplayed();}
    public boolean isCheckoutPageDiscountCouponAcceptTermsSubtextDisplayed() {return checkoutPageDiscountCouponAcceptTermsSubtext.isDisplayed();}
    public boolean isCheckoutPageDiscountCouponTermsPageLinkDisplayed() {return checkoutPageDiscountCouponTermsLink.isDisplayed();}
    public boolean isCheckoutPageDiscountCouponPrivacyPageLinkDisplayed() {return checkoutPageDiscountCouponPrivacyLink.isDisplayed();}
    public boolean isCheckoutPageSubmitOrderButtonDisplayed() {return checkoutPageSubmitOrderButton.isDisplayed();}

}
