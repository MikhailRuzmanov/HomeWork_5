import java.sql.SQLOutput;
import java.util.SortedMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }




    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 1;// Пишем код для задачи 1
        int iOS = 0;
        int android = 1;
        if (clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } if (clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 3;// Пишем код для задачи 2
        int clientDeviceYear = 2015;
        int iOS = 0;
        int android = 1;
        int changeYear = 2015;
        if (clientOS == iOS && clientDeviceYear > changeYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == iOS && clientDeviceYear <= changeYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }if (clientOS == android && clientDeviceYear > changeYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == android && clientDeviceYear <= changeYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Выберите операционную систему: 0 - это iOS, 1 - это Android");
        }
    }
    private static void task3() {
        System.out.println("Задача 3 (1 вариант решения)");
        int year = 2301;
        int fourthYear = 4;
        int hundredthYear = 100;
        int fourHundredthYear = 400;
        if (year%fourHundredthYear == 0 || year%fourthYear == 0 && year%hundredthYear != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Задача 3 (2 вариант решения)");
        int year_2 = 2021;
        int fourthYear_2 = 4;
        int hundredthYear_2 = 100;
        int fourHundredthYear_2 = 400;
        if (year_2%fourHundredthYear_2==0 && year_2%hundredthYear_2!=0) {
            System.out.println(year_2 + " год является високосным");
        }
        if (year_2%fourthYear_2==0 && year_2%hundredthYear_2!=0) {
            System.out.println(year_2 + " год является високосным");
        }
        if (year_2%hundredthYear_2==0) {
            System.out.println(year_2 + " год не является високосным");
        }


    }
    private static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance =35;
        int twentyKm = 20;
        int sixtyKm = 60;
        int oneHundredKm = 100;
        int days = 1;
        if (deliveryDistance <= twentyKm) {
            System.out.println("Потребуется дней: " + days);
        }
        if (deliveryDistance >twentyKm && deliveryDistance<=sixtyKm) {
            days=days+1;
            System.out.println("Потребуется дней: " + days);
        }
        if (deliveryDistance>sixtyKm && deliveryDistance<=oneHundredKm) {
            days=days+1+1;
            System.out.println("Потребуется дней: " + days);
        }
        if (deliveryDistance>oneHundredKm) {
            System.out.println("Потребуется дней: " + "нет доставки");
        }
        }
    private static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Месяц " + monthNumber + " это зима");
                break;
            case 2:
                System.out.println("Месяц " + monthNumber + " это зима");
                break;
            case 3:
                System.out.println("Месяц " + monthNumber + " это весна");
                break;
            case 4:
                System.out.println("Месяц " + monthNumber + " это весна");
                break;
            case 5:
                System.out.println("Месяц " + monthNumber + " это весна");
                break;
            case 6:
                System.out.println("Месяц " + monthNumber + " это лето");
                break;
            case 7:
                System.out.println("Месяц " + monthNumber + " это лето");
                break;
            case 8:
                System.out.println("Месяц " + monthNumber + " это лето");
                break;
            case 9:
                System.out.println("Месяц " + monthNumber + " это осень");
                break;
            case 10:
                System.out.println("Месяц " + monthNumber + " это осень");
                break;
            case 11:
                System.out.println("Месяц " + monthNumber + " это осень");
                break;
            case 12:
                System.out.println("Месяц " + monthNumber + " это зима");
                break;
            default:
                System.out.println("Такого месяца нет, программа не выполняется");
        }

    }
    }
