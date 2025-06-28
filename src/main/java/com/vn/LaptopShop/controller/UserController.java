package com.vn.LaptopShop.controller;

import org.springframework.stereotype.Controller;

import com.vn.LaptopShop.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("")
    public String getHomePage() {
        return "helloWorld.html";
    }
}
