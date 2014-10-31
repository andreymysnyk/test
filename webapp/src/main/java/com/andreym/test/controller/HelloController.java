package com.andreym.test.controller;

import com.andreym.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by amisnik on 31.10.2014.
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private TestService testService;


    @RequestMapping(method = RequestMethod.GET)
    public String handleHello(ModelMap modelMap) {
        modelMap.addAttribute("message", testService.service());
        return "hello";
    }
}
