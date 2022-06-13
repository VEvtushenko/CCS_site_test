package cloud.autotests.data;

import cloud.autotests.helpers.TextFilesReader;

import java.io.File;
import java.util.List;

public class TestData {

    private final static TextFilesReader textFilesReader = new TextFilesReader();

    private final static File
            sectionsNames = new File("src/test/resources/ccsSiteData/sectionsNames.txt"),
            sectionDesc = new File("src/test/resources/ccsSiteData/sectionsDesc.txt"),
            serviceSectionsNames = new File("src/test/resources/ccsSiteData/sections/services/serviceSectionsNames.txt"),
            serviceSectionsContent = new File("src/test/resources/ccsSiteData/sections/services/serviceSectionsContent.txt"),
            vacancyNames = new File("src/test/resources/ccsSiteData/sections/vacancies/vacancyNames.txt"),
            vacancyCharges = new File("src/test/resources/ccsSiteData/sections/vacancies/vacancyCharges.txt"),
            vacancyRequirements = new File("src/test/resources/ccsSiteData/sections/vacancies/vacancyRequirements.txt");

    public static final List<String>
            listServiceSectionsNames = textFilesReader.getListOfString(serviceSectionsNames),
            listServiceSectionsContent = textFilesReader.getListOfString(serviceSectionsContent),
            listSectionsDesc = textFilesReader.getListOfString(sectionDesc),
            listSectionsNames = textFilesReader.getListOfString(sectionsNames),
            listVacancyNames = textFilesReader.getListOfString(vacancyNames),
            listVacancyCharges = textFilesReader.getListOfString(vacancyCharges),
            listVacancyRequirements = textFilesReader.getListOfString(vacancyRequirements);
}
