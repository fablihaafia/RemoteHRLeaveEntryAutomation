RemoteHRLeaveEntryAutomation
Selenium Leave Entry Automation

This project automates the process of logging into a web application and entering leave data using Selenium WebDriver with Java. The automation script is written using TestNG for easy testing and WebDriverManager for handling the browser driver setup.

Prerequisites
Before setting up the project, ensure you have the following:

Java (JDK 8 or later)
Selenium WebDriver
TestNG
WebDriverManager
Maven (for managing dependencies)
Technologies Used
Selenium WebDriver: For automating browser actions.
TestNG: For structuring tests and enabling annotations.
WebDriverManager: Automatically handles the browser driver setup.
Maven: For managing project dependencies.
Setup
Follow the steps below to set up the project locally.

Step 1: Clone the repository
Clone the repository to your local machine using the following command:

bash
Copy
git clone https://github.com/fablihaafia/RemoteHRLeaveEntryAutomation.git
Step 2: Install Dependencies
If you're using Maven, dependencies will be automatically handled in the pom.xml file. Make sure Maven is installed, then run the following command to download the necessary libraries:

bash
Copy
mvn clean install
Step 3: Set up ChromeDriver
Ensure you have WebDriverManager configured in your project. WebDriverManager will automatically download and manage the ChromeDriver version compatible with your installed Chrome browser.

Step 4: Run the Test
To run the test, you can execute it from the terminal using Maven or directly from your IDE.

From the terminal:

bash
Copy
mvn test
Alternatively, you can run the test directly through your IDE as a TestNG suite.

Test Flow
The automation script performs the following steps:

Navigate to the login page:

The script opens the login page of the web application (remoteHRLink).
Login:

The script enters the username (test@akij.net) and password (******).
It clicks the login button to authenticate the user.
Navigate to Leave Entry Page:

After a successful login, it navigates to the dashboard and clicks the "Leave Entry" option.
Leave Entry Form Filling:

Selects the leave type as Medical Leave.
Enters the start date (02-26-2025) and end date (02-27-2025).
Fills out the phone number (0987654) and leave address (test).
Adds a reason for the leave (test).
Submit the Form:

Clicks on the "Submit" button to submit the leave request.
Close Browser:

After the form is submitted, the browser is closed using driver.quit().
Code Explanation
Setting up the WebDriver:

WebDriverManager is used to automatically handle the ChromeDriver installation and setup.
driver.navigate().to() is used to open the login URL in the browser.
Login:

The username and password are entered using the sendKeys() method.
The login button is clicked using the click() method.
Navigating to Leave Entry Form:

After successful login, the script locates the "Leave Entry" page by navigating through the menu.
Filling the Leave Entry Form:

The leave type is selected, and the start/end dates are set using sendKeys() to input the dates.
Personal details like phone number and leave address are filled out before submitting the form.
Running the Test in Your Local Environment
Clone the repository using the provided git clone command.
Run mvn clean install to install the dependencies.
Run mvn test to start the test from the terminal or use an IDE with TestNG integration to run the suite.
