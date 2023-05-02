package com.luma.sw4.testbase;

import com.luma.sw4.propertyreader.PropertyReader;
import com.luma.sw4.utility.Utilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utilities {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp() {
        selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}
