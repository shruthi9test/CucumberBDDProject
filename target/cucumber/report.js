$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature/saucedemo.feature");
formatter.feature({
  "line": 1,
  "name": "SauceDemo Login Testcases",
  "description": "",
  "id": "saucedemo-login-testcases",
  "keyword": "Feature"
});
formatter.before({
  "duration": 346400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Open Home Page",
  "description": "",
  "id": "saucedemo-login-testcases;open-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open browser and navigate to Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "SaucedemoImpl.open_browser_and_navigate_to_Homepage()"
});
formatter.result({
  "duration": 6382183600,
  "status": "passed"
});
formatter.after({
  "duration": 94700,
  "status": "passed"
});
});