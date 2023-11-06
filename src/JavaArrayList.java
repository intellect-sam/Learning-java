import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class JavaArrayList {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
    
        users.add(new User("alukoolakunlesamuel", "Samuel123#"));
        users.add(new User("badejo@gmail.com", "badejo123#"));
        users.add(new User("oyelekejoy@gmail.com", "joy#"));

        users.forEach(user -> {
            System.out.println("Username: " + user.getUsername()  + "\tpassword" + user.getPassword());
        });

        users.sort(Comparator.comparing(User::getUsername));
        System.out.println(users);

        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        result.add(5);
        result.add(8);
        result.add(10);
        result.add(4);
        result.add(2);

        Collections.sort(result);
        System.out.println(result);

    }
}