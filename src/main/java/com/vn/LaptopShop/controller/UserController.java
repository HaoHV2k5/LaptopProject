package com.vn.LaptopShop.controller;



import com.vn.LaptopShop.service.UserService;

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
