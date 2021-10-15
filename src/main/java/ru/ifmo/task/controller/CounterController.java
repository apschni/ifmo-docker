package ru.ifmo.task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {
    private static Long counter = 0L;

    @GetMapping("/")
    public Long getCurrentValueOfCounter(){
        return counter;
    }

    @GetMapping("/stat")
    public Long getCurrentValueOfCounterAndIncrement(){
        return counter++;
    }


}
