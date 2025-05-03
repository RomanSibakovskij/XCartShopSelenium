package com.xcart.demo;

import com.xcart.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class HomePage extends BasePage{

    //home page web elements
    //main
    @FindBy(xpath = "//div[@class='welcome-img']/a")
    private WebElement welcomeImageLink;
    @FindBy(xpath = "//div[@class='welcome-cell with-bestsellers']/p")
    private WebElement welcomeDescription;
    //featured products
    @FindBy(xpath = "//div[@class='dialog products-dialog dialog-featured-list']//h2")
    private WebElement featuredProductsTitle;
    //list elements
    @FindBy(xpath = "//div[@class='products products-list products-div']//img")
    private List<WebElement>  featuredProductImageElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//a[@class='product-title']")
    private List<WebElement>  featuredProductNameLinkElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//span[@class='price-value']")
    private List<WebElement>  featuredProductUnitPriceElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//span[@class='market-price']")
    private List<WebElement>  featuredProductMarketPriceElements;
    @FindBy(xpath = "//div[@class='creviews-vote-bar allow-add-rate']/ul/li//a")
    private List<WebElement>  featuredProductReviewStarElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//select")
    private List<WebElement>  featuredProductQtyDropdownMenuElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//select/option[@value='5']")
    private List<WebElement>  featuredProductFiveQtyOptionElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//button[@class='button main-button add-to-cart-button']")
    private List<WebElement>  featuredProductAddToCartButtonElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//button[@class='button  button-wl']")
    private List<WebElement>  featuredProductAddToWishlistButtonElements;
    //bestsellers aside
    @FindBy(xpath = "//div[@class='menu-dialog menu-products menu-products-thumbnails menu-bestsellers']//h2")
    private WebElement asideBestsellersSectionTitle;
    //list elements
    @FindBy(xpath = "//div[@class='bestsellers-cell']//h2")
    private List<WebElement> asideBestProductImageElements;
    @FindBy(xpath = "//div[@class='bestsellers-cell']//a[@class='product-title']")
    private List<WebElement> asideBestProductNameLinkElements;
    @FindBy(xpath = "//div[@class='bestsellers-cell']//span[@class='price-value']")
    private List<WebElement> asideBestProductUnitPriceElements;
    @FindBy(xpath = "//div[@class='bestsellers-cell']//span[@class='market-price']")
    private List<WebElement> asideBestProductMarketPriceElements;
    //shopping cart form elements
    @FindBy(xpath = "//span[@class='ui-dialog-title']")
    private WebElement shoppingCartFormAdditionSuccessMessage;
    @FindBy(xpath = "//button[@title='Close']")
    private WebElement shoppingCartFormCloseButton;
    @FindBy(xpath = "//div[@class='ui-dialog-content ui-widget-content']/div[@class='thumbnail']")
    private WebElement shoppingCartFormProductThumbImage;
    @FindBy(xpath = "//div[@class='ui-dialog-content ui-widget-content']//div[@class='details']//a")
    private WebElement shoppingCartFormProductNameLink;
    @FindBy(xpath = "//div[@class='ui-dialog-content ui-widget-content']//div[@class='details']/div[@class='price']/span[1]")
    private WebElement shoppingCartFormProductUnitPrice;
    @FindBy(xpath = "//div[@class='ui-dialog-content ui-widget-content']//div[@class='details']/div[@class='price']/span[2]")
    private WebElement shoppingCartFormProductAltUnitPrice;
    @FindBy(xpath = "//div[@class='cart']/div")
    private WebElement shoppingCartFormYourCartSectionSubtitle;
    @FindBy(xpath = "//div[@class='cart']/ul/li[1]")
    private WebElement shoppingCartFormYourCartSectionItemCount;
    @FindBy(xpath = "//div[@class='cart']/ul/li[2]")
    private WebElement shoppingCartFormYourCartSectionSubtotalPrice;
    @FindBy(xpath = "//div[@class='cart']/a")
    private WebElement shoppingCartFormYourCartSectionViewCartButton;
    @FindBy(xpath = "//div[@class='added-buttons']/a")
    private WebElement shoppingCartFormContinueShoppingButton;
    @FindBy(xpath = "//div[@class='added-buttons']/div/a")
    private WebElement shoppingCartFormProceedToCheckoutButton;

    public HomePage(WebDriver driver) {super(driver);}

    //click featured product 'Add to cart' button list method
    public void clickFeaturedProductAddToCartButton(int index){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.elementToBeClickable(featuredProductAddToCartButtonElements.get(index)));
        featuredProductAddToCartButtonElements.get(index).click();
    }

    //click featured product quantity dropdown menu method
    public void clickFeaturedProductQtyDropdownMenu(int index){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.elementToBeClickable(featuredProductQtyDropdownMenuElements.get(index)));
        featuredProductQtyDropdownMenuElements.get(index).click();
    }

    //select set quantity for a set featured product method
    public void selectFeaturedProductQty(int index){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.elementToBeClickable(featuredProductFiveQtyOptionElements.get(index)));
        featuredProductFiveQtyOptionElements.get(index).click();
    }

    //click featured product name link list method
    public void clickFeaturedProductNameLink(int index){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.elementToBeClickable(featuredProductNameLinkElements.get(index)));
        featuredProductNameLinkElements.get(index).click();
    }

    //click featured product 'Add to wishlist' button list method
    public void clickFeaturedProductAddToWishlistButton(int index){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.elementToBeClickable(featuredProductAddToWishlistButtonElements.get(index)));
        featuredProductAddToWishlistButtonElements.get(index).click();
    }

    //click shopping cart 'View Cart' button list method
    public void clickViewCartButton(){
        Actions action = new Actions(driver);
        action.moveToElement(shoppingCartFormYourCartSectionViewCartButton).click().perform();
    }

    //home page product data getters
    //featured
    public List<String> getFeaturedProductName(){return featuredProductNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getFeaturedProductUnitPrice(){return featuredProductUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getFeaturedProductMarketPrice(){return featuredProductMarketPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    //bestsellers
    public List<String> getAsideBestsellerProductName(){return asideBestProductNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getAsideBestsellerProductUnitPrice(){return asideBestProductUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getAsideBestsellerProductMarketPrice(){return asideBestProductMarketPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //shopping cart form web element text getters
    public String getShoppingCartFormAdditionSuccessMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
        wait.until(ExpectedConditions.visibilityOf(shoppingCartFormAdditionSuccessMessage));
        return shoppingCartFormAdditionSuccessMessage.getText();
    }
    public String getShoppingCartFormYourCartSectionSubtitle() {return shoppingCartFormYourCartSectionSubtitle.getText();}
    //product data getters
    public String getShoppingCartFormProductNameLinkText() {return shoppingCartFormProductNameLink.getText();}
    public String getShoppingCartFormProductUnitPriceText() {return shoppingCartFormProductUnitPrice.getText();}
    public String getShoppingCartFormProductAltUnitPriceText() {return shoppingCartFormProductAltUnitPrice.getText();}
    public String getShoppingCartFormYourCartSectionItemCount() {return shoppingCartFormYourCartSectionItemCount.getText();}
    public String getShoppingCartFormYourCartSectionSubtotalPrice() {return shoppingCartFormYourCartSectionSubtotalPrice.getText();}

    //home page web element text getters
    public String getWelcomeDescription(){return welcomeDescription.getText();}
    public String getFeaturedProductsSectionTitle() {return featuredProductsTitle.getText();}
    public String getAsideBestsellerProductsSectionTitle() {return asideBestsellersSectionTitle.getText();}

    //home page web element assert methods
    public boolean isWelcomeImageLinkDisplayed() {return welcomeImageLink.isDisplayed();}
    public boolean isWelcomeDescriptionDisplayed() {return welcomeDescription.isDisplayed();}
    public boolean isFeaturedProductsTitleDisplayed() {return featuredProductsTitle.isDisplayed();}
    public boolean isAsideBestsellerSectionTitleDisplayed() {return asideBestsellersSectionTitle.isDisplayed();}
    //list elements
    public boolean isFeaturedProductImageDisplayed() {
        return featuredProductImageElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isFeaturedProductNameLinkDisplayed() {
        return featuredProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isFeaturedProductUnitPriceDisplayed() {
        return featuredProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isFeaturedProductMarketPriceDisplayed() {
        return featuredProductMarketPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isFeaturedProductReviewStarDisplayed() {
        return featuredProductReviewStarElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isFeaturedProductQtyDropdownMenuDisplayed() {
        return featuredProductQtyDropdownMenuElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isFeaturedProductAddToCartButtonDisplayed() {
        return featuredProductAddToCartButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isFeaturedProductAddToWishlistButtonDisplayed() {
        return featuredProductAddToWishlistButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    //bestsellers
    public boolean isAsideBestsellerProductImageDisplayed() {
        return asideBestProductImageElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAsideBestsellerProductNameLinkDisplayed() {
        return asideBestProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAsideBestsellerProductUnitPriceDisplayed() {
        return asideBestProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAsideBestsellerProductMarketPriceDisplayed() {
        return asideBestProductMarketPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    //shopping cart form
    public boolean isShoppingCartFormAdditionSuccessMessageDisplayed() {return shoppingCartFormAdditionSuccessMessage.isDisplayed();}
    public boolean isShoppingCartFormCloseButtonDisplayed() {return shoppingCartFormCloseButton.isDisplayed();}
    public boolean isShoppingCartFormProductThumbImageDisplayed() {return shoppingCartFormProductThumbImage.isDisplayed();}
    public boolean isShoppingCartFormProductNameLinkDisplayed() {return shoppingCartFormProductNameLink.isDisplayed();}
    public boolean isShoppingCartFormProductUnitPriceDisplayed() {return shoppingCartFormProductUnitPrice.isDisplayed();}
    public boolean isShoppingCartFormProductAltUnitPriceDisplayed() {return shoppingCartFormProductAltUnitPrice.isDisplayed();}
    public boolean isShoppingCartFormYourCartSectionSubtitleDisplayed() {return shoppingCartFormYourCartSectionSubtitle.isDisplayed();}
    public boolean isShoppingCartFormYourCartSectionItemCountDisplayed() {return shoppingCartFormYourCartSectionItemCount.isDisplayed();}
    public boolean isShoppingCartFormYourCartSectionSubtotalPriceDisplayed() {return shoppingCartFormYourCartSectionSubtotalPrice.isDisplayed();}
    public boolean isShoppingCartFormYourCartSectionViewCartButtonDisplayed() {return shoppingCartFormYourCartSectionViewCartButton.isDisplayed();}
    public boolean isShoppingCartFormContinueShoppingButtonDisplayed() {return shoppingCartFormContinueShoppingButton.isDisplayed();}
    public boolean isShoppingCartFormProceedToCheckoutButtonDisplayed() {return shoppingCartFormProceedToCheckoutButton.isDisplayed();}

}
