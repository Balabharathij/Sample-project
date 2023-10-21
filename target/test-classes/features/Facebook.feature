@sce3
Feature: Loginpage for FB

Background:
	 Given Launch the Browser
    And Enter the URL
    
   @Sce3 
	Scenario Outline: Validate user name and password
	When Enter the username "<username>"
	And Enter the password "<Password>"
	And Enter the Login 
	Then Validate the HomePage

	Examples:
	| username | Password |
	| Aiite1 | 1234 |
	| Aiite2 | 3214 | 
	| Aiite3 | 7894 |