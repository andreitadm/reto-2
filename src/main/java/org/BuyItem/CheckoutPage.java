package org.BuyItem;

import com.microsoft.playwright.Page;
import org.testng.Assert;

public class CheckoutPage{

    Page page;
    private String titleinfo=".title";
    private String FirstName="#first-name";
    private String LastName="#last-name";
    private String ZipCode="#postal-code";
    private String buttonCheckout = "#continue";

    public CheckoutPage(Page page){
        this.page=page;
    }

    public void BuyingProduct(){
        String Titlepage = page.locator(titleinfo).textContent();
        Assert.assertEquals(Titlepage,"Checkout: Your Information");
        page.locator(FirstName).fill("Tester");
        page.locator(LastName).fill("Test");
        page.locator(ZipCode).fill("123456");
        page.locator(buttonCheckout).click();
    }
}
