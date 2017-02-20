package com.yimei.site.steps.register;;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.yimei.site.support.Driver.createFirefoxDriver;
import static com.yimei.site.support.Driver.shutdownDriver;

public class TestPreparation {

    @Before
    public void setUp() {

        createFirefoxDriver();
    }

    @After
    public void tearDown(Scenario scenario) {

        shutdownDriver(scenario);
    }
}
