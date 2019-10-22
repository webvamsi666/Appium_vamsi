Feature: Test Contacts Android App.

  Scenario: Open app and give system permission.

  As a user I should be able to give system permission to my ContactsApp to access all my mobile contacts.

    When I launch ContactsApp.
    And  I given permission to  access my contacts.
    Then I see list of contatcs loaded on the screen.