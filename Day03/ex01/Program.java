package ex01;

import java.util.Scanner;

public class Program {

    static class SomePrint {
        private int count = 0;
        public synchronized void printHen() {
        while (count < 1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        count--;
        System.out.println("Hen");
        notify();
    }

    public synchronized void printEgg(){
        while (count > 0) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        count++;
        System.out.println("Egg");
        notify();
    }
}

    static class Hen implements Runnable {
    private Integer count;
    SomePrint sm;

    public Hen(SomePrint sm, Integer count){
        this.sm = sm;
        this.count = count;

    }
    @Override
    public void run(){
        for (int i = 1; i < count; i++)
            sm.printHen();
    }
}

    static class Egg implements Runnable {
        private Integer count;
        SomePrint sm;

        public Egg(SomePrint sm, Integer count){
            this.sm = sm;
            this.count = count;
        }

        @Override
        public void run(){
            for (int i = 1; i < count; i++)
                sm.printEgg();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] split = str.split("=");
        int count = Integer.parseInt(split[1]);

        SomePrint sm = new SomePrint();

        Thread odd = new Thread(new Hen(sm, count));
        Thread even = new Thread(new Egg(sm, count));

        odd.start();
        even.start();
    }
}