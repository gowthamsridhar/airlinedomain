$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/airline.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "List of flights",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "In homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.in_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the from and to place",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.enter_the_from_and_to_place()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user see the flights",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_user_see_the_flights()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});