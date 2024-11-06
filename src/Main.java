import java.time.LocalDate;

public class Main {

    //Задача 1
    public static void checkingYearHighness(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println("Год високосный.\n");
        } else {
            System.out.println("Год невисокосный.\n");
        }
    }

    //Задача 2
    public static void examinationOS(int currentYear, int clientOS) {
        int clientDeviceYear = 2015;
        if (clientOS == 0 && currentYear < clientDeviceYear) {
            System.out.println("Установите облегченную версию " +
                    "приложения для IOS по ссылке.\n");
        } else if (clientOS == 0) {
            System.out.println("Установите версию " +
                    "приложения для IOS по ссылке.\n");
        } else if (clientOS == 1 && currentYear < clientDeviceYear) {

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
    public static int calculateNumberDaysDelivery(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 24;
        } else if (deliveryDistance <= 60) {
            return 36;
        } else if (deliveryDistance <= 100) {
            return 48;
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
        int currentYear = LocalDate.now().getYear();
        int clientOS = 0;
        examinationOS(currentYear, clientOS);

        //Задача 3
        System.out.println("Задача 3:");
        int deliveryDistance = 1 + (int) (Math.random() * 150);
        System.out.println(deliveryDistance);
        System.out.println(calculateNumberDaysDelivery(deliveryDistance));
    }


}