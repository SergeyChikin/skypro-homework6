public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();

    }
    public static void task1 () {
        System.out.println("Задача 1");
        byte clientOS;
        clientOS = 1;
        if ( clientOS == 0 ) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if ( clientOS == 1 ) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        byte clientOS;
        clientOS = 1;
        int clientDeviceYear;
        clientDeviceYear = 2014;
        if ( clientOS == 0 && clientDeviceYear >= 2015 && clientDeviceYear <= 2022 ) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if ( clientOS == 0 && clientDeviceYear < 2015 && clientDeviceYear >= 2011 ) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (  clientOS == 1 && clientDeviceYear >= 2015 && clientDeviceYear <= 2022 ) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if ( clientOS == 1 && clientDeviceYear < 2015 && clientDeviceYear >= 2011 ){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Введите корректные данные.");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year;
        year = 2021;
        if ( ( year % 100 != 0 ) && ( year % 4 == 0 ) || year % 400 == 0 ) {
            System.out.println( year + " год является високосным.");
        } else {
            System.out.println( year + " год не является високосным.");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryTime = 0;
        if (deliveryDistance >= 0 && deliveryDistance < 20) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней : " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = deliveryTime + 2;
            System.out.println("Потребуется дней : " + deliveryTime);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryTime = deliveryTime + 3;
            System.out.println("Потребуется дней : " + deliveryTime);
        } else {
            System.out.println("Доставки нет ");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch ( monthNumber ) {
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Введите корректно номер месяца");
        }

    }

}