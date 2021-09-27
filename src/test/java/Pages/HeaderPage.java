package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HeaderPage {
        private WebDriver driver;
        public HeaderPage(WebDriver driver) {
            this.driver = driver;
        }
        By dropMenu = By.xpath("//div[@class='user-panel__dropdown user-panel__dropdown--header user-dropdown']");
        By logout = By.xpath("//*[@id=\"right-user-menu\"]/div/ul/li[6]");
        By kredity = By.xpath("//span[@class='navigation-menu__link navigation-menu__link--has-submenu']");
        By microzaim = By.xpath("//a[@class='submenu__link' and contains(text(),'Микрозаймы')]");
        By potrebKredit = By.xpath("//a[@class='submenu__link' and contains(text(),'Потребительские')]");
        By kreditCards = By.xpath("//a[@class='submenu__link' and contains(text(),'Кредитные карты')] ");
        By debetCards = By.xpath("//a[@class='submenu__link' and contains(text(),'Дебетовые карты')] ");
        By zaimyYR = By.xpath("//a[@class='submenu__link' and contains(text(),'Займы для юридических лиц')] ");
        By payMent = By.xpath("//a[@class='navigation-menu__link' and contains(text(),'Оплата кредита')]");
        By creditScore = By.xpath("//a[@class='navigation-menu__link' and contains(text(),'Кредитный')]");
        By journalPages = By.xpath("//a[@class='navigation-menu__link' and contains(text(),'Статьи')]");



        public void ClickDropMenu(){
            driver.findElement(dropMenu).click();

        }
        public void ClickLogout(){
            driver.findElement(logout).click();
        }
        public void ClickKredity(){
            driver.findElement(kredity).click();
        }
        public void clickMicrozaim(){
            driver.findElement(microzaim).click();
        }
        public void clickPotrebCredit (){
            driver.findElement(potrebKredit).click();

        }
    public void clickKreditCards (){
            driver.findElement(kreditCards).click();
    }
    public void clickDebetCards (){
            driver.findElement(debetCards).click();
    }
    public void clickZaimyYR (){
            driver.findElement(zaimyYR).click();
    }
    public void clickCreditScore(){
            driver.findElement(creditScore).click();
    }
    public void clickPayment(){
            driver.findElement(payMent).click();
    }
    public void clickJournalPages(){
            driver.findElement(journalPages).click();
    }

}
