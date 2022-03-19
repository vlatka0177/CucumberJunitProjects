Feature: Wikipedia search functionality and verifications

  Scenario: Wikipedia Search Functionality Header Verification
    Given user is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header
