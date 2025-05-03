package com.xcart.demo;

import com.xcart.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.util.*;
import java.time.Duration;
import java.util.stream.Collectors;

public class ProductsMapPage extends BasePage {

    //products map page web elements
    @FindBy(xpath = "//div[@id='center-main']/h1")
    private WebElement productsMapPageTitle;
    //list elements
    @FindBy(xpath = "//div[@class='pmap_letters']//a")
    private List<WebElement> productsMapPageLetterListElements;
    @FindBy(xpath = "//div[@class='content']/ul[@class='simple-list-left width-100 navigation-bar'][1]/li//a")
    private List<WebElement> productsMapPageUpperPaginationElements;
    @FindBy(xpath = "//div[@class='content']/ul[@class='simple-list-left width-100 navigation-bar'][2]/li//a")
    private List<WebElement> productsMapPageLowerPaginationElements;
    //product section
    @FindBy(xpath = "//div[@class='products products-list products-div']//img")
    private List<WebElement> productsMapPageProductImageElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//div[@class='details']/a")
    private List<WebElement> productsMapPageProductNameLinkElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//div[@class='price-row']/span[1]")
    private List<WebElement> productsMapPageProductUnitPriceElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//div[@class='price-row']/span[2]")
    private List<WebElement> productsMapPageProductAltPriceElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//div[@class='creviews-rating-box']")
    private List<WebElement> productsMapPageProductRatingStarElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//select")
    private List<WebElement> productsMapPageProductQtyDropdownMenuElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//select/option[@value='7']")
    private List<WebElement> productsMapPageSetProductQtySevenOptionElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//div[@class='buttons-row']/button[1]")
    private List<WebElement> productsMapPageProductAddToCartButtonElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//div[@class='buttons-row']/button[2]")
    private List<WebElement> productsMapPageProductAddToWishlistElements;

    public ProductsMapPage(WebDriver driver) {super(driver);}

    //product map page text element getter
    public String getProductsMapPageTitle() {return productsMapPageTitle.getText();}

    //product map page web element assert methods
    public boolean isProductsMapPageTitleDisplayed() {return productsMapPageTitle.isDisplayed();}
    //list elements
    public boolean isProductsMapPageLetterListDisplayed() {
        return productsMapPageLetterListElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductsMapPageUpperPaginationDisplayed() {
        return productsMapPageUpperPaginationElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductsMapPageProductImageDisplayed() {
        return productsMapPageProductImageElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductsMapPageProductNameLinkDisplayed() {
        return productsMapPageProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductsMapPageProductUnitPriceDisplayed() {
        return productsMapPageProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductsMapPageProductAltPriceDisplayed() {
        return productsMapPageProductAltPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductsMapPageProductRatingStarDisplayed() {
        return productsMapPageProductRatingStarElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductsMapPageProductQtyDropdownMenuDisplayed() {
        return productsMapPageProductQtyDropdownMenuElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductsMapPageProductAddToCartButtonDisplayed() {
        return productsMapPageProductAddToCartButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductsMapPageProductAddToWishlistDisplayed() {
        return productsMapPageProductAddToWishlistElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductsMapPageLowerPaginationDisplayed() {
        return productsMapPageLowerPaginationElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
