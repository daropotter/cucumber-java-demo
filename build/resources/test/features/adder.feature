Feature: Testing adder if it's correct
  If it is not, then what value would it provide?

  Scenario: Simple adding numbers
    When I add together 2 and 3
    Then the sum should be 5
    When I add together 1 and 2
    Then the sum should be 3

  Scenario: Adding zero shouldn't change the sum
    When I add together 9 and 0
    Then the sum should be 9
    When I add together 4 and 0
    Then the sum should be 4

  Scenario: Adding negative number works as a subtraction
    When I add together 5 and -2
    Then the sum should be 3
    When I add together -8 and 2
    Then the sum should be -6