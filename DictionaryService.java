package com.assignment;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class DictionaryService {
    private static final String API_URL = "https://api.dictionaryapi.dev/api/v2/entries/en/";

    public boolean isValidEnglishWord(String word) {
        try {
            URL url = new URL(API_URL + word.toLowerCase());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();
            return responseCode == 200;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
