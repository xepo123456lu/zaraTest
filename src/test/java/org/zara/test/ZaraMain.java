package org.zara.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zara.steps.ZaraMainSteps;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class ZaraMain  {

        WebDriver driver = new ChromeDriver();
       public ZaraMainSteps zaraMainSteps = page(ZaraMainSteps.class);

      @Test(description = "kfjgdfjk")
   public void goToTneZara(){
          driver.get("https://www.zara.com/ge/");
          //driver.getCurrentUrl().contains(zaraMainSteps.getMainPageUrl());

          WebElement languageSelect = (new WebDriverWait(driver, Duration.ofSeconds(5))
                  .until.zaraMainSteps.clickLogIn();
          zaraMainSteps.enterLogin("poluektovawork@gmail.com");
          zaraMainSteps.enterPassword("Cjyzcjyz11");
          zaraMainSteps.clickEnter();

        }





    }


























   /* public static void testCase() {
        final String LOGIN = "test-stage-clouder@test.ru";
        final String PASSWORD = "Aa12345678!";

        WebDriver driver = new ChromeDriver();
        //Страница авторизации.Ввод логина

        driver.get("https://stage.cbi.cloudmaster.ru");// Открываем сайт

        WebElement languageSelect = (new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/article/div[2]/div[1]/div[2]/button"))));
        languageSelect.click();

        WebElement inputLogin = (new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath("//label[@data-testid='input-label']"))));
        inputLogin.sendKeys(LOGIN, Keys.ENTER);
    } */

