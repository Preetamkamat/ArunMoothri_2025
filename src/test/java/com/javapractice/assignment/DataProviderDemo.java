package com.javapractice.assignment;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
    @Test(dataProvider = "dp")
    public void loginResult(String email, String pwd) {
        System.out.println(email + pwd);
    }

    @DataProvider(name = "dp")
    public Object[][] loginData() {
        Object[][] data = {{"email1", "pwd1"},
                {"email2", "pwd2"}};
        return data;
    }
}
