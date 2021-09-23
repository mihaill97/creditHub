package Tests;

import Pages.*;
import Settings.ChromeSettings;
import org.junit.Test;

public class CredithubTests extends ChromeSettings {
    @Test
    public void Login () throws InterruptedException{
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        HeaderPage headerPage = new HeaderPage(driver);
        mainPage.clickEnterButton();
        loginPage.typeData();
        loginPage.clickButtonEnter();
        Thread.sleep(1000);
        headerPage.ClickDropMenu();
        headerPage.ClickLogout();
    }
    @Test
    public void Registration() throws InterruptedException{
        MainPage mainPage = new MainPage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
        SecondStepRegistration secondStepRegistration = new SecondStepRegistration(driver);
        mainPage.clickButtonReg();
        registrationPage.typeData();
        registrationPage.clickButtonReeg();
        profilePage.clickButtonInstant();
        secondStepRegistration.typeData();
        secondStepRegistration.clickAcceptInfo();
        secondStepRegistration.clickButtonContinue();
    }
    @Test
    public void Navigation ()throws InterruptedException{
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.ClickKredity();
        headerPage.clickMicrozaim();
        headerPage.ClickKredity();
        headerPage.clickPotrebCredit();
        headerPage.ClickKredity();
        headerPage.clickKreditCards();
        headerPage.ClickKredity();
        headerPage.clickDebetCards();
        headerPage.ClickKredity();
        headerPage.clickZaimyYR();
        headerPage.clickCreditScore();
        headerPage.clickPayment();
        headerPage.clickJournalPages();
    }
    @Test
    public void InstantCredit()throws InterruptedException{
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
        mainPage.clickEnterButton();
        loginPage.typeData();
        loginPage.clickButtonEnter();
        Thread.sleep(1000);
        profilePage.clickButtonInstant();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }
}
