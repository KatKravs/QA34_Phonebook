package com.phonebook.tests;

import com.phonebook.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        if(!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnSignOutButton();
        }

    }


        @Test
        public void loginPositiveTest() {
            //click on Login link
            app.getUser().clickOnLoginLink();
            //enter email
            app.getUser().fillLoginRegisterForm(new User().setEmail( "kravs@gmail.com").setPassword( "Ghjjk87!hh"));
            //click on Login button
            app.getUser().clickOnLoginButton();
            //assert Sign out button is present
            Assert.assertTrue(app.getUser().isSignOutButtonPresent());
        }

    @Test
    public void loginNegativTestwithoutEmail() {
        //click on Login link
        app.getUser().clickOnLoginLink();
        //enter email
        app.getUser().fillLoginRegisterForm(new User().setPassword( "Ghjjk87!hh"));
        //click on Login button
        app.getUser().clickOnLoginButton();
        //assert Sign out button is present
        Assert.assertTrue(app.getUser().isAlertPresent());
    }


}
