package classes0317.lesson08.studentAspirant;

public class DemoConsoleTest {
    public static void main(String[] args) {
        Student student = new Student("John", "Smith", 11.5, "JV19-01");
        Aspirant aspirant = new Aspirant("Kevin", "Green", 10.3, "JC19-02", "Recursion");

        student.printStudent();
        aspirant.printAspirant();

        Student studentA = new Aspirant("Jason", "Wilson", 8.4, "HT19-04", "Functions");
        ((Aspirant) studentA).printAspirant();
        System.out.println(studentA.getFirstName() + "\t" + studentA.getLastName() + "\n" + studentA.getAverageMark() + "\t" + studentA.getGroup());


    }
}
