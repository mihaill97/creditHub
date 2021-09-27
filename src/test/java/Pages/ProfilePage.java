package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
    private WebDriver driver;
    public ProfilePage(WebDriver driver) {
        this.driver = driver; }
    By buttonInstant = By.xpath("//div[@class='user-panel__instant-credit-banner instant-credit-banner']");
    public void clickButtonInstant(){
        driver.findElement(buttonInstant).click();
    }
}
