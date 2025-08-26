package com.assignment;

import java.util.Arrays;

public class WordChecker {
    private final DictionaryService dictionaryService;

    public WordChecker(DictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    public boolean isPalindrome(String word) {
        String cleaned = word.toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public boolean areAnagrams(String word1, String word2) {
        char[] arr1 = word1.toLowerCase().toCharArray();
        char[] arr2 = word2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public boolean isEnglishWord(String word) {
        return dictionaryService.isValidEnglishWord(word);
    }
}
