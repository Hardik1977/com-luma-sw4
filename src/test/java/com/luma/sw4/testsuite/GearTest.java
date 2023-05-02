package com.luma.sw4.testsuite;

import com.luma.sw4.pages.GearPage;
import com.luma.sw4.pages.HomePage;
import com.luma.sw4.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    HomePage homePage=new HomePage();
    GearPage gearPage=new GearPage();
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        //1. userShouldAddProductSuccessFullyToShoppingCart()
        // Mouse Hover on Gear Menu
        Thread.sleep(2000);
        homePage.hoverOnGearMenu();
        // Click on Bags
        Thread.sleep(2000);
        homePage.clickOnBags();
        // Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnOvernightDuffle();
        // Verify the text ‘Overnight Duffle’
        Assert.assertEquals(gearPage.getTextOvernightDuffle(),"Overnight Duffle","Error");
        // Change Qty 3
        gearPage.changeQuantity();
        // Click on ‘Add to Cart’ Button.
        gearPage.clickOnAddToCartButton();
        // Verify the text ‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(gearPage.gettextaddedDuffle(),"You added Overnight Duffle to your shopping cart.","Error");
        // Click on ‘shopping cart’ Link into message
        gearPage.clickOnShoppingCartLink();
        // Verify the product name ‘Overnight Duffle’
        Assert.assertEquals(gearPage.gettextCronusYogaPant(),"Overnight Duffle","Error");
        // Verify the Qty is ‘3’
        Assert.assertEquals(gearPage.getTextQuantity3(),"3","Error");
        // Verify the product price ‘$135.00’
        Assert.assertEquals(gearPage.getTextProductPrice(),"$135.00","Error");
        // Change Qty to ‘5’
        gearPage.changeQuantityTo5();
        // Click on ‘Update Shopping Cart’ button
        gearPage.clickOnUpdateShoppingCartButton();
        // Verify the product price ‘$225.00’
        Assert.assertEquals(gearPage.getTextProductPrice225(),"$225.00","Error");
    }
}
