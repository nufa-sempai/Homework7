public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();
    }
    public static void task1 () {
//Задание 1
        System.out.println("Task 1");
        int goal = 2_459_000;
        int total = 0;
        int monthlyIncome = 15_000;
        int month = 1;
        while (total < goal) {
            total = total + monthlyIncome;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }
    }
//Задание 2
    public static void task2 () {
        System.out.println("\nЗадание 2");
        int number = 1;
        int bound = 10;
        while (number <= bound) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (number = 10; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
//Задание 3
    public static void task3() {
        System.out.println("\nЗадание 3");
        int population = 12_000_000;
        int coefficient = 1_000;
        int fertility = 17;
        int mortality = 8;
        int difference = fertility - mortality;
        int years = 10;
        for (int year = 1; year <= years; year++) {
            population = population + population * difference / coefficient;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }
//Задание 4
    public static void task4() {
        System.out.println("\nЗадание 4");
        int wanted = 12_000_000;
        int total = 15_000;
        int month = 1;
        double percent = 7 / 100D;
        while (total < wanted) {
            total = total + (int) (total * percent);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }
    }
//Задание 5
    public static void task5() {
        System.out.println("\nЗадание 5");
        int wanted = 12_000_000;
        int total = 15_000;
        int month = 1;
        double percent = 7 / 100D;
        while (total < wanted) {
            total = total + (int) (total * percent);
            if (month % 6 == 0) {
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
            month++;
        }
    }
//Задание 6
    public static void task6() {
        System.out.println("\nЗадание 6");
        int months = 9 * 12;
        int total = 15_000;
        double percent = 7 / 100D;
        for (int month = 1; month <= months; month++) {
            total = total + (int) (total * percent);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }
//Задание 7
    public static void task7() {
        System.out.println("\nЗадание 7");
        int firstFriday = 6;
        for (int friday = firstFriday; friday <= 31; friday += 7) {
            System.out.println("Сегодня паятница, " + friday + "-е число. Необходимо подготовить отчёт");
        }
    }
//Задание 8
    public static void task8() {
        System.out.println("\nЗадание 8");
        int currentYear = 2023;
        int start = currentYear - 200;
        int end = currentYear + 100;
        int period = 79;
        int firstTimeAppeared = 0;
        for (int year = firstTimeAppeared; year <= end; year += period) {
            if (year >= start) {
                System.out.println(year);
            }
        }
    }
}