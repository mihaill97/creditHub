package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    By enterButton = By.xpath("/html/body/div[1]/header/div[3]/a[1]");
    By buttonReg = By.xpath("/html/body/div[1]/header/div[3]/a[2]");

    public void clickEnterButton(){
        driver.findElement(enterButton).click();
    }
    public void clickButtonReg(){
        driver.findElement(buttonReg).click();}
}
