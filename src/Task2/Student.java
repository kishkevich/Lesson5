package Task2;

import Task2.IDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements IDate {

    private String name;
    private String surname;
    private Date dataOfBirth;


    public Student(String name, String surname, Date dataOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dataOfBirth = dataOfBirth;
    }




    @Override
    public String toString() {
        String date = new SimpleDateFormat("dd-MM-yyyy").format(getDate());
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + date +
                '}';
    }

    @Override
    public Date getDate() {
        return dataOfBirth;
    }




    /*public Date getDate() {
        return dataOfBirth;
    }*/
}
