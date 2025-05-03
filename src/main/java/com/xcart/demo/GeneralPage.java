package com.xcart.demo;

import com.xcart.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.util.*;
import java.time.Duration;

public class GeneralPage extends BasePage {

    //general page web elements
    //header (switcher)
    @FindBy(xpath = "//div[@class='demo-box']//img")
    private WebElement headerSwitcherIcon;
    @FindBy(xpath = "//div[@class='demo-box']/div[2]/span")
    private WebElement headerInterfaceTag;
    @FindBy(xpath = "//div[@class='demo-box']/div[2]/select")
    private WebElement headerInterfaceDropdownMenu;
    @FindBy(xpath = "//div[@class='demo-box']/div[3]/span")
    private WebElement headerVisualSchemeTag;
    @FindBy(xpath = "//div[@class='demo-box']/div[3]/select")
    private WebElement headerVisualSchemeDropdownMenu;
    @FindBy(xpath = "//div[@class='demo-box']/div[4]/span")
    private WebElement headerConfigurationTag;
    @FindBy(xpath = "//div[@class='demo-box']/div[4]/select")
    private WebElement headerConfigurationDropdownMenu;
    @FindBy(xpath = "//div[@class='demo-box']/div[5]/span")
    private WebElement headerQuickAddonsPanelTag;
    @FindBy(xpath = "//div[@class='demo-box']/div[5]/a")
    private WebElement headerQuickAddonsPanelSlideButton;
    @FindBy(xpath = "//div[@class='demo-button']/a")
    private WebElement headerSwitcherDownloadButton;
    //header
    @FindBy(xpath = "//div[@id='header']//div[@class='logo']/a")
    private WebElement headerHomepageLogo;
    @FindBy(xpath = "//div[@class='header-links']/a[1]")
    private WebElement headerSignInLink;
    @FindBy(xpath = "//div[@class='header-links']/a[2]")
    private WebElement headerRegisterLink;
    @FindBy(xpath = "//div[@class='languages languages-flags']/ul")
    private WebElement headerLanguageDropdownMenu;
    @FindBy(xpath = "//div[@class='search']//input[@name='posted_data[substring]']")
    private WebElement headerSearchBarInputField;
    @FindBy(xpath = "//div[@class='search']//button[@class='search-button']")
    private WebElement headerSearchBarButton;
    @FindBy(xpath = "//div[@class='menu-dialog menu-minicart']")
    private WebElement headerShoppingCartDropdownButton;
    //navbar
    @FindBy(xpath = "//div[@class='navbar']/ul/li[1]/a")
    private WebElement navbarHomeLink;
    @FindBy(xpath = "//div[@class='navbar']/ul/li[2]/a")
    private WebElement navbarShoppingCartLink;
    @FindBy(xpath = "//div[@class='navbar']/ul/li[3]/a")
    private WebElement navbarContactUsLink;
    //aside elements (not all pages have them)
    //categories
    @FindBy(xpath = "//div[@class='menu-dialog menu-fancy-categories-list']//h2")
    private WebElement asideCategoriesSectionTitle;
    @FindBy(xpath = "//div[@id='catrootmenu']/ul/li[1]/a") //for register page //div[@id='catrootmenu']/div/ul/li[1]/a (added div element)
    private WebElement asideFeaturesDemoLink;
    @FindBy(xpath = "//div[@id='catrootmenu']/ul/li[2]/a")
    private WebElement asideApparelLink;
    @FindBy(xpath = "//div[@id='catrootmenu']/ul/li[3]/a")
    private WebElement asideToysLink;
    @FindBy(xpath = "//div[@id='catrootmenu']/ul/li[4]/a")
    private WebElement asideIGoodsLink;
    @FindBy(xpath = "//div[@id='catrootmenu']/ul/li[5]/a")
    private WebElement asideBooksLink;
    @FindBy(xpath = "//div[@id='catrootmenu']/ul/li[6]/a")
    private WebElement asideComputerHardwareLink;
    //other pages have included div between the id'ed div and ul (locator differences)
    @FindBy(xpath = "//div[@id='catrootmenu']/div/ul/li[1]/a") //for register page //div[@id='catrootmenu']/div/ul/li[1]/a (added div element)
    private WebElement asideOtherFeaturesDemoLink;
    @FindBy(xpath = "//div[@id='catrootmenu']/div/ul/li[2]/a")
    private WebElement asideOtherApparelLink;
    @FindBy(xpath = "//div[@id='catrootmenu']/div/ul/li[3]/a")
    private WebElement asideOtherToysLink;
    @FindBy(xpath = "//div[@id='catrootmenu']/div/ul/li[4]/a")
    private WebElement asideOtherIGoodsLink;
    @FindBy(xpath = "//div[@id='catrootmenu']/div/ul/li[5]/a")
    private WebElement asideOtherBooksLink;
    @FindBy(xpath = "//div[@id='catrootmenu']/div/ul/li[6]/a")
    private WebElement asideOtherComputerHardwareLink;
    //bestsellers (not all pages have them)
    @FindBy(xpath = "//div[@class='menu-dialog menu-products menu-products-thumbnails menu-bestsellers']//h2")
    private WebElement asideBestsellersSectionTitle;
    //list elements
    @FindBy(xpath = "//div[@class='menu-dialog menu-products menu-products-thumbnails menu-bestsellers']//img")
    private List<WebElement> asideBestProductImageElements;
    @FindBy(xpath = "//div[@class='menu-dialog menu-products menu-products-thumbnails menu-bestsellers']//a[@class='product-title']")
    private List<WebElement> asideBestProductNameLinkElements;
    @FindBy(xpath = "//div[@class='menu-dialog menu-products menu-products-thumbnails menu-bestsellers']//span[@class='price-value']")
    private List<WebElement> asideBestProductUnitPriceElements;
    //manufacturers
    @FindBy(xpath = "//div[@class='menu-dialog menu-manufacturers']//h2")
    private WebElement asideManufacturersSectionTitle;
    //list elements
    @FindBy(xpath = "//div[@class='menu-dialog menu-manufacturers']//a")
    private List<WebElement> asideManufacturerLinkElements;
    //gift certificate
    @FindBy(xpath = "//div[@class='gift-certificate']/a")
    private WebElement asideGiftCertificateButton;
    //special
    @FindBy(xpath = "//div[@class='menu-dialog menu-special']//h2")
    private WebElement asideSpecialSectionTitle;
    @FindBy(xpath = "//div[@class='menu-dialog menu-special']//ul/li[1]/a")
    private WebElement asideSpecialSitemapLink;
    @FindBy(xpath = "//div[@class='menu-dialog menu-special']//ul/li[2]/a")
    private WebElement asideSpecialProductsMapLink;
    //news
    @FindBy(xpath = "//div[@class='menu-dialog menu-news']//h2")
    private WebElement asideNewsSectionTitle;
    @FindBy(xpath = "//div[@class='news']")
    private WebElement asideNewsArticleData;
    @FindBy(xpath = "//div[@class='news']/a[1]")
    private WebElement asideAllNewsLink;
    @FindBy(xpath = "//div[@class='news']/a[2]")
    private WebElement asideSubscribeLink;
    //footer
    @FindBy(xpath = "//div[@class='footer-links']//a[1]")
    private WebElement footerHelpZoneLink;
    @FindBy(xpath = "//div[@class='footer-links']//a[2]")
    private WebElement footerContactUsLink;
    @FindBy(xpath = "//div[@class='footer-links']//a[3]")
    private WebElement footerOurSiteLink;
    @FindBy(xpath = "//div[@class='footer-links']//a[4]")
    private WebElement footerTermsConditionsLink;
    @FindBy(xpath = "//div[@class='footer-links']//a[5]")
    private WebElement footerPrivacyLink;
    @FindBy(xpath = "//div[@class='footer-links']//a[6]")
    private WebElement footerPrivacyStatementLink;
    @FindBy(xpath = "//div[@class='prnotice']")
    private WebElement footerPoweredByText;
    @FindBy(xpath = "//div[@class='prnotice']/a")
    private WebElement footerShoppingCartSoftwareLink;
    @FindBy(xpath = "//div[@class='copyright']")
    private WebElement footerCopyrightText;
    @FindBy(xpath = "//ul[@class='soc-footer-links']/li[1]/a")
    private WebElement footerFacebookIconButton;
    @FindBy(xpath = "//ul[@class='soc-footer-links']/li[2]/a")
    private WebElement footerXIconButton;

    public GeneralPage(WebDriver driver) {super(driver);}

    //click header 'Sign in' link method
    public void clickHeaderSignInLink(){ headerSignInLink.click();}

    //click header 'Register' link method
    public void clickHeaderRegisterLink(){ headerRegisterLink.click();}

    //click header 'Sign out' link method (same element as 'Register')
    public void clickHeaderSignOutLink(){headerRegisterLink.click();}

    //click navbar 'Home' link method
    public void clickNavbarHomeLink(){navbarHomeLink.click();}

    //input search query into header search bar methods
    public void inputAMDProductSearchQueryIntoSearchBar(){headerSearchBarInputField.sendKeys("AMD A10-5800K");}
    public void inputRCForkliftProductSearchQueryIntoSearchBar(){headerSearchBarInputField.sendKeys("R/C Desktop Forklift");}

    //click 'Search' button method
    public void clickSearchBarButton(){headerSearchBarButton.click();}

    //general page text element getters
    public String getHeaderInterfaceTag(){return headerInterfaceTag.getText();}
    public String getHeaderVisualSchemeTag(){return headerVisualSchemeTag.getText();}
    public String getHeaderConfigurationTag(){return headerConfigurationTag.getText();}
    public String getHeaderQuickAddonsPanelTag(){return headerQuickAddonsPanelTag.getText();}
    public String getAsideCategoriesSectionTitle(){return asideCategoriesSectionTitle.getText();}
    public String getAsideBestsellersSectionTitle(){return asideBestsellersSectionTitle.getText();}
    public String getAsideManufacturersSectionTitle(){return asideManufacturersSectionTitle.getText();}
    public String getAsideSpecialSectionTitle(){return asideSpecialSectionTitle.getText();}
    public String getFooterPoweredByText(){return footerPoweredByText.getText();}
    public String getFooterCopyrightText(){return footerCopyrightText.getText();}

    //element wait load method (so that Selenium would stop skipping test methods during run)
    public void waitForElementsToLoad() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));

        // Wait for the document to be fully loaded
        wait.until(driver -> ((JavascriptExecutor) driver)
                .executeScript("return document.readyState").equals("complete"));

        // Wait for at least one visible element to be present
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body *:not(script):not(style)")));
    }

    //general page web element assert methods
    //header (switcher)
    public boolean isHeaderSwitcherIconDisplayed() {return headerSwitcherIcon.isDisplayed();}
    public boolean isHeaderInterfaceTagDisplayed() {return headerInterfaceTag.isDisplayed();}
    public boolean isHeaderInterfaceDropdownMenuDisplayed() {return headerInterfaceDropdownMenu.isDisplayed();}
    public boolean isHeaderVisualSchemeTagDisplayed() {return headerVisualSchemeTag.isDisplayed();}
    public boolean isHeaderVisualSchemeDropdownMenuDisplayed() {return headerVisualSchemeDropdownMenu.isDisplayed();}
    public boolean isHeaderConfigurationTagDisplayed() {return headerConfigurationTag.isDisplayed();}
    public boolean isHeaderConfigurationDropdownMenuDisplayed() {return headerConfigurationDropdownMenu.isDisplayed();}
    public boolean isHeaderQuickAddonsPanelTagDisplayed() {return headerQuickAddonsPanelTag.isDisplayed();}
    public boolean isHeaderAddonsPanelSlideButtonDisplayed() {return headerQuickAddonsPanelSlideButton.isDisplayed();}
    public boolean isHeaderSwitcherDownloadButtonDisplayed() {return headerSwitcherDownloadButton.isDisplayed();}
    //header
    public boolean isHeaderHomepageLogoDisplayed() {return headerHomepageLogo.isDisplayed();}
    public boolean isHeaderSignInLinkDisplayed() {return headerSignInLink.isDisplayed();}
    public boolean isHeaderRegisterLinkDisplayed() {return headerRegisterLink.isDisplayed();}
    public boolean isHeaderLanguageDropdownMenuDisplayed() {return headerLanguageDropdownMenu.isDisplayed();}
    public boolean isHeaderSearchBarInputFieldDisplayed() {return headerSearchBarInputField.isDisplayed();}
    public boolean isHeaderSearchBarButtonDisplayed() {return headerSearchBarButton.isDisplayed();}
    public boolean isHeaderShoppingCartDropdownButtonDisplayed() {return headerShoppingCartDropdownButton.isDisplayed();}
    //navbar
    public boolean isNavbarHomeLinkDisplayed() {return navbarHomeLink.isDisplayed();}
    public boolean isNavbarShoppingCartLinkDisplayed() {return navbarShoppingCartLink.isDisplayed();}
    public boolean isNavbarContactUsLinkDisplayed() {return navbarContactUsLink.isDisplayed();}
    //aside
    //categories
    public boolean isAsideCategoriesSectionTitleDisplayed() {return asideCategoriesSectionTitle.isDisplayed();}
    public boolean isAsideFeaturesDemoLinkDisplayed() {return asideFeaturesDemoLink.isDisplayed();}
    public boolean isAsideApparelLinkDisplayed() {return asideApparelLink.isDisplayed();}
    public boolean isAsideToysLinkDisplayed() {return asideToysLink.isDisplayed();}
    public boolean isAsideIGoodsLinkDisplayed() {return asideIGoodsLink.isDisplayed();}
    public boolean isAsideBooksLinkDisplayed() {return asideBooksLink.isDisplayed();}
    public boolean isAsideComputerHardwareLinkDisplayed() {return asideComputerHardwareLink.isDisplayed();}
    //manufacturers category
    public boolean isAsideManufacturersSectionTitleDisplayed() {return asideManufacturersSectionTitle.isDisplayed();}
    //gift certificate
    public boolean isAsideGiftCertificateButtonDisplayed() {return asideGiftCertificateButton.isDisplayed();}
    //special
    public boolean isAsideSpecialSectionTitleDisplayed() {return asideSpecialSectionTitle.isDisplayed();}
    public boolean isAsideSpecialSitemapLinkDisplayed() {return asideSpecialSitemapLink.isDisplayed();}
    public boolean isAsideSpecialProductsMapLinkDisplayed() {return asideSpecialProductsMapLink.isDisplayed();}
    //news
    public boolean isAsideNewsSectionTitleDisplayed() {return asideNewsSectionTitle.isDisplayed();}
    public boolean isAsideNewsArticleDataDisplayed() {return asideNewsArticleData.isDisplayed();}
    public boolean isAsideAllNewsLinkDisplayed() {return asideAllNewsLink.isDisplayed();}
    public boolean isAsideSubscribeLinkDisplayed() {return asideSubscribeLink.isDisplayed();}
    //footer
    public boolean isFooterHelpZoneLinkDisplayed() {return footerHelpZoneLink.isDisplayed();}
    public boolean isFooterContactUsLinkDisplayed() {return footerContactUsLink.isDisplayed();}
    public boolean isFooterOurSiteLinkDisplayed() {return footerOurSiteLink.isDisplayed();}
    public boolean isFooterTermsConditionsLinkDisplayed() {return footerTermsConditionsLink.isDisplayed();}
    public boolean isFooterPrivacyLinkDisplayed() {return footerPrivacyLink.isDisplayed();}
    public boolean isFooterPrivacyStatementLinkDisplayed() {return footerPrivacyStatementLink.isDisplayed();}
    public boolean isFooterPoweredByTextDisplayed() {return footerPoweredByText.isDisplayed();}
    public boolean isFooterShoppingCartSoftwareLinkDisplayed() {return footerShoppingCartSoftwareLink.isDisplayed();}
    public boolean isFooterCopyrightTextDisplayed() {return footerCopyrightText.isDisplayed();}
    public boolean isFooterFacebookIconButtonDisplayed() {return footerFacebookIconButton.isDisplayed();}
    public boolean isFooterXIconButtonDisplayed() {return footerXIconButton.isDisplayed();}
    //bestsellers section
    public boolean isAsideBestsellersSectionTitleDisplayed() {return asideBestsellersSectionTitle.isDisplayed();}
    //list elements
    public boolean isAsideBestProductImageDisplayed() {
        return asideBestProductImageElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAsideBestProductNameLinkDisplayed() {
        return asideBestProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAsideBestProductUnitPriceDisplayed() {
        return asideBestProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAsideManufacturersLinkDisplayed() {
        return asideManufacturerLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //these elements have different locators (added div element)
    public boolean isOtherAsideFeaturesDemoLinkDisplayed() {return asideOtherFeaturesDemoLink.isDisplayed();}
    public boolean isOtherAsideApparelLinkDisplayed() {return asideOtherApparelLink.isDisplayed();}
    public boolean isOtherAsideToysLinkDisplayed() {return asideOtherToysLink.isDisplayed();}
    public boolean isOtherAsideIGoodsLinkDisplayed() {return asideOtherIGoodsLink.isDisplayed();}
    public boolean isOtherAsideBooksLinkDisplayed() {return asideOtherBooksLink.isDisplayed();}
    public boolean isOtherAsideComputerHardwareLinkDisplayed() {return asideOtherComputerHardwareLink.isDisplayed();}

}

