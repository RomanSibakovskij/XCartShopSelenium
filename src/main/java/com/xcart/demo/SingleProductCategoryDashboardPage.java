package com.xcart.demo;

import com.xcart.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class SingleProductCategoryDashboardPage extends BasePage{

    //single product category dashboard page web elements
    @FindBy(xpath = "//div[@id='center-main']/h1")
    private WebElement singleProductCategoryDashboardPageTitle;
    @FindBy(xpath = "//div[@class='subcategory-descr']")
    private WebElement singleProductCategoryDashboardPageDescription;
    @FindBy(xpath = "//div[@class='title']/h2")
    private WebElement singleProductCategoryDashboardPageSubtitle;
    @FindBy(xpath = "//div[@class='sort-box']//span[1]/a")
    private WebElement singleProductCategoryDashboardProductSortLink;
    @FindBy(xpath = "//div[@class='sort-box']//span[2]/a")
    private WebElement singleProductCategoryDashboardProductPriceSortLink;
    @FindBy(xpath = "//div[@class='sort-box']//span[3]/a")
    private WebElement singleProductCategoryDashboardProductDefaultSortLink;
    @FindBy(xpath = "//div[@class='sort-box']//span[4]/a")
    private WebElement singleProductCategoryDashboardProductSalesSortLink;
    @FindBy(xpath = "//div[@class='right-box this-page-url']/a")
    private WebElement searchedProductDashboardThisPageURLLink;
    //list elements
    @FindBy(xpath = "//div[@class='products products-list products-div']//img")
    private List<WebElement> singleProductCategoryDashboardProductImageElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//div[@class='details']/a")
    private List<WebElement> singleProductCategoryDashboardProductNameLinkElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//div[@class='price-row']/span[1]")
    private List<WebElement> singleProductCategoryDashboardProductUnitPriceElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//div[@class='price-row']/span[2]")
    private List<WebElement> singleProductCategoryDashboardProductAltPriceElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//div[@class='creviews-vote-bar allow-add-rate']")
    private List<WebElement> singleProductCategoryDashboardProductReviewStarElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//ul[@class='star-4']//a")
    private List<WebElement> singleProductCategoryDashboardProductFourStarReviewElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//select")
    private List<WebElement> singleProductCategoryDashboardProductQtyDropdownMenuElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//select/option[@value='4']")
    private List<WebElement> singleProductCategoryDashboardSetProductFourQuantityOption;
    @FindBy(xpath = "//div[@class='products products-list products-div']//div[@class='buttons-row']/button[1]")
    private List<WebElement> singleProductCategoryDashboardProductAddToCartButtonElements;
    @FindBy(xpath = "//div[@class='products products-list products-div']//div[@class='buttons-row']/button[2]")
    private List<WebElement> singleProductCategoryDashboardProductAddToWishlistButtonElements;

    public SingleProductCategoryDashboardPage(WebDriver driver) {super(driver);}

    //click specific product 'Add to cart' button list method
    public void clickSetProductAddToCartButton(int index){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(870));
        wait.until(ExpectedConditions.elementToBeClickable(singleProductCategoryDashboardProductAddToCartButtonElements.get(index)));
        singleProductCategoryDashboardProductAddToCartButtonElements.get(index).click();
    }

    //single product dashboard page text element getters
    public String getSingleProductCategoryDashboardPageTitle() {return singleProductCategoryDashboardPageTitle.getText();}
    public String getSingleProductCategoryDashboardPageDescription() {return singleProductCategoryDashboardPageDescription.getText();}
    public String getSingleProductCategoryDashboardPageSubtitle() {return singleProductCategoryDashboardPageSubtitle.getText();}

    //product data getters
    public List<String> getSingleCategoryDashboardPageProductName(){return singleProductCategoryDashboardProductNameLinkElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getSingleCategoryDashboardPageProductUnitPrice(){return singleProductCategoryDashboardProductUnitPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getSingleCategoryDashboardPageProductAltPrice(){return singleProductCategoryDashboardProductAltPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}

    //single product category dashboard page web elements assert methods
    public boolean isSingleProductCategoryDashboardPageTitleDisplayed() {return singleProductCategoryDashboardPageTitle.isDisplayed();}
    public boolean isSingleProductCategoryDashboardPageSubtitleDisplayed() {return singleProductCategoryDashboardPageSubtitle.isDisplayed();}
    public boolean isSingleProductCategoryDashboardPageProductSortLinkDisplayed() {return singleProductCategoryDashboardProductSortLink.isDisplayed();}
    public boolean isSingleProductCategoryDashboardPageProductPriceSortLinkDisplayed() {return singleProductCategoryDashboardProductPriceSortLink.isDisplayed();}
    public boolean isSingleProductCategoryDashboardPageProductDefaultSortLinkDisplayed() {return singleProductCategoryDashboardProductDefaultSortLink.isDisplayed();}
    public boolean isSingleProductCategoryDashboardPageProductSalesSortLinkDisplayed() {return singleProductCategoryDashboardProductSalesSortLink.isDisplayed();}
    public boolean isSearchedProductDashboardPageThisPageURLDisplayed() {return searchedProductDashboardThisPageURLLink.isDisplayed();}
    //list elements
    public boolean isSingleProductCategoryDashboardPageProductImageDisplayed() {
        return singleProductCategoryDashboardProductImageElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleProductCategoryDashboardPageProductNameLinkDisplayed() {
        return singleProductCategoryDashboardProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleProductCategoryDashboardPageProductUnitPriceDisplayed() {
        return singleProductCategoryDashboardProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleProductCategoryDashboardPageProductAltPriceDisplayed() {
        return singleProductCategoryDashboardProductAltPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleProductCategoryDashboardPageProductReviewStarDisplayed() {
        return singleProductCategoryDashboardProductReviewStarElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleProductCategoryDashboardPageProductQtyDropdownMenuDisplayed() {
        return singleProductCategoryDashboardProductQtyDropdownMenuElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleProductCategoryDashboardPageProductAddToCartButtonDisplayed() {
        return singleProductCategoryDashboardProductAddToCartButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isSingleProductCategoryDashboardPageProductAddToWishlistButtonDisplayed() {
        return singleProductCategoryDashboardProductAddToWishlistButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
