#Author: Shayina Almas

@tag
Feature:To test login functionality

  @tag1
  Scenario:  To test reset button
     Given The user is in guru homepage
    When The user enters userId and password
    |username|password|
    |username1|password1|
   |username2|password2|
   |username3|password3|
   |username4|password4|
    And The user click reset button
    Then The user should see the fields empty

  