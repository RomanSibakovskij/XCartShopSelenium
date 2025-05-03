package com.xcart.demo;

import com.xcart.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class SingleProductPage extends BasePage{

    //single product page web elements
    @FindBy(xpath = "//div[@class='np-products']//a[@class='prev']")
    private WebElement singleProductPagePreviousProductLink;
    @FindBy(xpath = "//div[@class='np-products']//a[@class='next']")
    private WebElement singleProductPageNextProductLink;
    @FindBy(xpath = "//div[@id='center-main']/h1")
    private WebElement singleProductPageTitle;
    @FindBy(xpath = "//div[@class='image-box']/img")
    private WebElement singleProductMainImage;
    @FindBy(xpath = "//table[@class='product-properties']/tbody[1]/tr[1]/td[2]")
    private WebElement singleProductSKU;
    @FindBy(xpath = "//table[@class='product-properties']/tbody[1]/tr[2]/td[2]")
    private WebElement singleProductWeight;
    @FindBy(xpath = "//table[@class='product-properties']/tbody[1]/tr[3]/td[2]/span[1]")
    private WebElement singleProductUnitPrice;
    @FindBy(xpath = "//table[@class='product-properties']/tbody[1]/tr[3]/td[2]/span[2]")
    private WebElement singleProductAltPrice;
    @FindBy(xpath = "//table[@class='product-properties']/tbody[2]//select")
    private WebElement singleProductSizeDropdownMenu;
    @FindBy(xpath = "//table[@class='product-properties']/tbody[2]//select/option[3]")
    private WebElement singleProductLSizeOption;
    @FindBy(xpath = "//div[@class='quantity']//select")
    private WebElement singleProductQtyDropdownMenu;
    @FindBy(xpath = "//div[@class='quantity']//select/option[3]")
    private WebElement singleProductThreeQtyOption;
    @FindBy(xpath = "//div[@class='buttons-row']/button[1]")
    private WebElement singleProductAddToCartButton;
    @FindBy(xpath = "//div[@class='buttons-row']/button[2]")
    private WebElement singleProductAddToWishlistButton;
    @FindBy(xpath = "//div[@class='descr']")
    private WebElement singleProductDescription;
    @FindBy(xpath = "//div[@id='product-details-id']/div[2]/div[2]/div")
    private WebElement singleProductDemoBoxText;
    @FindBy(xpath = "//div[@id='product-details-id']/div[2]/div[2]/div/a")
    private WebElement singleProductThinkGeekLink;
    @FindBy(xpath = "//ul[@class='simple-list']/li[1]//iframe[@id='twitter-widget-0']")
    private WebElement singleProductXButton;
    @FindBy(xpath = "//ul[@class='simple-list']/li[1]//a")
    private WebElement singleProductPinItButton;
    @FindBy(xpath = "//ul[@class='simple-list']/li[2]//a")
    private WebElement singleProductAskQuestionButton;
    //send to friend section
    @FindBy(xpath = "//ul[@role='tablist']/li[1]/a")
    private WebElement singleProductSendToFriendLink;
    @FindBy(xpath = "//div[@id='product-tabs-send2friend']//table//tr[1]//input")
    private WebElement singleProductNameInputField;
    @FindBy(xpath = "//div[@id='product-tabs-send2friend']//table//tr[2]//input")
    private WebElement singleProductEmailInputField;
    @FindBy(xpath = "//div[@id='product-tabs-send2friend']//table//tr[3]//input")
    private WebElement singleProductRecipientEmailInputField;
    @FindBy(xpath = "//div[@id='product-tabs-send2friend']//table//tr[4]//input")
    private WebElement singleProductAddPersonalMessageCheckbox;
    @FindBy(xpath = "//div[@id='product-tabs-send2friend']//table//tr[6]/td")
    private WebElement singleProductCaptchaHint;
    @FindBy(xpath = "//div[@id='product-tabs-send2friend']//table//tr[7]/td[1]//img")
    private WebElement singleProductCaptchaImageBox;
    @FindBy(xpath = "//div[@id='product-tabs-send2friend']//table//tr[7]/td[1]//a")
    private WebElement singleProductCaptchaDifferentCodeLink;
    @FindBy(xpath = "//div[@id='product-tabs-send2friend']//table//tr[7]/td[3]/input")
    private WebElement singleProductCaptchaCodeInputField;
    @FindBy(xpath = "//div[@id='product-tabs-send2friend']//table//tr[7]/td[3]//button")
    private WebElement singleProductSendToFriendButton;
    //customers also bought section
    @FindBy(xpath = "//ul[@role='tablist']/li[2]/a")
    private WebElement singleProductCustomersAlsoBoughtLink;
    //list elements
    @FindBy(xpath = "//div[@id='product-tabs-recommends']//div[@class='image-wrapper']//img")
    private List<WebElement> singleProductCustomersAlsoBoughtProductImageElements;
    @FindBy(xpath = "//div[@id='product-tabs-recommends']//div[@class='details']/a")
    private List<WebElement> singleProductCustomersAlsoBoughtProductNameLinkElements;
    @FindBy(xpath = "//div[@id='product-tabs-recommends']//span[@class='price-value']")
    private List<WebElement> singleProductCustomersAlsoBoughtProductUnitPriceElements;
    //customers feedback section
    @FindBy(xpath = "//ul[@role='tablist']/li[3]/a")
    private WebElement singleProductCustomersFeedbackLink;
    //shopping cart form view cart button element (since the methods from HomePage refuse to work properly on this page)
    @FindBy(css = ".view-cart")
    private WebElement shoppingCartFormYourCartSectionViewCartButton;

    public SingleProductPage(WebDriver driver) {super(driver);}

    //click size dropdown menu
    public void clickProductSizeDropdownMenu(){
        Actions action = new Actions(driver);
        action.moveToElement(singleProductSizeDropdownMenu).click().perform();
    }

    //select 'L' size option
    public void selectLSizeOption(){singleProductLSizeOption.click();}

    //click product quantity dropdown menu
    public void clickProductQtyDropdownMenu(){
        Actions action = new Actions(driver);
        action.moveToElement(singleProductQtyDropdownMenu).click().perform();
    }

    //select set product quantity option
    public void selectThreeProductQtyOption(){singleProductThreeQtyOption.click();}

    //click 'customers also bought' link method
    public void clickCustomersAlsoBoughtLink(){singleProductCustomersAlsoBoughtLink.click();}

    //click 'add to cart' button method
    public void clickAddToCartButton(){
        Actions action = new Actions(driver);
        action.moveToElement(singleProductAddToCartButton).click().perform();
    }

    //click 'View cart' shopping cart form method
    public void clickViewCartShoppingCartFormButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1100));
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartFormYourCartSectionViewCartButton));
        shoppingCartFormYourCartSectionViewCartButton.click();
    }

    //click 'add to wishlist' button method
    public void clickAddToWishlistButton(){
        Actions action = new Actions(driver);
        action.moveToElement(singleProductAddToWishlistButton).click().perform();
    }

    //single product page product data getters
    public String getSingleProductSKU(){return singleProductSKU.getText();}
    public String getSingleProductWeight(){return singleProductWeight.getText();}
    public String getSingleProductUnitPrice(){return singleProductUnitPrice.getText();}
    public String getSingleProductAltPrice(){return singleProductAltPrice.getText();}
    public String getSingleProductDescription(){return singleProductDescription.getText();}

    //customers also bought section data getters
    public List<String> getCustomersAlsoBoughtProductName(){return singleProductCustomersAlsoBoughtProductNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getCustomersAlsoBoughtProductUnitPrice(){return singleProductCustomersAlsoBoughtProductUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //single product page text element getter
    public String getSingleProductPageTitle() {return singleProductPageTitle.getText();}

    //single product page web element assert methods
    public boolean isSingleProductPagePreviousLinkDisplayed() {return singleProductPagePreviousProductLink.isDisplayed();}
    public boolean isSingleProductPageNextLinkDisplayed() {return singleProductPageNextProductLink.isDisplayed();}
    public boolean isSingleProductPageTitleDisplayed() {return singleProductPageTitle.isDisplayed();}
    public boolean isSingleProductMainImageDisplayed() {return singleProductMainImage.isDisplayed();}
    public boolean isSingleProductSKUDisplayed() {return singleProductSKU.isDisplayed();}
    public boolean isSingleProductWeightDisplayed() {return singleProductWeight.isDisplayed();}
    public boolean isSingleProductUnitPriceDisplayed() {return singleProductUnitPrice.isDisplayed();}
    public boolean isSingleProductAltPriceDisplayed() {return singleProductAltPrice.isDisplayed();}
    public boolean isSingleProductSizeDropdownMenuDisplayed() {return singleProductSizeDropdownMenu.isDisplayed();}
    public boolean isSingleProductQtyDropdownMenuDisplayed() {return singleProductQtyDropdownMenu.isDisplayed();}
    public boolean isSingleProductAddToCartButtonDisplayed() {return singleProductAddToCartButton.isDisplayed();}
    public boolean isSingleProductAddToWishlistButtonDisplayed() {return singleProductAddToWishlistButton.isDisplayed();}
    public boolean isSingleProductDescriptionDisplayed() {return singleProductDescription.isDisplayed();}
    public boolean isSingleProductDemoBoxTextDisplayed() {return singleProductDemoBoxText.isDisplayed();}
    public boolean isSingleProductThinkGeekLinkDisplayed() {return singleProductThinkGeekLink.isDisplayed();}
    public boolean isSingleProductXButtonDisplayed() {return singleProductXButton.isDisplayed();}
    public boolean isSingleProductPinItButtonDisplayed() {return singleProductPinItButton.isDisplayed();}
    public boolean isSingleProductAskQuestionButtonDisplayed() {return singleProductAskQuestionButton.isDisplayed();}
    //send to friend section
    public boolean isSingleProductSendToFriendLinkDisplayed() {return singleProductSendToFriendLink.isDisplayed();}
    public boolean isSingleProductNameInputFieldDisplayed() {return singleProductNameInputField.isDisplayed();}
    public boolean isSingleProductEmailInputFieldDisplayed() {return singleProductEmailInputField.isDisplayed();}
    public boolean isSingleProductRecipientEmailInputFieldDisplayed() {return singleProductRecipientEmailInputField.isDisplayed();}
    public boolean isSingleProductAddPersonalMessageCheckboxDisplayed() {return singleProductAddPersonalMessageCheckbox.isDisplayed();}
    public boolean isSingleProductCaptchaHintDisplayed() {return singleProductCaptchaHint.isDisplayed();}
    public boolean isSingleProductCaptchaImageBoxDisplayed() {return singleProductCaptchaImageBox.isDisplayed();}
    public boolean isSingleProductCaptchaDifferentCodeLinkDisplayed() {return singleProductCaptchaDifferentCodeLink.isDisplayed();}
    public boolean isSingleProductCaptchaCodeInputFieldDisplayed() {return singleProductCaptchaCodeInputField.isDisplayed();}
    public boolean isSingleProductSendToFriendButtonDisplayed() {return singleProductSendToFriendButton.isDisplayed();}
    //customers also bought section
    public boolean isSingleProductCustomersAlsoBoughtLinkDisplayed() {return singleProductCustomersAlsoBoughtLink.isDisplayed();}
    //list elements
    public boolean isSingleProductCustomersAlsoBoughtProductImageDisplayed() {
        return singleProductCustomersAlsoBoughtProductImageElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleProductCustomersAlsoBoughtProductNameLinkDisplayed() {
        return singleProductCustomersAlsoBoughtProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleProductCustomersAlsoBoughtProductUnitPriceDisplayed() {
        return singleProductCustomersAlsoBoughtProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    //customers feedback section
    public boolean isSingleProductCustomersFeedbackLinkDisplayed() {return singleProductCustomersFeedbackLink.isDisplayed();}

}
