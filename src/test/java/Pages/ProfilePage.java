package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
    private WebDriver driver;
    public ProfilePage(WebDriver driver) {
        this.driver = driver; }
    By buttonInstant = By.xpath("/html/body/div[1]/header/div[3]/div[1]");
    public void clickButtonInstant(){
        driver.findElement(buttonInstant).click();
    }
}
