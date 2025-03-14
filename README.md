# RemoteHRLeaveEntryAutomation

**Selenium Leave Entry Automation**
This project automates the process of logging into a web application and entering leave data using Selenium WebDriver with Java. The automation script is written using TestNG for easy testing and WebDriverManager for handling the browser driver setup.

**Prerequisites**</br>
Java (JDK 8 or later) </br>
Selenium WebDriver</br>
TestNG</br>
WebDriverManager</br>
Maven (for managing dependencies)</br>
**Technologies Used**</br>
Selenium WebDriver: For automating the browser actions.</br>
TestNG: For structuring the tests and enabling features like annotations.</br>
WebDriverManager: Automatically handles the browser driver setup.</br>
Maven: For managing project dependencies.</br>

**Setup**</br>
**Step 1: Clone the repository**</br>
Clone the repository to your local machine using:</br>

bash</br>
Copy</br>
git clone(https://github.com/fablihaafia/RemoteHRLeaveEntryAutomation.git)</br>
**Step 2: Install Dependencies**</br>
If you're using Maven, the dependencies will be automatically handled in the pom.xml. Make sure you have Maven installed, then run the following command to download the necessary libraries:</br>

bash</br>
Copy</br>
mvn clean install</br>
**Step 3: Set up ChromeDriver**</br>
Make sure to use WebDriverManager to automatically manage the ChromeDriver setup. The code will set up the correct ChromeDriver version compatible with your installed Chrome browser.</br>

**Step 4: Run the Test**</br>
To run the test, you can execute it from the terminal using Maven or directly from your IDE.</br>

**From the terminal:**</br>

bash</br>
Copy</br>
mvn test</br>
Or you can directly run the test through your IDE as a TestNG suite.</br>

**Test Flow**</br>
The automation script performs the following steps:</br>

Navigate to the login page: The script first navigates to the login page of the web application (remoteHRLink).</br>

**Login:**</br>

The script enters the username test@akij.net and password ******.</br>
Clicks the login button to authenticate the user.</br>
Navigate to Leave Entry Page:</br>

After login, it navigates to the dashboard and clicks on the "Leave Entry" option.</br>
Leave Entry Form Filling:</br>

Selects the leave type as Medical Leave.</br>
Enters the start date and end date of the leave (02-26-2025 to 02-27-2025).</br>
Fills out the phone number (0987654) and leave address (test).</br>
Adds a reason for the leave (test).</br>
Submit the Form:</br>

Clicks on the "Submit" button to submit the leave request.</br>
**Close Browser: After the form is submitted, the browser is closed using driver.quit().**</br>

**Code Explanation**</br>
Setting up the WebDriver:</br>

We are using WebDriverManager to automatically handle the ChromeDriver installation and setup.
driver.navigate().to() is used to open the login URL in the browser.</br>
**Login:**</br>

The username and password are entered using sendKeys() method.
The login button is clicked using click().
Navigating to Leave Entry Form:

After a successful login, the script locates the "Leave Entry" page by navigating through the menu.
Filling the Leave Entry Form:

The leave type is selected and the start/end date is set using sendKeys() to input dates.
Personal details like phone number and leave address are also filled out before submitting the form.
