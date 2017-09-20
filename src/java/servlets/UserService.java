
package servlets;


public class UserService {
    Boolean login(String username, String password) {
        return username.equals("adam") && password.equals("password");
    }
}
