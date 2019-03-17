package classes0317.lesson08.studentAspirant;

public class Aspirant extends Student {
    private String scienceName;

    public Aspirant() {
    }

    public Aspirant(String firstName, String lastName, double averageMark, String group, String scienceName) {
        super(firstName, lastName, averageMark, group);
        this.scienceName = scienceName;
    }

    public String getScienceName() {
        return scienceName;
    }

    public void setScienseName(String scienceName) {
        this.scienceName = scienceName;
    }

    public void printAspirant(){
        System.out.println(this.getFirstName() + " " + this.getLastName());
        System.out.println(this.getGroup() + " " + this.getAverageMark());
        System.out.println(this.getScienceName());
    }

    public int getScholarShip() {
        return getAverageMark() >= 5 ? 200 : 180;
    }
}
