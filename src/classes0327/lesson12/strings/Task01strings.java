package classes0327.lesson12.strings;

/**
 * Created by Oleg Sinelnikov 27.03.2019.
 */
public class Task01strings {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        System.out.println(isStringEndsWith(str, "!!!"));
        System.out.println(isStringStartsWith(str, "I like"));
        System.out.println(isStringContains(str, "Java"));

        checkString(str);

        System.out.println(getLastChar(str));

        System.out.println(str.indexOf("Java"));

        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println(str.substring(str.indexOf("Java"), 11));

        System.out.println(getResultSB(3, 56));
    }

    private static boolean isStringEndsWith(String str1, String str2) {
        return str1.endsWith(str2);
    }

    private static boolean isStringStartsWith(String str1, String str2) {
        return str1.startsWith(str2);
    }

    private static boolean isStringContains(String str1, String str2) {
        return str1.contains(str2);
    }

    private static void checkString(String str) {
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
    }

    private static char getLastChar(String str) {
        char c = str.charAt(str.length() - 1);
        return c;
    }

    private static StringBuilder getResultSB(int a, int b) {
        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" = ").append(a + b)
                .append("\n");
        result.append(a).append(" - ").append(b).append(" = ").append(a - b)
                .append("\n");
        result.append(a).append(" * ").append(b).append(" = ").append(a * b)
                .append("\n");
        result.append(a).append(" / ").append(b).append(" = ").append((double) a / b)
                .append("\n");
        return result;
    }
}
