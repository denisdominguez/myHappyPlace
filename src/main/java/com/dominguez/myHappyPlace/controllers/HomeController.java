package com.dominguez.myHappyPlace.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    record User (String name) {}

    List<User> users = List.of(new User("Denis"), new User( "Jorge"), new User("Daniela"));

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("usuario", "Jorge");
        model.addAttribute("users", users);
        return "index";
    }
}
