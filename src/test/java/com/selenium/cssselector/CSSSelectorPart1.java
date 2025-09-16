package com.selenium.cssselector;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class CSSSelectorPart1 {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        /*CSSSelector
        #id
        */
    }
}
