package org.ivan.test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class LoginTest {

        public static LoginPage loginPage;
        public static WebDriver driver;
        @BeforeClass
        public static void setup() {
            //определение пути до драйвера и его настройка
            System.setProperty("webdriver.chrome.driver",ConfProperties.getProperty("chromedriver"));
            //создание экземпляра драйвера
                driver = new ChromeDriver();
                    loginPage = new LoginPage(driver);
            //Окно разворачивается на полный экран
                driver.manage().window().maximize();
            //неявное ожидание, задержка на выполнение теста = 10 сек.
                driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
                driver.manage().timeouts().getImplicitWaitTimeout();
            //получение ссылки на страницу входа из файла настроек
                driver.get(ConfProperties.getProperty("loginpage"));
        }

        @AfterClass
        public static void tearDown() {
                driver.quit();
        }

        @Test
        public void testCaseOne() throws InterruptedException {
            //Вводим начальную точку
                loginPage.inputStart(ConfProperties.getProperty("startingPoint"));
                    Thread.sleep(1000);
            //Вводим конечную точку
                loginPage.inputEnd(ConfProperties.getProperty("endPoint"));
                    Thread.sleep(1000);
            //Выбираем тариф Свой
                loginPage.clickYour();
                    Thread.sleep(1000);
            //Выбираем вид транспорта каршеринг
                loginPage.clickDrive();
                    Thread.sleep(1000);
            //Нажимаем кнопку Забронировать
                loginPage.clickButtonBook();
                    Thread.sleep(1000);
            //Нажимаем на поле добавления ВУ
                loginPage.clickDrivingLicense();
                    Thread.sleep(1000);
            //Заполняем поле Имя
                loginPage.inputNameDrivers(ConfProperties.getProperty("nameAbonent"));
                    Thread.sleep(1000);
            //Заполняем поле Фамилия
                loginPage.inputLastNameDrivers(ConfProperties.getProperty("lastNameAbonent"));
                    Thread.sleep(1000);
            //Заполняем поле Дата рождения
                loginPage.inputDateOfBirth(ConfProperties.getProperty("dateOfBirth"));
                    Thread.sleep(1000);
            //Заполняем поле Номер
                loginPage.inputNumberDrivingLicense(ConfProperties.getProperty("numberDrivingLicense"));
                    Thread.sleep(1000);
            //Клик на пустое место
                loginPage.clickEmptySpace();
                    Thread.sleep(1000);
            //Нажимаем кнопку Добавить
                loginPage.clickAdd();
                    Thread.sleep(1000);
            //Нажимаем кнопку Принято
                loginPage.clickAcceptedButton();
                    Thread.sleep(1000);
            //Нажимаем на поле добавления карты
                loginPage.clickButtonCard();
                    Thread.sleep(1000);
            //нажимаем на кнопку добавить карту
                loginPage.clickSecondButtonCard();
                    Thread.sleep(1000);
            //Вводим данные в поле Номер Карты
                loginPage.inputNumberCard(ConfProperties.getProperty("numberCard"));
                    Thread.sleep(1000);
            //Вводим код безопасности
                loginPage.inputSecurityCode(ConfProperties.getProperty("securityCode"));
                    Thread.sleep(1000);
            //нажимаем на заголовок Добавить карты
                loginPage.clickEmptyOverlay();
                    Thread.sleep(1000);
            //нажимаем на кнопку Привязать
                loginPage.clickSnapButton();
                    Thread.sleep(1000);
            //нажимаем крести в разделе карты
                loginPage.clickTheCross();
                    Thread.sleep(1000);
            //Нажать кнопку Забронировать
                loginPage.clickFinallyButtonDrives();
                    Thread.sleep(1000);
            //Проверяем что появилась фраза Машина забронирована
                String jhp = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[5]/div[2]/div[1]/div[1]")).getText();
                if (ConfProperties.getProperty("theCarIsBooked").equalsIgnoreCase(jhp)){
                    System.out.println("Passed");
                } else {
                    System.out.println("Failed");
                }
                driver.quit();
        }
}
