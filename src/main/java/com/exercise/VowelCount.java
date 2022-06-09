package com.exercise;

import java.util.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class VowelCount {
    public static void main(String[] args) {
        if (args.length >= 4) {
            System.out.println("Extra arguments passed.");
        } else {
            Map<String, Integer[]> counts = new HashMap<>();
            List<String> argumentList = Arrays.asList(args);
            argumentList.forEach(argument -> {
                Integer[]  anArray = new Integer[2];
                anArray[0] = getVowelCount(argument);
                anArray[1] = getConsonantCount(argument);

                //TODO here we need to escpae char in argument to proper save it in json like " -> \" , or other special char
                counts.put(argument, anArray);
            });



            ObjectMapper objectMapper = new ObjectMapper();
            try {
                System.out.println(objectMapper.writeValueAsString(counts));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }



/*  here is implemenation json by heand but for sure we should use something from jars
            System.out.println("[");
            for ( Map.Entry<String, Integer[]> entry : counts.entrySet()) {
                System.out.println("{ \"name\": \"" + entry.getKey() + "\", \"values\" : { \"vowel\" : " + entry.getValue()[0] + " , \"consonant\": "  + entry.getValue()[1] + "}}," );
            }
            System.out.println("]");
*/
        }
    }

    private static Integer getVowelCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[aeiou]")).count();
    }
    private static Integer getConsonantCount(String input) {
        String[] inputChars = input.split(""); //TODO FIX IT now it count also char like '&^%$#@'
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[^aeiou]")).count();
    }

}
