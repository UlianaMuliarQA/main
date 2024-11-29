package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCaseSale2 {
    public static void main (String[] args){

        WebDriver Driver = new EdgeDriver();
        //крок 1 - Війти в Браузер
        WebDriverManager.edgedriver().setup();
        WithSeleniumpage page = new WithSeleniumpage(Driver);
        //крок 2 -  Війти на сайт
        page.OpenSite();
        //крок 3 - Авторизація в Cord користувачем
        page.Login();
        //крок 4 - Відкриття програми в браузері на повний екран
        Driver.manage().window().fullscreen();
        //очікування на відроблення функціоналу 10мілісекунд
        page.Wait(10000);
        //крок 5 - Відкрити таб Продажі, скрін - Продажі
        page.SaleScreenOpen();
        //очікування на відроблення функціоналу 10мілісекунд
        page.Wait(10000);
        //крок 6 - Відкриття під скріна Повернення
        page.OpenBackgoodSale();
        //крок 7 - перевірити чи є таблиця на .поверненнях
        page.ChecktableBackSales();
        //закрити прграму і браузер
        Driver.quit();
    }
}
