package org.zara.page;

import lombok.Data;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.codeborne.selenide.SelenideElement;

@Data
public class ZaraPage {
    private String url = "https://www.zara.com/ge/";

    @FindBy(how = How.XPATH, using = "//*[@id=\"theme-app\"]/div/div/header/div/div[2]/div/a[1]/span")
    private SelenideElement LogInUserBtn;

    @FindBy(how = How.XPATH, using = "//div[@class=\"form-input__wrapper\"]/div/input")
    private SelenideElement LogInEMail;

    @FindBy(how = How.XPATH, using = "//div[@class=\"form-input-password\"]/div/input\n")
    private SelenideElement LogInPassword;

    @FindBy(how = How.XPATH, using = "//div[@class=\"zds-button__lines-wrapper")
    private SelenideElement LogInButton;



}
