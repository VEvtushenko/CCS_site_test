# Проект по автоматизации тестрования сайта компании CCS

## Навигация

<a href="#Реализованные-проверки">Реализованные проверки</a>

<a href="#Запуск-тестов-из-терминала">Запуск тестов из терминала</a>

<a href="#Параметры-тестов">Параметры тестов</a>

<a href="#Сборка-в-Jenkins">Сборка в Jenkins</a>

<a href="#Отчет-allure-report">Отчет Allure Report</a>

<a href="#Интеграция-с-allure-testops">Интеграция с Allure TestOps</a>

<a href="#Интеграция-с-jira">Интеграция с Jira</a>

<a href="#Уведомления-в-Telegram">Уведомления в Telegram</a>

<a href="#Видеозапись-прохождения-теста">Видеозапись прохождения теста</a>

<a href="#Применявшийся-стек">Применявшийся стек</a>

## Реализованные проверки

* <a href="#Запуск-проверки-разделов">Позитивный тест на соответствие ссылок на разделы сайта и их содержания</a>
* <a href="#Запуск-проверок-раздела-Услуги">Позитивный тест на соответствие заголовков предоставляемых услуг и наполнения подразделов</a>
* * Проверка, что в разделе "Услуги" подразделы правильно разворачивают я и сворачиваются
* <a href="#Запуск-проверок-раздела-Вакансии">Позитивный тест на соответствие заголовков предлагаемых вакансий и наполнения подразделов</a>
* * Проверка, что в разделе "Вакансии" подразделы правильно разворачиваютя и сворачиваются

<a href="#Навигация">Назад к оглавлению</a>

## Запуск тестов из терминала

Запуск всех тестов
```bash
gradle clean testCcsSite
```
#### Запуск проверки разделов
```bash
gradle clean testSiteSections
```
#### Запуск проверок раздела "Услуги"
```bash
gradle clean testSectionServices
```
#### Запуск проверок раздела "Вакансии"
```bash
gradle clean testSectionVacancies
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
<a href="#Навигация">Назад к оглавлению</a>

## Параметры тестов
For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)

<a href="#Навигация">Назад к оглавлению</a>

## Сборка в Jenkins
<a target="_blank" href="https://jenkins.autotests.cloud/job/C12-Snark-CCS_site_test/">There you may run the tests by yourself</a>

<a href="#Навигация">Назад к оглавлению</a>

## Отчет Allure Report
<a target="_blank" href="https://jenkins.autotests.cloud/job/C12-Snark-CCS_site_test/allure/">Allure report</a>

<a href="#Навигация">Назад к оглавлению</a>

## Интеграция с Allure TestOps

<a href="#Навигация">Назад к оглавлению</a>

## Интеграция с Jira

<a href="#Навигация">Назад к оглавлению</a>

##Уведомления в Telegram
You may receive notification about test status in Telegram.
For receiveing notifications <a target="_blank" href="https://t.me/+riUIEOt4kjswODYy">join this group</a>

Notifications will be sent every time when <a target="_blank" href="https://jenkins.autotests.cloud/job/C12-Snark-CCS_site_test/">this Jenkins job</a> will be run

For more information about configure and using notifications <a target="_blank" href="https://github.com/qa-guru/allure-notifications">visit developers page</a>

<a href="#Навигация">Назад к оглавлению</a>

## Видеозапись прохождения теста
<p><img src="readme-files/test_video/CCS.gif" alt="Здесь должна быть gif с тестом"></p>

<a href="#Навигация">Назад к оглавлению</a>

## Применявшийся стек
IntelliJ IDEA Java Gradle Selenide Selenoid JUnit5 Jenkins Allure Report Allure TestOps Telegram Jira
<p align="center">
<img width="4%" title="IntelliJ IDEA" src="readme-files/logo/Intelij_IDEA.svg"  alt="IntelliJ IDEA">
<img width="4%" title="Java" src="readme-files/logo/Java.svg" alt="Java">
<img width="4%" title="Selenide" src="readme-files/logo/Selenide.svg" alt="Selenide">
<img width="4%" title="Selenoid" src="readme-files/logo/Selenoid.svg" alt="Selenoid">
<img width="4%" title="Allure Report" src="readme-files/logo/Allure_Report.svg" alt="Allure Report">
<img width="4%" title="Allure TestOps" src="readme-files/logo/Allure_TO.svg" alt="Allure TestOps">
<img width="4%" title="Gradle" src="readme-files/logo/Gradle.svg" alt="Gradle">
<img width="4%" title="JUnit5" src="readme-files/logo/JUnit5.svg" alt="JUnit5">
<img width="4%" title="GitHub" src="readme-files/logo/GitHub.svg" alt="GitHub">
<img width="4%" title="Jenkins" src="readme-files/logo/Jenkins.svg" alt="Jenkins">
<img width="4%" title="Telegram" src="readme-files/logo/Telegram.svg" alt="Telegram">
<img width="4%" title="Jira" src="readme-files/logo/Jira.svg" alt="Jira">
</p>

<a href="#Навигация">Назад к оглавлению</a>

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
