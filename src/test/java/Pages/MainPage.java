package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    By enterButton = By.xpath("//a[@class='user-panel__log-link']");
    By buttonReg = By.xpath("//a[text() = ('Регистрация')]");

    public void clickEnterButton(){
        driver.findElement(enterButton).click();
    }
    public void clickButtonReg(){
        driver.findElement(buttonReg).click();}
}
