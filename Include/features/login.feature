Feature: Test Login Functionality

  Scenario: Check login is successfull with valid credential
    Given User akses web dan ingin login
    When User input username dan password yang valid
    And Klik button login
    Then User berhasil login
