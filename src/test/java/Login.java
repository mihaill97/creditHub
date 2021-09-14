import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Login {
    private WebDriver driver;
    @Before
    public void setUp(){
        // путь к драйверу
        System.setProperty("webdriver.chrome.driver", "/Users/misha/tools/chromedriver-2");
        //установка драйвера
         driver = new ChromeDriver();
        //ссылка на хаб
        driver.get("https://credithub.ru/");
        driver.manage().window().maximize();
    }

// тест на авторизацию пользователя
    @Test
    public void loginAk () throws InterruptedException {
       //нахожу кнопку "Вход"
        WebElement enterButton = driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/a[1]"));
        //создаю метод action
        Actions actions = new Actions(driver);
        //использую actions чтобы передвинуть курсор на кнопку "Вход"
        actions.moveToElement(enterButton).perform();
        //клик по "Вход
        enterButton.click();
        Thread.sleep(2000);
        //нахожу элементы полей ввода
        WebElement loginField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        WebElement passField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        WebElement buttonEnter = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/button"));
        actions.moveToElement(loginField).perform();
        //клик по поля ввода логина
        loginField.click();
        //ввод логина
        loginField.sendKeys("wowcirkle7991@gmail.com");
        actions.moveToElement(passField).perform();
        //клик по поля ввода пароля
        passField.click();
        //ввод пароля
        passField.sendKeys("7991cmvw");
        actions.moveToElement(buttonEnter).perform();
        // клик по кнопке вход
        buttonEnter.click();
        Thread.sleep(2000);
        WebElement dropMenu = driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div[3]"));
        dropMenu.click();
        Thread.sleep(1000);
        WebElement logout = driver.findElement(By.xpath("//*[@id=\"right-user-menu\"]/div/ul/li[6]"));
        logout.click();
    }
    //тест на регистрацию пользователя
    @Test
    public void registration ()throws InterruptedException{
        WebElement buttonReg = driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/a[2]"));
        buttonReg.click();
        Thread.sleep(2000);
        WebElement nameField = driver.findElement(By.id("first_name"));
        nameField.sendKeys("Тест");
        WebElement lastnameField = driver.findElement(By.id("last_name"));
        lastnameField.sendKeys("Тестович");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("Teeesst@gmail.com");
        WebElement passField = driver.findElement(By.id("password"));
        passField.sendKeys("7991cmvw");
        WebElement rePass = driver.findElement(By.id("password_confirmation"));
        rePass.sendKeys("7991cmvw");
        WebElement buttonReeg = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/button"));
        buttonReeg.click();
        WebElement buttonInstant = driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div[1]"));
        buttonInstant.click();
        Thread.sleep(2000);

        WebElement LastName = driver.findElement(By.id("father_name"));
        LastName.sendKeys("Тестовиич");
        WebElement dateBirth = driver.findElement(By.id("user-birth_date"));
        dateBirth.sendKeys("11111997");
        WebElement phoneNumb = driver.findElement(By.id("user-phone"));
        phoneNumb.sendKeys("79000000000");
        WebElement userSalary = driver.findElement(By.id("user-salary"));
        userSalary.sendKeys("50000");
        WebElement userPassport = driver.findElement(By.id("user-passport_seria_number"));
        userPassport.sendKeys("1123-232132");
        WebElement codePassport = driver.findElement(By.id("passport_subdivision_code"));
        codePassport.sendKeys("010-001");
        WebElement placeBirth = driver.findElement(By.id("passport_birth_place"));
        placeBirth.sendKeys("Москва");
        WebElement datePassport = driver.findElement(By.id("user-passport_issued_at"));
        datePassport.sendKeys("11112020");
        WebElement issuedPassport = driver.findElement(By.id("passport_issued_by"));
        issuedPassport.sendKeys("МВД ПО РЕСП. АДЫГЕЯ");
        WebElement region = driver.findElement(By.id("registration_region"));
        region.sendKeys("Москва");
        WebElement city = driver.findElement(By.id("registration_city"));
        city.sendKeys("г Москва");
        WebElement street = driver.findElement(By.id("registration_street"));
        street.sendKeys("пр-кт Вернадского");
        WebElement numHouse = driver.findElement(By.id("registration_housenum"));
        numHouse.sendKeys("д 4");
        WebElement acceptInfo = driver.findElement(By.xpath("//*[@id=\"personal_data_form\"]/div[11]"));
        acceptInfo.click();
        WebElement buttonContinue = driver.findElement(By.xpath("//*[@id=\"personal_data_form\"]/div[12]/button"));
        buttonContinue.click();
        driver.quit();
    }
    //тест на навигацию по хедеру хаба
    @Test
    public void navigation ()throws InterruptedException{
        WebElement kredity = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/ul/li[1]/span"));
        WebElement microzaim = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/ul/li[1]/ul/li[1]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(kredity).perform();
        microzaim.click();
        Thread.sleep(500);
        WebElement kredity1 = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/ul/li[1]/span"));
        WebElement potrebKredit = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/ul/li[1]/ul/li[2]/a"));
        actions.moveToElement(kredity1).perform();
        potrebKredit.click();
        Thread.sleep(500);
        WebElement kredity2 = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/ul/li[1]/span"));
        WebElement kreditCards = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/ul/li[1]/ul/li[3]/a"));
        actions.moveToElement(kredity2).perform();
        kreditCards.click();
        Thread.sleep(500);
        WebElement kredity3 = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/ul/li[1]/span"));
        WebElement debetCards = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/ul/li[1]/ul/li[4]/a"));
        actions.moveToElement(kredity3).perform();
        debetCards.click();
        Thread.sleep(500);
        WebElement kredity4 = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/ul/li[1]/span"));
        WebElement zaimyYR = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/ul/li[1]/ul/li[5]/a"));
        actions.moveToElement(kredity4).perform();
        zaimyYR.click();
        Thread.sleep(500);
        WebElement payMent = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/ul/li[3]/a"));
        payMent.click();
        Thread.sleep(500);
        WebElement creditScore = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/ul/li[5]/a"));
        creditScore.click();
        Thread.sleep(500);
        WebElement journalPages = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/ul/li[6]/a"));
        journalPages.click();

    }
    @After
    public void cleanUp(){
        driver.quit();
    }
}
