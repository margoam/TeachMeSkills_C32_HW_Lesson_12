package com.teachmeskills.hw.lesson_12.util;

import com.teachmeskills.hw.lesson_12.fabric.ValidatorFabric;
import com.teachmeskills.hw.lesson_12.validator.InputValidator;

public class StringCheck {

    public static void inputStringAnalyze(String userInput) {

        InputValidator validator = ValidatorFabric.getValidator(userInput);

        if (validator != null && validator.isInputValid(userInput)) {
            System.out.println("The input is correct");
        } else {
            System.out.println("The input is incorrect");
        }
    }
}
