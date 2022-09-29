package ru.netology.sqr;

public class SQRService {

    public int calcSQRt(int x, int y) {
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= x) & (i * i <= y)) {
                return i;
            }
        }
        return -1;
    }
}
