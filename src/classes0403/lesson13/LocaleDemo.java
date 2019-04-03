package classes0403.lesson13;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        printResourceInfo(new Locale("", ""));
        printResourceInfo(new Locale("ru", "RU"));
        printResourceInfo(new Locale("uk", "UA"));

    }

    private static void printResourceInfo(Locale locale) throws UnsupportedEncodingException {
        ResourceBundle rb = ResourceBundle.getBundle("topic", locale);
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(value);
        }
        System.out.println();
    }
}
