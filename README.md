# RemoteHRLeaveEntryAutomation

**Selenium Leave Entry Automation**
This project automates the process of logging into a web application and entering leave data using Selenium WebDriver with Java. The automation script is written using TestNG for easy testing and WebDriverManager for handling the browser driver setup.

**Prerequisites**</br>
Java (JDK 8 or later) </br>
Selenium WebDriver</br>
TestNG</br>
WebDriverManager</br>
Maven (for managing dependencies)</br>
**Technologies Used**
Selenium WebDriver: For automating the browser actions.
TestNG: For structuring the tests and enabling features like annotations.
WebDriverManager: Automatically handles the browser driver setup.
Maven: For managing project dependencies.

**Setup**
**Step 1: Clone the repository**
Clone the repository to your local machine using:

bash
Copy
git clone https://github.com/your-username/leave-entry-automation.git
**Step 2: Install Dependencies**
If you're using Maven, the dependencies will be automatically handled in the pom.xml. Make sure you have Maven installed, then run the following command to download the necessary libraries:

bash
Copy
mvn clean install
**Step 3: Set up ChromeDriver**
Make sure to use WebDriverManager to automatically manage the ChromeDriver setup. The code will set up the correct ChromeDriver version compatible with your installed Chrome browser.

**Step 4: Run the Test**
To run the test, you can execute it from the terminal using Maven or directly from your IDE.

From the terminal:

bash
Copy
mvn test
Or you can directly run the test through your IDE as a TestNG suite.

**Test Flow**
The automation script performs the following steps:

Navigate to the login page: The script first navigates to the login page of the web application (remoteHRLink).

Login:

The script enters the username test@akij.net and password ******.
Clicks the login button to authenticate the user.
Navigate to Leave Entry Page:

After login, it navigates to the dashboard and clicks on the "Leave Entry" option.
Leave Entry Form Filling:

Selects the leave type as Medical Leave.
Enters the start date and end date of the leave (02-26-2025 to 02-27-2025).
Fills out the phone number (0987654) and leave address (test).
Adds a reason for the leave (test).
Submit the Form:

Clicks on the "Submit" button to submit the leave request.
Close Browser: After the form is submitted, the browser is closed using driver.quit().

**Code Explanation**
Setting up the WebDriver:

We are using WebDriverManager to automatically handle the ChromeDriver installation and setup.
driver.navigate().to() is used to open the login URL in the browser.
Login:

The username and password are entered using sendKeys() method.
The login button is clicked using click().
Navigating to Leave Entry Form:

After a successful login, the script locates the "Leave Entry" page by navigating through the menu.
Filling the Leave Entry Form:

The leave type is selected and the start/end date is set using sendKeys() to input dates.
Personal details like phone number and leave address are also filled out before submitting the form.
