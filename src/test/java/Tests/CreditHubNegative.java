package Tests;

import Pages.*;
import Pages.MainPage;
import Settings.ChromeSettings;
import org.junit.Test;

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
    //негативный тест на авторизацию с вводом не валидных данных (неверный имэйл и пароль)
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
        MainPage mainPage = new MainPage(driver);
        FirstStepRegistrationPage registrationPage = new FirstStepRegistrationPage(driver);
        mainPage.clickButtonReg();
        registrationPage.typeNegativeData();
        registrationPage.clickButtonReeg();
    }
    //первый шаг с пустыми полями ввода
    @Test
    public void regFirstStepEmptyField(){
        MainPage mainPage = new MainPage(driver);
        FirstStepRegistrationPage registrationPage = new FirstStepRegistrationPage(driver);
        mainPage.clickButtonReg();
        registrationPage.clickButtonReeg();
    }
    //перед запуском автотестов второго шага регистрации удалять из админки акк Teeesst@gmail.com
    //автотест на второй шаг регистрации, ввод невалидных данных в поля регистрации

    @Test
    public void SecondStepInvalid() throws InterruptedException{
        MainPage mainPage = new MainPage(driver);
        FirstStepRegistrationPage registrationPage = new FirstStepRegistrationPage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
        SecondStepRegistration secondStepRegistration = new SecondStepRegistration(driver);
        mainPage.clickButtonReg();
        registrationPage.typeData();
        registrationPage.clickButtonReeg();
        profilePage.clickButtonInstant();
        secondStepRegistration.typeNegativeData();
        secondStepRegistration.clickButtonContinue();
    }

}
