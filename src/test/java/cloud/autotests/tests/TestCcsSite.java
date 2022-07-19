package cloud.autotests.tests;

import io.qameta.allure.*;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@Owner("Vladimir Evtushenko")
@DisplayName("Тест сайта компании CCS")
@Feature("DemoQA")
@Link(value = "Code of tests on GitHub ", url = "https://github.com/VEvtushenko/CCS_site_test")

@Tag("testCcsSite")
public class TestCcsSite extends TestBase {

    @Tag("testSiteSections")
    @Description("Проверка соответствия ссылки на раздел и содержания раздела")
    @Severity(SeverityLevel.BLOCKER)
    @MethodSource("dataSourceSiteSections")
    @ParameterizedTest(name = "Проверка соответствия ссылки на раздел \"{0}\" и его содержимого")
    void testSiteSections(String sectionName, String sectionContent) {
        ccsSite.openSite(sectionName)
                .sectionCheck(sectionContent);
    }

    @Tag("testSectionServices")
    @Description("Проверка описания предлагаемых услуг")
    @Severity(SeverityLevel.CRITICAL)
    @MethodSource("dataSourceServices")
    @ParameterizedTest(name = "Проверка наполнения подраздела \"Услуги/{0}\"")
    void testServSection(String servName, String servDescription) {
        ccsSite.openSite("Услуги")
                .servicesTest(servName, servDescription);
    }

    @Tag("testSectionVacancies")
    @MethodSource("dataSectionVacancies")
    @Description("Проверка описания вакансий")
    @Severity(SeverityLevel.NORMAL)
    @ParameterizedTest(name = "Проверка наполнения подраздела \"Вакансии/{0}\"")
    void testVacanciesSection(String vacancyName, String vacancyCharges, String vacancyRequirements) {
        ccsSite.openSite("Вакансии")
                .vacancyTest(vacancyName, vacancyCharges, vacancyRequirements);
    }
}