package com.kata.kataforfun.services;

import org.springframework.stereotype.Component;

@Component
public class KataForFunService {

    public String convertNumber(int number) {
        return returnResultBasedOnRule(number);
    }

    private String returnResultBasedOnRule(int number ){
        StringBuilder sb = new StringBuilder();
        String inputString = String.valueOf(number);
        if (number % 3 == 0) {
            sb.append("Kata");
        }
        if (number % 5 == 0) {
            sb.append("For");
        }
        if (inputString.contains("3")) {
            sb.append("Kata");
        }
        if (inputString.contains("5")) {
            sb.append("For");
        }
        if (inputString.contains("7")) {
            sb.append("Fun");
        }
        if (sb.length() == 0) {
            return inputString;
        } else {
            return sb.toString();
        }
    }

}