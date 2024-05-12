package vkedu.autotest.task_2.tests;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import vkedu.autotest.task_2.pages.GroupPage;

public class GroupJoinTest extends BaseTest {
  @DisplayName("Проверка вступления в первую группы на странице групп")
  @Test
  public void joinFirstGroupTest() {
    GroupPage groupPage = new GroupPage();
    groupPage.checkPage();
    groupPage.joinFirstGroup();
    Assertions.assertEquals("Вы в группе", groupPage.getResultText(), "Статус не меняется");
    groupPage.goToUserGroups();
    groupPage.unfollowGroup();
  }
}
