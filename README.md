# RemoteHRLeaveEntryAutomation

<b>Selenium Leave Entry Automation</b>  
This project automates the process of logging into a web application and entering leave data using Selenium WebDriver with Java. The automation script is written using TestNG for easy testing and WebDriverManager for handling the browser driver setup.

<b>Prerequisites</b>  
<ul>
  <li>Java (JDK 8 or later)</li>
  <li>Selenium WebDriver</li>
  <li>TestNG</li>
  <li>WebDriverManager</li>
  <li>Maven (for managing dependencies)</li>
</ul>

<b>Technologies Used</b>  
<ul>
  <li><b>Selenium WebDriver</b>: For automating the browser actions.</li>
  <li><b>TestNG</b>: For structuring the tests and enabling features like annotations.</li>
  <li><b>WebDriverManager</b>: Automatically handles the browser driver setup.</li>
  <li><b>Maven</b>: For managing project dependencies.</li>
</ul>

<b>Setup</b>  
<b>Step 1:</b> Clone the repository  
Clone the repository to your local machine using:  
<pre><code>git clone (https://github.com/fablihaafia/RemoteHRLeaveEntryAutomation.git)</code></pre>

<b>Step 2:</b> Install Dependencies  
If you're using Maven, the dependencies will be automatically handled in the <code>pom.xml</code>. Make sure you have Maven installed, then run the following command to download the necessary libraries:  
<pre><code>mvn clean install</code></pre>

<b>Step 3:</b> Set up ChromeDriver  
Make sure to use WebDriverManager to automatically manage the ChromeDriver setup. The code will set up the correct ChromeDriver version compatible with your installed Chrome browser.

<b>Step 4:</b> Run the Test  
To run the test, you can execute it from the terminal using Maven or directly from your IDE.  

<b>From the terminal:</b>  
<pre><code>mvn test</code></pre>  
Or you can directly run the test through your IDE as a TestNG suite.

<b>Test Flow</b>  
The automation script performs the following steps:

<ul>
  <li><b>Navigate to the login page:</b> The script first navigates to the login page of the web application (remoteHRLink).</li>
  <li><b>Login:</b>
    <ul>
      <li>The script enters the username <i>test@akij.net</i> and password <i>******</i>.</li>
      <li>Clicks the login button to authenticate the user.</li>
    </ul>
  </li>
  <li><b>Navigate to Leave Entry Page:</b> After login, it navigates to the dashboard and clicks on the "Leave Entry" option.</li>
  <li><b>Leave Entry Form Filling:</b>
    <ul>
      <li>Selects the leave type as <i>Medical Leave</i>.</li>
      <li>Enters the start date and end date of the leave (<i>02-26-2025</i> to <i>02-27-2025</i>).</li>
      <li>Fills out the phone number (<i>0987654</i>) and leave address (<i>test</i>).</li>
      <li>Adds a reason for the leave (<i>test</i>).</li>
    </ul>
  </li>
  <li><b>Submit the Form:</b> Clicks on the "Submit" button to submit the leave request.</li>
  <li><b>Close Browser:</b> After the form is submitted, the browser is closed using <code>driver.quit()</code>.</li>
</ul>

<b>Code Explanation</b>  
<b>Setting up the WebDriver:</b>  
We are using WebDriverManager to automatically handle the ChromeDriver installation and setup. <code>driver.navigate().to()</code> is used to open the login URL in the browser.

<b>Login:</b>  
The username and password are entered using <code>sendKeys()</code> method. The login button is clicked using <code>click()</code>.  

<b>Navigating to Leave Entry Form:</b>  
After a successful login, the script locates the "Leave Entry" page by navigating through the menu.  

<b>Filling the Leave Entry Form:</b>  
The leave type is selected and the start/end date is set using <code>sendKeys()</code> to input dates. Personal details like phone number and leave address are also filled out before submitting the form.
