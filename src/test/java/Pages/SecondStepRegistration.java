package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondStepRegistration {
    private WebDriver driver;
    public SecondStepRegistration(WebDriver driver) {
        this.driver = driver;
    }
    By LastName = By.id("father_name");
    By dateBirth = By.id("user-birth_date");
    By phoneNumb = By.id("user-phone");
    By userSalary = By.id("user-salary");
    By userPassport = By.id("user-passport_seria_number");
    By codePassport = By.id("passport_subdivision_code");
    By placeBirth = By.id("passport_birth_place");
    By datePassport = By.id("user-passport_issued_at");
    By issuedPassport = By.id("passport_issued_by");
    By region = By.id("registration_region");
    By city = By.id("registration_city");
    By street = By.id("registration_street");
    By numHouse = By.id("registration_housenum");
    By acceptInfo = By.xpath("//input[@name='agree_with_terms']");
    By buttonContinue = By.xpath("//button[@class='btn btn-1 btn_blue form-btn change-request-submit-YT']");

    public void typeData (){
        driver.findElement(LastName).sendKeys("Тестовиич");
        driver.findElement(dateBirth).sendKeys("11111997");
        driver.findElement(phoneNumb).sendKeys("79000000000");
        driver.findElement(userSalary).sendKeys("50000");
        driver.findElement(userPassport).sendKeys("1123-232132");
        driver.findElement(codePassport).sendKeys("010-001");
        driver.findElement(placeBirth).sendKeys("Москва");
        driver.findElement(datePassport).sendKeys("11112020");
        driver.findElement(issuedPassport).sendKeys("МВД ПО РЕСП. АДЫГЕЯ");
        driver.findElement(region).sendKeys("Москва");
        driver.findElement(city).sendKeys("г Москва");
        driver.findElement(street).sendKeys("пр-кт Вернадского");
        driver.findElement(numHouse).sendKeys("д 4");
    }
    public void typeNegativeData(){
        driver.findElement(LastName).sendKeys("Тестоfdsfвиич");
        driver.findElement(dateBirth).sendKeys("11111fsdf997");
        driver.findElement(phoneNumb).sendKeys("000000000");
        driver.findElement(userSalary).sendKeys("50000");
        driver.findElement(userPassport).sendKeys("1123-00002132");
        driver.findElement(codePassport).sendKeys("0-001");
        driver.findElement(placeBirth).sendKeys("Моdsfsсква");
        driver.findElement(datePassport).sendKeys("11112020");
        driver.findElement(issuedPassport).sendKeys("МВ ПДЫГЕЯ");
        driver.findElement(region).sendKeys("Москfdsfва");
        driver.findElement(city).sendKeys("г Мосfdsква");
        driver.findElement(street).sendKeys("пр-кт Веfdsfsрнадского");
        driver.findElement(numHouse).sendKeys("д 324234");
    }
    public void clickAcceptInfo (){
        driver.findElement(acceptInfo).click();
    }
    public void clickButtonContinue (){
        driver.findElement(buttonContinue).click();
    }
}
