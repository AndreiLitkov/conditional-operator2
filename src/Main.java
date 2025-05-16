//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Версии приложения на ваше устройство не найдено");
        }

        System.out.println("Задача 2");

        int clientOSNew = 1;
        int clientDeviceYear = 2014;
        if (clientOSNew==0){
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }else if(clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if(clientOSNew==1){
            System.out.println("Установите версию приложения для Android по ссылке.");
        }else if(clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("Задача 3");
        int year = 1800;
        if ((year%4==0 && year%100!=0) || (year%400==0)) {
            System.out.println(year+ " год високосный");
        }else if(year<1584){
            System.out.println(year+ " год. В этом году еще не было выбрано такое правило про определения вискокосного года.");
        }else{
            System.out.println(year+ " год не високосный");
        }

        System.out.println("Задача 4");
        char deliveryDistance = 95;
            if (deliveryDistance<20){
                System.out.println("Потребуется 1 день для доставки");
            }else if (deliveryDistance>=20 && deliveryDistance<=60){
                System.out.println("Потребуется 2 дня для доставки");
            }else if(deliveryDistance>60 && deliveryDistance<=100){
                System.out.println("Потребуется 3 дня для доставки");
            }else{
                System.out.println("Доставки нет");
            }
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц принадлежит сезону Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц принадлежит сезону Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц принадлежит сезону Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит сезону Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}