package lesson35.demo;

import lesson35.user.User;
import lesson35.user.UserController;
import lesson35.user.UserService;
import lesson35.user.UserType;

/**
 * Created by Valik on 05.11.2018.
 */
public class DemoUser {
    public static void main(String[] args) throws Exception {
        User user = new User("hgjfds", "1235", "Kiev", UserType.USER);
        UserController userController = new UserController();
        //System.out.println(userController.registerUser(user));
        userController.logIn("Masha", "53421");
        System.out.println(UserService.userLog);
    }
}
