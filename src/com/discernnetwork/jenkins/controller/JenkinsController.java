/**
 * Project Name: jenkins_main_project
 * Package Name: com.treselle.jenkins.controller
 * Class Name: JenkinsController.java
 * Description:
 * 
 * 
 * Created Date:Jun 27, 2017
 * Modified Date:Jun 27, 2017
 * 
 * Copyright to DISCERN
 */
package com.discernnetwork.jenkins.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.discernnetwork.jenkins_stringutil.util.StringUtil;

@RestController
public class JenkinsController {

    @RequestMapping(value = "/print_message", method = { RequestMethod.GET, RequestMethod.POST }, headers = "Accept=application/json")
    public Object printGivenMessage(HttpServletRequest request) {
        String message = request.getParameter("message");

        if (StringUtil.isValidString(message)) {
            message = "message is valid one";
        } else {
            message = "message is not valid one";
        }

        Map<String, String> map = new HashMap<String, String>();
        map.put("data", "info");
        findBugsCheck(map);
        return message;
    }

    public void findBugsCheck(Map<String, String> map) {
        String data = map.get("data");
        data = data.toUpperCase();
        String startsWith = "info";
        if (startsWith.startsWith("i")) {
            System.out.println("It starts with i");
        }
    }
}
