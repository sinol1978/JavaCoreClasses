package classes0317.lesson08.studentAspirant;

public class Student {

    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student() {
    }

    public Student(String firstName, String lastName, double averageMark, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageMark = averageMark;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void printStudent() {
        System.out.println("Name: " + this.getFirstName() + " " + this.lastName
                + "\tGroup: " + this.getGroup() + "\tMark " + this.getAverageMark() + "\t\tScholarship: " + getScholarShip() + "$");
    }

    public int getScholarShip() {
        return getAverageMark() >= 5 ? 180 : 100;
    }
}
