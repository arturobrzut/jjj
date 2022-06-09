Feature: My Excercise
  How Vowel Works

  Scenario: Vowel lowercase
    Given strings
      | ya |
    When I ask number of vowel
    Then I should see 2

  Scenario: Vowel case-insensitive
    Given strings
      | aaAAIIiiUUuuOOoo |
    When I ask number of vowel
    Then I should see 2


  Scenario: Vowel lowercase
    Given strings
      | Test1 |
      | Test2 |
      | Test3 |
      | Test4 |
      | Test5 |
    When I ask number of vowel
    Then I should see error 'Extra arguments passed.'

