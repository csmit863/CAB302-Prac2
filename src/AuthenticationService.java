import java.util.ArrayList;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    // TODO Now: Add a constructor to initialize the users list with the default user
    public AuthenticationService() {
        this.users = new ArrayList<>();
        User defaultUser = new User("defaultUsername", "defaultPassword");
        this.users.add(defaultUser);
    }

    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise
    public User signUp(String username, String password) {
        // Check if the username is already taken
        for (User user : this.users) {
            if (user.getUsername().equals(username)) {
                return null; // Username is taken
            }
        }
        // Username is available, create and add the new user
        User newUser = new User(username, password);
        this.users.add(newUser);
        return newUser;
    }

    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise
    public User logIn(String username, String password) {
        for (User user : this.users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user; // Return the actual User object
            }
        }
        return null; // User not found or incorrect password
    }
}
