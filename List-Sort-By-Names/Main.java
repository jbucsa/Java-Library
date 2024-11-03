// This code can be used to sort of a list based on the names within the list.

// Main.java
import java.util.*;
import NameComparator;
import User; 

public class Main {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of user details");
        Integer n=Integer.valueOf(sc.nextLine());
        ArrayList<User> al=new ArrayList<User>(n);
        for (int i=0; i<n; i++){
            System.out.printf("Enter the user %d details\n", i+1);
            String[] in=sc.nextLine().split(",");
            al.add(new User(in[0], in[1], in[2], in[3]));
        }
        System.out.println("Sort by Name");
        Collections.sort(al, new NameComparator());

        System.out.println("Name Email Username Password");
            for (User u : al) System.out.println(u);
    }
}
