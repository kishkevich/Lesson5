package Task2;

import Task2.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class ListStudent implements AddStudent, AverageAge {
    private IDate[] listStudent;


    public ListStudent(int size) {
        this.listStudent = new IDate[size];
    }

    @Override
    public void addStudent() throws ParseException {
        for (int i = 0; i < listStudent.length; i++) {
            System.out.println("Введите имя");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Введите фамилию");
            String surname = scanner.nextLine();
            System.out.println("Введите дату рождения");
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            String date = scanner.nextLine();
            Date dateOfBirth = format.parse(date);
            listStudent[i] = new Student(name, surname, dateOfBirth);


        }

    }

    @Override
    public void calculationAverageAge() {
        Date now = new Date();
        long sum = 0;
        for (int i = 0; i < listStudent.length; i++) {
            sum += (listStudent[i].getDate()).getTime();
        }
        Date averageAge = new Date(sum / listStudent.length);
        LocalDateTime averageLocalDate = convertToLocalDateTime(averageAge);
        AgeStudent calculationAverageAge = getAge(averageLocalDate);
        System.out.println("Средний возраст " + calculationAverageAge.toString());

    }

    private AgeStudent getAge(LocalDateTime dateOfBirth) {
        LocalDateTime now = LocalDateTime.now();
        long years = ChronoUnit.YEARS.between(dateOfBirth, now);
        now = now.minusYears(years);
        long month = ChronoUnit.MONTHS.between(dateOfBirth, now);
        now = now.minusMonths(month);
        long days = ChronoUnit.DAYS.between(dateOfBirth, now);
        now = now.minusDays(days);
        long hours = ChronoUnit.HOURS.between(dateOfBirth, now);
        now = now.minusHours(hours);
        long minutes = ChronoUnit.MINUTES.between(dateOfBirth, now);
        return new AgeStudent(years, month, days, hours, minutes);

    }

    private LocalDateTime convertToLocalDateTime(Date convertData) {
        return convertData.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }
}
