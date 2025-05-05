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

    public CheckoutPageInvalidSingularInputFormat(WebDriver driver) {super(driver);}

    //singular input error getter
    public String getSingularInputErrorMessage(){return checkoutPageGuestSingularInputError.getText();}

    //singular input error box text getter
    public String getCheckoutSingularInputErrorBoxMessage() {
        String boxErrorText = checkoutPageSingularInputErrorBox.getText();
        return boxErrorText.replace("Close", "").replace("OK", "").trim();
    }

}
