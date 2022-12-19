package task3;

import java.util.Calendar;

public class Student {
    private String name;
    private int idNumber;
    private double gpa;
    private int birthYear;
    private int birthMonth;
    private int birthDay;

    public void setBirthDate(int y, int m, int d){
        birthDay = d;
        birthMonth = m;
        birthYear = y;
    }



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

    public String toString(int dateformat) {
        String month = null;
        switch (this.birthMonth) {
            case 1: month = "January"; break;
            case 2: month = "February"; break;
            case 3: month = "March"; break;
            case 4: month = "April"; break;
            case 5: month = "May"; break;
            case 6: month = "June"; break;
            case 7: month = "July"; break;
            case 8: month = "August"; break;
            case 9: month = "September"; break;
            case 10: month = "October"; break;
            case 11: month = "November"; break;
            case 12: month = "December"; break;
        }

        if (dateformat == 0)
            return String.format("Student: %s\n Born: %s/%s/%s", this.name, this.birthDay, this.birthMonth, this.birthYear);
        else if (dateformat == 1) {
            month = month.substring(0, 3);
            String date = month + " " + this.birthDay + ", " + this.birthYear;
            return String.format("Student: %s\n Born: %s", this.name, date);
        }

        else if (dateformat == 2) {
            String date = "Tuesday, " + month + " " + this.birthDay + ", " + this.birthYear;
            return String.format("Student: %s\n Born: %s", this.name, date);
        }
        else
            return "";
    }
}