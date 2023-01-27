Feature: Login
Scenario: login with valid credential
Given user launch chrome browser
When user open URL "https://preconfig-a13.expflow.in/auth/sign-in"
And setUsername as "onboarding@xflow.com" setPassword "xFlow@321" And click on submit button
Then page title will be "ExperienceFlow" 
And close the browser 
