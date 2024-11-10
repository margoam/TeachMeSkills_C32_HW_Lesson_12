package com.teachmeskills.hw.lesson_12.validator.url;

import com.teachmeskills.hw.lesson_12.validator.InputValidator;

public class UrlValidator implements InputValidator {

    @Override
    public boolean isInputValid(String input) {

        return input.matches("https?://.+");
    }
}
