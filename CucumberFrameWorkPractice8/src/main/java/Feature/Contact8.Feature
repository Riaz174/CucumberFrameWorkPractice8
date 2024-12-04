Feature: Join Us Form

@tag1
  Scenario Outline: 
    Verify taht when the user clicks contact link, Join Us form displays and when user clicks the register button after entering required fiels confirmation messages displays.

    Given Already opened the protrainingtech.com website
    When user clicks contact link
    Then Join us form opens
    When user enters the value of first name "<FirstName>"
    And user enters the value of last name "<LastName>"
    And user enters the value of email "<Email>"
    And user enters the value of phone "<Phone>"
    And user clicks the register button
    Then user able to see confirmation message

    Examples: 
      | FirstName | LastName | Email          | Phone      |
      | John      | Doe      | john@gmail.com | 2403456578 |
