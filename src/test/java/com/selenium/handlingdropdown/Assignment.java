package com.selenium.handlingdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Assignment {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.hdfcbank.com/");

        WebElement dropdownToggle = driver.findElement(By.cssSelector(".dropdown-toggle"));
        dropdownToggle.click();

// Wait until the dropdown menu is visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".dropdown1.dropdown-menu")));
        WebElement dropDownOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".dropdown1.dropdown-menu li")));
        Select select = new Select(dropDownOption);
        select.selectByVisibleText("Account");

// Get all <li> elements inside the dropdown
        List<WebElement> options = driver.findElements(By.cssSelector(".dropdown1.dropdown-menu li"));

// Loop through the options and click the one with desired text
        for (WebElement option : options) {
            System.out.println(option.getText());
            if (option.getText().equals("Credit Cards")) {
                option.click();
                break;
            }
        }








        /*Select select = new Select(productType);
        select.selectByIndex(3);
        List<WebElement> listProductType = select.getOptions();
        for (WebElement options : listProductType) {
            System.out.println(options.getText());
        }

//        List<WebElement> productType = driver.findElements(By.className("dropdown1 dropdown-menu"));
//        for (WebElement options : productType) {
//            System.out.println(options.getText());
//        }*/
    }

}