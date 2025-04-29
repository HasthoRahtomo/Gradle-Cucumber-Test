Feature: Get User by ID

  Scenario: TCGI-001 - Get user data with valid id
    Given The API base URL is "https://reqres.in/"
    And I send a GET request to "api/users/"
    And I put api key "eqres-free-v1"
    When I set user ID to 2
    Then The response status code should be 200
