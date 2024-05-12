package vkedu.autotest.task_2.pages;

import vkedu.autotest.task_2.interfaces.LeftMenuInterface;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage implements LeftMenuInterface {
  public MainPage(){
    checkPage();
  }
  public static boolean checkUserFriends() {
    return $(USERS_FRIENDS_PAGE).isDisplayed();
  }

  public static boolean checkLogOutButton() {
    return $(CONFIRM_LOG_OUT_BUTTON).isDisplayed();
  }

  public void checkPage() {
    $(USER_PAGE).shouldBe(visible);
    $(USER_MAIN).shouldBe(visible);
    $(USER_MAIN).shouldBe(visible);
    $(USERS_FRIENDS_PAGE).shouldBe(visible);
    $(USERS_PHOTOS_PAGE).shouldBe(visible);
  }
}
