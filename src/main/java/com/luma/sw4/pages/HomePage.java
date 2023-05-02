package com.luma.sw4.pages;

import com.luma.sw4.utility.Utilities;
import org.openqa.selenium.By;

public class HomePage extends Utilities {

    By womenMenu=By.cssSelector("a[id='ui-id-4'] span:nth-child(1)");
    By womenTops=By.cssSelector("a[id='ui-id-9'] span:nth-child(1)");
    By womenJackets=By.cssSelector("a[id='ui-id-11'] span:nth-child(1)");
    By menMenu=By.cssSelector("li.level0.nav-3>a.level-top.ui-corner-all>span:nth-of-type(1)");
    By menBottoms=By.cssSelector("#ui-id-18 span");
    By menPants= By.cssSelector("#ui-id-23 span");
    By gearMenu=By.cssSelector("a[id='ui-id-6'] span:nth-child(2)");
    By bags=By.cssSelector("a[id='ui-id-25'] span");

    public void hoverOnGearMenu(){
        mouseHoverToElement(gearMenu);
    }
    public void clickOnBags(){
        mouseHoverToElementAndClick(bags);
    }

    public void mouseHoverToWomenMenu(){
        mouseHoverToElement(womenMenu);
    }
    public void mouseHoverToWomenTops(){
        mouseHoverToElement(womenTops);
    }
    public void clickOnJackets(){
        mouseHoverToElementAndClick(womenJackets);
    }
    public void mouseHoverToMenMenu(){
        mouseHoverToElement(menMenu);
    }
    public void mouseHoverToMenTops(){
        mouseHoverToElement(menBottoms);
    }
    public void clickOnPants(){
        mouseHoverToElementAndClick(menPants);
    }




}
