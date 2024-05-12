package vkedu.autotest.task_2.pages;

import com.codeborne.selenide.Selenide;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import vkedu.autotest.task_2.interfaces.LeftMenuInterface;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class GroupPage extends BasePage implements LeftMenuInterface {
  private static final By JOIN_FIRST_GROUP_ON_PAGE_BUTTON = By.xpath(".//span[contains(text(),'Вступить')]/../..");
  private static final By LAST_FOLLOW_GROUP_BUTTON = By.xpath(".//div[@class='ucard-v __size-56 __rounded']");
  private static final By YOU_IN_GROUP_BUTTON = By.xpath(".//span[contains(text(), 'В группе')]");
  private static final By GROUP_JOINED = By.xpath(".//span[contains(text(),'Вы в группе')]");
  private static final By SEARCH_BAR = By.xpath(".//input[@placeholder='Поиск по группам']");
  private static final By CREATE_GROUP_BUTTON = By.xpath(".//a[contains(text(), 'Создать группу')]");
  private static final By OFFICIAL_GROUPS = By.xpath(".//a[@aria-label='Официальные']");
  private static final By DROPDOWN_MENU = By.xpath(".//div[@class='dropdown_n']");
  private static final By CONFIRM_BUTTON = By.xpath(".//input[@data-l='t,confirm']");

  public GroupPage() {
    MainPage mainPage = new MainPage();
    mainPage.goToUserGroups();
    checkPage();
  }

  @Override
  public void checkPage() {
    $(SEARCH_BAR).shouldBe(visible);
    $(CREATE_GROUP_BUTTON).shouldBe(visible);
    $(OFFICIAL_GROUPS).shouldBe(visible);
  }

  public void joinFirstGroup() {
    $(JOIN_FIRST_GROUP_ON_PAGE_BUTTON)
            .shouldBe(enabled, Duration.ofSeconds(5))
            .click();
  }
  public String getResultText() {
    return $(GROUP_JOINED).shouldBe(visible).innerText();
  }

  public void unfollowGroup() {
    $(LAST_FOLLOW_GROUP_BUTTON)
            .shouldBe(visible)
            .click();
    $(YOU_IN_GROUP_BUTTON)
            .shouldBe(visible)
            .click();
    $(DROPDOWN_MENU)
            .shouldBe(visible)
            .click();
    $(CONFIRM_BUTTON).shouldBe(visible).click();
  }
}
