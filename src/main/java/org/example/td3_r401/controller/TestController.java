package org.example.td3_r401.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Welcome Home";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String helloName(String name) {
        if (name == null) {
            return "Hello name";
        }
        return "Hello " + name;
    }

    @GetMapping("/hello2")
    public String helloName2(String name, Model model) {
        model.addAttribute("name");
        return "hello";
    }
}
