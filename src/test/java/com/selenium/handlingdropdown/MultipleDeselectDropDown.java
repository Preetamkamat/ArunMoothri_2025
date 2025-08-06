package com.selenium.handlingdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleDeselectDropDown {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        WebElement listBoxField = driver.findElement(By.id("multiselect1"));
        Select select = new Select(listBoxField);
        System.out.println(select.isMultiple());
        select.selectByVisibleText("Audi");
        select.selectByIndex(0);
        select.selectByValue("Hyundaix");
        WebElement optionsGetFirst = select.getFirstSelectedOption();
        System.out.println("getFirstSelectedOption:" + optionsGetFirst.getText());
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        for (WebElement options : selectedOptions) {
            System.out.println(options.getText());
        }

//        List<WebElement> listOfDropdownOptions = select.getOptions();
//        for (WebElement list : listOfDropdownOptions) {
//            System.out.println(list.getText());
//        }
        select.deselectAll();
        // select.deselectByVisibleText("Audi");
        //select.deselectByIndex(1);
        //select.deselectByValue("Hyundaix");
        Thread.sleep(1000);
        driver.quit();
    }

}
