package classes0403.lesson13;


import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate bDay = LocalDate.of(1978,11,9);
        System.out.println(bDay.getDayOfWeek());
        System.out.println(bDay.getDayOfMonth());
        System.out.println(bDay.isLeapYear());
        System.out.println(bDay.getChronology());
        System.out.println(bDay.getDayOfYear());
        System.out.println(bDay.getMonth());

        LocalTime time = LocalTime.now();
        System.out.println(time.getMinute());
    }
}
