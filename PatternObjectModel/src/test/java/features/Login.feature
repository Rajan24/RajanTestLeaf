Feature: Login into TestLeaf application
Scenario: Login 
Given Invoke LeafTaps
And Enter the UserName
And Enter the Password
And Click on login
Then verify the login