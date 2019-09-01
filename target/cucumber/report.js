$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('cucumberJava/cucumberJava.feature');
formatter.feature({
  "line": 1,
  "name": "CucumberJava",
  "description": "",
  "id": "cucumberjava",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login functionality exists",
  "description": "",
  "id": "cucumberjava;login-functionality-exists",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "test",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberJava.test()"
});
formatter.result({
  "duration": 99786389,
  "error_message": "java.lang.NullPointerException\n\tat cucumberJava.CucumberJava.test(CucumberJava.java:13)\n\tat ✽.Given test(cucumberJava/cucumberJava.feature:5)\n",
  "status": "failed"
});
});