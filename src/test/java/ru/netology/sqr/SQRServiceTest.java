package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {

    @Test
    public void testReal () {
        SQRService service = new SQRService();

        int actual = service.calcSQRt(200,300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnreal () {
        SQRService service = new SQRService();

        int actual = service.calcSQRt(300, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
