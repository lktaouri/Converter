package com.example.converter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {
    ConverterMethods converter = new ConverterMethods();
    @RequestMapping
    public String home(){
        return "Hi, welcome to the unit converter";
    }

    @RequestMapping("/ounce")
    public double ounceToGram(@RequestParam double a){
        return converter.ounce(a);
    }

    @RequestMapping("/stone")
    public double stoneToKilo(@RequestParam double b){
        return converter.stone(b);

    }
}
