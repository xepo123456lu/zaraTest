package org.zara.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.zara.page.ZaraPage;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.page;

public class ZaraMainSteps {
   public ZaraPage zaraPage = page(ZaraPage.class);
   public WebDriver driver;

    @Step("get main page")
    public String getMainPageUrl() {return zaraPage.getUrl();}

    @Step  ("click logIn")
    public void clickLogIn() {
        WebElement languageSelect = (new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(zaraPage.getLogInUserBtn())));
        languageSelect.click();
    }


    @Step ("enter login")
    public void enterLogin(String login){
        zaraPage.getLogInEMail().sendKeys(login);
    }
    @Step("enter password")
    public void enterPassword (String password){
        zaraPage.getLogInPassword().sendKeys(password);
    }
    @Step("enter")
    public void clickEnter(){
        zaraPage.getLogInButton().click();
    }



}
