public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    // TODO Now: Add a constructor to initialize the users list with the default user
    public static void main(String[] args){
        ArrayList<User> users_list = new ArrayList<User>();
    }

    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise
    public User signUp(User newUser) {
        if (users_list.contains(newUser)){
            return null;
        } else {
            users_list.add(newUser);
            return newUser;
        }
    }
    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise
    public User logIn(User user_person){

        if (user_list)
        return username;
    }
}
