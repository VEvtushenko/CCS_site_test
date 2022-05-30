package cloud.autotests.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

import java.util.stream.Stream;

@DisplayName("Тест сайта компании CCS")
@Tag("testCCSSite")
public class TestCCSSite extends TestBase {

     static Stream<Arguments> dataSourceSiteSections() {
        return Stream.of(
                Arguments.of(sectionAboutUs, contentAboutUs),
                Arguments.of(sectionServises, contentServices),
                Arguments.of(sectionVacancy, contentVacancy),
                Arguments.of(sectionCosts, contentCosts),
                Arguments.of(sectionContacts, contentContacts)
        );
    }

    @MethodSource("dataSourceSiteSections")
    @ParameterizedTest(name = "Проверка соответствия ссылки на раздел \"{0}\" и его содержимого")
    void testSiteSections(String sectionName, String sectionContent) {
        step("Открываем сайт на главной странице", () -> {
            open("/");
        });
        step("Кликаем на раздел \"" + sectionName + "\"", () -> {
            $(".navbar").$(byText(sectionName)).click();
        });
        step("Проверка, что открылся правильный раздел", () -> {
            $(byText(sectionContent)).shouldBe(visible);
        });
    }

    static Stream<Arguments> dataSourceServices() {
        return Stream.of(
                Arguments.of(servSectionDev, servContentDev),
                Arguments.of(servSectionDevEx, servContentDevEx),
                Arguments.of(servSectionAuto, servContentAuto),
                Arguments.of(servSectionSupport, servContentSupport),
                Arguments.of(servSectionDevMob, servContentDevMob),
                Arguments.of(servSectionConsult, servContentConsult),
                Arguments.of(servSectionIntegration, servContentIntegration),
                Arguments.of(servSectionWebDev, servContentWebDev)
        );
    }

    @MethodSource("dataSourceServices")
    @ParameterizedTest(name = "Проверка наполнения подраздела \"Услуги/{0}\"")
    void testServSection(String servName, String servDescription) {
        step("Открываем сайт на разделе \"Услуги\"", () -> {
            open("/#services");
        });
        step("Нажимаем на поле \"" + servName + "\"", () -> {
            $(withText(servName)).click();
        });
        step("Проверка содержимого", () -> {
            $(byText(servDescription)).shouldBe(visible);
        });
    }
}