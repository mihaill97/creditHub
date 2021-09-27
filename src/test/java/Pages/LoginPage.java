package Pages;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    By loginField = By.xpath("//*[@id=\"email\"]");
    By passField = By.xpath("//*[@id=\"password\"]");
    By buttonEnter = By.xpath("//button[@class='btn btn-1 btn_blue']");
    //валидации
    By validationEmail = By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[1]/p");

//различные методы содержащие данные ввода и клики

//валидные данные для авторизации пользователя
    public void typeData (){
        driver.findElement(loginField).sendKeys("wowcirkle7991@gmail.com");
        driver.findElement(passField).sendKeys("7991cmvw");
    }
//не валидные данные для авторизации пользователя (не зареганый на хабе)
    public void typeNegativeData(){
        driver.findElement(loginField).sendKeys("exxxample@mail.ru");
        driver.findElement(passField).sendKeys("7991cmvw");
    }
    public void typeNegativeData1(){
        driver.findElement(loginField).sendKeys("sdfds@fs@sdffs.com");
        driver.findElement(passField).sendKeys("@@@@@");
    }

//клик по кнопке авторизации
    public void clickButtonEnter(){
        driver.findElement(buttonEnter).click();
    }

//проверка валидации пустого поля
    public void emptyFieldValidation(){
      driver.findElement(validationEmail).getText();
      assertEquals("Поле обязательно для заполнения.",driver.findElement(validationEmail).getText());

    }



}
