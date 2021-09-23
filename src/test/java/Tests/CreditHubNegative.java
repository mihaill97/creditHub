package Tests;

import Pages.LoginPage;
import Pages.MainPage;
import Settings.ChromeSettings;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CreditHubNegative extends ChromeSettings {
    @Test
    //негативный тест на авторизацию с невалидными данными (используя незарегистрированный имэйл и пароль)
    public void loginInvalidData(){
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        mainPage.clickEnterButton();
        loginPage.typeNegativeData();
        loginPage.clickButtonEnter();
    }

    //негативный тест на авторизацию с пустыми полями ввода
    @Test
    public void loginEmptyFields(){
            MainPage mainPage = new MainPage(driver);
            LoginPage loginPage = new LoginPage(driver);
            mainPage.clickEnterButton();
            loginPage.clickButtonEnter();
            loginPage.emptyFieldValidation();
    }
    //негативный тест на авторизацию с вводом не валидными данными (неверный имэйл и пароль)
    @Test
    public void loginInvalidData1(){
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        mainPage.clickEnterButton();
        loginPage.typeNegativeData1();
        loginPage.clickButtonEnter();
    }
    //негативный тест на регистрацию первого шага с вводом невалидных данных
    @Test
    public void regFirstStepInvalid(){

    }

}
