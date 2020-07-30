Feature: login
  As user of the dafiti movil portal
  I need to validate the authentication to the portal

  @successfullogin
  Scenario: failed login password

    Given  that the user is in the login section

    When  I access  account

      | usuario | password |
      | jdlopez72@misena.edu.co | 1234 |


    Then He should watch a error to password



  Scenario: failed login user

    Given  that the user is in the login section

    When  I access  account

      | usuario | password |
      | jdlopez72@gmail.com | jd325488234 |

    Then He should watch a error to user

  Scenario: successful login
    Given  that the user is in the login section
    When  I access  account
      | usuario                 | password  |
      | jdlopez72@misena.edu.co | jd2548823 |

    Then He should see jdlopez lopez





