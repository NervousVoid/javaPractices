package Task4;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    private int w;
    private int h;
    private int[][] m = new int[100][100];

    public Matrix(int w, int h) {
        this.w = w;
        this.h = h;
        createMatrix();
    }

    public void createMatrix() {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                //m[i][j] = s.nextInt();
                Random rand = new Random();
                m[i][j] = rand.nextInt(9 + 1);
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void sumMatrix(Matrix matrix) {
        if (matrix.h == this.h && matrix.w == this.w) {
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    System.out.print(matrix.m[i][j] + this.m[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public void multiplyMatrix(int a) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(this.m[i][j] * a + " ");
            }
            System.out.println();
        }
    }
}
