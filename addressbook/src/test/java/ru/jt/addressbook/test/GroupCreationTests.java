package ru.jt.addressbook.test;

import org.testng.annotations.Test;
import ru.jt.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("Test name", "Test header", "Test footer"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

}
