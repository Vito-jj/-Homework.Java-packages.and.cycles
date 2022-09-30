package ru.netology.sqr.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiseTest {

    @ParameterizedTest
    @CsvFileSource({
            "200,300"
    })

    public void testFirstNumberRange(int x, int y) {

    }
}
