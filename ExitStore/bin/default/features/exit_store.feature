#Author: yinaa56@hotmail.com

Feature: Choose products from the store
  I want to choose products


  Scenario Outline: Choose products
    Given a user i want to enter the exit page
    When user select different products
    Then user verify the <status> the product and their characteristics

    Examples: 
      | status  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
