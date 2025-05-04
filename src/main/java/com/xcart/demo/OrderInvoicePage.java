package com.xcart.demo;

import com.xcart.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.util.*;
import java.util.stream.Collectors;

public class OrderInvoicePage extends BasePage {

    //order invoice page web elements
    @FindBy(xpath = "//h1")
    private WebElement orderInvoicePageTitle;
    @FindBy(xpath = "//div[@class='title']/h2")
    private WebElement orderInvoicePageSubtitle;
    @FindBy(xpath = "//div[@id='center-main']/div[1]/div[2]")
    private WebElement orderInvoiceOrderPlacementSuccessMessage;
    @FindBy(xpath = "//a[@class='simple-button']")
    private WebElement orderInvoicePrintInvoiceLink;
    //order invoice table elements
    @FindBy(xpath = "//div[@class='invoice-company-icon']/img")
    private WebElement orderInvoiceXCartLogo;
    //invoice upper section
    @FindBy(xpath = "//div[@class='invoice-data-box']//tbody//td[1]")
    private WebElement orderInvoiceColumnOne;
    @FindBy(xpath = "//div[@class='invoice-data-box']//tbody//td[2]")
    private WebElement orderInvoiceColumnTwo;
    //table
    @FindBy(xpath = "//table[@class='invoice-personal-info']//tr[1]/td[1]")
    private WebElement orderInvoiceOrderEmailSubtext;
    @FindBy(xpath = "//table[@class='invoice-personal-info']//tr[1]/td[2]")
    private WebElement orderInvoiceOrderEmail;
    //billing address column
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[1]/td[1]")
    private WebElement orderInvoiceBillingAddressSubtext;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[1]//tbody/tr[1]/td[1]")
    private WebElement orderInvoiceBillingAddressFirstNameSubtext;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[1]//tbody/tr[1]/td[2]")
    private WebElement orderInvoiceBillingAddressFirstName;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[1]//tbody/tr[2]/td[1]")
    private WebElement orderInvoiceBillingAddressLastNameSubtext;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[1]//tbody/tr[2]/td[2]")
    private WebElement orderInvoiceBillingAddressLastName;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[1]//tbody/tr[3]/td[1]")
    private WebElement orderInvoiceBillingAddress1Subtext;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[1]//tbody/tr[3]/td[2]")
    private WebElement orderInvoiceBillingAddress;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[1]//tbody/tr[4]/td[1]")
    private WebElement orderInvoiceBillingAddressCitySubtext;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[1]//tbody/tr[4]/td[2]")
    private WebElement orderInvoiceBillingAddressCity;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[1]//tbody/tr[5]/td[1]")
    private WebElement orderInvoiceBillingAddressStateSubtext;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[1]//tbody/tr[5]/td[2]")
    private WebElement orderInvoiceBillingAddressState;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[1]//tbody/tr[6]/td[1]")
    private WebElement orderInvoiceBillingAddressCountrySubtext;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[1]//tbody/tr[6]/td[2]")
    private WebElement orderInvoiceBillingAddressCountry;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[1]//tbody/tr[7]/td[1]")
    private WebElement orderInvoiceBillingAddressPostCodeSubtext;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[1]//tbody/tr[7]/td[2]")
    private WebElement orderInvoiceBillingAddressPostCode;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[1]//tbody/tr[8]/td[1]")
    private WebElement orderInvoiceBillingAddressPhoneSubtext;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[1]//tbody/tr[8]/td[2]")
    private WebElement orderInvoiceBillingAddressPhone;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[1]//tbody/tr[9]/td[1]")
    private WebElement orderInvoiceBillingAddressFaxSubtext;
    //shipping address column
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[1]/td[3]")
    private WebElement orderInvoiceShippingAddressSubtext;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[3]//tbody/tr[1]/td[1]")
    private WebElement orderInvoiceShippingAddressFirstNameSubtext;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[3]//tbody/tr[1]/td[2]")
    private WebElement orderInvoiceShippingAddressFirstName;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[3]//tbody/tr[2]/td[1]")
    private WebElement orderInvoiceShippingAddressLastNameSubtext;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[3]//tbody/tr[2]/td[2]")
    private WebElement orderInvoiceShippingAddressLastName;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[3]//tbody/tr[3]/td[1]")
    private WebElement orderInvoiceShippingAddress1Subtext;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[3]//tbody/tr[3]/td[2]")
    private WebElement orderInvoiceShippingAddress;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[3]//tbody/tr[4]/td[1]")
    private WebElement orderInvoiceShippingAddressCitySubtext;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[3]//tbody/tr[4]/td[2]")
    private WebElement orderInvoiceShippingAddressCity;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[3]//tbody/tr[5]/td[1]")
    private WebElement orderInvoiceShippingAddressStateSubtext;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[3]//tbody/tr[5]/td[2]")
    private WebElement orderInvoiceShippingAddressState;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[3]//tbody/tr[6]/td[1]")
    private WebElement orderInvoiceShippingAddressCountrySubtext;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[3]//tbody/tr[6]/td[2]")
    private WebElement orderInvoiceShippingAddressCountry;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[3]//tbody/tr[7]/td[1]")
    private WebElement orderInvoiceShippingAddressPostCodeSubtext;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[3]//tbody/tr[7]/td[2]")
    private WebElement orderInvoiceShippingAddressPostCode;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[3]//tbody/tr[8]/td[1]")
    private WebElement orderInvoiceShippingAddressPhoneSubtext;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[3]//tbody/tr[8]/td[2]")
    private WebElement orderInvoiceShippingAddressPhone;
    @FindBy(xpath = "//table[@class='invoice-address-box']/tbody/tr[3]/td[3]//tbody/tr[9]/td[1]")
    private WebElement orderInvoiceShippingAddressFaxSubtext;
    //order products table elements
    @FindBy(xpath = "//p[@class='invoice-products-title']")
    private WebElement orderInvoiceProductsOrderedSubtext;
    //list elements
    @FindBy(xpath = "//table[@class='invoice-products']//tr[2]/td[1]")
    private List<WebElement> orderInvoiceProductSKUCodeElements;
    @FindBy(xpath = "//table[@class='invoice-products']//tr[2]/td[2]")
    private List<WebElement> orderInvoiceProductDetailsElements;
    @FindBy(xpath = "//table[@class='invoice-products']//tr[2]/td[3]")
    private List<WebElement> orderInvoiceProductItemPriceElements;
    @FindBy(xpath = "//table[@class='invoice-products']//tr[2]/td[4]")
    private List<WebElement> orderInvoiceProductQtyElements;
    @FindBy(xpath = "//table[@class='invoice-products']//tr[2]/td[5]")
    private List<WebElement> orderInvoiceProductTotalPriceElements;
    //singular table elements
    @FindBy(xpath = "//table[@class='invoice-totals']//tr[1]/td[1]")
    private WebElement orderInvoiceProductsOrderSubtotalPriceSubtext;
    @FindBy(xpath = "//table[@class='invoice-totals']//tr[1]/td[2]")
    private WebElement orderInvoiceProductsOrderSubtotalPrice;
    @FindBy(xpath = "//table[@class='invoice-totals']//tr[2]/td[1]")
    private WebElement orderInvoiceProductsOrderShippingPriceSubtext;
    @FindBy(xpath = "//table[@class='invoice-totals']//tr[2]/td[2]")
    private WebElement orderInvoiceProductsOrderShippingPrice;
    @FindBy(xpath = "//table[@class='invoice-totals']//tr[3]/td[1]")
    private WebElement orderInvoiceProductsOrderPaymentMethodSurchargeSubtext;
    @FindBy(xpath = "//table[@class='invoice-totals']//tr[3]/td[2]")
    private WebElement orderInvoiceProductsOrderPaymentMethodSurcharge;
    @FindBy(xpath = "//table[@class='invoice-totals']//tr[4]/td[1]")
    private WebElement orderInvoiceProductsOrderTotalPriceSubtext;
    @FindBy(xpath = "//table[@class='invoice-totals']//tr[4]/td[2]")
    private WebElement orderInvoiceProductsOrderTotalPrice;
    @FindBy(xpath = "//div[@class='invoice-bottom-note']")
    private WebElement orderInvoiceThankYouMessage;
    @FindBy(xpath = "//div[@class='button main-button']/a")
    private WebElement orderInvoiceContinueShoppingButton;

    public OrderInvoicePage(WebDriver driver) {super(driver);}

    //order invoice page order data getters
    public List<String> getOrderInvoiceProductSKU(){return orderInvoiceProductSKUCodeElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getOrderInvoiceProductDetails(){return orderInvoiceProductDetailsElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getOrderInvoiceProductItemPrice(){return orderInvoiceProductItemPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getOrderInvoiceProductQty(){return orderInvoiceProductQtyElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public List<String> getOrderInvoiceProductTotalPrice(){return orderInvoiceProductTotalPriceElements.stream().map(WebElement::getText).collect(Collectors.toList());}
    public String getOrderInvoiceProductOrderSubtotalPrice(){return orderInvoiceProductsOrderSubtotalPriceSubtext.getText();}
    public String getOrderInvoiceProductOrderShippingPrice(){return orderInvoiceProductsOrderShippingPriceSubtext.getText();}
    public String getOrderInvoiceProductOrderPaymentMethodSurcharge(){return orderInvoiceProductsOrderPaymentMethodSurcharge.getText();}
    public String getOrderInvoiceProductOrderTotalPrice(){return orderInvoiceProductsOrderTotalPrice.getText();}

    //order invoice page text element getters
    public String getOrderInvoicePageTitle() {return orderInvoicePageTitle.getText();}
    public String getOrderInvoicePageSubtitle() {return orderInvoicePageSubtitle.getText();}
    public String getOrderInvoiceOrderPlacementSuccessMessage() {return orderInvoiceOrderPlacementSuccessMessage.getText();}
    //billing address column
    public String getOrderInvoiceBillingAddressSubtext() {return orderInvoiceBillingAddressSubtext.getText();}
    public String getOrderInvoiceBillingAddressFirstNameSubtext() {return orderInvoiceBillingAddressFirstNameSubtext.getText();}
    public String getOrderInvoiceBillingAddressLastNameSubtext() {return orderInvoiceBillingAddressLastNameSubtext.getText();}
    public String getOrderInvoiceBillingAddress1Subtext() {return orderInvoiceBillingAddress1Subtext.getText();}
    public String getOrderInvoiceBillingAddressCitySubtext() {return orderInvoiceBillingAddressCitySubtext.getText();}
    public String getOrderInvoiceBillingAddressStateSubtext() {return orderInvoiceBillingAddressStateSubtext.getText();}
    public String getOrderInvoiceBillingAddressCountrySubtext() {return orderInvoiceBillingAddressCountrySubtext.getText();}
    public String getOrderInvoiceBillingAddressPostCodeSubtext() {return orderInvoiceBillingAddressPostCodeSubtext.getText();}
    public String getOrderInvoiceBillingAddressPhoneSubtext() {return orderInvoiceBillingAddressPhoneSubtext.getText();}
    public String getOrderInvoiceBillingAddressFaxSubtext() {return orderInvoiceBillingAddressFaxSubtext.getText();}
    //shipping address column
    public String getOrderInvoiceShippingAddressSubtext() {return orderInvoiceShippingAddressSubtext.getText();}
    public String getOrderInvoiceShippingAddressFirstNameSubtext() {return orderInvoiceShippingAddressFirstNameSubtext.getText();}
    public String getOrderInvoiceShippingAddressLastNameSubtext() {return orderInvoiceShippingAddressLastNameSubtext.getText();}
    public String getOrderInvoiceShippingAddress1Subtext() {return orderInvoiceShippingAddress1Subtext.getText();}
    public String getOrderInvoiceShippingAddressCitySubtext() {return orderInvoiceShippingAddressCitySubtext.getText();}
    public String getOrderInvoiceShippingAddressStateSubtext() {return orderInvoiceShippingAddressStateSubtext.getText();}
    public String getOrderInvoiceShippingAddressCountrySubtext() {return orderInvoiceShippingAddressCountrySubtext.getText();}
    public String getOrderInvoiceShippingAddressPostCodeSubtext() {return orderInvoiceShippingAddressPostCodeSubtext.getText();}
    public String getOrderInvoiceShippingAddressPhoneSubtext() {return orderInvoiceShippingAddressPhoneSubtext.getText();}
    public String getOrderInvoiceShippingAddressFaxSubtext() {return orderInvoiceShippingAddressFaxSubtext.getText();}
    //order products table
    public String getOrderInvoiceProductsOrderedSubtext() {return orderInvoiceProductsOrderedSubtext.getText();}
    public String getOrderInvoiceProductsOrderSubtotalPriceSubtext() {return orderInvoiceProductsOrderSubtotalPriceSubtext.getText();}
    public String getOrderInvoiceProductsOrderShippingPriceSubtext() {return orderInvoiceProductsOrderShippingPriceSubtext.getText();}
    public String getOrderInvoiceProductsOrderPaymentMethodSurchargeSubtext() {return orderInvoiceProductsOrderPaymentMethodSurchargeSubtext.getText();}
    public String getOrderInvoiceProductsOrderTotalPriceSubtext() {return orderInvoiceProductsOrderTotalPriceSubtext.getText();}
    public String getOrderInvoiceThankYouMessage() {return orderInvoiceThankYouMessage.getText();}

    //order invoice page web element assert methods
    public boolean isOrderInvoicePageTitleDisplayed() {return orderInvoicePageTitle.isDisplayed();}
    public boolean isOrderInvoicePageSubtitleDisplayed() {return orderInvoicePageSubtitle.isDisplayed();}
    public boolean isOrderInvoiceOrderPlacementSuccessMessageDisplayed() {return orderInvoiceOrderPlacementSuccessMessage.isDisplayed();}
    public boolean isOrderInvoicePagePrintInvoiceLinkDisplayed() {return orderInvoicePrintInvoiceLink.isDisplayed();}
    //order invoice table
    public boolean isOrderInvoiceXCartLogoDisplayed() {return orderInvoiceXCartLogo.isDisplayed();}
    //invoice upper section
    public boolean isOrderInvoiceColumnOneDisplayed() {return orderInvoiceColumnOne.isDisplayed();}
    public boolean isOrderInvoiceColumnTwoDisplayed() {return orderInvoiceColumnTwo.isDisplayed();}
    //table
    public boolean isOrderInvoiceOrderEmailSubtextDisplayed() {return orderInvoiceOrderEmailSubtext.isDisplayed();}
    public boolean isOrderInvoiceOrderEmailDisplayed() {return orderInvoiceOrderEmail.isDisplayed();}
    //billing address column
    public boolean isOrderInvoiceBillingAddressSubtextDisplayed() {return orderInvoiceBillingAddressSubtext.isDisplayed();}
    public boolean isOrderInvoiceBillingAddressFirstNameSubtextDisplayed() {return orderInvoiceBillingAddressFirstNameSubtext.isDisplayed();}
    public boolean isOrderInvoiceBillingAddressFirstNameDisplayed() {return orderInvoiceBillingAddressFirstName.isDisplayed();}
    public boolean isOrderInvoiceBillingAddressLastNameSubtextDisplayed() {return orderInvoiceBillingAddressLastNameSubtext.isDisplayed();}
    public boolean isOrderInvoiceBillingAddressLastNameDisplayed() {return orderInvoiceBillingAddressLastName.isDisplayed();}
    public boolean isOrderInvoiceBillingAddress1SubtextDisplayed() {return orderInvoiceBillingAddress1Subtext.isDisplayed();}
    public boolean isOrderInvoiceBillingAddressDisplayed() {return orderInvoiceBillingAddress.isDisplayed();}
    public boolean isOrderInvoiceBillingAddressCitySubtextDisplayed() {return orderInvoiceBillingAddressCitySubtext.isDisplayed();}
    public boolean isOrderInvoiceBillingAddressCityDisplayed() {return orderInvoiceBillingAddressCity.isDisplayed();}
    public boolean isOrderInvoiceBillingAddressStateSubtextDisplayed() {return orderInvoiceBillingAddressStateSubtext.isDisplayed();}
    public boolean isOrderInvoiceBillingAddressStateDisplayed() {return orderInvoiceBillingAddressState.isDisplayed();}
    public boolean isOrderInvoiceBillingAddressCountrySubtextDisplayed() {return orderInvoiceBillingAddressCountrySubtext.isDisplayed();}
    public boolean isOrderInvoiceBillingAddressCountryDisplayed() {return orderInvoiceBillingAddressCountry.isDisplayed();}
    public boolean isOrderInvoiceBillingAddressPostCodeSubtextDisplayed() {return orderInvoiceBillingAddressPostCodeSubtext.isDisplayed();}
    public boolean isOrderInvoiceBillingAddressPostCodeDisplayed() {return orderInvoiceBillingAddressPostCode.isDisplayed();}
    public boolean isOrderInvoiceBillingAddressPhoneSubtextDisplayed() {return orderInvoiceBillingAddressPhoneSubtext.isDisplayed();}
    public boolean isOrderInvoiceBillingAddressPhoneDisplayed() {return orderInvoiceBillingAddressPhone.isDisplayed();}
    public boolean isOrderInvoiceBillingAddressFaxSubtextDisplayed() {return orderInvoiceBillingAddressFaxSubtext.isDisplayed();}
    //shipping address column
    public boolean isOrderInvoiceShippingAddressSubtextDisplayed() {return orderInvoiceShippingAddressSubtext.isDisplayed();}
    public boolean isOrderInvoiceShippingAddressFirstNameSubtextDisplayed() {return orderInvoiceShippingAddressFirstNameSubtext.isDisplayed();}
    public boolean isOrderInvoiceShippingAddressFirstNameDisplayed() {return orderInvoiceShippingAddressFirstName.isDisplayed();}
    public boolean isOrderInvoiceShippingAddressLastNameSubtextDisplayed() {return orderInvoiceShippingAddressLastNameSubtext.isDisplayed();}
    public boolean isOrderInvoiceShippingAddressLastNameDisplayed() {return orderInvoiceShippingAddressLastName.isDisplayed();}
    public boolean isOrderInvoiceShippingAddress1SubtextDisplayed() {return orderInvoiceShippingAddress1Subtext.isDisplayed();}
    public boolean isOrderInvoiceShippingAddressDisplayed() {return orderInvoiceShippingAddress.isDisplayed();}
    public boolean isOrderInvoiceShippingAddressCitySubtextDisplayed() {return orderInvoiceShippingAddressCitySubtext.isDisplayed();}
    public boolean isOrderInvoiceShippingAddressCityDisplayed() {return orderInvoiceShippingAddressCity.isDisplayed();}
    public boolean isOrderInvoiceShippingAddressStateSubtextDisplayed() {return orderInvoiceShippingAddressStateSubtext.isDisplayed();}
    public boolean isOrderInvoiceShippingAddressStateDisplayed() {return orderInvoiceShippingAddressState.isDisplayed();}
    public boolean isOrderInvoiceShippingAddressCountrySubtextDisplayed() {return orderInvoiceShippingAddressCountrySubtext.isDisplayed();}
    public boolean isOrderInvoiceShippingAddressCountryDisplayed() {return orderInvoiceShippingAddressCountry.isDisplayed();}
    public boolean isOrderInvoiceShippingAddressPostCodeSubtextDisplayed() {return orderInvoiceShippingAddressPostCodeSubtext.isDisplayed();}
    public boolean isOrderInvoiceShippingAddressPostCodeDisplayed() {return orderInvoiceShippingAddressPostCode.isDisplayed();}
    public boolean isOrderInvoiceShippingAddressPhoneSubtextDisplayed() {return orderInvoiceShippingAddressPhoneSubtext.isDisplayed();}
    public boolean isOrderInvoiceShippingAddressPhoneDisplayed() {return orderInvoiceShippingAddressPhone.isDisplayed();}
    public boolean isOrderInvoiceShippingAddressFaxSubtextDisplayed() {return orderInvoiceShippingAddressFaxSubtext.isDisplayed();}
    //order products table elements
    public boolean isOrderInvoiceProductsOrderedSubtextDisplayed() {return orderInvoiceProductsOrderedSubtext.isDisplayed();}
    //list elements
    public boolean isOrderInvoiceProductSKUCodeDisplayed(){
        return orderInvoiceProductSKUCodeElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderInvoiceProductDetailsDisplayed(){
        return orderInvoiceProductDetailsElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderInvoiceProductItemPriceDisplayed(){
        return orderInvoiceProductItemPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderInvoiceProductQtyDisplayed(){
        return orderInvoiceProductQtyElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isOrderInvoiceProductTotalPriceDisplayed(){
        return orderInvoiceProductTotalPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    //singular table elements
    public boolean isOrderInvoiceProductsOrderSubtotalPriceSubtextDisplayed(){return orderInvoiceProductsOrderSubtotalPriceSubtext.isDisplayed();}
    public boolean isOrderInvoiceProductsOrderSubtotalPriceDisplayed() {return orderInvoiceProductsOrderSubtotalPrice.isDisplayed();}
    public boolean isOrderInvoiceProductsOrderShippingPriceSubtextDisplayed() {return orderInvoiceProductsOrderShippingPriceSubtext.isDisplayed();}
    public boolean isOrderInvoiceProductsOrderShippingPriceDisplayed() {return orderInvoiceProductsOrderShippingPrice.isDisplayed();}
    public boolean isOrderInvoiceProductsOrderPaymentMethodSurchargeSubtextDisplayed() {return orderInvoiceProductsOrderPaymentMethodSurchargeSubtext.isDisplayed();}
    public boolean isOrderInvoiceProductsOrderPaymentMethodSurchargeDisplayed() {return orderInvoiceProductsOrderPaymentMethodSurcharge.isDisplayed();}
    public boolean isOrderInvoiceProductsOrderTotalPriceSubtextDisplayed(){return orderInvoiceProductsOrderTotalPriceSubtext.isDisplayed();}
    public boolean isOrderInvoiceProductsOrderTotalPriceDisplayed() {return orderInvoiceProductsOrderTotalPrice.isDisplayed();}
    public boolean isOrderInvoiceThankYouMessageDisplayed(){return orderInvoiceThankYouMessage.isDisplayed();}
    public boolean isOrderInvoiceContinueShoppingButtonDisplayed() {return orderInvoiceContinueShoppingButton.isDisplayed();}

}
