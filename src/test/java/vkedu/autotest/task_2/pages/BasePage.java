package vkedu.autotest.task_2.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import vkedu.autotest.task_2.interfaces.LeftMenuInterface;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BasePage {
  public void checkPage(){};

  public static void open() {
    Selenide.open("/");
  }
}
