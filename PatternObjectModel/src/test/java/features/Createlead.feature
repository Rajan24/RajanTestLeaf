Feature: Login the Application
Scenario Outline: Login
Given LeafTaps application
And ^Enter UserName$<UserName>
And Enter_Password<Password>
And Click Login
Then verify login
And click CRM/SFA
And click Create Lead
And Enter Company Name<cName>
And Enter First name<fName>
And Enter Last name<lName>
And click Create Lead
Examples:
|UserName|Password|cName|fName|lName|
|DemoSalesManager|crmsfa|Hurix|Rajan|Palani|
