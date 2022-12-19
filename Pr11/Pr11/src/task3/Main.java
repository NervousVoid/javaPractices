package task3;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Bebra", 228, 11.9);
        s.setBirthDate(1998, 11, 21);
        System.out.println(s.toString(0));
        System.out.println(s.toString(1));
        System.out.println(s.toString(2));
    }
}