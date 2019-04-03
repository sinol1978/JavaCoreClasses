package classes0403.lesson13;

import java.io.UnsupportedEncodingException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        printResourceInfo(Locale.ROOT);
        printResourceInfo(new Locale("ru", "RU"));
        printResourceInfo(new Locale("uk", "UA"));
        double number = 123.4567;
        Locale locFR = new Locale("fr");
        NumberFormat numberFormat1 = NumberFormat.getInstance();
        System.out.println("Число в текущей локали: " + numberFormat1.format(number));

        NumberFormat numberFormat2 = NumberFormat.getInstance(locFR);
        System.out.println("Число во французской локали: " + numberFormat2.format(number));

        NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance();
        System.out.println("Денежная единица в текущей локали: " + numberFormat3.format(number));

        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(locFR);
        System.out.println("Денежная единица во французской локали: " + numberFormat4.format(number));

        NumberFormat numberFormat5 = NumberFormat.getPercentInstance();
        System.out.println("Процент в текущей локали: " + numberFormat5.format(number));

        NumberFormat numberFormat6 = NumberFormat.getPercentInstance(locFR);
        System.out.println("Процент во французской локали: " + numberFormat6.format(number));

        System.out.println(Locale.getDefault());
        double d = 123.45678;
        NumberFormat nf = NumberFormat.getInstance();

        System.out.print("Максимальное количество знаков в дробной части "
                + nf.getMaximumFractionDigits() + ": ");
        System.out.println(nf.format(d));

        nf.setMaximumFractionDigits(7);
        System.out.print("Максимальное количество знаков в дробной части 7: ");
        System.out.println(nf.format(d));

        nf.setMaximumIntegerDigits(2);
        System.out.print("Максимальное количество знаков в целой части 2: ");
        System.out.println(nf.format(d));

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
