package com.kata.kataforfun.services;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

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
        if (inputString.contains("3") || inputString.contains("5") || inputString.contains("7")) {
               inputString.chars().mapToObj(c -> (char) c).
                map(KataForFunService::mapValueToContainedCharacter).forEach(sb::append);
        }
        if (sb.length() == 0) {
            return inputString;
        } else {
            return sb.toString();
        }
    }

    private static String mapValueToContainedCharacter(Character c){
        Map<Character, String> correspondingMatch = new HashMap<>();
        correspondingMatch.put('3', "Kata");
        correspondingMatch.put('5', "For");
        correspondingMatch.put('7', "Fun");

        return correspondingMatch.get(c);
        
    }

}