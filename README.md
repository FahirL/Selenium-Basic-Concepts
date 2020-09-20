# Selenium-Basic-Concepts
Automated test examples in Java with  Selenium WebDriver. This project is set of examples for Web automation using Selenium WebDriver. 
Test scenarios are described in the feature files located here ./src.
You can see following examples for automation web testing:
*  Practise exercises with Xpath and CSS with regular
expressions
* Handling Static and Dynamic dropdowns with Select webdriver
API
* Handling AutoSuggestive dropdowns
* Handling Checkboxs
* Handling Calendar UI
* Handling Java Alerts
* Functional testing using eCommerce app
* Synchronization (implicit wait, explicit wait, fluent wait)
* Handling Ajax/Mouse Interactions
* Handling Multiple Windows
* Frames techniques
* Real time exercises (e2e)
* Handling table grids
* JavaScript execotor
* Miscellaneous topics( handling https and ssl certifications, screenshot in selenium, automate broken links, assertions)


# Selenium [![Travis Status](https://travis-ci.com/SeleniumHQ/selenium.svg?branch=trunk)](https://travis-ci.com/SeleniumHQ/selenium/builds) [![AppVeyor Status](https://ci.appveyor.com/api/projects/status/pg1f99p1aetp9mk9/branch/trunk?svg=true)](https://ci.appveyor.com/project/SeleniumHQ/selenium/branch/trunk)

<a href="https://selenium.dev"><img src="https://selenium.dev/images/selenium_logo_square_green.png" width="180" alt="Selenium"/></a>

Selenium is an umbrella project encapsulating a variety of tools and
libraries enabling web browser automation. Selenium specifically
provides infrastructure for the [W3C WebDriver specification](https://w3c.github.io/webdriver/)
— a platform and language-neutral coding interface compatible with all
major web browsers.

The project is made possible by volunteer contributors who've
generously donated thousands of hours in code development and upkeep.

Selenium's source code is made available under the [Apache 2.0 license](https://github.com/SeleniumHQ/selenium/blob/trunk/LICENSE).

## Documentation

Narrative documentation:

* [User Manual](https://selenium.dev/documentation/)

API documentation:

* [C#](https://seleniumhq.github.io/selenium/docs/api/dotnet/)
* [JavaScript](https://seleniumhq.github.io/selenium/docs/api/javascript/)
* [Java](https://seleniumhq.github.io/selenium/docs/api/java/index.html)
* [Python](https://seleniumhq.github.io/selenium/docs/api/py/)
* [Ruby](https://seleniumhq.github.io/selenium/docs/api/rb/)

## Requirements

* The latest version of the [Java 11 OpenJDK](https://openjdk.java.net/)
* `java` and `jar` on the PATH (make sure you use `java` executable from JDK but not JRE).
  * To test this, try running the command `javac`. This command won't exist if you only have the JRE
  installed. If you're met with a list of command-line options, you're referencing the JDK properly.
* [Bazel](https://docs.bazel.build/versions/master/install.html)
* [Python](https://www.python.org/)
* `python` on the PATH
* [The Requests Library](http://python-requests.org) for Python: `pip install requests`
* MacOS users should have the latest version of Xcode installed, including the command-line tools.
The following command should work:
