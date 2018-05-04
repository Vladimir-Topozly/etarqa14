import org.testng.annotations.Test;

public class CreateGroupTest extends TestBase {

  @Test
  public void testCreateGroup(){
    openAddressbook();
    login();
    goToGroupsPage();
    initGroupCreation();
    fillGroupForm("name", "header", "footer");
    submitGroupCreation();
    returnToGroupsPage();
  }


}
