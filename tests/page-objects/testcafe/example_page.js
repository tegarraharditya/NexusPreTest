/* eslint no-unused-vars: off */

const env = require('dotenv').config();
const { client } = require('nightwatch-cucumber');
const base = require('bizzy-nightwatch-base-page');

const examplePage = {
  url: function setUrl() {
    const url = base.setURL(`${process.env.BASE_URL_EXAMPLE}/testcafe/example/`);
    return url;
  },
  testData: {
    yourName: 'Genta Wibowo',
  },
  elements: {
    textFieldName: '#developer-name',
    checkboxRemoteTesting: '#remote-testing',
    checkboxReusingJsCode: '#reusing-js-code',
    checkboxBackgroundParallelTesting: '#background-parallel-testing',
    checkboxCIEmbedding: '#continuous-integration-embedding',
    checkboxTrafficMarkupAnalysis: '#traffic-markup-analysis',
    checkboxTriedTestCafe: '#tried-test-cafe',
    buttonSubmit: '#submit-button',
    radioButtonWindow: '#windows',
    radioButtonMac: '#macos',
    radioButtonLinux: '#linux',
    listPreferredInterface: '#preferred-interface',
    textComments: '#comments',
  },
  commands: [{
    navigateToExamplePage() {
      return this.navigate();
    },
    inputYourName() {
      base.setValueTextField(client, examplePage.elements.textFieldName, examplePage.testData.yourName);
    },
    checkRemoteTesting() {
      base.selectCheckbox(client, examplePage.elements.checkboxRemoteTesting);
    },
    checkboxReusingJsCode() {
      base.selectCheckbox(client, examplePage.elements.checkboxReusingJsCode);
    },
    checkBackgroundParallelTesting() {
      base.selectCheckbox(client, examplePage.elements.checkboxBackgroundParallelTesting);
    },
    checkCIEmbedding() {
      base.selectCheckbox(client, examplePage.elements.checkboxCIEmbedding);
    },
    checkTrafficMarkupAnalysis() {
      base.selectCheckbox(client, examplePage.elements.checkboxTrafficMarkupAnalysis);
    },
    checkTriedTestCafe() {
      base.selectCheckbox(client, examplePage.elements.checkboxTriedTestCafe);
    },
    clickSubmitButton() {
      base.clickButton(client, examplePage.elements.buttonSubmit);
    },
    checkRadioWindow() {
      base.selectRadioButton(client, examplePage.elements.radioButtonWindow);
    },
    checkRadioMac() {
      base.selectRadioButton(client, examplePage.elements.radioButtonMac);
    },
    checkRadioLinux() {
      base.selectRadioButton(client, examplePage.elements.radioButtonLinux);
    },
    inputYourComment() {
      base.setValueTextArea(client, examplePage.elements.textComments);
    },
    assertNameField() {
      base.assertContainsText(client, examplePage.elements.textFieldName, examplePage.testData.yourName)
    }
  }],
};

module.exports = examplePage;
