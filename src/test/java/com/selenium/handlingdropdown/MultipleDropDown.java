package com.selenium.handlingdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleDropDown {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        WebElement listBoxField = driver.findElement(By.id("multiselect1"));
        Select select = new Select(listBoxField);
        System.out.println(select.isMultiple());
        select.selectByVisibleText("Audi");
        select.selectByIndex(1);
        select.selectByValue("Hyundaix");
        List<WebElement> listOfDropdownOptions = select.getOptions();
        for(WebElement list : listOfDropdownOptions){
            System.out.println(list.getText());
        }
        Thread.sleep(1000);
        driver.quit();
    }
}
