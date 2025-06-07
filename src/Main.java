import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Task 1=====");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println("-----Task 2=====");
        int clientDeviceYear = 2015;
        if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientDeviceYear <= 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("-----Task 3=====");
        int year = 2021;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
            }
            if (year % 400 == 0) {
            }
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("-----Task 4=====");
        int deliveryDistance = 95;
        int day = 20;
        int twoDay = 60;
        int threeDay = 100;
        int deliveryDays = 1;
        if (deliveryDistance > threeDay) {
            System.out.println("Доставки нет.");
        } else {
            if (deliveryDistance > day) {
                deliveryDays++;
            }
            if (deliveryDistance > twoDay) {
                deliveryDays++;
            }
            System.out.println("Потребуется дней: " + deliveryDays);
            System.out.println("-----Task 5=====");
            int monthNumber = 12;

            switch (monthNumber) {
                case 1:
                    System.out.println("Зима");
                    break;
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                    System.out.println("Весна");
                    break;
                case 4:
                    System.out.println("Весна");
                    break;
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                    System.out.println("Лето");
                    break;
                case 7:
                    System.out.println("Лето");
                    break;
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                    System.out.println("Осень");
                    break;
                case 10:
                    System.out.println("Осень");
                    break;
                case 11:
                    System.out.println("Осень");
                    break;
                case 12:
                    System.out.println("Зима");
                    break;
                default:
                    System.out.println("такого нету");
            }
        }
    }
}