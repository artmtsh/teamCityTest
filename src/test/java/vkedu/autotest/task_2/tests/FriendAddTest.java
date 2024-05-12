package vkedu.autotest.task_2.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import vkedu.autotest.task_2.pages.FriendsPage;

@Tag("Functional_test")
public class FriendAddTest extends BaseTest {
  private final String friendName = "technopol41";

  @DisplayName("Проверка добавления в друзья")
  @Test
  public void addToFriendsListTest() {
    FriendsPage friendsPage = new FriendsPage();
    friendsPage.addFriend(friendName);
    Assertions.assertEquals("Запрос отправлен", friendsPage.getResultText().trim(), "Неверный статус");
    friendsPage.cancelFriendRequest();
  }
}
