package vkedu.autotest.task_2.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import vkedu.autotest.task_2.pages.BasePage;
import vkedu.autotest.task_2.pages.LoginPage;
import vkedu.autotest.task_2.pages.MainPage;


@Tag("Functional_test")
public class LoginPageTest{
  private static String baseURL = "https://ok.ru/";
  public static LoginPage loginPage;

  @BeforeAll
  public static void setUp() {
    Configuration.baseUrl = baseURL;
  }

  @BeforeEach
  public void setUpEach() {
    BasePage.open();
    loginPage = new LoginPage();
  }

  @AfterEach
  public void after() {
    Selenide.closeWindow();
  }

  @DisplayName("Проверка авторизации с корретным логином и паролем")
  @ParameterizedTest
  @CsvFileSource(resources = "/validLoginData.csv")
  public void ValidLoginAndPasswordTest(String login, String password) {
    loginPage.insertUser(LoginPage.login);
    loginPage.insertPassword(LoginPage.password);
    loginPage.clickLoginButton();
    Assertions.assertAll(
            "Check if login successful",
            () -> Assertions.assertTrue(MainPage.checkUserFriends(), "Кнопка раздела друзья должна быть видна " +
                    "после авторизации"),
            () -> Assertions.assertFalse(loginPage.checkLoginButton(), "Кнопка авторизации не должна быть " +
                    "видна после авторизации")
    );
  }

  @DisplayName("Проверка авторизации с некорретным логином и паролем")
  @ParameterizedTest
  @CsvFileSource(resources = "/invalidLoginData.csv")
  public void InvalidLoginAndPasswordTest(String login, String password) {
    loginPage.insertUser(LoginPage.login);
    loginPage.insertPassword(LoginPage.password);
    loginPage.clickLoginButton();
    Assertions.assertAll(
            "Check if login not successful",
            () -> Assertions.assertTrue(loginPage.checkLoginButton(), "Кнопка авторизации должна быть видна " +
                    "при неуспешной авторизации"),
            () -> Assertions.assertTrue(loginPage.checkEmailField(), "Поле ввода почты должно быть видно " +
                    "при неуспешной авторизации")
    );
  }
}
