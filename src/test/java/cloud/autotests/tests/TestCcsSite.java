package cloud.autotests.tests;

import io.qameta.allure.*;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static cloud.autotests.data.TestData.*;

@Owner("Vladimir Evtushenko")
@DisplayName("Тест сайта компании CCS")
@Feature("DemoQA")
@Link(value = "Code of tests on GitHub ", url = "https://github.com/VEvtushenko/CCS_site_test")

@Tag("testCcsSite")
public class TestCcsSite extends TestBase {

    static Stream<Arguments> dataSourceSiteSections() {
        return Stream.of(
                Arguments.of(listSectionsNames.get(0), listSectionsDesc.get(0)),
                Arguments.of(listSectionsNames.get(1), listSectionsDesc.get(1)),
                Arguments.of(listSectionsNames.get(2), listSectionsDesc.get(2)),
                Arguments.of(listSectionsNames.get(3), listSectionsDesc.get(3)),
                Arguments.of(listSectionsNames.get(4), listSectionsDesc.get(4))
        );
    }

    static Stream<Arguments> dataSourceServices() {
        return Stream.of(
                Arguments.of(listServiceSectionsNames.get(0), listServiceSectionsContent.get(0)),
                Arguments.of(listServiceSectionsNames.get(1), listServiceSectionsContent.get(1)),
                Arguments.of(listServiceSectionsNames.get(2), listServiceSectionsContent.get(2)),
                Arguments.of(listServiceSectionsNames.get(3), listServiceSectionsContent.get(3)),
                Arguments.of(listServiceSectionsNames.get(4), listServiceSectionsContent.get(4)),
                Arguments.of(listServiceSectionsNames.get(5), listServiceSectionsContent.get(5)),
                Arguments.of(listServiceSectionsNames.get(6), listServiceSectionsContent.get(6)),
                Arguments.of(listServiceSectionsNames.get(7), listServiceSectionsContent.get(7))
        );
    }

    static Stream<Arguments> dataSectionVacancies() {
        return Stream.of(
                Arguments.of(listVacancyNames.get(0), listVacancyCharges.get(0), listVacancyRequirements.get(0)),
                Arguments.of(listVacancyNames.get(1), listVacancyCharges.get(1), listVacancyRequirements.get(1)),
                Arguments.of(listVacancyNames.get(2), listVacancyCharges.get(2), listVacancyRequirements.get(2)),
                Arguments.of(listVacancyNames.get(3), listVacancyCharges.get(3), listVacancyRequirements.get(3)),
                Arguments.of(listVacancyNames.get(4), listVacancyCharges.get(4), listVacancyRequirements.get(4)),
                Arguments.of(listVacancyNames.get(5), listVacancyCharges.get(5), listVacancyRequirements.get(5)),
                Arguments.of(listVacancyNames.get(6), listVacancyCharges.get(6), listVacancyRequirements.get(6))
        );
    }


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