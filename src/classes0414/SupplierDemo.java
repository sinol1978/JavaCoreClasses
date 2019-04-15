package classes0414;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> spl = ()->(int)(Math.random()*10);
        System.out.println(spl.get());
        System.out.println(spl.get());
        System.out.println(spl.get());

        Supplier<String> string = String::new;
        string.get();
    }
}
