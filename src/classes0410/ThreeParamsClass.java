package classes0410;

import java.io.Serializable;

/**
 * Created by UITS-Admin on 10.04.2019.
 */
public class ThreeParamsClass<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T paramT;
    private V paramV;
    private K paramK;

    public ThreeParamsClass(T paramT, V paramV, K paramK) {
        this.paramT = paramT;
        this.paramV = paramV;
        this.paramK = paramK;
    }

    public void printParamsNames(){
        System.out.println("Type T is " + paramT.getClass().getName());
        System.out.println("Type V is " + paramV.getClass().getName());
        System.out.println("Type K is " + paramK.getClass().getName());
    }

    public T getParamT() {
        return paramT;
    }

    public void setParamT(T paramT) {
        this.paramT = paramT;
    }

    public V getParamV() {
        return paramV;
    }

    public void setParamV(V paramV) {
        this.paramV = paramV;
    }

    public K getParamK() {
        return paramK;
    }

    public void setParamK(K paramK) {
        this.paramK = paramK;
    }
}
