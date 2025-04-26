package ru.technicalExcellence.codingDojo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorShould {

    private StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void return_empty_when_null_is_given(){
        assertEquals(0, stringCalculator.add(null));
    }

    @Test
    void return_empty_when_empty_is_given(){
        assertEquals(0, stringCalculator.add("0"));
    }

    @Test
    void return_1_when_1_is_given(){
        assertEquals(0, stringCalculator.add("0"));
    }
}
