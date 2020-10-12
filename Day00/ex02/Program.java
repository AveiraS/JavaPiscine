package ex02;

/*
Необходимо реализовать программу, которая для заданного набора чисел
посчитает количество элементов, у которых сумма цифр - простое число.
*/

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        long number = 0;
        int step = 0;

        while (number >= 0) {
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();

            if (number == 42)
                break;
            step += primeCheck(number);
        }
        System.out.println("Count of coffee-request - " + step);
    }

    static int primeCheck(long number) {
        int sum = 0;

        while (number / 10 != 0) {
            sum += number % 10;
            number = number / 10;
        }
        sum += number;
        for (int i = 1; (i * i) <= sum; i++) {
            if (sum % i == 0 && i != 1 || sum == 2) {
                return(0);
            }
        }
        return(1);
    }
}
