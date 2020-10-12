package ex04;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String str1 = "";
        int[] num = new int[100];
        boolean flag = false;

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        char[] array = str.toCharArray();

        for(int i = 0; i < array.length; i++) {
            char[] str2 = str1.toCharArray();
            flag = false;
            for (int j = 0; j < str2.length; j++)
                if (array[i] == str2[j]) {
                    flag = true;
                    int step = num[j];
                    num[j] = step + 1;
                }
            if (flag == false && array[i] >= '9') {
                char tmp = array[i];
                str1 = str1 + tmp;
                int first = str2.length;
                num[first] = 1;
            }
        }
        System.out.println(str1);
        System.out.println(num[0]);
        System.out.println(num[1]);
    }
}
