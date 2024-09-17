public class Main {
    public static void main(String[] args){
        //Задание №1.
        int clientOS = 1;
        System.out.println("Задание №1");
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Мы не знаем что это за операционная система");
        }

        //Задание №2.
        int yearOfRelease = 2016;
        System.out.println("Задание №2");
        if (clientOS == 1) {
            if (yearOfRelease > 2015)
                System.out.println("Установите версию приложения для Android по ссылке");
            else System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            if (yearOfRelease > 2015)
                System.out.println("Установите версию приложения для Ios по ссылке");
            else System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Мы не знаем что это за операционная система");
        }

        //Задание №3.
        int year = 2024;
        System.out.println("Задание №3");
        if (year > 1584) {
            if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
                System.out.println(year + " год является високостным");
            } else System.out.println(year + " год не является високостным");
        } else System.out.println("Год не может быть меньше 1584");

        //Задание №4.
        int deliveryDistance = 15;
        System.out.println("Задание №4");
        if (deliveryDistance >= 0 && deliveryDistance < 20){
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60){
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        }else System.out.println("Доставки нет(");

        //Задание №5.
        int month = 6;
        System.out.println("Задание №5");
        switch (month) {
            case 1, 2, 12 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
        }

    }
}
