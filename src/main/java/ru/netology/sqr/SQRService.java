package ru.netology.sqr;

public class SQRService {

    public int calcSQRt(int x, int y) {
        int rezult = 0;
        for (int i = 10; i < 100; i++) {
            if ((i * i >= x) & (i * i <= y)) {
                rezult = i;
                return rezult;
            }
        }
        return rezult;
    }
}
