$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/clfeatures/clead.feature");
formatter.feature({
  "name": "Leaftaps Automation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login to Leaftaps",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Enter Username as \u003cusername\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter Password as \u003cpwd\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Login click",
  "keyword": "When "
});
formatter.step({
  "name": "crmsfa is click",
  "keyword": "And "
});
formatter.step({
  "name": "Leads is click",
  "keyword": "And "
});
formatter.step({
  "name": "CreateLeads is click",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the company name as \u003ccName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the First name as \u003cfName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the Last name as \u003clName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "Create new lead",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "pwd",
        "cName",
        "fName",
        "lName"
      ]
    },
    {
      "cells": [
        "DemoSalesManager",
        "crmsfa",
        "CTS",
        "Indu",
        "G"
      ]
    },
    {
      "cells": [
        "DemoCSR",
        "crmsfa",
        "TCS",
        "Hema",
        "G"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login to Leaftaps",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Username as DemoSalesManager",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.typeUsername(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.typePassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Login click",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.clickLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "crmsfa is click",
  "keyword": "And "
});
formatter.match({
  "location": "HomePage.clickCrmsfa()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Leads is click",
  "keyword": "And "
});
formatter.match({
  "location": "MyHomePage.clickLead()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "CreateLeads is click",
  "keyword": "And "
});
formatter.match({
  "location": "MyLeadPage.clickCreateLead()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the company name as CTS",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLeadPage.typeCname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the First name as Indu",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLeadPage.typeFname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the Last name as G",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLeadPage.typeLname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Create new lead",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLeadPage.clickSubmit()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Login to Leaftaps",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Username as DemoCSR",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.typeUsername(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter Password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.typePassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Login click",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.clickLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "crmsfa is click",
  "keyword": "And "
});
formatter.match({
  "location": "HomePage.clickCrmsfa()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Leads is click",
  "keyword": "And "
});
formatter.match({
  "location": "MyHomePage.clickLead()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "CreateLeads is click",
  "keyword": "And "
});
formatter.match({
  "location": "MyLeadPage.clickCreateLead()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the company name as TCS",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLeadPage.typeCname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the First name as Hema",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLeadPage.typeFname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the Last name as G",
  "keyword": "And "
});
formatter.match({
  "location": "CreateLeadPage.typeLname(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Create new lead",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLeadPage.clickSubmit()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});