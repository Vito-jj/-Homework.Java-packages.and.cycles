package ru.netology.sqr.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiseTest {

    @Test
    public void testFirstNumberRange() {
        SQRService service = new SQRService();

        int expected = 15;
        int actual = service.calcSQRt(200, 300);

        Assertions.assertEquals(expected, actual);
    }
}
