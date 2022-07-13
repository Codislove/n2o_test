package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class N2O_DemoPage {
    public SelenideElement inputForm = $x("//input[@class='n2o-input form-control n2o-input-text']");

    public SelenideElement button = $x("//button[@class='btn btn-secondary']");
    public SelenideElement alert = $x("//section[@class='n2o-alerts top']");


    public void inputToLogin(String login){}
}
