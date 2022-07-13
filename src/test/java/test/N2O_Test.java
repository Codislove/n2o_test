package test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.N2O_DemoPage;

import static com.codeborne.selenide.Selenide.*;

public class N2O_Test {

    public final String url = "https://n2oapp.net/sandbox/view/examples_greeting/";
    public final String name = "Developer";
    N2O_DemoPage demoPage = new N2O_DemoPage();


    @BeforeEach
    public void setup() {
        Configuration.browser = "chrome";
        Configuration.timeout = 4000;
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void test() {
        open(url);
        demoPage.inputForm.sendKeys(name);
        demoPage.button.click();

        demoPage.alert.shouldBe(Condition.exist);

        $x("//section[@class='w-100 d-flex align-self-start align-items-center n2o-alert-segment__text']")
                .shouldBe(Condition.text("Привет, " + name));

    }
}
