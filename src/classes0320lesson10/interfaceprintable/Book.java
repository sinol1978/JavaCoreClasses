package classes0320lesson10.interfaceprintable;

/**
 * Created by UITS-Admin on 20.03.2019.
 */
public class Book implements Printable{

    private String name;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Printing book " + getName());
    }

    public static void printOnlyBooks(Printable[] printables){
        for(Printable item : printables){
            if(item instanceof Book){
                System.out.println(((Book) item).getName());
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return name.equals(book.name);

    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
