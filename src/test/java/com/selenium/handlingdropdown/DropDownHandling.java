package com.selenium.handlingdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownHandling {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        WebElement dropdownfield = driver.findElement(By.id("drop1"));
        Select select = new Select(dropdownfield);
        select.selectByVisibleText("doc 3");
        System.out.println(select.getOptions());
        boolean selectdropdown = select.isMultiple();
        System.out.println(selectdropdown);
        Assert.assertTrue(selectdropdown);
/*        select.selectByValue();
        select.selectByIndex();
        */
        driver.quit();
    }
}
