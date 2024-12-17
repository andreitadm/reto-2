package org.BuyItem;

import com.microsoft.playwright.Page;
import org.testng.Assert;

public class OrderCompleted {

    Page page;
    private String titleinfo=".title";
    private String titleorder=".complete-header";

    public OrderCompleted (Page page){
        this.page=page;
    }

    public void PlacedOrder(){
        String Titlepage = page.locator(titleinfo).textContent();
        Assert.assertEquals(Titlepage,"Checkout: Complete!");
        String Titleproduct = page.locator(titleorder).textContent();
        Assert.assertEquals(Titleproduct,"Thank you for your order!");
    }
}
