package com.phonebook.tests;

import com.phonebook.models.Contact;
import com.phonebook.models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTest extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        if(!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnSignOutButton();
        }

        app.getUser().clickOnLoginLink();
        //enter email
        app.getUser().fillLoginRegisterForm(new User().setEmail( "kravs@gmail.com").setPassword( "Ghjjk87!hh"));
        //click on Login button
        app.getUser().clickOnLoginButton();

    }
    @Test
    public void addContactPositiveTest(){
        //click on Add link
        app.getContact().clickOnAddLink();
        //enter name
        app.getContact().fillAddContactForm(new Contact().setName("Kate")
                .setLastName("Musienko")
                .setPhone("1234567890")
                .setEmail("gsfsf@gmail.com")
                .setAdress("Munic")
                .setDescription("gaolkeeper"));


        app.getContact().clickOnSaveButton();
        Assert.assertTrue(app.getContact().isContactCreated("Kate"));

    }

    @AfterMethod
    public void postCondition(){
        app.getContact().removeContact();
    }
}
