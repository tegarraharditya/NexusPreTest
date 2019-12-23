/* eslint no-unused-vars: off */

const env = require('dotenv').config();
const { client } = require('nightwatch-cucumber');
const base = require('bizzy-nightwatch-base-page');

const thankyouPage = {
  url: function setUrl() {
    const url = base.setURL(`${process.env.BASE_URL_EXAMPLE}/testcafe/example/`);
    return url;
  },
  testData: {
    yourName: 'Genta Wibowo',
  },
  elements: {
    articleHeader: '#article-header',
  },
  commands: [{
    navigateToExamplePage() {
      return this.navigate();
    },
    assertThankYou() {
      return base.assertContainsText(client, thankyouPage.elements.articleHeader, thankyouPage.testData.yourName)
    }
  }],
};

module.exports = thankyouPage;
