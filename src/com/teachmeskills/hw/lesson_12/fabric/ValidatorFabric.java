package com.teachmeskills.hw.lesson_12.fabric;

import com.teachmeskills.hw.lesson_12.validator.InputValidator;
import com.teachmeskills.hw.lesson_12.validator.hex_code.HexCodeValidator;
import com.teachmeskills.hw.lesson_12.validator.url.UrlValidator;

public class ValidatorFabric {

    public static InputValidator getValidator(String input) {
        if (input.startsWith("#") && input.length() == 7) {
            return new HexCodeValidator();
        } else if (input.startsWith("http://") || input.startsWith("https://")) {
            return new UrlValidator();
        } else {
            return null;
        }
    }
}
