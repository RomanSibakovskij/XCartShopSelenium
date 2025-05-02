package com.xcart.demo;

import com.xcart.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class AddressBookPage extends BasePage{

    //address book page web elements
    @FindBy(xpath = "//h1")
    private WebElement addressBookPageTitle;
    //link element
    @FindBy(xpath = "//a[@class='new-address']")
    private WebElement addAddressLink;
    //address book address elements
    @FindBy(xpath = "//div[@class='address-main']/div[@class='address-default']")
    private List<WebElement> addressBookEntryTitleElements;
    @FindBy(xpath = "//div[@class='address-main']/div[@class='address-line'][1]")
    private List<WebElement> addressBookEntryUserNameElements;
    @FindBy(xpath = "//div[@class='address-main']/div[@class='address-line'][2]")
    private List<WebElement> addressBookEntryDataElements;
    @FindBy(xpath = "//div[@class='address-main']//button[@class='button']")
    private List<WebElement> addressBookEntryChangeButtonElements;
    //new address form elements
    @FindBy(xpath = "//div[@class='ui-dialog-titlebar ui-corner-all ui-widget-header ui-helper-clearfix']/span")
    private WebElement newAddressFormTitle;
    @FindBy(xpath = "//label[@for='firstname']")
    private WebElement newAddressFormFirstNameSubtext;
    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement newAddressFormFirstNameInputField;
    @FindBy(xpath = "//label[@for='lastname']")
    private WebElement newAddressFormLastNameSubtext;
    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement newAddressFormLastNameInputField;
    @FindBy(xpath = "//label[@for='address']")
    private WebElement newAddressFormAddress1Subtext;
    @FindBy(xpath = "//input[@id='address']")
    private WebElement newAddressFormAddress1InputField;
    @FindBy(xpath = "//label[@for='address_2']")
    private WebElement newAddressFormAddress2Subtext;
    @FindBy(xpath = "//input[@id='address_2']")
    private WebElement newAddressFormAddress2InputField;
    @FindBy(xpath = "//label[@for='city']")
    private WebElement newAddressFormCitySubtext;
    @FindBy(xpath = "//input[@id='city']")
    private WebElement newAddressFormCityInputField;
    @FindBy(xpath = "//label[@for='country']")
    private WebElement newAddressFormCountrySubtext;
    @FindBy(xpath = "//select[@id='country']")
    private WebElement newAddressFormCountryDropdownMenu;
    @FindBy(xpath = "//label[@for='state']")
    private WebElement newAddressFormStateSubtext;
    @FindBy(xpath = "//select[@id='state']")
    private WebElement newAddressFormStateDropdownMenu;
    @FindBy(xpath = "//select[@id='state']/option[@value='IL']")
    private WebElement newAddressFormIllinoisStateOption;
    @FindBy(xpath = "//label[@for='zipcode']")
    private WebElement newAddressFormPostCodeSubtext;
    @FindBy(xpath = "//input[@id='zipcode']")
    private WebElement newAddressFormPostCodeInputField;
    @FindBy(xpath = "//label[@for='phone']")
    private WebElement newAddressFormPhoneSubtext;
    @FindBy(xpath = "//input[@id='phone']")
    private WebElement newAddressFormPhoneInputField;
    @FindBy(xpath = "//label[@for='fax']")
    private WebElement newAddressFormFaxSubtext;
    @FindBy(xpath = "//input[@id='fax']")
    private WebElement newAddressFormFaxInputField;
    @FindBy(xpath = "//div[@class='address']//div[@class='address-checkbox'][1]/label")
    private WebElement newAddressFormUseBillingAddressSubtext;
    @FindBy(xpath = "//div[@class='address']//div[@class='address-checkbox'][1]//input")
    private WebElement newAddressFormUseBillingAddressCheckbox;
    @FindBy(xpath = "//div[@class='address']//div[@class='address-checkbox'][2]/label")
    private WebElement newAddressFormUseShippingAddressSubtext;
    @FindBy(xpath = "//div[@class='address']//div[@class='address-checkbox'][2]//input")
    private WebElement newAddressFormUseShippingAddressCheckbox;
    @FindBy(xpath = "//div[@class='buttons-row buttons-auto-separator']/button")
    private WebElement newAddressFormSaveButton;

    //valid user address input data
    private String validAddressFirstName;
    private String validAddressLastName;
    private String validAddress1;
    private String validAddressCity;
    private int validAddressPostCode;

    public AddressBookPage(WebDriver driver) {super(driver);}

    //valid user new address data getter
    public void validUserNewAddressDataGetter() {

        RegisterPage registerPage = new RegisterPage(driver);

        validAddressFirstName = registerPage.getValidFirstName();
        validAddressLastName = registerPage.getValidLastName();
        validAddress1 = TestDataGenerator.generateRandomAddress(8);
        validAddressCity = TestDataGenerator.getRandomCity();
        validAddressPostCode = TestDataGenerator.getRandomPostalCode();

        System.out.println("Generated valid user new address data: " + "\n");

        logger.info("Valid user first name: " + validAddressFirstName);
        logger.info("Valid user last name: " + validAddressLastName);
        logger.info("Valid user address1: " + validAddress1);
        logger.info("Valid user city: " + validAddressCity);
        logger.info("Valid user post code: " + validAddressPostCode);

        System.out.println("\n");
    }

    //new address form data input methods
    public void inputValidFirstNameIntoAddressFirstNameInputField(){newAddressFormFirstNameInputField.sendKeys(validAddressFirstName);}
    public void inputValidLastNameIntoAddressLastNameInputField(){newAddressFormLastNameInputField.sendKeys(validAddressLastName);}
    public void inputValidAddress1IntoAddress1InputField(){newAddressFormAddress1InputField.sendKeys(validAddress1);}
    public void inputValidCityIntoAddressCityInputField(){newAddressFormCityInputField.sendKeys(validAddressCity);}
    public void inputValidPostCodeIntoAddressPostCodeInputField(){newAddressFormPostCodeInputField.sendKeys(String.valueOf(validAddressPostCode));}

    //click 'Add address' link method
    public void clickAddAddressLink() {addAddressLink.click();}

    //click 'State' dropdown menu method
    public void clickStateDropdownMenu() {
        Actions action = new Actions(driver);
        action.moveToElement(newAddressFormStateDropdownMenu).click().perform();
    }

    //select 'Illinois' state option method
    public void selectIllinoisStateOption() {newAddressFormIllinoisStateOption.click();}

    //click 'Shipping address' checkbox method (new address form)
    public void clickShippingAddressCheckbox() {
        Actions action = new Actions(driver);
        action.moveToElement(newAddressFormUseShippingAddressCheckbox).click().perform();
    }

    //click 'Save' button method (new address form)
    public void clickSaveButton() {
        Actions action = new Actions(driver);
        action.moveToElement(newAddressFormSaveButton).click().perform();
    }

    //address book page text element getter
    public String getAddressBookPageTitle() {return addressBookPageTitle.getText();}

    //address book data getter methods
    public List<String> getAddressEntryTitle(){return addressBookEntryTitleElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getAddressEntryUserName(){return addressBookEntryUserNameElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getAddressEntryData(){return addressBookEntryDataElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //new address form text element getter
    public String getNewAddressFormTitle() {return newAddressFormTitle.getText();}
    public String getNewAddressFormFirstNameSubtext() {return newAddressFormFirstNameSubtext.getText();}
    public String getNewAddressFormLastNameSubtext() {return newAddressFormLastNameSubtext.getText();}
    public String getNewAddressFormAddress1Subtext() {return newAddressFormAddress1Subtext.getText();}
    public String getNewAddressFormAddress2Subtext() {return newAddressFormAddress2Subtext.getText();}
    public String getNewAddressFormCitySubtext() {return newAddressFormCitySubtext.getText();}
    public String getNewAddressFormCountrySubtext() {return newAddressFormCountrySubtext.getText();}
    public String getNewAddressFormStateSubtext() {return newAddressFormStateSubtext.getText();}
    public String getNewAddressFormPostCodeSubtext() {return newAddressFormPostCodeSubtext.getText();}
    public String getNewAddressFormPhoneSubtext() {return newAddressFormPhoneSubtext.getText();}
    public String getNewAddressFormFaxSubtext() {return newAddressFormFaxSubtext.getText();}
    public String getNewAddressFormUseBillingAddressSubtext() {return newAddressFormUseBillingAddressSubtext.getText();}
    public String getNewAddressFormUseShippingAddressSubtext() {return newAddressFormUseShippingAddressSubtext.getText();}

    //address book page web element assert methods
    public boolean isAddressBookPageTitleDisplayed() {return addressBookPageTitle.isDisplayed();}
    public boolean isAddAddressLinkDisplayed() {return addAddressLink.isDisplayed();}
    //list elements
    public boolean isAddressBookEntryTitleDisplayed() {
        return addressBookEntryTitleElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddressBookEntryUserNameDisplayed() {
        return addressBookEntryUserNameElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddressBookEntryDataDisplayed() {
        return addressBookEntryDataElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddressBookEntryChangeButtonDisplayed() {
        return addressBookEntryChangeButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //new address web element assert methods
    public boolean isNewAddressFormTitleDisplayed() {return newAddressFormTitle.isDisplayed();}
    public boolean isNewAddressFormFirstNameSubtextDisplayed() {return newAddressFormFirstNameSubtext.isDisplayed();}
    public boolean isNewAddressFormFirstNameInputFieldDisplayed() {return newAddressFormFirstNameInputField.isDisplayed();}
    public boolean isNewAddressFormLastNameSubtextDisplayed() {return newAddressFormLastNameSubtext.isDisplayed();}
    public boolean isNewAddressFormLastNameInputFieldDisplayed() {return newAddressFormLastNameInputField.isDisplayed();}
    public boolean isNewAddressFormAddress1SubtextDisplayed() {return newAddressFormAddress1Subtext.isDisplayed();}
    public boolean isNewAddressFormAddress1InputFieldDisplayed() {return newAddressFormAddress1InputField.isDisplayed();}
    public boolean isNewAddressFormAddress2SubtextDisplayed() {return newAddressFormAddress2Subtext.isDisplayed();}
    public boolean isNewAddressFormAddress2InputFieldDisplayed() {return newAddressFormAddress2InputField.isDisplayed();}
    public boolean isNewAddressFormCitySubtextDisplayed() {return newAddressFormCitySubtext.isDisplayed();}
    public boolean isNewAddressFormCityInputFieldDisplayed() {return newAddressFormCityInputField.isDisplayed();}
    public boolean isNewAddressFormCountrySubtextDisplayed() {return newAddressFormCountrySubtext.isDisplayed();}
    public boolean isNewAddressFormCountryDropdownMenuDisplayed() {return newAddressFormCountryDropdownMenu.isDisplayed();}
    public boolean isNewAddressFormStateSubtextDisplayed() {return newAddressFormStateSubtext.isDisplayed();}
    public boolean isNewAddressFormStateDropdownMenuDisplayed() {return newAddressFormStateDropdownMenu.isDisplayed();}
    public boolean isNewAddressFormPostCodeSubtextDisplayed() {return newAddressFormPostCodeSubtext.isDisplayed();}
    public boolean isNewAddressFormPostCodeInputFieldDisplayed() {return newAddressFormPostCodeInputField.isDisplayed();}
    public boolean isNewAddressFormPhoneSubtextDisplayed() {return newAddressFormPhoneSubtext.isDisplayed();}
    public boolean isNewAddressFormPhoneInputFieldDisplayed() {return newAddressFormPhoneInputField.isDisplayed();}
    public boolean isNewAddressFormFaxSubtextDisplayed() {return newAddressFormFaxSubtext.isDisplayed();}
    public boolean isNewAddressFormFaxInputFieldDisplayed() {return newAddressFormFaxInputField.isDisplayed();}
    public boolean isNewAddressFormUseBillingAddressSubtextDisplayed() {return newAddressFormUseBillingAddressSubtext.isDisplayed();}
    public boolean isNewAddressFormUseBillingAddressCheckboxDisplayed() {return newAddressFormUseBillingAddressCheckbox.isDisplayed();}
    public boolean isNewAddressFormUseShippingAddressSubtextDisplayed() {return newAddressFormUseShippingAddressSubtext.isDisplayed();}
    public boolean isNewAddressFormUseShippingAddressCheckboxDisplayed() {return newAddressFormUseShippingAddressCheckbox.isDisplayed();}
    public boolean isNewAddressFormSaveButtonDisplayed() {return newAddressFormSaveButton.isDisplayed();}

}
