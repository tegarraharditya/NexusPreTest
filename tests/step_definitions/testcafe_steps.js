const { client } = require('nightwatch-cucumber');
const { Given, When, Then } = require('cucumber');

const browser = client.page.testcafe_page();

Given(/^User is at testcafe homepage$/, () => browser.navigateToPage());

When(/^User enter "([^"]*)" at testcafe page$/, value => browser.input(value));

When(/^User click "([^"]*)" at testcafe page$/, value => browser.clickActions(value));

When(/^User select radio "([^"]*)" at testcafe page$/, value => browser.selectRadio(value));

When(/^User select check "([^"]*)" at testcafe page$/, value => browser.selectRadio(value));

When(/^User select list "([^"]*)" at testcafe page$/, value => browser.selectList(value));

Then(/^User can see final result in Result page$/, () => browser.verifyResult());
