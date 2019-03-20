package classes0320lesson10.interfaceprintable;

/**
 * Created by UITS-Admin on 20.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Cook Book");
        Book b2 = new Book("Pattern MVC");

        Magazine m1 = new Magazine("AutoMir");
        Magazine m2 = new Magazine("Sports Illustrated");
        Printable[] prints = {b1, b2, m1, m2};

        for(Printable item : prints){
            item.print();
        }

        Magazine.printOnlyMagazines(prints);
        Book.printOnlyBooks(prints);
    }
}
