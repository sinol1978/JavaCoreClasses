package classes0424;

/**
 * Created by UITS-Admin on 24.04.2019.
 */
public class WrongLoginException extends Exception {
    public WrongLoginException(){
    }
    public WrongLoginException(String msg){
        super(msg);
    }
}
