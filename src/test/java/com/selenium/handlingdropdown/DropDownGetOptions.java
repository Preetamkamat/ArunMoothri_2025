package com.selenium.handlingdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownGetOptions {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        WebElement dropdownfield = driver.findElement(By.id("drop1"));
        Select select = new Select(dropdownfield);
        List<WebElement> listOfDropdownOptions = select.getOptions();
        for (WebElement list : listOfDropdownOptions) {
            System.out.println(list.getText());
        }
        driver.quit();
    }
}
