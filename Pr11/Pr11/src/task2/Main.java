package task2;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        int year2 = scanner.nextInt();
        int year1 = calendar.get(Calendar.YEAR);

        int month2 = scanner.nextInt();
        int month1 = calendar.get(Calendar.MONTH) + 1;

        int day2 = scanner.nextInt();
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);

        int hour2 = scanner.nextInt();
        int hour1 = calendar.get(Calendar.HOUR_OF_DAY);

        int minute2 = scanner.nextInt();
        int minute1 = calendar.get(Calendar.MINUTE);

        if (year2 == year1) {
            System.out.println("Год совпадает");
        } else {
            System.out.println("Год не совпадает");
        }

        if (month2 == month1) {
            System.out.println("Месяц совпадает");
        } else {
            System.out.println("Месяц не совпадает");
        }

        if (day2 == day1) {
            System.out.println("День совпадает");
        } else {
            System.out.println("День не совпадает");
        }

        if (hour2 == hour1) {
            System.out.println("Часы совпадают");
        } else {
            System.out.println("Часы не совпадают");
        }

        if (minute2 == minute1) {
            System.out.println("Минуты совпадают");
        } else {
            System.out.println("Минуты не совпадают");
        }

    }
}