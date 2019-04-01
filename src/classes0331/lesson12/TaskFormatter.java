package classes0331.lesson12;

import java.util.Formatter;

/**
 *Создать строку, используя форматирование:
 *Студент [Фамилия] получил [оценка] по [предмету].
 *Форматирование и вывод строки на консоль написать в отдельном методе, который принимает фамилию, оценку и название предмета в качестве параметров.

 */
public class TaskFormatter {

    public static void main(String[] args) {
        printFormattedString("John Smith", 11, "Java");
        printFormattedString("Michael Green", 10, "C#");
    }

    private static void printFormattedString(String name, int mark, String subject){
        Formatter formatter = new Formatter();
//        formatter.format("Student %15s has got %3s on %10s", name, mark, subject);
//        System.out.println(formatter);
        System.out.printf("Student %15s has got %3s on %10s.%n", name, mark, subject);
    }
}
