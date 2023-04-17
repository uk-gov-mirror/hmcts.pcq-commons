# pcq-commons

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT) [![Java CI](https://github.com/hmcts/pcq-commons/actions/workflows/gradle.yml/badge.svg?branch=master)](https://github.com/hmcts/pcq-commons/actions/workflows/gradle.yml)

Repository of common code components for Protected Characteristics Question (PCQ) back-end applications.

## Overview

<p align="center">
<a href="https://github.com/hmcts/pcq-frontend">pcq-frontend</a> • <a href="https://github.com/hmcts/pcq-backend">pcq-backend</a> • <b><a href="https://github.com/hmcts/pcq-backend">pcq-commons</a></b> • <a href="https://github.com/hmcts/pcq-consolidation-service">pcq-consolidation-service</a> • <a href="https://github.com/hmcts/pcq-shared-infrastructure">pcq-shared-infrastructure</a> • <a href="https://github.com/hmcts/pcq-loader">pcq-loader</a>
</p>

<br>

<p align="center">
  <img src="https://raw.githubusercontent.com/hmcts/pcq-frontend/master/pcq_overview.png" width="500"/>
</p>

## Getting started

### Prerequisites

- [JDK 17](https://www.oracle.com/java)

## Usage

Just include the library as your dependency and you will be able to use the model, feign and util classes.

## Building

The project uses [Gradle](https://gradle.org) as a build tool but you don't have install it locally since there is a
`./gradlew` wrapper script.  

To build project please execute the following command:

```bash
    ./gradlew clean build
```

## Developing

### Coding style tests

To run all checks (including unit tests) please execute the following command:

```bash
    ./gradlew check
```

To just run the unit tests, please execute the following command:

```bash
    ./gradlew unit
```

To push the changes to your local repository execute the following command.

```bash
    ./gradlew publishToMavenLocal
```


## Versioning

For the versions available, see the tags on this repository. Always pull from master so that you've captured the latest update so all files are accurate.

```bash
    git tag
```

All release versions follow the format MAJOR.MINOR.PATCH and from October 2020 have been baselined at '1.0.0'.

### Applying a version tag

Tags are applied to the branch and then to master. 
Branch tags should be based off the **current** tag version but with the JIRA appended. 

The JIRA reference will need to be **omitted** and the tag version **updated** when applying the tag to **master**.

The *build.gradle* does **not** need to be updated as the tag version will be taken from the *git tag* once pushed to the remote.

The example below uses version '1.0.0' as the current release and '1.0.1' as the updated master release.

If master is not tagged, a release will not be created and therefore will be unavailable to other components.

#### Updating branch tag

Follow the steps below to tag a branch once the code review has completed. 
- Ensure build is successful: 
    - ./gradlew clean build
- Create the tag in git with the new version and JIRA reference.
    - git tag -a 1.0.0.PCQ-1234-UpdateReadme -m "Update to README.md file."
- Push the new tag to the git remote server.
    - git push origin 1.0.0_PCQ-1234-UpdateReadme

#### Updating master tag

Perform the necessary validation steps to merge the code to master. Ensure the branch build succeeds, tagging in git though shows up as errors in travis-ci.
https://travis-ci.org/hmcts/pcq-commons/

Once the JIRA has been merged follow the steps below to tag master. 
- Locally get latest of master.
    - git checkout master
    - git pull
- Ensure build is successful: 
    - ./gradlew clean build
- Create the tag in git with the updated version:
    - git tag -a 1.0.1 -m "Update to README.md file."
- Push the new tag to the git remote server.
    - git push origin 1.0.1

You can verify the tag is correct in master by viewing the download link at the top of the readme, it should reflect the latest tag.

### Branch from a previous tag

To revert code to a previous tag you can checkout the tag to a new branch as follows.

```bash
    git checkout tags/1.0.0 -b PCQ-1235-Reverting-Back-To-Baseline 
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE.md) file for details.
