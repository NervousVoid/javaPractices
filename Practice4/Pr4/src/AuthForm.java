import java.util.Scanner;

public class AuthForm {
    private String username = "admin";
    private String password = "admin";

    public boolean logIn(){
        Scanner s = new Scanner(System.in);
        System.out.printf("Username: ");
        String u = s.nextLine();
        System.out.printf("Password: ");
        String p = s.nextLine();
        return isAuth(u, p);
    }

    private boolean isAuth(String u, String p) {
        return u == this.username && p == this.password;
    }
}
