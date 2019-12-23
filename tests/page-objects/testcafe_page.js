/* eslint no-unused-vars: off */

const env = require('dotenv').config();
const { client } = require('nightwatch-cucumber');
const base = require('bizzy-nightwatch-base-page');

const page = {
  url: function setUrl() {
    const url = base.setURL(`${process.env.BASE_URL}/testcafe/example/`);
    return url;
  },
  testData: {
    assertTitle: 'This webpage is used as a sample in TestCafe tutorials.',
    populate: 'Populate',
    result: 'https://devexpress.github.io/testcafe/example/thank-you.html',
  },
  elements: {
    header: '.main-content',
    textFieldName: '#developer-name',
    textComment: '.comments',
    btnPopulate: '#populate',
    checkboxRemote: '#remote-testing',
    checkboxReusing: '#re-using',
    checkboxBackgroundPararel: '#background-parallel-testing',
    checkboxCI: '#continuous-integration-embedding',
    checkboxTraffic: '#traffic-markup-analysis',
    checkboxTry: '.tried-test-cafe',
    btnSubmit: '#submit-button',
    radioWindow: '#windows',
    radioMac: '#macos',
    radioLinux: '#linux',
    listInterface: '#preferred-interface',
    assetResult: '#result-content',

  },
  commands: [{
    navigateToPage() {
      base.maxWindow(client);
      return this.navigate();
    },
    clickActions(btnName) {
      // base.pauseSleep(client, 500);
      switch (btnName) {
        case 'Populate':
          base.clickButtonOptional(this, client, page.elements.btnPopulate);
          break;
        case 'Submit':
          base.clickButtonOptional(this, client, page.elements.btnSubmit);
          break;
        default:
      }
    },

    selectRadio(radioName) {
      // base.pauseSleep(client, 500);
      switch (radioName) {
        case 'Window':
          base.selectRadioButton(this, page.elements.radioWindow);
          break;
        case 'Mac':
          base.selectRadioButton(this, page.elements.radioMac);
          break;
        case 'Linux':
          base.selectRadioButton(this, page.elements.radioLinux);
          break;
        default:
      }
    },

    selectCheck(checkName) {
      // base.pauseSleep(client, 500);
      switch (checkName) {
        case 'Remote':
          base.selectCheckbox(this, page.elements.checkboxRemote);
          break;
        case 'Reusing':
          base.selectRadioButton(this, page.elements.checkboxReusing);
          break;
        case 'Background':
          base.selectRadioButton(this, page.elements.checkboxBackgroundPararel);
          break;
        case 'CI':
          base.selectRadioButton(this, page.elements.checkboxCI);
          break;
        case 'Traffic':
          base.selectRadioButton(this, page.elements.checkboxTraffic);
          break;
        default:
      }
    },

    selectList(listName) {
      // base.pauseSleep(client, 500);
      switch (listName) {
        case 'Both':
          base.chooseOptionClass(this, page.elements.listInterface, 'Both');
          break;
        case 'Command Line':
          base.chooseOptionClass(this, page.elements.listInterface, 'Command Line');
          break;
        default:
      }
    },

    input(keyActivity) {
      return base.setValueTextField(this, page.elements.textFieldName, keyActivity);
    },

    verifyResult() {
      return base.assertURLContains(this, page.testData.result);
    },

  }],
};

module.exports = page;
