package classes0414;

import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, String> function1 = d -> d == 0 ? "Is Null" : (d < 0 ? "Negative number" : "Positive number");
        System.out.println(function1.apply(-1));
        System.out.println(function1.apply(0));
        System.out.println(function1.apply(1));

//        Перепишите используя method references:
//        IntFunction<String> function = i -> String.valueOf(i); System.out.println(function.apply(450));

        IntFunction<String> function = String::valueOf;
        System.out.println(function.apply(450));
    }
}
