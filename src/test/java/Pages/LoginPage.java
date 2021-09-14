package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    By loginField = By.xpath("//*[@id=\"email\"]");
    By passField = By.xpath("//*[@id=\"password\"]");
    By buttonEnter = By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/button");

    public void typeData (){
        driver.findElement(loginField).sendKeys("wowcirkle7991@gmail.com");
        driver.findElement(passField).sendKeys("7991cmvw");
    }
    public void clickButtonEnter(){
        driver.findElement(buttonEnter).click();
    }



}
