[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/p_ul8h4I)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-7f7980b617ed060a017424585567c406b6ee15c891e84e1186181d67ecf80aa0.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=14852269)
# java-gradle-template

[![build](https://github.com/will-molloy/java-gradle-template/workflows/build/badge.svg?branch=main&event=push)](https://github.com/will-molloy/java-gradle-template/actions?query=workflow%3Abuild)
[![codecov](https://codecov.io/gh/will-molloy/java-gradle-template/branch/main/graph/badge.svg)](https://codecov.io/gh/will-molloy/java-gradle-template)

template repository for Java projects using Gradle

## Features

- JDK 21 ([Amazon Corretto](https://aws.amazon.com/corretto/))
- Gradle 8
- [GitHub Actions](https://github.com/features/actions) CICD
- Automatic code formatting via [Spotless](https://github.com/diffplug/spotless)
- Code style analysis via [Checkstyle](https://github.com/checkstyle/checkstyle)
- Static analysis via [SpotBugs](https://spotbugs.github.io/)
- Unit and integration test support via [JUnit 5](https://junit.org/junit5/) and [TestSets plugin](https://github.com/unbroken-dome/gradle-testsets-plugin)
- Code coverage reporting via [Codecov](https://codecov.io/)
- Dependency upgrades via [Renovate bot](https://renovatebot.com)

## Usage

- Click [Use this template](https://github.com/will-molloy/java-gradle-template/generate)
  - This will prompt you to create a new repository with all the files setup
- Rename the root project (currently `java-gradle-template`) and group (currently `com.willmolloy`) to your liking
- Delete anything you won't use (sub projects, dependencies, etc.)
- Update the README
- Other non-code setup like your GitHub branch protections

### Build and test

```
./gradlew spotlessApply build integrationTest
```

## Promise

- Keep up to date with:
  - Future Java versions
  - Future Gradle versions
  - Other dependency upgrades
  - Any other cool tools or plugins
