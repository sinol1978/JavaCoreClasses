package classes0407;

import java.awt.*;
import java.util.Objects;

/**
 * Created by UITS-Admin on 10.04.2019.
 */

public class UserStatic {
    private static String login;
    private static String password;

    public static class Query {
        public void printToLog() {
            System.out.println(String.format("UserStatic %S (%s) sent request%n", getLogin(), getPassword()));
        }
    }

    public UserStatic() {
    }

    public static void createQuery() {
        UserStatic.Query query = new UserStatic.Query();
        query.printToLog();
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        UserStatic.login = login;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        UserStatic.password = password;
    }

    @Override
    public String toString() {
        return "UserStatic{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
