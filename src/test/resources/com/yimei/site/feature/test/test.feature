Feature: Sign-up
  sign-up shoulr be quick and friendly.
  Scenario: Successful sign-up
    New users shoule get a confirmation email and be greeted
    personally by the site once signed in.

    Given I have chosen to sign up
    When I sign up with valid datails
    Then I shoule receive a confirmation email
    And I shoule see a personalized greeting message

    Scenario: Duplicate email
      where someone triesto create an account for an email address
      that already exists.
      Given  I have chosen to sign up
      When I sign up with an emaik address that has alresdy resgistered
      Then I should br told that the email is already registered
      And I shoule be offered the option to recover my password
      