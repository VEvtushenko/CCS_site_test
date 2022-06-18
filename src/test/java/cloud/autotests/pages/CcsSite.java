package cloud.autotests.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


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

    @Step("Проверяем, что открылся правильный раздел")
    public void sectionCheck(String sectionContent) {
        $(byText(sectionContent)).shouldBe(visible);
    }

    public void servicesTest(String servName, String servContent) {
        step("Раскрываем и проверяем содержимое  \"{servName}\"", () -> {
            $(withText(servName)).click();
            $(byText(servContent)).shouldBe(visible);
        });
        step("Закрываем подраздел и проверяем, что он закрылся", () -> {
            $(".services-popup__close").click();
            $("[class='services__popup services-popup active services-popup--pos-1']").shouldNotBe(exist);
        });
    }

    public void vacancyTest(String vacancy, String charges, String requirements) {
        step("Раскрываем и проверяем содержимое вакансии \"{vacancy}\"", () -> {
            $("[data-hover-roll='" + vacancy + "']").click();
            $("[data-hover-roll='" + vacancy + "']")
                .parent().sibling(1)
                .$(byText("Обязанности:")).sibling(0)
                .shouldHave(text(charges));
            $("[data-hover-roll='" + vacancy + "']")
                .parent().sibling(1)
                .$(byText("Требования:")).sibling(0)
                .shouldHave(text(requirements));
        });
        step("Закрываем вакансию и проверяем, что она закрылась", () -> {
            $("[data-hover-roll='" + vacancy + "']").click();
            $(byText("Обязанности:")).shouldNotBe(visible);
        });
    }
}
