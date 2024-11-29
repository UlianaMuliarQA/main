package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithSeleniumpage {
    private WebDriver driver;
    private By OpenSite = By.id("OpenSite");
    private By Login = By.id("Login");
    private By Wait = By.id("Wait");
    private By SaleScreenOpen = By.id("SaleScreenOpen");
    private By CreateSale = By.id("CreateSale");
    private By FindCustomerSale = By.id("FindCustomerSale");
    private By Step1SaleALT2 = By.id("Step1SaleALT2");
    private By Step2SaleALT3 = By.id("Step2SaleALT3");
    private By FindGoodSale = By.id("FindGoodSale");
    private By AddgoodSale = By.id("AddgoodSale");
    private By Nakladnacreating = By.id("Nakladnacreating");
    private By CheckElements1Sale = By.id("CheckElements1Sale");
    private By ClosingDocFormSale = By.id("ClosingDocFormSale");
    //---
    private By OpenBackgoodSale = By.id("OpenBackgoodSale");
    private By ChecktableBackSales = By.id("ChecktableBackSales");
    public WithSeleniumpage(WebDriver driver) {
        this.driver = driver;
    }
        public void OpenSite() {
            driver.get("http://85.17.167.167:20012/");
        }
        public void Login() {
        // авторизація на головній сторінці логін і пароль і клік вхід в Concord
            driver.findElement(By.xpath(".//input[@type='text' and @name='login']")).sendKeys("131313666");
            driver.findElement(By.xpath(".//input[@type='password' and @name='password']")).sendKeys("Grimm_jow92");
            driver.findElement(By.xpath(".//button[@class='login_form_button']")).click();
        }
        public void Wait(int timer){
        // код на очікування коли проходить програма якийсь функціонал, в дужках таймер мілісекунди для часу який буде вкалдатись в дужки
            try{
                Thread.sleep(timer);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        public void SaleScreenOpen(){
        // відкриття таба Продаж і скріна Продажі України
            driver.findElement(By.xpath(".//div[text()='Продажі']")).click();
            driver.findElement(By.xpath(".//div[text()='Продажі Україна']")).click();
        }
        public void CreateSale(){
        //клік на кнопку Створити на продажах
            driver.findElement(By.xpath(".//div[@class='default__control' and text()='Створити']")).click();
        }
        public void FindCustomerSale(String searchvalue1){
        //Введення в пошуку коду клієнта
            driver.findElement(By.xpath("//input[@type='text'='Місце вводу для пошуку']")).sendKeys(searchvalue1);
        }
        public void Step1SaleALT2(){
        // Комбінація клавіш на продажах Alt+2
            Actions actions = new Actions(driver);
            actions.keyDown(Keys.ALT).sendKeys("2").keyUp(Keys.ALT).perform();
        }
        public void Step1SaleALT3(){
        //Комбінація клавіш на продажах Alt+3
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ALT).sendKeys("3").keyUp(Keys.ALT).perform();
    }
    public void FindGoodSale(String searchvalue2){
        //Введення в полі пошуку товару на Продажах аартикулу товару
        driver.findElement(By.xpath(".//input[@type='text'='Пошук товару']")).sendKeys(searchvalue2);
    }
    public void AddgoodSale(){
        //Введення к-ті на Продажах певного артикула
        Actions action2 = new Actions(driver);
        action2.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
        try{
            Thread.sleep(10000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath(".//input[@class='input_qty']")).sendKeys("10");
        driver.findElement(By.xpath(".//button[@class='create__button__control']")).click();
    }
    public void Nakladnacreating(){
        //закриття форми з доками після створення накладної з продаж
        driver.findElement(By.xpath(".//button[@class='create__button__control' and contains(text(), 'Завантажити рахунок на оплату')]")).click();
    }
    public void CheckElements1Sale(){
        //перевірка наявності накладної, коду і сумми після створення накладної
        if(driver.findElement(By.xpath(".//span[@class = 'client__region_code']")).isDisplayed()) {
            System.out.println("елемент наявний");
        }else{
            System.out.println("елемента нема");
        }
        if(driver.findElement(By.xpath(".//div [@class='HIE_item item_A']")).isDisplayed()) {
            System.out.println("елемент наявний другий ");
        }else{
            System.out.println("елемента другого нема");
        }
        if(driver.findElement(By.xpath(".//span [@class='total total__qty total_amount']")).isDisplayed()) {
            System.out.println("елемент наявний третій ");
        }else{
            System.out.println("елемента третього нема");
        }
    }
    public void ClosingDocFormSale() {
        driver.findElement(By.xpath(".//div [@class='hide_modal_window_control']")).click();
    }
        //---------------------------------------------------
                // objects from TestCaseSale2
        public void OpenBackgoodSale(){
            // відкриття повернень
        driver.findElement(By.xpath(".//div[@class='label' and text()='Повернення']")).click();
        }
        public void ChecktableBackSales(){
        //перевірка чи є таблиця, тобто чи запускаються нормально Повернення Продаж
            if(driver.findElement(By.xpath(".//div [@class='dashboard_tile__component list_sale__tile__component']")).isDisplayed()) {
                System.out.println("таблиця Повернень наявна");
            }else{
                System.out.println("таблиці Повернень немає");
            }

        }
}
