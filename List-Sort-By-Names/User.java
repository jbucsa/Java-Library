// This code can be used to sort of a list based on the names within the list.

public class User{
    String name, email, username, password;

    // Appropriate constructors, getters and setters.

    public String toString(){
        return String.format("%-15s %-15s %-15s %s", name, email, username, password);
    }
}
