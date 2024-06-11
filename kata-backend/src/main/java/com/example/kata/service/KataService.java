package com.example.kata.service;

import org.springframework.stereotype.Service;

@Service
public class KataService {

    public String transformNumber(int number) {
        StringBuilder result = new StringBuilder();
        String numberStr = String.valueOf(number);

        if (number % 3 == 0) {
            result.append("FOO");
        }
        if (number % 5 == 0) {
            result.append("BAR");
        }

        for (char c : numberStr.toCharArray()) {
            if (c == '3') {
                result.append("FOO");
            } else if (c == '5') {
                result.append("BAR");
            } else if (c == '7') {
                result.append("QUIX");
            }
        }

        return result.length() > 0 ? result.toString() : numberStr;
    }
}
