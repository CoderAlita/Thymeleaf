package com.example.demo.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("Name","Life Republic Apartments");

        model.addAttribute("message", "Welcome to our wonder society");
        model.addAttribute("items", Arrays.asList("1 BHK", "2 BHK", "3 BHK"));
        return "home";
    }

    @GetMapping("/iter")
    public String iterations(Model model){

        ArrayList<String> list =new ArrayList<>();
        list.add("Mahesh");
        list.add("Kavita");
        list.add("Jugnu");
        model.addAttribute("list",list);

        return "iter";
    }
}
