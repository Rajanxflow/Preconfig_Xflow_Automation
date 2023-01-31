Feature: Addition of vertical
@sanity
Scenario: steps for adding verticals
Given user launch chrome browser
When user open URL "https://preconfig-a13.expflow.in/auth/sign-in"
And setUsername as "onboarding@xflow.com" setPassword "xFlow@321" And click on submit button
Then page title will be "ExperienceFlow" 
When Click on the Add vertical button
Then write Vertical name
And short name And description
When click on time range Then select the time range as per desire from list
When click on Data range Then select the desire value from the list
When click on Trend Range Then select the desire value from the list
When click on Context Range Then select the desire value from the list
When click on Contributors Range Then select the desire value from the list
When click on Recommended Action Range Then select the desire value from the list
When click on Prediction Range Then select the desire value from the list
Then click on save button