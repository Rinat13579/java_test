package ru.jt.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("Test name", "Test header", "Test footer"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
