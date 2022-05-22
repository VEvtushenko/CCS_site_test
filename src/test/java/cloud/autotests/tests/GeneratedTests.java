package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Тест сайта компании CSS")
    void generatedTest() {
        step("Открыть https://ru-css.com", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить, что нажатие на ссылку на раздел сайта переводит страницу к правильному разделу. После проверки вернуться наверх страницы. Проделать для каждого раздела.", () -> {
            step("// todo: just add selenium action");
        });

        step("В разделе \"Услуги\" кликнуть на каждый вариант и проверить содержимое.", () -> {
            step("// todo: just add selenium action");
        });

        step("В разделе \"Вакансии\" кликнуть на каждый вариант и проверить содержимое", () -> {
            step("// todo: just add selenium action");
        });
    }
}