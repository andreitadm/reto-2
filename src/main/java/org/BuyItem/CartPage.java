package org.BuyItem;

import com.microsoft.playwright.Page;
import org.testng.Assert;

public class CartPage {

    Page page;
    private String titleproduct=".title";
    private String productname=".inventory_item_name";
    private String buttonCheckout="#checkout";

    public CartPage(Page page){
        this.page=page;
    }

    public void ProcessCheckout(){
        String Titlepage = page.locator(titleproduct).textContent();
        Assert.assertEquals(Titlepage,"Your Cart");
        String ProductName = page.locator(productname).textContent();
        Assert.assertEquals(ProductName,"Sauce Labs Backpack");
        page.locator(buttonCheckout).click();
    }
}
