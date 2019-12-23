const { client } = require('nightwatch-cucumber');
const { Given, When, Then } = require('cucumber');

const browser = client.page.testcafe.example_page();

Given(/^user is in example page$/, () => {
  return browser.navigateToExamplePage();
})

When(/^user input name in Your Name field$/, () => {
  return browser.inputYourName();
})

When(/^user input all necessary data$/, () => {
  browser.inputYourName();
  browser.checkRemoteTesting();
  browser.checkboxReusingJsCode();
  browser.checkBackgroundParallelTesting();
  browser.checkCIEmbedding();
  browser.checkTrafficMarkupAnalysis();
  browser.checkTriedTestCafe();
  browser.checkRadioWindow();
  browser.inputYourComment();
  browser.clickSubmitButton();
})

Then(/^user will see name is filled$/, () => {
  return browser.assertNameField();
});
