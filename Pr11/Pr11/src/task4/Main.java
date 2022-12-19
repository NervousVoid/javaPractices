package task4;

import task3.Student;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        Date data = new Date(year-1900,month-1,day,hour,minute);
        calendar.set(year, month, day, hour, minute);
        System.out.println(data);
        System.out.println(String.format("%s %s %s %s %s\n", calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE)));
    }
}
