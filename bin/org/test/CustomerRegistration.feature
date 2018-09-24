#Author: ShayinAlmas
@tag
Feature: To test new customer functionality
  
  @tag2
  Scenario Outline: To add new customers
    Given The user is in guru homepage
    And The user logged in as manager "<managerId>"and"<managerPass>"
    And The user navigate to new customer page 
    When The user enters the customer details"<customerName>","<gender>","<DOB>","<address>","<city>","<state>","<PIN>","<phone>","<email>"and"<pass>"
    And The user submits the form
    Then The user should see success page

    Examples: 
      |customerName| gender  |DOB        |   address   | city    | state  | PIN     | phone      | email           | pass   | managerId  | managerPass |
      |shayina     | female  |29/12/1990 |jothy nagar  | chennai | TN     | 603104  | 2234567897 | asdf@gmail.com  | qwerty | mngr154050 | zamynEs     |
      
