Feature: Examples of Cucumber data table implementations

  @wip
  Scenario: List of fruits I like
    Then user should see fruits I like
    | kiwi        |
    | banana      |
    | pineapple   |
    | strawberry  |
    | pomegranate |
    | orange      |
    | cucumber    |

    # To beautify the pipes above
    # Mac: command + option + L
    # Windows: control + alt + L

  @wip
  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |