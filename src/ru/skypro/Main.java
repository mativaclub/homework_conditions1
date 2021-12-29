package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // homework 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if(clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");


        // homework 2
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if(clientOS == 1 && clientDeviceYear >= 2015)
                System.out.println("Установите версию приложения для Android по ссылке");

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if(clientOS == 1 && clientDeviceYear < 2015)
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");


        // homework 3
        int year = 2021;
        if ((year % 4 == 0) && (year % 100 !=0) || (year % 400 == 0)) {
            System.out.println("Год является високосным");
        }  else {
            System.out.println("Год не является високосным");
        }


        // homework 4
        int deliveryDistance = 95;
        int deliveryDay = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + deliveryDay);
        } else if(deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + ++deliveryDay);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется дней " + (++deliveryDay + 1));
            }


        // homework 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("There is no such month");
                }
        }
    }


