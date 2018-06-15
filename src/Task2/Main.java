package Task2;

import Task2.ListStudent;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        ListStudent listStudent = new ListStudent(2);
        listStudent.addStudent();
        listStudent.calculationAverageAge();
    }
}
