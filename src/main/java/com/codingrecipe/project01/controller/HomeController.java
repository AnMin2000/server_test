package com.codingrecipe.project01.controller;

import com.codingrecipe.project01.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    @ResponseBody
    @GetMapping("/")
    public String index(){
        return "1234";
    }
    @ResponseBody
    @PostMapping(value="/android")
    public String androidResponse(@RequestBody User user) {

        System.out.println("Connection from Android");
        System.out.println("id: " + user.getId() + ", pw: " + user.getPassword());

        return "12";
    }

}