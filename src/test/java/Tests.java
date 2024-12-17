import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.BuyItem.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests {

    PlaywrightFactory pf;
    Page page;

    HomePage homePage;
    ProductPage productPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    Overview overview;
    OrderCompleted orderCompleted;

    @BeforeTest
    public void setup(){
        pf = new PlaywrightFactory();
        page = pf.initBrowser();
        homePage = new HomePage(page);
        productPage = new ProductPage(page);
        cartPage = new CartPage(page);
        checkoutPage = new CheckoutPage(page);
        overview = new Overview(page);
        orderCompleted = new OrderCompleted(page);
    }

    @Test
    public void CompraItem(){
        homePage.getLogin();
        productPage.BuyItem();
        cartPage.ProcessCheckout();
        checkoutPage.BuyingProduct();
        overview.PlacingOrder();
        orderCompleted.PlacedOrder();
    }

    @AfterTest
    public void tearDown(){
        page.context().browser().close();
    }
}
