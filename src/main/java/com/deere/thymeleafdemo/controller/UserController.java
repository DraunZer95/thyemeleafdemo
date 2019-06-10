package com.deere.thymeleafdemo.controller;

import com.deere.thymeleafdemo.Model.User;
import com.deere.thymeleafdemo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "")
    public String firstPage(Model model) {
        model.addAttribute("user", new User());
        return "welcome";
    }

    @PostMapping(value = "/adduser")
    public String secondScreen(@ModelAttribute User user, Model model) {
        userService.createUser(user);
        model.addAttribute("users", userService.getAllUser());
        return "userlist";
    }

}