package com.luma.sw4.testsuite;

import com.luma.sw4.pages.HomePage;
import com.luma.sw4.pages.MenPage;
import com.luma.sw4.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    HomePage homePage=new HomePage();
    MenPage menPage=new MenPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        //1. userShouldAddProductSuccessFullyToShoppingCart()
        // Mouse Hover on Men Menu
        Thread.sleep(2000);
        homePage.mouseHoverToMenMenu();
        // Mouse Hover on Bottoms
        Thread.sleep(2000);
        homePage.mouseHoverToMenTops();
        // Click on Pants
        Thread.sleep(2000);
        homePage.clickOnPants();
        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        menPage.hoverAndClickProduct();
        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        menPage.hoverAndClickProductColour();
        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        menPage.hoverAndClickOnAddToCartButton();
        // Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        Assert.assertEquals(menPage.getTextAddedPantToShoppingCart(),"You added Cronus Yoga Pant to your shopping cart.","Error");
        // Click on ‘shopping cart’ Link into message
        menPage.clickOnShoppingCart();
        // Verify the text ‘Shopping Cart.’
        Assert.assertEquals(menPage.getTextShoppingCart(),"Shopping Cart","Error");
        // Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(menPage.getTextCronusYogaPant(),"Cronus Yoga Pant","Error");
        // Verify the product size ‘32’
        Assert.assertEquals(menPage.getTextSize32(),"32","Error");
        // Verify the product colour ‘Black’
        Assert.assertEquals(menPage.getTextBlack(),"Black","Error");
    }
}
