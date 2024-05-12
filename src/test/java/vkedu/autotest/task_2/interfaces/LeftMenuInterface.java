package vkedu.autotest.task_2.interfaces;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

 public interface LeftMenuInterface {
  By PUBLISH_BUTTON = By.xpath(".//button[@data-testid='ddm-button']");
  By USER_PAGE = By.xpath(".//a[@data-l='t,userPage']");
  By USER_MAIN = By.xpath(".//a[@data-l='t,userMain']");
  By HOBBY_PAGE = By.xpath(".//a[@data-l='t,hobby']");
  By USERS_FRIENDS_PAGE = By.xpath(".//a[@data-l='t,userFriend']");
  By USERS_PHOTOS_PAGE = By.xpath(".//a[@data-l='t,userFriend']");
  By USERS_GROUPS_PAGE = By.xpath(".//a[@data-l='t,userAltGroup']");
  By GAMES_PAGE = By.xpath(".//a[@data-l='t,appsShowcaseHD']");
  By USERS_GIFTS_PAGE = By.xpath(".//a[@data-l='t,giftsFront']");
  By RECOMMENDATIONS_PAGE = By.xpath(".//a[@data-l='t,discovery']");
  By APPS_PAGE = By.xpath(".//a[@data-l='t,bizApps']");
  By DATING_APPS_PAGE = By.xpath(".//a[@data-l='t,appsDating']");
  By PROFILE_SETTINGS = By.xpath(".//button[@aria-label='Настройки профиля']");
  By LOG_OUT_BUTTON = By.xpath(".//a[@data-l='t,logout']");
  By CONFIRM_LOG_OUT_BUTTON = By.xpath(".//input[@data-l='t,logout']");

   default void goToPublish() {
    $(PUBLISH_BUTTON).shouldBe(visible).click();
  }

   default void goToUserPage() {
    $(USER_PAGE).shouldBe(visible).click();
  }

   default void goToUserMain() {
    $(USER_MAIN).shouldBe(visible).click();
  }

   default void goTohobby() {
    $(HOBBY_PAGE).shouldBe(visible).click();
  }

   default void goToUserFriends() {
    $(USERS_FRIENDS_PAGE).shouldBe(visible).click();
  }

   default void goToUserPhotos() {
    $(USERS_PHOTOS_PAGE).shouldBe(visible).click();
  }

   default void goToUserGroups() {
    $(USERS_GROUPS_PAGE).shouldBe(visible).click();
  }

   default void goToGames() {
    $(GAMES_PAGE).shouldBe(visible).click();
  }

   default void goToUserGifts() {
    $(USERS_GIFTS_PAGE).shouldBe(visible).click();
  }

   default void goToUserRecommendations() {
    $(RECOMMENDATIONS_PAGE).shouldBe(visible).click();
  }

   default void goToApps() {
    $(APPS_PAGE).shouldBe(visible).click();
  }

   default void goToAppsDating() {
    $(DATING_APPS_PAGE).shouldBe(visible).click();
  }

   default void logOut() {
    $(PROFILE_SETTINGS).shouldBe(visible).click();
    $(LOG_OUT_BUTTON).shouldBe(visible).click();
    $(CONFIRM_LOG_OUT_BUTTON).shouldBe(visible).click();
  }
}
