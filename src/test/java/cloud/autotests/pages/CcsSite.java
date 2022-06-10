package cloud.autotests.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CcsSite {

    @Step("Открываем сайт на разделе {0}")
    public CcsSite openSite(String sectionName){
       open("/");
       if (!sectionName.equals(null)) {
           $(".navbar").$(byText(sectionName)).click();
       }
        return this;
    }

    @Step("Проверка, что открылся правильный раздел")
    public void sectionCheck(String sectionContent) {
        $(byText(sectionContent)).shouldBe(visible);
    }

    @Step("Проверяем наполнение раздела \"Услуги\"")
    public void servisesTest(String servName, String servContent) {
        $(withText(servName)).click();
        $(byText(servContent)).shouldBe(visible);
    }


}
