package com.kata.kataforfun.services;

import org.springframework.stereotype.Component;

@Component
public class KataForFunService {

    public String convertNumber(int number) {
        if ( number == 3 ) return "KataKata";
        if ( number == 5 ) return "ForFor";
        if ( number == 7 ) return "Fun";
        if ( number == 9 ) return "Kata";
        return String.valueOf(number);
    }

}