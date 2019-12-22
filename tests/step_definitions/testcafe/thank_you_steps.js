const { client } = require('nightwatch-cucumber');
const { Given, When, Then } = require('cucumber');

const browser = client.page.testcafe.thank_you_page();

Then(/^thank you page with contributor name will appear$/, () => {
  return browser.assertThankYou();
});
