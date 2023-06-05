package org.ivan.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@id,'from')]")//Локатор поля ввода Откуда
    private WebElement startingPoint;

    @FindBy(xpath = "//*[contains(@id,'to')]")//Локатор поля ввода Куда
    private WebElement endPoint;

    @FindBy(xpath = "//*[contains(text(),'Вызвать такси')]")//Локатор кнопки вызова такси
    private WebElement callTaxi;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div[3]/div[1]/div[1]/div[1]")
//Локатор кнопки выбора тарифа Оптимальный
    private WebElement tariffOpt;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div[3]/div[1]/div[1]/div[3]")//Локатор кнопки выбора тарифа Свой
    private WebElement tariffYour;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div[3]/div[1]/div[1]/div[2]")//Локатор кнопки выбора тарифа Быстрый
    private WebElement tariffFast;

    public void inputStart(String streetStart) {
        startingPoint.sendKeys(streetStart);//Функция заполнения поля Откуда
    }

    public void inputEnd(String streetEnd) {
        endPoint.sendKeys(streetEnd);//Функция заполнения поля Куда
    }

    public void clickCallTaxi() {
        callTaxi.click();//Функция нажатия кнопки Вызвать Такси
    }

    public void clickOpt() {

        tariffOpt.click();//Функция нажатия кнопки тарифа Оптимальный
    }

    public void clickYour() {
        tariffYour.click();//Функция нажатия кнопки тарифа Свой
    }

    public void clickFast() {
        tariffFast.click();//Функция нажатия кнопки тарифа Быстрый
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div[3]/div[1]/div[2]/div[1]")
//Локатор кнопки выбора транспорта автомобиль
    private WebElement optionAuto;

    public void clickAuto() {
        optionAuto.click();//Функция нажатия кнопки выбор транспорта автомобиль
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div[3]/div[1]/div[2]/div[2]")//Локатор кнопки выбора пешей прогулки
    private WebElement optionFoot;

    public void clickFoot() {
        optionFoot.click();//Функция нажатия кнопки Пешая прогулка
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div[3]/div[1]/div[2]/div[5]")
//Локатор кнопки выбора транспорта самокат
    private WebElement optionScooter;

    public void clickScooter() {
        optionScooter.click();//Функция нажатия кнопки выбор транспорта самокат
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div[3]/div[1]/div[2]/div[6]")
//Локатор кнопки выбора транспорта каршеринг
    private WebElement optionDrive;

    public void clickDrive() {
        optionDrive.click();//Функция нажатия кнопки выбор транспорта каршеринг
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div[3]/div[1]/div[2]/div[3]")//Локатор кнопки выбора транспорта такси
    private WebElement optionTaxi;

    public void clickTaxi() {
        optionTaxi.click();//Функция нажатия кнопки выбор транспорта такси
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div[3]/div[1]/div[2]/div[4]")
//Локатор кнопки выбора транспорта велосипед
    private WebElement optionBicycle;

    public void clickBicycle() {
        optionBicycle.click();//Функция нажатия кнопки выбор транспорта велосипед
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div[3]/div[1]/div[3]/div[1]/button")//Локатор кнопки Забронировать
    private WebElement buttonBook;


    public void clickButtonBook() {
        buttonBook.click();//Функция нажатия кнопки Забронировать
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div[3]/div[2]/div[3]/div[1]")//Локатор поля добавления прав
    private WebElement drivingLicense;

    public void clickDrivingLicense() {
        drivingLicense.click();//Функция нажатия на поле права
    }

    @FindBy(xpath = "//*[contains(@id,'firstName')]")//Локатор поля ввода Имени
    private WebElement nameAbonent;

    public void inputNameDrivers(String nameDrivers) {
        nameAbonent.sendKeys(nameDrivers);//Функция ввода имени
    }

    @FindBy(xpath = "//*[contains(@id,'lastName')]")//Локатор поля ввода Фамилии
    private WebElement lastNameAbonent;

    public void inputLastNameDrivers(String lastNameDrivers) {
        lastNameAbonent.sendKeys(lastNameDrivers);//Функция ввода Фамилии

    }

    @FindBy(xpath = "//*[contains(@id,'birthDate')]")//Локатор поля ввода Даты рождения
    private WebElement dateOfBirth;

    public void inputDateOfBirth(String dateBirth) {
        dateOfBirth.sendKeys(dateBirth);//Функция ввода Даты рождения

    }

    @FindBy(xpath = "/html/body/div/div/div[1]/div[2]/div[1]/form/div[1]/div[4]/div[2]/input")//Локатор поля ввода номера ВУ
    private WebElement numberDrivingLicense;

    public void inputNumberDrivingLicense(String drivingLicense) {
        numberDrivingLicense.sendKeys(drivingLicense);//Функция ввода номера ВУ

    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[2]/div[1]/form/div[2]/button[1]")//Локатор кнопки Добавить
    private WebElement buttonAdd;

    public void clickAdd() {
        buttonAdd.click();//Функция нажатия кнопки добавить
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/button[2]")//Локатор кнопки Принято
    private WebElement acceptedButton;

    public void clickAcceptedButton() {
        acceptedButton.click();//Функция нажатия кнопки принято
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div[3]/div[2]/div[3]/div[2]/div[2]/div[1]") //Локатор поле добавить карту
    private WebElement buttonCard;

    public void clickButtonCard() {
        buttonCard.click();//Функция нажатия на поле добавить карту
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[2]/div[2]")//Локатор кнопки добавить карту
    private WebElement secondButtonCard;

    public void clickSecondButtonCard() {
        secondButtonCard.click();//Функция нажатия кнопки добавить карту
    }

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div[2]/form/div[1]/div[1]/div[2]/input")//Локатор ввода номера карты
    private WebElement numberCard;

    public void inputNumberCard(String bankCardNumber) {
        numberCard.sendKeys(bankCardNumber);//Функция ввода номера карты
    }

    @FindBy(xpath = "//*[contains(@id,'code')]")//Локатор поля ввода кода безопасноти
    private WebElement securityCode;

    public void inputSecurityCode(String code) {
        securityCode.sendKeys(code);}//Функция поля ввода кода безопасноти


    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/form/div[3]/button[1]")//Локатор кнопки привязать карту
    private WebElement snapButton;

    public void clickSnapButton() {
        snapButton.click();}//Функция нажатия кнопки привязать карту


    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/button")//Локатор крестика в разделе добавления карт
    private WebElement theCross;

    public void clickTheCross() {
        theCross.click();}//Функция крестика в разделе добавления карт


    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div[4]/button")//Локатор кнопки забронировать каршеринг
    private WebElement finallyButtonDrives;

    public void clickFinallyButtonDrives() {
        finallyButtonDrives.click();
    }//Функция кнопки забронировать каршеринг


    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div[2]/div[1]/div")//Клик надписи добавить права
    private WebElement emptySpace;
    public void clickEmptySpace() {
        emptySpace.click();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div")
    private WebElement emptyOverlay;
    public void clickEmptyOverlay(){
        emptyOverlay.click();
    }
}

