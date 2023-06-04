package com.kata.kataforfun.services;

import org.springframework.stereotype.Component;

@Component
public class KataForFunService {

    public String convertNumber(int number) {
        if ( number == 3 ) return "KataKata";
        return String.valueOf(number);
    }

}