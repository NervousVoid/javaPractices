import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main{
    public static void main(String[] args) {
        int k;
        System.out.print("Max key in triangle sequence: ");
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        k = s.nextInt();
        for (int i = 1; i <= k; i++){
            for (int j = 0; j < i; j++){
                arr.add(i);
            }
        }

        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        int prev = 0;
        for (int i = 0; i < arr.size(); i++){
            if (prev != arr.get(i)) {
                System.out.print(arr.get(i) + " ");
                prev = arr.get(i);
            }
        }
        System.out.println();
        System.out.print("N: ");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.print("A: ");
        int a = s.nextInt();
        System.out.print("B: ");
        int b = s.nextInt();

        int ma = max(a, b);
        int mi = min(a, b);
        while (ma >= mi) {
            System.out.print(ma + " ");
            ma--;
        }
        System.out.println();
    }
}