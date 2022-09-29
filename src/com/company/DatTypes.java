package com.company;

public class DatTypes {
    public static void main(String[] args) {
        //boolean b = Boolean.TRUE;
        /*
              It's a good weather today.
        I'm 30 years old
        The world population is ...
        The 5 times (multiplication) table
        5 apples, 3 peaches and 2 cherries
        The interest on deposit is 5%
        Today is the 5th day of week
        The first letter of my name is A
        The cycle is running 10 times
        The weight of apples is 1.2 kilos
        My name is Alex
        This year has 365 days
        There are 7 rainbow colors
        The BATE won this match:
        The first digit in the number is greater than the second:
        The library consists of 1005 books
        My height is 175 centimeters
         */
        boolean weather = true;
        int age = 30;
        long population = 7_500_000_000L;
        byte number = 5;
        byte apples = 5, peaches = 3;
        float interest = 0.05f;
        byte day = 1;
        char firstLetter = 'A';
        int count = 0;
        double mass = 1.2d;
        String name = "Alex";
        boolean Bate = true;
        /*
1. Записать инструкцию, которая присваивает переменной x значение 1,5.
2. Написать инструкцию, которая присваивает переменной sum нулевое значение.
3. Записать инструкцию, которая увеличивает на единицу значение переменной n.
4. Записать инструкцию, которая уменьшает на два значение переменной counter.
5. Написать инструкцию вычисления среднего арифметического переменных x1 и x2.
6. Записать в виде инструкции присваивания формулу вычисления значения функции у = –2,7x^3 + 0,23x^2 – 1,4.
7. Написать инструкцию, которая увеличивает значение переменной x на величину, находящуюся в переменной dx.
8. Записать в виде инструкции присваивания формулу пересчета веса из фунтов в килограммы (один фунт — 405,9 г).
9. Записать в виде инструкции присваивания формулу пересчета расстояния из километров в версты (одна верста — 1066,8 м).
10. Записать в виде инструкции присваивания формулу вычисления площади прямоугольника.
11. Записать в виде инструкции присваивания формулу вычисления площади треугольника: s= a⋅h/2
12. Записать в виде инструкции присваивания формулу вычисле-
ния площади трапеции: s = (a+b)⋅h/2;
13. Записать в виде инструкции присваивания формулу вычисления площади круга: s=π⋅r^2.
14. Записать в виде инструкции присваивания формулы вычисления площади поверхности и объема цилиндра.
15. Записать в виде инструкции присваивания формулу вычисления объема параллелепипеда.
16. Объявить необходимые переменные и записать в виде инструкции присваивания формулы вычисления объема и площади
поверхности шара.
17. Записать в виде инструкции присваивания формулу вычисления объема цилиндра.
18. Записать в виде инструкции присваивания формулу вычисления объема полого цилиндра.
19. Записать в виде инструкции присваивания формулу вычисления объема конуса.
20. Записать в виде инструкции присваивания формулу пересчета температуры из градусов Фаренгейта в градусы Цельсия: C = 5/9(F-32).
21. Записать в виде инструкции присваивания формулу для вычисления тока по известным значениям напряжения и сопротив-
ления электрической цепи.
22. Записать в виде инструкции присваивания формулу вычисления сопротивления электрической цепи, состоящей из двух параллельно соединенных резисторов
23. Объявить необходимые переменные и записать в виде инструкции присваивания формулу вычисления стоимости покупки,
состоящей из нескольких тетрадей, обложек к ним и карандашей.
*/
        double x=1.5;
        int n=0;
        n++;
        x=1;
        double у = -2.7*x*x*x+ 0.23*x*x-1.4;
        double pounds =1;
        double kilos = pounds*0.4059;








        System.out.printf("boolean: min=%b, max=%b, range=%d%n", Boolean.FALSE, Boolean.TRUE,1);
            System.out.printf("short: min=%d, max=%d, range=%d%n", Short.MIN_VALUE, Short.MAX_VALUE, Short.BYTES);
             System.out.printf("byte: min=%d, max=%d, range=%d%n", Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.BYTES);
             System.out.printf("int: min=%d, max=%d, range=%d%n", Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.BYTES);
             System.out.printf("long: min=%d, max=%d, ranger=%d%n", Long.MAX_VALUE, Long.MIN_VALUE, Long.BYTES);
             System.out.printf("float: min=%f, max=%f, range=%d%n", Float.MIN_VALUE,Float.MAX_VALUE, Float.BYTES);


    }

}
