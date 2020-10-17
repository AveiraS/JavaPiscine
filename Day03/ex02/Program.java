package ex02;

import java.util.Scanner;

public class Program {

    private static int mathArray(Integer[] array, int first, int end) {
        int count = 0;
        while(first <= end) {
            count += array[first];
            first++;
        }
        return (count);
    }

    private static Integer[] generateArray(int size) {

        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 9);
            System.out.println(array[i]);
        }
        return (array);
    }

    static class Count implements Runnable {
        private Integer numberOfThread;
        private Integer first;
        private Integer end;
        private Integer[] array;

        public Count(Integer numberOfThread, Integer first, Integer end, Integer[] array){
            this.first = first;
            this.end = end;
            this.array = array;
            this.numberOfThread = numberOfThread;
        }

        @Override
        public void run(){
            System.out.println("Thread " + numberOfThread + " from " + first + " to " + end + " sum is " +  mathArray(array, first, end));
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] str = (scanner.next()).split("=");
        int countArray = Integer.parseInt(str[1]);

        String[] str2 = (scanner.next()).split("=");
        int countThread = Integer.parseInt(str2[1]);

        if (countArray > 2000000 || countThread > countArray) {
            System.out.println("ERROR");
            System.exit(1);
        }

        Integer array[] = generateArray(countArray);

        int end = 0;
        int start = 0;
        int tmp = countArray/countThread;

        if (tmp > 1000) {
            System.out.println("ERROR");
            System.exit(1);
        }

        for (int i = 1; i <= countThread; i++) {
            if (i == countThread)
                end += countArray - start - 1;
            else
                end += (tmp);
            Thread thread = new Thread(new Count(i,start,end, array));
            thread.start();
            start += (tmp + 1);
            end += 1;
        }
    }
}
