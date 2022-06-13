package cloud.autotests.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CcsSite {

    @Step("Открываем сайт на нужном разделе")
    public CcsSite openSite(String sectionName){
       open("/");
       if (!sectionName.equals("Главная")) {
           $(".navbar").$(byText(sectionName)).click();
           return this;
       }
        return this;
    }

    @Step("Проверка, что открылся правильный раздел")
    public void sectionCheck(String sectionContent) {
        $(byText(sectionContent)).shouldBe(visible);
    }

    @Step("Проверяем наполнение раздела \"Услуги\"")
    public void servicesTest(String servName, String servContent) {
        $(withText(servName)).click();
        $(byText(servContent)).shouldBe(visible);
    }

    @Step("Проверка раздела \"Вакансии\"")
    public void vacancyTest(String vacancy, String charges, String requirements) {
        $("[data-hover-roll='" + vacancy + "']").click();
        $("[data-hover-roll='" + vacancy + "']")
                .parent().sibling(1)
                .$(byText("Обязанности:")).sibling(0)
                .shouldHave(text(charges));
        $("[data-hover-roll='" + vacancy + "']")
                .parent().sibling(1)
                .$(byText("Требования:")).sibling(0)
                .shouldHave(text(requirements));
    }
}
