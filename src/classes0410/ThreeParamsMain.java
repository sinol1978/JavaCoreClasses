package classes0410;

/**
 * Created by UITS-Admin on 10.04.2019.
 */
public class ThreeParamsMain {
    public static void main(String[] args) {
//        ThreeParamsClass<Integer, Double, String> thpc = new ThreeParamsClass<>(1, 2.1, "String");
//        thpc.printParamsNames();
        ThreeParamsClass thcp2 = new ThreeParamsClass<String, Dog, Integer>("string", new Dog(), 1);
        thcp2.printParamsNames();


    }

}
