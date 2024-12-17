package org.BuyItem;

import com.microsoft.playwright.*;

public class PlaywrightFactory {
    Playwright playwright;
    Browser browser;
    BrowserContext browserContext;
    Page page;

    public Page initBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
        browserContext=browser.newContext();
        page=browserContext.newPage();
        page.navigate("https://www.saucedemo.com/");

        return page;
    }
}