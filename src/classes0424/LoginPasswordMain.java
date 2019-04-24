package classes0424;

/**
 * Created by UITS-Admin on 24.04.2019.
 */
public class LoginPasswordMain {
    public static void main(String[] args) {

        System.out.println(verify("login1", "pass1", "pass1"));
        System.out.println(verify("loginnnnnnnnnnnnnnnnnnn1", "pass111111111111111111111", "pass11111111111111111111111111"));
        System.out.println(verify("login1", "pass1", "pass12"));

    }

    private static boolean verify(String login, String password, String confirmPassword){
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Login length is more than 20 chars");
            }
            if (password.length() > 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password error");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        finally {
            System.out.println("--------------------------------------------");
            System.out.printf("Login: %s\nPassword: %s\nConfirmPassword: %s\n", login, password, confirmPassword);
            System.out.println("--------------------------------------------");
        }
        return true;
    }
}
