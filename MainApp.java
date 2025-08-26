package com.assignment;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DictionaryService dictionaryService = new DictionaryService();
        WordChecker checker = new WordChecker(dictionaryService);

        System.out.println("Enter one or two words separated by space:");
        String input = scanner.nextLine();
        String[] words = input.split("\s+");

        if (words.length == 1) {
            String word = words[0];
            System.out.println("Is English Word: " + checker.isEnglishWord(word));
            System.out.println("Is Palindrome: " + checker.isPalindrome(word));
        } else if (words.length == 2) {
            String word1 = words[0];
            String word2 = words[1];
            System.out.println("Word1 is English: " + checker.isEnglishWord(word1));
            System.out.println("Word2 is English: " + checker.isEnglishWord(word2));
            System.out.println("Are Anagrams: " + checker.areAnagrams(word1, word2));
        } else {
            System.out.println("Please enter one or two words only.");
        }

        scanner.close();
    }
}
