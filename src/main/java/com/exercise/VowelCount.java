package com.exercise;

import java.util.*;

public class VowelCount {
    public static void main(String[] args) {
        if (args.length >= 4) {
            System.out.println("Extra arguments passed.");
        } else {
            Map<String, Integer> vowelCount = new HashMap<>();
            List<String> argumentList = Arrays.asList(args);
            argumentList.forEach(argument -> vowelCount.put(argument, getVowelCount(argument)));
            System.out.println(vowelCount);
        }
    }

    private static Integer getVowelCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[aeiou]")).count();
    }
    private static Integer getConsonantsCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[aeiou]")).count();
    }

}
