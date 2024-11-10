package com.teachmeskills.hw.lesson_12.validator.hex_code;

import com.teachmeskills.hw.lesson_12.validator.InputValidator;

public class HexCodeValidator implements InputValidator {

    @Override
    public boolean isInputValid(String input) {

        return input.matches("#[0-9A-Fa-f]{6}");
    }
}
