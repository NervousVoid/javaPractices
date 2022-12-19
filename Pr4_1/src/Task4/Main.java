package Task4;

public class Main {
    public static void main(String[] args) {
        Matrix m = new Matrix(100, 100);

        m.multiplyMatrix(2);

        Matrix m2 = new Matrix(100, 100);
        m.sumMatrix(m2);
    }
}