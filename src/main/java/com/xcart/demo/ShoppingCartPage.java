package com.xcart.demo;

import com.xcart.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class ShoppingCartPage extends BasePage {

    //shopping cart web page elements
    @FindBy(xpath = "//div[@id='center-main']/h1")
    private WebElement shoppingCartPageTitle;
    @FindBy(xpath = "//div[@class='checkout-buttons']/div[1]/a")
    private WebElement shoppingCartPageUpperContinueShoppingButton;
    @FindBy(xpath = "//div[@class='checkout-buttons']/div[2]/a")
    private WebElement shoppingCartPageUpperCheckoutButton;
    @FindBy(xpath = "//div[@id='center-main']/p")
    private WebElement shoppingCartPageDescription;
    //list elements
    @FindBy(xpath = "//form[@name='cartform']/table/tbody/tr/td[1]/a[2]")
    private List<WebElement> shoppingCartPageProductRemoveButtonElements;
    @FindBy(xpath = "//form[@name='cartform']/table/tbody/tr/td[1]//img")
    private List<WebElement> shoppingCartPageProductImageElements;
    @FindBy(xpath = "//form[@name='cartform']/table/tbody/tr/td[2]/a")
    private List<WebElement> shoppingCartPageProductNameLinkElements;
    @FindBy(xpath = "//form[@name='cartform']/table/tbody/tr/td[2]//table")
    private List<WebElement> shoppingCartPageProductDetailsElements;
    @FindBy(xpath = "//form[@name='cartform']/table/tbody/tr/td[2]//a[@class='simple-button']")
    private List<WebElement> shoppingCartPageProductOptionsLinkElements;
    @FindBy(xpath = "//span[@class='product-price-text']/span")
    private List<WebElement> shoppingCartPageProductUnitPriceElements;
    @FindBy(xpath = "//span[@class='product-price-text']/input")
    private List<WebElement> shoppingCartPageProductQtyInputFieldElements;
    @FindBy(xpath = "//span[@class='price']/span")
    private List<WebElement> shoppingCartPageProductTotalPriceElements;
    @FindBy(xpath = "//span[@class='market-price']/span")
    private List<WebElement> shoppingCartPageProductAltPriceElements;
    @FindBy(xpath = "//div[@class='buttons-row buttons-auto-separator']/button[1]")
    private List<WebElement> shoppingCartPageUpdateItemButtonElements;
    @FindBy(xpath = "//div[@class='buttons-row buttons-auto-separator']/button[2]")
    private List<WebElement> shoppingCartPageMoveToWishlistButtonElements;
    //options dropdown elements (for some products)
    @FindBy(xpath = "//table[@class='product-properties']//tr[2]/td[2]/select")
    private WebElement capacityDropdownMenu;
    @FindBy(xpath = "//table[@class='product-properties']//tr[2]/td[2]/select/option[2]")
    private WebElement capacity32GBOption;
    @FindBy(xpath = "//table[@class='product-properties']//tr[3]/td[2]/select")
    private WebElement colorDropdownMenu;
    @FindBy(xpath = "//table[@class='product-properties']//tr[3]/td[2]/select/option[3]")
    private WebElement colorYellowOption;
    @FindBy(xpath = "//table[@class='product-properties']//tr[4]//button")
    private WebElement updateButton;
    //singular elements
    @FindBy(xpath = "//div[@class='right-box cart-border']/table/tbody/tr/td[1]")
    private WebElement shoppingCartSubtotalSubtext;
    @FindBy(xpath = "//div[@class='right-box cart-border']/table/tbody/tr/td[2]")
    private WebElement shoppingCartOrderSubtotalPrice;
    @FindBy(xpath = "//div[@class='right-box cart-border']/table/tbody/tr/td[3]")
    private WebElement shoppingCartOrderSubtotalAltPrice;
    @FindBy(xpath = "//div[@class='giftwrap-option']//input")
    private WebElement shoppingCartAddGiftWrapCheckbox;
    @FindBy(xpath = "//div[@class='giftwrap-option']/label")
    private WebElement shoppingCartAddGiftWrapSubtitle;
    @FindBy(xpath = "//button[@title='Update gift wrap']")
    private WebElement shoppingCartUpdateGiftWrapButton;
    @FindBy(xpath = "//button[@title='Update cart']")
    private WebElement shoppingCartUpdateCartButton;
    @FindBy(xpath = "//a[@title='Clear cart']")
    private WebElement shoppingCartClearCartLink;
    @FindBy(xpath = "//div[@class='button main-button']/a")
    private WebElement shoppingCartCheckoutButton;
    //discount coupon section
    @FindBy(xpath = "//div[@class='dialog simple-dialog']//h2")
    private WebElement shoppingCartDiscountSectionTitle;
    @FindBy(xpath = "//form[@name='couponform']//label")
    private WebElement shoppingCartDiscountSubtext;
    @FindBy(xpath = "//form[@name='couponform']//input[@id='coupon']")
    private WebElement shoppingCartDiscountCouponCodeInputField;
    @FindBy(xpath = "//form[@name='couponform']//button")
    private WebElement shoppingCartDiscountCodeSubmitButton;
    //shopping cart error limit message
    @FindBy(xpath = "//div[@class='box ui-corner-bottom message-e']")
    private WebElement shoppingCartTenDollarLimitErrorMessage;
    //shopping cart empty message
    @FindBy(xpath = "//div[@class='dialog noborder']")
    private WebElement shoppingCartEmptyMessage;

    public ShoppingCartPage(WebDriver driver) {super(driver);}

    //click 'Edit options' link (available for some products only)
    public void clickEditOptionsLink(int index){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartPageProductOptionsLinkElements.get(index)));
        shoppingCartPageProductOptionsLinkElements.get(index).click();
    }

    //click capacity dropdown menu method (available only for some products)
    public void clickCapacityDropdownMenu(){
        Actions action = new Actions(driver);
        action.moveToElement(capacityDropdownMenu).click().perform();
    }

    //select 32 GB option (available for 'Iphone')
    public void select32GBOption(){capacity32GBOption.click();}

    //click color dropdown menu method (available only for some products)
    public void clickColorDropdownMenu(){
        Actions action = new Actions(driver);
        action.moveToElement(colorDropdownMenu).click().perform();
    }

    //select 'Yellow' color option (available for 'Iphone')
    public void selectYellowColorOption(){colorYellowOption.click();}

    //click 'Update' product details button
    public void clickUpdateProductDetailsButton(){updateButton.click();}

    //click upper 'Checkout' button method
    public void clickUpperCheckoutButton() {
        Actions action = new Actions(driver);
        action.moveToElement(shoppingCartPageUpperCheckoutButton).click().perform();
    }

    //click lower 'Checkout' button method
    public void clickLowerCheckoutButton() {
        Actions action = new Actions(driver);
        action.moveToElement(shoppingCartCheckoutButton).click().perform();
    }

    //click 'Product remove' button method
    public void clickProductRemoveButton(int index){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartPageProductRemoveButtonElements.get(index)));
        shoppingCartPageProductRemoveButtonElements.get(index).click();
    }

    //click 'Move to wishlist' button method
    public void clickMoveToWishlistButton(int index){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartPageMoveToWishlistButtonElements.get(index)));
        shoppingCartPageMoveToWishlistButtonElements.get(index).click();
    }

    //shopping cart page product data getters
    public List<String> getShoppingCartPageProductName(){return shoppingCartPageProductNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getShoppingCartPageProductDetails(){return shoppingCartPageProductDetailsElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getShoppingCartPageProductUnitPrice(){return shoppingCartPageProductUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getShoppingCartPageProductQty(){return shoppingCartPageProductQtyInputFieldElements.stream().map(element -> element.getDomAttribute("value")).collect(Collectors.toList());}
    public List<String> getShoppingCartPageProductTotalPrice(){return shoppingCartPageProductTotalPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getShoppingCartPageProductAltPrice(){return shoppingCartPageProductAltPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //shopping cart page text element getters
    public String getShoppingCartPageTitle() {return shoppingCartPageTitle.getText();}
    public String getShoppingCartPageDescription() {return shoppingCartPageDescription.getText();}
    public String getShoppingCartSubtotalSubtitle() {return shoppingCartSubtotalSubtext.getText();}
    public String getShoppingCartAddGiftWrapSubtitle() {return shoppingCartAddGiftWrapSubtitle.getText();}
    public String getShoppingCartDiscountSectionTitle() {return shoppingCartDiscountSectionTitle.getText();}
    public String getShoppingCartDiscountSubtext() {return shoppingCartDiscountSubtext.getText();}

    //shopping cart ten dollar error message getter
    public String getShoppingCartTenDollarErrorMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(900));
        wait.until(ExpectedConditions.visibilityOf(shoppingCartTenDollarLimitErrorMessage));
        return shoppingCartTenDollarLimitErrorMessage.getText();
    }

    //shopping cart empty message getter
    public String getShoppingEmptyMessage(){return shoppingCartEmptyMessage.getText();}

    //shopping cart page web element assert test methods
    public boolean isShoppingCartPageTitleDisplayed() {return shoppingCartPageTitle.isDisplayed();}
    public boolean isShoppingCartPageUpperContinueShoppingButtonDisplayed() {return shoppingCartPageUpperContinueShoppingButton.isDisplayed();}
    public boolean isShoppingCartPageUpperCheckoutButtonDisplayed() {return shoppingCartPageUpperCheckoutButton.isDisplayed();}
    public boolean isShoppingCartPageDescriptionDisplayed() {return shoppingCartPageDescription.isDisplayed();}
    public boolean isShoppingCartSubtotalSubtextDisplayed() {return shoppingCartSubtotalSubtext.isDisplayed();}
    public boolean isShoppingCartOrderSubtotalPriceDisplayed() {return shoppingCartOrderSubtotalPrice.isDisplayed();}
    public boolean isShoppingCartOrderSubtotalAltPriceDisplayed() {return shoppingCartOrderSubtotalAltPrice.isDisplayed();}
    public boolean isShoppingCartAddGiftWrapCheckboxDisplayed() {return shoppingCartAddGiftWrapCheckbox.isDisplayed();}
    public boolean isShoppingCartAddGiftWrapSubtitleDisplayed() {return shoppingCartAddGiftWrapSubtitle.isDisplayed();}
    public boolean isShoppingCartUpdateGiftWrapButtonDisplayed() {return shoppingCartUpdateGiftWrapButton.isDisplayed();}
    public boolean isShoppingCartUpdateCartButtonDisplayed() {return shoppingCartUpdateCartButton.isDisplayed();}
    public boolean isShoppingCartClearCartLinkDisplayed() {return shoppingCartClearCartLink.isDisplayed();}
    public boolean isShoppingCartCheckoutButtonDisplayed() {return shoppingCartCheckoutButton.isDisplayed();}

    public boolean isShoppingCartTenDollarLimitErrorMessageDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
        wait.until(ExpectedConditions.visibilityOf(shoppingCartTenDollarLimitErrorMessage));
        return shoppingCartTenDollarLimitErrorMessage.isDisplayed();
    }

    //input product quantity into shopping cart product qty input field method
    public void changeShoppingCartProductQty(int index){
        shoppingCartPageProductQtyInputFieldElements.get(index).clear();
        shoppingCartPageProductQtyInputFieldElements.get(index).sendKeys("8");
        shoppingCartPageProductQtyInputFieldElements.get(index).click();
    }

    //click 'Update cart' button
    public void clickUpdateCartButton(){shoppingCartUpdateCartButton.click();}

    //discount section
    public boolean isShoppingCartDiscountSectionTitleDisplayed() {return shoppingCartDiscountSectionTitle.isDisplayed();}
    public boolean isShoppingCartDiscountSubtextDisplayed() {return shoppingCartDiscountSubtext.isDisplayed();}
    public boolean isShoppingCartDiscountCouponCodeInputDisplayed() {return shoppingCartDiscountCouponCodeInputField.isDisplayed();}
    public boolean isShoppingCartDiscountCodeSubmitButtonDisplayed() {return shoppingCartDiscountCodeSubmitButton.isDisplayed();}
    //list elements
    public boolean isShoppingCartPageProductRemoveButtonDisplayed() {
        return shoppingCartPageProductRemoveButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductImageDisplayed() {
        return shoppingCartPageProductImageElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductNameLinkDisplayed() {
        return shoppingCartPageProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductDetailsDisplayed() {
        return shoppingCartPageProductDetailsElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductOptionsLinkDisplayed() {
        return shoppingCartPageProductOptionsLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductUnitPriceDisplayed() {
        return shoppingCartPageProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductQtyInputFieldDisplayed() {
        return shoppingCartPageProductQtyInputFieldElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductTotalPriceDisplayed() {
        return shoppingCartPageProductTotalPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageProductAltPriceDisplayed() {
        return shoppingCartPageProductAltPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageUpdateItemButtonDisplayed() {
        return shoppingCartPageUpdateItemButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartPageMoveToWishlistButtonDisplayed() {
        return shoppingCartPageMoveToWishlistButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
