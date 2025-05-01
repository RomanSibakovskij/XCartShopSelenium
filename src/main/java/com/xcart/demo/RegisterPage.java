package com.xcart.demo;

import com.xcart.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;

public class RegisterPage extends BasePage{

    //register page web elements
    @FindBy(xpath = "//div[@id='center-main']/h1")
    private WebElement registerPageTitle;
    @FindBy(xpath = "//p[@class='register-note']")
    private WebElement registerPageDescription;
    //personal information section
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[1]/td")
    private WebElement registerPagePersonalInfoSectionTitle;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[2]/td[1]")
    private WebElement registerPageFirstNameSubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[2]//input")
    private WebElement registerPageFirstNameInputField;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[3]/td[1]")
    private WebElement registerPageLastNameSubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[3]//input")
    private WebElement registerPageLastNameInputField;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[4]/td[1]")
    private WebElement registerPageCompanySubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[4]//input")
    private WebElement registerPageCompanyInputField;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[5]/td[1]")
    private WebElement registerPageWebsiteSubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[5]//input")
    private WebElement registerPageWebsiteInputField;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[6]/td[1]")
    private WebElement registerPageTaxNumberSubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[6]//input")
    private WebElement registerPageTaxNumberInputField;
    //account information
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[7]/td[1]")
    private WebElement registerPageAccountInfoSectionTitle;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[8]/td[1]")
    private WebElement registerPageEmailSubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[8]//input")
    private WebElement registerPageEmailInputField;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[10]/td[1]")
    private WebElement registerPagePasswordSubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[10]//input[@id='passwd1']")
    private WebElement registerPagePasswordInputField;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[11]/td[1]")
    private WebElement registerPageConfirmPasswordSubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[11]//input[@id='passwd2']")
    private WebElement registerPageConfirmPasswordInputField;
    //newsletter section
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[12]/td[1]")
    private WebElement registerPageNewsletterSectionTitle;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[13]/td[1]")
    private WebElement registerPageNewsletterDescription;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[14]//input[@name='subscription[2]']")
    private WebElement registerPageExclusiveSpecialOffersCheckbox;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[14]//div[1]/label")
    private WebElement registerPageExclusiveSpecialSubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[14]//div[1]/span")
    private WebElement registerPageExclusiveSpecialDescription;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[14]//input[@name='subscription[1]']")
    private WebElement registerPageSiteUpdatesCheckbox;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[14]//div[2]/label")
    private WebElement registerPageSiteUpdatesSubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[14]//div[2]/span")
    private WebElement registerPageSiteUpdatesDescription;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[15]/td[2]//input")
    private WebElement registerPageAcceptTermsCheckbox;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[15]/td[2]//label")
    private WebElement registerPageAcceptTermsSubtext;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[15]/td[2]//a[1]")
    private WebElement registerPageTermsConditionsLink;
    @FindBy(xpath = "//table[@class='data-table register-table']/tbody/tr[15]/td[2]//a[2]")
    private WebElement registerPagePrivacyLink;
    @FindBy(xpath = "//button[@class='button main-button']")
    private WebElement registerPageSubmitButton;
    @FindBy(xpath = "//div[@class='content']/text()[normalize-space()]")
    private WebElement registerPageConfidentialInfoText;

    //valid register user data input
    private static String validFirstName;
    private static String validLastName;
    private static String validEmail;
    private static String validPassword;
    private String validConfirmPassword;

    public RegisterPage(WebDriver driver) {super(driver);}

    //valid register user data getter
    public void validUserRegisterDataGetter(){
        System.out.println("Valid generated user register input data: " + "\n");

        validFirstName = TestDataGenerator.getRandomFirstName();
        validLastName = TestDataGenerator.getRandomLastName();
        validEmail = TestDataGenerator.generateRandomEmailAddress(8);
        validPassword = TestDataGenerator.generateRandomPassword();
        validConfirmPassword = validPassword;

        logger.info("Valid generated user first name: " + validFirstName);
        logger.info("Valid generated user last name: " + validLastName);
        logger.info("Valid generated user email: " + validEmail);
        logger.info("Valid generated user password: " + validPassword);
        logger.info("Valid generated user matching confirm password: " + validConfirmPassword);

        System.out.println("\n");
    }

    //valid register user data input methods
    public void inputValidFirstNameIntoFirstNameInputField(){registerPageFirstNameInputField.sendKeys(validFirstName);}
    public void inputValidLastNameIntoLastNameInputField(){registerPageLastNameInputField.sendKeys(validLastName);}
    public void inputValidEmailIntoEmailInputField(){registerPageEmailInputField.sendKeys(validEmail);}
    public void inputValidPasswordIntoPasswordInputField(){registerPagePasswordInputField.sendKeys(validPassword);}
    public void inputValidConfirmPasswordIntoConfirmPasswordInputField(){registerPageConfirmPasswordInputField.sendKeys(validConfirmPassword);}

    //click 'Accept terms' checkbox method
    public void clickAcceptTermsCheckbox(){
        Actions action = new Actions(driver);
        action.moveToElement(registerPageAcceptTermsCheckbox).click().perform();
    }

    //click 'Submit' button method
    public void clickSubmitButton(){
        Actions action = new Actions(driver);
        action.moveToElement(registerPageSubmitButton).click().perform();
    }

    //private data getters
    public String getValidFirstName(){return validFirstName;}
    public String getValidLastName(){return validLastName;}
    public String getValidEmail(){return validEmail;}
    public String getValidPassword(){return validPassword;}

    //register page text element getters
    public String getRegisterPageTitle() {return registerPageTitle.getText();}
    public String getRegisterPageDescription() {return registerPageDescription.getText();}
    public String getRegisterPagePersonalInfoSectionTitle() {return registerPagePersonalInfoSectionTitle.getText();}
    public String getRegisterPageFirstNameSubtext() {return registerPageFirstNameSubtext.getText();}
    public String getRegisterPageLastNameSubtext() {return registerPageLastNameSubtext.getText();}
    public String getRegisterPageCompanySubtext() {return registerPageCompanySubtext.getText();}
    public String getRegisterPageWebsiteSubtext() {return registerPageWebsiteSubtext.getText();}
    public String getRegisterPageTaxNumberSubtext() {return registerPageTaxNumberSubtext.getText();}
    public String getRegisterPageAccountInfoSectionTitle() {return registerPageAccountInfoSectionTitle.getText();}
    public String getRegisterPageEmailSubtext() {return registerPageEmailSubtext.getText();}
    public String getRegisterPagePasswordSubtext() {return registerPagePasswordSubtext.getText();}
    public String getRegisterPageConfirmPasswordSubtext() {return registerPageConfirmPasswordSubtext.getText();}
    public String getRegisterPageNewsletterSectionTitle() {return registerPageNewsletterSectionTitle.getText();}
    public String getRegisterPageNewsletterDescription() {return registerPageNewsletterDescription.getText();}
    public String getRegisterPageExclusiveSpecialSubtext() {return registerPageExclusiveSpecialSubtext.getText();}
    public String getRegisterPageExclusiveSpecialDescription() {return registerPageExclusiveSpecialDescription.getText();}
    public String getRegisterPageSiteUpdatesSubtext() {return registerPageSiteUpdatesSubtext.getText();}
    public String getRegisterPageSiteUpdatesDescription() {return registerPageSiteUpdatesDescription.getText();}
    public String getRegisterPageAcceptTermsSubtext() {return registerPageAcceptTermsSubtext.getText();}
    public String getRegisterPageConfidentialInfoText() {return registerPageConfidentialInfoText.getText();}

    //register page web element assert methods
    public boolean isRegisterPageTitleDisplayed() {return registerPageTitle.isDisplayed();}
    public boolean isRegisterPageDescriptionDisplayed() {return registerPageDescription.isDisplayed();}
    //personal info
    public boolean isRegisterPagePersonalInfoSectionTitleDisplayed() {return registerPagePersonalInfoSectionTitle.isDisplayed();}
    public boolean isRegisterPageFirstNameSubtextDisplayed() {return registerPageFirstNameSubtext.isDisplayed();}
    public boolean isRegisterPageFirstNameInputFieldDisplayed() {return registerPageFirstNameInputField.isDisplayed();}
    public boolean isRegisterPageLastNameSubtextDisplayed() {return registerPageLastNameSubtext.isDisplayed();}
    public boolean isRegisterPageLastNameInputFieldDisplayed() {return registerPageLastNameInputField.isDisplayed();}
    public boolean isRegisterPageCompanySubtextDisplayed() {return registerPageCompanySubtext.isDisplayed();}
    public boolean isRegisterPageCompanyInputFieldDisplayed() {return registerPageCompanyInputField.isDisplayed();}
    public boolean isRegisterPageWebsiteSubtextDisplayed() {return registerPageWebsiteSubtext.isDisplayed();}
    public boolean isRegisterPageWebsiteInputFieldDisplayed() {return registerPageWebsiteInputField.isDisplayed();}
    public boolean isRegisterPageTaxNumberSubtextDisplayed() {return registerPageTaxNumberSubtext.isDisplayed();}
    public boolean isRegisterPageTaxNumberInputFieldDisplayed() {return registerPageTaxNumberInputField.isDisplayed();}
    //account information
    public boolean isRegisterPageAccountInfoSectionTitleDisplayed() {return registerPageAccountInfoSectionTitle.isDisplayed();}
    public boolean isRegisterPageEmailSubtextDisplayed() {return registerPageEmailSubtext.isDisplayed();}
    public boolean isRegisterPageEmailInputFieldDisplayed() {return registerPageEmailInputField.isDisplayed();}
    public boolean isRegisterPagePasswordSubtextDisplayed() {return registerPagePasswordSubtext.isDisplayed();}
    public boolean isRegisterPagePasswordInputFieldDisplayed() {return registerPagePasswordInputField.isDisplayed();}
    public boolean isRegisterPageConfirmPasswordSubtextDisplayed() {return registerPageConfirmPasswordSubtext.isDisplayed();}
    public boolean isRegisterPageConfirmPasswordInputFieldDisplayed() {return registerPageConfirmPasswordInputField.isDisplayed();}
    //newsletter section
    public boolean isRegisterPageNewsletterSectionTitleDisplayed() {return registerPageNewsletterSectionTitle.isDisplayed();}
    public boolean isRegisterPageNewsletterDescriptionDisplayed() {return registerPageNewsletterDescription.isDisplayed();}
    public boolean isRegisterPageExclusiveSpecialOffersCheckboxDisplayed() {return registerPageExclusiveSpecialOffersCheckbox.isDisplayed();}
    public boolean isRegisterPageExclusiveSpecialSubtextDisplayed() {return registerPageExclusiveSpecialSubtext.isDisplayed();}
    public boolean isRegisterPageExclusiveSpecialDescriptionDisplayed() {return registerPageExclusiveSpecialDescription.isDisplayed();}
    public boolean isRegisterPageSiteUpdatesCheckboxDisplayed() {return registerPageSiteUpdatesCheckbox.isDisplayed();}
    public boolean isRegisterPageSiteUpdatesSubtextDisplayed() {return registerPageSiteUpdatesSubtext.isDisplayed();}
    public boolean isRegisterPageSiteUpdatesDescriptionDisplayed() {return registerPageSiteUpdatesDescription.isDisplayed();}
    public boolean isRegisterPageAcceptTermsCheckboxDisplayed() {return registerPageAcceptTermsCheckbox.isDisplayed();}
    public boolean isRegisterPageAcceptTermsSubtextDisplayed() {return registerPageAcceptTermsSubtext.isDisplayed();}
    public boolean isRegisterPageAcceptTermsConditionsLinkDisplayed() {return registerPageTermsConditionsLink.isDisplayed();}
    public boolean isRegisterPagePrivacyLinkDisplayed() {return registerPagePrivacyLink.isDisplayed();}
    public boolean isRegisterPageSubmitButtonDisplayed() {return registerPageSubmitButton.isDisplayed();}
    public boolean isRegisterPageConfidentialInfoTextDisplayed() {return registerPageConfidentialInfoText.isDisplayed();}

}
