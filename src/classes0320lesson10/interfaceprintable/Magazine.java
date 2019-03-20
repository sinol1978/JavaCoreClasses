package classes0320lesson10.interfaceprintable;

/**
 * Created by UITS-Admin on 20.03.2019.
 */
public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public Magazine() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Printing magazine " + getName());
    }

    public static void printOnlyMagazines(Printable[] printables){
        for(Printable item : printables){
            if(item instanceof Magazine){
                System.out.println(((Magazine) item).getName());
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Magazine magazine = (Magazine) o;

        return name.equals(magazine.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }
}
