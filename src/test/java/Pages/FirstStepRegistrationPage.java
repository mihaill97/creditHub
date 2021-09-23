package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstStepRegistrationPage {
    private WebDriver driver;
    public FirstStepRegistrationPage(WebDriver driver) {
        this.driver = driver;
    }
    By nameField = By.id("first_name");
    By lastnameField = By.id("last_name");
    By emailField = By.id("email");
    By passField = By.id("password");
    By rePass = By.id("password_confirmation");
    By buttonReeg = By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/button");

    public void typeData(){
        driver.findElement(nameField).sendKeys("Тест");
        driver.findElement(lastnameField).sendKeys("Тестович");
        driver.findElement(emailField).sendKeys("Teeesst@gmail.com");
        driver.findElement(passField).sendKeys("7991cmvw");
        driver.findElement(rePass).sendKeys("7991cmvw");
    }
    public void typeNegativeData(){

    }
    public void clickButtonReeg(){
        driver.findElement(buttonReeg).click();
    }
}
