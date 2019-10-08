Feature: /hi endpoint

  Scenario: /hi endpoint should return correct data
    Given I call "/hi/mo"
    Then I should expect "hi mo" to be returned