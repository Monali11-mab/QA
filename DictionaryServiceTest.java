package com.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DictionaryServiceTest {
    @Test
    public void testIsValidEnglishWord() {
        DictionaryService service = new DictionaryService();
        assertTrue(service.isValidEnglishWord("apple"));
        assertFalse(service.isValidEnglishWord("qwertyyz")); // likely not a word
    }
}
