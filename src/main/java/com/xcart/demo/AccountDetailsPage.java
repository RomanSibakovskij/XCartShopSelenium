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
    //removal confirmation elements
    @FindBy(xpath = "//h1")
    private WebElement accountDetailsPageRemovalTitle;
    @FindBy(xpath = "//p[@class='form-text text-block']")
    private WebElement accountDetailsPageConfirmRemovalQuestion;
    @FindBy(xpath = "//button[@class='button']")
    private WebElement accountDetailsPageRemovalYesButton;
    @FindBy(xpath = "//div[@class='buttons-row']/div[@class='button']/a")
    private WebElement accountDetailsPageRemovalNoButton;

    //valid edited user data
    private String validEditedFirstName;
    private String validEditedLastName;
    private static String validEditedEmail;
    private String oldPassword;
    private String newPassword;
    private String confirmNewPassword;

    public AccountDetailsPage(WebDriver driver) {super(driver);}

    //valid edited user input data getter
    public void validEditedUserDataGetter(RegisterPage registerPage) {

        validEditedFirstName = TestDataGenerator.getRandomEditedFirstName();
        validEditedLastName = TestDataGenerator.getRandomEditedLastName();
        validEditedEmail = TestDataGenerator.generateRandomEmailAddress(12);
        oldPassword = registerPage.getValidPassword();
        newPassword = TestDataGenerator.generateRandomPassword();
        confirmNewPassword = newPassword;

        System.out.println("Generated valid edited user input data: " + "\n");

        logger.info("Valid edited user first name: " + validEditedFirstName);
        logger.info("Valid edited user last name: " + validEditedLastName);
        logger.info("Valid edited user email: " + validEditedEmail);
        logger.info("Valid old user password: " + oldPassword);
        logger.info("Valid new password: " + newPassword);
        logger.info("Valid confirm matching new password: " + confirmNewPassword);

        System.out.println("\n");
    }

    //valid edited user account data input methods
    public void inputValidEditedFirstNameIntoFirstNameInputField(){
        accountDetailsPageFirstNameInputField.clear();
        accountDetailsPageFirstNameInputField.sendKeys(validEditedFirstName);
    }
    public void inputValidEditedLastNameIntoLastNameInputField(){
        accountDetailsPageLastNameInputField.clear();
        accountDetailsPageLastNameInputField.sendKeys(validEditedLastName);
    }
    public void inputValidEditedEmailIntoEmailInputField(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accountDetailsPageEmailInputField);
        accountDetailsPageEmailInputField.clear();
        accountDetailsPageEmailInputField.sendKeys(validEditedEmail);
    }

    //change password form
    public void inputValidOldPasswordIntoOldPasswordInputField(){
        accountDetailsPageFormOldPasswordInputField.clear();
        accountDetailsPageFormOldPasswordInputField.sendKeys(oldPassword);
    }
    public void inputValidNewPasswordIntoNewPasswordInputField(){
        accountDetailsPageFormNewPasswordInputField.clear();
        accountDetailsPageFormNewPasswordInputField.sendKeys(newPassword);
    }
    public void inputValidConfirmPasswordIntoConfirmPasswordInputField(){
        accountDetailsPageFormConfirmPasswordInputField.clear();
        accountDetailsPageFormConfirmPasswordInputField.sendKeys(confirmNewPassword);
    }

    //click 'Change password' link method
    public void clickChangePasswordLink(){accountDetailsPageChangePasswordFormLink.click();}

    //click 'Submit' button (change password form) method
    public void clickSubmitNewPasswordButton(){
        Actions action = new Actions(driver);
        action.moveToElement(accountDetailsPageFormSubmitButton).click().perform();
    }

    //click 'Submit' button
    public void clickSubmitButton(){
        Actions action = new Actions(driver);
        action.moveToElement(accountDetailsPageSubmitButton).click().perform();
    }

    //click 'Delete account' link method
    public void clickDeleteAccountLink(){accountDetailsPageDeleteAccountLink.click();}

    //click 'Yes' button (account removal) method
    public void clickYesButton(){
        Actions action = new Actions(driver);
        action.moveToElement(accountDetailsPageRemovalYesButton).click().perform();
    }

    //private data getter
    public String getValidEditedEmail(){return validEditedEmail;}

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

    //account removal section text element getters
    public String getAccountRemovalTitle(){return accountDetailsPageRemovalTitle.getText();}
    public String getAccountRemovalQuestion(){return accountDetailsPageConfirmRemovalQuestion.getText();}


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
