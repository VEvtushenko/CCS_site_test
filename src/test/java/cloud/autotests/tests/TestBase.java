package cloud.autotests.tests;

import cloud.autotests.config.Project;
import cloud.autotests.helpers.AllureAttachments;
import cloud.autotests.helpers.DriverSettings;
import cloud.autotests.helpers.DriverUtils;
import cloud.autotests.pages.CcsSite;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static cloud.autotests.data.TestData.*;


@ExtendWith({AllureJunit5.class})
public class TestBase {

    CcsSite ccsSite = new CcsSite();

    @BeforeAll
    static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        DriverSettings.configure();
    }

    @AfterAll
    static void addAttachments() {
        String sessionId = DriverUtils.getSessionId();
        AllureAttachments.addScreenshotAs("Last screenshot");
        AllureAttachments.addPageSource();
        AllureAttachments.addBrowserConsoleLogs();
        if (Project.isVideoOn()) {
            AllureAttachments.addVideo(sessionId);
        }
        Selenide.closeWebDriver();
    }

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
}
