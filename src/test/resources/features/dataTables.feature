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