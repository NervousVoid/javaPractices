package Strings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp = s.nextLine();
        ProcessStrings str = new ProcessStrings(inp);
        System.out.println(str.getLength());
        System.out.println(str.oddCharacters());
        System.out.println(str.invert());
    }
}