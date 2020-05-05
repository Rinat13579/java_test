package ru.jt.addressbook.test;

import org.testng.annotations.Test;
import ru.jt.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation () {
        app.getNavigationHelper().gotoContactCreationPage();
        app.getContactHelper().fillContactForm(new ContactData("firstName", "middleName", "lastName"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }

}
