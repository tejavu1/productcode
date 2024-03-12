$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featurefiles/hooks.feature");
formatter.feature({
  "name": "TO validate the login functionality of facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To validate the login functionality with invalid",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "The user must fill the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The user must click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "The user must navigate to the invalid login page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Teja1",
        "osbdfjhf"
      ]
    },
    {
      "cells": [
        "Teja2",
        "656465465"
      ]
    },
    {
      "cells": [
        "Teja3",
        "jdgfudgsj445462"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user must be in the facebook home page",
  "keyword": "Given "
});
formatter.match({
  "location": "codefile.the_user_must_be_in_the_facebook_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login functionality with invalid",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "The user must fill the \"Teja1\" and \"osbdfjhf\"",
  "keyword": "When "
});
formatter.match({
  "location": "codefile.the_user_must_fill_the_and(String,String)"
});
formatter.result({
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat codefilepack.codefile.the_user_must_fill_the_and(codefile.java:41)\r\n\tat ✽.The user must fill the \"Teja1\" and \"osbdfjhf\"(file:src/test/resources/featurefiles/hooks.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "The user must click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "codefile.the_user_must_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user must navigate to the invalid login page",
  "keyword": "Then "
});
formatter.match({
  "location": "codefile.the_user_must_navigate_to_the_invalid_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user must be in the facebook home page",
  "keyword": "Given "
});
formatter.match({
  "location": "codefile.the_user_must_be_in_the_facebook_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login functionality with invalid",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "The user must fill the \"Teja2\" and \"656465465\"",
  "keyword": "When "
});
formatter.match({
  "location": "codefile.the_user_must_fill_the_and(String,String)"
});
formatter.result({
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat codefilepack.codefile.the_user_must_fill_the_and(codefile.java:41)\r\n\tat ✽.The user must fill the \"Teja2\" and \"656465465\"(file:src/test/resources/featurefiles/hooks.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "The user must click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "codefile.the_user_must_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user must navigate to the invalid login page",
  "keyword": "Then "
});
formatter.match({
  "location": "codefile.the_user_must_navigate_to_the_invalid_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user must be in the facebook home page",
  "keyword": "Given "
});
formatter.match({
  "location": "codefile.the_user_must_be_in_the_facebook_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login functionality with invalid",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "The user must fill the \"Teja3\" and \"jdgfudgsj445462\"",
  "keyword": "When "
});
formatter.match({
  "location": "codefile.the_user_must_fill_the_and(String,String)"
});
formatter.result({
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat codefilepack.codefile.the_user_must_fill_the_and(codefile.java:41)\r\n\tat ✽.The user must fill the \"Teja3\" and \"jdgfudgsj445462\"(file:src/test/resources/featurefiles/hooks.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "The user must click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "codefile.the_user_must_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user must navigate to the invalid login page",
  "keyword": "Then "
});
formatter.match({
  "location": "codefile.the_user_must_navigate_to_the_invalid_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/featurefiles/hooks2.feature");
formatter.feature({
  "name": "TO validate the login functionality of facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To validate the login functionality with invalid",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "The user must fill the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "The user must click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "The user must navigate to the invalid login page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Madhu1",
        "osbdfjhf"
      ]
    },
    {
      "cells": [
        "Madhu2",
        "656465465"
      ]
    },
    {
      "cells": [
        "Madhu3",
        "jdgfudgsj445462"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user must be in the facebook home page",
  "keyword": "Given "
});
formatter.match({
  "location": "codefile.the_user_must_be_in_the_facebook_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login functionality with invalid",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "The user must fill the \"Madhu1\" and \"osbdfjhf\"",
  "keyword": "When "
});
formatter.match({
  "location": "codefile.the_user_must_fill_the_and(String,String)"
});
formatter.result({
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat codefilepack.codefile.the_user_must_fill_the_and(codefile.java:41)\r\n\tat ✽.The user must fill the \"Madhu1\" and \"osbdfjhf\"(file:src/test/resources/featurefiles/hooks2.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "The user must click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "codefile.the_user_must_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user must navigate to the invalid login page",
  "keyword": "Then "
});
formatter.match({
  "location": "codefile.the_user_must_navigate_to_the_invalid_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user must be in the facebook home page",
  "keyword": "Given "
});
formatter.match({
  "location": "codefile.the_user_must_be_in_the_facebook_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login functionality with invalid",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "The user must fill the \"Madhu2\" and \"656465465\"",
  "keyword": "When "
});
formatter.match({
  "location": "codefile.the_user_must_fill_the_and(String,String)"
});
formatter.result({
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat codefilepack.codefile.the_user_must_fill_the_and(codefile.java:41)\r\n\tat ✽.The user must fill the \"Madhu2\" and \"656465465\"(file:src/test/resources/featurefiles/hooks2.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "The user must click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "codefile.the_user_must_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user must navigate to the invalid login page",
  "keyword": "Then "
});
formatter.match({
  "location": "codefile.the_user_must_navigate_to_the_invalid_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user must be in the facebook home page",
  "keyword": "Given "
});
formatter.match({
  "location": "codefile.the_user_must_be_in_the_facebook_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login functionality with invalid",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "The user must fill the \"Madhu3\" and \"jdgfudgsj445462\"",
  "keyword": "When "
});
formatter.match({
  "location": "codefile.the_user_must_fill_the_and(String,String)"
});
formatter.result({
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat codefilepack.codefile.the_user_must_fill_the_and(codefile.java:41)\r\n\tat ✽.The user must fill the \"Madhu3\" and \"jdgfudgsj445462\"(file:src/test/resources/featurefiles/hooks2.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "The user must click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "codefile.the_user_must_click_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user must navigate to the invalid login page",
  "keyword": "Then "
});
formatter.match({
  "location": "codefile.the_user_must_navigate_to_the_invalid_login_page()"
});
formatter.result({
  "status": "skipped"
});
});