# Rename Commit Plugin
This project is a recruitment task. The plugin allows users to change the most recent commit's message in a Git repository within IntelliJ IDEA.  
## Features
Rename the most recent commit message in a Git repository.
## Installation
* Clone the repository:
```bash
git clone https://github.com/Batory12/rename-commit-plugin.git
```
* Open the project in IntelliJ IDEA.
### Running the Project
* Ensure you have the necessary dependencies in your build.gradle file:
```groovy
dependencies {
implementation project(":plugins:git4idea")
}
```
* Build the project using Gradle:
```bash
./gradlew build
 ```
or if you are using Windows:
```bash
gradlew.bat build
```

### Run the plugin
* Open the plugin.xml file.
* Click on the Run button in the top right corner of the IntelliJ IDEA window.
## Usage
Open a project with a Git repository in IntelliJ IDEA.
Navigate to VCS > Rename Current Commit.
Enter the new commit message in the dialog box and click OK.