public class Student {
    private String name;
    private int idNumber;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.idNumber = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int id) {
        this.idNumber = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setScore(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return "Student: " + this.name + "\nid: " + this.idNumber + "\nGPA: " + this.gpa + "\n";
    }
}