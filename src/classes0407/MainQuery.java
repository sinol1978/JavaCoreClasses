package classes0407;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainQuery {
    public static void main(String[] args) {
        User user = new User("name", "pass");
        user.createQuery();

        User.Query query = user.new Query();
        query.printToLog();

        User.Query query1 = new User("login1","pass1").new Query();
        query.printToLog();

        System.out.println(Arrays.toString(User.class.getClasses()));
        System.out.println(Arrays.toString(User.class.getDeclaredMethods()));
    }
}
