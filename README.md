# Automation Exercise - Registration Test

Automated UI test for the user registration flow on [automationexercise.com](https://www.automationexercise.com/login), built with Selenium WebDriver and TestNG.

## Overview

This project automates the **Sign Up / Registration** flow on the Automation Exercise website, verifying that a new user can successfully register with valid details.

## Tech Stack

- **Java** – programming language
- **Selenium WebDriver** – browser automation
- **TestNG** – test framework and execution
- **Maven** – dependency management and build tool

## Project Structure

```
src
 └── test
      └── java
           ├── tests/          # Test classes
           ├── pages/          # Page Object classes (if used)
           └── utils/          # Utility/helper classes
pom.xml                        # Maven dependencies and build configuration
```

## Prerequisites

Before running the tests, make sure you have:

- Java JDK installed (version 17+ recommended)
- Maven installed
- A supported browser (Chrome/Firefox) with matching WebDriver

## How to Run the Tests

1. Clone the repository:
   ```bash
   git clone <your-repo-url>
   cd <your-repo-name>
   ```

2. Run the tests using Maven:
   ```bash
   mvn clean test
   ```

3. View results in the console, or check the auto-generated TestNG report:
   ```
   test-output/index.html
   ```

## Test Scenario Covered

- Navigate to the login/registration page
- Enter new user details (name, email, password, address, etc.)
- Submit the registration form
- Verify successful account creation

## Notes

This project is part of a personal learning exercise to practice:
- Selenium WebDriver fundamentals
- TestNG test structuring
- Clean project setup with Maven

---

Feel free to explore, fork, or suggest improvements!
