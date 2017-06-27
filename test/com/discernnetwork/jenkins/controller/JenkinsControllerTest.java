package com.discernnetwork.jenkins.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:resources/applicationContext.xml" })
public class JenkinsControllerTest {

    @Autowired
    private JenkinsController jenkinsController;

    @Test
    public void testPrintMessage() {
        MockHttpServletRequest mockHttpServletRequest = new MockHttpServletRequest();
        mockHttpServletRequest.addParameter("message", "hello");
        Object message = this.jenkinsController.printGivenMessage(mockHttpServletRequest);
        System.out.println("message is " + message);
    }
}
