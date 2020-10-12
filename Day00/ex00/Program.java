package ex00;/*
Для шестизначного числа типа int (значение числа задается непосредственно в коде явной
инициализацией переменной number), посчитать сумму цифр этого числа.
*/

class Program {
    public static void main(String[] args) {
        int number = 479598;
        int one = number/100000;//4
        int two = (number/10000)%10;//47 % 10 = 7
        int three = (number/1000)%10;
        int four = (number/100)%10;
        int five = (number/10)%10;
        int six = number%10;
        System.out.println(one + two + three + four + five + six);
    }
}