package classes0324.lesson10integer;

public class DoubleConstructorConsoleTest {
    public static void main(String[] args) {
        Double double1 = (double) 4f;
        Double double2 = new Double("2.34");
        System.out.println(double1 + "  " + double2);

        Short short1 = (short) 4;
        Short short2 = new Short("5");
        System.out.println(short1 + "  " + short2);

        Double double3 = Double.valueOf(23.5);
        Double double4 = Double.valueOf("54.6");
        System.out.println(double3 + "   " + double4);

        Double double5 = Double.parseDouble("7756756745.99");
        System.out.println(double5);

        System.out.println(double5.byteValue());
        System.out.println(double5.floatValue());
        System.out.println(double5.intValue());
        System.out.println(double5.longValue());
        System.out.println(double5.shortValue());
    }
}
