package classes0421;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Product> toys = new HashMap<>();
        Product toy1 = new Product("Car", 200, "Disney");
        Product toy2 = new Product("Plane", 400, "Marvel");
        Product toy3 = new Product("Ship", 600, "CartoonNetwork");
        toys.put(toy1.getName(), toy1);
        toys.put(toy2.getName(), toy2);
        toys.put(toy3.getName(), toy3);


        enumerateKeys(toys);
        System.out.println("---------------------------------------------");
        enumerateValues(toys);
        System.out.println("---------------------------------------------");
        enumeratePairs(toys);
    }

    private static void enumerateKeys(Map<String, Product> toys) {
        toys.keySet().forEach(k -> System.out.println("Key: " + k));
    }

    private static void enumerateValues(Map<String, Product> toys) {
        toys.values().forEach(v -> System.out.println("Values: " + v));
    }

    private static void enumeratePairs(Map<String, Product> toys) {
        //toys.entrySet().forEach(v -> System.out.println("Key: " + v.getKey() + "\tValues: " + v.getValue()));
        toys.forEach((k, v) -> System.out.println("Key: " + k + "\tValues: " + v));
    }
}
