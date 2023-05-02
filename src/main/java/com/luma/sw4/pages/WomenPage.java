package com.luma.sw4.pages;

import com.luma.sw4.utility.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenPage extends Utilities {

    By filterProduct = By.id("sorter");
    //By filterPrice=By.id("sorter");
    By textAlphabeticalOrder = By.xpath("//img[starts-with(@class,'product-image-photo')]");

    public void selectSortByFilterProductName() {
        selectByValueFromDropDown(filterProduct, "name");
    }

    public void selectSortByFilterPrice() {
        selectByValueFromDropDown(filterProduct, "price");
    }

    public void verifyProductsNameAlphabeticalOrder() {
        List<WebElement> elementList = findElementsFromWebPage(By.xpath("//img[starts-with(@class,'product-image-photo')]"));
        System.out.println("Total elements are : " + elementList.size());

        List<WebElement> elementListDisplay = findElementsFromWebPage(By.cssSelector(".products .product-item-info .product-item-name"));
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : elementListDisplay) {

            originalProductNameList.add(product.getText());
        }
        Collections.sort(originalProductNameList);
        System.out.println(originalProductNameList + "\n");

        List<WebElement> afterSortingElementList = findElementsFromWebPage(By.cssSelector(".products .product-item-info .product-item-name"));
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product : afterSortingElementList) {
            afterSortingProductName.add(product.getText());
        }
        System.out.println(afterSortingProductName);
        Assert.assertEquals(originalProductNameList, afterSortingProductName, "Not sorted in Alphabetical order");
    }

    public void verifyProductsPriceLowToHigh() {
        List<WebElement> originalList = findElementsFromWebPage(By.cssSelector("span[data-price-type='finalPrice']"));
        List<Double> originalProductPriceList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductPriceList.add(Double.valueOf(product.getText().replace("$", "")));
        }
        System.out.println("Before Sorting: " + originalProductPriceList);
        List<WebElement> afterSortingList = findElementsFromWebPage(By.cssSelector("span[data-price-type='finalPrice']"));
        List<Double> afterSortingProductPrice = new ArrayList<>();
        for (WebElement product : afterSortingList) {
            afterSortingProductPrice.add(Double.valueOf(product.getText().replace("$", "")));
        }
        Collections.sort(originalProductPriceList);
        System.out.println("After Sorting: " + afterSortingProductPrice);
        Assert.assertEquals(originalProductPriceList, afterSortingProductPrice, "Error");
    }


}
