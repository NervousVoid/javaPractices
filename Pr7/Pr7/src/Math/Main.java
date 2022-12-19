package Math;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MathFunc math = new MathFunc();
        System.out.print("Circle radius: ");
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();
        System.out.println("Circle area: " + math.PI * r * r + '\n');

        System.out.print("a and b of a complex number: ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        System.out.println("Module: " + math.complexModule(a, b) + '\n');

        System.out.print("Number and its power: ");
        a = s.nextDouble();
        b = s.nextDouble();
        System.out.println(math.power(a, b));
    }
}