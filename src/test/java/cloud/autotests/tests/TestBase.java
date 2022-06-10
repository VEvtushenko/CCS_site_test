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
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static cloud.autotests.data.testData.*;


@ExtendWith({AllureJunit5.class})
public class TestBase {

    CcsSite ccsSite = new CcsSite();

    @BeforeAll
    static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        DriverSettings.configure();
    }

    @AfterEach
    public void addAttachments() {
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
                Arguments.of(sectionAboutUs, contentAboutUs),
                Arguments.of(sectionServices, contentServices),
                Arguments.of(sectionVacancy, contentVacancy),
                Arguments.of(sectionCosts, contentCosts),
                Arguments.of(sectionContacts, contentContacts)
        );
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

    static Stream<Arguments> dataSectionVacancies() {
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

}
