package classes0414;

public class HeavyBox {
    public int weight;

    public HeavyBox() {
    }

    public HeavyBox(int weight) {

        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

//    @Override
//    public int compareTo(HeavyBox o) {
//        return this.weight - o.weight;
//    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }
}
