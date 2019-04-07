package classes0407;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2019, 04,06);
        LocalDate date2 = LocalDate.now();
        System.out.println(date1.equals(date2));
        System.out.println(date1.isBefore(date2));
        System.out.println(date1.isLeapYear());
    }
}
