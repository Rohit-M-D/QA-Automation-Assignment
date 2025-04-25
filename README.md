# QA-Automation-Assignment

# 🚀 Assignment Automation Framework

This is an automated test framework built using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven**. It includes reusable methods, structured test execution.

---

## 📂 Project Structure
Assignment -> src -> test -> java -> Tests
.
├── pom.xml
├── README.md
├── reports
│   ├── index.html
│   └── screenshots
│       ├── invalidLoginTest.png
│       ├── otpPageTest.png
│       ├── validLoginTest.png
│       └── wrongMobNoTest.png
└── src
    ├── main
    │   └── java
    │       ├── Pages
    │       │   ├── BaseMethods.java
    │       │   ├── LoginFlow.java
    │       │   └── WebLaunch.java
    │       └── TestUtils
    │           ├── ExtentReportNG.java
    │           └── Listeners.java
    ├── resources
    │   ├── credentials.properties
    │   ├── locator.properties
    │   └── pagelabels.properties
    └── test
        └── java
            └── Tests
                ├── suite
                │   └── testng.xml
                ├── TC01_LoginTest.java
                ├── TC02_InvalidLoginTest.java
                ├── TC03_GetOtpTest.java
                └── TC04_WrongMobileNumberTest.java


## Explaination
In main/java
1. WebLaunch.java - To launch chrome webdriver
2. BaseMethods.java - have basic methods to use overall
3. LoginFlow.java - To perform test operations

In test/java
4. /*Test.java - Test case classes

To run the code use below command in project directory
mvn clean test
