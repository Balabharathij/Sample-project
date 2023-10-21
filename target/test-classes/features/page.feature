Feature: LoginPage for Facebook

Background:
	 Given Launch the Browser
    And Enter the URL
 
 @Sce1
 Scenario: Enter the valid username and password
    When Enter the username "Aiite"
    And Enter the password "A45AA"
    And Enter the loginbutton
    Then Validate the HomePage
  
 @Sce2
 Scenario: Enter the valid username and password
    When Enter the username "Aiit"
    And Enter the password "A45"
    And Enter the loginbutton
    Then Validate the HomePage