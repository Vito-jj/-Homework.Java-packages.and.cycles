package ru.netology.sqr;

public class SQRService {

    public int calcSQRt(int x, int y) {
        int i;
        for (i = 10; i <= 99; i++) {
            if ((i * i >= x) & (i * i <= y)) {
                return i;
            }
        }
        return i;
    }
}
