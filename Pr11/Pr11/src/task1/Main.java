package task1;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        int year = 2022;
        int month = 9;
        int day = 15;
        int hour = 17;
        int minute = 5;
        int second = 20;
        System.out.printf("Фамилия: Андросов\nГод: %s\nМесяц: %s\nДень: %s\nЧас: %s\nМинут: %s\nСекунд: %s\n-----------\n", year, month, day, hour, minute, second);
        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH) + 1;
        day = calendar.get(Calendar.DAY_OF_MONTH);
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);
        second = calendar.get(Calendar.SECOND);
        System.out.printf("Фамилия: Андросов\nГод: %s\nМесяц: %s\nДень: %s\nЧас: %s\nМинут: %s\nСекунд: %s\n-----------\n", year, month, day, hour, minute, second);
    }
}