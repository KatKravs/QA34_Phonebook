package com.phonebook.tests;

import com.phonebook.data.UserData;
import com.phonebook.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

public class CreateAccountTest extends TestBase {
    @BeforeMethod
    public void ensurePrecondition(){
        if(!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnSignOutButton();
        }
    }

    @Test
    public void createNewWithExistedEmailNegativTest(){
    //click on Login Link
    app.getUser().clickOnLoginLink();
    //enter email
    app.getUser().fillLoginRegisterForm(new User().setEmail(UserData.EMAIL).setPassword( UserData.PASSWORD));
    //click on Registration
    app.getUser().clickOnRegistrationButton();
    //assert Alert is present
    Assert.assertTrue(app.getUser().isAlertPresent());

}



    @Test(enabled = false)
    public void createNewAccountPositiveTest() {

        Random random = new Random();
        int i = random.nextInt(1000)+1000;
        //click on Login Link
        app.getUser().clickOnLoginLink();
        //enter email
        app.getUser().fillLoginRegisterForm(new User().setEmail( "kravs@gmail.com").setPassword( "Ghjjk87!hh"));
        //click on Registration
        app.getUser().clickOnRegistrationButton();
        //assert Sign Out button is present
        Assert.assertTrue(app.getUser().isSignOutButtonPresent());
    }

}
