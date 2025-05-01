package com.xcart.demo;

import com.xcart.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.util.*;

public class AccountPage extends BasePage{

    //address book page web elements
    @FindBy(xpath = "//h1")
    private WebElement accountPageTitle;
    @FindBy(xpath = "//div[@id='content-container']/table/tbody//a")
    private WebElement accountPageBreadcrumb;
    //links
    @FindBy(xpath = "//div[@id='top-links']/ul/li[1]/a")
    private WebElement accountDetailsLink;
    @FindBy(xpath = "//div[@id='top-links']/ul/li[2]/a")
    private WebElement addressBookLink;
    @FindBy(xpath = "//div[@id='top-links']/ul/li[3]/a")
    private WebElement orderHistoryLink;
    @FindBy(xpath = "//div[@id='top-links']/ul/li[4]/a")
    private WebElement returnsLink;
    @FindBy(xpath = "//div[@id='top-links']/ul/li[5]/a")
    private WebElement wishlistLink;
    @FindBy(xpath = "//a[@class='new-address']")
    private WebElement addAddressLink;

    public AccountPage(WebDriver driver) {super(driver);}

    //click 'Account Details' link method
    public void clickAccountDetailsLink() {accountDetailsLink.click();}

    //account page title getter
    public String getAccountPageTitle() {return accountPageTitle.getText();}

    //address book page web element assert methods
    public boolean isAccountBookPageTitleDisplayed() {return accountPageTitle.isDisplayed();}
    public boolean isAccountPageBreadcrumbDisplayed() {return accountPageBreadcrumb.isDisplayed();}
    public boolean isAccountDetailsLinkDisplayed() {return accountDetailsLink.isDisplayed();}
    public boolean isAddressBookLinkDisplayed() {return addressBookLink.isDisplayed();}
    public boolean isOrderHistoryLinkDisplayed() {return orderHistoryLink.isDisplayed();}
    public boolean isReturnsLinkDisplayed() {return returnsLink.isDisplayed();}
    public boolean isWishlistLinkDisplayed() {return wishlistLink.isDisplayed();}

}
