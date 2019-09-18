Feature: HP

Scenario Outline: Snap logs a PM Kit

Given Snap is on the CRM home page.
And Snap clicks next.
And Snap clicks next.
And Snap copies the service request number.
And Snap copies the country
And Snap copies the agreement
And Snap copies the company
And Snap copies the part numer
When the agreement type is PM Kit.
Then Snap clicks next.
And Snap clicks next.

And Snap is on the CYDAX home page.
And Snap Clicks 'Go to search'.
And Snap pastes the service request number.
And Snap Clicks search.
And Snap Clicks edit.
And Snap pastes the country.
And Snap pastes the agreement type.
And Snap pastes the company.
And Snap pastes the part number.
And Snap clicks next.
And Snap Clicks finnish.

Examples:
|run|
|1|
|2|
|3|
|4|
|5|
|6|
|7|
|8|
|9|
|10|