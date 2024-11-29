package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import javax.swing.*;

public class WithSelenium {
    public static void main(String[] args) {
        //WebDriver Driver = new ChromeDriver();
       // WebDriverManager.chromedriver().setup();
        WebDriver Driver = new EdgeDriver();
        WebDriverManager.edgedriver().setup();
        WithSeleniumpage page = new WithSeleniumpage(Driver);
        //крок 1 - Відкрити сайт програму
        page.OpenSite();
        //крок2 - авторизація
        page.Login();
        //крок 3 - очікування
        page.Wait(10000);
        //крок 4 - відкрити таб Продажі, скін Продажі Україна
        page.SaleScreenOpen();
        //крок 5 - Створити Продажу (натиск на кнопку Створити)
        page.CreateSale();
        //очікування
        page.Wait(10000);
        //крок 6 - Крок 1 на Продажах в пошуку ввести Клієнта
        page.FindCustomerSale("BXM75801");
        //очікування
        page.Wait(5000);
        //крок 7 - Крок2 на продажах (клік Alt+2)
        page.Step1SaleALT2();
        //очікування
        page.Wait(6000);
        //крок 8 - Введення в пошуку артикулу товару
       page.FindGoodSale("sem9401");
       //очікування
        page.Wait(5000);
        //крок 9 - додати певну к-ть товару в кошик
       page.AddgoodSale();
       //очікування
        page.Wait(10000);
        //крок 10 - Крок2 на продажах (клік Alt+3)
       page.Step1SaleALT3();
       //очікування
        page.Wait(10000);
        // Перевірка виконання тесту чи є накладна після створення продажі
       page.Nakladnacreating();
       //очікування
        page.Wait(10000);
        // Закрити форму з документами, яка автмотично відкривається після створення продажі
        page.ClosingDocFormSale();
        // Перевірка виконання тесту чи є код,накладна,і сумма після створення продажі
       page.CheckElements1Sale();
       //закриття програми браузера
       Driver.quit();
    }
}