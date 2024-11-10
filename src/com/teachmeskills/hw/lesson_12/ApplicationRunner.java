package com.teachmeskills.hw.lesson_12;

import com.teachmeskills.hw.lesson_12.util.StringCheck;

import java.util.Scanner;

/**
 * Задача 1
 * Написать программу, что переданная строка это hex code для описание цвета.
 * Например, при вводе в программу значения #8b2323, программа должна вернуть - Yes.
 * <p>
 * Задача 2
 * Написать программу, которая будет проверять, что введенная ссылка валидная.
 * Например, при анализе вот такой ссылки https://teachmeskills.by/kursy/programmirovaniya-online - программа должна вернуть, что ссылка валидна.
 * а при вводе tcp://teachmeskills.by/kursy/programmirovaniya-online - программа должна вернуть, что ссылка не валидна (ссылка начинается ни с http, ни с https)
 */
public class ApplicationRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter and URL or Hex code to check");
        String userInput = scanner.nextLine();

        StringCheck.inputStringAnalyze(userInput);
    }
}

