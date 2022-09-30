import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService(); // Не работающий вариант решения через SQRService.java
        System.out.println(service.calcSQRt(200, 300));
        System.out.println();

        int i; // Работающий вариант решения
        int x = 200;
        int y = 300;
        for (i = 10; i <= 99; i++) {
            if ((i * i >= x) & (i * i <= y)) {
                System.out.println(i);
            }
        }


    }

}
