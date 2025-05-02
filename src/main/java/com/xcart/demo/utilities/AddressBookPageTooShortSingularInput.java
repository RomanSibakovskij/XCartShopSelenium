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

    public AddressBookPageTooShortSingularInput(WebDriver driver) {super(driver);}

    //singular input error box text getter
    public String getSingularInputErrorBoxMessage() {
        String boxErrorText = addressBookPageSingularInputErrorBox.getText();
        return boxErrorText.replace("Close", "").replace("OK", "").trim();
    }

}
