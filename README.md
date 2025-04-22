## Dependencies and notes
Note:

make sure "Cucumber for java" and "Gherkin" plugin are downloaded and activated by click ctrl + alt + s and then click the "plugins" at gradle.build file

This project requires the following dependencies:

- Cucumber
- Selenium
- JUnit
- Gradle

## Project Structure

The project is organized as follows:

- `src/test/java/cucumber`: Contains the Page Object classes, step definition, base driver and execute class
- `src/test/java/cucumber/page`: Contains the Page Object classes
- `src/test/java/cucumber/stepDef`: Contains the the Step definitions for gherkin files and as a connector between gherkin to page folder
- `src/test/resources/`: Contains the Gherkin feature files
- `build.gradle`: Gradle build configuration file for dependencies and tasks.

## Where is the report result?

The report result can be found after executing the program, you can follow one of this step:
- write "./gradlew cucumber" on terminal
- execute the cucumberRun class at 'src/test/java/cucumber/cucumberRun'
- execute the gherkin feature file

The report will appear in the "report" folder. The reports contain .html and .json files
