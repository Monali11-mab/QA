package com.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class WordCheckerTest {

    @Test
    public void testPalindrome() {
        DictionaryService service = mock(DictionaryService.class);
        WordChecker checker = new WordChecker(service);

        assertTrue(checker.isPalindrome("madam"));
        assertFalse(checker.isPalindrome("hello"));
    }

    @Test
    public void testAnagrams() {
        DictionaryService service = mock(DictionaryService.class);
        WordChecker checker = new WordChecker(service);

        assertTrue(checker.areAnagrams("listen", "silent"));
        assertFalse(checker.areAnagrams("hello", "world"));
    }

    @Test
    public void testIsEnglishWord() {
        DictionaryService service = mock(DictionaryService.class);
        when(service.isValidEnglishWord("apple")).thenReturn(true);

        WordChecker checker = new WordChecker(service);
        assertTrue(checker.isEnglishWord("apple"));
    }
}
