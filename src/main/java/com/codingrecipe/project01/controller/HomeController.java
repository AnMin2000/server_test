package com.codingrecipe.project01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    @GetMapping(value="/android")
    @ResponseBody
    public String androidResponse(
            @RequestParam("id") String id,
            @RequestParam("password") String password
    ) {
        System.out.println("Connection from Android");
        System.out.println("id: " + id + ", pw: " + password);

        return "1";
    }
}
