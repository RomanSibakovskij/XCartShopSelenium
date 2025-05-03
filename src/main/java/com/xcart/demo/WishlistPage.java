package com.xcart.demo;

import com.xcart.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.util.*;
import java.time.Duration;
import java.util.stream.Collectors;

public class WishlistPage extends BasePage {

    //wishlist page web elements
    @FindBy(xpath = "//div[@id='center-main']/h1")
    private WebElement wishlistPageTitle;
    //list elements
    @FindBy(xpath = "//div[@class='products cart wishlist']//tbody//td[1]/a[2]")
    private List<WebElement> wishlistPageProductRemoveButtonElements;
    @FindBy(xpath = "//div[@class='products cart wishlist']//tbody//td[1]/a[1]")
    private List<WebElement> wishlistPageProductImageElements;
    @FindBy(xpath = "//div[@class='products cart wishlist']//tbody//td[2]/a")
    private List<WebElement> wishlistPageProductNameLinkElements;
    @FindBy(xpath = "//span[@class='product-price-text']/span")
    private List<WebElement> wishlistPageProductUnitPriceElements;
    @FindBy(xpath = "//span[@class='product-price-text']/input")
    private List<WebElement> wishlistPageProductQtyInputFieldElements;
    @FindBy(xpath = "//span[@class='price']/span")
    private List<WebElement> wishlistPageProductTotalPriceElements;
    @FindBy(xpath = "//div[@class='products cart wishlist']//tbody//td[2]/span[@class='market-price']")
    private List<WebElement> wishlistPageProductAltPriceElements;
    @FindBy(xpath = "//div[@class='buttons-row buttons-auto-separator']/button[1]")
    private List<WebElement> wishlistPageProductUpdateButtonElements;
    @FindBy(xpath = "//div[@class='buttons-row buttons-auto-separator']/button[2]")
    private List<WebElement> wishlistPageProductAddToCartButtonElements;
    //singular elements
    @FindBy(xpath = "//div[@class='button']/a")
    private WebElement wishlistPageClearWishlistButton;
    @FindBy(xpath = "//table[@class='wishlist-sendlist data-table']//tr/td[1]")
    private WebElement wishlistPageSendWishlistSubtext;
    @FindBy(xpath = "//table[@class='wishlist-sendlist data-table']//tr//input")
    private WebElement wishlistPageEmailInputField;
    @FindBy(xpath = "//table[@class='wishlist-sendlist data-table']//tr//button")
    private WebElement wishlistPageSendButton;
    //wishlist empty message element
    @FindBy(xpath = "//div[@class='dialog noborder']/div")
    private WebElement wishlistPageEmptyMessage;

    public WishlistPage(WebDriver driver) {super(driver);}

    //click 'Add to cart' product button method
    public void clickAddToCartFromWishlistButton(int index){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.elementToBeClickable(wishlistPageProductAddToCartButtonElements.get(index)));
        wishlistPageProductAddToCartButtonElements.get(index).click();
    }

    //click 'Update' wishlist button method
    public void clickUpdateWishlistButton(int index){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.elementToBeClickable(wishlistPageProductAddToCartButtonElements.get(index)));
        wishlistPageProductAddToCartButtonElements.get(index).click();
    }

    //update product quantity in wishlist method
    public void updateWishlistProductQuantity(int index){
        wishlistPageProductQtyInputFieldElements.get(index).clear();
        wishlistPageProductQtyInputFieldElements.get(index).sendKeys("8");
        wishlistPageProductUpdateButtonElements.get(index).click();
    }

    //wishlist page product data getters
    public List<String> getWishlistPageProductName(){return wishlistPageProductNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getWishlistPageProductUnitPrice(){return wishlistPageProductUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getWishlistPageProductQty(){return wishlistPageProductQtyInputFieldElements.stream().map(element -> element.getDomAttribute("value")).collect(Collectors.toList());}
    public List<String> getWishlistPageProductTotalPrice(){return wishlistPageProductTotalPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getWishlistPageProductAltPrice(){return wishlistPageProductAltPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //wishlist page text element getters
    public String getWishlistPageTitle() {return wishlistPageTitle.getText();}
    public String getWishlistPageSendWishlistSubtext() {return wishlistPageSendWishlistSubtext.getText();}

    //wishlist page empty message getter
    public String getWishlistPageEmptyMessage() {return wishlistPageEmptyMessage.getText();}

    //wishlist page web element assert methods
    public boolean isWishlistPageTitleDisplayed() {return wishlistPageTitle.isDisplayed();}
    public boolean isWishlistPageClearWishlistButtonDisplayed() {return wishlistPageClearWishlistButton.isDisplayed();}
    public boolean isWishlistPageSendWishlistSubtextDisplayed() {return wishlistPageSendWishlistSubtext.isDisplayed();}
    public boolean isWishlistPageEmailInputDisplayed() {return wishlistPageEmailInputField.isDisplayed();}
    public boolean isWishlistPageSendButtonDisplayed() {return wishlistPageSendButton.isDisplayed();}
    //list elements
    public boolean isWishlistProductRemoveButtonDisplayed() {
        return wishlistPageProductRemoveButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isWishlistProductImageDisplayed() {
        return wishlistPageProductImageElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isWishlistProductNameLinkDisplayed() {
        return wishlistPageProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isWishlistProductUnitPriceDisplayed() {
        return wishlistPageProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isWishlistProductQtyInputFieldDisplayed() {
        return wishlistPageProductQtyInputFieldElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isWishlistProductTotalPriceDisplayed() {
        return wishlistPageProductTotalPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isWishlistProductAltPriceDisplayed() {
        return wishlistPageProductAltPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isWishlistProductUpdateButtonDisplayed() {
        return wishlistPageProductUpdateButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isWishlistProductAddToCartButtonDisplayed() {
        return wishlistPageProductAddToCartButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
