Feature: test orangeHRM smoke test

Scenario:  test login with valid crendentials

Given open firefox and start application
When i enter the valid uname and pwd
Then user should be able to login successfully