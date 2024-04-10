package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition(){
        if(! app.getHomePage().isHomeComponentPresents()){
            app.getHomePage().clickOnHomeLink();
        }
    }

    @Test
    public void isHomeComponentPresentTest() {
        System.out.println("Home component is "+ app.getHomePage().isHomeComponentPresents());
        Assert.assertTrue(app.getHomePage().isHomeComponentPresents());
    }
}
