Feature: A new user account can be created if a proper unused username and password are given

  Scenario: creation successful with correct username and password
    Given new user is selected
    When unused username "mikko" and valid password "okkim1234" and password confirmation "okkim1234" are given
    Then new user is created


  Scenario: creation fails with too short username and valid passord
    Given new user is selected
    When invalid username "mi" is given and valid password "okkim1234" and password confirmation "okkim1234" are given
    Then user is not created and error "username should have at least 3 characters" is reported


  Scenario: creation fails with correct username and too short password
    Given new user is selected
    When unused username "ville" and invalid password "a1" and password confirmation "a1" are given
    Then user is not created and error "password should have at least 8 characters" is reported

  Scenario: creation fails with correct username and password consisting of letters
    Given new user is selected
    When unused username "alphabet" and invalid password "abcdefgh" and password confirmation "abcdefgh" are given
    Then user is not created and error "password can not contain only letters" is reported

