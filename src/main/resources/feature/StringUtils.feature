Feature: My StringUtils
  @wip
  Scenario: Should convert String to upper case
    Given My StringUtils app should be running
    When I pass lowercase String object cucumber
    Then result should be in uppercase and equal to CUCUMBER

  @wip
  Scenario: Should convert String to lower case
    Given My StringUtils app should be running
    When I pass uppercase String object CUCUMBER
    Then result should be in lowercase and equal to cucumber