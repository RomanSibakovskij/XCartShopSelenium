package com.xcart.demo.utilities;

import com.xcart.demo.*;
import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.*;
import java.io.File;
import java.nio.file.*; //comment these out during browser run with screenshots

public class TestMethods extends BaseTest{

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page web element assert test method (aside section)
    protected void isGeneralPageAsideWebElementDisplayed(GeneralPage generalPage){
        //aside (categories)
        //assert aside categories section title is displayed
        assertTrue(generalPage.isAsideCategoriesSectionTitleDisplayed(), "The aside categories section title isn't displayed");
        //assert aside features demo link is displayed
        assertTrue(generalPage.isAsideFeaturesDemoLinkDisplayed(), "The aside features demo link isn't displayed");
        //assert aside apparel link is displayed
        assertTrue(generalPage.isAsideApparelLinkDisplayed(), "The aside apparel link isn't displayed");
        //assert aside toys link is displayed
        assertTrue(generalPage.isAsideToysLinkDisplayed(), "The aside toys link isn't displayed");
        //assert aside 'I Goods' link is displayed
        assertTrue(generalPage.isAsideIGoodsLinkDisplayed(), "The aside 'I Goods' link isn't displayed");
        //assert aside books link is displayed
        assertTrue(generalPage.isAsideBooksLinkDisplayed(), "The aside books link isn't displayed");
        //assert aside computer hardware is displayed
        assertTrue(generalPage.isAsideComputerHardwareLinkDisplayed(), "The aside computer hardware isn't displayed");
        //manufacturers section
        //assert aside manufacturers section title is displayed
        assertTrue(generalPage.isAsideManufacturersSectionTitleDisplayed(), "The aside manufacturers section title isn't displayed");
        //assert aside manufacturers section links are displayed (as a list)
        assertTrue(generalPage.isAsideManufacturersLinkDisplayed(), "The aside manufacturers section links aren't displayed");
        //gift certificate
        //assert aside gift certificate button is displayed
        assertTrue(generalPage.isAsideGiftCertificateButtonDisplayed(), "The aside gift certificate button isn't displayed");
        //special section
        //assert aside special section title is displayed
        assertTrue(generalPage.isAsideSpecialSectionTitleDisplayed(), "The aside special section title isn't displayed");
        //assert aside special sitemap link is displayed
        assertTrue(generalPage.isAsideSpecialSitemapLinkDisplayed(), "The aside special sitemap link isn't displayed");
        //assert aside special products map link is displayed
        assertTrue(generalPage.isAsideSpecialProductsMapLinkDisplayed(), "The aside special products map link isn't displayed");
        //news section
        //assert aside news section title is displayed
        assertTrue(generalPage.isAsideNewsSectionTitleDisplayed(), "The aside news section title isn't displayed");
        //assert aside news article data is displayed
        assertTrue(generalPage.isAsideNewsArticleDataDisplayed(), "The aside news article data isn't displayed");
        //assert aside news 'all news' link is displayed
        assertTrue(generalPage.isAsideAllNewsLinkDisplayed(), "The aside news 'all news' link isn't displayed");
        //assert aside news subscribe link is displayed
        assertTrue(generalPage.isAsideSubscribeLinkDisplayed(), "The aside news subscribe link isn't displayed");
    }

    //general page web element assert test method (aside section) (register page has an additional div element in aside categories list)
    protected void isGeneralOtherPageAsideWebElementDisplayed(GeneralPage generalPage){
        //aside (categories)
        //assert aside categories section title is displayed
        assertTrue(generalPage.isAsideCategoriesSectionTitleDisplayed(), "The aside categories section title isn't displayed");
        //assert aside features demo link is displayed
        assertTrue(generalPage.isOtherAsideFeaturesDemoLinkDisplayed(), "The aside features demo link isn't displayed");
        //assert aside apparel link is displayed
        assertTrue(generalPage.isOtherAsideApparelLinkDisplayed(), "The aside apparel link isn't displayed");
        //assert aside toys link is displayed
        assertTrue(generalPage.isOtherAsideToysLinkDisplayed(), "The aside toys link isn't displayed");
        //assert aside 'I Goods' link is displayed
        assertTrue(generalPage.isOtherAsideIGoodsLinkDisplayed(), "The aside 'I Goods' link isn't displayed");
        //assert aside books link is displayed
        assertTrue(generalPage.isOtherAsideBooksLinkDisplayed(), "The aside books link isn't displayed");
        //assert aside computer hardware is displayed
        assertTrue(generalPage.isOtherAsideComputerHardwareLinkDisplayed(), "The aside computer hardware isn't displayed");
        //manufacturers section
        //assert aside manufacturers section title is displayed
        assertTrue(generalPage.isAsideManufacturersSectionTitleDisplayed(), "The aside manufacturers section title isn't displayed");
        //assert aside manufacturers section links are displayed (as a list)
        assertTrue(generalPage.isAsideManufacturersLinkDisplayed(), "The aside manufacturers section links aren't displayed");
        //gift certificate
        //assert aside gift certificate button is displayed
        assertTrue(generalPage.isAsideGiftCertificateButtonDisplayed(), "The aside gift certificate button isn't displayed");
        //special section
        //assert aside special section title is displayed
        assertTrue(generalPage.isAsideSpecialSectionTitleDisplayed(), "The aside special section title isn't displayed");
        //assert aside special sitemap link is displayed
        assertTrue(generalPage.isAsideSpecialSitemapLinkDisplayed(), "The aside special sitemap link isn't displayed");
        //assert aside special products map link is displayed
        assertTrue(generalPage.isAsideSpecialProductsMapLinkDisplayed(), "The aside special products map link isn't displayed");
        //news section
        //assert aside news section title is displayed
        assertTrue(generalPage.isAsideNewsSectionTitleDisplayed(), "The aside news section title isn't displayed");
        //assert aside news article data is displayed
        assertTrue(generalPage.isAsideNewsArticleDataDisplayed(), "The aside news article data isn't displayed");
        //assert aside news 'all news' link is displayed
        assertTrue(generalPage.isAsideAllNewsLinkDisplayed(), "The aside news 'all news' link isn't displayed");
        //assert aside news subscribe link is displayed
        assertTrue(generalPage.isAsideSubscribeLinkDisplayed(), "The aside news subscribe link isn't displayed");
        //footer
        //assert footer 'help zone' link is displayed
        assertTrue(generalPage.isFooterHelpZoneLinkDisplayed(), "The footer 'help zone' link isn't displayed");
        //assert footer 'contact us' link is displayed
        assertTrue(generalPage.isFooterContactUsLinkDisplayed(), "The footer 'contact us' link isn't displayed");
        //assert footer 'our site' link is displayed
        assertTrue(generalPage.isFooterOurSiteLinkDisplayed(), "The footer 'our site' link isn't displayed");
        //assert footer 'Terms and Conditions' link is displayed
        assertTrue(generalPage.isFooterTermsConditionsLinkDisplayed(), "The footer 'Terms and Conditions' link isn't displayed");
        //assert footer 'privacy' link is displayed
        assertTrue(generalPage.isFooterPrivacyLinkDisplayed(), "The footer 'privacy' link isn't displayed");
        //assert footer 'privacy statement' link is displayed
        assertTrue(generalPage.isFooterPrivacyStatementLinkDisplayed(), "The footer 'privacy statement' link isn't displayed");
        //assert footer 'powered by' text is displayed
        assertTrue(generalPage.isFooterPoweredByTextDisplayed(), "The footer 'powered by' text isn't displayed");
        //assert footer copyright text is displayed
        assertTrue(generalPage.isFooterCopyrightTextDisplayed(), "The footer copyright text isn't displayed");
        //assert footer facebook icon button is displayed
        assertTrue(generalPage.isFooterFacebookIconButtonDisplayed(), "The footer facebook icon button isn't displayed");
        //assert footer x icon button is displayed
        assertTrue(generalPage.isFooterXIconButtonDisplayed(), "The footer x icon button isn't displayed");
    }

    //additional general page web element assert method (elements not all pages have)
    protected void isAddGeneralPageWebElementDisplayed(GeneralPage generalPage){
        //assert aside bestsellers section title is displayed
        assertTrue(generalPage.isAsideBestsellersSectionTitleDisplayed(), "The aside bestsellers section title isn't displayed");
        //assert aside bestsellers product images are displayed (as a list)
        assertTrue(generalPage.isAsideBestProductImageDisplayed(), "The aside bestsellers product images aren't displayed");
        //assert aside bestsellers product names are displayed (as a list)
        assertTrue(generalPage.isAsideBestProductNameLinkDisplayed(), "The aside bestsellers product names aren't displayed");
        //assert aside bestsellers product unit prices are displayed (as a list)
        assertTrue(generalPage.isAsideBestProductUnitPriceDisplayed(), "The aside bestsellers product unit prices aren't displayed");
    }

    //home page web element assert test method
    protected void isHomePageWebElementDisplayed(HomePage homePage){
        //assert home page welcome image link is displayed
        assertTrue(homePage.isWelcomeImageLinkDisplayed(), "The home page welcome image link isn't displayed");
        //assert home page welcome description is displayed
        assertTrue(homePage.isWelcomeDescriptionDisplayed(), "The home page welcome description isn't displayed");
        //assert home page featured products section title is displayed
        assertTrue(homePage.isFeaturedProductsTitleDisplayed(), "The home page featured products section isn't displayed");
        //assert home page aside bestseller section title is displayed
        assertTrue(homePage.isAsideBestsellerSectionTitleDisplayed(), "The home page aside bestseller section title isn't displayed");
        //list elements
        //featured
        //assert home page featured product images are displayed (as a list)
        assertTrue(homePage.isFeaturedProductImageDisplayed(), "The home page featured product images aren't displayed");
        //assert home page featured product name links are displayed (as a list)
        assertTrue(homePage.isFeaturedProductNameLinkDisplayed(), "The home page featured product name links aren't displayed");
        //assert home page featured product unit prices are displayed (as a list)
        assertTrue(homePage.isFeaturedProductUnitPriceDisplayed(), "The home page featured product unit prices aren't displayed");
        //assert home page featured product market prices are displayed (as a list)
        assertTrue(homePage.isFeaturedProductMarketPriceDisplayed(), "The home page featured product market prices aren't displayed");
        //assert home page featured product review stars are displayed (as a list)
        assertTrue(homePage.isFeaturedProductReviewStarDisplayed(), "The home page featured review stars aren't displayed");
        //assert home page featured product quantity dropdown menus are displayed (as a list)
        assertTrue(homePage.isFeaturedProductQtyDropdownMenuDisplayed(), "The home page featured product quantity dropdown menus aren't displayed");
        //assert home page featured product add to cart buttons are displayed (as a list)
        assertTrue(homePage.isFeaturedProductAddToCartButtonDisplayed(), "The home page featured product add to cart buttons aren't displayed");
        //assert home page featured product add to wishlist buttons are displayed (as a list)
        assertTrue(homePage.isFeaturedProductAddToWishlistButtonDisplayed(), "The home page featured product add to wishlist buttons aren't displayed");
        //bestsellers (same elements as with additional general page but these have different locators)
        //assert home page aside bestseller product images are displayed (as a list)
        assertTrue(homePage.isAsideBestsellerProductImageDisplayed(), "The home page aside bestseller product images aren't displayed");
        //assert home page aside bestseller product name links are displayed (as a list)
        assertTrue(homePage.isAsideBestsellerProductNameLinkDisplayed(), "The home page aside bestseller product name links aren't displayed");
        //assert home page aside bestseller product unit price are displayed (as a list)
        assertTrue(homePage.isAsideBestsellerProductUnitPriceDisplayed(), "The home page aside bestseller product unit price aren't displayed");
        //assert home page aside bestseller product market prices are displayed (as a list)
        assertTrue(homePage.isAsideBestsellerProductMarketPriceDisplayed(), "The home page aside bestseller product market prices aren't displayed");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page text element assert method
    protected void isGeneralPageTextElementAsExpected(GeneralPage generalPage){
        //header (switcher)
        //assert header interface tag is as expected
        assertEquals("Interface", generalPage.getHeaderInterfaceTag(), "The header interface tag doesn't match expectations.");
        //assert header visual scheme tag is as expected
        assertEquals("Visual Scheme", generalPage.getHeaderVisualSchemeTag(), "The header visual scheme tag doesn't match expectations.");
        //assert header configuration tag is as expected
        assertEquals("Configuration", generalPage.getHeaderConfigurationTag(), "The header configuration tag doesn't match expectations.");
        //assert header quick addons panel tag is as expected
        assertEquals("Quick addons panel", generalPage.getHeaderQuickAddonsPanelTag(), "The header quick addons panel tag doesn't match expectations.");
        //aside
        //assert aside categories section title is as expected
        assertEquals("Categories", generalPage.getAsideCategoriesSectionTitle(), "The aside categories section title doesn't match expectations.");
        //assert aside manufacturers section title is as expected
        assertEquals("Manufacturers", generalPage.getAsideManufacturersSectionTitle(), "The aside manufacturers section title doesn't match expectations.");
        //assert aside special section title is as expected
        assertEquals("Special", generalPage.getAsideSpecialSectionTitle(), "The aside special section title doesn't match expectations.");
        //assert footer powered by text is as expected
        assertEquals("Powered by X-Cart shopping cart software", generalPage.getFooterPoweredByText(), "The footer powered by text doesn't match expectations.");
        //assert footer copyright text is as expected
        assertEquals("Copyright © 2002-2025 Your Company Name", generalPage.getFooterCopyrightText(), "The footer copyright text doesn't match expectations.");
    }

    //general page text element assert method (without aside section)
    protected void isGeneralPageNoAsideTextElementAsExpected(GeneralPage generalPage){
        //header (switcher)
        //assert header interface tag is as expected
        assertEquals("Interface", generalPage.getHeaderInterfaceTag(), "The header interface tag doesn't match expectations.");
        //assert header visual scheme tag is as expected
        assertEquals("Visual Scheme", generalPage.getHeaderVisualSchemeTag(), "The header visual scheme tag doesn't match expectations.");
        //assert header configuration tag is as expected
        assertEquals("Configuration", generalPage.getHeaderConfigurationTag(), "The header configuration tag doesn't match expectations.");
        //assert header quick addons panel tag is as expected
        assertEquals("Quick addons panel", generalPage.getHeaderQuickAddonsPanelTag(), "The header quick addons panel tag doesn't match expectations.");
        //footer
        //assert footer powered by text is as expected
        assertEquals("Powered by X-Cart shopping cart software", generalPage.getFooterPoweredByText(), "The footer powered by text doesn't match expectations.");
        //assert footer copyright text is as expected
        assertEquals("Copyright © 2002-2025 Your Company Name", generalPage.getFooterCopyrightText(), "The footer copyright text doesn't match expectations.");
    }

    //additional general page text element assert test method
    protected void isAddGeneralPageTextElementAsExpected(GeneralPage generalPage){
        //assert aside bestsellers section title is as expected
        assertEquals("Bestsellers", generalPage.getAsideBestsellersSectionTitle(), "The aside bestsellers section title doesn't match expectations.");
    }

    //home page text element assert test method
    protected void isHomePageTextElementAsExpected(HomePage homePage){
        //assert home page welcome description is as expected
        assertEquals("This is a demo store powered by X-Cart software. No real products. No real prices. No real charges. Please do not submit real credit card information.", homePage.getWelcomeDescription(), "The home page welcome description doesn't match expectations.");
        //assert home page featured products section title is as expected
        assertEquals("Featured products", homePage.getFeaturedProductsSectionTitle(), "The home page featured products section title doesn't match expectations.");
        //assert home page aside bestseller products section title is as expected
        assertEquals("Bestsellers", homePage.getAsideBestsellerProductsSectionTitle(), "The home page aside bestseller products section title doesn't match expectations.");
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //test result screenshot method (comment this method out during browser run since (GitHub) headless run doesn't need screenshots)
    public void captureScreenshot(WebDriver driver, String fileName) {
        try {
            Thread.sleep(1500);//apply wait time for the right time to get the screenshot (WebDriverWait doesn't work here)
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destination = new File("E:\\IntelliJ Selenium projects\\XCartStoreSelenium\\src\\test\\resources\\" + " " +  fileName + ".png");
            Files.copy(screenshot.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
            logger.info("Screenshot saved at: " + destination.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
