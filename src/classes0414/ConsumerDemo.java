package classes0414;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<HeavyBox> cons1 = h -> System.out.println(String.format("Heavy box (weight: %s kg) was accepted", h.weight));
        //cons1.accept(new HeavyBox(5));

        Consumer<HeavyBox> cons2 = h -> System.out.println(String.format("Heavy box (weight: %s kg) is sending", h.weight));
        cons1.andThen(cons2).accept(new HeavyBox(5));
    }
}
