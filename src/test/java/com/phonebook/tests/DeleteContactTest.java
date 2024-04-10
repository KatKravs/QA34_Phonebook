package com.phonebook.tests;

import com.phonebook.models.Contact;
import com.phonebook.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteContactTest extends TestBase {
    @BeforeMethod
    public void ensurePrecondition(){
        if(!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnSignOutButton();
        }
        //click on Login Link
        app.getUser().clickOnLoginLink();
        //enter email
        app.getUser().fillLoginRegisterForm(new User().setEmail( "kravs@gmail.com").setPassword( "Ghjjk87!hh"));
        //click on Login button
        app.getUser().clickOnLoginButton();

        app.getContact().clickOnAddLink();
        //enter name
        app.getContact().fillAddContactForm(new Contact().setName("Kate")
                .setLastName("Musienko")
                .setPhone("1234567890")
                .setEmail("gsfsf@gmail.com")
                .setAdress("Munic")
                .setDescription("gaolkeeper"));

        app.getContact().clickOnSaveButton();

    }
    @Test
    public void deleteContactPositiveTest(){
        int sizeBefore= app.getContact().sizeOfContacts();
        app.getContact().removeContact();
        app.getContact().pause(1000);
        int sizeAfter = app.getContact().sizeOfContacts();
        Assert.assertEquals(sizeAfter,sizeBefore-1);
    }

}
