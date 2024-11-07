import java.time.LocalDate;

public class Main {

    //Задача 1
    public static void checkingYearHighness(int year) {
        if ((year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Год високосный.\n");
        }
        else if (year % 100 == 0 && year % 400 == 0){
            System.out.println("Год високосный.\n");
        }
        else {
            System.out.println("Год невисокосный.\n");
        }
    }

    //Задача 2
    public static void choiceOS(int creationDeviceYear, int clientOS) {
        int clientDeviceYear = 2015;
        if (clientOS == 0 && creationDeviceYear < clientDeviceYear) {
            System.out.println("Установите облегченную версию " +
                    "приложения для IOS по ссылке.\n");
        } else if (clientOS == 0) {
            System.out.println("Установите версию " +
                    "приложения для IOS по ссылке.\n");
        } else if (clientOS == 1 && creationDeviceYear < clientDeviceYear) {

            System.out.println("Установите облегченную версию приложения для Android " +
                    "по ссылке.\n");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android " +
                    "по ссылке.\n");
        } else {
            System.out.println("Ошибка ввода.\n");
        }
    }


    //Задача 3
    public static double calculateNumberDaysDelivery(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 1.5;
        } else if (deliveryDistance <= 100) {
            return 2;
        } else {
            System.out.print("Доставка не доступна.\n");
            return -1;
        }
    }


    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1:");
        checkingYearHighness(2023);

        //Задача 2
        System.out.println("Задача 2:");
        int creationDeviceYear = LocalDate.now().getYear();
        int clientOS = 0;
        choiceOS(creationDeviceYear, clientOS);

        //Задача 3
        System.out.println("Задача 3:");
        int deliveryDistance = 1 + (int) (Math.random() * 150);
        System.out.println(deliveryDistance);
        System.out.println(calculateNumberDaysDelivery(deliveryDistance));
    }


}