Feature: Log PM

Scenario: Log PM

Given I am on the CRM home page.
And I wait for 1 seconds.
And on the CRM page I click next.
And I wait for 1 seconds.
And on the CRM page I click next.
And on the CRM page I copy the test value.
And on the CRM page I copy the second test value.
And I wait for 1 seconds.
And on the CRM page I click next.
And I wait for 1 seconds.
And on the CRM page I click next.
And I wait for 1 seconds.
When I am on the CYDAX home page.
And I wait for 1 seconds.
And I click next.
And I paste the test value in the test field.
And I wait for 1 seconds.
And I click next.
And I paste the second test value in the second test field.
And I wait for 1 seconds.
And I click next.
Then the test value is displayed correctly.
And the second test value is displayed correctly.
And I wait for 3 seconds.
