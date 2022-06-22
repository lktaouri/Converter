package com.example.converter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {
    @RequestMapping
    public String home(){
        return "Hi, welcome in the unit converter";
    }

    @RequestMapping("/ounceConverter")
    public double ounceToGram(@RequestParam double b){
        return 0.0;
    }

    @RequestMapping("/stoneConverter")
    public double stoneToKilo(@RequestParam double b){
        return 0.0;

    }
}
