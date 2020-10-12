package ex01;

/*
Необходимо определить, является ли входное число простым. Также программа должна выводить
количество шагов (итераций), за которое ей удалось выполнить эту проверку.
Простым называется число, которое не имеет делителей, отличных от самого числа и единицы.
*/

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int step = 0;
        boolean flag = true;

        if (number <= 0) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        for (int i = 1; (i * i) <= number; i++) {
            if (number % i == 0 && i != 1) {
                flag = false;
                break;
            }
            if (number == 2)
                flag = false;
            step++;
        }
        System.out.println(flag + " " + step);
    }
}
