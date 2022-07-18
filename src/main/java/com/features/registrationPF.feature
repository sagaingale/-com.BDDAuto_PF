Feature: Demo Automation With Page Factory

Scenario Outline: RegistrationTest

Given User on registration page
Then  User type first name "<firstName>" and last name "<lastName>"
Then  User type Address "<Address>" and EmailID "<EmailId>" and MobileNo "<MobileNo>"
Then  User select Gender "<gender>" and Hobby "<hobby>"
Then  User select Language "<language>"
Then  User select Skill "<Skill>"
Then  User select Country "<Country>"
Then  User select date of birth "<Year>" and "<Month>" and "<Date>"
Then  User enter the password "<password>"
Then  User enter the confirmation password "<compassword>"
Then  User click on submit button

Examples:
|firstName|lastName|Address |     EmailId    |MobileNo  | gender | hobby           |language         |Skill|Country|Year|Month   |Date| password|compassword|
|Sagar    |Ingale  |Amravati|sagar@gmail.com |9874563210| Male   | Cricket, Hockey |Arabic, English  | C   |India  |1991|July    |2   |sagar@123|sagar@123  |
#|Abhay    |Ingale  |Nagapur |abhay@gmail.com |7896542380| Male   | Hockey          |English          |Unix |India  |1992|October |2   |abhay@123|abhay@123  | 