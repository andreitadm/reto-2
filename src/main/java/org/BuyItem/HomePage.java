package org.BuyItem;

import com.microsoft.playwright.Page;

public class HomePage {
    Page page;
    private String username="#user-name";
    private String password="#password";
    private String buttonlogin="#login-button";

    public HomePage(Page page){
        this.page=page;
    }

    public void getLogin(){
        page.locator(username).fill("standard_user");
        page.locator(password).fill("secret_sauce");
        page.locator(buttonlogin).click();
    }
}

