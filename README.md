# Проект по автоматизации тестрования сайта компании CCS
Навигация

[Покрытый функционал  Реализованные проверки](покрытый-функционал)

[Запуск тестов из терминала](#-запуск-тестов-из-терминала)

[Параметры тестов](#-параметры-тестов)

[Сборка в Jenkins](#-главная-страница-сборки-Jenkins)

[Отчет Allure Report](#-отчет-allure-report)

[Интеграция с Allure TestOps](#-интеграция-с-allure-testops)

[Интеграция с Jira](#-интеграция-с-jira)

[Уведомления в Telegram](#уведомления-в-telegram)

<a href="#Видеозапись-прохождения-теста">Видеозапись прохождения теста</a>

<a href="#Применявшийся-стек">Применявшийся стек</a>

## <a name="покрытый-функционал"></a> Покрытый функционал

## Запуск тестов из терминала
Run tests with filled remote.properties:
```bash
gradle clean test
```

Serve report:
```bash
allure serve build/allure-results
```

For runing all tests use
```bash
.gradlew clean testCCSSite
``` 

For runing the links check for site sections use
```bash
.gradlew clean testSiteSections
```

For runing the "Service" section test use
```bash
.gradlew clean testSectionServices
```

For runing in Opera browser, 87.0 version the links check for site sections use
```bash
.gradlew clean testSiteSections -Dbrowser="opera" -DbrowserVersion="87.0"
```

## Параметры тестов
For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


## Сборка в Jenkins
<a target="_blank" href="https://jenkins.autotests.cloud/job/C12-Snark-CCS_site_test/">There you may run the tests by yourself</a>

## Отчет Allure Report
<a target="_blank" href="https://jenkins.autotests.cloud/job/C12-Snark-CCS_site_test/allure/">Allure report</a>

## Интеграция с Allure TestOps

## Интеграция с Jira

##Уведомления в Telegram
You may receive notification about test status in Telegram.
For receiveing notifications <a target="_blank" href="https://t.me/+riUIEOt4kjswODYy">join this group</a>

Notifications will be sent every time when <a target="_blank" href="https://jenkins.autotests.cloud/job/C12-Snark-CCS_site_test/">this Jenkins job</a> will be run

For more information about configure and using notifications <a target="_blank" href="https://github.com/qa-guru/allure-notifications">visit developers page</a>


## Видеозапись прохождения теста
<p><img src="readme-files/test_video/CCS.gif" alt="Здесь должна быть gif с тестом"></p>

## Применявшийся стек
IntelliJ IDEA Java Gradle Selenide Selenoid JUnit5 Jenkins Allure Report Allure TestOps Telegram Jira
<p align="center">
<img width="4%" title="IntelliJ IDEA" src="readme-files/logo/Intelij_IDEA.svg">
<img width="4%" title="Java" src="readme-files/logo/Java.svg">
<img width="4%" title="Selenide" src="readme-files/logo/Selenide.svg">
<img width="4%" title="Selenoid" src="readme-files/logo/Selenoid.svg">
<img width="4%" title="Allure Report" src="readme-files/logo/Allure_Report.svg">
<img width="4%" title="Gradle" src="readme-files/logo/Gradle.svg">
<img width="4%" title="JUnit5" src="readme-files/logo/JUnit5.svg">
<img width="4%" title="GitHub" src="readme-files/logo/GitHub.svg">
<img width="4%" title="Jenkins" src="readme-files/logo/Jenkins.svg">
<img width="4%" title="Telegram" src="readme-files/logo/Telegram.svg">
<img width="4%" title="Jira" src="readme-files/logo/Jira.svg">
<img width="4%" title="Jira" src="readme-files/logo/Allure_TO.svg">
</p>


:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
