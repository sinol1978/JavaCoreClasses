package classes0424;

/**
 * Created by UITS-Admin on 24.04.2019.
 */
public class WrongPasswordException extends Exception {
    public WrongPasswordException(){

    }
    public WrongPasswordException(String msg){
        super(msg);
    }
}
