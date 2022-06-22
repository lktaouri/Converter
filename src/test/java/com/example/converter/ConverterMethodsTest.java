package com.example.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterMethodsTest {
    ConverterMethods testing = new ConverterMethods();
    @Test
    void ounce(){
        double a = testing.ounce(1);
        double b = 28.35;
        assertEquals(a,b);


    }

    @Test
    void stone(){
        double c = testing.stone(1);
        double d = 6.35;
        assertEquals(c,d);


    }

}