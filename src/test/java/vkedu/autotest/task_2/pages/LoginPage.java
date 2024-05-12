package vkedu.autotest.task_2.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class LoginPage extends BasePage{

  public final static String login = "technopol63";
  public final static String password = "technopolisPassword";
  private static final By EMAIL_FIELD = By.xpath(".//input[@id = 'field_email']");
  private static final By PASSWORD_FIELD = By.xpath(".//input[@id = 'field_password']");
  private static final By LOGIN_BUTTON = By.xpath(".//input[@class='button-pro __wide']");

  public LoginPage(){
    checkPage();
  }

  public void insertUser(String user) {
    $(EMAIL_FIELD).setValue(user);
  }

  public void insertPassword(String password) {
    $(PASSWORD_FIELD).setValue(password);
  }

  public void clickLoginButton() {
    $(LOGIN_BUTTON).click();
  }

  public boolean checkLoginButton() {
    return $(LOGIN_BUTTON).isDisplayed();
  }

  public boolean checkEmailField() {
    return $(EMAIL_FIELD).isDisplayed();
  }
  @Override
  public void checkPage() {
    $(EMAIL_FIELD).shouldBe(visible);
    $(PASSWORD_FIELD).shouldBe(visible);
    $(LOGIN_BUTTON).shouldBe(visible);
  }

  public boolean checkPageBool() {
    boolean emailFieldVisible = $(EMAIL_FIELD).is(visible);
    boolean passwordFieldVisible = $(PASSWORD_FIELD).is(visible);
    boolean loginButtonVisible = $(LOGIN_BUTTON).is(visible);

    return emailFieldVisible && passwordFieldVisible && loginButtonVisible;
  }

}
