package com.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {

    @Test(priority = 1)
    public void amazonTitleTest() {
        drivers.get("https://www.amazon.in/");

        Assert.assertTrue(drivers.getTitle().contains("Online Shopping"));

    }

    @Test(priority = 3)
    public void amazonLogoTest() {
        Assert.assertTrue(drivers.findElement(By.id("nav-logo")).isDisplayed());
    }
}
