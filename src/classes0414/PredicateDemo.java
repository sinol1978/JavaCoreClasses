package classes0414;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s != null;
        System.out.println(predicate.test(null));
        System.out.println(predicate.test("1"));

        Predicate<String> predicate2 = s -> !s.isEmpty();
        System.out.println(predicate2.test(""));
        System.out.println(predicate2.test(" "));
        System.out.println("---------------------");
        Predicate<String> predicate3 = predicate.and(predicate2);
        System.out.println(predicate3.test(null));
        System.out.println(predicate3.test(""));
        System.out.println(predicate3.test(" "));
        System.out.println("---------------------");

        Predicate<String> pr1 = s->s.startsWith("J");
        Predicate<String> pr2 = s->s.startsWith("N");
        Predicate<String> pr3 = s->s.endsWith("A");

        System.out.println(pr1.and(pr2).or(pr3).test("JavA"));
        System.out.println(pr1.and(pr2).or(pr3).test("java"));
    }
}
