package com.xcart.demo;

import com.xcart.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class AccountDetailsPage extends BasePage {

    //account details page web elements
    @FindBy(xpath = "//div[@id='center-main']/h1")
    private WebElement accountDetailsPageTitle;
    @FindBy(xpath = "//div[@id='center-main']/p")
    private WebElement accountDetailsPageDescription;
    //personal information section
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[1]/td")
    private WebElement accountDetailsPagePersonalInfoSectionTitle;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[2]/td[1]")
    private WebElement accountDetailsPageFirstNameSubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[2]//input")
    private WebElement accountDetailsPageFirstNameInputField;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[3]/td[1]")
    private WebElement accountDetailsPageLastNameSubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[3]//input")
    private WebElement accountDetailsPageLastNameInputField;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[4]/td[1]")
    private WebElement accountDetailsPageCompanySubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[4]//input")
    private WebElement accountDetailsPageCompanyInputField;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[5]/td[1]")
    private WebElement accountDetailsPageWebsiteSubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[5]//input")
    private WebElement accountDetailsPageWebsiteInputField;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[6]/td[1]")
    private WebElement accountDetailsPageTaxNumberSubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[6]//input")
    private WebElement accountDetailsPageTaxNumberInputField;
    //account information section
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[7]/td")
    private WebElement accountDetailsPageAccountInfoSectionTitle;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[8]/td[1]")
    private WebElement accountDetailsPageEmailSubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[8]//input")
    private WebElement accountDetailsPageEmailInputField;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[9]/td[1]")
    private WebElement accountDetailsPagePasswordSubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[9]//a")
    private WebElement accountDetailsPageChangePasswordFormLink;
    //newsletter section
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[10]/td")
    private WebElement accountDetailsPageNewsletterSectionTitle;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[11]/td")
    private WebElement accountDetailsPageNewsletterSubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[12]/td[2]//input[@name='subscription[2]']")
    private WebElement accountDetailsPageExclusiveOffersCheckbox;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[12]/td[2]/div[1]/label")
    private WebElement accountDetailsPageExclusiveOffersSubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[12]/td[2]/div[1]/span")
    private WebElement accountDetailsPageExclusiveOffersDescription;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[12]/td[2]//input[@name='subscription[1]']")
    private WebElement accountDetailsPageSiteUpdatesCheckbox;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[12]/td[2]/div[2]/label")
    private WebElement accountDetailsPageSiteUpdatesSubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[12]/td[2]/div[2]/span")
    private WebElement accountDetailsPageSiteUpdatesDescription;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[13]//a")
    private WebElement accountDetailsPageDeleteAccountLink;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[13]//button")
    private WebElement accountDetailsPageSubmitButton;
    //change password form
    @FindBy(xpath = "//div[@id='center-main']/h1")
    private WebElement accountDetailsPageChangePasswordSectionTitle;
    @FindBy(xpath = "//table[@class='data-table']/tbody/tr[1]/td[1]")
    private WebElement accountDetailsPageFormEmailSubtext;
    @FindBy(xpath = "//table[@class='data-table']/tbody/tr[1]/td[3]")
    private WebElement accountDetailsPageFormEmailAddress;
    @FindBy(xpath = "//table[@class='data-table']/tbody/tr[2]/td[1]")
    private WebElement accountDetailsPageFormOldPasswordSubtext;
    @FindBy(xpath = "//table[@class='data-table']/tbody/tr[2]//input")
    private WebElement accountDetailsPageFormOldPasswordInputField;
    @FindBy(xpath = "//table[@class='data-table']/tbody/tr[3]/td[1]")
    private WebElement accountDetailsPageFormNewPasswordSubtext;
    @FindBy(xpath = "//table[@class='data-table']/tbody/tr[3]//input")
    private WebElement accountDetailsPageFormNewPasswordInputField;
    @FindBy(xpath = "//table[@class='data-table']/tbody/tr[4]/td[1]")
    private WebElement accountDetailsPageFormConfirmPasswordSubtext;
    @FindBy(xpath = "//table[@class='data-table']/tbody/tr[4]//input")
    private WebElement accountDetailsPageFormConfirmPasswordInputField;
    @FindBy(xpath = "//table[@class='data-table']/tbody/tr[5]//button")
    private WebElement accountDetailsPageFormSubmitButton;

    public AccountDetailsPage(WebDriver driver) {super(driver);}



    //account details page text element getters
    public String getAccountDetailsPageTitle() {return accountDetailsPageTitle.getText();}
    public String getAccountDetailsPageDescription() {return accountDetailsPageDescription.getText();}
    public String getAccountDetailsPagePersonalInfoSectionTitle() {return accountDetailsPagePersonalInfoSectionTitle.getText();}
    public String getAccountDetailsPageFirstNameSubtext() {return accountDetailsPageFirstNameSubtext.getText();}
    public String getAccountDetailsPageLastNameSubtext() {return accountDetailsPageLastNameSubtext.getText();}
    public String getAccountDetailsPageCompanySubtext() {return accountDetailsPageCompanySubtext.getText();}
    public String getAccountDetailsPageWebsiteSubtext() {return accountDetailsPageWebsiteSubtext.getText();}
    public String getAccountDetailsPageTaxNumberSubtext() {return accountDetailsPageTaxNumberSubtext.getText();}
    public String getAccountDetailsPageAccountInfoSectionTitle() {return accountDetailsPageAccountInfoSectionTitle.getText();}
    public String getAccountDetailsPageEmailSubtext() {return accountDetailsPageEmailSubtext.getText();}
    public String getAccountDetailsPagePasswordSubtext() {return accountDetailsPagePasswordSubtext.getText();}
    public String getAccountDetailsPageNewsletterSectionTitle() {return accountDetailsPageNewsletterSectionTitle.getText();}
    public String getAccountDetailsPageNewsletterSubtext() {return accountDetailsPageNewsletterSubtext.getText();}
    public String getAccountDetailsPageExclusiveOffersSubtext() {return accountDetailsPageExclusiveOffersSubtext.getText();}
    public String getAccountDetailsPageExclusiveOffersDescription() {return accountDetailsPageExclusiveOffersDescription.getText();}
    public String getAccountDetailsPageSiteUpdatesSubtext() {return accountDetailsPageSiteUpdatesSubtext.getText();}
    public String getAccountDetailsPageSiteUpdatesDescription() {return accountDetailsPageSiteUpdatesDescription.getText();}

    //change password form text element getters
    public String getAccountDetailsPageChangePasswordFormSectionTitle() {return accountDetailsPageChangePasswordSectionTitle.getText();}
    public String getAccountDetailsPageChangePasswordFormEmailSubtext() {return accountDetailsPageFormEmailSubtext.getText();}
    public String getAccountDetailsPageChangePasswordFormEmailAddress() {return accountDetailsPageFormEmailAddress.getText();}
    public String getAccountDetailsPageChangePasswordFormOldPasswordSubtext() {return accountDetailsPageFormOldPasswordSubtext.getText();}
    public String getAccountDetailsPageChangePasswordFormNewPasswordSubtext() {return accountDetailsPageFormNewPasswordSubtext.getText();}
    public String getAccountDetailsPageChangePasswordFormConfirmPasswordSubtext() {return accountDetailsPageFormConfirmPasswordSubtext.getText();}

    //account details page web element assert methods
    public boolean isAccountDetailsPageTitleDisplayed() {return accountDetailsPageTitle.isDisplayed();}
    public boolean isAccountDetailsPageDescriptionDisplayed() {return accountDetailsPageDescription.isDisplayed();}
    //personal info
    public boolean isAccountDetailsPagePersonalInfoSectionTitleDisplayed() {return accountDetailsPagePersonalInfoSectionTitle.isDisplayed();}
    public boolean isAccountDetailsPageFirstNameSubtextDisplayed() {return accountDetailsPageFirstNameSubtext.isDisplayed();}
    public boolean isAccountDetailsPageFirstNameInputFieldDisplayed() {return accountDetailsPageFirstNameInputField.isDisplayed();}
    public boolean isAccountDetailsPageLastNameSubtextDisplayed() {return accountDetailsPageLastNameSubtext.isDisplayed();}
    public boolean isAccountDetailsPageLastNameInputFieldDisplayed() {return accountDetailsPageLastNameInputField.isDisplayed();}
    public boolean isAccountDetailsPageCompanySubtextDisplayed() {return accountDetailsPageCompanySubtext.isDisplayed();}
    public boolean isAccountDetailsPageCompanyInputFieldDisplayed() {return accountDetailsPageCompanyInputField.isDisplayed();}
    public boolean isAccountDetailsPageWebsiteSubtextDisplayed() {return accountDetailsPageWebsiteSubtext.isDisplayed();}
    public boolean isAccountDetailsPageWebsiteInputFieldDisplayed() {return accountDetailsPageWebsiteInputField.isDisplayed();}
    public boolean isAccountDetailsPageTaxNumberSubtextDisplayed() {return accountDetailsPageTaxNumberSubtext.isDisplayed();}
    public boolean isAccountDetailsPageTaxNumberInputFieldDisplayed() {return accountDetailsPageTaxNumberInputField.isDisplayed();}
    //account information
    public boolean isAccountDetailsPageAccountInfoSectionTitleDisplayed() {return accountDetailsPageAccountInfoSectionTitle.isDisplayed();}
    public boolean isAccountDetailsPageEmailSubtextDisplayed() {return accountDetailsPageEmailSubtext.isDisplayed();}
    public boolean isAccountDetailsPageEmailInputFieldDisplayed() {return accountDetailsPageEmailInputField.isDisplayed();}
    public boolean isAccountDetailsPagePasswordSubtextDisplayed() {return accountDetailsPagePasswordSubtext.isDisplayed();}
    public boolean isAccountDetailsPageChangePasswordFormLinkDisplayed() {return accountDetailsPageChangePasswordFormLink.isDisplayed();}
    //newsletter section
    public boolean isAccountDetailsPageNewsletterSectionTitleDisplayed() {return accountDetailsPageNewsletterSectionTitle.isDisplayed();}
    public boolean isAccountDetailsPageNewsletterSubtextDisplayed() {return accountDetailsPageNewsletterSubtext.isDisplayed();}
    public boolean isAccountDetailsPageExclusiveOffersCheckboxDisplayed() {return accountDetailsPageExclusiveOffersCheckbox.isDisplayed();}
    public boolean isAccountDetailsPageExclusiveOffersSubtextDisplayed() {return accountDetailsPageExclusiveOffersSubtext.isDisplayed();}
    public boolean isAccountDetailsPageExclusiveOffersDescriptionDisplayed() {return accountDetailsPageExclusiveOffersDescription.isDisplayed();}
    public boolean isAccountDetailsPageSiteUpdatesCheckboxDisplayed() {return accountDetailsPageSiteUpdatesCheckbox.isDisplayed();}
    public boolean isAccountDetailsPageSiteUpdatesSubtextDisplayed() {return accountDetailsPageSiteUpdatesSubtext.isDisplayed();}
    public boolean isAccountDetailsPageSiteUpdatesDescriptionDisplayed() {return accountDetailsPageSiteUpdatesDescription.isDisplayed();}
    public boolean isAccountDetailsPageDeleteAccountLinkDisplayed() {return accountDetailsPageDeleteAccountLink.isDisplayed();}
    public boolean isAccountDetailsPageSubmitButtonDisplayed() {return accountDetailsPageSubmitButton.isDisplayed();}
    //change password form
    public boolean isAccountDetailsPageChangePasswordSectionTitleDisplayed() {return accountDetailsPageChangePasswordSectionTitle.isDisplayed();}
    public boolean isAccountDetailsPageFormEmailSubtextDisplayed() {return accountDetailsPageFormEmailSubtext.isDisplayed();}
    public boolean isAccountDetailsPageFormEmailAddressDisplayed() {return accountDetailsPageFormEmailAddress.isDisplayed();}
    public boolean isAccountDetailsPageOldPasswordSubtextDisplayed() {return accountDetailsPageFormOldPasswordSubtext.isDisplayed();}
    public boolean isAccountDetailsPageOldPasswordInputFieldDisplayed() {return accountDetailsPageFormOldPasswordInputField.isDisplayed();}
    public boolean isAccountDetailsPageNewPasswordSubtextDisplayed() {return accountDetailsPageFormNewPasswordSubtext.isDisplayed();}
    public boolean isAccountDetailsPageNewPasswordInputFieldDisplayed() {return accountDetailsPageFormNewPasswordInputField.isDisplayed();}
    public boolean isAccountDetailsPageConfirmPasswordSubtextDisplayed() {return accountDetailsPageFormConfirmPasswordSubtext.isDisplayed();}
    public boolean isAccountDetailsPageConfirmPasswordInputFieldDisplayed() {return accountDetailsPageFormConfirmPasswordInputField.isDisplayed();}
    public boolean isAccountDetailsPageFormSubmitButtonDisplayed() {return accountDetailsPageFormSubmitButton.isDisplayed();}

}
