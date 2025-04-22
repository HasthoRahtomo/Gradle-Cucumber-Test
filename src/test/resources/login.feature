@login
Feature: Login

  @valid-login
  Scenario: Login with correct username and password. Expectation: user will redirect to home page
    Given user in on the login page
    And user input username text box with "standard_user"
    And User input password text box with "secret_sauce"
    When user click login button
    Then user will redirect to the home page

  @invalid-login
  Scenario: Login with incorrect username and password. Expectation: user is still in the login page and an error message appear
    Given user in on the login page
    And user input username text box with "wrong_user"
    And User input password text box with "wrong_sauce"
    When user click login button
    Then user still in the login page
    And user see an error message "Epic sadface: Username and password do not match any user in this service"

  @boundaries-login
  Scenario: Login with really long username string. Expectation: user is still in the login page and an error message appear
    Given user in on the login page
    And user input username text box with "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse quis urna sapien. Aenean imperdiet sem non enim lacinia aliquam. Ut eget posuere mauris. Nulla a enim molestie, ultrices neque vel, aliquet metus. In venenatis condimentum congue. Suspendisse nisl arcu, maximus in varius non, ornare id massa. Donec euismod molestie gravida. Aenean est est, bibendum nec diam vitae, ultricies vestibulum arcu. Proin non justo id sapien hendrerit malesuada sed quis arcu. Etiam pharetra, neque at rhoncus placerat, tortor elit tincidunt mi, semper iaculis sem velit ut magna. Aliquam vitae vehicula tellus, vel faucibus metus. Ut ac pharetra nulla, eget volutpat dolor. Donec non urna lacus."
    And User input password text box with "wrong_sauce"
    When user click login button
    Then user still in the login page
    And user see an error message "Epic sadface: Username and password do not match any user in this service"

  @username-null-login
  Scenario: Login without username. Expectation: user is still in the login page and an error message appear
    Given user in on the login page
    And user input username text box with ""
    And User input password text box with "wrong_sauce"
    When user click login button
    Then user still in the login page
    And user see an error message "Epic sadface: Username is required"

  @password-null-login
  Scenario: Login without password. Expectation: user is still in the login page and an error message appear
    Given user in on the login page
    And user input username text box with "standard_user"
    And User input password text box with ""
    When user click login button
    Then user still in the login page
    And user see an error message "Epic sadface: Password is required"
