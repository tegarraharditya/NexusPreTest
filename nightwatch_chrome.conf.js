/* eslint no-unused-vars: off */
/* eslint import/no-unresolved: off */

const seleniumServer = require('selenium-server'); // selenium server package
const chromedriver = require('chromedriver'); // selenium chrome driver
const env = require('dotenv').config();

require('nightwatch-cucumber')({
  nightwatchOutput: true,
  cucumberArgs: [
    // '--require', 'tests/helper/hooks.js',
    '--require', 'tests/step_definitions', // include step_definitions folder
    '--format', 'json:reports/chrome/cucumber_chrome.json', // include cucumber.json file
    '--format', 'node_modules/cucumber-pretty', // print nice looking cucumber in console
    '--format-options', '{"colorsEnabled":true}', // print colour scenario title
    'tests/features'],
});

module.exports = {
  test_workers: {// for paralel test
    enabled: true,
    workers: 1,
  },
  page_objects_path: 'tests/page-objects', // page object options
  output_folder: 'reports', // output reports
  custom_assertions_path: '',
  globals_path: '', // Execute Js Before and After All Test Run
  live_output: true, // live console output
  disable_colors: false, // scenarios colors
  selenium: { // selenium settings
    start_process: true,

    server_path: seleniumServer.path,
    log_path: 'logs',
    host: '127.0.0.1',
    port: 4444,
  },
  test_settings: {
    default: { // chrome settings
      selenium_port: 4444,
      selenium_host: '127.0.0.1',
      screenshots: {
        enabled: true,
        on_failure: true,
        path: 'screenshots',
      },
      desiredCapabilities: {
        browserName: 'chrome',
        acceptInsecureCerts: true,
        acceptSslCerts: true,
        javascriptEnabled: true,
        // chromeOptions: {
        //   args: [
        //     'headless', // for running chrome headless
        //     'window-size=1280,800',
        //   ],
        // },
      },
      selenium: {
        cli_args: {
          'webdriver.chrome.driver': chromedriver.path,
        },
      },
    },
  },
};
