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
        By dropMenu = By.xpath("/html/body/div[1]/header/div[3]/div[3]");
        By logout = By.xpath("//*[@id=\"right-user-menu\"]/div/ul/li[6]");
        By kredity = By.xpath("/html/body/div[1]/header/div[2]/ul/li[1]/span");
        By microzaim = By.xpath("/html/body/div[1]/header/div[2]/ul/li[1]/ul/li[1]/a");
        By potrebKredit = By.xpath("/html/body/div[1]/header/div[2]/ul/li[1]/ul/li[2]/a");
        By kreditCards = By.xpath("/html/body/div[1]/header/div[2]/ul/li[1]/ul/li[3]/a");
        By debetCards = By.xpath("/html/body/div[1]/header/div[2]/ul/li[1]/ul/li[4]/a");
        By zaimyYR = By.xpath("/html/body/div[1]/header/div[2]/ul/li[1]/ul/li[5]/a");
        By payMent = By.xpath("/html/body/div[1]/header/div[2]/ul/li[3]/a");
        By creditScore = By.xpath("/html/body/div[1]/header/div[2]/ul/li[5]/a");
        By journalPages = By.xpath("/html/body/div[1]/header/div[2]/ul/li[6]/a");



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
