package classes0331.lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Изменить регулярное выражение в предыдущем примере для нахождения строк cab, ccab, cccab.
 */
public class RegexDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("c+ab");
        Matcher matcher = pattern.matcher("ccab");
        boolean b = matcher.matches();
        System.out.println(b);

        System.out.println(test("google.com"));
        System.out.println(test("reference1.ua"));
        System.out.println(test("reference1.org"));

        String regex = "(\\w{6,})@(\\w+\\.)([a-z]{2,4})";
        String s = "адреса эл.почты:ivanov@gmail.com, sidorov@bsu.by!";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println("e-mail: " + matcher.group());
        }

        s = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12";
        regex = "Java\\s+\\d{1,2}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println("e-mail: " + matcher.group());
        }
    }
    public static boolean test(String testString) {
        Pattern pattern = Pattern.compile(".+\\.(com|ua|org)");
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }
}
