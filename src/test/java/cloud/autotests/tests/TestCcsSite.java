package cloud.autotests.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Тест сайта компании CCS")
@Tag("testCcsSite")
public class TestCcsSite extends TestBase {

    @Tag("testSiteSections")
    @MethodSource("dataSourceSiteSections")
    @ParameterizedTest(name = "Проверка соответствия ссылки на раздел \"{0}\" и его содержимого")
    void testSiteSections(String sectionName, String sectionContent) {
        ccsSite.openSite(sectionName)
                .sectionCheck(sectionContent);
    }

    @Tag("testSectionServices")
    @MethodSource("dataSourceServices")
    @ParameterizedTest(name = "Проверка наполнения подраздела \"Услуги/{0}\"")
    void testServSection(String servName, String servDescription) {
        ccsSite.openSite("Услуги")
                .servicesTest(servName, servDescription);
    }

    @Tag("testSectionVacancies")
    @MethodSource("dataSectionVacancies")
    @ParameterizedTest(name = "Проверка наполнения подраздела \"Вакансии/{0}\"")
    void testVacanciesSection(String vacancyName, String vacancyCharges, String vacancyRequirements) {
        ccsSite.openSite("Вакансии")
                .vacancyTest(vacancyName, vacancyCharges, vacancyRequirements);
    }
}