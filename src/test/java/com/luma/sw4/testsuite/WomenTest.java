package com.luma.sw4.testsuite;

import com.luma.sw4.pages.HomePage;
import com.luma.sw4.pages.WomenPage;
import com.luma.sw4.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {

    HomePage homepage=new HomePage();
    WomenPage womenPage=new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        //1. verifyTheSortByProductNameFilter
        // Mouse Hover on Women Menu
        Thread.sleep(2000);
        homepage.mouseHoverToWomenMenu();
        // Mouse Hover on Tops
        Thread.sleep(2000);
        homepage.mouseHoverToWomenTops();
        // Click on Jackets
        Thread.sleep(2000);
        homepage.clickOnJackets();
        // Select Sort By filter “Product Name”
        womenPage.selectSortByFilterProductName();
        // Verify the products name display in alphabetical order
        womenPage.verifyProductsNameAlphabeticalOrder();
    }
    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        //2. verifyTheSortByPriceFilter
        // Mouse Hover on Women Menu
        Thread.sleep(2000);
        homepage.mouseHoverToWomenMenu();
        // Mouse Hover on Tops
        Thread.sleep(2000);
        homepage.mouseHoverToWomenTops();
        // Click on Jackets
        Thread.sleep(2000);
        homepage.clickOnJackets();
        // Select Sort By filter “Price”
        womenPage.selectSortByFilterPrice();
        // Verify the products price display in Low to High
        womenPage.verifyProductsPriceLowToHigh();
    }

}
