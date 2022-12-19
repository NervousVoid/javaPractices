import java.text.DecimalFormat;
import java.util.Random;

public class StudentListCreator implements Comparator {
    public Student[] students;
    public int[] idNumbers;
    private final DecimalFormat df = new DecimalFormat("0.00");
    public int size;

    public StudentListCreator(int n) {
        size = n;
        students = new Student[n];
        idNumbers = new int[n];
        for (int i = 0; i < size; i++) {
            Random r = new Random();
            int id = (int) (r.nextInt(99999 - 10000) + 10000);
            double gpa = (r.nextDouble(10 - 1) + 1);
            String name = " ";
            for (int j = 0; j < 7; j++) {
                name += (char) (r.nextInt('z' - 'a') + 'a');
            }
            students[i] = new Student(name, id, gpa);
            idNumbers[i] = id;
        }
    }

    public void printIds() {
        for (int i = 0; i < size; i++) {
            System.out.print(df.format(idNumbers[i]) + " ");
        }
        System.out.println();
    }

    public void printGPAs() {
        for (int i = 0; i < size; i++) {
            System.out.print(df.format(students[i].getGpa()) + " ");
        }
        System.out.println();
    }

    public void printNames() {
        for (int i = 0; i < size; i++) {
            System.out.print(students[i].getName() + " ");
        }
        System.out.println();
    }

    public void quicksortGpa() {
        sortGpa(0, students.length - 1);
    }

    private double compare(double x, double y) {
        return x - y;
    }

    private void sortGpa(int leftBorder, int rightBorder) {
        if (idNumbers.length == 0) {
            return;
        }
        if (leftBorder >= rightBorder) {
            return;
        }
        int middle = leftBorder + (rightBorder - leftBorder) / 2;
        Student student = students[middle];
        int i = leftBorder, j = rightBorder;
        while (i <= j) {
            while (compare(students[i].getGpa(), student.getGpa()) > 0) {
                i++;
            }
            while (compare(students[j].getGpa(), student.getGpa()) < 0) {
                j--;
            }
            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
            if (leftBorder < j) {
                sortGpa(leftBorder, j);
            }
            if (rightBorder > i) {
                sortGpa(i, rightBorder);
            }
        }
    }
}