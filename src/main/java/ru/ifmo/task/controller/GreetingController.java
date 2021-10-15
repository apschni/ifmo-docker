package ru.ifmo.task.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;

@Controller
public class GreetingController {
    @GetMapping("/about")
    public String greeting(Model model) {
        Map<String, String> env = System.getenv();
        model.addAttribute("name", env.get("NAME"));
        try {
            model.addAttribute("hostname", InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "greeting";
    }
}
