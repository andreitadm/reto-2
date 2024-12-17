package org.BuyItem;

import com.microsoft.playwright.Page;
import org.testng.Assert;

public class Overview{

    Page page;
    private String titleinfo=".title";
    private String Product=".inventory_item_name";
    private String finishbtn=".btn_action";

    public Overview (Page page){
        this.page=page;
    }

    public void PlacingOrder(){
        String Titlepage = page.locator(titleinfo).textContent();
        Assert.assertEquals(Titlepage,"Checkout: Overview");
        String Titleproduct = page.locator(Product).textContent();
        Assert.assertEquals(Titleproduct,"Sauce Labs Backpack");
        page.locator(finishbtn).click();
    }
}
