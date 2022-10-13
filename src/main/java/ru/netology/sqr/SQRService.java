package ru.netology.sqr;

public class SQRService {

    public int calcSQRt(int x, int y) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= x) {
                if (i * i <= y) {
                    count++;
                }
            }
        }
        return count;
    }
}
