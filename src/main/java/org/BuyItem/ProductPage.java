package org.BuyItem;

import com.microsoft.playwright.Page;
import org.testng.Assert;

public class ProductPage {
    Page page;
    private String title=".title";
    private String product="#add-to-cart-sauce-labs-backpack";
    private String cart=".shopping_cart_link";

    public ProductPage(Page page){
        this.page=page;
    }

    public void BuyItem(){
        String Titlepage = page.locator(title).textContent();
        Assert.assertEquals(Titlepage,"Products");
        page.locator(product).click();
        page.locator(cart).click();
    }
}
