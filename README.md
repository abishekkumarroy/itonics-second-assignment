This project is done by selenium webdriver ,junit and TestNG

It has a xml file which used to run multiple tests in our system
Rightnow we are using testng.xml which has webdriver listener for driver  /extent manager for reporting

Software reqirements:-
java version "1.8.0_131"
Apache Maven 3.9.6 
Selenium 3.8.1

To run via terminal :-mvn clean test -DsuiteXmlFile="data/config/testng.xml"

Final output:- Reports are stored in reports folder

Tests description:-
It has two tests in tests/java folder
1. bookCartTest which tries to fetch authkey & navigate to users detail page & assert
2. bookcartloginviaPortal which tries to touch login button then login & verify username 
