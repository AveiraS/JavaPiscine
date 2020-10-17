package ex00;

import java.util.Scanner;

public class Program {
    static class MyThread extends Thread {
        private String name;
        private Integer count;

        public MyThread(String name, Integer count) {
            this.name = name;
            this.count = count;
        }

        @Override
        public void run() {
            for (int i = 0; i < this.count; i++) {
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.name);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] split = str.split("=");
        int count = Integer.parseInt(split[1]);

        MyThread thread1 = new MyThread("Egg", count);
        MyThread thread2 = new MyThread("Hen", count);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        for (int i = 0; i < count; i++)
            System.out.println("Human");
    }
}
