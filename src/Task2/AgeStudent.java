package Task2;

public class AgeStudent {
    private long years;
    private long month;
    private long days;
    private long hours;
    private long minutes;

    public AgeStudent(long years, long month, long days, long hours, long minutes) {
        this.years = years;
        this.month = month;
        this.days = days;
        this.hours = hours;
        this.minutes = minutes;
    }

    public String toString() {
        return "{" +
                years + " years, " +
                month + " month, " +
                +days + " days, "
                + hours + " hours, "
                + minutes + " minutes" +
                '}';
    }
}
