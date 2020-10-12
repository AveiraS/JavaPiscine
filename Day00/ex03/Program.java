package ex03;

/*
График изменения успеваемости ученика в течении нескольких недель. Успеваемость - минимальный балл,
полученный за 5 контрольных в тесение каждой недели, за контрольную можно получить оценку от 1 до 9.
Максимально возможное кол-во недель - 18.
*/

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int min = 0;
        long res = 0;
        int step = 1;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String week = scanner.next();
            if (week.equals("42"))
                break;

            int numberOfWeek = scanner.nextInt();
            if (numberOfWeek != step) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }

            int one = scanner.nextInt();
            int two = scanner.nextInt();
            int three = scanner.nextInt();
            int four = scanner.nextInt();
            int five = scanner.nextInt();

            for (int i = 0; i < 10; i++) {
                if (one == i || two == i || three == i || four == i || five == i) {
                    min = i;
                    break;
                }
            }
            res = res * 10 + min;
            step++;
        }
        long revers = 0;
        while (res > 0) {
            revers = revers * 10 + res % 10;
            res /= 10;
        }

        for (int i = 1; i < step; i++) {
            System.out.print("Week " + i + " ");
            long tmp = revers % 10;
            for (int k = 0; k < tmp; k++)
                System.out.print("=");
            System.out.println(">");
            revers /= 10;
        }
    }
}
