public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");//Выведите в консоль все числа от 1 до 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("   ");
        System.out.println("Задача 2");//Выведите в консоль все числа от 10 до 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("   ");
        System.out.println("Задача 3"); //Выведите в консоль все четные числа от 0 до 17
        for (int i = 0; i < 18; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("   ");
        System.out.println("Задача 4"); //Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("   ");
        System.out.println("Задача 5");//Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }

        System.out.println("   ");
        System.out.println("Задача 6");//Напишите программу, которая выводит в консоль заданную последовательность чисел
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("   ");
        System.out.println("Задача 7");//Напишите программу, которая выводит в консоль заданную последовательность чисел
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("   ");
        System.out.println("Задача 8");//Выведите в консоль сумму накоплений за каждый месяц
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("   ");
        System.out.println("Задача 9");//Выведите в консоль сумму накоплений с процентами за каждый месяц
        salary = 29000;
        total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("   ");
        System.out.println("Задача 10");//Напишите программу, которая выводит в консоль таблицу умножения на 2
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 + " * " + i + " = " + (i * 2));
        }


    }
}